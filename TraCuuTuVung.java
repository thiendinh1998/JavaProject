package View;

import Controller.IOFile;
import Model.BienToanCuc;
import Model.ChuDe;
import Model.TuVung;
import View.MainProgram;
import View.WordComparator;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;


public class TraCuuTuVung extends javax.swing.JFrame {

    
    public TraCuuTuVung() {
        initComponents();
        // khởi tạo combobox ngay khi mở cửa sổ
        BoxTopicAndAll.addItem("ALL"); 
        for( ChuDe cd : BienToanCuc.duLieu1.getDanhSachChuDe() ) {
            BoxTopicAndAll.addItem(cd.getTenChuDe());
        }   
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        keyWord = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BoxTopicAndAll = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        panePhienAm = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        paneTuLoai = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        paneNghia = new javax.swing.JTextPane();
        LabelImage = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        PaneTenTu = new javax.swing.JTextPane();
        jLayeredPane1 = new javax.swing.JLayeredPane(){
            ImageIcon icon = new ImageIcon("de.jpg");
            public void paintComponent(Graphics g){
                Dimension d = getSize();
                g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        listWordSelect = new javax.swing.JList<>();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 100));
        setResizable(false);

        keyWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyWordActionPerformed(evt);
            }
        });
        keyWord.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                keyWordKeyTyped(evt);
            }
        });

        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setText("TRA CỨU TỪ VỰNG");

        BoxTopicAndAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxTopicAndAllActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(panePhienAm);

        jScrollPane5.setViewportView(paneTuLoai);

        jScrollPane6.setViewportView(paneNghia);

        LabelImage.setPreferredSize(new java.awt.Dimension(234, 198));

        jScrollPane7.setViewportView(PaneTenTu);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 551, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        listWordSelect.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listWordSelectValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listWordSelect);

        jLayeredPane2.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(keyWord, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 109, Short.MAX_VALUE))
                    .addComponent(jLayeredPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                    .addComponent(jScrollPane7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BoxTopicAndAll, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addComponent(LabelImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(BoxTopicAndAll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(keyWord, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LabelImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING))
        );

        pack();
    }// </editor-fold>                        
    
     // khi nhập từ bàn phím , màn hình sẽ nhảy đến từ gợi ý
    private void keyWordKeyTyped(java.awt.event.KeyEvent evt) {                                 
        /*trim bo qua khoang trang bat dau va ket thuc*/
        String text = keyWord.getText().trim();
        //text += evt.getKeyChar();
        text = text.trim();
        
        for(int i = 0 ; i < mod.size() ; i++ ) {
            String keyWord = mod.getElementAt(i);
            if( keyWord.startsWith(text) ) {
                listWordSelect.setSelectedIndex(i);
                return;
            }
        }
        panePhienAm.setText(null);
        paneTuLoai.setText(null);
        paneNghia.setText(null);
        LabelImage.setIcon(null);        
    }                                
   
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        new MainProgram().setVisible(true); // mở cửa sổ mainprogram
        this.dispose();                     // đóng tra cứu từ vựng
    }                                        
    
    private DefaultListModel<String> mod; // đối tượng quản lí JLIST listwordselect
    private ArrayList<TuVung> arr; // danh sách từ vựng
   
    
    
    // hiển thị ra thông tin ngay khi chọn vào 1 từ nào đó
    private void listWordSelectValueChanged(javax.swing.event.ListSelectionEvent evt) {                                            
        if( !listWordSelect.isSelectionEmpty() ) {
            int index = listWordSelect.getSelectedIndex();
            TuVung temp = arr.get(index);
            PaneTenTu.setText(temp.getTenTu());
            panePhienAm.setText(temp.getPhienAm());
            paneTuLoai.setText(temp.getTuLoai());
            paneNghia.setText(temp.getNghia());
            // điều chỉnh kích thước cho ảnh vừa với Label
            ImageIcon icon = new ImageIcon(temp.getLinkImage());
            Image image = icon.getImage().getScaledInstance(LabelImage.getWidth(), LabelImage.getHeight(), Image.SCALE_SMOOTH);
            icon = new ImageIcon(image, icon.getDescription());
            LabelImage.setIcon(icon);
        }
    }                                           

     // chọn chủ đề để thu hẹp phạm vi tìm từ
   
    private void BoxTopicAndAllActionPerformed(java.awt.event.ActionEvent evt) {                                               
        if( BoxTopicAndAll.getSelectedItem().toString().equals( "ALL" )) {
            ChuDe allWord = new ChuDe();
            for( ChuDe cd : BienToanCuc.duLieu1.getDanhSachChuDe() )
                for( TuVung tv : cd.getDanhSachTu() ) {
                    allWord.addTu(tv);
                }
            // sắp xếp lại tất cả các từ            
            Collections.sort(allWord.getDanhSachTu(),new WordComparator());  
            Iterator wtf =allWord.getDanhSachTu().iterator();
            // đưa dữ liệu (tất cả các từ ) vào danh sách thả xuống
            mod = new DefaultListModel<>();
            listWordSelect.setModel(mod);// định nghĩa ds dữ liệu hiển thị trong Jlist
            arr = new ArrayList<>();
            
            for( TuVung tv : allWord.getDanhSachTu() ) {
                arr.add(tv);
                mod.addElement(tv.getTenTu());
            }
            
            return;
        }
        formWindowOpenedNew(evt);
    }                                              
    private void formWindowOpenedNew(ActionEvent evt) {// lắng nghe sự kiện để thực hiện hành động
        // đưa dữ liệu vào danh sách thả xuống
        mod = new DefaultListModel<>();
        listWordSelect.setModel(mod);
        arr = new ArrayList<>();
        String nameTemp = BoxTopicAndAll.getSelectedItem().toString();
        System.out.println("bat dau");
        System.out.println(nameTemp);
        // tạo 1 chủ đề tạm set tên giống chủ đề trong danh sách thực
        ChuDe topicTemp = new ChuDe();
        
        for( ChuDe cd : BienToanCuc.duLieu1.getDanhSachChuDe() ) {
            if( cd.getTenChuDe().equals( nameTemp )) { topicTemp = cd; break; }
        }
        for( TuVung tv : topicTemp.getDanhSachTu() ) {
            arr.add(tv);
            mod.addElement(tv.getTenTu());
        }

        for( TuVung tv : topicTemp.getDanhSachTu() ) {
            System.out.println(tv.getTenTu());
        }
    }
    private void keyWordActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    public static void main(String args[]) {

        // tạo và hiện thị form ban đầu
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TraCuuTuVung().setVisible(true);
            }
        });
        IOFile.inputChuDe(BienToanCuc.duLieu1); // khởi tạo dữ liệu cho chủ đề
        IOFile.inputTuVung(BienToanCuc.duLieu1);// khỏi tạo dữ liệu cho từ vựng

        for (ChuDe cd : BienToanCuc.duLieu1.getDanhSachChuDe()) {
            Collections.sort(cd.getDanhSachTu(), new WordComparator());
            Iterator hihi = cd.getDanhSachTu().iterator();
        }
    }

    // Variables declaration - do not modify                     
    private javax.swing.JComboBox<String> BoxTopicAndAll;
    private javax.swing.JLabel LabelImage;
    private javax.swing.JTextPane PaneTenTu;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField keyWord;
    private javax.swing.JList<String> listWordSelect;
    private javax.swing.JTextPane paneNghia;
    private javax.swing.JTextPane panePhienAm;
    private javax.swing.JTextPane paneTuLoai;
    // End of variables declaration                   

    
}
