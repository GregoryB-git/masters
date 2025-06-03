package m4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m4.d0;
import v3.i0;

/* loaded from: classes.dex */
public final class g implements d0.c {

    /* renamed from: a, reason: collision with root package name */
    public final int f9986a;

    /* renamed from: b, reason: collision with root package name */
    public final List<i0> f9987b;

    public g(int i10, List<i0> list) {
        this.f9986a = i10;
        this.f9987b = list;
    }

    @Override // m4.d0.c
    public final d0 a(int i10, d0.b bVar) {
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                return new t(new q(bVar.f9945a));
            }
            if (i10 == 21) {
                return new t(new o());
            }
            if (i10 == 27) {
                if (c(4)) {
                    return null;
                }
                return new t(new m(new z(b(bVar)), c(1), c(8)));
            }
            if (i10 == 36) {
                return new t(new n(new z(b(bVar))));
            }
            if (i10 == 89) {
                return new t(new i(bVar.f9946b));
            }
            if (i10 != 138) {
                if (i10 == 172) {
                    return new t(new d(bVar.f9945a));
                }
                if (i10 == 257) {
                    return new y(new s("application/vnd.dvb.ait"));
                }
                if (i10 == 134) {
                    if (c(16)) {
                        return null;
                    }
                    return new y(new s("application/x-scte35"));
                }
                if (i10 != 135) {
                    switch (i10) {
                        case 15:
                            if (!c(2)) {
                                break;
                            }
                            break;
                        case 16:
                            break;
                        case 17:
                            if (!c(2)) {
                                break;
                            }
                            break;
                        default:
                            switch (i10) {
                                case 130:
                                    if (!c(64)) {
                                    }
                                    break;
                            }
                    }
                    return null;
                }
                return new t(new b(bVar.f9945a));
            }
            return new t(new h(bVar.f9945a));
        }
        return new t(new k(new e0(b(bVar))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4 */
    public final List<i0> b(d0.b bVar) {
        String str;
        int i10;
        if (c(32)) {
            return this.f9987b;
        }
        v5.u uVar = new v5.u(bVar.f9947c);
        ArrayList arrayList = this.f9987b;
        while (uVar.f15976c - uVar.f15975b > 0) {
            int v10 = uVar.v();
            int v11 = uVar.f15975b + uVar.v();
            if (v10 == 134) {
                arrayList = new ArrayList();
                int v12 = uVar.v() & 31;
                for (int i11 = 0; i11 < v12; i11++) {
                    String s10 = uVar.s(3);
                    int v13 = uVar.v();
                    boolean z10 = (v13 & 128) != 0;
                    if (z10) {
                        i10 = v13 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte v14 = (byte) uVar.v();
                    uVar.H(1);
                    List<byte[]> list = null;
                    if (z10) {
                        list = Collections.singletonList((v14 & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    }
                    i0.a aVar = new i0.a();
                    aVar.f15472k = str;
                    aVar.f15465c = s10;
                    aVar.C = i10;
                    aVar.f15474m = list;
                    arrayList.add(new i0(aVar));
                }
            }
            uVar.G(v11);
            arrayList = arrayList;
        }
        return arrayList;
    }

    public final boolean c(int i10) {
        return (i10 & this.f9986a) != 0;
    }
}
