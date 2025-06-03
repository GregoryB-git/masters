package y2;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;
import o2.m;
import o2.o;
import p2.k0;
import p2.q0;

/* loaded from: classes.dex */
public abstract class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final p2.o f17374a = new p2.o();

    public static void a(k0 k0Var, String str) {
        q0 b10;
        WorkDatabase workDatabase = k0Var.f12879c;
        x2.t u10 = workDatabase.u();
        x2.b p10 = workDatabase.p();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            o.b s10 = u10.s(str2);
            if (s10 != o.b.SUCCEEDED && s10 != o.b.FAILED) {
                u10.w(str2);
            }
            linkedList.addAll(p10.a(str2));
        }
        p2.r rVar = k0Var.f;
        synchronized (rVar.f12953k) {
            o2.j.d().a(p2.r.f12943l, "Processor cancelling " + str);
            rVar.f12951i.add(str);
            b10 = rVar.b(str);
        }
        p2.r.d(str, b10, 1);
        Iterator<p2.t> it = k0Var.f12881e.iterator();
        while (it.hasNext()) {
            it.next().c(str);
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
            this.f17374a.a(o2.m.f11723a);
        } catch (Throwable th) {
            this.f17374a.a(new m.a.C0184a(th));
        }
    }
}
