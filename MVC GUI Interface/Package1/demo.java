package Package1;

import javafx.application.Application;
import javafx.stage.Stage;

public class demo
{
	@Override
	public void start(Stage stage) throws Exception
	{
		WindowView window = new WindowView(stage);
		StudentController controller = new StudentController(window);
	}
}
