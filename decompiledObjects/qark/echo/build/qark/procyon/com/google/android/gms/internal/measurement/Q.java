// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public final class Q implements P
{
    public final f3 a;
    public final String b;
    
    public Q(final f3 a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final f3 a(final s s) {
        final f3 d = this.a.d();
        d.e(this.b, s);
        return d;
    }
}
