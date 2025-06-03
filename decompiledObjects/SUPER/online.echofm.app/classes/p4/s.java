package p4;

import android.content.Context;
import android.util.Log;

public class s
{
  public static s c;
  public Boolean a = null;
  public Boolean b = null;
  
  public static s a()
  {
    try
    {
      if (c == null)
      {
        s locals1 = new p4/s;
        locals1.<init>();
        c = locals1;
      }
    }
    finally
    {
      break label37;
    }
    s locals2 = c;
    return locals2;
    label37:
    throw locals2;
  }
  
  public boolean b(Context paramContext)
  {
    if (b == null)
    {
      boolean bool;
      if (paramContext.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
        bool = true;
      } else {
        bool = false;
      }
      b = Boolean.valueOf(bool);
    }
    if ((!a.booleanValue()) && (Log.isLoggable("FirebaseInstanceId", 3))) {
      Log.d("FirebaseInstanceId", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
    }
    return b.booleanValue();
  }
  
  public boolean c(Context paramContext)
  {
    if (a == null)
    {
      boolean bool;
      if (paramContext.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
        bool = true;
      } else {
        bool = false;
      }
      a = Boolean.valueOf(bool);
    }
    if ((!a.booleanValue()) && (Log.isLoggable("FirebaseInstanceId", 3))) {
      Log.d("FirebaseInstanceId", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
    }
    return a.booleanValue();
  }
}

/* Location:
 * Qualified Name:     p4.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */