/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.internal.measurement;

import W2.g;
import android.net.Uri;
import com.google.android.gms.internal.measurement.S2;

public final class a3 {
    public final String a;
    public final Uri b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final g i;

    public a3(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    public a3(String string2, Uri uri, String string3, String string4, boolean bl, boolean bl2, boolean bl3, boolean bl4, g g8) {
        this.a = string2;
        this.b = uri;
        this.c = string3;
        this.d = string4;
        this.e = bl;
        this.f = bl2;
        this.g = bl3;
        this.h = bl4;
        this.i = g8;
    }

    public final S2 a(String string2, double d8) {
        return S2.c(this, string2, -3.0, true);
    }

    public final S2 b(String string2, long l8) {
        return S2.d(this, string2, l8, true);
    }

    public final S2 c(String string2, String string3) {
        return S2.e(this, string2, string3, true);
    }

    public final S2 d(String string2, boolean bl) {
        return S2.b(this, string2, bl, true);
    }

    public final a3 e() {
        return new a3(this.a, this.b, this.c, this.d, this.e, this.f, true, this.h, this.i);
    }

    public final a3 f() {
        if (this.c.isEmpty()) {
            g g8 = this.i;
            if (g8 == null) {
                return new a3(this.a, this.b, this.c, this.d, true, this.f, this.g, this.h, g8);
            }
            throw new IllegalStateException("Cannot skip gservices both always and conditionally");
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }
}

