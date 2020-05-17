package csci3444.inheritance;

public class TeacherImpl extends PersonBaseImpl implements Teacher {
	String thoughtCourseTitle;
	
	public TeacherImpl (String _name, String _thoughtCourseTitle) {
		super(_name);
		thoughtCourseTitle = _thoughtCourseTitle;
	}
	

	@Override
	public String teachsfor() {
		// TODO Auto-generated method stub
		return thoughtCourseTitle;
	}


	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return "teacher";
	}
	
	
}
