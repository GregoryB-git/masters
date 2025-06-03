// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package t1;

import android.os.Trace;

public abstract class d
{
    public static void a(final String s, final int n) {
        Trace.beginAsyncSection(s, n);
    }
    
    public static void b(final String s, final int n) {
        Trace.endAsyncSection(s, n);
    }
}
