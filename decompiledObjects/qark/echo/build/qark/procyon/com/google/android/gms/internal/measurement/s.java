// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Iterator;

public interface s
{
    public static final s d = new z();
    public static final s e = new q();
    public static final s f = new l("continue");
    public static final s g = new l("break");
    public static final s h = new l("return");
    public static final s i = new h(Boolean.TRUE);
    public static final s j = new h(Boolean.FALSE);
    public static final s k = new u("");
    
    s c();
    
    Boolean d();
    
    Double f();
    
    String g();
    
    Iterator k();
    
    s s(final String p0, final f3 p1, final List p2);
}
