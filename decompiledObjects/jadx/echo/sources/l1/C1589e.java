package l1;

import F0.AbstractC0358c;
import F0.AbstractC0372q;
import F0.AbstractC0377w;
import F0.InterfaceC0373s;
import F0.InterfaceC0374t;
import F0.InterfaceC0378x;
import F0.M;
import android.net.Uri;
import java.util.List;
import java.util.Map;
import l1.K;

/* renamed from: l1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1589e implements F0.r {

    /* renamed from: d, reason: collision with root package name */
    public static final InterfaceC0378x f16843d = new InterfaceC0378x() { // from class: l1.d
        @Override // F0.InterfaceC0378x
        public final F0.r[] a() {
            F0.r[] f7;
            f7 = C1589e.f();
            return f7;
        }

        @Override // F0.InterfaceC0378x
        public /* synthetic */ F0.r[] b(Uri uri, Map map) {
            return AbstractC0377w.a(this, uri, map);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final C1590f f16844a = new C1590f();

    /* renamed from: b, reason: collision with root package name */
    public final g0.z f16845b = new g0.z(16384);

    /* renamed from: c, reason: collision with root package name */
    public boolean f16846c;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ F0.r[] f() {
        return new F0.r[]{new C1589e()};
    }

    @Override // F0.r
    public void a(long j7, long j8) {
        this.f16846c = false;
        this.f16844a.b();
    }

    @Override // F0.r
    public void b(InterfaceC0374t interfaceC0374t) {
        this.f16844a.e(interfaceC0374t, new K.d(0, 1));
        interfaceC0374t.j();
        interfaceC0374t.e(new M.b(-9223372036854775807L));
    }

    @Override // F0.r
    public /* synthetic */ F0.r d() {
        return AbstractC0372q.b(this);
    }

    @Override // F0.r
    public boolean e(InterfaceC0373s interfaceC0373s) {
        g0.z zVar = new g0.z(10);
        int i7 = 0;
        while (true) {
            interfaceC0373s.n(zVar.e(), 0, 10);
            zVar.T(0);
            if (zVar.J() != 4801587) {
                break;
            }
            zVar.U(3);
            int F6 = zVar.F();
            i7 += F6 + 10;
            interfaceC0373s.o(F6);
        }
        interfaceC0373s.h();
        interfaceC0373s.o(i7);
        int i8 = 0;
        int i9 = i7;
        while (true) {
            interfaceC0373s.n(zVar.e(), 0, 7);
            zVar.T(0);
            int M6 = zVar.M();
            if (M6 == 44096 || M6 == 44097) {
                i8++;
                if (i8 >= 4) {
                    return true;
                }
                int e7 = AbstractC0358c.e(zVar.e(), M6);
                if (e7 == -1) {
                    return false;
                }
                interfaceC0373s.o(e7 - 7);
            } else {
                interfaceC0373s.h();
                i9++;
                if (i9 - i7 >= 8192) {
                    return false;
                }
                interfaceC0373s.o(i9);
                i8 = 0;
            }
        }
    }

    @Override // F0.r
    public /* synthetic */ List g() {
        return AbstractC0372q.a(this);
    }

    @Override // F0.r
    public int i(InterfaceC0373s interfaceC0373s, F0.L l7) {
        int read = interfaceC0373s.read(this.f16845b.e(), 0, 16384);
        if (read == -1) {
            return -1;
        }
        this.f16845b.T(0);
        this.f16845b.S(read);
        if (!this.f16846c) {
            this.f16844a.d(0L, 4);
            this.f16846c = true;
        }
        this.f16844a.a(this.f16845b);
        return 0;
    }

    @Override // F0.r
    public void release() {
    }
}
