/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package D6;

public final class d {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public d f;
    public d g;

    public d() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public d(byte[] arrby, int n8, int n9, boolean bl, boolean bl2) {
        this.a = arrby;
        this.b = n8;
        this.c = n9;
        this.d = bl;
        this.e = bl2;
    }

    public final d a() {
        d d8 = this.f;
        d d9 = d8 != this ? d8 : null;
        d d10 = this.g;
        d10.f = d8;
        this.f.g = d10;
        this.f = null;
        this.g = null;
        return d9;
    }

    public final d b(d d8) {
        d8.g = this;
        d8.f = this.f;
        this.f.g = d8;
        this.f = d8;
        return d8;
    }

    public final d c() {
        this.d = true;
        return new d(this.a, this.b, this.c, true, false);
    }
}

