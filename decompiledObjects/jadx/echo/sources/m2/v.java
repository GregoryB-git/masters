package m2;

import java.util.Iterator;
import java.util.concurrent.Executor;
import n2.InterfaceC1707d;
import o2.b;

/* loaded from: classes.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f17733a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1707d f17734b;

    /* renamed from: c, reason: collision with root package name */
    public final x f17735c;

    /* renamed from: d, reason: collision with root package name */
    public final o2.b f17736d;

    public v(Executor executor, InterfaceC1707d interfaceC1707d, x xVar, o2.b bVar) {
        this.f17733a = executor;
        this.f17734b = interfaceC1707d;
        this.f17735c = xVar;
        this.f17736d = bVar;
    }

    public void c() {
        this.f17733a.execute(new Runnable() { // from class: m2.t
            @Override // java.lang.Runnable
            public final void run() {
                v.this.e();
            }
        });
    }

    public final /* synthetic */ Object d() {
        Iterator it = this.f17734b.o().iterator();
        while (it.hasNext()) {
            this.f17735c.a((f2.p) it.next(), 1);
        }
        return null;
    }

    public final /* synthetic */ void e() {
        this.f17736d.a(new b.a() { // from class: m2.u
            @Override // o2.b.a
            public final Object e() {
                Object d7;
                d7 = v.this.d();
                return d7;
            }
        });
    }
}
