package gui;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import model.gui.main.Cell;
import resources.images.ImageInstance;
import resources.images.ResourcesImageLoader;
import service.gui.MainService;
import service.gui.impl.MainServiceImpl;
import territory.Territory;
import thread.main.MainThread;

public class Main extends javax.swing.JFrame {

    public static Main posrednic;
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
        thread.start();
        this.posrednic = this;
    }
    
    public Territory getTerritory(){
        return territory;
    }

    public void createBuilding(Cell place, Cell selected) {
        mainService.setImage(place, selected);
    }

    public void slide_items() {
        item_im_0.setIcon(new ImageIcon("C:\\Users\\1\\Documents\\NetBeansProjects\\Knights-of-the-Nights\\src\\resources\\images\\resources\\id_" + slider_item.getValue() + ".png"));
        item_im_1.setIcon(new ImageIcon("C:\\Users\\1\\Documents\\NetBeansProjects\\Knights-of-the-Nights\\src\\resources\\images\\resources\\id_" + (slider_item.getValue() + 1) + ".png"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        actions = new javax.swing.JTabbedPane();
        buildings = new javax.swing.JPanel();
        livers = new javax.swing.JPanel();
        resources = new javax.swing.JPanel();
        item_im_0 = new javax.swing.JButton();
        item_im_1 = new javax.swing.JButton();
        item_im_2 = new javax.swing.JButton();
        item_im_3 = new javax.swing.JButton();
        item_im_4 = new javax.swing.JButton();
        item_im_5 = new javax.swing.JButton();
        item_im_6 = new javax.swing.JButton();
        item_im_7 = new javax.swing.JButton();
        item_im_8 = new javax.swing.JButton();
        item_im_9 = new javax.swing.JButton();
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

        actions.setMaximumSize(new java.awt.Dimension(380, 185));
        actions.setMinimumSize(new java.awt.Dimension(380, 185));
        actions.setPreferredSize(new java.awt.Dimension(380, 185));

        javax.swing.GroupLayout buildingsLayout = new javax.swing.GroupLayout(buildings);
        buildings.setLayout(buildingsLayout);
        buildingsLayout.setHorizontalGroup(
            buildingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
        );
        buildingsLayout.setVerticalGroup(
            buildingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 203, Short.MAX_VALUE)
        );

        actions.addTab("Buildings", buildings);

        javax.swing.GroupLayout liversLayout = new javax.swing.GroupLayout(livers);
        livers.setLayout(liversLayout);
        liversLayout.setHorizontalGroup(
            liversLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
        );
        liversLayout.setVerticalGroup(
            liversLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 203, Short.MAX_VALUE)
        );

        actions.addTab("livers", livers);

        item_im_0.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        item_im_0.setContentAreaFilled(false);
        item_im_0.setMaximumSize(new java.awt.Dimension(64, 64));
        item_im_0.setMinimumSize(new java.awt.Dimension(64, 64));
        item_im_0.setPreferredSize(new java.awt.Dimension(64, 64));

        item_im_1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        item_im_1.setContentAreaFilled(false);
        item_im_1.setMaximumSize(new java.awt.Dimension(64, 64));
        item_im_1.setMinimumSize(new java.awt.Dimension(64, 64));
        item_im_1.setPreferredSize(new java.awt.Dimension(64, 64));

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

        item_im_4.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        item_im_4.setContentAreaFilled(false);
        item_im_4.setMaximumSize(new java.awt.Dimension(64, 64));
        item_im_4.setMinimumSize(new java.awt.Dimension(64, 64));
        item_im_4.setPreferredSize(new java.awt.Dimension(64, 64));

        item_im_5.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        item_im_5.setContentAreaFilled(false);
        item_im_5.setMaximumSize(new java.awt.Dimension(64, 64));
        item_im_5.setMinimumSize(new java.awt.Dimension(64, 64));
        item_im_5.setPreferredSize(new java.awt.Dimension(64, 64));

        item_im_6.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        item_im_6.setContentAreaFilled(false);
        item_im_6.setMaximumSize(new java.awt.Dimension(64, 64));
        item_im_6.setMinimumSize(new java.awt.Dimension(64, 64));
        item_im_6.setPreferredSize(new java.awt.Dimension(64, 64));

        item_im_7.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        item_im_7.setContentAreaFilled(false);
        item_im_7.setMaximumSize(new java.awt.Dimension(64, 64));
        item_im_7.setMinimumSize(new java.awt.Dimension(64, 64));
        item_im_7.setPreferredSize(new java.awt.Dimension(64, 64));

        item_im_8.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        item_im_8.setContentAreaFilled(false);
        item_im_8.setMaximumSize(new java.awt.Dimension(64, 64));
        item_im_8.setMinimumSize(new java.awt.Dimension(64, 64));
        item_im_8.setPreferredSize(new java.awt.Dimension(64, 64));

        item_im_9.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        item_im_9.setContentAreaFilled(false);
        item_im_9.setMaximumSize(new java.awt.Dimension(64, 64));
        item_im_9.setMinimumSize(new java.awt.Dimension(64, 64));
        item_im_9.setPreferredSize(new java.awt.Dimension(64, 64));

        slider_item.setMaximum(10);
        slider_item.setPaintTicks(true);
        slider_item.setValue(0);
        slider_item.setMaximumSize(new java.awt.Dimension(356, 40));
        slider_item.setMinimumSize(new java.awt.Dimension(356, 40));
        slider_item.setOpaque(false);
        slider_item.setPreferredSize(new java.awt.Dimension(356, 40));
        slider_item.setRequestFocusEnabled(false);
        slider_item.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout resourcesLayout = new javax.swing.GroupLayout(resources);
        resources.setLayout(resourcesLayout);
        resourcesLayout.setHorizontalGroup(
            resourcesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resourcesLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(resourcesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(resourcesLayout.createSequentialGroup()
                        .addComponent(item_im_5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(item_im_6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(item_im_7, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(item_im_8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(item_im_9, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(resourcesLayout.createSequentialGroup()
                        .addComponent(item_im_0, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(item_im_1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(item_im_2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(item_im_3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(item_im_4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(slider_item, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        resourcesLayout.setVerticalGroup(
            resourcesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resourcesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(resourcesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(item_im_0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item_im_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item_im_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item_im_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item_im_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(resourcesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(item_im_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item_im_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item_im_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item_im_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item_im_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(slider_item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        actions.addTab("Resources", resources);

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
                .addGap(0, 332, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(map, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(actions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(map, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(actions, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane actions;
    private javax.swing.JPanel buildings;
    private javax.swing.JButton item_im_0;
    private javax.swing.JButton item_im_1;
    private javax.swing.JButton item_im_2;
    private javax.swing.JButton item_im_3;
    private javax.swing.JButton item_im_4;
    private javax.swing.JButton item_im_5;
    private javax.swing.JButton item_im_6;
    private javax.swing.JButton item_im_7;
    private javax.swing.JButton item_im_8;
    private javax.swing.JButton item_im_9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel livers;
    private javax.swing.JPanel map;
    private javax.swing.JPanel resources;
    private javax.swing.JSlider slider_item;
    // End of variables declaration//GEN-END:variables
}