package l1;

import F0.AbstractC0357b;
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

/* renamed from: l1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1586b implements F0.r {

    /* renamed from: d, reason: collision with root package name */
    public static final InterfaceC0378x f16826d = new InterfaceC0378x() { // from class: l1.a
        @Override // F0.InterfaceC0378x
        public final F0.r[] a() {
            F0.r[] f7;
            f7 = C1586b.f();
            return f7;
        }

        @Override // F0.InterfaceC0378x
        public /* synthetic */ F0.r[] b(Uri uri, Map map) {
            return AbstractC0377w.a(this, uri, map);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final C1587c f16827a = new C1587c();

    /* renamed from: b, reason: collision with root package name */
    public final g0.z f16828b = new g0.z(2786);

    /* renamed from: c, reason: collision with root package name */
    public boolean f16829c;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ F0.r[] f() {
        return new F0.r[]{new C1586b()};
    }

    @Override // F0.r
    public void a(long j7, long j8) {
        this.f16829c = false;
        this.f16827a.b();
    }

    @Override // F0.r
    public void b(InterfaceC0374t interfaceC0374t) {
        this.f16827a.e(interfaceC0374t, new K.d(0, 1));
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
            interfaceC0373s.n(zVar.e(), 0, 6);
            zVar.T(0);
            if (zVar.M() != 2935) {
                interfaceC0373s.h();
                i9++;
                if (i9 - i7 >= 8192) {
                    return false;
                }
                interfaceC0373s.o(i9);
                i8 = 0;
            } else {
                i8++;
                if (i8 >= 4) {
                    return true;
                }
                int g7 = AbstractC0357b.g(zVar.e());
                if (g7 == -1) {
                    return false;
                }
                interfaceC0373s.o(g7 - 6);
            }
        }
    }

    @Override // F0.r
    public /* synthetic */ List g() {
        return AbstractC0372q.a(this);
    }

    @Override // F0.r
    public int i(InterfaceC0373s interfaceC0373s, F0.L l7) {
        int read = interfaceC0373s.read(this.f16828b.e(), 0, 2786);
        if (read == -1) {
            return -1;
        }
        this.f16828b.T(0);
        this.f16828b.S(read);
        if (!this.f16829c) {
            this.f16827a.d(0L, 4);
            this.f16829c = true;
        }
        this.f16827a.a(this.f16828b);
        return 0;
    }

    @Override // F0.r
    public void release() {
    }
}
