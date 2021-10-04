import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
public @interface MyAnotherAnnotation {
    MyAnnotation[] myAnn() default {
        @MyAnnotation (number = 2,year = 2021,dayOfWeek = MyAnnotation.DaysOfWeek.Friday,month =MyAnnotation.Months.April,format = "04.10.21"),
        @MyAnnotation (number = 3,year = 2020,dayOfWeek = MyAnnotation.DaysOfWeek.Thursday,month =MyAnnotation.Months.March,format = "04.11.20") } ;
}
