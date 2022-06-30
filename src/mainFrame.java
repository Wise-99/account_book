import static java.time.Clock.system;

public class mainFrame extends javax.swing.JFrame {
    DB_MAN DBM = new DB_MAN();
    String SQLUsers = "SELECT * FROM users";
    String SQLAccount = "SELECT * FROM account";

    public mainFrame() {
        initComponents();
        
        try{
            DBM.dbOpen();
            DBM.dbClose();
        }catch(Exception e){
        System.out.println("SQLException : " + e.getMessage());
        }
    }
    
    public void getDBData(String strQuery){
        try{
            DBM.DB_rs = DBM.DB_stmt.executeQuery(strQuery);
            while(DBM.DB_rs.next()){
                lblName.setText(DBM.DB_rs.getString("name"));
                lblId.setText(DBM.DB_rs.getString("id"));
                lblBal.setText(DBM.DB_rs.getString("bal"));
            }
            DBM.DB_rs.close();
        }catch (Exception e) {
            System.out.println("SQLException : " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupInOut = new javax.swing.ButtonGroup();
        frameLogin = new javax.swing.JFrame();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtDBId = new javax.swing.JTextField();
        txtDBPasswd = new javax.swing.JPasswordField();
        tbnDBLogin = new javax.swing.JButton();
        lblWarn1 = new javax.swing.JLabel();
        frameJoin = new javax.swing.JFrame();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtJoinPasswd = new javax.swing.JPasswordField();
        txtJoinPasswdChk = new javax.swing.JPasswordField();
        txtJoinName = new javax.swing.JTextField();
        txtJoinId = new javax.swing.JTextField();
        txtJoinBal = new javax.swing.JTextField();
        lblWarn2 = new javax.swing.JLabel();
        btnDBJoin = new javax.swing.JButton();
        jDialog1 = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        btnYes = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnJoin = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lblBal = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnCreate = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtDate = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        radioIn = new javax.swing.JRadioButton();
        radioOut = new javax.swing.JRadioButton();
        txtContent = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAccount = new javax.swing.JTable();
        btnReset = new javax.swing.JButton();

        jLabel8.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jLabel8.setText("Login");

        jLabel9.setText("Id");

        jLabel10.setText("Password");

        tbnDBLogin.setText("Login");
        tbnDBLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnDBLoginActionPerformed(evt);
            }
        });

        lblWarn1.setFont(new java.awt.Font("굴림", 1, 14)); // NOI18N
        lblWarn1.setForeground(new java.awt.Color(255, 0, 0));
        lblWarn1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWarn1.setText(" ");

        javax.swing.GroupLayout frameLoginLayout = new javax.swing.GroupLayout(frameLogin.getContentPane());
        frameLogin.getContentPane().setLayout(frameLoginLayout);
        frameLoginLayout.setHorizontalGroup(
            frameLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameLoginLayout.createSequentialGroup()
                .addContainerGap(155, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(147, 147, 147))
            .addGroup(frameLoginLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(frameLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tbnDBLogin)
                    .addGroup(frameLoginLayout.createSequentialGroup()
                        .addGroup(frameLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(frameLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDBId)
                            .addComponent(txtDBPasswd, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)))
                    .addComponent(lblWarn1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        frameLoginLayout.setVerticalGroup(
            frameLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameLoginLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel8)
                .addGap(38, 38, 38)
                .addGroup(frameLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDBId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(frameLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtDBPasswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblWarn1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(tbnDBLogin)
                .addGap(28, 28, 28))
        );

        jLabel11.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jLabel11.setText("Join");

        jLabel12.setText("* Name");

        jLabel13.setText("* Id");

        jLabel14.setText("* Password");

        jLabel15.setText("* Password check");

        jLabel16.setText("Balance");

        lblWarn2.setFont(new java.awt.Font("굴림", 1, 14)); // NOI18N
        lblWarn2.setForeground(new java.awt.Color(255, 0, 0));
        lblWarn2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnDBJoin.setText("Join");
        btnDBJoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDBJoinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frameJoinLayout = new javax.swing.GroupLayout(frameJoin.getContentPane());
        frameJoin.getContentPane().setLayout(frameJoinLayout);
        frameJoinLayout.setHorizontalGroup(
            frameJoinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameJoinLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(157, 157, 157))
            .addGroup(frameJoinLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(frameJoinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblWarn2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDBJoin)
                    .addGroup(frameJoinLayout.createSequentialGroup()
                        .addGroup(frameJoinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addGroup(frameJoinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtJoinPasswd)
                            .addComponent(txtJoinPasswdChk)
                            .addComponent(txtJoinName)
                            .addComponent(txtJoinId)
                            .addComponent(txtJoinBal, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        frameJoinLayout.setVerticalGroup(
            frameJoinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameJoinLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel11)
                .addGap(41, 41, 41)
                .addGroup(frameJoinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(txtJoinName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(frameJoinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtJoinId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(frameJoinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtJoinPasswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(frameJoinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtJoinPasswdChk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(frameJoinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtJoinBal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(lblWarn2)
                .addGap(18, 18, 18)
                .addComponent(btnDBJoin)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jLabel4.setText("로그아웃 하시겠습니까 ?");

        btnYes.setText("예(Yes)");
        btnYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(btnYes, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(88, 88, 88))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel4)
                .addGap(43, 43, 43)
                .addComponent(btnYes)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblName.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblName.setText("Guest");

        jLabel2.setFont(new java.awt.Font("굴림", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("굴림", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Id");

        lblId.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        lblId.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblId.setText("Guest");

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnJoin.setText("회원가입");
        btnJoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJoinActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("굴림", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Balance");

        lblBal.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        lblBal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBal.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblBal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(btnJoin)))
                .addContainerGap(239, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblId))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblName))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblBal))
                .addGap(32, 32, 32)
                .addComponent(btnLogin)
                .addGap(18, 18, 18)
                .addComponent(btnJoin)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("User Info", jPanel1);

        btnCreate.setText("등록");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnUpdate.setText("수정");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("삭제");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtDate.setToolTipText("");

        jLabel1.setText("날짜");

        jLabel5.setText("내용");

        jLabel6.setText("비용");

        groupInOut.add(radioIn);
        radioIn.setText("수입");

        groupInOut.add(radioOut);
        radioOut.setText("지출");

        txtContent.setToolTipText("");

        txtPrice.setToolTipText("");

        tblAccount.setFont(new java.awt.Font("굴림", 0, 14)); // NOI18N
        tblAccount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "날짜", "내용", "비용"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAccountMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblAccount);

        btnReset.setText("초기화");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioIn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(radioOut)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(20, 20, 20))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtContent, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(173, 173, 173)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(btnCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCreate)
                            .addComponent(btnDelete)
                            .addComponent(btnReset))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpdate)
                        .addGap(7, 7, 7)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(radioIn)
                    .addComponent(radioOut))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jTabbedPane1.addTab("Account Book", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        if(btnLogin.getText().equals("Logout")){
            jDialog1.setLocation(350, 350);
            jDialog1.setSize(400, 250);
            jDialog1.show();
            return;
        }
        frameLogin.setLocation(300, 300);
        frameLogin.setSize(350, 300);
        frameLogin.setVisible(true);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnJoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJoinActionPerformed
        // TODO add your handling code here:
        frameJoin.setLocation(300, 300);
        frameJoin.setSize(360, 450);
        frameJoin.setVisible(true);
    }//GEN-LAST:event_btnJoinActionPerformed

    private void tbnDBLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnDBLoginActionPerformed
        //로그인
        //입력한 id와 password
        String id = txtDBId.getText();
        String passwd = new String(txtDBPasswd.getPassword());
        
        //id와 password 검사
        try{
            DBM.dbOpen();
            DBM.DB_rs = DBM.DB_stmt.executeQuery(SQLUsers);
            while(DBM.DB_rs.next()){
                String DB_id = DBM.DB_rs.getString("id");
                if(id.equals(DB_id)){//아이디가 존재하고
                    if(passwd.equals(DBM.DB_rs.getString("passwd"))){//비밀번호가 맞으면
                        setUserInfo(id);
                        setAccount(id);
                        txtDBId.setText(null);
                        txtDBPasswd.setText(null);
                        frameLogin.setVisible(false);
                        btnLogin.setText("Logout");
                        return;
                    }
                    lblWarn1.setText("비밀번호를 확인해주세요.");
                    txtDBPasswd.setText(null);
                    return;
                }
            }
            lblWarn1.setText("존재하지 않는 아이디입니다.");
            txtDBId.setText(null);
            txtDBPasswd.setText(null);
            DBM.DB_rs.close();
            DBM.dbClose();
        }catch (Exception e) {
            System.out.println("SQLException : " + e.getMessage());
        }
    }//GEN-LAST:event_tbnDBLoginActionPerformed

    private void btnDBJoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDBJoinActionPerformed
        // TODO add your handling code here:
        String name = txtJoinName.getText();
        String id = txtJoinId.getText();
        String passwd = new String(txtJoinPasswd.getPassword());
        String passwdChk = new String(txtJoinPasswdChk.getPassword());
        String bal = txtJoinBal.getText();
        String[] newUser = {id, name, passwd, passwdChk, bal};
        
        for(int i=0; i<4; i++){
            if(newUser[i].equals("")){ //필수 미입력시
                lblWarn2.setText("*표시는 필수입력 입니다.");
                return;
            }
        }
        
        if(id.equals("Guest")){
            lblWarn2.setText("Guest는 사용불가한 Id입니다.");
            return;
        }
        
        try{    //Id 중복검사
            DBM.dbOpen();
            DBM.DB_rs = DBM.DB_stmt.executeQuery(SQLUsers);
            while(DBM.DB_rs.next()){
                String DB_id = DBM.DB_rs.getString("id");
                if(id.equals(DB_id)){
                    lblWarn2.setText("중복된 Id입니다.");
                    return;
                }
            }
            DBM.DB_rs.close();
            DBM.dbClose();
        }catch (Exception e) {
            System.out.println("SQLException : " + e.getMessage());
        }
        
        if(!passwd.equals(passwdChk)){  //비밀번호 체크와 다를 시
            lblWarn2.setText("비밀번호가 일치하지 않습니다.");
            return;
        }
        
        if(bal == null) //bal 미입력시 0
            newUser[4] = "0";
        
        //데이터베이스에 유저 추가
        String strSQL = "INSERT INTO users VALUES (";
        for(int i=0; i<3;  i++){
            strSQL += "'" + newUser[i] + "',";
        }
        strSQL += "'" + newUser[4] + "')";
        
        try{
            DBM.dbOpen();
            DBM.DB_stmt.executeUpdate(strSQL);//DB추가
            frameJoin.setVisible(false);
            txtJoinName.setText(null);
            txtJoinId.setText(null);
            txtJoinPasswd.setText(null);
            txtJoinPasswdChk.setText(null);
            txtJoinBal.setText(null);
            DBM.dbClose();
        }catch (Exception e) {
            System.out.println("SQLException : " + e.getMessage());
        }
    }//GEN-LAST:event_btnDBJoinActionPerformed

    private void btnYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYesActionPerformed
        // TODO add your handling code here:
        lblId.setText("Guest");
        lblName.setText("Guest");
        lblBal.setText("0");
        jDialog1.setVisible(false);
        btnLogin.setText("Login");
    }//GEN-LAST:event_btnYesActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // account create
        String strSQL = "INSERT INTO account VALUES (";
        strSQL += "'" + lblId.getText() + "', ";
        strSQL += "'" + txtDate.getText() + "', ";
        strSQL += "'" + txtContent.getText() + "', ";
        
        String price = "";
        if(radioOut.isSelected())
            price += "-";
        else
            price += "+";
        price += txtPrice.getText();
        
        strSQL += "'" + price + "')";
        
        try{
            DBM.dbOpen();
            DBM.DB_stmt.executeUpdate(strSQL);
            setAccount(lblId.getText());
            DBM.dbClose();
            int iCntRow = 0;
            iCntRow = tblAccount.getSelectedRow();
            
        }catch (Exception e){
            System.out.println("SQLException : " + e.getMessage());
        }
        
        int bal = Integer.parseInt(lblBal.getText());
        bal += Integer.parseInt(price);
        updateBal(lblId.getText(), bal);
        
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String strSQL = "UPDATE account SET ";
        strSQL += "id = " + "'" + lblId.getText() + "', ";
        strSQL += "date = " + "'" + txtDate.getText() + "', ";
        strSQL += "content = " + "'" + txtContent.getText() + "', ";
        strSQL += "price = " + "'" + txtPrice.getText() + "'";
        strSQL = makeSQLWhere(strSQL);

        try{
            DBM.dbOpen();
            DBM.DB_stmt.executeUpdate(strSQL);
            setAccount(lblId.getText());
            DBM.dbClose();
        }catch (Exception e){
            System.out.println("SQLException : " + e.getMessage());
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        String strSQL = "DELETE FROM account ";
        strSQL = makeSQLWhere(strSQL);

        try{
            DBM.dbOpen();
            DBM.DB_stmt.executeUpdate(strSQL);
            setAccount(lblId.getText());
            DBM.dbClose();
            
            txtDate.setText(null);
            txtContent.setText(null);
            txtPrice.setText(null);
            
        }catch(Exception e){
            System.out.println("SQLException : " + e.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAccountMouseClicked
        // TODO add your handling code here:
        int iCntRow = 0;
        iCntRow = tblAccount.getSelectedRow();
        
        txtDate.setText(tblAccount.getValueAt(iCntRow, 0).toString());
        txtContent.setText(tblAccount.getValueAt(iCntRow, 1).toString());
        txtPrice.setText(tblAccount.getValueAt(iCntRow, 2).toString());
        
    }//GEN-LAST:event_tblAccountMouseClicked

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        txtDate.setText(null);
        txtContent.setText(null);
        txtPrice.setText(null);
        radioIn.setSelected(false);
        radioOut.setSelected(false);
    }//GEN-LAST:event_btnResetActionPerformed

    /**
     * @param args the command line arguments
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
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
            }
        });
    }
    
    private void setUserInfo(String id) {
        try{
            DBM.dbOpen();
            DBM.DB_rs = DBM.DB_stmt.executeQuery(SQLUsers);
            while(DBM.DB_rs.next()){
                String DB_id = DBM.DB_rs.getString("id");
                if(id.equals(DB_id)){
                    lblId.setText(id);
                    lblName.setText(DBM.DB_rs.getString("name"));
                    lblBal.setText(DBM.DB_rs.getString("bal"));
                    break;
                }
            }
            DBM.DB_rs.close();
            DBM.dbClose();
        }catch (Exception e) {
            System.out.println("SQLException : " + e.getMessage());
        }
    }

    private void setAccount(String id) {
        //테이블 초기화
        for(int i = 0; i < tblAccount.getRowCount(); i++){
            tblAccount.setValueAt(null, i, 0);
            tblAccount.setValueAt(null, i, 1);
            tblAccount.setValueAt(null, i, 2);
        }
        
        int iCntRow = 0;
        try{
            DBM.dbOpen();
            DBM.DB_rs = DBM.DB_stmt.executeQuery(SQLAccount);
            while(DBM.DB_rs.next()){
                String DB_id = DBM.DB_rs.getString("id");
                if(id.equals(DB_id)){
                    tblAccount.setValueAt(DBM.DB_rs.getString("date"), iCntRow,0);
                    tblAccount.setValueAt(DBM.DB_rs.getString("content"), iCntRow,1);
                    tblAccount.setValueAt(DBM.DB_rs.getString("price"), iCntRow,2);
                    iCntRow++;
                }
            }
            DBM.DB_rs.close();
            DBM.dbClose();
        }catch (Exception e) {
            System.out.println("SQLException : " + e.getMessage());
        }
    }
    
    public String makeSQLWhere(String strQuery){
        int iCntRow = 0;
        iCntRow = tblAccount.getSelectedRow();
        
        strQuery += " WHERE account.id = " + "'" + lblId.getText() + "'";
        strQuery += " AND account.date = " + "'" + tblAccount.getValueAt(iCntRow, 0).toString() + "'";
        strQuery += " AND account.content = " + "'" + tblAccount.getValueAt(iCntRow, 1).toString() + "'";
        strQuery += " AND account.price = " + "'" +tblAccount.getValueAt(iCntRow, 2).toString() + "'";
        return strQuery;
    }
    
    private void updateBal(String id, int bal) {
        //DB update
        String strSQL = "UPDATE users SET ";
        strSQL += "bal = " + "'" + bal + "'";
        strSQL += " WHERE users.id = " + "'" + id + "'";
        
        try{
            DBM.dbOpen();
            DBM.DB_stmt.executeUpdate(strSQL);
            setUserInfo(id);
            DBM.dbClose();
        }catch (Exception e){
            System.out.println("SQLException : " + e.getMessage());
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDBJoin;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnJoin;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnYes;
    private javax.swing.JFrame frameJoin;
    private javax.swing.JFrame frameLogin;
    private javax.swing.ButtonGroup groupInOut;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblBal;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblWarn1;
    private javax.swing.JLabel lblWarn2;
    private javax.swing.JRadioButton radioIn;
    private javax.swing.JRadioButton radioOut;
    private javax.swing.JTable tblAccount;
    private javax.swing.JButton tbnDBLogin;
    private javax.swing.JTextField txtContent;
    private javax.swing.JTextField txtDBId;
    private javax.swing.JPasswordField txtDBPasswd;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtJoinBal;
    private javax.swing.JTextField txtJoinId;
    private javax.swing.JTextField txtJoinName;
    private javax.swing.JPasswordField txtJoinPasswd;
    private javax.swing.JPasswordField txtJoinPasswdChk;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
    
}
