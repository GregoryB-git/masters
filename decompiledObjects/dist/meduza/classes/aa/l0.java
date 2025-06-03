package aa;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import i7.a;
import java.util.concurrent.TimeUnit;

public final class l0
{
  public static final long a = TimeUnit.MINUTES.toMillis(1L);
  public static final Object b = new Object();
  public static a c;
  
  public static void a(Intent paramIntent)
  {
    synchronized (b)
    {
      if ((c != null) && (paramIntent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)))
      {
        paramIntent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
        c.c();
      }
      return;
    }
  }
  
  public static ComponentName b(Context paramContext, Intent paramIntent)
  {
    synchronized (b)
    {
      if (c == null)
      {
        a locala = new i7/a;
        locala.<init>(paramContext);
        c = locala;
        synchronized (a)
        {
          g = true;
        }
      }
      boolean bool = paramIntent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
      paramIntent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
      paramContext = paramContext.startService(paramIntent);
      if (paramContext == null) {
        return null;
      }
      if (!bool) {
        c.a(a);
      }
      return paramContext;
    }
  }
}

/* Location:
 * Qualified Name:     aa.l0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */