/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package y0;

import F0.T;
import F0.n;
import g0.o;
import x0.P;
import y0.f;

public final class c
implements f.b {
    public final int[] a;
    public final P[] b;

    public c(int[] arrn, P[] arrp) {
        this.a = arrn;
        this.b = arrp;
    }

    @Override
    public T a(int n8, int n9) {
        StringBuilder stringBuilder;
        for (n8 = 0; n8 < (stringBuilder = this.a).length; ++n8) {
            if (n9 != stringBuilder[n8]) continue;
            return this.b[n8];
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Unmatched track of type: ");
        stringBuilder.append(n9);
        o.c("BaseMediaChunkOutput", stringBuilder.toString());
        return new n();
    }

    public int[] b() {
        P[] arrp;
        int[] arrn = new int[this.b.length];
        for (int i8 = 0; i8 < (arrp = this.b).length; ++i8) {
            arrn[i8] = arrp[i8].H();
        }
        return arrn;
    }

    public void c(long l8) {
        P[] arrp = this.b;
        int n8 = arrp.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            arrp[i8].b0(l8);
        }
    }
}

