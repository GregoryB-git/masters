// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package e2;

import android.util.SparseArray;

public enum p
{
    p("DEFAULT", 0, 0), 
    q("UNMETERED_ONLY", 1, 1), 
    r("UNMETERED_OR_DAILY", 2, 2), 
    s("FAST_IF_RADIO_AWAKE", 3, 3), 
    t("NEVER", 4, 4), 
    u("UNRECOGNIZED", 5, -1);
    
    public static final SparseArray v;
    public final int o;
    
    static {
        final SparseArray v2 = new SparseArray();
        final p p2;
        (v = v2).put(0, (Object)p2);
        final p p3;
        v2.put(1, (Object)p3);
        final p p4;
        v2.put(2, (Object)p4);
        final p p5;
        v2.put(3, (Object)p5);
        final p p6;
        v2.put(4, (Object)p6);
        final p p7;
        v2.put(-1, (Object)p7);
    }
    
    public p(final String name, final int ordinal, final int o) {
        this.o = o;
    }
}
