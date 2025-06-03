/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.String
 */
package R2;

import R2.D5;
import R2.z5;

public abstract class C5
extends z5 {
    public boolean c;

    public C5(D5 d52) {
        super(d52);
        this.b.r0();
    }

    public final void u() {
        if (this.w()) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }

    public final void v() {
        if (!this.c) {
            this.x();
            this.b.q0();
            this.c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final boolean w() {
        if (this.c) {
            return true;
        }
        return false;
    }

    public abstract boolean x();
}

