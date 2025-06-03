/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 */
package p6;

import W5.f;
import p6.F;
import p6.U;

public abstract class a0
extends F {
    public long q;
    public boolean r;
    public f s;

    public static /* synthetic */ void I(a0 a02, boolean bl, int n8, Object object) {
        if (object == null) {
            if ((n8 & 1) != 0) {
                bl = false;
            }
            a02.H(bl);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
    }

    public static /* synthetic */ void N(a0 a02, boolean bl, int n8, Object object) {
        if (object == null) {
            if ((n8 & 1) != 0) {
                bl = false;
            }
            a02.M(bl);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
    }

    public final void H(boolean bl) {
        long l8;
        this.q = l8 = this.q - this.J(bl);
        if (l8 > 0L) {
            return;
        }
        if (this.r) {
            this.shutdown();
        }
    }

    public final long J(boolean bl) {
        if (bl) {
            return 0x100000000L;
        }
        return 1L;
    }

    public final void K(U u8) {
        f f8;
        f f9 = f8 = this.s;
        if (f8 == null) {
            this.s = f9 = new f();
        }
        f9.g(u8);
    }

    public long L() {
        f f8 = this.s;
        if (f8 == null) {
            return Long.MAX_VALUE;
        }
        if (f8.isEmpty()) {
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    public final void M(boolean bl) {
        this.q += this.J(bl);
        if (!bl) {
            this.r = true;
        }
    }

    public final boolean O() {
        if (this.q >= this.J(true)) {
            return true;
        }
        return false;
    }

    public final boolean P() {
        f f8 = this.s;
        if (f8 != null) {
            return f8.isEmpty();
        }
        return true;
    }

    public abstract long Q();

    public final boolean R() {
        Object object = this.s;
        if (object == null) {
            return false;
        }
        if ((object = (U)object.W()) == null) {
            return false;
        }
        object.run();
        return true;
    }

    public boolean S() {
        return false;
    }

    public abstract void shutdown();
}

