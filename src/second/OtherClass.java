package second;
import first.SomeClass;

public class OtherClass{
   private SomeClass someClass;
   public OtherClass(){
      someClass = new SomeClass("Other");
   }

   public String toString(){
      return "Other class with "+this.someClass.toString();
   }
}
