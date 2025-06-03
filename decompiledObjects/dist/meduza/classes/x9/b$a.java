package x9;

import g;

public final class b$a
  extends f.a
{
  public Long a;
  public int b;
  
  public final b a()
  {
    String str;
    if (a == null) {
      str = " tokenExpirationTimestamp";
    } else {
      str = "";
    }
    if (str.isEmpty()) {
      return new b(null, a.longValue(), b);
    }
    throw new IllegalStateException(g.d("Missing required properties:", str));
  }
}

/* Location:
 * Qualified Name:     x9.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */