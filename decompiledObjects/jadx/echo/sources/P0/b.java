package P0;

import O0.c;
import W2.e;
import d0.C1201x;
import g0.y;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b extends c {
    public static C1201x c(y yVar) {
        yVar.r(12);
        int d7 = (yVar.d() + yVar.h(12)) - 4;
        yVar.r(44);
        yVar.s(yVar.h(12));
        yVar.r(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String str = null;
            if (yVar.d() >= d7) {
                break;
            }
            yVar.r(48);
            int h7 = yVar.h(8);
            yVar.r(4);
            int d8 = yVar.d() + yVar.h(12);
            String str2 = null;
            while (yVar.d() < d8) {
                int h8 = yVar.h(8);
                int h9 = yVar.h(8);
                int d9 = yVar.d() + h9;
                if (h8 == 2) {
                    int h10 = yVar.h(16);
                    yVar.r(8);
                    if (h10 == 3) {
                        while (yVar.d() < d9) {
                            str = yVar.l(yVar.h(8), e.f6819a);
                            int h11 = yVar.h(8);
                            for (int i7 = 0; i7 < h11; i7++) {
                                yVar.s(yVar.h(8));
                            }
                        }
                    }
                } else if (h8 == 21) {
                    str2 = yVar.l(h9, e.f6819a);
                }
                yVar.p(d9 * 8);
            }
            yVar.p(d8 * 8);
            if (str != null && str2 != null) {
                arrayList.add(new a(h7, str + str2));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C1201x(arrayList);
    }

    @Override // O0.c
    public C1201x b(O0.b bVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return c(new y(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }
}
