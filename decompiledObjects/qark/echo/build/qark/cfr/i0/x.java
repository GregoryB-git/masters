/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  java.lang.Object
 *  java.util.Collections
 *  java.util.Map
 */
package i0;

import android.net.Uri;
import g0.a;
import i0.g;
import i0.k;
import i0.y;
import java.util.Collections;
import java.util.Map;

public final class x
implements g {
    public final g a;
    public long b;
    public Uri c;
    public Map d;

    public x(g g8) {
        this.a = (g)a.e(g8);
        this.c = Uri.EMPTY;
        this.d = Collections.emptyMap();
    }

    @Override
    public void c(y y8) {
        a.e(y8);
        this.a.c(y8);
    }

    @Override
    public void close() {
        this.a.close();
    }

    @Override
    public long e(k k8) {
        this.c = k8.a;
        this.d = Collections.emptyMap();
        long l8 = this.a.e(k8);
        this.c = (Uri)a.e((Object)this.k());
        this.d = this.g();
        return l8;
    }

    @Override
    public Map g() {
        return this.a.g();
    }

    @Override
    public Uri k() {
        return this.a.k();
    }

    public long q() {
        return this.b;
    }

    public Uri r() {
        return this.c;
    }

    @Override
    public int read(byte[] arrby, int n8, int n9) {
        if ((n8 = this.a.read(arrby, n8, n9)) != -1) {
            this.b += (long)n8;
        }
        return n8;
    }

    public Map s() {
        return this.d;
    }

    public void t() {
        this.b = 0L;
    }
}

