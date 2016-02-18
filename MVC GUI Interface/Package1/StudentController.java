package Package1;

public class StudentController 
{
	private WindowView view;
	private Student model;
	public StudentController(WindowView window)
	{
		window.setWindowListener(new WindowListener(){
			public void buttonClicked(WindowEvent ev)
			{
				model = ev.getStudent();
				model.setName(ev.getStudent().getName());
				model.setId(ev.getStudent().getId());
				System.out.println(ev.getSource());
				System.out.println(ev.getStudent());
				
			}
		});
	}
}
