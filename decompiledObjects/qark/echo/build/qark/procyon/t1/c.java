// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package t1;

import android.os.Trace;

public abstract class c
{
    public static void a(final String s) {
        Trace.beginSection(s);
    }
    
    public static void b() {
        Trace.endSection();
    }
}
