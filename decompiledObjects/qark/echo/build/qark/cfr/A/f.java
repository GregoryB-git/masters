/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.graphics.Insets
 *  android.graphics.Rect
 *  java.lang.Class
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package A;

import A.b;
import A.c;
import A.d;
import A.e;
import android.graphics.Insets;
import android.graphics.Rect;

public final class f {
    public static final f e = new f(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public f(int n8, int n9, int n10, int n11) {
        this.a = n8;
        this.b = n9;
        this.c = n10;
        this.d = n11;
    }

    public static f a(f f8, f f9) {
        return f.b(Math.max((int)f8.a, (int)f9.a), Math.max((int)f8.b, (int)f9.b), Math.max((int)f8.c, (int)f9.c), Math.max((int)f8.d, (int)f9.d));
    }

    public static f b(int n8, int n9, int n10, int n11) {
        if (n8 == 0 && n9 == 0 && n10 == 0 && n11 == 0) {
            return e;
        }
        return new f(n8, n9, n10, n11);
    }

    public static f c(Rect rect) {
        return f.b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static f d(Insets insets) {
        return f.b(b.a(insets), c.a(insets), d.a(insets), e.a(insets));
    }

    public Insets e() {
        return a.a(this.a, this.b, this.c, this.d);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (f.class != object.getClass()) {
                return false;
            }
            object = (f)object;
            if (this.d != object.d) {
                return false;
            }
            if (this.a != object.a) {
                return false;
            }
            if (this.c != object.c) {
                return false;
            }
            if (this.b != object.b) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.a * 31 + this.b) * 31 + this.c) * 31 + this.d;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Insets{left=");
        stringBuilder.append(this.a);
        stringBuilder.append(", top=");
        stringBuilder.append(this.b);
        stringBuilder.append(", right=");
        stringBuilder.append(this.c);
        stringBuilder.append(", bottom=");
        stringBuilder.append(this.d);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public static abstract class a {
        public static Insets a(int n8, int n9, int n10, int n11) {
            return Insets.of((int)n8, (int)n9, (int)n10, (int)n11);
        }
    }

}

