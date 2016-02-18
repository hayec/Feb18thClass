package Package1;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
public class WindowView 
{
	private Label lblName;
	private Label lblID;
	private Button btnOK;
	private TextField txtID;
	private TextField txtName;
	private HBox pane;
	private WindowListener windowListener;
	private Stage stage;
	public WindowView(Stage stage)
	{
		this.stage = stage;
		lblName = new Label("Name : ");
		lblName.setAlignment(Pos.CENTER_RIGHT);
		lblID = new Label("ID# : ");
		lblID.setAlignment(Pos.CENTER_RIGHT);
		btnOK = new Button("OK");
		txtName = new TextField();
		txtID = new TextField();
		pane = new HBox(30);
		pane.setAlignment(Pos.CENTER);
		btnOK.setOnAction(event -> {
			String name = txtName.getText();
			String id = txtID.getText();
			WindowEvent ev = new WindowEvent(this, new Student(name, id));
			if(windowListener != null)
				windowListener.buttonClicked(ev);
		});
		pane.getChildren().addAll(lblName, txtName, lblID, txtID, btnOK);
		stage.setScene(new Scene(pane, 600, 100));
		stage.show();
	}
	public void setWindowListener(WindowListener windowListener)
	{
		this.windowListener = windowListener;
	}
}