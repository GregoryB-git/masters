package l1;

import X2.AbstractC0703v;
import android.util.SparseArray;
import d0.C1194q;
import g0.AbstractC1300d;
import java.util.ArrayList;
import java.util.List;
import l1.K;

/* renamed from: l1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1594j implements K.c {

    /* renamed from: a, reason: collision with root package name */
    public final int f16897a;

    /* renamed from: b, reason: collision with root package name */
    public final List f16898b;

    public C1594j(int i7) {
        this(i7, AbstractC0703v.Y());
    }

    @Override // l1.K.c
    public SparseArray a() {
        return new SparseArray();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0057  */
    @Override // l1.K.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public l1.K b(int r5, l1.K.b r6) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.C1594j.b(int, l1.K$b):l1.K");
    }

    public final F c(K.b bVar) {
        return new F(e(bVar));
    }

    public final M d(K.b bVar) {
        return new M(e(bVar));
    }

    public final List e(K.b bVar) {
        String str;
        int i7;
        if (f(32)) {
            return this.f16898b;
        }
        g0.z zVar = new g0.z(bVar.f16818e);
        List list = this.f16898b;
        while (zVar.a() > 0) {
            int G6 = zVar.G();
            int f7 = zVar.f() + zVar.G();
            if (G6 == 134) {
                list = new ArrayList();
                int G7 = zVar.G() & 31;
                for (int i8 = 0; i8 < G7; i8++) {
                    String D7 = zVar.D(3);
                    int G8 = zVar.G();
                    boolean z7 = (G8 & 128) != 0;
                    if (z7) {
                        i7 = G8 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i7 = 1;
                    }
                    byte G9 = (byte) zVar.G();
                    zVar.U(1);
                    list.add(new C1194q.b().o0(str).e0(D7).L(i7).b0(z7 ? AbstractC1300d.b((G9 & 64) != 0) : null).K());
                }
            }
            zVar.T(f7);
        }
        return list;
    }

    public final boolean f(int i7) {
        return (i7 & this.f16897a) != 0;
    }

    public C1594j(int i7, List list) {
        this.f16897a = i7;
        this.f16898b = list;
    }
}
