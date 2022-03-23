package com.example.ujikom_david;

public class konfigurasi {
    //Pemangilan Tambah KERIPIK
    public static final String URL_ADD =
            "http://192.168.1.53/keripik/datakeripik/tambahkeripik.php";

    //Tampil keripik
    public static final String URL_GET_ALL =
            "http://192.168.1.53/keripik/datakeripik/tampilkeripik.php";
    public static final String URL_GET_EMP =
            "http://192.168.1.53/keripik/datakeripik/detailkeripik.php?id_keripik=";
    //update databarang
    public static final String URL_UPDATE_EMP =
            "http://192.168.1.53/keripik/datakeripik/penjualankeripik.php=";
    //Hapus databarang
    public static final String URL_DELETE_EMP =
            "http://192.168.1.53/keripik/datakeripik/hapuskeripik.php?id_barang=";

    public static final String
            //Pemangilan Tambah KERIPIK
            URL_ADD_EMPJUALAN = "http://192.168.1.53/keripik/datakeripik/penjualankeripik.php";
    //Tampil Barang
    public static final String URL_GET_ALLJUALAN=
            "http://192.168.1.53/keripik/datakeripik/tampilkeripik.php";
    public static final String URL_GET_EMPJUALAN =
            "http://192.168.1.53/keripik/datakeripik/detailkeripik.php?id_keripik=";
    //update datasiswa
    public static final String URL_UPDATE_JUALAN =
            "http://192.168.1.53/keripik/datakeripik/penjualankeripik.php=";
    //Hapus Siswa
    public static final String URL_DELETE_JUALAN
            =
            "http://192.168.1.53/keripik/datakeripik/hapuskeripik.php?id_barang=";





    public static final String KEY_EMP_ID = "id_barang";
    public static final String KEY_EMP_NAMAJENIS = "jeniskeripik";
    public static final String KEY_EMP_RASA = "rasakeripik";
    public static final String KEY_EMP_HARGA = "harga";
    //JSON Tags

    public static final String TAG_JSON_ARRAY = "result";
    public static final String TAG_ID = "id_barang";
    public static final String TAG_NAMAJENIS = "jeniskeripik";
    public static final String TAG_RASA = "rasakeripik";
    public static final String TAG_HARGA = "harga";

    public static final String KEY_EMP_IDJUAL = "id_penjualan";
    public static final String KEY_EMP_IDBARANG = "id_barang";
    public static final String KEY_EMP_JUMLAHTERSEDIA = "jumlahtersedia";
    public static final String KEY_EMP_JUMLAHTERJUAL = "jumlahterjual";

    //JSON Tags

    public static final String TAG_JSON_ARRAYJUALAN = "result";
    public static final String TAG_IDJUAL = "id_penjualan";
    public static final String TAG_IDBARANG = "id_barang";
    public static final String TAG_JUMLAHTERSEDIA = "jumlahtersedia";
    public static final String TAG_JUMLAHTERJUAL = "jumlahterjual";
    public static final String TAG_STOKAKHIR = "stokakhir";


    //ID karyawan
    //emp merupakan singkatan dari Employee
    public static final String EMP_ID = "emp_idjual";
}
