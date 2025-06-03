/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.String
 *  java.lang.Throwable
 */
package P4;

import P4.o;

public class r
extends o {
    public final int p;

    public r(int n8, String string2) {
        super(string2);
        this.p = n8;
    }

    public r(int n8, String string2, o.a a8) {
        super(string2, a8);
        this.p = n8;
    }

    public r(int n8, String string2, Throwable throwable) {
        super(string2, throwable);
        this.p = n8;
    }

    public r(String string2, o.a a8) {
        super(string2, a8);
        this.p = -1;
    }

    public int a() {
        return this.p;
    }
}

