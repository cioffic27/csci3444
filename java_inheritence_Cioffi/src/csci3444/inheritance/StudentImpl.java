package csci3444.inheritance;

public class StudentImpl extends PersonBaseImpl implements Student{

	String takenCourseTitle;
	
	public StudentImpl (String _name, String _takenCourseTitle) {
	name =_name;
	takenCourseTitle= _takenCourseTitle;
	
	}

	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return "student";
	}

	@Override
	public String studiesFor() {
		// TODO Auto-generated method stub
		return takenCourseTitle;
	}

	
}
