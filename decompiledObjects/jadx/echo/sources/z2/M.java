package z2;

import A2.AbstractC0328n;
import A2.C0318d;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.Set;
import x2.C2188b;
import y2.C2270a;
import y2.e;

/* loaded from: classes.dex */
public final class M extends T2.d implements e.a, e.b {

    /* renamed from: i, reason: collision with root package name */
    public static final C2270a.AbstractC0301a f21667i = S2.d.f5847c;

    /* renamed from: b, reason: collision with root package name */
    public final Context f21668b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f21669c;

    /* renamed from: d, reason: collision with root package name */
    public final C2270a.AbstractC0301a f21670d;

    /* renamed from: e, reason: collision with root package name */
    public final Set f21671e;

    /* renamed from: f, reason: collision with root package name */
    public final C0318d f21672f;

    /* renamed from: g, reason: collision with root package name */
    public S2.e f21673g;

    /* renamed from: h, reason: collision with root package name */
    public L f21674h;

    public M(Context context, Handler handler, C0318d c0318d) {
        C2270a.AbstractC0301a abstractC0301a = f21667i;
        this.f21668b = context;
        this.f21669c = handler;
        this.f21672f = (C0318d) AbstractC0328n.j(c0318d, "ClientSettings must not be null");
        this.f21671e = c0318d.e();
        this.f21670d = abstractC0301a;
    }

    public static /* bridge */ /* synthetic */ void b1(M m7, T2.l lVar) {
        C2188b a7 = lVar.a();
        if (a7.i()) {
            A2.I i7 = (A2.I) AbstractC0328n.i(lVar.d());
            a7 = i7.a();
            if (a7.i()) {
                m7.f21674h.c(i7.d(), m7.f21671e);
                m7.f21673g.c();
            } else {
                String valueOf = String.valueOf(a7);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
            }
        }
        m7.f21674h.a(a7);
        m7.f21673g.c();
    }

    @Override // T2.f
    public final void K(T2.l lVar) {
        this.f21669c.post(new K(this, lVar));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [S2.e, y2.a$f] */
    public final void c1(L l7) {
        S2.e eVar = this.f21673g;
        if (eVar != null) {
            eVar.c();
        }
        this.f21672f.i(Integer.valueOf(System.identityHashCode(this)));
        C2270a.AbstractC0301a abstractC0301a = this.f21670d;
        Context context = this.f21668b;
        Looper looper = this.f21669c.getLooper();
        C0318d c0318d = this.f21672f;
        this.f21673g = abstractC0301a.a(context, looper, c0318d, c0318d.f(), this, this);
        this.f21674h = l7;
        Set set = this.f21671e;
        if (set == null || set.isEmpty()) {
            this.f21669c.post(new J(this));
        } else {
            this.f21673g.n();
        }
    }

    public final void d1() {
        S2.e eVar = this.f21673g;
        if (eVar != null) {
            eVar.c();
        }
    }

    @Override // z2.InterfaceC2301d
    public final void n(int i7) {
        this.f21673g.c();
    }

    @Override // z2.InterfaceC2307j
    public final void o(C2188b c2188b) {
        this.f21674h.a(c2188b);
    }

    @Override // z2.InterfaceC2301d
    public final void v(Bundle bundle) {
        this.f21673g.d(this);
    }
}
