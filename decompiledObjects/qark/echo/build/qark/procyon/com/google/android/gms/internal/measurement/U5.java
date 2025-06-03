// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public enum U5
{
    p("INT", 0, (Object)0), 
    q("LONG", 1, (Object)0L), 
    r("FLOAT", 2, (Object)0.0f), 
    s("DOUBLE", 3, (Object)0.0), 
    t("BOOLEAN", 4, (Object)Boolean.FALSE), 
    u("STRING", 5, (Object)""), 
    v("BYTE_STRING", 6, (Object)q3.p), 
    w("ENUM", 7, (Object)null), 
    x("MESSAGE", 8, (Object)null);
    
    public final Object o;
    
    public U5(final String name, final int ordinal, final Object o) {
        this.o = o;
    }
}
