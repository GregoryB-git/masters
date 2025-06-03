package y2;

import java.util.Set;
import p2.q0;

/* loaded from: classes.dex */
public final class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final p2.r f17402a;

    /* renamed from: b, reason: collision with root package name */
    public final p2.x f17403b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f17404c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17405d;

    public t(p2.r rVar, p2.x xVar, boolean z10, int i10) {
        ec.i.e(rVar, "processor");
        ec.i.e(xVar, "token");
        this.f17402a = rVar;
        this.f17403b = xVar;
        this.f17404c = z10;
        this.f17405d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean d10;
        q0 b10;
        if (this.f17404c) {
            p2.r rVar = this.f17402a;
            p2.x xVar = this.f17403b;
            int i10 = this.f17405d;
            rVar.getClass();
            String str = xVar.f12965a.f16820a;
            synchronized (rVar.f12953k) {
                b10 = rVar.b(str);
            }
            d10 = p2.r.d(str, b10, i10);
        } else {
            p2.r rVar2 = this.f17402a;
            p2.x xVar2 = this.f17403b;
            int i11 = this.f17405d;
            rVar2.getClass();
            String str2 = xVar2.f12965a.f16820a;
            synchronized (rVar2.f12953k) {
                if (rVar2.f.get(str2) != null) {
                    o2.j.d().a(p2.r.f12943l, "Ignored stopWork. WorkerWrapper " + str2 + " is in foreground");
                } else {
                    Set set = (Set) rVar2.f12950h.get(str2);
                    if (set != null && set.contains(xVar2)) {
                        d10 = p2.r.d(str2, rVar2.b(str2), i11);
                    }
                }
                d10 = false;
            }
        }
        o2.j d11 = o2.j.d();
        String f = o2.j.f("StopWorkRunnable");
        StringBuilder l10 = defpackage.f.l("StopWorkRunnable for ");
        l10.append(this.f17403b.f12965a.f16820a);
        l10.append("; Processor.stopWork = ");
        l10.append(d10);
        d11.a(f, l10.toString());
    }
}
