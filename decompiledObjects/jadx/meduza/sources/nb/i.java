package nb;

import eb.a;
import eb.d;
import eb.e1;
import eb.h;
import eb.h1;
import eb.i1;
import eb.k0;
import eb.n;
import eb.o;
import eb.s0;
import eb.u;
import gb.g3;
import gb.o3;
import java.lang.reflect.Array;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import o7.p;
import o7.t;

/* loaded from: classes.dex */
public final class i extends k0 {

    /* renamed from: n, reason: collision with root package name */
    public static final a.b<a> f11407n = new a.b<>("addressTrackerKey");
    public final b f;

    /* renamed from: g, reason: collision with root package name */
    public final h1 f11408g;

    /* renamed from: h, reason: collision with root package name */
    public final nb.e f11409h;

    /* renamed from: i, reason: collision with root package name */
    public o3 f11410i;

    /* renamed from: j, reason: collision with root package name */
    public final ScheduledExecutorService f11411j;

    /* renamed from: k, reason: collision with root package name */
    public h1.c f11412k;

    /* renamed from: l, reason: collision with root package name */
    public Long f11413l;

    /* renamed from: m, reason: collision with root package name */
    public final eb.d f11414m;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public f f11415a;

        /* renamed from: d, reason: collision with root package name */
        public Long f11418d;

        /* renamed from: e, reason: collision with root package name */
        public int f11419e;

        /* renamed from: b, reason: collision with root package name */
        public volatile C0179a f11416b = new C0179a();

        /* renamed from: c, reason: collision with root package name */
        public C0179a f11417c = new C0179a();
        public final HashSet f = new HashSet();

        /* renamed from: nb.i$a$a, reason: collision with other inner class name */
        public static class C0179a {

            /* renamed from: a, reason: collision with root package name */
            public AtomicLong f11420a = new AtomicLong();

            /* renamed from: b, reason: collision with root package name */
            public AtomicLong f11421b = new AtomicLong();
        }

        public a(f fVar) {
            this.f11415a = fVar;
        }

        public final void a(h hVar) {
            if (d() && !hVar.f11452c) {
                hVar.k();
            } else if (!d() && hVar.f11452c) {
                hVar.f11452c = false;
                o oVar = hVar.f11453d;
                if (oVar != null) {
                    hVar.f11454e.a(oVar);
                    hVar.f.b(d.a.INFO, "Subchannel unejected: {0}", hVar);
                }
            }
            hVar.f11451b = this;
            this.f.add(hVar);
        }

        public final void b(long j10) {
            this.f11418d = Long.valueOf(j10);
            this.f11419e++;
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                ((h) it.next()).k();
            }
        }

        public final long c() {
            return this.f11417c.f11421b.get() + this.f11417c.f11420a.get();
        }

        public final boolean d() {
            return this.f11418d != null;
        }

        public final void e() {
            x6.b.I(this.f11418d != null, "not currently ejected");
            this.f11418d = null;
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                h hVar = (h) it.next();
                hVar.f11452c = false;
                o oVar = hVar.f11453d;
                if (oVar != null) {
                    hVar.f11454e.a(oVar);
                    hVar.f.b(d.a.INFO, "Subchannel unejected: {0}", hVar);
                }
            }
        }

        public final String toString() {
            StringBuilder l10 = defpackage.f.l("AddressTracker{subchannels=");
            l10.append(this.f);
            l10.append('}');
            return l10.toString();
        }
    }

    public static class b extends p<SocketAddress, a> {

        /* renamed from: a, reason: collision with root package name */
        public final HashMap f11422a = new HashMap();

        @Override // o7.q
        public final Object b() {
            return this.f11422a;
        }

        @Override // o7.p
        public final Map<SocketAddress, a> c() {
            return this.f11422a;
        }

        public final double d() {
            if (this.f11422a.isEmpty()) {
                return 0.0d;
            }
            Iterator it = this.f11422a.values().iterator();
            int i10 = 0;
            int i11 = 0;
            while (it.hasNext()) {
                i11++;
                if (((a) it.next()).d()) {
                    i10++;
                }
            }
            return (i10 / i11) * 100.0d;
        }
    }

    public class c extends nb.c {

        /* renamed from: a, reason: collision with root package name */
        public nb.g f11423a;

        public c(k0.e eVar) {
            this.f11423a = new nb.g(eVar);
        }

        @Override // nb.c, eb.k0.e
        public final k0.i a(k0.b bVar) {
            h hVar = i.this.new h(bVar, this.f11423a);
            List<u> list = bVar.f5152a;
            if (i.g(list) && i.this.f.containsKey(list.get(0).f5234a.get(0))) {
                a aVar = i.this.f.get(list.get(0).f5234a.get(0));
                aVar.a(hVar);
                if (aVar.f11418d != null) {
                    hVar.k();
                }
            }
            return hVar;
        }

        @Override // nb.c, eb.k0.e
        public final void f(n nVar, k0.j jVar) {
            this.f11423a.f(nVar, new g(jVar));
        }

        @Override // nb.c
        public final k0.e g() {
            return this.f11423a;
        }
    }

    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public f f11425a;

        /* renamed from: b, reason: collision with root package name */
        public eb.d f11426b;

        public d(f fVar, eb.d dVar) {
            this.f11425a = fVar;
            this.f11426b = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            i iVar = i.this;
            iVar.f11413l = Long.valueOf(iVar.f11410i.a());
            for (a aVar : i.this.f.f11422a.values()) {
                a.C0179a c0179a = aVar.f11417c;
                c0179a.f11420a.set(0L);
                c0179a.f11421b.set(0L);
                a.C0179a c0179a2 = aVar.f11416b;
                aVar.f11416b = aVar.f11417c;
                aVar.f11417c = c0179a2;
            }
            f fVar = this.f11425a;
            eb.d dVar = this.f11426b;
            t.b bVar = t.f12050b;
            t.a aVar2 = new t.a();
            if (fVar.f11434e != null) {
                aVar2.c(new j(fVar, dVar));
            }
            if (fVar.f != null) {
                aVar2.c(new e(fVar, dVar));
            }
            t.b listIterator = aVar2.e().listIterator(0);
            while (listIterator.hasNext()) {
                InterfaceC0181i interfaceC0181i = (InterfaceC0181i) listIterator.next();
                i iVar2 = i.this;
                interfaceC0181i.a(iVar2.f, iVar2.f11413l.longValue());
            }
            i iVar3 = i.this;
            b bVar2 = iVar3.f;
            Long l10 = iVar3.f11413l;
            for (a aVar3 : bVar2.f11422a.values()) {
                if (!aVar3.d()) {
                    int i10 = aVar3.f11419e;
                    aVar3.f11419e = i10 == 0 ? 0 : i10 - 1;
                }
                if (aVar3.d()) {
                    if (l10.longValue() > Math.min(aVar3.f11415a.f11431b.longValue() * ((long) aVar3.f11419e), Math.max(aVar3.f11415a.f11431b.longValue(), aVar3.f11415a.f11432c.longValue())) + aVar3.f11418d.longValue()) {
                        aVar3.e();
                    }
                }
            }
        }
    }

    public static class e implements InterfaceC0181i {

        /* renamed from: a, reason: collision with root package name */
        public final f f11428a;

        /* renamed from: b, reason: collision with root package name */
        public final eb.d f11429b;

        public e(f fVar, eb.d dVar) {
            this.f11428a = fVar;
            this.f11429b = dVar;
        }

        @Override // nb.i.InterfaceC0181i
        public final void a(b bVar, long j10) {
            ArrayList h10 = i.h(bVar, this.f11428a.f.f11439d.intValue());
            if (h10.size() < this.f11428a.f.f11438c.intValue() || h10.size() == 0) {
                return;
            }
            Iterator it = h10.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                if (bVar.d() >= this.f11428a.f11433d.intValue()) {
                    return;
                }
                if (aVar.c() >= this.f11428a.f.f11439d.intValue() && aVar.f11417c.f11421b.get() / aVar.c() > this.f11428a.f.f11436a.intValue() / 100.0d) {
                    this.f11429b.b(d.a.DEBUG, "FailurePercentage algorithm detected outlier: {0}, failureRate={1}", aVar, Double.valueOf(aVar.f11417c.f11421b.get() / aVar.c()));
                    if (new Random().nextInt(100) < this.f11428a.f.f11437b.intValue()) {
                        aVar.b(j10);
                    }
                }
            }
        }
    }

    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final Long f11430a;

        /* renamed from: b, reason: collision with root package name */
        public final Long f11431b;

        /* renamed from: c, reason: collision with root package name */
        public final Long f11432c;

        /* renamed from: d, reason: collision with root package name */
        public final Integer f11433d;

        /* renamed from: e, reason: collision with root package name */
        public final b f11434e;
        public final a f;

        /* renamed from: g, reason: collision with root package name */
        public final g3.b f11435g;

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public final Integer f11436a;

            /* renamed from: b, reason: collision with root package name */
            public final Integer f11437b;

            /* renamed from: c, reason: collision with root package name */
            public final Integer f11438c;

            /* renamed from: d, reason: collision with root package name */
            public final Integer f11439d;

            public a(Integer num, Integer num2, Integer num3, Integer num4) {
                this.f11436a = num;
                this.f11437b = num2;
                this.f11438c = num3;
                this.f11439d = num4;
            }
        }

        public static class b {

            /* renamed from: a, reason: collision with root package name */
            public final Integer f11440a;

            /* renamed from: b, reason: collision with root package name */
            public final Integer f11441b;

            /* renamed from: c, reason: collision with root package name */
            public final Integer f11442c;

            /* renamed from: d, reason: collision with root package name */
            public final Integer f11443d;

            public b(Integer num, Integer num2, Integer num3, Integer num4) {
                this.f11440a = num;
                this.f11441b = num2;
                this.f11442c = num3;
                this.f11443d = num4;
            }
        }

        public f(Long l10, Long l11, Long l12, Integer num, b bVar, a aVar, g3.b bVar2) {
            this.f11430a = l10;
            this.f11431b = l11;
            this.f11432c = l12;
            this.f11433d = num;
            this.f11434e = bVar;
            this.f = aVar;
            this.f11435g = bVar2;
        }
    }

    public class g extends k0.j {

        /* renamed from: a, reason: collision with root package name */
        public final k0.j f11444a;

        public class a extends h.a {

            /* renamed from: a, reason: collision with root package name */
            public final a f11445a;

            /* renamed from: b, reason: collision with root package name */
            public final h.a f11446b;

            /* renamed from: nb.i$g$a$a, reason: collision with other inner class name */
            public class C0180a extends nb.a {

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ eb.h f11447c;

                public C0180a(eb.h hVar) {
                    this.f11447c = hVar;
                }

                @Override // m.e
                public final void o(e1 e1Var) {
                    a aVar = a.this.f11445a;
                    boolean e10 = e1Var.e();
                    f fVar = aVar.f11415a;
                    if (fVar.f11434e != null || fVar.f != null) {
                        a.C0179a c0179a = aVar.f11416b;
                        (e10 ? c0179a.f11420a : c0179a.f11421b).getAndIncrement();
                    }
                    this.f11447c.o(e1Var);
                }
            }

            public class b extends eb.h {
                public b() {
                }

                @Override // m.e
                public final void o(e1 e1Var) {
                    a aVar = a.this.f11445a;
                    boolean e10 = e1Var.e();
                    f fVar = aVar.f11415a;
                    if (fVar.f11434e == null && fVar.f == null) {
                        return;
                    }
                    (e10 ? aVar.f11416b.f11420a : aVar.f11416b.f11421b).getAndIncrement();
                }
            }

            public a(a aVar, h.a aVar2) {
                this.f11445a = aVar;
                this.f11446b = aVar2;
            }

            @Override // eb.h.a
            public final eb.h a(h.b bVar, s0 s0Var) {
                h.a aVar = this.f11446b;
                return aVar != null ? new C0180a(aVar.a(bVar, s0Var)) : new b();
            }
        }

        public g(k0.j jVar) {
            this.f11444a = jVar;
        }

        @Override // eb.k0.j
        public final k0.f a(k0.g gVar) {
            k0.f a10 = this.f11444a.a(gVar);
            k0.i iVar = a10.f5161a;
            return iVar != null ? k0.f.b(iVar, new a((a) iVar.c().a(i.f11407n), a10.f5162b)) : a10;
        }
    }

    public class h extends nb.d {

        /* renamed from: a, reason: collision with root package name */
        public final k0.i f11450a;

        /* renamed from: b, reason: collision with root package name */
        public a f11451b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f11452c;

        /* renamed from: d, reason: collision with root package name */
        public o f11453d;

        /* renamed from: e, reason: collision with root package name */
        public k0.k f11454e;
        public final eb.d f;

        public class a implements k0.k {

            /* renamed from: a, reason: collision with root package name */
            public final k0.k f11456a;

            public a(k0.k kVar) {
                this.f11456a = kVar;
            }

            @Override // eb.k0.k
            public final void a(o oVar) {
                h hVar = h.this;
                hVar.f11453d = oVar;
                if (hVar.f11452c) {
                    return;
                }
                this.f11456a.a(oVar);
            }
        }

        public h(k0.b bVar, nb.g gVar) {
            a.b<Map<String, ?>> bVar2 = k0.f5147b;
            k0.k kVar = (k0.k) bVar.a();
            if (kVar != null) {
                this.f11454e = kVar;
                a aVar = new a(kVar);
                k0.b.a aVar2 = new k0.b.a();
                aVar2.b(bVar.f5152a);
                eb.a aVar3 = bVar.f5153b;
                x6.b.y(aVar3, "attrs");
                aVar2.f5156b = aVar3;
                Object[][] objArr = bVar.f5154c;
                Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, objArr.length, 2);
                aVar2.f5157c = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
                aVar2.a(aVar);
                bVar = new k0.b(aVar2.f5155a, aVar2.f5156b, aVar2.f5157c);
            }
            k0.i a10 = gVar.a(bVar);
            this.f11450a = a10;
            this.f = a10.d();
        }

        @Override // eb.k0.i
        public final eb.a c() {
            if (this.f11451b == null) {
                return this.f11450a.c();
            }
            eb.a c10 = this.f11450a.c();
            c10.getClass();
            a.b<a> bVar = i.f11407n;
            a aVar = this.f11451b;
            IdentityHashMap identityHashMap = new IdentityHashMap(1);
            identityHashMap.put(bVar, aVar);
            for (Map.Entry<a.b<?>, Object> entry : c10.f5013a.entrySet()) {
                if (!identityHashMap.containsKey(entry.getKey())) {
                    identityHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return new eb.a(identityHashMap);
        }

        @Override // nb.d, eb.k0.i
        public final void g() {
            a aVar = this.f11451b;
            if (aVar != null) {
                this.f11451b = null;
                aVar.f.remove(this);
            }
            super.g();
        }

        @Override // eb.k0.i
        public final void h(k0.k kVar) {
            if (this.f11454e != null) {
                j().h(kVar);
                return;
            }
            this.f11454e = kVar;
            j().h(new a(kVar));
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x00c9, code lost:
        
            r5.f11455g.f.get(r0).a(r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00c7, code lost:
        
            if (r5.f11455g.f.containsKey(r0) != false) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0040, code lost:
        
            if (r5.f11455g.f.containsKey(r0) != false) goto L25;
         */
        @Override // nb.d, eb.k0.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void i(java.util.List<eb.u> r6) {
            /*
                r5 = this;
                java.util.List r0 = r5.b()
                boolean r0 = nb.i.g(r0)
                r1 = 0
                r2 = 0
                if (r0 == 0) goto L44
                boolean r0 = nb.i.g(r6)
                if (r0 == 0) goto L44
                nb.i r0 = nb.i.this
                nb.i$b r0 = r0.f
                nb.i$a r3 = r5.f11451b
                boolean r0 = r0.containsValue(r3)
                if (r0 == 0) goto L2a
                nb.i$a r0 = r5.f11451b
                r0.getClass()
                r5.f11451b = r1
                java.util.HashSet r0 = r0.f
                r0.remove(r5)
            L2a:
                java.lang.Object r0 = r6.get(r2)
                eb.u r0 = (eb.u) r0
                java.util.List<java.net.SocketAddress> r0 = r0.f5234a
                java.lang.Object r0 = r0.get(r2)
                java.net.SocketAddress r0 = (java.net.SocketAddress) r0
                nb.i r1 = nb.i.this
                nb.i$b r1 = r1.f
                boolean r1 = r1.containsKey(r0)
                if (r1 == 0) goto Ld6
                goto Lc9
            L44:
                java.util.List r0 = r5.b()
                boolean r0 = nb.i.g(r0)
                if (r0 == 0) goto La1
                boolean r0 = nb.i.g(r6)
                if (r0 != 0) goto La1
                nb.i r0 = nb.i.this
                nb.i$b r0 = r0.f
                eb.u r3 = r5.a()
                java.util.List<java.net.SocketAddress> r3 = r3.f5234a
                java.lang.Object r3 = r3.get(r2)
                boolean r0 = r0.containsKey(r3)
                if (r0 == 0) goto Ld6
                nb.i r0 = nb.i.this
                nb.i$b r0 = r0.f
                eb.u r3 = r5.a()
                java.util.List<java.net.SocketAddress> r3 = r3.f5234a
                java.lang.Object r2 = r3.get(r2)
                java.lang.Object r0 = r0.get(r2)
                nb.i$a r0 = (nb.i.a) r0
                r0.getClass()
                r5.f11451b = r1
                java.util.HashSet r1 = r0.f
                r1.remove(r5)
                nb.i$a$a r1 = r0.f11416b
                java.util.concurrent.atomic.AtomicLong r2 = r1.f11420a
                r3 = 0
                r2.set(r3)
                java.util.concurrent.atomic.AtomicLong r1 = r1.f11421b
                r1.set(r3)
                nb.i$a$a r0 = r0.f11417c
                java.util.concurrent.atomic.AtomicLong r1 = r0.f11420a
                r1.set(r3)
                java.util.concurrent.atomic.AtomicLong r0 = r0.f11421b
                r0.set(r3)
                goto Ld6
            La1:
                java.util.List r0 = r5.b()
                boolean r0 = nb.i.g(r0)
                if (r0 != 0) goto Ld6
                boolean r0 = nb.i.g(r6)
                if (r0 == 0) goto Ld6
                java.lang.Object r0 = r6.get(r2)
                eb.u r0 = (eb.u) r0
                java.util.List<java.net.SocketAddress> r0 = r0.f5234a
                java.lang.Object r0 = r0.get(r2)
                java.net.SocketAddress r0 = (java.net.SocketAddress) r0
                nb.i r1 = nb.i.this
                nb.i$b r1 = r1.f
                boolean r1 = r1.containsKey(r0)
                if (r1 == 0) goto Ld6
            Lc9:
                nb.i r1 = nb.i.this
                nb.i$b r1 = r1.f
                java.lang.Object r0 = r1.get(r0)
                nb.i$a r0 = (nb.i.a) r0
                r0.a(r5)
            Ld6:
                eb.k0$i r0 = r5.f11450a
                r0.i(r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: nb.i.h.i(java.util.List):void");
        }

        @Override // nb.d
        public final k0.i j() {
            return this.f11450a;
        }

        public final void k() {
            this.f11452c = true;
            k0.k kVar = this.f11454e;
            e1 e1Var = e1.f5078n;
            x6.b.s("The error status must not be OK", !e1Var.e());
            kVar.a(new o(n.TRANSIENT_FAILURE, e1Var));
            this.f.b(d.a.INFO, "Subchannel ejected: {0}", this);
        }

        @Override // nb.d
        public final String toString() {
            StringBuilder l10 = defpackage.f.l("OutlierDetectionSubchannel{addresses=");
            l10.append(this.f11450a.b());
            l10.append('}');
            return l10.toString();
        }
    }

    /* renamed from: nb.i$i, reason: collision with other inner class name */
    public interface InterfaceC0181i {
        void a(b bVar, long j10);
    }

    public static class j implements InterfaceC0181i {

        /* renamed from: a, reason: collision with root package name */
        public final f f11458a;

        /* renamed from: b, reason: collision with root package name */
        public final eb.d f11459b;

        public j(f fVar, eb.d dVar) {
            x6.b.s("success rate ejection config is null", fVar.f11434e != null);
            this.f11458a = fVar;
            this.f11459b = dVar;
        }

        @Override // nb.i.InterfaceC0181i
        public final void a(b bVar, long j10) {
            Iterator it;
            ArrayList h10 = i.h(bVar, this.f11458a.f11434e.f11443d.intValue());
            if (h10.size() < this.f11458a.f11434e.f11442c.intValue() || h10.size() == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = h10.iterator();
            while (it2.hasNext()) {
                a aVar = (a) it2.next();
                arrayList.add(Double.valueOf(aVar.f11417c.f11420a.get() / aVar.c()));
            }
            Iterator it3 = arrayList.iterator();
            double d10 = 0.0d;
            double d11 = 0.0d;
            while (it3.hasNext()) {
                d11 += ((Double) it3.next()).doubleValue();
            }
            double size = d11 / arrayList.size();
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                double doubleValue = ((Double) it4.next()).doubleValue() - size;
                d10 += doubleValue * doubleValue;
            }
            double sqrt = Math.sqrt(d10 / arrayList.size());
            double intValue = size - ((this.f11458a.f11434e.f11440a.intValue() / 1000.0f) * sqrt);
            for (Iterator it5 = h10.iterator(); it5.hasNext(); it5 = it) {
                a aVar2 = (a) it5.next();
                if (bVar.d() >= this.f11458a.f11433d.intValue()) {
                    return;
                }
                if (aVar2.f11417c.f11420a.get() / aVar2.c() < intValue) {
                    it = it5;
                    this.f11459b.b(d.a.DEBUG, "SuccessRate algorithm detected outlier: {0}. Parameters: successRate={1}, mean={2}, stdev={3}, requiredSuccessRate={4}", aVar2, Double.valueOf(aVar2.f11417c.f11420a.get() / aVar2.c()), Double.valueOf(size), Double.valueOf(sqrt), Double.valueOf(intValue));
                    if (new Random().nextInt(100) < this.f11458a.f11434e.f11441b.intValue()) {
                        aVar2.b(j10);
                    }
                } else {
                    it = it5;
                }
            }
        }
    }

    public i(k0.e eVar) {
        o3.a aVar = o3.f6622a;
        eb.d b10 = eVar.b();
        this.f11414m = b10;
        this.f11409h = new nb.e(new c(eVar));
        this.f = new b();
        h1 d10 = eVar.d();
        x6.b.y(d10, "syncContext");
        this.f11408g = d10;
        ScheduledExecutorService c10 = eVar.c();
        x6.b.y(c10, "timeService");
        this.f11411j = c10;
        this.f11410i = aVar;
        b10.a(d.a.DEBUG, "OutlierDetection lb created.");
    }

    public static boolean g(List list) {
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((u) it.next()).f5234a.size();
            if (i10 > 1) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList h(b bVar, int i10) {
        ArrayList arrayList = new ArrayList();
        for (a aVar : bVar.values()) {
            if (aVar.c() >= i10) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    @Override // eb.k0
    public final e1 a(k0.h hVar) {
        boolean z10 = true;
        this.f11414m.b(d.a.DEBUG, "Received resolution result: {0}", hVar);
        f fVar = (f) hVar.f5167c;
        ArrayList arrayList = new ArrayList();
        Iterator<u> it = hVar.f5165a.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().f5234a);
        }
        this.f.keySet().retainAll(arrayList);
        Iterator it2 = this.f.f11422a.values().iterator();
        while (it2.hasNext()) {
            ((a) it2.next()).f11415a = fVar;
        }
        b bVar = this.f;
        bVar.getClass();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            SocketAddress socketAddress = (SocketAddress) it3.next();
            if (!bVar.f11422a.containsKey(socketAddress)) {
                bVar.f11422a.put(socketAddress, new a(fVar));
            }
        }
        this.f11409h.i(fVar.f11435g.f6448a);
        if (fVar.f11434e == null && fVar.f == null) {
            z10 = false;
        }
        if (z10) {
            Long valueOf = this.f11413l == null ? fVar.f11430a : Long.valueOf(Math.max(0L, fVar.f11430a.longValue() - (this.f11410i.a() - this.f11413l.longValue())));
            h1.c cVar = this.f11412k;
            if (cVar != null) {
                cVar.a();
                for (a aVar : this.f.f11422a.values()) {
                    a.C0179a c0179a = aVar.f11416b;
                    c0179a.f11420a.set(0L);
                    c0179a.f11421b.set(0L);
                    a.C0179a c0179a2 = aVar.f11417c;
                    c0179a2.f11420a.set(0L);
                    c0179a2.f11421b.set(0L);
                }
            }
            h1 h1Var = this.f11408g;
            d dVar = new d(fVar, this.f11414m);
            long longValue = valueOf.longValue();
            long longValue2 = fVar.f11430a.longValue();
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            ScheduledExecutorService scheduledExecutorService = this.f11411j;
            h1Var.getClass();
            h1.b bVar2 = new h1.b(dVar);
            this.f11412k = new h1.c(bVar2, scheduledExecutorService.scheduleWithFixedDelay(new i1(h1Var, bVar2, dVar, longValue2), longValue, longValue2, timeUnit));
        } else {
            h1.c cVar2 = this.f11412k;
            if (cVar2 != null) {
                cVar2.a();
                this.f11413l = null;
                for (a aVar2 : this.f.f11422a.values()) {
                    if (aVar2.d()) {
                        aVar2.e();
                    }
                    aVar2.f11419e = 0;
                }
            }
        }
        nb.e eVar = this.f11409h;
        eb.a aVar3 = eb.a.f5012b;
        eVar.d(new k0.h(hVar.f5165a, hVar.f5166b, fVar.f11435g.f6449b));
        return e1.f5070e;
    }

    @Override // eb.k0
    public final void c(e1 e1Var) {
        this.f11409h.c(e1Var);
    }

    @Override // eb.k0
    public final void f() {
        this.f11409h.f();
    }
}
