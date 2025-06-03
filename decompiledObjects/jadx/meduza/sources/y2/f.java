package y2;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.HashSet;
import o2.m;
import p2.k0;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    public static final String f17375c = o2.j.f("EnqueueRunnable");

    /* renamed from: a, reason: collision with root package name */
    public final p2.y f17376a;

    /* renamed from: b, reason: collision with root package name */
    public final p2.o f17377b;

    public f(p2.y yVar) {
        p2.o oVar = new p2.o();
        this.f17376a = yVar;
        this.f17377b = oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x032e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d6  */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(p2.y r61) {
        /*
            Method dump skipped, instructions count: 839
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.f.a(p2.y):boolean");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            p2.y yVar = this.f17376a;
            yVar.getClass();
            if (p2.y.v(yVar, new HashSet())) {
                throw new IllegalStateException("WorkContinuation has cycles (" + this.f17376a + ")");
            }
            k0 k0Var = this.f17376a.f12967b;
            WorkDatabase workDatabase = k0Var.f12879c;
            workDatabase.c();
            try {
                g.a(workDatabase, k0Var.f12878b, this.f17376a);
                boolean a10 = a(this.f17376a);
                workDatabase.n();
                if (a10) {
                    o.a(this.f17376a.f12967b.f12877a, RescheduleReceiver.class, true);
                    k0 k0Var2 = this.f17376a.f12967b;
                    p2.w.b(k0Var2.f12878b, k0Var2.f12879c, k0Var2.f12881e);
                }
                this.f17377b.a(o2.m.f11723a);
            } finally {
                workDatabase.j();
            }
        } catch (Throwable th) {
            this.f17377b.a(new m.a.C0184a(th));
        }
    }
}
