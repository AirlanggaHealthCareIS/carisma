<?php

class Book extends Controller {

    function __construct() {
        parent::__construct();
        Session::init();
        if (Session::get('id') != NULL) {
            
        } else {
            $this->view->ini = "Anda perlu log in untuk booking antrian";
            $this->view->title = "Login";
            $this->view->render('login/index', 1, 0);
            die();
        }
        //$this->index();
    }

    function index() {
        $this->view->title = "Doctors";
        $this->view->render('doctor/book', 1, 0);
    }

    function Form($idDokter) {
        $this->view->title = "Doctors";
        $this->loadModel('Login');
        $temp = $this->model->getIdUser(Session::get('id'));
        $iduser = '';
        foreach ($temp as $key => $value) {
            $iduser = $value[0];
        }
        $this->loadModel('Dokter');
        $dok = $this->model->getDokter($idDokter);
        foreach ($dok as $key => $value) {
            $this->view->namaDokter = $value[3];
            $this->view->poli = $value[19];
        }
        $this->view->idUser = $iduser;
        $this->view->idDokter = $idDokter;
        $this->loadModel('Pasien');
        $pasien = $this->model->getPasien($iduser);
        foreach ($pasien as $key => $value) {
            $this->view->namaPasien = $value[0];
            $this->view->idPasien = $value[1];
        }
        $rak = '';
        $this->loadModel('Jadwaldokter');
        $day = $this->model->dayJadwal($idDokter);
        foreach ($day as $key => $value) {
            $date = $this->model->dateJadwal($value[0]);
            foreach ($date as $key => $values) {
                $rak = $rak . '<h2 style="color:whitesmoke"><input type="radio" name="av" value="' . $values[1] . '">  ' . $value[0] . '  ,  ' . $values[1] . '</h2><br>';
            }
        }
        $this->view->choose = $rak;
        $this->view->render('doctor/book', 1, 0);
    }

    function doBook() {
        $idDokter = $_POST['idDokter'];

        if (!isset($_POST['av'])) {
            echo '<script language="javascript">';
            echo 'alert("Anda belum memilih hari")';
            echo '</script>';
            Redirect::go('http://localhost/carisma.web/book/form/' . $idDokter);
        } else {
            $tgl = $_POST['av'];
            $this->loadModel('Login');
            $temp = $this->model->getIdUser(Session::get('id'));
            $iduser = '';
            foreach ($temp as $key => $value) {
                $iduser = $value[0];
            }
            $this->loadModel('antrian');
            $getCount = $this->model->getCountAntrian();
            $cek = $this->model->cekOnce($iduser, $idDokter, $tgl);
            if ($cek) {
                foreach ($getCount as $key => $value) {
                    $count = $value[0];
                }
                $count = $count + 1;
                if ($count < 10) {
                    $id = 'O00' . $count;
                } else if ($count >= 10) {
                    $id = 'O0' . $count;
                } else {
                    $id = 'O' . $count;
                }
                $temp = $this->model->getLastNomorAntrian();
                foreach ($temp as $key => $value) {
                    $noAntrian = $value[0];
                }
                $noAntrian = $noAntrian + 1;
                Redirect::notif($idDokter);
                //$this->model->insertAntrian($id, $iduser, $idDokter, $noAntrian, 'ONLINE', $tgl);
                
            } else {
                echo '<script language="javascript">';
                echo 'alert("Anda sudah antri pada hari tersebut")';
                echo '</script>';
                Redirect::go('http://localhost/carisma.web/book/form/' . $idDokter);
            }
        }
    }

}
