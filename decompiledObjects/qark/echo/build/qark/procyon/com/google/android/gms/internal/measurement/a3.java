// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import W2.g;
import android.net.Uri;

public final class a3
{
    public final String a;
    public final Uri b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final g i;
    
    public a3(final Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }
    
    public a3(final String a, final Uri b, final String c, final String d, final boolean e, final boolean f, final boolean g, final boolean h, final g i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final S2 a(final String s, final double n) {
        return S2.c(this, s, -3.0, true);
    }
    
    public final S2 b(final String s, final long l) {
        return S2.d(this, s, l, true);
    }
    
    public final S2 c(final String s, final String s2) {
        return S2.e(this, s, s2, true);
    }
    
    public final S2 d(final String s, final boolean b) {
        return S2.b(this, s, b, true);
    }
    
    public final a3 e() {
        return new a3(this.a, this.b, this.c, this.d, this.e, this.f, true, this.h, this.i);
    }
    
    public final a3 f() {
        if (!this.c.isEmpty()) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        final g i = this.i;
        if (i == null) {
            return new a3(this.a, this.b, this.c, this.d, true, this.f, this.g, this.h, i);
        }
        throw new IllegalStateException("Cannot skip gservices both always and conditionally");
    }
}
