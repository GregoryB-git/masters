/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.media.AudioAttributes
 *  android.media.AudioAttributes$Builder
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
package d0;

import android.media.AudioAttributes;
import g0.M;

public final class b {
    public static final b g = new e().a();
    public static final String h = M.w0(0);
    public static final String i = M.w0(1);
    public static final String j = M.w0(2);
    public static final String k = M.w0(3);
    public static final String l = M.w0(4);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public d f;

    public b(int n8, int n9, int n10, int n11, int n12) {
        this.a = n8;
        this.b = n9;
        this.c = n10;
        this.d = n11;
        this.e = n12;
    }

    public /* synthetic */ b(int n8, int n9, int n10, int n11, int n12,  a8) {
        this(n8, n9, n10, n11, n12);
    }

    public d a() {
        if (this.f == null) {
            this.f = new d(this, null);
        }
        return this.f;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (b.class != object.getClass()) {
                return false;
            }
            object = (b)object;
            if (this.a == object.a && this.b == object.b && this.c == object.c && this.d == object.d && this.e == object.e) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.a) * 31 + this.b) * 31 + this.c) * 31 + this.d) * 31 + this.e;
    }

    public static final abstract class b {
        public static void a(AudioAttributes.Builder builder, int n8) {
            d0.c.a(builder, n8);
        }
    }

    public static final abstract class c {
        public static void a(AudioAttributes.Builder builder, int n8) {
            d0.d.a(builder, n8);
        }
    }

    public static final class d {
        public final AudioAttributes a;

        public d(b b8) {
            AudioAttributes.Builder builder = new AudioAttributes.Builder().setContentType(b8.a).setFlags(b8.b).setUsage(b8.c);
            int n8 = M.a;
            if (n8 >= 29) {
                b.a(builder, b8.d);
            }
            if (n8 >= 32) {
                c.a(builder, b8.e);
            }
            this.a = builder.build();
        }

        public /* synthetic */ d(b b8,  a8) {
            this(b8);
        }
    }

    public static final class e {
        public int a = 0;
        public int b = 0;
        public int c = 1;
        public int d = 1;
        public int e = 0;

        public b a() {
            return new b(this.a, this.b, this.c, this.d, this.e, null);
        }

        public e b(int n8) {
            this.a = n8;
            return this;
        }

        public e c(int n8) {
            this.b = n8;
            return this;
        }

        public e d(int n8) {
            this.c = n8;
            return this;
        }
    }

}

