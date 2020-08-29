/**********************************************
Workshop # 5
Course:JAC444 -Semester 4
Last Name: Chan
First Name: Daryan
ID: 113973192
Section: NAA
This assignment represents my own work in accordance with Seneca Academic Policy.
Signature Daryan Chan
Date: July 2, 2020
**********************************************/

package task1;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AddressBook extends Application{

	ArrayList<String> fname = new ArrayList<String>();
	ArrayList<String> lname = new ArrayList<String>();
	ArrayList<String> city = new ArrayList<String>();
	ArrayList<String> province = new ArrayList<String>();
	ArrayList<String> postalCode = new ArrayList<String>();
	int counter = 0;
	File file;

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Address Book");
		HBox hbox = new HBox(30);
		hbox.setAlignment(Pos.CENTER);
		Button btnAdd = new Button("Add");		
		Button btnFirst = new Button("First");
		Button btnNext = new Button("Next");
		Button btnPrevious = new Button("Previous");
		Button btnLast = new Button("Last");
		Button btnUpdate = new Button("Update");
		hbox.getChildren().addAll(btnAdd, btnFirst, btnNext, btnPrevious, btnLast, btnUpdate);
		
		Label text1 = new Label("First Name:");
		TextField field1 = new TextField();
		
		HBox hbox1 = new HBox(50);
		hbox1.setAlignment(Pos.CENTER);
		hbox1.getChildren().addAll(text1, field1);
		
		Text text2 = new Text("Last Name:");
		TextField field2 = new TextField();
		
		HBox hbox2 = new HBox(50);
		hbox2.setAlignment(Pos.CENTER);
		hbox2.getChildren().addAll(text2, field2);
		
		Text text3 = new Text("City:");
		TextField field3 = new TextField();
		Text text4 = new Text("Province:");
		ChoiceBox<String> field4 = new ChoiceBox();
		field4.setValue("Select Province");
		field4.getItems().addAll("Alberta", "British Columbia", "Ontario", "Quebec");
		
		Text text5 = new Text("Postal Code:");
		TextField field5 = new TextField();
		
		HBox hbox3 = new HBox(50);
		hbox3.setAlignment(Pos.CENTER);
		hbox3.getChildren().addAll(text3, field3, text4, field4, text5, field5);
			
		VBox vbox = new VBox();
		vbox.getChildren().addAll(hbox1, hbox2, hbox3);	
		vbox.setSpacing(30);
		
		BorderPane bpane = new BorderPane();
		bpane.setCenter(vbox);
		bpane.setPadding(new Insets (10, 10, 10, 10));
		bpane.setBottom(hbox);
		bpane.setStyle("-fx-background-color: beige");
		
		Scene scene = new Scene(bpane, 800, 500);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
		//event handling for buttons
		//event handling for when add button is pressed
		btnAdd.setOnAction( e -> storeInfo(field1.getText(), field2.getText(), field3.getText(), field4.getValue(), field5.getText()));
		
		//event handling for when first button is pressed
		btnFirst.setOnAction(e -> {
			field1.setText(fname.get(0));
			field2.setText(lname.get(0));
			field3.setText(city.get(0));
			field4.setValue(province.get(0));
			field5.setText(postalCode.get(0));
			counter = 0;
		});
		
		//event handling for when next button is pressed
		btnNext.setOnAction(e -> {
			counter++;
			field1.setText(fname.get(counter));
			field2.setText(lname.get(counter));
			field3.setText(city.get(counter));
			field4.setValue(province.get(counter));
			field5.setText(postalCode.get(counter));
		});
		
		//event handling for when previous button is pressed
		btnPrevious.setOnAction( e -> {
			counter--;
			field1.setText(fname.get(counter));
			field2.setText(lname.get(counter));
			field3.setText(city.get(counter));
			field4.setValue(province.get(counter));
			field5.setText(postalCode.get(counter));
		});
		
		//event handling for when last button is pressed
		btnLast.setOnAction( e -> {
			field1.setText(fname.get(fname.size()-1));
			field2.setText(lname.get(lname.size()-1));
			field3.setText(city.get(city.size()-1));
			field4.setValue(province.get(province.size()-1));
			field5.setText(postalCode.get(postalCode.size()-1));
		});
		
		//event handling for when update button is pressed
		btnUpdate.setOnAction( e -> {
			fname.set(counter, field1.getText());
			lname.set(counter, field2.getText());
			city.set(counter, field3.getText());
			province.set(counter, field4.getValue());
			postalCode.set(counter, field5.getText());
			
			//writes the updated data into the file
			fileWriting();
		});
	}
	
	public void storeInfo(String firstName, String lastName, String City, String Province, String pcode){
		fname.add(firstName);
		lname.add(lastName);
		city.add(City);
		province.add(Province);
		postalCode.add(pcode);
		System.out.println("name added");
		counter++;
		
		//writes the data into the file
		fileWriting();
	}
	
	private void fileWriting() {
		try {
			file = new File ("AddressBook.txt");
			if (file.createNewFile()) {
				System.out.println("File created");
			}else {
				System.out.println("File already exists.");
			}
		}catch (IOException e) {
				System.out.println("An error occurred.");
				e.printStackTrace();
		}
		
		try {
			RandomAccessFile raf = new RandomAccessFile(file, "rw");
			
			//stores all the fields as one string
			String[] str = new String[fname.size()];
			for (int i = 0; i < fname.size(); i++) {
				str[i] = fname.get(i) + " " + lname.get(i) + " " + city.get(i) + " " + province.get(i) + " ";
			}
			
			//writes the string and postal code to the file
			for (int j = 0; j < fname.size(); j++) {
				raf.write(str[j].getBytes());
				raf.write(postalCode.get(j).getBytes());
				raf.writeBytes("\n"); //adds new line		
			}	
			raf.close();
		}catch(IOException ex){
			System.out.println(ex.toString());
		}		
	}
	
	public static void main(String[] args) {
		launch(args); 
	}

}