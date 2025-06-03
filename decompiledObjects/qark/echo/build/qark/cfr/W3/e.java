/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package W3;

import Y3.m;
import a4.h;

public class e {
    public static final e d = new e(a.o, null, false);
    public static final e e = new e(a.p, null, false);
    public final a a;
    public final h b;
    public final boolean c;

    public e(a a8, h h8, boolean bl) {
        this.a = a8;
        this.b = h8;
        this.c = bl;
        bl = !bl || this.c();
        m.f(bl);
    }

    public static e a(h h8) {
        return new e(a.p, h8, true);
    }

    public h b() {
        return this.b;
    }

    public boolean c() {
        if (this.a == a.p) {
            return true;
        }
        return false;
    }

    public boolean d() {
        if (this.a == a.o) {
            return true;
        }
        return false;
    }

    public boolean e() {
        return this.c;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OperationSource{source=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", queryParams=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append(", tagged=");
        stringBuilder.append(this.c);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public static final class a
    extends Enum {
        public static final /* enum */ a o;
        public static final /* enum */ a p;
        public static final /* synthetic */ a[] q;

        static {
            a a8;
            a a9;
            o = a8 = new a();
            p = a9 = new a();
            q = new a[]{a8, a9};
        }

        public static a valueOf(String string2) {
            return (a)Enum.valueOf(a.class, (String)string2);
        }

        public static a[] values() {
            return (a[])q.clone();
        }
    }

}

