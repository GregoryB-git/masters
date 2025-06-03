/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package j0;

public abstract class a {
    public int o;

    public final void l(int n8) {
        this.o = n8 | this.o;
    }

    public void m() {
        this.o = 0;
    }

    public final boolean n(int n8) {
        if ((this.o & n8) == n8) {
            return true;
        }
        return false;
    }

    public final boolean o() {
        return this.n(268435456);
    }

    public final boolean p() {
        return this.n(4);
    }

    public final boolean r() {
        return this.n(134217728);
    }

    public final boolean s() {
        return this.n(1);
    }

    public final boolean u() {
        return this.n(536870912);
    }

    public final void w(int n8) {
        this.o = n8;
    }
}

