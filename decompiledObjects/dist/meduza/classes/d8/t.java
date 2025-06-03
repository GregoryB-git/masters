package d8;

import f;
import java.lang.annotation.Annotation;

public final class t<T>
{
  public final Class<? extends Annotation> a;
  public final Class<T> b;
  
  public t(Class<? extends Annotation> paramClass, Class<T> paramClass1)
  {
    a = paramClass;
    b = paramClass1;
  }
  
  public static <T> t<T> a(Class<T> paramClass)
  {
    return new t(a.class, paramClass);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (t.class == paramObject.getClass()))
    {
      paramObject = (t)paramObject;
      if (!b.equals(b)) {
        return false;
      }
      return a.equals(a);
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = b.hashCode();
    return a.hashCode() + i * 31;
  }
  
  public final String toString()
  {
    if (a == a.class) {
      return b.getName();
    }
    StringBuilder localStringBuilder = f.l("@");
    localStringBuilder.append(a.getName());
    localStringBuilder.append(" ");
    localStringBuilder.append(b.getName());
    return localStringBuilder.toString();
  }
  
  public static @interface a {}
}

/* Location:
 * Qualified Name:     d8.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */