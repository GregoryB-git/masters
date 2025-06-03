package p3;

import com.google.crypto.tink.shaded.protobuf.z.a;
import com.google.crypto.tink.shaded.protobuf.z.b;

public enum y$c
  implements z.a
{
  public static final z.b v = new a();
  public final int o;
  
  static
  {
    c localc1 = new c("UNKNOWN_KEYMATERIAL", 0, 0);
    p = localc1;
    c localc2 = new c("SYMMETRIC", 1, 1);
    q = localc2;
    c localc3 = new c("ASYMMETRIC_PRIVATE", 2, 2);
    r = localc3;
    c localc4 = new c("ASYMMETRIC_PUBLIC", 3, 3);
    s = localc4;
    c localc5 = new c("REMOTE", 4, 4);
    t = localc5;
    c localc6 = new c("UNRECOGNIZED", 5, -1);
    u = localc6;
    w = new c[] { localc1, localc2, localc3, localc4, localc5, localc6 };
  }
  
  public y$c(int paramInt1)
  {
    o = paramInt1;
  }
  
  public static c c(int paramInt)
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
 * Qualified Name:     p3.y.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */