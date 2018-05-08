package Model;

import Controller.IOFile;

/**
 * class : quản lí biến toàn cục
 * author Dinh Tran
 */
public class BienToanCuc {

    // khởi tạo dữ liệu cơ bản
    public static DuLieu duLieu1 = new DuLieu();

    public static void main(String[] args) {
        IOFile.inputChuDe(duLieu1);
        IOFile.inputTuVung(duLieu1);
    }
}
