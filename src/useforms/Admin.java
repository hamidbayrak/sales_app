package useforms;

import javax.swing.JOptionPane;
import models.*;
import useutils.Util;

public class Admin extends javax.swing.JFrame {

    CategoryModel cmd = new CategoryModel();
    PersonModel pmd = new PersonModel();
    ProductModel prmd = new ProductModel();
   
    public Admin() {
        initComponents();
        adminRefresh();
        categoryResultRefresh();
        personResultRefresh();
        productResultRefresh();
    }
    
    private void adminRefresh(){
        lblTitle.setText(Util.us.getUname());
        lblTitle1.setText(Util.us.getUname());
    }

    private void categoryResultRefresh() {
        cmd.categoryAllResult();
        tblCategory.setModel(cmd.categoryTable());
        cmbCategory.setModel(cmd.categoryCombobox());
    }
    
    private void personResultRefresh() {
        pmd.personAllResult();
        tblPerson.setModel(pmd.personTable());
    }
    
    private void productResultRefresh(){
        prmd.productAllResult();
        tblProduct.setModel(prmd.productTable());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblProduct = new javax.swing.JTable();
        txtprPrice = new useutils.PlcHolderTextField();
        txtprShelf = new useutils.PlcHolderTextField();
        txtprTitle = new useutils.PlcHolderTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtprNote = new javax.swing.JTextArea();
        cmbCategory = new javax.swing.JComboBox<>();
        txtprStock = new useutils.PlcHolderTextField();
        txtprBarcode = new useutils.PlcHolderTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        lblTitle1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtCategoryTitle = new useutils.PlcHolderTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCategory = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        txtpname = new useutils.PlcHolderTextField();
        txtpsurname = new useutils.PlcHolderTextField();
        txtpphone = new useutils.PlcHolderTextField();
        txtpmail = new useutils.PlcHolderTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtpaddress = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPerson = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtAname = new useutils.PlcHolderTextField();
        txtAusername = new useutils.PlcHolderTextField();
        jButton11 = new javax.swing.JButton();
        txtApassold = new javax.swing.JPasswordField();
        txtApassnew = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sales App");
        setMaximumSize(new java.awt.Dimension(960, 450));
        setMinimumSize(new java.awt.Dimension(960, 450));
        setResizable(false);

        jTabbedPane1.setMaximumSize(new java.awt.Dimension(945, 385));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(945, 385));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(945, 385));

        jPanel1.setMaximumSize(new java.awt.Dimension(960, 430));
        jPanel1.setMinimumSize(new java.awt.Dimension(960, 430));
        jPanel1.setPreferredSize(new java.awt.Dimension(960, 430));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Ürün Yönetimi"));
        jPanel3.setMaximumSize(new java.awt.Dimension(706, 400));
        jPanel3.setMinimumSize(new java.awt.Dimension(706, 400));
        jPanel3.setPreferredSize(new java.awt.Dimension(706, 400));

        tblProduct.setModel(new javax.swing.table.DefaultTableModel(
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
        tblProduct.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(tblProduct);

        txtprPrice.setToolTipText("Fiyat");
        txtprPrice.setPlaceholder("Fiyat");

        txtprShelf.setToolTipText("Raf");
        txtprShelf.setPlaceholder("Raf");

        txtprTitle.setToolTipText("Ürün Başlığı");
        txtprTitle.setPlaceholder("Ürün Başlığı");

        txtprNote.setColumns(20);
        txtprNote.setRows(5);
        jScrollPane5.setViewportView(txtprNote);

        cmbCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtprStock.setToolTipText("Stok");
        txtprStock.setPlaceholder("Stok");

        txtprBarcode.setToolTipText("Fiyat");
        txtprBarcode.setPlaceholder("Barkod");

        jButton3.setText("Ekle");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Ürün Düzenle");

        jButton5.setText("Ürün Sil");

        lblTitle1.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        lblTitle1.setText("Admin");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addComponent(jScrollPane3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lblTitle1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtprTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtprPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtprBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtprShelf, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtprStock, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtprTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtprPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtprBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtprShelf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtprStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton4)
                    .addComponent(lblTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Kategori Yönetimi"));
        jPanel4.setMaximumSize(new java.awt.Dimension(240, 400));
        jPanel4.setMinimumSize(new java.awt.Dimension(240, 400));
        jPanel4.setPreferredSize(new java.awt.Dimension(240, 400));

        txtCategoryTitle.setToolTipText("");
        txtCategoryTitle.setPlaceholder("Kategori Adı");

        jButton1.setText("Ekle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tblCategory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        tblCategory.setGridColor(new java.awt.Color(255, 255, 255));
        tblCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCategoryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCategory);

        jButton6.setText("Düzenle");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Sil");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtCategoryTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCategoryTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 30, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ürün işlemleri", jPanel1);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Personel İşlemleri"));
        jPanel5.setMaximumSize(new java.awt.Dimension(706, 400));
        jPanel5.setMinimumSize(new java.awt.Dimension(706, 400));
        jPanel5.setPreferredSize(new java.awt.Dimension(706, 400));

        txtpname.setToolTipText("");
        txtpname.setPlaceholder("Adı");

        txtpsurname.setToolTipText("");
        txtpsurname.setPlaceholder("Soyadı");

        txtpphone.setToolTipText("");
        txtpphone.setPlaceholder("Telefon");

        txtpmail.setToolTipText("");
        txtpmail.setPlaceholder("Mail");

        jButton2.setText("Ekle");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtpaddress.setColumns(20);
        txtpaddress.setRows(5);
        jScrollPane4.setViewportView(txtpaddress);

        tblPerson.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPerson.setGridColor(new java.awt.Color(255, 255, 255));
        tblPerson.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPersonMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPerson);

        jButton8.setText("Personel Sil");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Personel Düzenle");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Personel Şifre Ata");

        lblTitle.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        lblTitle.setText("Admin");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtpname, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtpsurname, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtpmail, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(txtpphone, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(lblTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton10)
                        .addGap(18, 18, 18)
                        .addComponent(jButton9)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpsurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(txtpphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jButton9)
                    .addComponent(jButton10)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Admin İşlemleri"));
        jPanel6.setToolTipText("");
        jPanel6.setMaximumSize(new java.awt.Dimension(240, 400));
        jPanel6.setMinimumSize(new java.awt.Dimension(240, 400));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/admin_icon.png"))); // NOI18N

        txtAname.setToolTipText("");
        txtAname.setPlaceholder("");

        txtAusername.setToolTipText("");
        txtAusername.setPlaceholder("");

        jButton11.setText("Onayla");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel2.setText("Adı");

        jLabel3.setText("Kullanıcı Adı");

        jLabel4.setText("Eski Şifre");

        jLabel5.setText("Yeni Şifre");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton11)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtAusername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtAname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtApassold)
                                .addComponent(txtApassnew, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)))
                        .addGap(9, 9, 9))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApassold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApassnew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jButton11)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Kullanıcı İşlemleri", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String n = txtpname.getText().trim();
        String s = txtpsurname.getText().trim();
        String m = txtpmail.getText().trim();
        String t = txtpphone.getText().trim();
        String a = txtpaddress.getText().trim();
        
        if (n.equals("") || s.equals("") || m.equals("") || t.equals("") || a.equals("")){
            JOptionPane.showMessageDialog(rootPane, "Personel bilgileri boş olamaz.!");
        } else {
            int statu = pmd.personInsert(n, s, m, t, a);
            if (statu == -2){
                JOptionPane.showMessageDialog(rootPane, "Bu telefon veya mail adresi zaten kayıtlı.!");
            } else if (statu > 0){
                personResultRefresh();
                txtpname.setText("");
                txtpsurname.setText("");
                txtpmail.setText("");
                txtpphone.setText("");
                txtpaddress.setText("");
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        int c = cmbCategory.getSelectedIndex();
        String t = txtprTitle.getText().trim();
        String price = txtprPrice.getText().trim();
        String b = txtprBarcode.getText().trim();
        String s = txtprShelf.getText().trim();
        String stock = txtprStock.getText().trim();
        String n = txtprNote.getText().trim();
                
        if ( c == 0 || t.equals("") || price.equals("") || b.equals("") || s.equals("") || stock.equals("") || n.equals("")){
            JOptionPane.showMessageDialog(rootPane, "Ürün bilgileri boş olamaz.!");
        } else {
            double p = Double.parseDouble(price);
            int st = Integer.parseInt(stock);
            int statu = prmd.productInsert(c, t, p, b, s, st, n);
            cmbCategory.setSelectedIndex(0);
            txtprTitle.setText("");
            txtprPrice.setText("");
            txtprBarcode.setText("");
            txtprShelf.setText("");
            txtprStock.setText("");
            txtprNote.setText("");
        }
        productResultRefresh();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String catTitle = txtCategoryTitle.getText().trim();
        if (catTitle.equals("")){
            JOptionPane.showMessageDialog(rootPane, "Kategori adı boş olamaz!");
        } else {
            int statu = cmd.categoryInsert(catTitle);
            if (statu == -2){
                JOptionPane.showMessageDialog(rootPane, "Kategori ' "+catTitle+" ' zaten var!");
            } else if (statu > 0) {
                categoryResultRefresh();
                txtCategoryTitle.setText("");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    int pid = -1;
    private void tblPersonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPersonMouseClicked
        int row = tblPerson.getSelectedRow();
        pid = (int) tblPerson.getValueAt(row, 0);
    }//GEN-LAST:event_tblPersonMouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if (pid == -1){
            JOptionPane.showMessageDialog(rootPane, "Lütfen silmek istediğiniz personeli seçiniz.!");
        } else {
            int answer = JOptionPane.showConfirmDialog(rootPane, "Seçili personeli silmek istediğinize emin misiniz?", "Personel sil!", JOptionPane.YES_NO_OPTION);
            if ( answer == 0 ){
                PersonModel pm = new PersonModel();
                pm.personDelete(pid);
                personResultRefresh();
            }
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if (pid == -1){
            JOptionPane.showMessageDialog(rootPane, "Lütfen düzenlemek istediğiniz personeli seçiniz.!");
        } else {
            int row = tblPerson.getSelectedRow();
            PersonUpdate.pid = this.pid;
            PersonUpdate.name = "" + tblPerson.getValueAt(row, 1);
            PersonUpdate.surname = "" + tblPerson.getValueAt(row, 2);
            PersonUpdate.mail = "" + tblPerson.getValueAt(row, 3);
            PersonUpdate.tel = "" + tblPerson.getValueAt(row, 4);
            PersonUpdate.address = "" + tblPerson.getValueAt(row, 5);
            
            PersonUpdate pu = new PersonUpdate();
            pu.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jButton9ActionPerformed
    int cid = -1;
    private void tblCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCategoryMouseClicked
        int row = tblCategory.getSelectedRow();
        cid = (int) tblCategory.getValueAt(row, 0);
    }//GEN-LAST:event_tblCategoryMouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if ( cid == -1 ){
            JOptionPane.showMessageDialog(rootPane, "Lütfen silmek istediğiniz kategoriyi seçiniz.!");
        } else {
            int answer = JOptionPane.showConfirmDialog(rootPane, "Seçili kategoriyi silmek istediğinize emin misiniz?", "Kategori sil!", JOptionPane.YES_NO_OPTION);
            if ( answer == 0 ){
                CategoryModel cm = new CategoryModel();
                cm.categoryDelete(cid);
                categoryResultRefresh();
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if ( cid == -1 ){
            JOptionPane.showMessageDialog(rootPane, "Lütfen değiştirmek istediğiniz kategoriyi seçiniz.!");
        } else {
            String ctitle = JOptionPane.showInputDialog("Kategori adı giriniz: ");
            CategoryModel cm = new CategoryModel();
            int statu = cm.categoryUpdate(cid, ctitle);
            if ( statu > 0 ){
                JOptionPane.showMessageDialog(rootPane, "Kategori adı başarıyla değiştirildi.!");
                categoryResultRefresh();
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        String n = txtAname.getText().trim();
        String u = txtAusername.getText().trim();
        String pw_old = String.valueOf(txtApassold.getPassword()).trim();
        String pw_new = String.valueOf(txtApassnew.getPassword()).trim();
        if (n.equals("") || u.equals("") || pw_old.equals("") || pw_new.equals("")){
            JOptionPane.showMessageDialog(rootPane, "Admin bilgileri boş olamaz.!");
        } else {
            UserModel um = new UserModel();
            int statu = um.userLogin(Util.us.getUusername(), pw_old);
            if (statu < 0){
                JOptionPane.showMessageDialog(rootPane, "Yanlış şifre girdiniz.!");
            } else {
                int uid = Util.us.getUid();
                um.updateAdmin(uid, n, u, pw_new);
                JOptionPane.showMessageDialog(rootPane, "Şifreniz başarıyla değiştirildi.");
                adminRefresh();
                txtAname.setText("");
                txtAusername.setText("");
                txtApassold.setText("");
                txtApassnew.setText("");
            }
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbCategory;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JTable tblCategory;
    private javax.swing.JTable tblPerson;
    private javax.swing.JTable tblProduct;
    private useutils.PlcHolderTextField txtAname;
    private javax.swing.JPasswordField txtApassnew;
    private javax.swing.JPasswordField txtApassold;
    private useutils.PlcHolderTextField txtAusername;
    private useutils.PlcHolderTextField txtCategoryTitle;
    private javax.swing.JTextArea txtpaddress;
    private useutils.PlcHolderTextField txtpmail;
    private useutils.PlcHolderTextField txtpname;
    private useutils.PlcHolderTextField txtpphone;
    private useutils.PlcHolderTextField txtprBarcode;
    private javax.swing.JTextArea txtprNote;
    private useutils.PlcHolderTextField txtprPrice;
    private useutils.PlcHolderTextField txtprShelf;
    private useutils.PlcHolderTextField txtprStock;
    private useutils.PlcHolderTextField txtprTitle;
    private useutils.PlcHolderTextField txtpsurname;
    // End of variables declaration//GEN-END:variables
}
