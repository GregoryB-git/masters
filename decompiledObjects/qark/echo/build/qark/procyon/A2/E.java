// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A2;

import y2.a;
import android.content.Context;
import x2.k;
import android.util.SparseIntArray;

public final class E
{
    public final SparseIntArray a;
    public k b;
    
    public E(final k b) {
        this.a = new SparseIntArray();
        n.i(b);
        this.b = b;
    }
    
    public final int a(final Context context, final int n) {
        return this.a.get(n, -1);
    }
    
    public final int b(final Context context, final a.f f) {
        n.i(context);
        n.i(f);
        final boolean g = f.g();
        final int n = 0;
        if (!g) {
            return 0;
        }
        final int h = f.h();
        final int a = this.a(context, h);
        if (a != -1) {
            return a;
        }
        while (true) {
            for (int i = 0; i < this.a.size(); ++i) {
                final int key = this.a.keyAt(i);
                if (key > h && this.a.get(key) == 0) {
                    int h2 = n;
                    if (h2 == -1) {
                        h2 = this.b.h(context, h);
                    }
                    this.a.put(h, h2);
                    return h2;
                }
            }
            int h2 = -1;
            continue;
        }
    }
    
    public final void c() {
        this.a.clear();
    }
}
