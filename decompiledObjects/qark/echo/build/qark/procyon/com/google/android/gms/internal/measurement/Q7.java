// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public enum Q7
{
    p("DEBUG", 0, 3), 
    q("ERROR", 1, 6), 
    r("INFO", 2, 4), 
    s("VERBOSE", 3, 2), 
    t("WARN", 4, 5);
    
    public final int o;
    
    public Q7(final String name, final int ordinal, final int o) {
        this.o = o;
    }
    
    public static Q7 c(final int n) {
        if (n == 2) {
            return Q7.s;
        }
        if (n == 3) {
            return Q7.p;
        }
        if (n == 5) {
            return Q7.t;
        }
        if (n != 6) {
            return Q7.r;
        }
        return Q7.q;
    }
}
