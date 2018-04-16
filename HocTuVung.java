package View;

import Controller.IOFile;
import Model.BienToanCuc;
import Model.ChuDe;
import Model.TuVung;
import java.awt.Image;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * class: đại diện cho chức năng học từ vựng
 */
public class HocTuVung extends javax.swing.JFrame {

    /**
     * Creates new form onTapTuVung
     */
    public HocTuVung() {
        initComponents();
        // Chu de co tat ca cac tu , sap xep
        for( ChuDe cd : BienToanCuc.duLieu1.getDanhSachChuDe() )
            for( TuVung tv : cd.getDanhSachTu() ) {
                allWord.addTu(tv);
            }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Back = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TPaneNghiaReply = new javax.swing.JTextPane();
        LabelImage = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TPanePhienAmReply = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        TPaneTuLoaiReply = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        TPaneWordQuestion = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        previous = new javax.swing.JButton();
        next = new javax.swing.JButton();
        CHUDE = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 100));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Back.setText("BACK");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(TPaneNghiaReply);

        jScrollPane3.setViewportView(TPanePhienAmReply);

        jScrollPane4.setViewportView(TPaneTuLoaiReply);

        jScrollPane5.setViewportView(TPaneWordQuestion);

        jLabel3.setText("TỪ HIỂN THỊ THUỘC CHỦ ĐỀ:");

        jLabel4.setText("HỌC TỪ MỚI");

        previous.setText("PREVIOUS");
        previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousActionPerformed(evt);
            }
        });

        next.setText("NEXT");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        CHUDE.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Back))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(previous, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(LabelImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(CHUDE, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(252, 252, 252))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Back)
                        .addGap(95, 95, 95))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CHUDE, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                            .addComponent(jScrollPane3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(previous, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int i; // biến lưu vị trí để lần sau học tiếp
    File fileCount = new File("manage\\count.txt"); // file quản lí biến vị trí học
    ChuDe allWord = new ChuDe(); // chủ đề chứa tất cả các từ
    /**
     * nút quay lại trang ngay trước đó và lưu lại vị trí đang học vào file
     * @param evt 
     */
    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // ghi số từ học ra file (int)
        try {
            FileWriter fwCount = new FileWriter(fileCount.getAbsoluteFile());
            fwCount.write(String.valueOf(i));
            fwCount.close();
        // ghi thời gian học ra file
            File fileTime = new File("manage\\time.txt");
            FileWriter fwTime = new FileWriter(fileTime);
            BufferedWriter bwTime = new BufferedWriter(fwTime);
            for(TuVung tv : allWord.getDanhSachTu() ) 
                if( tv.getTimeLearn() != null ) {
                    bwTime.write(tv.getTenTu());
                    bwTime.newLine();
                    bwTime.write(tv.getTimeLearn());
                    bwTime.newLine();
                }
            bwTime.close();
            fwTime.close();
        } catch (IOException ex) {
            Logger.getLogger(HocTuVung.class.getName()).log(Level.SEVERE, null, ex);
        }
        // cài đặt cửa sổ
        new MainProgram().setVisible(true);
        this.dispose();  
    }//GEN-LAST:event_BackActionPerformed
    /**
     * chuyển câu hỏi next
     * @param evt 
     */
    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        try {    
            // tạo từ vựng theo biến chạy để dễ thao tác
            i++;
            System.out.println(i);
            TuVung tv = allWord.getDanhSachTu().get(i);
            
            ChuDe topicTemp = new ChuDe();
            for( ChuDe cd : BienToanCuc.duLieu1.getDanhSachChuDe() ) 
                for(TuVung tu : cd.getDanhSachTu() ) {
                    if( tu == tv ) { topicTemp = cd; break; }
            }
            CHUDE.setText(topicTemp.getTenChuDe());
            TPaneWordQuestion.setText(tv.getTenTu());
            TPanePhienAmReply.setText(tv.getPhienAm());
            TPaneTuLoaiReply.setText(tv.getTuLoai());
            TPaneNghiaReply.setText(tv.getNghia());

            // điều chỉnh kích thước cho ảnh vừa với Label
            ImageIcon icon = new ImageIcon(tv.getLinkImage());
            Image image = icon.getImage().getScaledInstance(LabelImage.getWidth(), LabelImage.getHeight(), Image.SCALE_SMOOTH);
            icon = new ImageIcon(image, icon.getDescription());
            LabelImage.setIcon(icon);
            // ghi thông tin cho thời gian học 
            DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
            Date date = new Date();
            tv.setTimeLearn(dateFormat.format(date));
            
        } catch ( java.lang.IndexOutOfBoundsException ex ) {
            JOptionPane.showMessageDialog(this,"Từ cuối cùng ","Message Dialog Demo",JOptionPane.ERROR_MESSAGE);
            i--;
        }
    }//GEN-LAST:event_nextActionPerformed
    /**
     * chuyển câu hỏi previous
     * @param evt 
     */
    private void previousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousActionPerformed
        try {  
            i--;
            // tạo từ vựng theo biến chạy để dễ thao tác
            System.out.println(i);
            TuVung tv = allWord.getDanhSachTu().get(i);
            
            ChuDe topicTemp = new ChuDe();
            for( ChuDe cd : BienToanCuc.duLieu1.getDanhSachChuDe() ) 
                for(TuVung tu : cd.getDanhSachTu() ) {
                    if( tu == tv ) { topicTemp = cd; break; }
            }
            CHUDE.setText(topicTemp.getTenChuDe());
            TPaneWordQuestion.setText(tv.getTenTu());
            TPanePhienAmReply.setText(tv.getPhienAm());
            TPaneTuLoaiReply.setText(tv.getTuLoai());
            TPaneNghiaReply.setText(tv.getNghia());

            // điều chỉnh kích thước cho ảnh vừa với Label
            ImageIcon icon = new ImageIcon(tv.getLinkImage());
            Image image = icon.getImage().getScaledInstance(LabelImage.getWidth(), LabelImage.getHeight(), Image.SCALE_SMOOTH);
            icon = new ImageIcon(image, icon.getDescription());
            LabelImage.setIcon(icon);
            // ghi thông tin cho thời gian học 
            DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
            Date date = new Date();
            tv.setTimeLearn(dateFormat.format(date));
            
        } catch ( java.lang.ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(this,"Từ đầu tiên","Message Dialog Demo",JOptionPane.ERROR_MESSAGE);
            i++;
        }
    }//GEN-LAST:event_previousActionPerformed
    /**
     * cửa sổ hiển thị 1 câu hỏi ngay khi mở hộp thoại học từ vựng
     * @param evt 
     */
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // lấy thời gian học ban đầu của các từ trước
        try {
            File fileTime = new File("manage\\time.txt");
            Scanner scTime = new Scanner(fileTime);
            String temp = null;
            for( TuVung tv : allWord.getDanhSachTu() ) {
                if( scTime.hasNext() == false ) break;
                temp = scTime.nextLine();
                tv.setTimeLearn(scTime.nextLine());
            }
            // show ra màn hình
            Scanner scCount = new Scanner(fileCount);
            i = scCount.nextInt();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HocTuVung.class.getName()).log(Level.SEVERE, null, ex);
        }    
        
        
        try {    
            // tạo từ vựng theo biến chạy để dễ thao tác
            System.out.println(i);
            TuVung tv = allWord.getDanhSachTu().get(i);
            ChuDe topicTemp = new ChuDe();
            for( ChuDe cd : BienToanCuc.duLieu1.getDanhSachChuDe() ) 
                for(TuVung tu : cd.getDanhSachTu() ) {
                    if( tu == tv ) { topicTemp = cd; break; }
            }
            CHUDE.setText(topicTemp.getTenChuDe());
            TPaneWordQuestion.setText(tv.getTenTu());
            TPanePhienAmReply.setText(tv.getPhienAm());
            TPaneTuLoaiReply.setText(tv.getTuLoai());
            TPaneNghiaReply.setText(tv.getNghia());
            
            // điều chỉnh kích thước cho ảnh vừa với Label
            ImageIcon icon = new ImageIcon(tv.getLinkImage());
            Image image = icon.getImage().getScaledInstance(LabelImage.getWidth(), LabelImage.getHeight(), Image.SCALE_SMOOTH);
            icon = new ImageIcon(image, icon.getDescription());
            LabelImage.setIcon(icon);
            // ghi thông tin cho thời gian học 
            DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
            Date date = new Date();
            tv.setTimeLearn(dateFormat.format(date));
            
        } catch ( java.lang.IndexOutOfBoundsException ex ) {
            JOptionPane.showMessageDialog(this,"Từ cuối cùng","Message Dialog Demo",JOptionPane.ERROR_MESSAGE);
            i--;
        }
    }//GEN-LAST:event_formWindowOpened

    /**
     * hàm main chính chạy chương trình
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HocTuVung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HocTuVung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HocTuVung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HocTuVung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HocTuVung().setVisible(true);
            }
        });
        // khởi tạo dữ liệu cho chủ đề
        IOFile.inputChuDe(BienToanCuc.duLieu1);
        IOFile.inputTuVung(BienToanCuc.duLieu1);
        // xap xep lai danh sach hoc tu
        for( ChuDe cd : BienToanCuc.duLieu1.getDanhSachChuDe() ) {
            Collections.sort(cd.getDanhSachTu(),new WordComparator());  
            Iterator wtf =cd.getDanhSachTu().iterator(); 
        }
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JLabel CHUDE;
    private javax.swing.JLabel LabelImage;
    private javax.swing.JTextPane TPaneNghiaReply;
    private javax.swing.JTextPane TPanePhienAmReply;
    private javax.swing.JTextPane TPaneTuLoaiReply;
    private javax.swing.JTextPane TPaneWordQuestion;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton next;
    private javax.swing.JButton previous;
    // End of variables declaration//GEN-END:variables

}
