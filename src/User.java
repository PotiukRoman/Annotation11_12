public class User {
    @MyAnotherAnnotation()
    String name;

   @MyAnnotation(number = 1, year = 2021,dayOfWeek = MyAnnotation.DaysOfWeek.Wednesday,month = MyAnnotation.Months.November,format = "04.10.21")
    public void show(){
        //show something
    }
}
