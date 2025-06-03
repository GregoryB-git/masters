/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.String
 *  java.lang.Throwable
 */
package s3;

import A2.n;

public abstract class l
extends Exception {
    public l() {
    }

    public l(String string2) {
        n.f(string2, "Detail message must not be empty");
        super(string2);
    }

    public l(String string2, Throwable throwable) {
        n.f(string2, "Detail message must not be empty");
        super(string2, throwable);
    }
}

