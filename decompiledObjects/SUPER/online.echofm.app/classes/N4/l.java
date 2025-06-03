package N4;

import com.google.protobuf.t.a;
import com.google.protobuf.t.b;
import com.google.protobuf.t.c;

public enum l
  implements t.a
{
  public static final t.b r = new a();
  public final int o;
  
  static
  {
    l locall1 = new l("SESSION_VERBOSITY_NONE", 0, 0);
    p = locall1;
    l locall2 = new l("GAUGES_AND_SYSTEM_EVENTS", 1, 1);
    q = locall2;
    s = new l[] { locall1, locall2 };
  }
  
  public l(int paramInt1)
  {
    o = paramInt1;
  }
  
  public static l c(int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1) {
        return null;
      }
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
 * Qualified Name:     N4.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */