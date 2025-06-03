// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V;

import android.os.PowerManager;
import android.content.ComponentName;
import android.content.Context;
import android.util.Log;
import android.os.PowerManager$WakeLock;
import android.content.Intent;
import android.util.SparseArray;
import android.content.BroadcastReceiver;

public abstract class a extends BroadcastReceiver
{
    public static final SparseArray o;
    public static int p;
    
    static {
        o = new SparseArray();
        a.p = 1;
    }
    
    public static boolean b(Intent o) {
        final int intExtra = o.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return false;
        }
        o = (Intent)a.o;
        // monitorenter(o)
        while (true) {
            try {
                final PowerManager$WakeLock powerManager$WakeLock = (PowerManager$WakeLock)((SparseArray)o).get(intExtra);
                if (powerManager$WakeLock != null) {
                    powerManager$WakeLock.release();
                    ((SparseArray)o).remove(intExtra);
                    // monitorexit(o)
                    return true;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("No active wake lock id #");
                sb.append(intExtra);
                Log.w("WakefulBroadcastReceiv.", sb.toString());
                // monitorexit(o)
                return true;
                // monitorexit(o)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static ComponentName c(final Context context, final Intent intent) {
        final SparseArray o = a.o;
        // monitorenter(o)
        while (true) {
            try {
                final int p2 = a.p;
                if ((a.p = p2 + 1) <= 0) {
                    a.p = 1;
                }
                intent.putExtra("androidx.contentpager.content.wakelockid", p2);
                final ComponentName startService = context.startService(intent);
                if (startService == null) {
                    // monitorexit(o)
                    return null;
                }
                final PowerManager powerManager = (PowerManager)context.getSystemService("power");
                final StringBuilder sb = new StringBuilder();
                sb.append("androidx.core:wake:");
                sb.append(startService.flattenToShortString());
                final PowerManager$WakeLock wakeLock = powerManager.newWakeLock(1, sb.toString());
                wakeLock.setReferenceCounted(false);
                wakeLock.acquire(60000L);
                o.put(p2, (Object)wakeLock);
                // monitorexit(o)
                return startService;
                // monitorexit(o)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
}
