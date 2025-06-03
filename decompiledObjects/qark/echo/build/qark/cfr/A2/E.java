/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.SparseIntArray
 *  java.lang.Object
 */
package A2;

import A2.n;
import android.content.Context;
import android.util.SparseIntArray;
import x2.k;
import y2.a;

public final class E {
    public final SparseIntArray a = new SparseIntArray();
    public k b;

    public E(k k8) {
        n.i(k8);
        this.b = k8;
    }

    public final int a(Context context, int n8) {
        return this.a.get(n8, -1);
    }

    public final int b(Context context, a.f f8) {
        int n8;
        int n9;
        block4 : {
            n.i((Object)context);
            n.i(f8);
            boolean bl = f8.g();
            int n10 = 0;
            if (!bl) {
                return 0;
            }
            n8 = f8.h();
            n9 = this.a(context, n8);
            if (n9 != -1) {
                return n9;
            }
            for (n9 = 0; n9 < this.a.size(); ++n9) {
                int n11 = this.a.keyAt(n9);
                if (n11 <= n8 || this.a.get(n11) != 0) continue;
                n9 = n10;
                break block4;
            }
            n9 = -1;
        }
        if (n9 == -1) {
            n9 = this.b.h(context, n8);
        }
        this.a.put(n8, n9);
        return n9;
    }

    public final void c() {
        this.a.clear();
    }
}

