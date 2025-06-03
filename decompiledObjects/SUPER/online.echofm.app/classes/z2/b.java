package z2;

import A2.m;
import y2.a;
import y2.a.d;

public final class b
{
  public final int a;
  public final a b;
  public final a.d c;
  public final String d;
  
  public b(a parama, a.d paramd, String paramString)
  {
    b = parama;
    c = paramd;
    d = paramString;
    a = m.b(new Object[] { parama, paramd, paramString });
  }
  
  public static b a(a parama, a.d paramd, String paramString)
  {
    return new b(parama, paramd, paramString);
  }
  
  public final String b()
  {
    return b.b();
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof b)) {
      return false;
    }
    paramObject = (b)paramObject;
    return (m.a(b, b)) && (m.a(c, c)) && (m.a(d, d));
  }
  
  public final int hashCode()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     z2.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */