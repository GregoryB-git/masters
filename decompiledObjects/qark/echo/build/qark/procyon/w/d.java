// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package w;

import android.os.IBinder;
import android.os.Bundle;

public abstract class d
{
    public static IBinder a(final Bundle bundle, final String s) {
        return a.a(bundle, s);
    }
    
    public static void b(final Bundle bundle, final String s, final IBinder binder) {
        a.b(bundle, s, binder);
    }
    
    public abstract static class a
    {
        public static IBinder a(final Bundle bundle, final String s) {
            return bundle.getBinder(s);
        }
        
        public static void b(final Bundle bundle, final String s, final IBinder binder) {
            bundle.putBinder(s, binder);
        }
    }
}
