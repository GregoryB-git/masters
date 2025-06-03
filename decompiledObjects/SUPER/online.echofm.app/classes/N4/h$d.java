package N4;

import com.google.protobuf.t.a;
import com.google.protobuf.t.b;
import com.google.protobuf.t.c;

public enum h$d
  implements t.a
{
  public static final t.b z = new a();
  public final int o;
  
  static
  {
    d locald1 = new d("HTTP_METHOD_UNKNOWN", 0, 0);
    p = locald1;
    d locald2 = new d("GET", 1, 1);
    q = locald2;
    d locald3 = new d("PUT", 2, 2);
    r = locald3;
    d locald4 = new d("POST", 3, 3);
    s = locald4;
    d locald5 = new d("DELETE", 4, 4);
    t = locald5;
    d locald6 = new d("HEAD", 5, 5);
    u = locald6;
    d locald7 = new d("PATCH", 6, 6);
    v = locald7;
    d locald8 = new d("OPTIONS", 7, 7);
    w = locald8;
    d locald9 = new d("TRACE", 8, 8);
    x = locald9;
    d locald10 = new d("CONNECT", 9, 9);
    y = locald10;
    A = new d[] { locald1, locald2, locald3, locald4, locald5, locald6, locald7, locald8, locald9, locald10 };
  }
  
  public h$d(int paramInt1)
  {
    o = paramInt1;
  }
  
  public static d c(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 9: 
      return y;
    case 8: 
      return x;
    case 7: 
      return w;
    case 6: 
      return v;
    case 5: 
      return u;
    case 4: 
      return t;
    case 3: 
      return s;
    case 2: 
      return r;
    case 1: 
      return q;
    }
    return p;
  }
  
  public static t.c e()
  {
    return b.a;
  }
  
  public final int g()
  {
    return o;
  }
  
  public class a
    implements t.b
  {}
  
  public static final class b
    implements t.c
  {
    public static final t.c a = new b();
  }
}

/* Location:
 * Qualified Name:     N4.h.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */