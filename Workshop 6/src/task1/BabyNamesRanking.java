/**********************************************
Workshop # 6
Course:JAC444 -Semester 4
Last Name: Chan
First Name: Daryan
ID: 113973192
Section: NAA
This assignment represents my own work in accordance with Seneca Academic Policy.
Signature Daryan Chan
Date: July 12, 2020
**********************************************/

package task1;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class BabyNamesRanking extends Application{
	
	Stage window;
	String year = "";
	String name = "";
	char gender;
	int rank = 0;
	boolean isMale = true;
	String name2009, name2010, name2011, name2012, name2013, name2014, name2015, name2016, name2017, name2018;
	String messageToShow = "";
	static ArrayList<String> babynames2009 = new ArrayList<>();
	ArrayList<String> babynames2010 = new ArrayList<>();
	ArrayList<String> babynames2011 = new ArrayList<>();
	ArrayList<String> babynames2012 = new ArrayList<>();
	ArrayList<String> babynames2013 = new ArrayList<>();
	ArrayList<String> babynames2014 = new ArrayList<>();
	ArrayList<String> babynames2015 = new ArrayList<>();
	ArrayList<String> babynames2016 = new ArrayList<>();
	ArrayList<String> babynames2017 = new ArrayList<>();
	ArrayList<String> babynames2018 = new ArrayList<>();
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		window = primaryStage;
		
		primaryStage.setTitle("Baby Book");
		HBox hbox = new HBox(30);
		hbox.setAlignment(Pos.CENTER);
		Button btnSubmit = new Button("Submit Query");		
		Button btnExit =  new Button("Exit");
		hbox.getChildren().addAll(btnSubmit, btnExit);
		
		Label text1 = new Label("Enter the Year:");
		TextField field1 = new TextField();
		
		HBox hbox1 = new HBox();
		hbox1.setAlignment(Pos.CENTER);
		hbox1.getChildren().addAll(text1, field1);
		
		Label text2 = new Label("Enter the Gender:");
		TextField field2 = new TextField();
		
		HBox hbox2 = new HBox();
		hbox2.setAlignment(Pos.CENTER);
		hbox2.getChildren().addAll(text2, field2);
		
		Label text3 = new Label("Enter the Name:");
		TextField field3 = new TextField();
		
		HBox hbox3 = new HBox();
		hbox3.setAlignment(Pos.CENTER);
		hbox3.getChildren().addAll(text3, field3);
		
		//layout 1
		VBox vbox1 = new VBox();
		vbox1.getChildren().addAll(hbox1, hbox2, hbox3, hbox);
		vbox1.setSpacing(30);
		vbox1.setStyle("-fx-background-color: beige");
		
		//layout 2 will show once user enters all information within layout 1
		TextField field4 = new TextField();
		Text field5 = new Text("Do You Want To Search For Another Name?");
		Button btnYes = new Button("Yes");
		Button btnNo = new Button("No");
		HBox hbox4 = new HBox();
		hbox4.getChildren().addAll(btnYes, btnNo);
		hbox4.setAlignment(Pos.CENTER);
		VBox vbox2 = new VBox();
		vbox2.getChildren().addAll(field4, field5, hbox4);
		vbox2.setSpacing(30);
		Scene scene2 = new Scene(vbox2);
		
		//When program runs, the window will show the first layout
		Scene scene1 = new Scene(vbox1);
		window.setScene(scene1);
		window.show();
		
		//event handling when buttons are pressed
		btnSubmit.setOnAction(e -> {
			storeInfo(field1.getText(), field2.getText(), field3.getText());
			window.setScene(scene2);
			field4.setText(messageToShow);
		});
		
		btnExit.setOnAction(e->{
			window.close();
		});
		
		btnYes.setOnAction( e -> {
			window.setScene(scene1);
		});
		
		btnNo.setOnAction( e -> {
			window.close();
		});
	}
	
	public void storeInfo(String Year, String Gender, String Name) {
		
		if (Gender == "male" || Gender == "Male") {
			isMale = true;
		} else if (Gender == "female" || Gender == "Female") {
			isMale = false;
		} else {
			isMale = true;
		}
		
		year = Year;
		name = Name;	
		getRanking(year, name);
		displayInfo();
	}
	
	public void getRanking(String Year, String Name) {
		if (Year.toString().equals("2009")) {
			for (String names : babynames2009) {
				if (names.contains(Name)) {
					name2009 = names;
					rank = babynames2009.indexOf(name2009) + 1;
				}				
			}
		}
	
		if (Year.toString().equals("2010")) {
			for (String names : babynames2010) {
				if (names.contains(Name)) {
					name2010 = names;	
					rank = babynames2010.indexOf(name2010) + 1;
				}
			}
			System.out.println(name2010);
		}
		
		if (Year.toString().equals("2011")) {
			for (String names: babynames2011) {
				if (names.contains(Name)) {
					name2011 = names;
					rank = babynames2011.indexOf(name2011) + 1;
				}
			}
			System.out.println(name2011);
		}
		
		if (Year.toString().equals("2012")) {
			for (String names: babynames2012) {
				if (names.contains(Name)){
					name2012 = names;	
					rank = babynames2012.indexOf(name2012) + 1;
				}
			}
			System.out.println(name2012);
		}
		
		if (Year.toString().equals("2013")) {
			for (String names: babynames2013) {
				if (names.contains(Name)){
					name2013 = names;
					rank = babynames2013.indexOf(name2013) + 1;
				}
			}
			System.out.println(name2013);
		}
		
		if (Year.toString().equals("2014")) {
			for (String names: babynames2014) {
				if (names.contains(Name)){
					name2014 = names;
					rank = babynames2014.indexOf(name2014) + 1;
				}
			}
			System.out.println(name2014);
		}
		
		if (Year.toString().equals("2015")) {
			for (String names: babynames2015) {
				if (names.contains(Name)){
					name2015 = names;
					rank = babynames2015.indexOf(name2015) + 1;
				}
			}
			System.out.println(name2015);
		}
		
		if (Year.toString().equals("2016")) {
			for (String names: babynames2016) {
				if (names.contains(Name)){
					name2016 = names;
					rank = babynames2016.indexOf(name2016) + 1;
				}
			}
			System.out.println(name2016);
		}
		
		if (Year.toString().equals("2017")) {
			for (String names: babynames2017) {
				if (names.contains(Name)){
					name2017 = names;
					rank = babynames2017.indexOf(name2017) + 1;
				}
			}
			System.out.println(name2017);
		}
		
		if (Year.toString().equals("2018")) {
			for (String names: babynames2018) {
				if (names.contains(Name)){
					name2018 = names;
					rank = babynames2018.indexOf(name2018) + 1;
				}
			}
			System.out.println(name2018);
		}	
	}
	
	public void displayInfo() {
		if (isMale) {
			messageToShow = "Boy Name " + name + " is ranked #" + rank + " in " + year + " year";
		} else {
			messageToShow = "Girl Name " + name + " is ranked #" + rank + " in " + year + " year";
		}
	}

	public static void main(String[] args){
		ReadFile rf = new ReadFile();
		rf.copyData();		
		launch(args);
	}
}
