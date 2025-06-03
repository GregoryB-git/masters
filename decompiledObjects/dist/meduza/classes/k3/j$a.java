package k3;

import g;
import h3.e;

public final class j$a
  extends s.a
{
  public String a;
  public byte[] b;
  public e c;
  
  public final j a()
  {
    String str1;
    if (a == null) {
      str1 = " backendName";
    } else {
      str1 = "";
    }
    String str2 = str1;
    if (c == null) {
      str2 = g.d(str1, " priority");
    }
    if (str2.isEmpty()) {
      return new j(a, b, c);
    }
    throw new IllegalStateException(g.d("Missing required properties:", str2));
  }
  
  public final a b(String paramString)
  {
    if (paramString != null)
    {
      a = paramString;
      return this;
    }
    throw new NullPointerException("Null backendName");
  }
  
  public final a c(e parame)
  {
    if (parame != null)
    {
      c = parame;
      return this;
    }
    throw new NullPointerException("Null priority");
  }
}

/* Location:
 * Qualified Name:     k3.j.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */