package N4;

import com.google.protobuf.t.a;
import com.google.protobuf.t.b;
import com.google.protobuf.t.c;

public enum n$c
  implements t.a
{
  public static final t.b r = new a();
  public final int o;
  
  static
  {
    c localc1 = new c("SOURCE_UNKNOWN", 0, 0);
    p = localc1;
    c localc2 = new c("FL_LEGACY_V1", 1, 1);
    q = localc2;
    s = new c[] { localc1, localc2 };
  }
  
  public n$c(int paramInt1)
  {
    o = paramInt1;
  }
  
  public static t.c c()
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
 * Qualified Name:     N4.n.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */