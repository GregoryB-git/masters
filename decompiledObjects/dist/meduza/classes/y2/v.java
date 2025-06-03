package y2;

import android.content.Context;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import ec.i;
import g;
import java.util.WeakHashMap;
import o2.j;

public final class v
{
  public static final String a;
  
  static
  {
    String str = j.f("WakeLocks");
    i.d(str, "tagWithPrefix(\"WakeLocks\")");
    a = str;
  }
  
  public static final PowerManager.WakeLock a(Context arg0, String paramString)
  {
    i.e(???, "context");
    i.e(paramString, "tag");
    ??? = ???.getApplicationContext().getSystemService("power");
    i.c(???, "null cannot be cast to non-null type android.os.PowerManager");
    ??? = (PowerManager)???;
    String str = g.d("WorkManager: ", paramString);
    paramString = ???.newWakeLock(1, str);
    synchronized (w.a)
    {
      str = (String)w.b.put(paramString, str);
      i.d(paramString, "wakeLock");
      return paramString;
    }
  }
}

/* Location:
 * Qualified Name:     y2.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */