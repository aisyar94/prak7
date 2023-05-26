package stadikasus7;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;

public class BookServices extends javax.swing.JFrame {
    
    private String menu = "";
    private ArrayList<String> bookName = new ArrayList<>();
    private ArrayList<String> authorName = new ArrayList<>();
    
    private void changeAllVisible(boolean value){
        fieldbookName.setVisible(value);
        fieldauthorName.setVisible(value);
        fieldid.setVisible(false);
       
        btnset.setVisible(value);
    }
    
    private void changeAllVisibleUpdate(boolean value){
        changeAllVisible(false);
        fieldbookName.setVisible(value);
        btnset.setVisible(value); 
    }
    
    void addBook(){
        bookName.add(fieldbookName.getText());
        authorName.add(fieldauthorName.getText());
    }
    
    void findBookList(){
        DefaultListModel<String> model = new DefaultListModel<>();
        
        for (int i = 0; i < bookName.size(); i++){
            String outputText = "";
            outputText += (i + 1) + ". ";
            outputText += "Nama Buku: " + bookName.get(i) + "' ";
            outputText += "Nama Author: " + authorName.get(i);
            model.addElement(outputText);
        }
        jList1.setModel(model);     
    }
    
    void findBookByID(int i){
        
       DefaultListModel<String> model = new DefaultListModel<>();
       
       String outputText = "";
       outputText += (i) + ". ";
       outputText += "Nama Buku: " + bookName.get(i - 1) + ", ";
       outputText += "Nama Author: " + authorName.get(i - 1);
       model.addElement(outputText);
       
       jList1.setModel(model);
    }
    
    void deleteBook(int i){
        bookName.remove(i - 1);
    }
    
    void changeMenu(String menu){
        this.menu = menu;
    }
    
    void updateBook(){
        int id = Integer.parseInt(fieldid.getText()) - 1;
        bookName.set(id, fieldbookName.getText());
        authorName.set(id, fieldauthorName.getText());
    }
    public BookServices() {
        initComponents();
        changeAllVisible(false);
        panelOutput.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fieldauthorName = new javax.swing.JTextField();
        fieldbookName = new javax.swing.JTextField();
        btnset = new javax.swing.JButton();
        fieldid = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        btnaddBook = new javax.swing.JButton();
        btnupdateBook = new javax.swing.JButton();
        btnfindBookByID = new javax.swing.JButton();
        btndeleteBook = new javax.swing.JButton();
        btnfindBookList = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Perpustakaan Usman Bin Affan");

        fieldauthorName.setText("Author name");
        fieldauthorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldauthorNameActionPerformed(evt);
            }
        });

        fieldbookName.setText("Book name");
        fieldbookName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldbookNameActionPerformed(evt);
            }
        });

        btnset.setText("Set");
        btnset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsetActionPerformed(evt);
            }
        });

        fieldid.setText("ID");
        fieldid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldidActionPerformed(evt);
            }
        });

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        btnaddBook.setText("Add Book");
        btnaddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddBookActionPerformed(evt);
            }
        });

        btnupdateBook.setText("Update Book");
        btnupdateBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateBookActionPerformed(evt);
            }
        });

        btnfindBookByID.setText("Find Book By ID");
        btnfindBookByID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfindBookByIDActionPerformed(evt);
            }
        });

        btndeleteBook.setText("Delete Book");
        btndeleteBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteBookActionPerformed(evt);
            }
        });

        btnfindBookList.setText("Find Book List");
        btnfindBookList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfindBookListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnfindBookByID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnaddBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnupdateBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btndeleteBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnfindBookList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnset)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(fieldbookName, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fieldid, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(fieldauthorName, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fieldauthorName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldbookName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnaddBook, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnset, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                        .addGap(3, 3, 3))
                    .addComponent(btnupdateBook, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(btnfindBookByID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btndeleteBook, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnfindBookList, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnfindBookByIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfindBookByIDActionPerformed
        fieldbookName.setText("ID Book");
        changebookNameVisible(true);
        changeMenu("findBookByID");
        findBookList();
    }//GEN-LAST:event_btnfindBookByIDActionPerformed

    private void btnaddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddBookActionPerformed
        fieldbookName.setText("Book name");
        changebookNameVisible(false);
        changeAllVisible(true);
        changeMenu("add");
    }//GEN-LAST:event_btnaddBookActionPerformed

    private void btnfindBookListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfindBookListActionPerformed
        findBookList();
        changeAllVisible(false);
        changeAllVisible(true);
        changeMenu("add");
    }//GEN-LAST:event_btnfindBookListActionPerformed

    private void fieldidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldidActionPerformed
       
    }//GEN-LAST:event_fieldidActionPerformed

    private void btnupdateBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateBookActionPerformed
        changeAllVisible(false);
        
        changeAllVisibleUpdate(true);
        changeMenu("update");
    }//GEN-LAST:event_btnupdateBookActionPerformed

    private void btndeleteBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteBookActionPerformed
        fieldbookName.setText("ID Book");
        changeAllVisible(false);
        
        changebookNameVisible(true);
        changeMenu("delete");
    }//GEN-LAST:event_btndeleteBookActionPerformed

    private void fieldbookNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldbookNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldbookNameActionPerformed

    private void fieldauthorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldauthorNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldauthorNameActionPerformed

    private void btnsetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsetActionPerformed
        
        switch (menu){
            case "add":
                addBook();
                break;
            case "delete":
                deleteBook(Integer.parseInt(fieldbookName.getText()));
                break;
            case "update":
                updateBook();
                break;
            case "findById":
                findBookByID(Integer.parseInt(fieldbookName.getText()));
                break;
        }
    }//GEN-LAST:event_btnsetActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddBook;
    private javax.swing.JButton btndeleteBook;
    private javax.swing.JButton btnfindBookByID;
    private javax.swing.JButton btnfindBookList;
    private javax.swing.JButton btnset;
    private javax.swing.JButton btnupdateBook;
    private javax.swing.JTextField fieldauthorName;
    private javax.swing.JTextField fieldbookName;
    private javax.swing.JTextField fieldid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
