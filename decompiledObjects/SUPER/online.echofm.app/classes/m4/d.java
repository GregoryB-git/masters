package m4;

import java.lang.annotation.Annotation;

public @interface d
{
  a intEncoding() default a.o;
  
  int tag();
  
  public static enum a
  {
    static
    {
      a locala1 = new a("DEFAULT", 0);
      o = locala1;
      a locala2 = new a("SIGNED", 1);
      p = locala2;
      a locala3 = new a("FIXED", 2);
      q = locala3;
      r = new a[] { locala1, locala2, locala3 };
    }
  }
}

/* Location:
 * Qualified Name:     m4.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */