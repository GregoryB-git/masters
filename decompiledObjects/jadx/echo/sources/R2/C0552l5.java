package R2;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.HandlerC1026t0;

/* renamed from: R2.l5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0552l5 extends AbstractC0506f1 {

    /* renamed from: c, reason: collision with root package name */
    public Handler f5415c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5416d;

    /* renamed from: e, reason: collision with root package name */
    public final C0607t5 f5417e;

    /* renamed from: f, reason: collision with root package name */
    public final C0593r5 f5418f;

    /* renamed from: g, reason: collision with root package name */
    public final C0587q5 f5419g;

    public C0552l5(N2 n22) {
        super(n22);
        this.f5416d = true;
        this.f5417e = new C0607t5(this);
        this.f5418f = new C0593r5(this);
        this.f5419g = new C0587q5(this);
    }

    public static /* synthetic */ void C(C0552l5 c0552l5, long j7) {
        c0552l5.n();
        c0552l5.G();
        c0552l5.j().K().b("Activity paused, time", Long.valueOf(j7));
        c0552l5.f5419g.b(j7);
        if (c0552l5.f().Q()) {
            c0552l5.f5418f.e(j7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G() {
        n();
        if (this.f5415c == null) {
            this.f5415c = new HandlerC1026t0(Looper.getMainLooper());
        }
    }

    public static /* synthetic */ void I(C0552l5 c0552l5, long j7) {
        c0552l5.n();
        c0552l5.G();
        c0552l5.j().K().b("Activity resumed, time", Long.valueOf(j7));
        if (!c0552l5.f().s(K.f4799Q0) ? c0552l5.f().Q() || c0552l5.i().f5402s.b() : c0552l5.f().Q() || c0552l5.f5416d) {
            c0552l5.f5418f.f(j7);
        }
        c0552l5.f5419g.a();
        C0607t5 c0607t5 = c0552l5.f5417e;
        c0607t5.f5544a.n();
        if (c0607t5.f5544a.f5424a.p()) {
            c0607t5.b(c0607t5.f5544a.b().a(), false);
        }
    }

    @Override // R2.AbstractC0506f1
    public final boolean A() {
        return false;
    }

    public final void D(boolean z7) {
        n();
        this.f5416d = z7;
    }

    public final boolean E(boolean z7, boolean z8, long j7) {
        return this.f5418f.d(z7, z8, j7);
    }

    public final boolean F() {
        n();
        return this.f5416d;
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ E2.e b() {
        return super.b();
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ C0504f d() {
        return super.d();
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ G2 e() {
        return super.e();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ C0511g f() {
        return super.f();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ C g() {
        return super.g();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ X1 h() {
        return super.h();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ C0549l2 i() {
        return super.i();
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ Y1 j() {
        return super.j();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ S5 k() {
        return super.k();
    }

    @Override // R2.G1, R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    @Override // R2.G1, R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // R2.G1, R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    @Override // R2.G1
    public final /* bridge */ /* synthetic */ B o() {
        return super.o();
    }

    @Override // R2.G1
    public final /* bridge */ /* synthetic */ S1 p() {
        return super.p();
    }

    @Override // R2.G1
    public final /* bridge */ /* synthetic */ V1 q() {
        return super.q();
    }

    @Override // R2.G1
    public final /* bridge */ /* synthetic */ C3 r() {
        return super.r();
    }

    @Override // R2.G1
    public final /* bridge */ /* synthetic */ C0620v4 s() {
        return super.s();
    }

    @Override // R2.G1
    public final /* bridge */ /* synthetic */ D4 t() {
        return super.t();
    }

    @Override // R2.G1
    public final /* bridge */ /* synthetic */ C0552l5 u() {
        return super.u();
    }
}
