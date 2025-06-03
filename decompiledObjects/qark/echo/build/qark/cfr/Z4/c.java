/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.ArrayList
 *  java.util.List
 */
package Z4;

import Z4.a;
import Z4.b;
import java.util.ArrayList;
import java.util.List;

public final class c {
    public final a a;
    public final List b;

    public c(a a8) {
        this.a = a8;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.add((Object)new b(a8, new int[]{1}));
    }

    public final b a(int n8) {
        if (n8 >= this.b.size()) {
            Object object = this.b;
            object = (b)object.get(object.size() - 1);
            for (int i8 = this.b.size(); i8 <= n8; ++i8) {
                a a8 = this.a;
                object = object.g(new b(a8, new int[]{1, a8.c(i8 - 1 + a8.d())}));
                this.b.add(object);
            }
        }
        return (b)this.b.get(n8);
    }

    public void b(int[] arrn, int n8) {
        if (n8 != 0) {
            int n9 = arrn.length - n8;
            if (n9 > 0) {
                int[] arrn2 = this.a(n8);
                int[] arrn3 = new int[n9];
                System.arraycopy((Object)arrn, (int)0, (Object)arrn3, (int)0, (int)n9);
                arrn2 = new b(this.a, arrn3).h(n8, 1).b((b)arrn2)[1].d();
                int n10 = n8 - arrn2.length;
                for (n8 = 0; n8 < n10; ++n8) {
                    arrn[n9 + n8] = 0;
                }
                System.arraycopy((Object)arrn2, (int)0, (Object)arrn, (int)(n9 + n10), (int)arrn2.length);
                return;
            }
            throw new IllegalArgumentException("No data bytes provided");
        }
        throw new IllegalArgumentException("No error correction bytes");
    }
}

