// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x0;

import g0.a;
import g0.g;
import android.util.SparseArray;

public final class W
{
    public int a;
    public final SparseArray b;
    public final g c;
    
    public W(final g c) {
        this.b = new SparseArray();
        this.c = c;
        this.a = -1;
    }
    
    public void a(final int n, final Object o) {
        final int a = this.a;
        final boolean b = false;
        if (a == -1) {
            g0.a.f(this.b.size() == 0);
            this.a = 0;
        }
        if (this.b.size() > 0) {
            final SparseArray b2 = this.b;
            final int key = b2.keyAt(b2.size() - 1);
            boolean b3 = b;
            if (n >= key) {
                b3 = true;
            }
            g0.a.a(b3);
            if (key == n) {
                final g c = this.c;
                final SparseArray b4 = this.b;
                c.accept(b4.valueAt(b4.size() - 1));
            }
        }
        this.b.append(n, o);
    }
    
    public void b() {
        for (int i = 0; i < this.b.size(); ++i) {
            this.c.accept(this.b.valueAt(i));
        }
        this.a = -1;
        this.b.clear();
    }
    
    public void c(int min) {
        for (int n = this.b.size() - 1; n >= 0 && min < this.b.keyAt(n); --n) {
            this.c.accept(this.b.valueAt(n));
            this.b.removeAt(n);
        }
        if (this.b.size() > 0) {
            min = Math.min(this.a, this.b.size() - 1);
        }
        else {
            min = -1;
        }
        this.a = min;
    }
    
    public void d(final int n) {
        int n2;
        for (int i = 0; i < this.b.size() - 1; i = n2) {
            final SparseArray b = this.b;
            n2 = i + 1;
            if (n < b.keyAt(n2)) {
                break;
            }
            this.c.accept(this.b.valueAt(i));
            this.b.removeAt(i);
            final int a = this.a;
            if (a > 0) {
                this.a = a - 1;
            }
        }
    }
    
    public Object e(final int n) {
        while (true) {
            Label_0015: {
                if (this.a != -1) {
                    break Label_0015;
                }
                final int a = 0;
                this.a = a;
            }
            final int a2 = this.a;
            if (a2 > 0 && n < this.b.keyAt(a2)) {
                final int a = this.a - 1;
                continue;
            }
            break;
        }
        while (this.a < this.b.size() - 1 && n >= this.b.keyAt(this.a + 1)) {
            ++this.a;
        }
        return this.b.valueAt(this.a);
    }
    
    public Object f() {
        final SparseArray b = this.b;
        return b.valueAt(b.size() - 1);
    }
    
    public boolean g() {
        return this.b.size() == 0;
    }
}
