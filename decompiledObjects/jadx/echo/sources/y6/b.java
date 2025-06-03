package y6;

import V5.t;
import X5.g;
import Z5.h;
import g6.q;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.l;
import p6.AbstractC1864o;
import p6.C1860m;
import p6.InterfaceC1858l;
import p6.M;
import p6.P0;
import u.AbstractC1997b;
import u6.C;
import u6.F;

/* loaded from: classes.dex */
public class b extends d implements y6.a {

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f21518i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "owner");

    /* renamed from: h, reason: collision with root package name */
    public final q f21519h;
    private volatile Object owner;

    public final class a implements InterfaceC1858l, P0 {

        /* renamed from: o, reason: collision with root package name */
        public final C1860m f21520o;

        /* renamed from: p, reason: collision with root package name */
        public final Object f21521p;

        /* renamed from: y6.b$a$a, reason: collision with other inner class name */
        public static final class C0305a extends l implements g6.l {

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ b f21523o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ a f21524p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0305a(b bVar, a aVar) {
                super(1);
                this.f21523o = bVar;
                this.f21524p = aVar;
            }

            public final void a(Throwable th) {
                this.f21523o.b(this.f21524p.f21521p);
            }

            @Override // g6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return t.f6803a;
            }
        }

        /* renamed from: y6.b$a$b, reason: collision with other inner class name */
        public static final class C0306b extends l implements g6.l {

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ b f21525o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ a f21526p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0306b(b bVar, a aVar) {
                super(1);
                this.f21525o = bVar;
                this.f21526p = aVar;
            }

            public final void a(Throwable th) {
                b.f21518i.set(this.f21525o, this.f21526p.f21521p);
                this.f21525o.b(this.f21526p.f21521p);
            }

            @Override // g6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return t.f6803a;
            }
        }

        public a(C1860m c1860m, Object obj) {
            this.f21520o = c1860m;
            this.f21521p = obj;
        }

        @Override // p6.P0
        public void a(C c7, int i7) {
            this.f21520o.a(c7, i7);
        }

        @Override // p6.InterfaceC1858l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void j(t tVar, g6.l lVar) {
            b.f21518i.set(b.this, this.f21521p);
            this.f21520o.j(tVar, new C0305a(b.this, this));
        }

        @Override // p6.InterfaceC1858l
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Object g(t tVar, Object obj, g6.l lVar) {
            Object g7 = this.f21520o.g(tVar, obj, new C0306b(b.this, this));
            if (g7 != null) {
                b.f21518i.set(b.this, this.f21521p);
            }
            return g7;
        }

        @Override // p6.InterfaceC1858l
        public void d(g6.l lVar) {
            this.f21520o.d(lVar);
        }

        @Override // X5.d
        public g getContext() {
            return this.f21520o.getContext();
        }

        @Override // p6.InterfaceC1858l
        public boolean o(Throwable th) {
            return this.f21520o.o(th);
        }

        @Override // p6.InterfaceC1858l
        public void p(Object obj) {
            this.f21520o.p(obj);
        }

        @Override // X5.d
        public void resumeWith(Object obj) {
            this.f21520o.resumeWith(obj);
        }
    }

    /* renamed from: y6.b$b, reason: collision with other inner class name */
    public static final class C0307b extends l implements q {

        /* renamed from: y6.b$b$a */
        public static final class a extends l implements g6.l {

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ b f21528o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ Object f21529p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, Object obj) {
                super(1);
                this.f21528o = bVar;
                this.f21529p = obj;
            }

            public final void a(Throwable th) {
                this.f21528o.b(this.f21529p);
            }

            @Override // g6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return t.f6803a;
            }
        }

        public C0307b() {
            super(3);
        }

        public final g6.l a(x6.a aVar, Object obj, Object obj2) {
            return new a(b.this, obj);
        }

        @Override // g6.q
        public /* bridge */ /* synthetic */ Object c(Object obj, Object obj2, Object obj3) {
            android.support.v4.media.a.a(obj);
            return a(null, obj2, obj3);
        }
    }

    public b(boolean z7) {
        super(1, z7 ? 1 : 0);
        this.owner = z7 ? null : c.f21530a;
        this.f21519h = new C0307b();
    }

    public static /* synthetic */ Object o(b bVar, Object obj, X5.d dVar) {
        Object c7;
        if (bVar.q(obj)) {
            return t.f6803a;
        }
        Object p7 = bVar.p(obj, dVar);
        c7 = Y5.d.c();
        return p7 == c7 ? p7 : t.f6803a;
    }

    @Override // y6.a
    public Object a(Object obj, X5.d dVar) {
        return o(this, obj, dVar);
    }

    @Override // y6.a
    public void b(Object obj) {
        F f7;
        F f8;
        while (c()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21518i;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            f7 = c.f21530a;
            if (obj2 != f7) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                f8 = c.f21530a;
                if (AbstractC1997b.a(atomicReferenceFieldUpdater, this, obj2, f8)) {
                    i();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked".toString());
    }

    @Override // y6.a
    public boolean c() {
        return h() == 0;
    }

    public boolean n(Object obj) {
        F f7;
        while (c()) {
            Object obj2 = f21518i.get(this);
            f7 = c.f21530a;
            if (obj2 != f7) {
                return obj2 == obj;
            }
        }
        return false;
    }

    public final Object p(Object obj, X5.d dVar) {
        X5.d b7;
        Object c7;
        Object c8;
        b7 = Y5.c.b(dVar);
        C1860m b8 = AbstractC1864o.b(b7);
        try {
            d(new a(b8, obj));
            Object w7 = b8.w();
            c7 = Y5.d.c();
            if (w7 == c7) {
                h.c(dVar);
            }
            c8 = Y5.d.c();
            return w7 == c8 ? w7 : t.f6803a;
        } catch (Throwable th) {
            b8.I();
            throw th;
        }
    }

    public boolean q(Object obj) {
        int r7 = r(obj);
        if (r7 == 0) {
            return true;
        }
        if (r7 == 1) {
            return false;
        }
        if (r7 != 2) {
            throw new IllegalStateException("unexpected".toString());
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    public final int r(Object obj) {
        while (!j()) {
            if (obj == null) {
                return 1;
            }
            if (n(obj)) {
                return 2;
            }
            if (c()) {
                return 1;
            }
        }
        f21518i.set(this, obj);
        return 0;
    }

    public String toString() {
        return "Mutex@" + M.b(this) + "[isLocked=" + c() + ",owner=" + f21518i.get(this) + ']';
    }
}
