package pa;

import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.HashMap;
import java.util.List;
import v3.d0;
import v3.e1;
import v3.f1;
import v3.i0;
import v3.m;
import v3.n;
import v3.o0;
import v3.p0;
import v3.r1;
import v3.s1;
import w5.o;

/* loaded from: classes.dex */
public final class e implements f1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f13077a;

    public e(b bVar) {
        this.f13077a = bVar;
    }

    @Override // v3.f1.c
    public final /* synthetic */ void D(boolean z10) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void F(f1.a aVar) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void G(int i10, f1.d dVar, f1.d dVar2) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void I(boolean z10) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void K(int i10, boolean z10) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void L(float f) {
    }

    @Override // v3.f1.c
    public final void N(int i10) {
        HashMap hashMap;
        String str;
        i0 i0Var;
        if (i10 == 2) {
            this.f13077a.d(true);
            hashMap = new HashMap();
            str = "bufferingStart";
        } else {
            if (i10 != 3) {
                if (i10 != 4) {
                    return;
                }
                hashMap = new HashMap();
                hashMap.put("event", "completed");
                hashMap.put(Constants.KEY, this.f13077a.f13056h);
                this.f13077a.f13053d.success(hashMap);
            }
            b bVar = this.f13077a;
            if (!bVar.f) {
                bVar.f = true;
                HashMap hashMap2 = new HashMap();
                hashMap2.put("event", "initialized");
                hashMap2.put(Constants.KEY, bVar.f13056h);
                d0 d0Var = bVar.f13052c;
                hashMap2.put("duration", Long.valueOf(d0Var != null ? d0Var.getDuration() : 0L));
                d0 d0Var2 = bVar.f13052c;
                if (d0Var2 != null) {
                    d0Var2.u0();
                    i0Var = d0Var2.P;
                } else {
                    i0Var = null;
                }
                if (i0Var != null) {
                    d0 d0Var3 = bVar.f13052c;
                    d0Var3.u0();
                    i0 i0Var2 = d0Var3.P;
                    Integer valueOf = i0Var2 != null ? Integer.valueOf(i0Var2.f15461y) : null;
                    Integer valueOf2 = i0Var2 != null ? Integer.valueOf(i0Var2.f15462z) : null;
                    Integer valueOf3 = i0Var2 != null ? Integer.valueOf(i0Var2.B) : null;
                    if ((valueOf3 != null && valueOf3.intValue() == 90) || (valueOf3 != null && valueOf3.intValue() == 270)) {
                        d0 d0Var4 = bVar.f13052c;
                        d0Var4.u0();
                        i0 i0Var3 = d0Var4.P;
                        valueOf = i0Var3 != null ? Integer.valueOf(i0Var3.f15462z) : null;
                        d0 d0Var5 = bVar.f13052c;
                        d0Var5.u0();
                        i0 i0Var4 = d0Var5.P;
                        valueOf2 = i0Var4 != null ? Integer.valueOf(i0Var4.f15461y) : null;
                    }
                    hashMap2.put("width", valueOf);
                    hashMap2.put("height", valueOf2);
                }
                bVar.f13053d.success(hashMap2);
            }
            hashMap = new HashMap();
            str = "bufferingEnd";
        }
        hashMap.put("event", str);
        this.f13077a.f13053d.success(hashMap);
    }

    @Override // v3.f1.c
    public final /* synthetic */ void R(p0 p0Var) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void T(boolean z10) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void W(int i10, boolean z10) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void X(n nVar) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void Y(r1 r1Var, int i10) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void Z(s1 s1Var) {
    }

    @Override // v3.f1.c
    public final void a0(n nVar) {
        ec.i.e(nVar, "error");
        this.f13077a.f13053d.error("VideoError", "Video player had error " + nVar, "");
    }

    @Override // v3.f1.c
    public final /* synthetic */ void b(o oVar) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void b0(int i10, boolean z10) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void c0(e1 e1Var) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void d(int i10) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void d0(x3.d dVar) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void e0(f1 f1Var, f1.b bVar) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void f() {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void j(h5.c cVar) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void k0(o0 o0Var, int i10) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void l0(m mVar) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void m() {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void m0(int i10, int i11) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void o(boolean z10) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void p0(boolean z10) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void q(int i10) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void r(List list) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void w(p4.a aVar) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void x(int i10) {
    }
}
