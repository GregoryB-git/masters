package E;

import android.os.LocaleList;
import java.util.Locale;

public final class o
  implements i
{
  public final LocaleList a;
  
  public o(Object paramObject)
  {
    a = n.a(paramObject);
  }
  
  public Object a()
  {
    return a;
  }
  
  public boolean equals(Object paramObject)
  {
    return j.a(a, ((i)paramObject).a());
  }
  
  public Locale get(int paramInt)
  {
    return l.a(a, paramInt);
  }
  
  public int hashCode()
  {
    return m.a(a);
  }
  
  public String toString()
  {
    return k.a(a);
  }
}

/* Location:
 * Qualified Name:     E.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */