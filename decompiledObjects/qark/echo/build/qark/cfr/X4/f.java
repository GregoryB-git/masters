/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Iterator
 *  java.util.LinkedList
 */
package X4;

import X4.d;
import X4.g;
import Y4.a;
import java.util.Iterator;
import java.util.LinkedList;

public final class f {
    public static final f e = new f(g.b, 0, 0, 0);
    public final int a;
    public final g b;
    public final int c;
    public final int d;

    public f(g g8, int n8, int n9, int n10) {
        this.b = g8;
        this.a = n8;
        this.c = n9;
        this.d = n10;
    }

    public f a(int n8) {
        int n9;
        int n10;
        int n11;
        int n12;
        Object object;
        Object object2;
        block5 : {
            block4 : {
                object = this.b;
                n11 = this.a;
                n9 = this.d;
                if (n11 == 4) break block4;
                object2 = object;
                n12 = n11;
                n10 = n9;
                if (n11 != 2) break block5;
            }
            n10 = d.c[n11][0];
            n12 = n10 >> 16;
            object2 = object.a(65535 & n10, n12);
            n10 = n9 + n12;
            n12 = 0;
        }
        n9 = (n11 = this.c) != 0 && n11 != 31 ? (n11 == 62 ? 9 : 8) : 18;
        object2 = object = new f((g)object2, n12, n11 + 1, n10 + n9);
        if (object.c == 2078) {
            object2 = object.b(n8 + 1);
        }
        return object2;
    }

    public f b(int n8) {
        int n9 = this.c;
        if (n9 == 0) {
            return this;
        }
        return new f(this.b.b(n8 - n9, n9), this.a, 0, this.d);
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public int e() {
        return this.a;
    }

    public boolean f(f f8) {
        int n8;
        block4 : {
            int n9;
            block5 : {
                n9 = this.d + (d.c[this.a][f8.a] >> 16);
                int n10 = f8.c;
                n8 = n9;
                if (n10 <= 0) break block4;
                int n11 = this.c;
                if (n11 == 0) break block5;
                n8 = n9;
                if (n11 <= n10) break block4;
            }
            n8 = n9 + 10;
        }
        if (n8 <= f8.d) {
            return true;
        }
        return false;
    }

    public f g(int n8, int n9) {
        int n10 = this.d;
        g g8 = this.b;
        int n11 = this.a;
        int n12 = n10;
        g g9 = g8;
        if (n8 != n11) {
            n12 = d.c[n11][n8];
            n11 = n12 >> 16;
            g9 = g8.a(65535 & n12, n11);
            n12 = n10 + n11;
        }
        n10 = n8 == 2 ? 4 : 5;
        return new f(g9.a(n9, n10), n8, 0, n12 + n10);
    }

    public f h(int n8, int n9) {
        g g8 = this.b;
        int n10 = this.a;
        int n11 = n10 == 2 ? 4 : 5;
        return new f(g8.a(d.e[n10][n8], n11).a(n9, 5), this.a, 0, this.d + n11 + 5);
    }

    public a i(byte[] arrby) {
        Object object;
        LinkedList linkedList = new LinkedList();
        for (object = this.b((int)arrby.length).b; object != null; object = object.d()) {
            linkedList.addFirst(object);
        }
        object = new a();
        linkedList = linkedList.iterator();
        while (linkedList.hasNext()) {
            ((g)linkedList.next()).c((a)object, arrby);
        }
        return object;
    }

    public String toString() {
        return String.format((String)"%s bits=%d bytes=%d", (Object[])new Object[]{d.b[this.a], this.d, this.c});
    }
}

