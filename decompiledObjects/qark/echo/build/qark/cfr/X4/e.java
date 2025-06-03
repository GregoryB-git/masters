/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package X4;

import X4.g;
import Y4.a;

public final class e
extends g {
    public final short c;
    public final short d;

    public e(g g8, int n8, int n9) {
        super(g8);
        this.c = (short)n8;
        this.d = (short)n9;
    }

    @Override
    public void c(a a8, byte[] arrby) {
        a8.d(this.c, this.d);
    }

    public String toString() {
        short s8 = this.c;
        short s9 = this.d;
        StringBuilder stringBuilder = new StringBuilder("<");
        stringBuilder.append(Integer.toBinaryString((int)(s8 & (1 << s9) - 1 | 1 << s9 | 1 << this.d)).substring(1));
        stringBuilder.append('>');
        return stringBuilder.toString();
    }
}

