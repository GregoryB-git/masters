/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 */
package g0;

import java.util.Arrays;

public final class p {
    public int a;
    public long[] b;

    public p() {
        this(32);
    }

    public p(int n8) {
        this.b = new long[n8];
    }

    public void a(long l8) {
        int n8 = this.a;
        long[] arrl = this.b;
        if (n8 == arrl.length) {
            this.b = Arrays.copyOf((long[])arrl, (int)(n8 * 2));
        }
        arrl = this.b;
        n8 = this.a;
        this.a = n8 + 1;
        arrl[n8] = l8;
    }

    public long b(int n8) {
        if (n8 >= 0 && n8 < this.a) {
            return this.b[n8];
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid index ");
        stringBuilder.append(n8);
        stringBuilder.append(", size is ");
        stringBuilder.append(this.a);
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    public int c() {
        return this.a;
    }
}

