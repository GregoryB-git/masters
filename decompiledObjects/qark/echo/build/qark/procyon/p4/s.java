// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p4;

import android.util.Log;
import android.content.Context;

public class s
{
    public static s c;
    public Boolean a;
    public Boolean b;
    
    public s() {
        this.a = null;
        this.b = null;
    }
    
    public static s a() {
        // monitorenter(s.class)
        while (true) {
            try {
                if (s.c == null) {
                    s.c = new s();
                }
                // monitorexit(s.class)
                return s.c;
                // monitorexit(s.class)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public boolean b(final Context context) {
        if (this.b == null) {
            this.b = (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.a && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.b;
    }
    
    public boolean c(final Context context) {
        if (this.a == null) {
            this.a = (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.a && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.a;
    }
}
