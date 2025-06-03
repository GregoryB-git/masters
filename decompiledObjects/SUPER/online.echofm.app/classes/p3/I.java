package p3;

import com.google.crypto.tink.shaded.protobuf.z.a;
import com.google.crypto.tink.shaded.protobuf.z.b;

public enum I
  implements z.a
{
  public static final z.b v = new a();
  public final int o;
  
  static
  {
    I localI1 = new I("UNKNOWN_PREFIX", 0, 0);
    p = localI1;
    I localI2 = new I("TINK", 1, 1);
    q = localI2;
    I localI3 = new I("LEGACY", 2, 2);
    r = localI3;
    I localI4 = new I("RAW", 3, 3);
    s = localI4;
    I localI5 = new I("CRUNCHY", 4, 4);
    t = localI5;
    I localI6 = new I("UNRECOGNIZED", 5, -1);
    u = localI6;
    w = new I[] { localI1, localI2, localI3, localI4, localI5, localI6 };
  }
  
  public I(int paramInt1)
  {
    o = paramInt1;
  }
  
  public static I c(int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2)
        {
          if (paramInt != 3)
          {
            if (paramInt != 4) {
              return null;
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
    if (this != u) {
      return o;
    }
    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
  }
  
  public class a
    implements z.b
  {}
}

/* Location:
 * Qualified Name:     p3.I
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */