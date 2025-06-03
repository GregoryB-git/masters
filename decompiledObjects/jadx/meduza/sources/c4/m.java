package c4;

import c4.o;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class m {
    public static o.a a(v5.u uVar) {
        uVar.H(1);
        int x10 = uVar.x();
        long j10 = uVar.f15975b + x10;
        int i10 = x10 / 18;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long o10 = uVar.o();
            if (o10 == -1) {
                jArr = Arrays.copyOf(jArr, i11);
                jArr2 = Arrays.copyOf(jArr2, i11);
                break;
            }
            jArr[i11] = o10;
            jArr2[i11] = uVar.o();
            uVar.H(2);
            i11++;
        }
        uVar.H((int) (j10 - uVar.f15975b));
        return new o.a(jArr, jArr2);
    }
}
