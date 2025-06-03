// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package F4;

import android.util.Log;

public class c
{
    public static c a;
    
    public static c c() {
        // monitorenter(c.class)
        while (true) {
            try {
                if (c.a == null) {
                    c.a = new c();
                }
                // monitorexit(c.class)
                return c.a;
                // monitorexit(c.class)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public void a(final String s) {
        Log.d("FirebasePerformance", s);
    }
    
    public void b(final String s) {
        Log.e("FirebasePerformance", s);
    }
    
    public void d(final String s) {
        Log.i("FirebasePerformance", s);
    }
    
    public void e(final String s) {
        Log.w("FirebasePerformance", s);
    }
}
