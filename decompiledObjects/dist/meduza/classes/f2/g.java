package f2;

import a0.j;
import dc.l;
import ec.i;
import p2.m0;

public abstract class g<T>
{
  static
  {
    new a();
  }
  
  public static String b(Object paramObject, String paramString)
  {
    i.e(paramObject, "value");
    i.e(paramString, "message");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString);
    localStringBuilder.append(" value: ");
    localStringBuilder.append(paramObject);
    return localStringBuilder.toString();
  }
  
  public abstract T a();
  
  public abstract g<T> c(String paramString, l<? super T, Boolean> paraml);
  
  public static final class a
  {
    public static h a(Object paramObject, int paramInt)
    {
      m0 localm0 = m0.d;
      i.e(paramObject, "<this>");
      j.p(paramInt, "verificationMode");
      return new h(paramObject, paramInt, localm0);
    }
  }
}

/* Location:
 * Qualified Name:     f2.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */