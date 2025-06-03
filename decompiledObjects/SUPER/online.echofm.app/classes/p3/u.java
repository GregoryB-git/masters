package p3;

import com.google.crypto.tink.shaded.protobuf.z.a;
import com.google.crypto.tink.shaded.protobuf.z.b;

public enum u
  implements z.a
{
  public static final z.b w = new a();
  public final int o;
  
  static
  {
    u localu1 = new u("UNKNOWN_HASH", 0, 0);
    p = localu1;
    u localu2 = new u("SHA1", 1, 1);
    q = localu2;
    u localu3 = new u("SHA384", 2, 2);
    r = localu3;
    u localu4 = new u("SHA256", 3, 3);
    s = localu4;
    u localu5 = new u("SHA512", 4, 4);
    t = localu5;
    u localu6 = new u("SHA224", 5, 5);
    u = localu6;
    u localu7 = new u("UNRECOGNIZED", 6, -1);
    v = localu7;
    x = new u[] { localu1, localu2, localu3, localu4, localu5, localu6, localu7 };
  }
  
  public u(int paramInt1)
  {
    o = paramInt1;
  }
  
  public static u c(int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2)
        {
          if (paramInt != 3)
          {
            if (paramInt != 4)
            {
              if (paramInt != 5) {
                return null;
              }
              return u;
            }
            return t;
          }
          return s;
        }
        return r;
      }
      return q;
    }
    return p;
  }
  
  public final int g()
  {
    if (this != v) {
      return o;
    }
    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
  }
  
  public class a
    implements z.b
  {}
}

/* Location:
 * Qualified Name:     p3.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */