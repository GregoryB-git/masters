/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 *  java.lang.Math
 *  java.lang.Object
 */
package x0;

import android.util.SparseArray;
import g0.a;
import g0.g;

public final class W {
    public int a;
    public final SparseArray b = new SparseArray();
    public final g c;

    public W(g g8) {
        this.c = g8;
        this.a = -1;
    }

    public void a(int n8, Object object) {
        boolean bl;
        int n9 = this.a;
        boolean bl2 = false;
        if (n9 == -1) {
            bl = this.b.size() == 0;
            a.f(bl);
            this.a = 0;
        }
        if (this.b.size() > 0) {
            Object object2 = this.b;
            n9 = object2.keyAt(object2.size() - 1);
            bl = bl2;
            if (n8 >= n9) {
                bl = true;
            }
            a.a(bl);
            if (n9 == n8) {
                object2 = this.c;
                SparseArray sparseArray = this.b;
                object2.accept(sparseArray.valueAt(sparseArray.size() - 1));
            }
        }
        this.b.append(n8, object);
    }

    public void b() {
        for (int i8 = 0; i8 < this.b.size(); ++i8) {
            this.c.accept(this.b.valueAt(i8));
        }
        this.a = -1;
        this.b.clear();
    }

    public void c(int n8) {
        for (int i8 = this.b.size() - 1; i8 >= 0 && n8 < this.b.keyAt(i8); --i8) {
            this.c.accept(this.b.valueAt(i8));
            this.b.removeAt(i8);
        }
        n8 = this.b.size() > 0 ? Math.min((int)this.a, (int)(this.b.size() - 1)) : -1;
        this.a = n8;
    }

    public void d(int n8) {
        int n9;
        SparseArray sparseArray;
        int n10 = 0;
        while (n10 < this.b.size() - 1 && n8 >= (sparseArray = this.b).keyAt(n9 = n10 + 1)) {
            this.c.accept(this.b.valueAt(n10));
            this.b.removeAt(n10);
            n10 = this.a;
            if (n10 > 0) {
                this.a = n10 - 1;
            }
            n10 = n9;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public Object e(int var1_1) {
        if (this.a != -1) ** GOTO lbl5
        var2_2 = 0;
        do {
            this.a = var2_2;
lbl5: // 2 sources:
            if ((var2_2 = this.a) <= 0 || var1_1 >= this.b.keyAt(var2_2)) break;
            var2_2 = this.a - 1;
        } while (true);
        while (this.a < this.b.size() - 1) {
            if (var1_1 < this.b.keyAt(this.a + 1)) return this.b.valueAt(this.a);
            ++this.a;
        }
        return this.b.valueAt(this.a);
    }

    public Object f() {
        SparseArray sparseArray = this.b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public boolean g() {
        if (this.b.size() == 0) {
            return true;
        }
        return false;
    }
}

