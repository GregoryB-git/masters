package m9;

import android.content.Context;
import eb.c;
import eb.d1;
import eb.p0;
import eb.r0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import mb.a;
import n9.a;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10898a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10899b;

    public /* synthetic */ w(Object obj, int i10) {
        this.f10898a = i10;
        this.f10899b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        r0 r0Var;
        List<eb.p0> list;
        switch (this.f10898a) {
            case 0:
                y yVar = (y) this.f10899b;
                Context context = yVar.f10907e;
                g9.h hVar = yVar.f;
                int i10 = 0;
                try {
                    f7.a.a(context);
                } catch (j6.g | j6.h | IllegalStateException e10) {
                    p2.m0.y(2, "GrpcCallProvider", "Failed to update ssl context: %s", e10);
                }
                String str = hVar.f5966c;
                Logger logger = r0.f5195c;
                synchronized (r0.class) {
                    if (r0.f5196d == null) {
                        List<eb.p0> a10 = d1.a(eb.p0.class, r0.a(), eb.p0.class.getClassLoader(), new r0.a());
                        r0.f5196d = new r0();
                        for (eb.p0 p0Var : a10) {
                            r0.f5195c.fine("Service loader found " + p0Var);
                            r0 r0Var2 = r0.f5196d;
                            synchronized (r0Var2) {
                                x6.b.s("isAvailable() returned false", p0Var.b());
                                r0Var2.f5197a.add(p0Var);
                            }
                        }
                        r0 r0Var3 = r0.f5196d;
                        synchronized (r0Var3) {
                            ArrayList arrayList = new ArrayList(r0Var3.f5197a);
                            Collections.sort(arrayList, Collections.reverseOrder(new eb.q0()));
                            r0Var3.f5198b = Collections.unmodifiableList(arrayList);
                        }
                    }
                    r0Var = r0.f5196d;
                }
                synchronized (r0Var) {
                    list = r0Var.f5198b;
                }
                eb.p0 p0Var2 = list.isEmpty() ? null : list.get(0);
                if (p0Var2 == null) {
                    throw new p0.a();
                }
                eb.o0<?> a11 = p0Var2.a(str);
                if (!hVar.f5967d) {
                    a11.c();
                }
                a11.b(TimeUnit.SECONDS);
                fb.a aVar = new fb.a(a11);
                aVar.f5528b = context;
                eb.n0 a12 = aVar.a();
                yVar.f10904b.a(new x(yVar, a12, i10));
                eb.c c10 = eb.c.f5034k.c(mb.a.f11148a, a.EnumC0166a.ASYNC);
                eb.b bVar = yVar.f10908g;
                c.a b10 = eb.c.b(c10);
                b10.f5047d = bVar;
                eb.c cVar = new eb.c(b10);
                a.b bVar2 = yVar.f10904b.f11322a;
                c.a b11 = eb.c.b(cVar);
                b11.f5045b = bVar2;
                yVar.f10905c = new eb.c(b11);
                p2.m0.y(1, "GrpcCallProvider", "Channel successfully reset.", new Object[0]);
                return a12;
            default:
                ((Runnable) this.f10899b).run();
                return null;
        }
    }
}
