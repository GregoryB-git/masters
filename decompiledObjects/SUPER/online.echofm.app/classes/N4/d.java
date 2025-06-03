package N4;

import com.google.protobuf.t.a;
import com.google.protobuf.t.b;
import com.google.protobuf.t.c;

public enum d
  implements t.a
{
  public static final t.b t = new a();
  public final int o;
  
  static
  {
    d locald1 = new d("APPLICATION_PROCESS_STATE_UNKNOWN", 0, 0);
    p = locald1;
    d locald2 = new d("FOREGROUND", 1, 1);
    q = locald2;
    d locald3 = new d("BACKGROUND", 2, 2);
    r = locald3;
    d locald4 = new d("FOREGROUND_BACKGROUND", 3, 3);
    s = locald4;
    u = new d[] { locald1, locald2, locald3, locald4 };
  }
  
  public d(int paramInt1)
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
 * Qualified Name:     N4.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */