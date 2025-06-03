/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package d0;

import d0.D;
import d0.I;

public abstract class f
implements D {
    public final I.c a = new I.c();

    @Override
    public final boolean B() {
        if (this.b() != -1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean G() {
        if (this.c() != -1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean I() {
        I i8 = this.L();
        if (!i8.q() && i8.n((int)this.E(), (I.c)this.a).i) {
            return true;
        }
        return false;
    }

    @Override
    public final int M() {
        return this.L().p();
    }

    @Override
    public final boolean Q() {
        I i8 = this.L();
        if (!i8.q() && i8.n(this.E(), this.a).f()) {
            return true;
        }
        return false;
    }

    public final int R() {
        int n8;
        int n9 = n8 = this.q();
        if (n8 == 1) {
            n9 = 0;
        }
        return n9;
    }

    public final void S(int n8) {
        this.U(-1, -9223372036854775807L, n8, false);
    }

    public final void T(int n8) {
        this.U(this.E(), -9223372036854775807L, n8, true);
    }

    public abstract void U(int var1, long var2, int var4, boolean var5);

    public final void V(int n8, int n9) {
        this.U(n8, -9223372036854775807L, n9, false);
    }

    public final void W(int n8) {
        int n9 = this.b();
        if (n9 == -1) {
            this.S(n8);
            return;
        }
        if (n9 == this.E()) {
            this.T(n8);
            return;
        }
        this.V(n9, n8);
    }

    public final long a() {
        I i8 = this.L();
        if (i8.q()) {
            return -9223372036854775807L;
        }
        return i8.n(this.E(), this.a).d();
    }

    public final int b() {
        I i8 = this.L();
        if (i8.q()) {
            return -1;
        }
        return i8.e(this.E(), this.R(), this.N());
    }

    public final int c() {
        I i8 = this.L();
        if (i8.q()) {
            return -1;
        }
        return i8.l(this.E(), this.R(), this.N());
    }

    @Override
    public final void s(int n8, long l8) {
        this.U(n8, l8, 10, false);
    }

    @Override
    public final boolean w() {
        I i8 = this.L();
        if (!i8.q() && i8.n((int)this.E(), (I.c)this.a).h) {
            return true;
        }
        return false;
    }

    @Override
    public final void y() {
        this.W(8);
    }
}

