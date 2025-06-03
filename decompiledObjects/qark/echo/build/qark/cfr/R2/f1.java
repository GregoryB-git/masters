/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.String
 */
package R2;

import R2.G1;
import R2.N2;
import R2.m3;

public abstract class f1
extends G1 {
    public boolean b;

    public f1(N2 n22) {
        super(n22);
        this.a.n();
    }

    public abstract boolean A();

    public final void v() {
        if (this.z()) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }

    public final void w() {
        if (!this.b) {
            if (!this.A()) {
                this.a.R();
                this.b = true;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final void x() {
        if (!this.b) {
            this.y();
            this.a.R();
            this.b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public void y() {
    }

    public final boolean z() {
        if (this.b) {
            return true;
        }
        return false;
    }
}

