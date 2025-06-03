package androidx.work.impl.utils;

import android.content.Context;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import z2;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class WakeLocks
{
  private static final String TAG = Logger.tagWithPrefix("WakeLocks");
  private static final WeakHashMap<PowerManager.WakeLock, String> sWakeLocks = new WeakHashMap();
  
  public static void checkWakeLocks()
  {
    HashMap localHashMap = new HashMap();
    synchronized (sWakeLocks)
    {
      localHashMap.putAll((Map)???);
      ??? = localHashMap.keySet().iterator();
      while (((Iterator)???).hasNext())
      {
        Object localObject3 = (PowerManager.WakeLock)((Iterator)???).next();
        if ((localObject3 != null) && (((PowerManager.WakeLock)localObject3).isHeld()))
        {
          localObject3 = String.format("WakeLock held for %s", new Object[] { localHashMap.get(localObject3) });
          Logger.get().warning(TAG, (String)localObject3, new Throwable[0]);
        }
      }
      return;
    }
  }
  
  public static PowerManager.WakeLock newWakeLock(@NonNull Context paramContext, @NonNull String arg1)
  {
    Object localObject = (PowerManager)paramContext.getApplicationContext().getSystemService("power");
    paramContext = z2.o("WorkManager: ", ???);
    localObject = ((PowerManager)localObject).newWakeLock(1, paramContext);
    synchronized (sWakeLocks)
    {
      ???.put(localObject, paramContext);
      return (PowerManager.WakeLock)localObject;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.utils.WakeLocks
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */