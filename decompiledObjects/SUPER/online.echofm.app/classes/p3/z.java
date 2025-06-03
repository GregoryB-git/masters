package p3;

import com.google.crypto.tink.shaded.protobuf.z.b;

public enum z
  implements com.google.crypto.tink.shaded.protobuf.z.a
{
  public static final z.b u = new a();
  public final int o;
  
  static
  {
    z localz1 = new z("UNKNOWN_STATUS", 0, 0);
    p = localz1;
    z localz2 = new z("ENABLED", 1, 1);
    q = localz2;
    z localz3 = new z("DISABLED", 2, 2);
    r = localz3;
    z localz4 = new z("DESTROYED", 3, 3);
    s = localz4;
    z localz5 = new z("UNRECOGNIZED", 4, -1);
    t = localz5;
    v = new z[] { localz1, localz2, localz3, localz4, localz5 };
  }
  
  public z(int paramInt1)
  {
    o = paramInt1;
  }
  
  public static z c(int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2)
        {
          if (paramInt != 3) {
            return null;
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
    if (this != t) {
      return o;
    }
    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
  }
  
  public class a
    implements z.b
  {}
}

/* Location:
 * Qualified Name:     p3.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */