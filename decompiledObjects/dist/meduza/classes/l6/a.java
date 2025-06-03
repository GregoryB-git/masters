package l6;

import java.util.Arrays;
import k6.a.d;
import m6.h;

public final class a<O extends a.d>
{
  public final int a;
  public final k6.a b;
  public final a.d c;
  public final String d;
  
  public a(k6.a parama, a.d paramd, String paramString)
  {
    b = parama;
    c = paramd;
    d = paramString;
    a = Arrays.hashCode(new Object[] { parama, paramd, paramString });
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof a)) {
      return false;
    }
    paramObject = (a)paramObject;
    return (h.a(b, b)) && (h.a(c, c)) && (h.a(d, d));
  }
  
  public final int hashCode()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     l6.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */