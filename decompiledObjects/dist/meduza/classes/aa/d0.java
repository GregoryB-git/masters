package aa;

import android.content.Context;
import android.util.Log;
import java.util.ArrayDeque;

public final class d0
{
  public static d0 e;
  public String a = null;
  public Boolean b = null;
  public Boolean c = null;
  public final ArrayDeque d = new ArrayDeque();
  
  public static d0 a()
  {
    try
    {
      if (e == null)
      {
        locald0 = new aa/d0;
        locald0.<init>();
        e = locald0;
      }
      d0 locald0 = e;
      return locald0;
    }
    finally {}
  }
  
  public final boolean b(Context paramContext)
  {
    if (c == null)
    {
      boolean bool;
      if (paramContext.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
        bool = true;
      } else {
        bool = false;
      }
      c = Boolean.valueOf(bool);
    }
    if ((!b.booleanValue()) && (Log.isLoggable("FirebaseMessaging", 3))) {
      Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
    }
    return c.booleanValue();
  }
  
  public final boolean c(Context paramContext)
  {
    if (b == null)
    {
      boolean bool;
      if (paramContext.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
        bool = true;
      } else {
        bool = false;
      }
      b = Boolean.valueOf(bool);
    }
    if ((!b.booleanValue()) && (Log.isLoggable("FirebaseMessaging", 3))) {
      Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
    }
    return b.booleanValue();
  }
}

/* Location:
 * Qualified Name:     aa.d0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */