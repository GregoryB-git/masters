/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package d0;

import d0.h;
import g0.a;

public class r {
    public final h a;
    public final int b;
    public final int c;
    public final float d;
    public final long e;

    public r(h h8, int n8, int n9, float f8, long l8) {
        boolean bl = true;
        boolean bl2 = n8 > 0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("width must be positive, but is: ");
        stringBuilder.append(n8);
        a.b(bl2, stringBuilder.toString());
        bl2 = n9 > 0 ? bl : false;
        stringBuilder = new StringBuilder();
        stringBuilder.append("height must be positive, but is: ");
        stringBuilder.append(n9);
        a.b(bl2, stringBuilder.toString());
        this.a = h8;
        this.b = n8;
        this.c = n9;
        this.d = f8;
        this.e = l8;
    }

    public /* synthetic */ r(h h8, int n8, int n9, float f8, long l8,  a8) {
        this(h8, n8, n9, f8, l8);
    }

    public static final class b {
        public h a;
        public int b;
        public int c;
        public float d;
        public long e;

        public b(h h8, int n8, int n9) {
            this.a = h8;
            this.b = n8;
            this.c = n9;
            this.d = 1.0f;
        }

        public r a() {
            return new r(this.a, this.b, this.c, this.d, this.e, null);
        }

        public b b(float f8) {
            this.d = f8;
            return this;
        }
    }

}

