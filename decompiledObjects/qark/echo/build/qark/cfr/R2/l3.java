/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.String
 */
package R2;

import R2.N2;
import R2.m3;

public abstract class l3
extends m3 {
    public boolean b;

    public l3(N2 n22) {
        super(n22);
        this.a.n();
    }

    public final void o() {
        if (this.r()) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }

    public final void p() {
        if (!this.b) {
            if (!this.s()) {
                this.a.R();
                this.b = true;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final void q() {
        if (!this.b) {
            this.t();
            this.a.R();
            this.b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final boolean r() {
        if (this.b) {
            return true;
        }
        return false;
    }

    public abstract boolean s();

    public void t() {
    }
}

