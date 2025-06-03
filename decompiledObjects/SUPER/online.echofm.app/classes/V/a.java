package V;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.SparseArray;

public abstract class a
  extends BroadcastReceiver
{
  public static final SparseArray o = new SparseArray();
  public static int p = 1;
  
  public static boolean b(Intent arg0)
  {
    int i = ???.getIntExtra("androidx.contentpager.content.wakelockid", 0);
    if (i == 0) {
      return false;
    }
    StringBuilder localStringBuilder;
    synchronized (o)
    {
      PowerManager.WakeLock localWakeLock = (PowerManager.WakeLock)???.get(i);
      if (localWakeLock != null)
      {
        localWakeLock.release();
        ???.remove(i);
        return true;
      }
    }
  }
  
  public static ComponentName c(Context paramContext, Intent paramIntent)
  {
    int i;
    synchronized (o)
    {
      i = p;
      int j = i + 1;
      p = j;
      if (j <= 0) {
        p = 1;
      }
    }
    paramIntent.putExtra("androidx.contentpager.content.wakelockid", i);
    paramIntent = paramContext.startService(paramIntent);
    if (paramIntent == null) {
      return null;
    }
    PowerManager localPowerManager = (PowerManager)paramContext.getSystemService("power");
    paramContext = new java/lang/StringBuilder;
    paramContext.<init>();
    paramContext.append("androidx.core:wake:");
    paramContext.append(paramIntent.flattenToShortString());
    paramContext = localPowerManager.newWakeLock(1, paramContext.toString());
    paramContext.setReferenceCounted(false);
    paramContext.acquire(60000L);
    ???.put(i, paramContext);
    return paramIntent;
  }
}

/* Location:
 * Qualified Name:     V.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */