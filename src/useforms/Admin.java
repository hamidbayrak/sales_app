package useforms;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import models.*;
import models.weather.*;
import org.jsoup.Jsoup;
import useutils.Util;

public class Admin extends javax.swing.JFrame {

    CategoryModel cmd = new CategoryModel();
    PersonModel pmd = new PersonModel();
    ProductModel prmd = new ProductModel();
    List<String> wls = new ArrayList<>();
    
    public Admin() {
        initComponents();
        adminRefresh();
        categoryResultRefresh();
        personResultRefresh();
        productResultRefresh();
        accuWeather();
        setWeather();
    }
    private void setWeather(){
        lbld1.setText(wls.get(0));
        lbls1.setText(wls.get(1));
        lblg1.setText(wls.get(2));
        lblgc1.setText(wls.get(3));
        lbld2.setText(wls.get(4));
        lbls2.setText(wls.get(5));
        lblg2.setText(wls.get(6));
        lblgc2.setText(wls.get(7));
        lbld3.setText(wls.get(8));
        lbls3.setText(wls.get(9));
        lblg3.setText(wls.get(10));
        lblgc3.setText(wls.get(11));
        lbld4.setText(wls.get(12));
        lbls4.setText(wls.get(13));
        lblg4.setText(wls.get(14));
        lblgc4.setText(wls.get(15));
        lbld5.setText(wls.get(16));
        lbls5.setText(wls.get(17));
        lblg5.setText(wls.get(18));
        lblgc5.setText(wls.get(19));      
    }
    
    private void accuWeather(){
        try {
            String url = Util.url;
            HashMap<String, String> hm = new HashMap<>();
            hm.put("apikey", Util.apikey);
            hm.put("language", "tr-tr");
            hm.put("metric", "true");
            String data = Jsoup.connect(url).data(hm).ignoreContentType(true).timeout(30000).get().text();
            Gson gson = new Gson();
            Weather wt = gson.fromJson(data, Weather.class);
            List<DailyForecast> ls = new ArrayList<>();
            ls = wt.getDailyForecasts();
            for (DailyForecast item : ls) {
                wls.add(item.getDate().split("T")[0]);
                wls.add(item.getTemperature().getMaximum().getValue()+"C/"+item.getTemperature().getMinimum().getValue()+"C");
                wls.add(item.getDay().getIconPhrase());
                wls.add(item.getNight().getIconPhrase());
            }
        } catch (Exception e) {
            System.err.println("accuWeather Error: " + e);
        }
    }
    
    private void adminRefresh(){
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
        prmd.productAllResult("");
        tblProduct.setModel(prmd.productTable());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txtCategoryTitle = new useutils.PlcHolderTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCategory = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
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
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        txtpname = new useutils.PlcHolderTextField();
        txtpsurname = new useutils.PlcHolderTextField();
        txtpphone = new useutils.PlcHolderTextField();
        txtpmail = new useutils.PlcHolderTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtpaddress = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPerson = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
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
        lblTitle1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lbls3 = new javax.swing.JLabel();
        lbls4 = new javax.swing.JLabel();
        lbld5 = new javax.swing.JLabel();
        lblg1 = new javax.swing.JLabel();
        lblg2 = new javax.swing.JLabel();
        lblg4 = new javax.swing.JLabel();
        lblg3 = new javax.swing.JLabel();
        lblg5 = new javax.swing.JLabel();
        lbld1 = new javax.swing.JLabel();
        lblgc1 = new javax.swing.JLabel();
        lbld2 = new javax.swing.JLabel();
        lblgc2 = new javax.swing.JLabel();
        lbld4 = new javax.swing.JLabel();
        lblgc3 = new javax.swing.JLabel();
        lbls5 = new javax.swing.JLabel();
        lblgc5 = new javax.swing.JLabel();
        lbld3 = new javax.swing.JLabel();
        lblgc4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lbls1 = new javax.swing.JLabel();
        lbls2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sales App");
        setMaximumSize(null);
        setMinimumSize(null);
        setResizable(false);

        jTabbedPane1.setMaximumSize(null);

        jPanel1.setMaximumSize(new java.awt.Dimension(960, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(960, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(960, 500));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Kategori Yönetimi"));
        jPanel4.setMaximumSize(null);
        jPanel4.setPreferredSize(new java.awt.Dimension(292, 408));

        txtCategoryTitle.setToolTipText("");
        txtCategoryTitle.setPlaceholder("Kategori Adı");

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

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.png"))); // NOI18N
        jButton1.setToolTipText("Kategori Ekle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/update.png"))); // NOI18N
        jButton6.setToolTipText("Kategori Güncelle");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        jButton7.setToolTipText("Kategori Sil");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(txtCategoryTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(txtCategoryTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Ürün Yönetimi"));
        jPanel3.setMaximumSize(null);

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
        tblProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblProduct);

        txtprPrice.setToolTipText("Fiyat");
        txtprPrice.setPlaceholder("Fiyat");

        txtprShelf.setToolTipText("Raf");
        txtprShelf.setPlaceholder("Raf");

        txtprTitle.setToolTipText("Ürün Başlığı");
        txtprTitle.setPlaceholder("Ürün Başlığı");

        txtprNote.setColumns(20);
        txtprNote.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        txtprNote.setRows(5);
        jScrollPane5.setViewportView(txtprNote);

        cmbCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtprStock.setToolTipText("Stok");
        txtprStock.setPlaceholder("Stok");

        txtprBarcode.setToolTipText("Fiyat");
        txtprBarcode.setPlaceholder("Barkod");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.png"))); // NOI18N
        jButton3.setToolTipText("Ürün Ekle");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/update.png"))); // NOI18N
        jButton4.setToolTipText("Ürün Güncelle");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        jButton5.setToolTipText("Ürün Sil");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtprTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtprPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtprBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtprShelf, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtprStock, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbCategory, 0, 118, Short.MAX_VALUE))
                    .addComponent(jScrollPane5)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)))
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
                    .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ürün işlemleri", jPanel1);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Personel İşlemleri"));
        jPanel5.setMaximumSize(null);

        txtpname.setToolTipText("");
        txtpname.setPlaceholder("Adı");

        txtpsurname.setToolTipText("");
        txtpsurname.setPlaceholder("Soyadı");

        txtpphone.setToolTipText("");
        txtpphone.setPlaceholder("Telefon");

        txtpmail.setToolTipText("");
        txtpmail.setPlaceholder("Mail");

        txtpaddress.setColumns(20);
        txtpaddress.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
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
        tblPerson.setMaximumSize(null);
        tblPerson.setMinimumSize(null);
        tblPerson.setPreferredSize(null);
        tblPerson.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPersonMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPerson);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        jButton8.setToolTipText("Personel Sil");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/update.png"))); // NOI18N
        jButton9.setToolTipText("Personel Güncelle");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.png"))); // NOI18N
        jButton2.setToolTipText("Personel Ekle");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/password.png"))); // NOI18N
        jButton10.setToolTipText("Personele Şifre Ata");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton10)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton9)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtpname, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtpsurname, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtpmail, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtpphone, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpsurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8)
                    .addComponent(jButton9)
                    .addComponent(jButton2)
                    .addComponent(jButton10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Admin İşlemleri"));
        jPanel6.setToolTipText("");
        jPanel6.setMaximumSize(null);
        jPanel6.setPreferredSize(new java.awt.Dimension(292, 408));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/admin_edit.png"))); // NOI18N

        txtAname.setToolTipText("");
        txtAname.setPlaceholder("");

        txtAusername.setToolTipText("");
        txtAusername.setPlaceholder("");

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/check.png"))); // NOI18N
        jButton11.setToolTipText("Admin Şifre Değiştir");
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
                .addGap(16, 16, 16)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(22, 22, 22)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton11)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtAname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtApassnew, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtAusername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtApassold, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 17, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(31, 31, 31)
                .addComponent(jButton11)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Kullanıcı İşlemleri", jPanel2);

        lblTitle1.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        lblTitle1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTitle1.setText("Admin");

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("5 Günlük Hava Tahmini"));

        lbls3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbls3.setText("jLabel6");

        lbls4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbls4.setText("jLabel6");

        lbld5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lbld5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbld5.setText("jLabel6");

        lblg1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblg1.setText("jLabel6");

        lblg2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblg2.setText("jLabel6");

        lblg4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblg4.setText("jLabel6");

        lblg3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblg3.setText("jLabel6");

        lblg5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblg5.setText("jLabel6");

        lbld1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lbld1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbld1.setText("jLabel6");

        lblgc1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblgc1.setText("jLabel6");

        lbld2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lbld2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbld2.setText("jLabel6");

        lblgc2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblgc2.setText("jLabel6");

        lbld4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lbld4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbld4.setText("jLabel6");

        lblgc3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblgc3.setText("jLabel6");

        lbls5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbls5.setText("jLabel6");

        lblgc5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblgc5.setText("jLabel6");

        lbld3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lbld3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbld3.setText("jLabel6");

        lblgc4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblgc4.setText("jLabel6");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Tarih");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Sıcaklık");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Gece");

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Gündüz");

        lbls1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbls1.setText("jLabel6");

        lbls2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbls2.setText("jLabel6");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblgc1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lblg1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lbls1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lbld1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(lblgc2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblgc3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblgc4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblgc5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbld2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbls2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblg2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbld3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbls3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblg3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbls4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbld4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblg4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbld5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbls5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblg5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbld1)
                    .addComponent(lbld2)
                    .addComponent(lbld4)
                    .addComponent(lbld3)
                    .addComponent(jLabel11)
                    .addComponent(lbld5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(lbls1)
                    .addComponent(lbls3)
                    .addComponent(lbls2)
                    .addComponent(lbls4)
                    .addComponent(lbls5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(lblg1)
                    .addComponent(lblg2)
                    .addComponent(lblg3)
                    .addComponent(lblg4)
                    .addComponent(lblg5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(lblgc1)
                    .addComponent(lblgc2)
                    .addComponent(lblgc3)
                    .addComponent(lblgc4)
                    .addComponent(lblgc5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        txtpname.setText(""+tblPerson.getValueAt(row, 1));
        txtpsurname.setText(""+tblPerson.getValueAt(row, 2));
        txtpmail.setText(""+tblPerson.getValueAt(row, 3));
        txtpphone.setText(""+tblPerson.getValueAt(row, 4));
        txtpaddress.setText(""+tblPerson.getValueAt(row, 5));

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
                pid = -1;
                txtpname.setText("");
                txtpsurname.setText("");
                txtpmail.setText("");
                txtpphone.setText("");
                txtpaddress.setText("");
            }
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if (pid == -1){
            JOptionPane.showMessageDialog(rootPane, "Lütfen güncellemek istediğiniz personeli seçiniz.!");
        } else {
            int row = tblPerson.getSelectedRow();
            String n = txtpname.getText().trim();
            String s = txtpsurname.getText().trim();
            String m = txtpmail.getText().trim();
            String t = txtpphone.getText().trim();
            String a = txtpaddress.getText().trim();
            if ( n.equals("") || s.equals("") || m.equals("") || t.equals("") || a.equals("")){
                JOptionPane.showMessageDialog(rootPane, "Personel bilgileri boş olamaz.!");
            } else {
                PersonModel pm = new PersonModel();
                int statu = pm.personUpdate(pid, n, s, m, t, a);
                if (statu > 0){
                JOptionPane.showMessageDialog(rootPane, "Personel bilgileri başarıyla güncellendi.");
                personResultRefresh();
                pid = -1;
                txtpname.setText("");
                txtpsurname.setText("");
                txtpmail.setText("");
                txtpphone.setText("");
                txtpaddress.setText("");
                }                
            }
        }
    }//GEN-LAST:event_jButton9ActionPerformed
    int cid = -1;
    private void tblCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCategoryMouseClicked
        int row = tblCategory.getSelectedRow();
        cid = (int) tblCategory.getValueAt(row, 0);
        txtCategoryTitle.setText(""+tblCategory.getValueAt(row, 1));
    }//GEN-LAST:event_tblCategoryMouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if ( cid == -1 ){
            JOptionPane.showMessageDialog(rootPane, "Lütfen silmek istediğiniz kategoriyi seçiniz.!");
        } else {
            int answer = JOptionPane.showConfirmDialog(rootPane, "Seçili kategoriyi silmek istediğinize emin misiniz?", "Kategori sil!", JOptionPane.YES_NO_OPTION);
            if ( answer == 0 ){
                CategoryModel cm = new CategoryModel();
                cm.categoryDelete(cid);
                cid = -1;
                txtCategoryTitle.setText("");
                categoryResultRefresh();
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if ( cid == -1){
            JOptionPane.showMessageDialog(rootPane, "Lütfen silmek istediğiniz kategoriyi seçiniz.!");
        } else {
            CategoryModel cm = new CategoryModel();
            int statu = cm.categoryUpdate(cid, txtCategoryTitle.getText().trim());
            if ( statu > 0 ){
                JOptionPane.showMessageDialog(rootPane, "Kategori adı başarıyla değiştirildi.!");
                categoryResultRefresh();
                txtCategoryTitle.setText("");
                cid = -1;
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
                Util.us.setUname(u);
                adminRefresh();
                txtAname.setText("");
                txtAusername.setText("");
                txtApassold.setText("");
                txtApassnew.setText("");
            }
        }
    }//GEN-LAST:event_jButton11ActionPerformed
    int prid = -1;
    private void tblProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductMouseClicked
        int row = tblProduct.getSelectedRow();
        prid = (int)tblProduct.getValueAt(row, 0);
        cmbCategory.setSelectedIndex((int)tblProduct.getValueAt(row, 1));
        txtprTitle.setText(""+tblProduct.getValueAt(row, 2));
        txtprPrice.setText(""+tblProduct.getValueAt(row, 3));
        txtprBarcode.setText(""+tblProduct.getValueAt(row, 4));
        txtprShelf.setText(""+tblProduct.getValueAt(row, 5));
        txtprStock.setText(""+tblProduct.getValueAt(row, 6));
        txtprNote.setText(""+tblProduct.getValueAt(row, 7));
    }//GEN-LAST:event_tblProductMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if ( prid == -1 ){
            JOptionPane.showMessageDialog(rootPane, "Lütfen silmek istediğiniz ürünü seçiniz.!");
        } else {
            int answer = JOptionPane.showConfirmDialog(rootPane, "Seçili ürünü silmek istediğinize emin misiniz?", "Ürün sil!", JOptionPane.YES_NO_OPTION);
            if ( answer == 0 ){
                ProductModel pm = new ProductModel();
                pm.deleteProduct(prid);
                productResultRefresh();
                prid = -1;
                cmbCategory.setSelectedIndex(0);
                txtprTitle.setText("");
                txtprPrice.setText("");
                txtprBarcode.setText("");
                txtprShelf.setText("");
                txtprStock.setText("");
                txtprNote.setText("");
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if ( prid == -1 ){
            JOptionPane.showMessageDialog(rootPane, "Lütfen düzenlemek istediğiniz ürünü seçiniz.!");
        } else {
            int cmb = cmbCategory.getSelectedIndex();
            String c = txtprTitle.getText().trim();
            String p = txtprPrice.getText().trim();
            String b = txtprBarcode.getText().trim();
            String s = txtprShelf.getText().trim();
            String st = txtprStock.getText().trim();
            String n = txtprNote.getText().trim();
            if ( cmb == 0 || c.equals("") || p.equals("") || b.equals("") || s.equals("") || st.equals("") || n.equals("")){
                JOptionPane.showMessageDialog(rootPane, "Ürün bilgileri boş olamaz.!");
            } else {
                ProductModel pm = new ProductModel();
                double pr = Double.valueOf(p);
                int stck = Integer.valueOf(st);
                int statu = pm.updateProduct(prid,cmb,c,pr,b,s,stck,n);
                if ( statu > 0 ){
                    JOptionPane.showMessageDialog(rootPane, "Ürün bilgileri başarıyla güncellendi.");
                    productResultRefresh();
                    prid = -1;
                    cmbCategory.setSelectedIndex(0);
                    txtprTitle.setText("");
                    txtprPrice.setText("");
                    txtprBarcode.setText("");
                    txtprShelf.setText("");
                    txtprStock.setText("");
                    txtprNote.setText("");
                    }
                }
            }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if ( pid == -1){
            JOptionPane.showMessageDialog(rootPane, "Lütfen şifre atamak istediğiniz kullanıcıyı seçiniz.!");
        } else {
            String uusername = JOptionPane.showInputDialog(rootPane, "Lütfen kullanıcı adı giriniz ");
            String upassword = JOptionPane.showInputDialog(rootPane, "Lütfen şifre giriniz ");
            if ( uusername.equals("") || upassword.equals("")){
                JOptionPane.showMessageDialog(rootPane, "Kullanıcı adı - şifre boş olamaz.!");
            } else {
                String nameSurname = txtpname.getText().trim() + " " + txtpsurname.getText().trim();
                int statu = pmd.personPwInsert(nameSurname, uusername, upassword);
                if ( statu > 0){
                    JOptionPane.showMessageDialog(rootPane, "Şifre ataması başarılı.!");
                    pid = -1;
                }
            } 
        }
    }//GEN-LAST:event_jButton10ActionPerformed

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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JLabel lbld1;
    private javax.swing.JLabel lbld2;
    private javax.swing.JLabel lbld3;
    private javax.swing.JLabel lbld4;
    private javax.swing.JLabel lbld5;
    private javax.swing.JLabel lblg1;
    private javax.swing.JLabel lblg2;
    private javax.swing.JLabel lblg3;
    private javax.swing.JLabel lblg4;
    private javax.swing.JLabel lblg5;
    private javax.swing.JLabel lblgc1;
    private javax.swing.JLabel lblgc2;
    private javax.swing.JLabel lblgc3;
    private javax.swing.JLabel lblgc4;
    private javax.swing.JLabel lblgc5;
    private javax.swing.JLabel lbls1;
    private javax.swing.JLabel lbls2;
    private javax.swing.JLabel lbls3;
    private javax.swing.JLabel lbls4;
    private javax.swing.JLabel lbls5;
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
