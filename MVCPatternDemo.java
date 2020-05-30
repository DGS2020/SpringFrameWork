public class MVCPatternDemo {
   public static void main(String[] args) {

      //fetch student record based on his roll no from the database
      ModelClass model  = retriveStudentFromDatabase();

      //Create a view : to write student details on console
      ViewClass view = new ViewClass();

      ControllerClass controller = new ControllerClass(view, model);

      controller.updateStudent();

      //update model data
      controller.setStudentName("Gopinath");
      controller.setStudentID("102");
      controller.setStudentAddress("Mumbai");

      controller.updateStudent();
   }

   private static ModelClass retriveStudentFromDatabase(){
	   ModelClass student = new ModelClass();
      student.setStudentID("101");
      student.setStudentName("Sutharsanan");
      student.setStudentAddress("Chennai");
      return student;
   }
}