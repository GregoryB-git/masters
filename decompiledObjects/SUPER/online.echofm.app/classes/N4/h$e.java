package N4;

import com.google.protobuf.t.a;
import com.google.protobuf.t.b;
import com.google.protobuf.t.c;

public enum h$e
  implements t.a
{
  public static final t.b r = new a();
  public final int o;
  
  static
  {
    e locale1 = new e("NETWORK_CLIENT_ERROR_REASON_UNKNOWN", 0, 0);
    p = locale1;
    e locale2 = new e("GENERIC_CLIENT_ERROR", 1, 1);
    q = locale2;
    s = new e[] { locale1, locale2 };
  }
  
  public h$e(int paramInt1)
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
 * Qualified Name:     N4.h.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */