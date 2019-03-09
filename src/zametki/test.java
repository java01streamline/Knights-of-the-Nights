package zametki;

public class test extends javax.swing.JFrame {

        public test() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPane1 = new java.awt.ScrollPane();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        scrollbar3 = new java.awt.Scrollbar();
        scrollbar2 = new java.awt.Scrollbar();
        scrollbar1 = new java.awt.Scrollbar();
        map = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        actions3 = new javax.swing.JTabbedPane();
        buildings3 = new javax.swing.JPanel();
        livers1 = new javax.swing.JPanel();
        resources1 = new javax.swing.JPanel();
        jScrollBar2 = new javax.swing.JScrollBar();
        item_pull_6 = new javax.swing.JLabel();
        item_name_pull_6 = new javax.swing.JLabel();
        item_pull_7 = new javax.swing.JLabel();
        item_name_pull_7 = new javax.swing.JLabel();
        item_pull_8 = new javax.swing.JLabel();
        item_name_pull_8 = new javax.swing.JLabel();
        item_name_pull_9 = new javax.swing.JLabel();
        item_pull_9 = new javax.swing.JLabel();
        item_name_pull_10 = new javax.swing.JLabel();
        item_pull_10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        jButton2.setText("jButton2");
        scrollPane1.add(jButton2);

        jButton1.setText("jButton1");
        scrollPane1.add(jButton1);
        scrollPane1.add(scrollbar3);
        scrollPane1.add(scrollbar2);
        scrollPane1.add(scrollbar1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        map.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        map.setMaximumSize(new java.awt.Dimension(640, 640));
        map.setPreferredSize(new java.awt.Dimension(640, 640));
        map.setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        jPanel1.setMaximumSize(new java.awt.Dimension(360, 262));
        jPanel1.setMinimumSize(new java.awt.Dimension(360, 262));
        jPanel1.setPreferredSize(new java.awt.Dimension(360, 262));

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.setMaximumSize(new java.awt.Dimension(64, 64));
        jLabel1.setMinimumSize(new java.awt.Dimension(64, 64));
        jLabel1.setPreferredSize(new java.awt.Dimension(64, 64));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        actions3.setMaximumSize(new java.awt.Dimension(373, 392));
        actions3.setMinimumSize(new java.awt.Dimension(373, 392));
        actions3.setPreferredSize(new java.awt.Dimension(373, 392));

        javax.swing.GroupLayout buildings3Layout = new javax.swing.GroupLayout(buildings3);
        buildings3.setLayout(buildings3Layout);
        buildings3Layout.setHorizontalGroup(
            buildings3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 368, Short.MAX_VALUE)
        );
        buildings3Layout.setVerticalGroup(
            buildings3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 364, Short.MAX_VALUE)
        );

        actions3.addTab("Buildings", buildings3);

        javax.swing.GroupLayout livers1Layout = new javax.swing.GroupLayout(livers1);
        livers1.setLayout(livers1Layout);
        livers1Layout.setHorizontalGroup(
            livers1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 368, Short.MAX_VALUE)
        );
        livers1Layout.setVerticalGroup(
            livers1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 364, Short.MAX_VALUE)
        );

        actions3.addTab("livers", livers1);

        jScrollBar2.setBackground(new java.awt.Color(153, 102, 0));
        jScrollBar2.setForeground(new java.awt.Color(255, 153, 51));
        jScrollBar2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 0), 1, true));
        jScrollBar2.setVerifyInputWhenFocusTarget(false);

        item_pull_6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        item_pull_6.setMaximumSize(new java.awt.Dimension(64, 64));
        item_pull_6.setMinimumSize(new java.awt.Dimension(64, 64));
        item_pull_6.setPreferredSize(new java.awt.Dimension(64, 64));

        item_name_pull_6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        item_name_pull_6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        item_name_pull_6.setMaximumSize(new java.awt.Dimension(200, 64));
        item_name_pull_6.setMinimumSize(new java.awt.Dimension(200, 64));
        item_name_pull_6.setPreferredSize(new java.awt.Dimension(200, 64));

        item_pull_7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        item_pull_7.setMaximumSize(new java.awt.Dimension(64, 64));
        item_pull_7.setMinimumSize(new java.awt.Dimension(64, 64));
        item_pull_7.setPreferredSize(new java.awt.Dimension(64, 64));

        item_name_pull_7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        item_name_pull_7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        item_name_pull_7.setMaximumSize(new java.awt.Dimension(200, 64));
        item_name_pull_7.setMinimumSize(new java.awt.Dimension(200, 64));
        item_name_pull_7.setPreferredSize(new java.awt.Dimension(200, 64));

        item_pull_8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        item_pull_8.setMaximumSize(new java.awt.Dimension(64, 64));
        item_pull_8.setMinimumSize(new java.awt.Dimension(64, 64));
        item_pull_8.setPreferredSize(new java.awt.Dimension(64, 64));

        item_name_pull_8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        item_name_pull_8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        item_name_pull_8.setMaximumSize(new java.awt.Dimension(200, 64));
        item_name_pull_8.setMinimumSize(new java.awt.Dimension(200, 64));
        item_name_pull_8.setPreferredSize(new java.awt.Dimension(200, 64));

        item_name_pull_9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        item_name_pull_9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        item_name_pull_9.setMaximumSize(new java.awt.Dimension(200, 64));
        item_name_pull_9.setMinimumSize(new java.awt.Dimension(200, 64));
        item_name_pull_9.setPreferredSize(new java.awt.Dimension(200, 64));

        item_pull_9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        item_pull_9.setMaximumSize(new java.awt.Dimension(64, 64));
        item_pull_9.setMinimumSize(new java.awt.Dimension(64, 64));
        item_pull_9.setPreferredSize(new java.awt.Dimension(64, 64));

        item_name_pull_10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        item_name_pull_10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        item_name_pull_10.setMaximumSize(new java.awt.Dimension(200, 64));
        item_name_pull_10.setMinimumSize(new java.awt.Dimension(200, 64));
        item_name_pull_10.setPreferredSize(new java.awt.Dimension(200, 64));

        item_pull_10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        item_pull_10.setMaximumSize(new java.awt.Dimension(64, 64));
        item_pull_10.setMinimumSize(new java.awt.Dimension(64, 64));
        item_pull_10.setPreferredSize(new java.awt.Dimension(64, 64));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "asd" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout resources1Layout = new javax.swing.GroupLayout(resources1);
        resources1.setLayout(resources1Layout);
        resources1Layout.setHorizontalGroup(
            resources1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, resources1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(resources1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(resources1Layout.createSequentialGroup()
                        .addComponent(item_pull_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(item_name_pull_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(resources1Layout.createSequentialGroup()
                        .addComponent(item_pull_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(item_name_pull_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(resources1Layout.createSequentialGroup()
                        .addComponent(item_pull_10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(item_name_pull_10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(resources1Layout.createSequentialGroup()
                        .addGroup(resources1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(resources1Layout.createSequentialGroup()
                                .addComponent(item_pull_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(item_name_pull_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(resources1Layout.createSequentialGroup()
                                .addComponent(item_pull_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(item_name_pull_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)))
                .addGap(6, 6, 6)
                .addComponent(jScrollBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        resources1Layout.setVerticalGroup(
            resources1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resources1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(resources1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(resources1Layout.createSequentialGroup()
                        .addGroup(resources1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(item_name_pull_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(item_pull_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(resources1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(item_name_pull_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(item_pull_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(resources1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(item_name_pull_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(item_pull_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(resources1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(item_name_pull_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(item_pull_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(resources1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(item_name_pull_10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(item_pull_10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10))
        );

        actions3.addTab("Resources", resources1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(map, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                    .addComponent(actions3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(map, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(actions3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane actions3;
    private javax.swing.JPanel buildings3;
    private javax.swing.JLabel item_name_pull_10;
    private javax.swing.JLabel item_name_pull_6;
    private javax.swing.JLabel item_name_pull_7;
    private javax.swing.JLabel item_name_pull_8;
    private javax.swing.JLabel item_name_pull_9;
    private javax.swing.JLabel item_pull_10;
    private javax.swing.JLabel item_pull_6;
    private javax.swing.JLabel item_pull_7;
    private javax.swing.JLabel item_pull_8;
    private javax.swing.JLabel item_pull_9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel livers1;
    private javax.swing.JPanel map;
    private javax.swing.JPanel resources1;
    private java.awt.ScrollPane scrollPane1;
    private java.awt.Scrollbar scrollbar1;
    private java.awt.Scrollbar scrollbar2;
    private java.awt.Scrollbar scrollbar3;
    // End of variables declaration//GEN-END:variables
}
