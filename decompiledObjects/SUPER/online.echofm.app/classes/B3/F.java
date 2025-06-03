package B3;

import java.lang.annotation.Annotation;

public final class F
{
  public final Class a;
  public final Class b;
  
  public F(Class paramClass1, Class paramClass2)
  {
    a = paramClass1;
    b = paramClass2;
  }
  
  public static F a(Class paramClass1, Class paramClass2)
  {
    return new F(paramClass1, paramClass2);
  }
  
  public static F b(Class paramClass)
  {
    return new F(a.class, paramClass);
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (F.class == paramObject.getClass()))
    {
      paramObject = (F)paramObject;
      if (!b.equals(b)) {
        return false;
      }
      return a.equals(a);
    }
    return false;
  }
  
  public int hashCode()
  {
    return b.hashCode() * 31 + a.hashCode();
  }
  
  public String toString()
  {
    if (a == a.class) {
      return b.getName();
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("@");
    localStringBuilder.append(a.getName());
    localStringBuilder.append(" ");
    localStringBuilder.append(b.getName());
    return localStringBuilder.toString();
  }
  
  public static @interface a {}
}

/* Location:
 * Qualified Name:     B3.F
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */