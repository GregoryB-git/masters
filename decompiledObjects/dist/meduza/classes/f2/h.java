package f2;

import dc.l;
import ec.i;

public final class h<T>
  extends g<T>
{
  public final T a;
  public final String b;
  public final int c;
  public final f d;
  
  public h(Object paramObject, int paramInt, f paramf)
  {
    a = paramObject;
    b = "a";
    c = paramInt;
    d = paramf;
  }
  
  public final T a()
  {
    return (T)a;
  }
  
  public final g<T> c(String paramString, l<? super T, Boolean> paraml)
  {
    i.e(paraml, "condition");
    if (((Boolean)paraml.invoke(a)).booleanValue()) {
      paramString = this;
    } else {
      paramString = new e(a, b, paramString, d, c);
    }
    return paramString;
  }
}

/* Location:
 * Qualified Name:     f2.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */