// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package g0;

import android.os.Trace;

public abstract class F
{
    public static void a(final String s) {
        Trace.beginSection(s);
    }
    
    public static void b() {
        Trace.endSection();
    }
}
