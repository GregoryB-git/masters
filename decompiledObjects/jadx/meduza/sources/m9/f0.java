package m9;

import eb.e1;
import i9.m1;
import java.util.Iterator;
import java.util.Locale;
import m9.p0;
import n9.a;

/* loaded from: classes.dex */
public final class f0 implements p0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h0 f10785a;

    public f0(h0 h0Var) {
        this.f10785a = h0Var;
    }

    @Override // m9.j0
    public final void a() {
        h0 h0Var = this.f10785a;
        Iterator it = h0Var.f.values().iterator();
        while (it.hasNext()) {
            h0Var.f((m1) it.next());
        }
    }

    @Override // m9.j0
    public final void c(e1 e1Var) {
        h0 h0Var = this.f10785a;
        h0Var.getClass();
        g9.d0 d0Var = g9.d0.UNKNOWN;
        if (e1Var.e()) {
            x6.b.Z("Watch stream was stopped gracefully while still needed.", !h0Var.g(), new Object[0]);
        }
        h0Var.f10803k = null;
        if (!h0Var.g()) {
            h0Var.f10799g.c(d0Var);
            return;
        }
        b0 b0Var = h0Var.f10799g;
        if (b0Var.f10750a == g9.d0.ONLINE) {
            b0Var.b(d0Var);
            x6.b.Z("watchStreamFailures must be 0", b0Var.f10751b == 0, new Object[0]);
            x6.b.Z("onlineStateTimer must be null", b0Var.f10752c == null, new Object[0]);
        } else {
            int i10 = b0Var.f10751b + 1;
            b0Var.f10751b = i10;
            if (i10 >= 1) {
                a.C0174a c0174a = b0Var.f10752c;
                if (c0174a != null) {
                    c0174a.a();
                    b0Var.f10752c = null;
                }
                b0Var.a(String.format(Locale.ENGLISH, "Connection failed %d times. Most recent error: %s", 1, e1Var));
                b0Var.b(g9.d0.OFFLINE);
            }
        }
        h0Var.i();
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x01aa, code lost:
    
        if (r0.f10786a == 0) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x043b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x03a7 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List, java.util.List<java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList] */
    @Override // m9.p0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(j9.q r24, m9.n0 r25) {
        /*
            Method dump skipped, instructions count: 1591
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.f0.e(j9.q, m9.n0):void");
    }
}
