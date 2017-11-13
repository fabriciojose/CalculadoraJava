/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadorajavagethub;


import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author fabricio.barrozo
 */
public class FXMLDocumentController implements Initializable {
    
    int countButtonNumber = 1; // para na primeira vez lançar o número e na segunda lançar o número mais o que estava na saída exit1
    int countButtonOperator; // para descobrir qual operador foi  solicitato + - x dividido...
    float numberOne;
    float numberTwo;
    
    
    @FXML
    private Label label;
    @FXML
    private TextField exit1;
    @FXML
    private TextField exit2;
    
    
    @FXML
    private void btn0(ActionEvent event) {
        exit1.setText(exit1.getText() + "0");
    }
    @FXML
    private void btn1(ActionEvent event) {
        if (countButtonNumber == 1) { // contador para adicionar somente o número 1
            exit1.setText("1");
            exit2.setText(exit2.getText() + "1");
        }else{ 
            exit1.setText(exit1.getText() + "1"); // para adicionar o 1 mais o que tinha antes
            exit2.setText(exit2.getText() + "1"); 
        } 
        countButtonNumber = 2;
    }
    @FXML
    private void btn2(ActionEvent event) {
        if (countButtonNumber == 1) { // contador para adicionar somente o número 1
            exit1.setText("2");
            exit2.setText(exit2.getText() + "2");
        }else{ 
            exit1.setText(exit1.getText() + "2"); // para adicionar o 1 mais o que tinha antes
            exit2.setText(exit2.getText() + "2"); 
        } 
        countButtonNumber = 2;
    }
    @FXML
    private void btn3(ActionEvent event) {
        if (countButtonNumber == 1) { // contador para adicionar somente o número específico
            exit1.setText("3");
            exit2.setText(exit2.getText() + "3");
        }else{ 
            exit1.setText(exit1.getText() + "3"); // para adicionar o 1 mais o que tinha antes
            exit2.setText(exit2.getText() + "3"); 
        } 
        countButtonNumber = 2;
        
    }
    @FXML
    private void btn4(ActionEvent event) {
        if (countButtonNumber == 1) { // contador para adicionar somente o número específico
            exit1.setText("4");
            exit2.setText(exit2.getText() + "4");
        }else{ 
            exit1.setText(exit1.getText() + "4"); // para adicionar o 1 mais o que tinha antes
            exit2.setText(exit2.getText() + "4"); 
        } 
        countButtonNumber = 2;
    }
    @FXML
    private void btn5(ActionEvent event) {
        if (countButtonNumber == 1) { // contador para adicionar somente o número específico
            exit1.setText("5");
            exit2.setText(exit2.getText() + "5");
        }else{ 
            exit1.setText(exit1.getText() + "5"); // para adicionar o 1 mais o que tinha antes
            exit2.setText(exit2.getText() + "5"); 
        } 
        countButtonNumber = 2;
    }
    @FXML
    private void btn6(ActionEvent event) {
        if (countButtonNumber == 1) { // contador para adicionar somente o número específico
            exit1.setText("6");
            exit2.setText(exit2.getText() + "6");
        }else{ 
            exit1.setText(exit1.getText() + "6"); // para adicionar o 1 mais o que tinha antes
            exit2.setText(exit2.getText() + "6"); 
        } 
        countButtonNumber = 2;
    }
    @FXML
    private void btn7(ActionEvent event) {
        if (countButtonNumber == 1) { // contador para adicionar somente o número específico
            exit1.setText("7");
            exit2.setText(exit2.getText() + "7");
        }else{ 
            exit1.setText(exit1.getText() + "7"); // para adicionar o 1 mais o que tinha antes
            exit2.setText(exit2.getText() + "7"); 
        } 
        countButtonNumber = 2;
    }
    @FXML
    private void btn8(ActionEvent event) {
       if (countButtonNumber == 1) { // contador para adicionar somente o número específico
            exit1.setText("8");
            exit2.setText(exit2.getText() + "8");
        }else{ 
            exit1.setText(exit1.getText() + "8"); // para adicionar o 1 mais o que tinha antes
            exit2.setText(exit2.getText() + "8"); 
        } 
        countButtonNumber = 2;    
    }
    @FXML
    private void btn9(ActionEvent event) {
        if (countButtonNumber == 1) { // contador para adicionar somente o número específico
            exit1.setText("9");
            exit2.setText(exit2.getText() + "9");
        }else{ 
            exit1.setText(exit1.getText() + "9"); // para adicionar o 1 mais o que tinha antes
            exit2.setText(exit2.getText() + "9"); 
        } 
        countButtonNumber = 2;
    }
    @FXML
    private void btnC(ActionEvent event){
        exit1.setText("");
        exit2.setText("");
        countButtonNumber = 1;
    }
    
    @FXML
    private void btnSum (ActionEvent event){ 
        String strGetNumberSum = exit1.getText();
        try { // para verificar a excessão do exit1 vazio, que não deixa fazer a conversão toCharArray
           char cNumberSum [] = strGetNumberSum.toCharArray(); // transformar uma array de char e verificar se é digito
           if (Character.isDigit(cNumberSum[0])){
                numberOne = Float.parseFloat(exit1.getText()); // obter o primeiro número da equação e imprimir "+"
                exit2.setText(exit1.getText() + " + "); // adionar na saída exit2 o "+"
                exit1.setText("+"); // adicionar o sinal mais na saida exit1
           }
        } catch (Exception e){ // caso haja exceção, como "empty", imprimir na saída exit1 e exit2 "+"
                exit1.setText("+"); 
        }
        countButtonNumber = 1; // contador para o próximo número não vir com o sinal da soma ou outro
        countButtonOperator = 1;        
        
    }
    @FXML
    private void btnSub (ActionEvent event){
        String strGetNumberSub = exit1.getText();
        if (strGetNumberSub.isEmpty() ) { // caso esteja vazio o exti1, imprima o "-"
            exit1.setText("-");
        }
        else if (strGetNumberSub.equals("-")){ // caso já haja no  exit1 o sinal "-", reescreva o sinal "-"
            exit1.setText("-"); 
        } 
        else {
            numberOne = Float.parseFloat(exit1.getText()); // obter o primeiro número da equação e imprimir "-"
            exit2.setText(exit1.getText() + " - ");
            exit1.setText("-"); 
        }   
        countButtonNumber = 1; // contador para o próximo número não vir com o sinal da soma ou outro
        countButtonOperator = 2; 
    }
    
    @FXML
    private void btnDiv (ActionEvent event){
        String strGetNumberDiv = exit1.getText();
        if (strGetNumberDiv.isEmpty() ) { // caso esteja vazio o exti1, imprima o "÷"
            exit1.setText("÷");
        }
        else if (strGetNumberDiv.equals("÷")){ // caso já haja no  exit1 o sinal "÷", reescreva o sinal "÷"
            exit1.setText("÷"); 
        } 
        else {
            numberOne = Float.parseFloat(exit1.getText()); // obter o primeiro número da equação e imprimir "÷"
            exit2.setText(exit1.getText() + " ÷ ");
            exit1.setText("÷"); 
        }   
        countButtonNumber = 1; // contador para o próximo número não vir com o sinal da soma ou outro
        countButtonOperator = 3; 
    }
    
    @FXML
    private void btnMult (ActionEvent event){
        String strGetNumberMult = exit1.getText();
        if (strGetNumberMult.isEmpty() ) { // caso esteja vazio o exti1, imprima o "x"
            exit1.setText("x");
        }
        else if (strGetNumberMult.equals("x")){ // caso já haja no  exit1 o sinal "x", reescreva o sinal "x"
            exit1.setText("x"); 
        } 
        else {
            numberOne = Float.parseFloat(exit1.getText()); // obter o primeiro número da equação e imprimir "x"
            exit2.setText(exit1.getText() + " x ");
            exit1.setText("x"); 
        }   
        countButtonNumber = 1; // contador para o próximo número não vir com o sinal da soma ou outro
        countButtonOperator = 4; 
    }
    
     @FXML
    private void btnEqual (ActionEvent event){
        numberTwo = Float.parseFloat(exit1.getText()); // obter o primeiro número da equação
        exit2.setText(exit2.getText() + " = ");
        if (countButtonOperator == 1){
            exit1.setText(String.valueOf(numberOne + numberTwo)); // imprimir 
        }
        if (countButtonOperator == 2){
            exit1.setText(String.valueOf(numberOne - numberTwo)); // imprimir 
        }
        if (countButtonOperator == 3){
            exit1.setText(String.valueOf(numberOne / numberTwo)); // imprimir 
        }
        if (countButtonOperator == 4){
            exit1.setText(String.valueOf(numberOne * numberTwo)); // imprimir 
        }
        
        countButtonNumber = 1; // contador para o próximo número não vir com o sinal da soma ou outro
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
