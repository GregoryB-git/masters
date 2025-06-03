// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

public abstract class A
{
    public final List a;
    
    public A() {
        this.a = new ArrayList();
    }
    
    public final s a(final String str) {
        if (this.a.contains(C2.c(str))) {
            final StringBuilder sb = new StringBuilder("Command not implemented: ");
            sb.append(str);
            throw new UnsupportedOperationException(sb.toString());
        }
        throw new IllegalArgumentException("Command not supported");
    }
    
    public abstract s b(final String p0, final f3 p1, final List p2);
}
