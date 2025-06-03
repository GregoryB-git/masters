// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package U4;

import android.os.Trace;

public abstract class c
{
    public static void a() {
        Trace.endSection();
    }
    
    public static void b(final String s) {
        Trace.beginSection(s);
    }
}
