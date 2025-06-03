package ea;

import android.util.Base64;
import ec.i;
import g;
import lc.a;

public final class u
{
  public static final String a;
  public static final String b;
  
  static
  {
    Object localObject = t.b().getBytes(a.a);
    i.d(localObject, "getBytes(...)");
    localObject = Base64.encodeToString((byte[])localObject, 10);
    a = g.e("firebase_session_", (String)localObject, "_data");
    b = g.e("firebase_session_", (String)localObject, "_settings");
  }
}

/* Location:
 * Qualified Name:     ea.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */