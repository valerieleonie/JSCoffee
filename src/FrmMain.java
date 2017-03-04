
import javax.swing.table.DefaultTableModel;
import util.Sutil;

public class FrmMain extends javax.swing.JFrame {

    public static int stockAmericano = 10;
    public static int stockCafeeLatte = 10;
    public static int stockCappucino = 10;
    public static int stockJavaFrappe = 10;
    public static int stockMochaFrappe = 10;
    public static int stockVanillaFrappe = 10;

    // counter dari transaksi invoiced
    public static Integer receiptCounter = 1;
    
    public FrmMain() {
        initComponents();
        setLocationRelativeTo(null);
        
        
        

    }

    

    private void executeLogout() {
        this.setVisible(false);
        DlgLogin.instance.setVisible(true);
    }

    @Override
    public void dispose() {
        executeExit();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        members = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnNew = new javax.swing.JButton();
        btnCalculate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtReceipt = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        chkMembers = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        txtBeverage = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtUnitPrice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        txtDisc = new javax.swing.JTextField();
        txtPaid = new javax.swing.JTextField();
        txtReturnPaid = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtTotalPrice = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnAmericano = new javax.swing.JButton();
        btnJavaFrappe = new javax.swing.JButton();
        btnCaffeLatte = new javax.swing.JButton();
        btnMochaFrappe = new javax.swing.JButton();
        btnCappucino = new javax.swing.JButton();
        btnVanillaFrappe = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnIntial = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnNew = new javax.swing.JMenuItem();
        mnCalculate = new javax.swing.JMenuItem();
        mnSave = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnLogOut = new javax.swing.JMenuItem();
        mnExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("JS Coffee POS");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/coffee.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 2, 24)); // NOI18N
        jLabel2.setText("  JS Coffee");

        btnNew.setText("New Order");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        btnSave.setText("Save Order");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Receipt No"));

        txtReceipt.setEditable(false);
        txtReceipt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(txtReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Input Order"));

        jLabel3.setText("Members");

        chkMembers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMembersActionPerformed(evt);
            }
        });

        jLabel4.setText("Beverage");

        txtBeverage.setEditable(false);

        jLabel5.setText("Unit Price");

        txtUnitPrice.setEditable(false);

        jLabel6.setText("Qty");

        jLabel7.setText("Stock");

        txtStock.setEditable(false);

        jLabel8.setText("Sub Total");

        jLabel9.setText("Members Disc");

        jLabel10.setText("Paid");

        jLabel11.setText("Return Paid");

        txtTotal.setEditable(false);

        txtDisc.setEditable(false);

        txtPaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaidActionPerformed(evt);
            }
        });

        txtReturnPaid.setEditable(false);

        jLabel12.setText("Total Price");

        txtTotalPrice.setEditable(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txtUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtBeverage, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDisc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkMembers))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPaid)
                            .addComponent(txtReturnPaid)
                            .addComponent(txtTotalPrice))))
                .addContainerGap())
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtBeverage, txtDisc, txtPaid, txtReturnPaid, txtTotal, txtUnitPrice});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkMembers)
                    .addComponent(jLabel3))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtBeverage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66)
                        .addComponent(jLabel8))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtDisc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(txtPaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtReturnPaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtBeverage, txtDisc, txtPaid, txtReturnPaid, txtTotal, txtUnitPrice});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNew)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCalculate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSave))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNew)
                        .addComponent(btnCalculate)
                        .addComponent(btnSave)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Menu"));

        btnAmericano.setText("Americano");
        btnAmericano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAmericanoActionPerformed(evt);
            }
        });

        btnJavaFrappe.setText("Java Frappe");
        btnJavaFrappe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJavaFrappeActionPerformed(evt);
            }
        });

        btnCaffeLatte.setText("Caffe Latte");
        btnCaffeLatte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaffeLatteActionPerformed(evt);
            }
        });

        btnMochaFrappe.setText("Mocha Frappe");
        btnMochaFrappe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMochaFrappeActionPerformed(evt);
            }
        });

        btnCappucino.setText("Cappucino");
        btnCappucino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCappucinoActionPerformed(evt);
            }
        });

        btnVanillaFrappe.setText("Vanilla Frappe");
        btnVanillaFrappe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVanillaFrappeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAmericano)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnJavaFrappe))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCaffeLatte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMochaFrappe))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCappucino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVanillaFrappe)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAmericano, btnCaffeLatte, btnCappucino, btnJavaFrappe, btnMochaFrappe, btnVanillaFrappe});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAmericano)
                    .addComponent(btnJavaFrappe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCaffeLatte)
                    .addComponent(btnMochaFrappe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCappucino)
                    .addComponent(btnVanillaFrappe))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnJavaFrappe, btnMochaFrappe, btnVanillaFrappe});

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Receipt", "Members", "Beverage", "Unit Price", "Qty", "Total Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Boolean.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblData);

        jMenu1.setText("System");

        mnIntial.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        mnIntial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/initstock.png"))); // NOI18N
        mnIntial.setText("Initial Stock");
        mnIntial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnIntialActionPerformed(evt);
            }
        });
        jMenu1.add(mnIntial);
        jMenu1.add(jSeparator2);

        mnNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        mnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/new.png"))); // NOI18N
        mnNew.setText("New Order");
        mnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnNewActionPerformed(evt);
            }
        });
        jMenu1.add(mnNew);

        mnCalculate.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        mnCalculate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/calculate.png"))); // NOI18N
        mnCalculate.setText("Calculate");
        mnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCalculateActionPerformed(evt);
            }
        });
        jMenu1.add(mnCalculate);

        mnSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        mnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save.png"))); // NOI18N
        mnSave.setText("Save Order");
        mnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSaveActionPerformed(evt);
            }
        });
        jMenu1.add(mnSave);
        jMenu1.add(jSeparator1);

        mnLogOut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        mnLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logout.png"))); // NOI18N
        mnLogOut.setText("Logout");
        mnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnLogOutActionPerformed(evt);
            }
        });
        jMenu1.add(mnLogOut);

        mnExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        mnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/exit.png"))); // NOI18N
        mnExit.setText("Exit");
        mnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnExitActionPerformed(evt);
            }
        });
        jMenu1.add(mnExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");

        mnAbout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        mnAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/about.png"))); // NOI18N
        mnAbout.setText("About");
        mnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAboutActionPerformed(evt);
            }
        });
        jMenu2.add(mnAbout);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnLogOutActionPerformed
        executeLogout();
    }//GEN-LAST:event_mnLogOutActionPerformed

    private void mnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnExitActionPerformed
        executeExit();
    }//GEN-LAST:event_mnExitActionPerformed

    private void mnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAboutActionPerformed
        executeAbout();
    }//GEN-LAST:event_mnAboutActionPerformed

    private void mnIntialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnIntialActionPerformed
        executeInitStock();
    }//GEN-LAST:event_mnIntialActionPerformed

    private void mnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnNewActionPerformed
        executeNewOrder();
    }//GEN-LAST:event_mnNewActionPerformed

    private void mnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSaveActionPerformed
        executeSaveOrder();
    }//GEN-LAST:event_mnSaveActionPerformed

    private void mnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCalculateActionPerformed
        executeCalculate();
    }//GEN-LAST:event_mnCalculateActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        txtReceipt.setText("");
        txtBeverage.setText("");
        chkMembers.setSelected(false);
        txtUnitPrice.setText("");
        txtQty.setText("");
        txtStock.setText("");
        txtTotal.setText("");
        txtDisc.setText("");
        txtTotalPrice.setText("");
        txtPaid.setText("");
        txtReturnPaid.setText("");
        
        
        
    }//GEN-LAST:event_btnNewActionPerformed

    private void txtPaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaidActionPerformed

    private void chkMembersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMembersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkMembersActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        executeSaveOrder();
        
        txtReceipt.setText("JSC-"+receiptCounter.toString());
        receiptCounter++;
        double unitprice = Double.parseDouble(txtUnitPrice.getText());
        int qtyy = Integer.parseInt(txtQty.getText());
        double total = Double.parseDouble(txtTotal.getText());
        Object data[] = {txtReceipt.getText(),
            chkMembers.isSelected(),
            txtBeverage.getText(),
            unitprice,
            qtyy,
            total

        };
        DefaultTableModel tableModel = (DefaultTableModel) tblData.getModel();
        tableModel.addRow(data);
        
        useStock(txtBeverage.getText());
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnAmericanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAmericanoActionPerformed
        // TODO add your handling code here:
        txtBeverage.setText("Americano");
        txtUnitPrice.setText("15000");
        txtStock.setText(String.valueOf(stockAmericano));
    }//GEN-LAST:event_btnAmericanoActionPerformed

    private void btnJavaFrappeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJavaFrappeActionPerformed
        // TODO add your handling code here:
        txtBeverage.setText("Java Frappe");
        txtUnitPrice.setText("20000");
        txtStock.setText(String.valueOf(stockJavaFrappe));
    }//GEN-LAST:event_btnJavaFrappeActionPerformed

    private void btnCaffeLatteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaffeLatteActionPerformed
        // TODO add your handling code here:
        txtBeverage.setText("Caffee Latte");
        txtUnitPrice.setText("20000");
        txtStock.setText(String.valueOf(stockCafeeLatte));
    }//GEN-LAST:event_btnCaffeLatteActionPerformed

    private void btnMochaFrappeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMochaFrappeActionPerformed
        // TODO add your handling code here:
        txtBeverage.setText("Mocha Frappe");
        txtUnitPrice.setText("25000");
        txtStock.setText(String.valueOf(stockMochaFrappe));
    }//GEN-LAST:event_btnMochaFrappeActionPerformed

    private void btnCappucinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCappucinoActionPerformed
        // TODO add your handling code here:
        txtBeverage.setText("Cappucino");
        txtUnitPrice.setText(String.valueOf(15000));
        txtStock.setText(String.valueOf(stockCappucino));
    }//GEN-LAST:event_btnCappucinoActionPerformed

    private void btnVanillaFrappeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVanillaFrappeActionPerformed
        // TODO add your handling code here:
        txtBeverage.setText("Vanilla Frappe");
        txtUnitPrice.setText("25000");
        txtStock.setText(String.valueOf(stockVanillaFrappe));
    }//GEN-LAST:event_btnVanillaFrappeActionPerformed

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        // TODO add your handling code here:
        executeCalculate();
        
    }//GEN-LAST:event_btnCalculateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAmericano;
    private javax.swing.JButton btnCaffeLatte;
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnCappucino;
    private javax.swing.JButton btnJavaFrappe;
    private javax.swing.JButton btnMochaFrappe;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnVanillaFrappe;
    private javax.swing.JCheckBox chkMembers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.ButtonGroup members;
    private javax.swing.JMenuItem mnAbout;
    private javax.swing.JMenuItem mnCalculate;
    private javax.swing.JMenuItem mnExit;
    private javax.swing.JMenuItem mnIntial;
    private javax.swing.JMenuItem mnLogOut;
    private javax.swing.JMenuItem mnNew;
    private javax.swing.JMenuItem mnSave;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtBeverage;
    private javax.swing.JTextField txtDisc;
    private javax.swing.JTextField txtPaid;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtReceipt;
    private javax.swing.JTextField txtReturnPaid;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTotalPrice;
    private javax.swing.JTextField txtUnitPrice;
    // End of variables declaration//GEN-END:variables

    private void executeExit() {
        if (Sutil.msq(this, "Exit Confirmation?") == 0) {
             System.exit(0);
        }
        else {
            
        }

    }

    private void executeAbout() {
        Sutil.msg(this, "JS Coffee POS\n Version 1.0\n Author : Valerie Leonie");

    }

    private void executeInitStock() {
        DlgStock stock = new DlgStock(this, true);
        stock.setVisible(true);
        
    }

    private void executeNewOrder() {
        txtReceipt.setText("");
        chkMembers.setSelected(false);
        txtBeverage.setText("");
        txtUnitPrice.setText("");
        txtQty.setText("");
        txtStock.setText("");
        txtDisc.setText("");
        txtTotal.setText("");
        txtTotalPrice.setText("");
        txtPaid.setText("");
        txtReturnPaid.setText("");
    }

    private void executeCalculate() {
        int qty = Integer.parseInt(txtQty.getText());
        int price = Integer.parseInt(txtUnitPrice.getText());
        double subtotal = qty*price;

        txtTotal.setText(Double.toString(subtotal));
        
        double totalprice = Double.parseDouble(txtTotal.getText());
        
        if (chkMembers.isSelected()){
            double disc ;
            disc = 0.15*subtotal;
            totalprice = subtotal -disc;
            txtDisc.setText(Double.toString(disc));
            txtTotalPrice.setText(Double.toString(totalprice));
        }
        else {
            txtDisc.setText("0.0");
            totalprice = subtotal;
            txtTotalPrice.setText(Double.toString(totalprice));
        }

    }

    private void executeSaveOrder() {
        double paid = Double.parseDouble(txtPaid.getText());
        double totalprice = Double.parseDouble(txtTotalPrice.getText());
        double returnpaid = paid-totalprice;
        
        txtReturnPaid.setText(Double.toString(returnpaid));
        
    }

    /* 
        - method untuk mengurangi stock yang di order
        - setiap pemangilan method ini akan mengurangi stock sebanyak 1 (satu)
          dari jenis beverages yang diinput di parameter method nya.    
     */
    private void useStock(String beverageName) {
        int qty = Integer.parseInt(txtQty.getText());
        if (txtBeverage.getText().equals("Americano")) {
            if(stockAmericano >0){
                stockAmericano = stockAmericano - qty;
            }
            else if (stockAmericano <= 0){
            Sutil.mse(jPanel1, "Stock is not enough!");
        }
        }
        else if (txtBeverage.getText().equals("Caffe Latte")) {
            if(stockCafeeLatte >0){
                stockCafeeLatte = stockCafeeLatte - qty;
            }
            else if (stockCafeeLatte <= 0){
            Sutil.mse(jPanel1, "Stock is not enough!");
        }
        }
        else if (txtBeverage.getText().equals("Cappucino")) {
            if(stockCappucino >0){
                stockCappucino = stockCappucino - qty;
            }
            else if (stockCappucino <= 0){
            Sutil.mse(jPanel1, "Stock is not enough!");
        }
        }
        else if (txtBeverage.getText().equals("Java Frappe")) {
            if(stockJavaFrappe >0){
                stockJavaFrappe = stockJavaFrappe - qty;
            }
            else if (stockJavaFrappe <= 0){
            Sutil.mse(jPanel1, "Stock is not enough!");
        }
        }
        else if (txtBeverage.getText().equals("Mocha Frappe")) {
            if(stockMochaFrappe >0){
                stockMochaFrappe = stockMochaFrappe - qty;
            }
            else if (stockMochaFrappe <= 0){
            Sutil.mse(jPanel1, "Stock is not enough!");
        }
        }
        else if (txtBeverage.getText().equals("Vanilla Frappe")) {
            if(stockVanillaFrappe >0){
                stockVanillaFrappe = stockVanillaFrappe - qty;
            }
            else if (stockVanillaFrappe <= 0){
            Sutil.mse(jPanel1, "Stock is not enough!");
        }
        }

    }

}
