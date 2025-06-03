/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 *  java.lang.Object
 */
package q0;

import android.util.SparseArray;
import g0.E;

public final class v {
    public final SparseArray a = new SparseArray();

    public E a(int n8) {
        E e8;
        E e9 = e8 = (E)this.a.get(n8);
        if (e8 == null) {
            e9 = new E(9223372036854775806L);
            this.a.put(n8, (Object)e9);
        }
        return e9;
    }

    public void b() {
        this.a.clear();
    }
}

