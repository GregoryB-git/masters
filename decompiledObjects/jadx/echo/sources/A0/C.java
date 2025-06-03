package A0;

import A0.A;
import B0.m;
import X2.AbstractC0703v;
import android.os.SystemClock;
import d0.C1171J;
import d0.C1173L;
import java.util.Arrays;
import java.util.List;
import x0.Z;

/* loaded from: classes.dex */
public abstract class C {
    public static C1173L a(A.a aVar, B[] bArr) {
        List[] listArr = new List[bArr.length];
        for (int i7 = 0; i7 < bArr.length; i7++) {
            B b7 = bArr[i7];
            listArr[i7] = b7 != null ? AbstractC0703v.Z(b7) : AbstractC0703v.Y();
        }
        return b(aVar, listArr);
    }

    public static C1173L b(A.a aVar, List[] listArr) {
        boolean z7;
        AbstractC0703v.a aVar2 = new AbstractC0703v.a();
        for (int i7 = 0; i7 < aVar.d(); i7++) {
            Z f7 = aVar.f(i7);
            List list = listArr[i7];
            for (int i8 = 0; i8 < f7.f20702a; i8++) {
                C1171J b7 = f7.b(i8);
                boolean z8 = aVar.a(i7, i8, false) != 0;
                int i9 = b7.f12438a;
                int[] iArr = new int[i9];
                boolean[] zArr = new boolean[i9];
                for (int i10 = 0; i10 < b7.f12438a; i10++) {
                    iArr[i10] = aVar.g(i7, i8, i10);
                    int i11 = 0;
                    while (true) {
                        if (i11 >= list.size()) {
                            z7 = false;
                            break;
                        }
                        B b8 = (B) list.get(i11);
                        if (b8.d().equals(b7) && b8.e(i10) != -1) {
                            z7 = true;
                            break;
                        }
                        i11++;
                    }
                    zArr[i10] = z7;
                }
                aVar2.a(new C1173L.a(b7, z8, iArr, zArr));
            }
        }
        Z h7 = aVar.h();
        for (int i12 = 0; i12 < h7.f20702a; i12++) {
            C1171J b9 = h7.b(i12);
            int[] iArr2 = new int[b9.f12438a];
            Arrays.fill(iArr2, 0);
            aVar2.a(new C1173L.a(b9, false, iArr2, new boolean[b9.f12438a]));
        }
        return new C1173L(aVar2.k());
    }

    public static m.a c(y yVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = yVar.length();
        int i7 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            if (yVar.i(i8, elapsedRealtime)) {
                i7++;
            }
        }
        return new m.a(1, 0, length, i7);
    }
}
