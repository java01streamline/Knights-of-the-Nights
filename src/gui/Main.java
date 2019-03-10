/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import model.gui.main.Cell;
import resources.images.ImageInstance;
import service.gui.MainService;
import service.gui.impl.MainServiceImpl;
import territory.Territory;
import thread.main.MainThread;

/**
 *
 * @author User
 */
public class Main extends javax.swing.JFrame {
    
    private MainService mainService = new MainServiceImpl();
    public static Cell selectedCell = null;
    public static Cell selectedAction = null;
    private MainThread thread = new MainThread();
    private Territory territory;
    
    public Main(Territory territory) {
        this.territory = territory;
        initComponents();
        this.setIconImage(ImageInstance.getDefault());
        mainService.mapInit(this.map);
        mainService.mapActions(buildings);
       mainService.mapResources(resources, territory.getResources()); //here
        thread.start();
    }
    
    public void createBuilding(Cell place, Cell selected){
        mainService.setImage(place, selected);
    }
    
    public void slide_items(){
        item_im_1.setIcon("df"+(int)(slider_item.getValue())+".png");//here
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        actions10 = new javax.swing.JTabbedPane();
        buildings = new javax.swing.JPanel();
        livers = new javax.swing.JPanel();
        resources = new javax.swing.JPanel();
        item_lore_1 = new javax.swing.JLabel();
        item_im_1 = new javax.swing.JButton();
        item_lore_2 = new javax.swing.JLabel();
        item_im_2 = new javax.swing.JButton();
        item_im_3 = new javax.swing.JButton();
        item_lore_3 = new javax.swing.JLabel();
        item_im_4 = new javax.swing.JButton();
        item_lore_4 = new javax.swing.JLabel();
        item_im_5 = new javax.swing.JButton();
        item_lore_5 = new javax.swing.JLabel();
        slider_item = new javax.swing.JSlider();
        map = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Knights of the Nights");
        setMaximumSize(new java.awt.Dimension(1100, 662));
        setMinimumSize(new java.awt.Dimension(1100, 662));

        actions10.setMaximumSize(new java.awt.Dimension(373, 392));
        actions10.setMinimumSize(new java.awt.Dimension(373, 392));
        actions10.setPreferredSize(new java.awt.Dimension(373, 392));

        javax.swing.GroupLayout buildingsLayout = new javax.swing.GroupLayout(buildings);
        buildings.setLayout(buildingsLayout);
        buildingsLayout.setHorizontalGroup(
            buildingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 429, Short.MAX_VALUE)
        );
        buildingsLayout.setVerticalGroup(
            buildingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 364, Short.MAX_VALUE)
        );

        actions10.addTab("Buildings", buildings);

        javax.swing.GroupLayout liversLayout = new javax.swing.GroupLayout(livers);
        livers.setLayout(liversLayout);
        liversLayout.setHorizontalGroup(
            liversLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 429, Short.MAX_VALUE)
        );
        liversLayout.setVerticalGroup(
            liversLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 364, Short.MAX_VALUE)
        );

        actions10.addTab("livers", livers);

        item_lore_1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        item_lore_1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        item_lore_1.setMaximumSize(new java.awt.Dimension(300, 64));
        item_lore_1.setMinimumSize(new java.awt.Dimension(300, 64));
        item_lore_1.setPreferredSize(new java.awt.Dimension(300, 64));

        item_im_1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        item_im_1.setContentAreaFilled(false);
        item_im_1.setMaximumSize(new java.awt.Dimension(64, 64));
        item_im_1.setMinimumSize(new java.awt.Dimension(64, 64));
        item_im_1.setPreferredSize(new java.awt.Dimension(64, 64));

        item_lore_2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        item_lore_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        item_lore_2.setMaximumSize(new java.awt.Dimension(300, 64));
        item_lore_2.setMinimumSize(new java.awt.Dimension(300, 64));
        item_lore_2.setPreferredSize(new java.awt.Dimension(300, 64));

        item_im_2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        item_im_2.setContentAreaFilled(false);
        item_im_2.setMaximumSize(new java.awt.Dimension(64, 64));
        item_im_2.setMinimumSize(new java.awt.Dimension(64, 64));
        item_im_2.setPreferredSize(new java.awt.Dimension(64, 64));

        item_im_3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        item_im_3.setContentAreaFilled(false);
        item_im_3.setMaximumSize(new java.awt.Dimension(64, 64));
        item_im_3.setMinimumSize(new java.awt.Dimension(64, 64));
        item_im_3.setPreferredSize(new java.awt.Dimension(64, 64));

        item_lore_3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        item_lore_3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        item_lore_3.setMaximumSize(new java.awt.Dimension(300, 64));
        item_lore_3.setMinimumSize(new java.awt.Dimension(300, 64));
        item_lore_3.setPreferredSize(new java.awt.Dimension(300, 64));

        item_im_4.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        item_im_4.setContentAreaFilled(false);
        item_im_4.setMaximumSize(new java.awt.Dimension(64, 64));
        item_im_4.setMinimumSize(new java.awt.Dimension(64, 64));
        item_im_4.setPreferredSize(new java.awt.Dimension(64, 64));

        item_lore_4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        item_lore_4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        item_lore_4.setMaximumSize(new java.awt.Dimension(300, 64));
        item_lore_4.setMinimumSize(new java.awt.Dimension(300, 64));
        item_lore_4.setPreferredSize(new java.awt.Dimension(300, 64));

        item_im_5.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        item_im_5.setContentAreaFilled(false);
        item_im_5.setMaximumSize(new java.awt.Dimension(64, 64));
        item_im_5.setMinimumSize(new java.awt.Dimension(64, 64));
        item_im_5.setPreferredSize(new java.awt.Dimension(64, 64));

        item_lore_5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        item_lore_5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        item_lore_5.setMaximumSize(new java.awt.Dimension(300, 64));
        item_lore_5.setMinimumSize(new java.awt.Dimension(300, 64));
        item_lore_5.setPreferredSize(new java.awt.Dimension(300, 64));

        slider_item.setMaximum(10);
        slider_item.setOrientation(javax.swing.JSlider.VERTICAL);
        slider_item.setPaintTrack(false);
        slider_item.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        slider_item.setMaximumSize(new java.awt.Dimension(20, 344));
        slider_item.setMinimumSize(new java.awt.Dimension(20, 344));
        slider_item.setOpaque(false);
        slider_item.setPreferredSize(new java.awt.Dimension(20, 344));
        slider_item.setRequestFocusEnabled(false);
        slider_item.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout resourcesLayout = new javax.swing.GroupLayout(resources);
        resources.setLayout(resourcesLayout);
        resourcesLayout.setHorizontalGroup(
            resourcesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resourcesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(resourcesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(resourcesLayout.createSequentialGroup()
                        .addComponent(item_im_4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(item_lore_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(resourcesLayout.createSequentialGroup()
                        .addComponent(item_im_5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(item_lore_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(resourcesLayout.createSequentialGroup()
                        .addComponent(item_im_1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(item_lore_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(resourcesLayout.createSequentialGroup()
                        .addComponent(item_im_2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(item_lore_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(resourcesLayout.createSequentialGroup()
                        .addComponent(item_im_3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(item_lore_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slider_item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        resourcesLayout.setVerticalGroup(
            resourcesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resourcesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(resourcesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(resourcesLayout.createSequentialGroup()
                        .addGroup(resourcesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(item_im_1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(item_lore_1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(resourcesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(item_im_2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(item_lore_2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(resourcesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(item_im_3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(item_lore_3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(resourcesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(item_im_4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(item_lore_4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(resourcesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(item_im_5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(item_lore_5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(slider_item, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        actions10.addTab("Resources", resources);

        map.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        map.setMaximumSize(new java.awt.Dimension(640, 640));
        map.setPreferredSize(new java.awt.Dimension(640, 640));
        map.setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        jPanel1.setMaximumSize(new java.awt.Dimension(360, 262));
        jPanel1.setMinimumSize(new java.awt.Dimension(360, 262));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(map, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(actions10, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(map, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(actions10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane actions10;
    private javax.swing.JTabbedPane actions3;
    private javax.swing.JTabbedPane actions4;
    private javax.swing.JTabbedPane actions5;
    private javax.swing.JTabbedPane actions6;
    private javax.swing.JTabbedPane actions7;
    private javax.swing.JTabbedPane actions8;
    private javax.swing.JTabbedPane actions9;
    private javax.swing.JPanel buildings;
    private javax.swing.JPanel buildings3;
    private javax.swing.JPanel buildings4;
    private javax.swing.JPanel buildings5;
    private javax.swing.JPanel buildings6;
    private javax.swing.JButton item_im_1;
    private javax.swing.JButton item_im_2;
    private javax.swing.JButton item_im_3;
    private javax.swing.JButton item_im_4;
    private javax.swing.JButton item_im_5;
    private javax.swing.JButton item_image_1;
    private javax.swing.JButton item_image_10;
    private javax.swing.JButton item_image_11;
    private javax.swing.JButton item_image_12;
    private javax.swing.JButton item_image_13;
    private javax.swing.JButton item_image_14;
    private javax.swing.JButton item_image_15;
    private javax.swing.JButton item_image_2;
    private javax.swing.JButton item_image_3;
    private javax.swing.JButton item_image_4;
    private javax.swing.JButton item_image_5;
    private javax.swing.JButton item_image_6;
    private javax.swing.JButton item_image_7;
    private javax.swing.JButton item_image_8;
    private javax.swing.JButton item_image_9;
    private javax.swing.JLabel item_lore_1;
    private javax.swing.JLabel item_lore_2;
    private javax.swing.JLabel item_lore_3;
    private javax.swing.JLabel item_lore_4;
    private javax.swing.JLabel item_lore_5;
    private javax.swing.JLabel item_lore_pull_1;
    private javax.swing.JLabel item_lore_pull_10;
    private javax.swing.JLabel item_lore_pull_11;
    private javax.swing.JLabel item_lore_pull_12;
    private javax.swing.JLabel item_lore_pull_13;
    private javax.swing.JLabel item_lore_pull_14;
    private javax.swing.JLabel item_lore_pull_15;
    private javax.swing.JLabel item_lore_pull_2;
    private javax.swing.JLabel item_lore_pull_3;
    private javax.swing.JLabel item_lore_pull_4;
    private javax.swing.JLabel item_lore_pull_5;
    private javax.swing.JLabel item_lore_pull_6;
    private javax.swing.JLabel item_lore_pull_7;
    private javax.swing.JLabel item_lore_pull_8;
    private javax.swing.JLabel item_lore_pull_9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollBar jScrollBar2;
    private javax.swing.JScrollBar jScrollBar3;
    private javax.swing.JPanel livers;
    private javax.swing.JPanel map;
    private javax.swing.JPanel resources;
    private javax.swing.JPanel resources1;
    private javax.swing.JPanel resources2;
    private javax.swing.JPanel resources3;
    private javax.swing.JSlider slider_item;
    // End of variables declaration//GEN-END:variables
}
