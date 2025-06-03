package e5;

import e5.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import v3.i0;
import v5.e0;
import z4.c0;

/* loaded from: classes.dex */
public final class m implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f4006a;

    /* renamed from: b, reason: collision with root package name */
    public final n f4007b;

    /* renamed from: c, reason: collision with root package name */
    public int f4008c = -1;

    public m(n nVar, int i10) {
        this.f4007b = nVar;
        this.f4006a = i10;
    }

    @Override // z4.c0
    public final void a() {
        int i10 = this.f4008c;
        if (i10 == -2) {
            n nVar = this.f4007b;
            nVar.b();
            throw new c5.b(nVar.Q.a(this.f4006a).f17687d[0].t);
        }
        if (i10 == -1) {
            this.f4007b.D();
        } else if (i10 != -3) {
            n nVar2 = this.f4007b;
            nVar2.D();
            nVar2.D[i10].s();
        }
    }

    @Override // z4.c0
    public final boolean b() {
        int i10 = this.f4008c;
        if (i10 == -3) {
            return true;
        }
        if ((i10 == -1 || i10 == -3 || i10 == -2) ? false : true) {
            n nVar = this.f4007b;
            if (!nVar.B() && nVar.D[i10].q(nVar.f4013b0)) {
                return true;
            }
        }
        return false;
    }

    public final void c() {
        x6.b.q(this.f4008c == -1);
        n nVar = this.f4007b;
        int i10 = this.f4006a;
        nVar.b();
        nVar.S.getClass();
        int i11 = nVar.S[i10];
        if (i11 == -1) {
            if (nVar.R.contains(nVar.Q.a(i10))) {
                i11 = -3;
            }
            i11 = -2;
        } else {
            boolean[] zArr = nVar.V;
            if (!zArr[i11]) {
                zArr[i11] = true;
            }
            i11 = -2;
        }
        this.f4008c = i11;
    }

    @Override // z4.c0
    public final int m(long j10) {
        int i10 = this.f4008c;
        if (!((i10 == -1 || i10 == -3 || i10 == -2) ? false : true)) {
            return 0;
        }
        n nVar = this.f4007b;
        if (nVar.B()) {
            return 0;
        }
        n.c cVar = nVar.D[i10];
        int o10 = cVar.o(j10, nVar.f4013b0);
        ArrayList<j> arrayList = nVar.f4027v;
        j jVar = null;
        if (!(arrayList instanceof Collection)) {
            Iterator<j> it = arrayList.iterator();
            if (it.hasNext()) {
                do {
                    jVar = it.next();
                } while (it.hasNext());
            }
        } else if (!arrayList.isEmpty()) {
            jVar = arrayList.get(arrayList.size() - 1);
        }
        j jVar2 = jVar;
        if (jVar2 != null && !jVar2.K) {
            o10 = Math.min(o10, jVar2.g(i10) - (cVar.f17586q + cVar.f17588s));
        }
        cVar.y(o10);
        return o10;
    }

    @Override // z4.c0
    public final int r(l3.l lVar, z3.g gVar, int i10) {
        int i11;
        i0 i0Var;
        i0 i0Var2;
        boolean z10;
        int i12;
        int i13 = this.f4008c;
        if (i13 == -3) {
            gVar.l(4);
            return -4;
        }
        int i14 = 0;
        if ((i13 == -1 || i13 == -3 || i13 == -2) ? false : true) {
            n nVar = this.f4007b;
            if (!nVar.B()) {
                if (!nVar.f4027v.isEmpty()) {
                    int i15 = 0;
                    while (i15 < nVar.f4027v.size() - 1) {
                        int i16 = nVar.f4027v.get(i15).f3974k;
                        int length = nVar.D.length;
                        int i17 = 0;
                        while (true) {
                            if (i17 >= length) {
                                z10 = true;
                                break;
                            }
                            if (nVar.V[i17]) {
                                n.c cVar = nVar.D[i17];
                                synchronized (cVar) {
                                    i12 = cVar.f17588s != cVar.f17585p ? cVar.f17579j[cVar.n(cVar.f17588s)] : cVar.C;
                                }
                                if (i12 == i16) {
                                    z10 = false;
                                    break;
                                }
                            }
                            i17++;
                        }
                        if (!z10) {
                            break;
                        }
                        i15++;
                    }
                    e0.N(0, i15, nVar.f4027v);
                    j jVar = nVar.f4027v.get(0);
                    i0 i0Var3 = jVar.f1864d;
                    if (i0Var3.equals(nVar.O)) {
                        i0Var2 = i0Var3;
                    } else {
                        i0Var2 = i0Var3;
                        nVar.f4025s.b(nVar.f4012b, i0Var3, jVar.f1865e, jVar.f, jVar.f1866g);
                    }
                    nVar.O = i0Var2;
                }
                if (nVar.f4027v.isEmpty() || nVar.f4027v.get(0).K) {
                    int u10 = nVar.D[i13].u(lVar, gVar, i10, nVar.f4013b0);
                    if (u10 != -5) {
                        return u10;
                    }
                    i0 i0Var4 = (i0) lVar.f9560b;
                    i0Var4.getClass();
                    if (i13 == nVar.J) {
                        n.c cVar2 = nVar.D[i13];
                        synchronized (cVar2) {
                            i11 = cVar2.f17588s != cVar2.f17585p ? cVar2.f17579j[cVar2.n(cVar2.f17588s)] : cVar2.C;
                        }
                        while (i14 < nVar.f4027v.size() && nVar.f4027v.get(i14).f3974k != i11) {
                            i14++;
                        }
                        if (i14 < nVar.f4027v.size()) {
                            i0Var = nVar.f4027v.get(i14).f1864d;
                        } else {
                            i0Var = nVar.N;
                            i0Var.getClass();
                        }
                        i0Var4 = i0Var4.d(i0Var);
                    }
                    lVar.f9560b = i0Var4;
                    return u10;
                }
            }
        }
        return -3;
    }
}
