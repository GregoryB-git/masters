package gb;

import eb.k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import n7.g;

/* loaded from: classes.dex */
public final class q2 extends eb.k0 {
    public final k0.e f;

    /* renamed from: g, reason: collision with root package name */
    public k0.i f6687g;

    /* renamed from: h, reason: collision with root package name */
    public eb.n f6688h = eb.n.IDLE;

    public class a implements k0.k {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k0.i f6689a;

        public a(k0.i iVar) {
            this.f6689a = iVar;
        }

        @Override // eb.k0.k
        public final void a(eb.o oVar) {
            k0.j cVar;
            q2 q2Var = q2.this;
            k0.i iVar = this.f6689a;
            q2Var.getClass();
            eb.n nVar = eb.n.IDLE;
            eb.n nVar2 = oVar.f5184a;
            if (nVar2 == eb.n.SHUTDOWN) {
                return;
            }
            eb.n nVar3 = eb.n.TRANSIENT_FAILURE;
            if (nVar2 == nVar3 || nVar2 == nVar) {
                q2Var.f.e();
            }
            if (q2Var.f6688h == nVar3) {
                if (nVar2 == eb.n.CONNECTING) {
                    return;
                }
                if (nVar2 == nVar) {
                    q2Var.e();
                    return;
                }
            }
            int ordinal = nVar2.ordinal();
            if (ordinal == 0) {
                cVar = new c(k0.f.f5160e);
            } else if (ordinal == 1) {
                cVar = new c(k0.f.b(iVar, null));
            } else if (ordinal == 2) {
                cVar = new c(k0.f.a(oVar.f5185b));
            } else {
                if (ordinal != 3) {
                    throw new IllegalArgumentException("Unsupported state:" + nVar2);
                }
                cVar = q2Var.new d(iVar);
            }
            q2Var.f6688h = nVar2;
            q2Var.f.f(nVar2, cVar);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Boolean f6691a;

        /* renamed from: b, reason: collision with root package name */
        public final Long f6692b = null;

        public b(Boolean bool) {
            this.f6691a = bool;
        }
    }

    public static final class c extends k0.j {

        /* renamed from: a, reason: collision with root package name */
        public final k0.f f6693a;

        public c(k0.f fVar) {
            x6.b.y(fVar, "result");
            this.f6693a = fVar;
        }

        @Override // eb.k0.j
        public final k0.f a(k0.g gVar) {
            return this.f6693a;
        }

        public final String toString() {
            g.a aVar = new g.a(c.class.getSimpleName());
            aVar.a(this.f6693a, "result");
            return aVar.toString();
        }
    }

    public final class d extends k0.j {

        /* renamed from: a, reason: collision with root package name */
        public final k0.i f6694a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicBoolean f6695b = new AtomicBoolean(false);

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                d.this.f6694a.f();
            }
        }

        public d(k0.i iVar) {
            x6.b.y(iVar, "subchannel");
            this.f6694a = iVar;
        }

        @Override // eb.k0.j
        public final k0.f a(k0.g gVar) {
            if (this.f6695b.compareAndSet(false, true)) {
                q2.this.f.d().execute(new a());
            }
            return k0.f.f5160e;
        }
    }

    public q2(k0.e eVar) {
        x6.b.y(eVar, "helper");
        this.f = eVar;
    }

    @Override // eb.k0
    public final eb.e1 a(k0.h hVar) {
        b bVar;
        Boolean bool;
        List<eb.u> list = hVar.f5165a;
        if (list.isEmpty()) {
            eb.e1 e1Var = eb.e1.f5078n;
            StringBuilder l10 = defpackage.f.l("NameResolver returned no usable address. addrs=");
            l10.append(hVar.f5165a);
            l10.append(", attrs=");
            l10.append(hVar.f5166b);
            eb.e1 g10 = e1Var.g(l10.toString());
            c(g10);
            return g10;
        }
        Object obj = hVar.f5167c;
        if ((obj instanceof b) && (bool = (bVar = (b) obj).f6691a) != null && bool.booleanValue()) {
            ArrayList arrayList = new ArrayList(list);
            Collections.shuffle(arrayList, bVar.f6692b != null ? new Random(bVar.f6692b.longValue()) : new Random());
            list = arrayList;
        }
        k0.i iVar = this.f6687g;
        if (iVar == null) {
            k0.e eVar = this.f;
            k0.b.a aVar = new k0.b.a();
            aVar.b(list);
            k0.i a10 = eVar.a(new k0.b(aVar.f5155a, aVar.f5156b, aVar.f5157c));
            a10.h(new a(a10));
            this.f6687g = a10;
            eb.n nVar = eb.n.CONNECTING;
            c cVar = new c(k0.f.b(a10, null));
            this.f6688h = nVar;
            this.f.f(nVar, cVar);
            a10.f();
        } else {
            iVar.i(list);
        }
        return eb.e1.f5070e;
    }

    @Override // eb.k0
    public final void c(eb.e1 e1Var) {
        k0.i iVar = this.f6687g;
        if (iVar != null) {
            iVar.g();
            this.f6687g = null;
        }
        eb.n nVar = eb.n.TRANSIENT_FAILURE;
        c cVar = new c(k0.f.a(e1Var));
        this.f6688h = nVar;
        this.f.f(nVar, cVar);
    }

    @Override // eb.k0
    public final void e() {
        k0.i iVar = this.f6687g;
        if (iVar != null) {
            iVar.f();
        }
    }

    @Override // eb.k0
    public final void f() {
        k0.i iVar = this.f6687g;
        if (iVar != null) {
            iVar.g();
        }
    }
}
