/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Float
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.List
 */
package B0;

import B0.q;
import B0.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class s {
    public static final Comparator h = new q();
    public static final Comparator i = new r();
    public final int a;
    public final ArrayList b;
    public final b[] c;
    public int d;
    public int e;
    public int f;
    public int g;

    public s(int n8) {
        this.a = n8;
        this.c = new b[5];
        this.b = new ArrayList();
        this.d = -1;
    }

    public static /* synthetic */ int a(b b8, b b9) {
        return s.h(b8, b9);
    }

    public static /* synthetic */ int b(b b8, b b9) {
        return s.g(b8, b9);
    }

    public static /* synthetic */ int g(b b8, b b9) {
        return b8.a - b9.a;
    }

    public static /* synthetic */ int h(b b8, b b9) {
        return Float.compare((float)b8.c, (float)b9.c);
    }

    public void c(int n8, float f8) {
        Object object;
        this.d();
        int n9 = this.g;
        if (n9 > 0) {
            object = this.c;
            this.g = --n9;
            object = object[n9];
        } else {
            object = new b(null);
        }
        n9 = this.e;
        this.e = n9 + 1;
        object.a = n9;
        object.b = n8;
        object.c = f8;
        this.b.add(object);
        n8 = this.f + n8;
        block0 : do {
            this.f = n8;
            while ((n8 = this.f) > (n9 = this.a)) {
                object = (b)this.b.get(0);
                n9 = object.b;
                if (n9 <= (n8 -= n9)) {
                    this.f -= n9;
                    this.b.remove(0);
                    n8 = this.g;
                    if (n8 >= 5) continue;
                    b[] arrb = this.c;
                    this.g = n8 + 1;
                    arrb[n8] = object;
                    continue;
                }
                object.b = n9 - n8;
                n8 = this.f - n8;
                continue block0;
            }
            break;
        } while (true);
    }

    public final void d() {
        if (this.d != 1) {
            Collections.sort((List)this.b, (Comparator)h);
            this.d = 1;
        }
    }

    public final void e() {
        if (this.d != 0) {
            Collections.sort((List)this.b, (Comparator)i);
            this.d = 0;
        }
    }

    public float f(float f8) {
        b b8;
        this.e();
        float f9 = this.f;
        int n8 = 0;
        for (int i8 = 0; i8 < this.b.size(); ++i8) {
            b8 = (b)this.b.get(i8);
            if ((float)(n8 += b8.b) < f8 * f9) continue;
            return b8.c;
        }
        if (this.b.isEmpty()) {
            return Float.NaN;
        }
        b8 = this.b;
        return ((b)b8.get((int)(b8.size() - 1))).c;
    }

    public void i() {
        this.b.clear();
        this.d = -1;
        this.e = 0;
        this.f = 0;
    }

    public static class b {
        public int a;
        public int b;
        public float c;

        public b() {
        }

        public /* synthetic */ b( a8) {
            this();
        }
    }

}

