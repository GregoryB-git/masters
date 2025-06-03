/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 */
package p6;

import p6.F;
import p6.W;

public abstract class B0
extends F {
    public abstract B0 H();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String I() {
        B0 b02;
        block3 : {
            b02 = W.c();
            if (this == b02) {
                return "Dispatchers.Main";
            }
            try {
                b02 = b02.H();
                break block3;
            }
            catch (UnsupportedOperationException unsupportedOperationException) {}
            b02 = null;
        }
        if (this != b02) return null;
        return "Dispatchers.Main.immediate";
    }
}

