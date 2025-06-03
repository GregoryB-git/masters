package k1;

import android.text.TextUtils;
import c1.k;
import c1.s;
import c1.t;
import d0.C1162A;
import g0.InterfaceC1303g;
import g0.z;
import java.util.ArrayList;

/* renamed from: k1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1456g implements t {

    /* renamed from: a, reason: collision with root package name */
    public final z f16128a = new z();

    /* renamed from: b, reason: collision with root package name */
    public final C1451b f16129b = new C1451b();

    public static int e(z zVar) {
        int i7 = -1;
        int i8 = 0;
        while (i7 == -1) {
            i8 = zVar.f();
            String r7 = zVar.r();
            i7 = r7 == null ? 0 : "STYLE".equals(r7) ? 2 : r7.startsWith("NOTE") ? 1 : 3;
        }
        zVar.T(i8);
        return i7;
    }

    public static void f(z zVar) {
        while (!TextUtils.isEmpty(zVar.r())) {
        }
    }

    @Override // c1.t
    public /* synthetic */ k a(byte[] bArr, int i7, int i8) {
        return s.a(this, bArr, i7, i8);
    }

    @Override // c1.t
    public /* synthetic */ void b() {
        s.b(this);
    }

    @Override // c1.t
    public void c(byte[] bArr, int i7, int i8, t.b bVar, InterfaceC1303g interfaceC1303g) {
        C1453d m7;
        this.f16128a.R(bArr, i8 + i7);
        this.f16128a.T(i7);
        ArrayList arrayList = new ArrayList();
        try {
            AbstractC1457h.e(this.f16128a);
            while (!TextUtils.isEmpty(this.f16128a.r())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int e7 = e(this.f16128a);
                if (e7 == 0) {
                    c1.i.c(new C1459j(arrayList2), bVar, interfaceC1303g);
                    return;
                }
                if (e7 == 1) {
                    f(this.f16128a);
                } else if (e7 == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    this.f16128a.r();
                    arrayList.addAll(this.f16129b.d(this.f16128a));
                } else if (e7 == 3 && (m7 = AbstractC1454e.m(this.f16128a, arrayList)) != null) {
                    arrayList2.add(m7);
                }
            }
        } catch (C1162A e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    @Override // c1.t
    public int d() {
        return 1;
    }
}
