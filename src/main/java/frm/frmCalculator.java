/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frm;


/**
 *
 * @author msipc
 */
public class frmCalculator extends javax.swing.JFrame {
    String number1="";
    String number2="";
    boolean isSignNumber1Negative=false;
    boolean isSignNumber2Negative=false;
    String action="s";
    String[] actionList = {"*","/","-","+","%"};
    /**
     * Creates new form frmCalculator
     */
    public frmCalculator() {
        initComponents();
        
        
    }
    public void getNumber(String number){
        String Temp = lblScreen.getText();
        if(number1.isEmpty() || Temp.contains(action)){
            if(number =="0" && Temp.endsWith(action)){
                  lblScreen.setText(Temp);
            }else if (Temp == "0" & number !="0"){
                Temp = number;
                lblScreen.setText(Temp);
            }else if(Temp != "0"){
                Temp += number;
                lblScreen.setText(Temp);
            } 
        }else{
            clear();
            getNumber(number);
        }   
    }
    public void getComma(){
        String Temp = lblScreen.getText();
        if((!number1.contains(".")&& !number1.contains(",") && !number1.isEmpty()) || 
                !(lblScreen.getText().substring(number1.length()).contains("."))){
            if(number1.isEmpty() || Temp.contains(action)){
            if (Temp == "0"){
                Temp = ".";
            }else if(Temp != "0"){
                Temp += ".";
            }
            lblScreen.setText(Temp);
            }
        }
    }
    public void clear(){
        lblScreen.setText("0");
        number1="";
        number2="";
        action="s";
        
    }
    public void remove(){
        String Temp = lblScreen.getText();
        if (Temp == "0"){
            return;
        }else{
            Temp = Temp.substring(0, Temp.length() - 1);
            lblScreen.setText(Temp);
        }
    }
    public boolean isAction(String check){
        for(String actions : actionList ){
            if(check.contains(actions)){
                return true;
            }
        }
        return false;      
    }
    public boolean isEndsWithAction(String check){
        for(String actions : actionList ){
            if(check.endsWith(actions)){
                return true;
            }
        }
        return false;      
    }
    public void setNumber1(String action){
        if(number1.isEmpty()){
            number1=lblScreen.getText();
            this.action = action;
            lblScreen.setText(number1+action);
        }else if(isEndsWithAction(lblScreen.getText())){
            this.action = action;
            lblScreen.setText(number1+action);
            
        }else if(!number1.isEmpty() && number2.isEmpty()){
            this.action = action;
            lblScreen.setText(number1+action);
        }
    }
    public void setNumber2(){
        if(!number1.isEmpty() && !action.isEmpty()){
            number2=lblScreen.getText().substring(number1.length()+1, lblScreen.getText().length());
        }
    }
    public int equalsInt(int number1,int number2,String action){
        int result=0;
        switch (action) {
            case "+":
                result = number1+number2;
                break;
            case "-":
                result = number1-number2;
                break;
            case "*":
                result = number1*number2;
                break;
            case "/":
                result = number1/number2;
                break;
            case "%":
                result = number1%number2;
                break;
            }
        return result;
    }
    public double equalsDouble(double number1,double number2,String action){
        double result=0;
        if(isSignNumber1Negative){
            number1=-number1;
        }
        if(isSignNumber2Negative){
            number2=-number2;
        }
        switch (action) {
            case "+":
                result = number1+number2;
                break;
            case "-":
                result = number1-number2;
                break;
            case "*":
                result = number1*number2;
                break;
            case "/":
                result = number1/number2;
                break;
            case "%":
                result = number1%number2;
                break;
        }
        return result;
    }
    public void equals(){
        if(lblScreen.getText().contains(".")){
            number1=""+equalsDouble(Double.parseDouble(number1),Double.parseDouble(number2),action);
            number2="";     
        }else{
            number1=""+equalsInt(Integer.parseInt(number1),Integer.parseInt(number2),action);
            number2="";
        }
        lblScreen.setText(number1);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnOne = new javax.swing.JButton();
        btnTwo = new javax.swing.JButton();
        btnPlus = new javax.swing.JButton();
        btnThree = new javax.swing.JButton();
        btnZero = new javax.swing.JButton();
        btnFour = new javax.swing.JButton();
        btnComma = new javax.swing.JButton();
        btnFive = new javax.swing.JButton();
        btnSix = new javax.swing.JButton();
        btnNine = new javax.swing.JButton();
        btnSeven = new javax.swing.JButton();
        btnEight = new javax.swing.JButton();
        btnMultiply = new javax.swing.JButton();
        btnPercent = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnEqual = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnPowerofTwo = new javax.swing.JButton();
        btnSquareRoot = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblScreen = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnSign = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnOne.setText("1");
        btnOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOneActionPerformed(evt);
            }
        });

        btnTwo.setText("2");
        btnTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTwoActionPerformed(evt);
            }
        });

        btnPlus.setText("+");
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });

        btnThree.setText("3");
        btnThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThreeActionPerformed(evt);
            }
        });

        btnZero.setText("0");
        btnZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZeroActionPerformed(evt);
            }
        });

        btnFour.setText("4");
        btnFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFourActionPerformed(evt);
            }
        });

        btnComma.setText(",");
        btnComma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommaActionPerformed(evt);
            }
        });

        btnFive.setText("5");
        btnFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiveActionPerformed(evt);
            }
        });

        btnSix.setText("6");
        btnSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSixActionPerformed(evt);
            }
        });

        btnNine.setText("9");
        btnNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNineActionPerformed(evt);
            }
        });

        btnSeven.setText("7");
        btnSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSevenActionPerformed(evt);
            }
        });

        btnEight.setText("8");
        btnEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEightActionPerformed(evt);
            }
        });

        btnMultiply.setText("*");
        btnMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplyActionPerformed(evt);
            }
        });

        btnPercent.setText("%");
        btnPercent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPercentActionPerformed(evt);
            }
        });

        btnDivision.setText("/");
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });

        btnEqual.setText("=");
        btnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualActionPerformed(evt);
            }
        });

        btnMinus.setText("-");
        btnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusActionPerformed(evt);
            }
        });

        btnRemove.setText("C");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnPowerofTwo.setText("x^2");
        btnPowerofTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPowerofTwoActionPerformed(evt);
            }
        });

        btnSquareRoot.setText("√x");
        btnSquareRoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSquareRootActionPerformed(evt);
            }
        });

        btnDelete.setText("Del");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblScreen.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblScreen.setText("0");
        lblScreen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblScreen.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Standart Calculator");

        btnSign.setText("+/-");
        btnSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEight, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNine, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnFour, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFive, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSix, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnSign, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnZero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnOne, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnThree, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnComma, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPowerofTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSquareRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnComma, btnDelete, btnDivision, btnEight, btnEqual, btnFive, btnFour, btnMinus, btnMultiply, btnNine, btnOne, btnPercent, btnPlus, btnPowerofTwo, btnRemove, btnSeven, btnSix, btnSquareRoot, btnThree, btnTwo});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblScreen, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSquareRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPowerofTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEight, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNine, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFour, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFive, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSix, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnOne, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThree, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSign, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnComma, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZeroActionPerformed
        getNumber("0");
    }//GEN-LAST:event_btnZeroActionPerformed

    private void btnTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTwoActionPerformed
        getNumber("2");
    }//GEN-LAST:event_btnTwoActionPerformed

    private void btnOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOneActionPerformed
        getNumber("1");
    }//GEN-LAST:event_btnOneActionPerformed

    private void btnThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThreeActionPerformed
       getNumber("3");
    }//GEN-LAST:event_btnThreeActionPerformed

    private void btnFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFourActionPerformed
        getNumber("4");
    }//GEN-LAST:event_btnFourActionPerformed

    private void btnFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiveActionPerformed
        getNumber("5");
    }//GEN-LAST:event_btnFiveActionPerformed

    private void btnSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSixActionPerformed
        getNumber("6");
    }//GEN-LAST:event_btnSixActionPerformed

    private void btnSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSevenActionPerformed
        getNumber("7");
    }//GEN-LAST:event_btnSevenActionPerformed

    private void btnEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEightActionPerformed
        getNumber("8");
    }//GEN-LAST:event_btnEightActionPerformed

    private void btnNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNineActionPerformed
        getNumber("9");
    }//GEN-LAST:event_btnNineActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        remove();
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        clear();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCommaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommaActionPerformed
        getComma();
        
    }//GEN-LAST:event_btnCommaActionPerformed

    private void btnSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignActionPerformed
        String Temp = lblScreen.getText();
        if(isSignNumber1Negative && !number1.isEmpty()){
            Temp = Temp.substring(1);
        }
        if(number1.isEmpty()){
            if(Temp.startsWith("-")){
                Temp=Temp.substring(1, Temp.length()); 
                isSignNumber1Negative=false;
            }else{
                Temp= "-" + Temp;
                isSignNumber1Negative=true;
            }
            lblScreen.setText(Temp);
        }else if(Temp.contains(action)){
            Temp = lblScreen.getText();
            Temp = Temp.substring(number1.length()+1);
            if(Temp.startsWith("-")){
                Temp=Temp.substring(1, Temp.length()); 
                isSignNumber2Negative=false;
            }else{
                Temp= "-" + Temp;
                isSignNumber2Negative=true;
            }
            lblScreen.setText(number1+action+Temp);
        }
    }//GEN-LAST:event_btnSignActionPerformed

    private void btnMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplyActionPerformed
        setNumber1("*");           
    }//GEN-LAST:event_btnMultiplyActionPerformed

    private void btnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusActionPerformed
        setNumber1("+");
    }//GEN-LAST:event_btnPlusActionPerformed

    private void btnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusActionPerformed
        setNumber1("-");
    }//GEN-LAST:event_btnMinusActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
        setNumber1("/");
    }//GEN-LAST:event_btnDivisionActionPerformed

    private void btnPercentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPercentActionPerformed
        double doubleNumber1=0;
        double doubleNumber2=0;
        String Temp = lblScreen.getText();
        if(Temp.contentEquals("0")){
            clear();
        }else if(number1.isEmpty()){
            doubleNumber1=Double.parseDouble(Temp)/100;
            number1=""+doubleNumber1;
            lblScreen.setText(number1);
        }else if(isAction(Temp) && !isSignNumber1Negative){
            if(Temp.endsWith(action)){
                doubleNumber1=Double.parseDouble(number1);
                doubleNumber2=doubleNumber1/100;     
            }else{
                number2=Temp.substring(number1.length()+1);
                doubleNumber2=Double.parseDouble(number2)/100;
            }
            lblScreen.setText(number1+action+doubleNumber2);
        }else if(isSignNumber1Negative && isAction(Temp.substring(1))){
            number2=Temp.substring(number1.length()+1);
            doubleNumber2=Double.parseDouble(number2)/100;
            lblScreen.setText(number1+action+doubleNumber2);
        }
    }//GEN-LAST:event_btnPercentActionPerformed

    private void btnSquareRootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSquareRootActionPerformed
        double doubleNumber1=0;
        double doubleNumber2=0;
        String Temp = lblScreen.getText();
        if(number1.isEmpty() && Temp.contentEquals("0")){
            clear();
        }else if(!Temp.contentEquals("0")){
            doubleNumber1=Math.sqrt(Double.parseDouble(Temp));
            number1=""+doubleNumber1;
            lblScreen.setText(number1);
        }else if(!isSignNumber1Negative){
            if(Temp.endsWith(action)){
                doubleNumber1=Double.parseDouble(number1);
                doubleNumber2=Math.sqrt(doubleNumber1);                    
            }else{
                number2=Temp.substring(number1.length()+1);
                doubleNumber2=Math.sqrt(Double.parseDouble(number2));
            }
            lblScreen.setText(number1+action+doubleNumber2);
        }else if(isSignNumber1Negative && isAction(Temp.substring(1))){
            number2=Temp.substring(number1.length()+1);
            doubleNumber2=Math.sqrt(Double.parseDouble(number2));
            lblScreen.setText(number1+action+doubleNumber2);
        }
    }//GEN-LAST:event_btnSquareRootActionPerformed

    private void btnPowerofTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPowerofTwoActionPerformed
        double doubleNumber1=0;
        double doubleNumber2=0;
        String Temp = lblScreen.getText();
        if(Temp.contentEquals("0")){
            clear();
        }else if(!Temp.contentEquals("0")){
            doubleNumber1=Math.pow(Double.parseDouble(Temp),2);
            number1=""+doubleNumber1;
            lblScreen.setText(number1);
        }else if(isAction(Temp) && !isSignNumber1Negative){
            if(Temp.endsWith(action)){
                doubleNumber1=Double.parseDouble(number1);
                number1=""+Math.pow(doubleNumber1,2);                    
            }else{
                number2=Temp.substring(number1.length()+1);
                doubleNumber2=Math.pow(Double.parseDouble(number2),2);
            }
            lblScreen.setText(number1+action+doubleNumber2);
        }else if(isSignNumber1Negative && isAction(Temp.substring(1))){
            number2=Temp.substring(number1.length()+1);
            doubleNumber2=Math.pow(Double.parseDouble(number2),2);
            lblScreen.setText(number1+action+doubleNumber2);
        }
    }//GEN-LAST:event_btnPowerofTwoActionPerformed

    private void btnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqualActionPerformed
            setNumber2();
            equals();
            
            
    }//GEN-LAST:event_btnEqualActionPerformed

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
            java.util.logging.Logger.getLogger(frmCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComma;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnEight;
    private javax.swing.JButton btnEqual;
    private javax.swing.JButton btnFive;
    private javax.swing.JButton btnFour;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnMultiply;
    private javax.swing.JButton btnNine;
    private javax.swing.JButton btnOne;
    private javax.swing.JButton btnPercent;
    private javax.swing.JButton btnPlus;
    private javax.swing.JButton btnPowerofTwo;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSeven;
    private javax.swing.JButton btnSign;
    private javax.swing.JButton btnSix;
    private javax.swing.JButton btnSquareRoot;
    private javax.swing.JButton btnThree;
    private javax.swing.JButton btnTwo;
    private javax.swing.JButton btnZero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblScreen;
    // End of variables declaration//GEN-END:variables
}
