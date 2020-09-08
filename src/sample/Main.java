package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {
    private Label resutl;
    private Button clrbtn,powbtn,sqrtbtn,dividbtn,savenbtn,eightbtn,ninebtn,multiplybtn,
                    fourbtn,fivebtn, sixbtn,minubtn,onebtn,twobtn,threebtn,plusbtn,unworking1btn,zerobtn,dotbtn,
                    equalbtn;

    private HBox roo1Hbox,roo2Hbox,roo3Hbox,roo4Hbox,roo5Hbox,root6Hbox;
    private VBox root;

    @Override
    public void start(Stage primaryStage) throws Exception{
        //label set
        resutl =new Label("0");
        roo1Hbox=new HBox(20,resutl);
        resutl.setFont(new Font(36));
        roo1Hbox.setAlignment(Pos.CENTER_RIGHT);
        //button setting roo1

        clrbtn=new Button("C");
        clrbtn.setPrefWidth(120);
        clrbtn.setPrefHeight(60);
        powbtn=new Button("X^2");
        powbtn.setPrefHeight(60);
        powbtn.setPrefWidth(120);
        sqrtbtn=new Button("Sqrt");
        sqrtbtn.setPrefWidth(120);
        sqrtbtn.setPrefHeight(60);
        dividbtn=new Button("/");
        dividbtn.setPrefHeight(60);
        dividbtn.setPrefWidth(120);



        roo2Hbox=new HBox(clrbtn,powbtn,sqrtbtn,dividbtn);
        roo2Hbox.setAlignment(Pos.BOTTOM_CENTER);
        //roo2

        savenbtn=new Button("7");
        savenbtn.setPrefWidth(120);
        savenbtn.setPrefHeight(60);
        eightbtn=new Button("8");
        eightbtn.setPrefHeight(60);
        eightbtn.setPrefWidth(120);
        ninebtn=new Button("9");
        ninebtn.setPrefWidth(120);
        ninebtn.setPrefHeight(60);
        multiplybtn=new Button("X");
        multiplybtn.setPrefHeight(60);
        multiplybtn.setPrefWidth(120);
        //roo3 hBox
        roo3Hbox=new HBox(savenbtn,eightbtn,ninebtn,multiplybtn);
        roo3Hbox.setAlignment(Pos.BOTTOM_CENTER);
        //roo4

        fourbtn=new Button("4");
        fourbtn.setPrefWidth(120);
        fourbtn.setPrefHeight(60);
        fivebtn=new Button("5");
        fivebtn.setPrefHeight(60);
        fivebtn.setPrefWidth(120);
        sixbtn=new Button("6");
        sixbtn.setPrefWidth(120);
        sixbtn.setPrefHeight(60);
        minubtn=new Button("-");
        minubtn.setPrefHeight(60);
        minubtn.setPrefWidth(120);

        //roo 4 Hbox
        roo4Hbox=new HBox(fourbtn,fivebtn,sixbtn,minubtn);
        roo4Hbox.setAlignment(Pos.BOTTOM_CENTER);

        //roo5

        onebtn=new Button("1");
        onebtn.setPrefWidth(120);
        onebtn.setPrefHeight(60);
        twobtn=new Button("2");
        twobtn.setPrefHeight(60);
        twobtn.setPrefWidth(120);
        threebtn=new Button("3");
        threebtn.setPrefWidth(120);
        threebtn.setPrefHeight(60);
        plusbtn=new Button("+");
        plusbtn.setPrefHeight(60);
        plusbtn.setPrefWidth(120);
        //Roo 5 Hbox

        roo5Hbox=new HBox(onebtn,twobtn,threebtn,plusbtn);
        roo5Hbox.setAlignment(Pos.BOTTOM_CENTER);

          //Root6
        unworking1btn=new Button("+/-");
        unworking1btn.setPrefWidth(120);
        unworking1btn.setPrefHeight(60);
        zerobtn=new Button("0");
        zerobtn.setPrefHeight(60);
        zerobtn.setPrefWidth(120);
        dotbtn=new Button(".");
        dotbtn.setPrefWidth(120);
        dotbtn.setPrefHeight(60);
        equalbtn=new Button("=");
        equalbtn.setPrefHeight(60);
        equalbtn.setPrefWidth(120);
        //roo6 hbox

        root6Hbox=new HBox(unworking1btn,zerobtn,dotbtn,equalbtn);
        root6Hbox.setAlignment(Pos.BOTTOM_CENTER);

        //set all button on Click Lisner
            getValue setLabValue=new getValue();
            onebtn.setOnAction(setLabValue);
            twobtn.setOnAction(setLabValue);
           threebtn.setOnAction(setLabValue);
           fourbtn.setOnAction(setLabValue);
           fivebtn.setOnAction(setLabValue);
           sixbtn.setOnAction(setLabValue);
           savenbtn.setOnAction(setLabValue);
           eightbtn.setOnAction(setLabValue);
           ninebtn.setOnAction(setLabValue);
           zerobtn.setOnAction(setLabValue);

            //Operating Buttons
           actionPerfrom act=new actionPerfrom();
           dividbtn.setOnAction(act);
           clrbtn.setOnAction(act);
           sqrtbtn.setOnAction(act);
           powbtn.setOnAction(act);
           equalbtn.setOnAction(act);
           multiplybtn.setOnAction(act);
           minubtn.setOnAction(act);
            plusbtn.setOnAction(act);


        //root
        root=new VBox(roo1Hbox,roo2Hbox,roo3Hbox,roo4Hbox,roo5Hbox,root6Hbox);
        Scene scene=new Scene(root,400,350);
        primaryStage.setScene(scene);
        primaryStage.show();



    }
  private  class  getValue implements EventHandler<ActionEvent>{

      @Override
      public void handle(ActionEvent event) {
          if(event.getSource()==savenbtn){
              resutl.setText("7");
          }
          else  if(event.getSource()==eightbtn){
              resutl.setText("8");
          }
          if(event.getSource()==ninebtn){
              resutl.setText("9");
          }
          else  if(event.getSource()==fourbtn){
              resutl.setText("4");
          }
          if(event.getSource()==fivebtn){
              resutl.setText("5");
          }
          else  if(event.getSource()==sixbtn){
              resutl.setText("6");
          }
          if(event.getSource()==onebtn){
              resutl.setText("1");
          }
          else  if(event.getSource()==twobtn){
              resutl.setText("2");
          }
          if(event.getSource()==threebtn){
              resutl.setText("3");
          }
          else  if(event.getSource()==zerobtn){
              resutl.setText("0");
          }
      }
  }

  public class actionPerfrom implements EventHandler<ActionEvent>{
        double  value, num1;
        String str;

      @Override
      public void handle(ActionEvent event) {
          if(event.getSource()==clrbtn){
              resutl.setText("0");
          }
          else if(event.getSource()==powbtn){
               value=getDouble(resutl);
                  value=Math.pow(value,2);
                  resutl.setText(value+"");
          }
          else  if(event.getSource()==sqrtbtn){
               value=getDouble(resutl);
               System.out.println(value);
                    value=Math.sqrt(value);
                    resutl.setText(value+"");
          }

          else  if(event.getSource()==dividbtn){
                     value=getDouble(resutl);
                    resutl.setText(null);
                    str="divid";

          }
          else  if(event.getSource()==multiplybtn){
              value=getDouble(resutl);
              resutl.setText(null);
             str="mul";
          }
          else  if(event.getSource()==minubtn){
              value=getDouble(resutl);
              resutl.setText(null);
              str="minus";
          }
          else if(event.getSource()==plusbtn){
              value=getDouble(resutl);
              resutl.setText(null);
              str="plus";
          }

          else if(event.getSource()==equalbtn){
                  if(str.equals("divid")){
                    num1=getDouble(resutl);
                    String nt=value/num1+ "";
                    if(nt.equalsIgnoreCase("Infinity")){
                        resutl.setText("syntex Error");
                    }
                    else
                    resutl.setText(setLabelReslt(value/num1));

                 }
              else if(str.equals("mul")){
                    num1=getDouble(resutl);
                    resutl.setText(setLabelReslt(value*num1));

                }
              else if(str.equals("minus")){
                      num1=getDouble(resutl);
                      resutl.setText(setLabelReslt(value-num1));
                  }
                  else if(str.equals("plus")){
                      num1=getDouble(resutl);
                      resutl.setText(setLabelReslt(value+num1));
                  }
          }


      }
  }
  public  double getDouble(Label lb){
        return Double.parseDouble(resutl.getText().toString());
  }
  public String setLabelReslt(double value){
    return     value+"";
  }


    public static void main(String[] args) {
        launch(args);
    }
}
