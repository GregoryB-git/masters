package gb;

import eb.h;
import eb.s0;
import gb.n3;
import gb.t;
import java.io.InputStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class y2<ReqT> implements gb.s {
    public static final s0.b A;
    public static final s0.b B;
    public static final eb.e1 C;
    public static Random D;

    /* renamed from: a, reason: collision with root package name */
    public final eb.t0<ReqT, ?> f6908a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f6909b;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f6911d;

    /* renamed from: e, reason: collision with root package name */
    public final eb.s0 f6912e;
    public final a3 f;

    /* renamed from: g, reason: collision with root package name */
    public final x0 f6913g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f6914h;

    /* renamed from: j, reason: collision with root package name */
    public final s f6916j;

    /* renamed from: k, reason: collision with root package name */
    public final long f6917k;

    /* renamed from: l, reason: collision with root package name */
    public final long f6918l;

    /* renamed from: m, reason: collision with root package name */
    public final b0 f6919m;

    /* renamed from: s, reason: collision with root package name */
    public w f6925s;
    public long t;

    /* renamed from: u, reason: collision with root package name */
    public gb.t f6926u;

    /* renamed from: v, reason: collision with root package name */
    public t f6927v;

    /* renamed from: w, reason: collision with root package name */
    public t f6928w;

    /* renamed from: x, reason: collision with root package name */
    public long f6929x;

    /* renamed from: y, reason: collision with root package name */
    public eb.e1 f6930y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f6931z;

    /* renamed from: c, reason: collision with root package name */
    public final eb.h1 f6910c = new eb.h1(new a());

    /* renamed from: i, reason: collision with root package name */
    public final Object f6915i = new Object();

    /* renamed from: n, reason: collision with root package name */
    public final d2.q f6920n = new d2.q();

    /* renamed from: o, reason: collision with root package name */
    public volatile y f6921o = new y(new ArrayList(8), Collections.emptyList(), null, null, false, false, false, 0);

    /* renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f6922p = new AtomicBoolean();

    /* renamed from: q, reason: collision with root package name */
    public final AtomicInteger f6923q = new AtomicInteger();

    /* renamed from: r, reason: collision with root package name */
    public final AtomicInteger f6924r = new AtomicInteger();

    public class a implements Thread.UncaughtExceptionHandler {
        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(Thread thread, Throwable th) {
            throw new eb.g1(eb.e1.d(th).g("Uncaught exception in the SynchronizationContext. Re-thrown."));
        }
    }

    public static final class a0 {

        /* renamed from: a, reason: collision with root package name */
        public gb.s f6932a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f6933b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f6934c;

        /* renamed from: d, reason: collision with root package name */
        public final int f6935d;

        public a0(int i10) {
            this.f6935d = i10;
        }
    }

    public class b implements q {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f6936a;

        public b(String str) {
            this.f6936a = str;
        }

        @Override // gb.y2.q
        public final void a(a0 a0Var) {
            a0Var.f6932a.k(this.f6936a);
        }
    }

    public static final class b0 {

        /* renamed from: a, reason: collision with root package name */
        public final int f6937a;

        /* renamed from: b, reason: collision with root package name */
        public final int f6938b;

        /* renamed from: c, reason: collision with root package name */
        public final int f6939c;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicInteger f6940d;

        public b0(float f, float f10) {
            AtomicInteger atomicInteger = new AtomicInteger();
            this.f6940d = atomicInteger;
            this.f6939c = (int) (f10 * 1000.0f);
            int i10 = (int) (f * 1000.0f);
            this.f6937a = i10;
            this.f6938b = i10 / 2;
            atomicInteger.set(i10);
        }

        public final boolean a() {
            int i10;
            int i11;
            do {
                i10 = this.f6940d.get();
                if (i10 == 0) {
                    return false;
                }
                i11 = i10 - 1000;
            } while (!this.f6940d.compareAndSet(i10, Math.max(i11, 0)));
            return i11 > this.f6938b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b0)) {
                return false;
            }
            b0 b0Var = (b0) obj;
            return this.f6937a == b0Var.f6937a && this.f6939c == b0Var.f6939c;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6937a), Integer.valueOf(this.f6939c)});
        }
    }

    public class c implements q {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eb.l f6941a;

        public c(eb.l lVar) {
            this.f6941a = lVar;
        }

        @Override // gb.y2.q
        public final void a(a0 a0Var) {
            a0Var.f6932a.a(this.f6941a);
        }
    }

    public class d implements q {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eb.q f6942a;

        public d(eb.q qVar) {
            this.f6942a = qVar;
        }

        @Override // gb.y2.q
        public final void a(a0 a0Var) {
            a0Var.f6932a.j(this.f6942a);
        }
    }

    public class e implements q {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eb.s f6943a;

        public e(eb.s sVar) {
            this.f6943a = sVar;
        }

        @Override // gb.y2.q
        public final void a(a0 a0Var) {
            a0Var.f6932a.o(this.f6943a);
        }
    }

    public class f implements q {
        @Override // gb.y2.q
        public final void a(a0 a0Var) {
            a0Var.f6932a.flush();
        }
    }

    public class g implements q {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f6944a;

        public g(boolean z10) {
            this.f6944a = z10;
        }

        @Override // gb.y2.q
        public final void a(a0 a0Var) {
            a0Var.f6932a.p(this.f6944a);
        }
    }

    public class h implements q {
        @Override // gb.y2.q
        public final void a(a0 a0Var) {
            a0Var.f6932a.m();
        }
    }

    public class i implements q {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f6945a;

        public i(int i10) {
            this.f6945a = i10;
        }

        @Override // gb.y2.q
        public final void a(a0 a0Var) {
            a0Var.f6932a.g(this.f6945a);
        }
    }

    public class j implements q {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f6946a;

        public j(int i10) {
            this.f6946a = i10;
        }

        @Override // gb.y2.q
        public final void a(a0 a0Var) {
            a0Var.f6932a.h(this.f6946a);
        }
    }

    public class k implements q {
        @Override // gb.y2.q
        public final void a(a0 a0Var) {
            a0Var.f6932a.e();
        }
    }

    public class l implements q {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f6947a;

        public l(int i10) {
            this.f6947a = i10;
        }

        @Override // gb.y2.q
        public final void a(a0 a0Var) {
            a0Var.f6932a.f(this.f6947a);
        }
    }

    public class m implements q {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f6948a;

        public m(Object obj) {
            this.f6948a = obj;
        }

        @Override // gb.y2.q
        public final void a(a0 a0Var) {
            gb.s sVar = a0Var.f6932a;
            eb.t0<ReqT, ?> t0Var = y2.this.f6908a;
            sVar.d(t0Var.f5219d.b(this.f6948a));
            a0Var.f6932a.flush();
        }
    }

    public class n extends h.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eb.h f6950a;

        public n(r rVar) {
            this.f6950a = rVar;
        }

        @Override // eb.h.a
        public final eb.h a(h.b bVar, eb.s0 s0Var) {
            return this.f6950a;
        }
    }

    public class o implements Runnable {
        public o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            y2 y2Var = y2.this;
            if (y2Var.f6931z) {
                return;
            }
            y2Var.f6926u.c();
        }
    }

    public class p implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eb.e1 f6952a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t.a f6953b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ eb.s0 f6954c;

        public p(eb.e1 e1Var, t.a aVar, eb.s0 s0Var) {
            this.f6952a = e1Var;
            this.f6953b = aVar;
            this.f6954c = s0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            y2 y2Var = y2.this;
            y2Var.f6931z = true;
            y2Var.f6926u.d(this.f6952a, this.f6953b, this.f6954c);
        }
    }

    public interface q {
        void a(a0 a0Var);
    }

    public class r extends eb.h {

        /* renamed from: c, reason: collision with root package name */
        public final a0 f6956c;

        /* renamed from: d, reason: collision with root package name */
        public long f6957d;

        public r(a0 a0Var) {
            this.f6956c = a0Var;
        }

        @Override // m.e
        public final void n(long j10) {
            if (y2.this.f6921o.f != null) {
                return;
            }
            synchronized (y2.this.f6915i) {
                if (y2.this.f6921o.f == null) {
                    a0 a0Var = this.f6956c;
                    if (!a0Var.f6933b) {
                        long j11 = this.f6957d + j10;
                        this.f6957d = j11;
                        y2 y2Var = y2.this;
                        long j12 = y2Var.t;
                        if (j11 <= j12) {
                            return;
                        }
                        if (j11 > y2Var.f6917k) {
                            a0Var.f6934c = true;
                        } else {
                            long addAndGet = y2Var.f6916j.f6959a.addAndGet(j11 - j12);
                            y2 y2Var2 = y2.this;
                            y2Var2.t = this.f6957d;
                            if (addAndGet > y2Var2.f6918l) {
                                this.f6956c.f6934c = true;
                            }
                        }
                        a0 a0Var2 = this.f6956c;
                        z2 q10 = a0Var2.f6934c ? y2.this.q(a0Var2) : null;
                        if (q10 != null) {
                            q10.run();
                        }
                    }
                }
            }
        }
    }

    public static final class s {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicLong f6959a = new AtomicLong();
    }

    public static final class t {

        /* renamed from: a, reason: collision with root package name */
        public final Object f6960a;

        /* renamed from: b, reason: collision with root package name */
        public Future<?> f6961b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f6962c;

        public t(Object obj) {
            this.f6960a = obj;
        }

        public final void a(ScheduledFuture scheduledFuture) {
            synchronized (this.f6960a) {
                if (!this.f6962c) {
                    this.f6961b = scheduledFuture;
                }
            }
        }
    }

    public final class u implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final t f6963a;

        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a0 f6965a;

            public a(a0 a0Var) {
                this.f6965a = a0Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                t tVar;
                boolean z10;
                y2 y2Var;
                synchronized (y2.this.f6915i) {
                    try {
                        u uVar = u.this;
                        tVar = null;
                        z10 = true;
                        if (!uVar.f6963a.f6962c) {
                            y2 y2Var2 = y2.this;
                            y2Var2.f6921o = y2Var2.f6921o.a(this.f6965a);
                            y2 y2Var3 = y2.this;
                            if (y2Var3.v(y2Var3.f6921o)) {
                                b0 b0Var = y2.this.f6919m;
                                if (b0Var != null) {
                                    if (b0Var.f6940d.get() <= b0Var.f6938b) {
                                        z10 = false;
                                    }
                                    if (z10) {
                                    }
                                }
                                y2Var = y2.this;
                                tVar = new t(y2Var.f6915i);
                                y2Var.f6928w = tVar;
                                z10 = false;
                            }
                            y2 y2Var4 = y2.this;
                            y yVar = y2Var4.f6921o;
                            if (!yVar.f6979h) {
                                yVar = new y(yVar.f6974b, yVar.f6975c, yVar.f6976d, yVar.f, yVar.f6978g, yVar.f6973a, true, yVar.f6977e);
                            }
                            y2Var4.f6921o = yVar;
                            y2Var = y2.this;
                            y2Var.f6928w = tVar;
                            z10 = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z10) {
                    a0 a0Var = this.f6965a;
                    a0Var.f6932a.l(new z(a0Var));
                    this.f6965a.f6932a.n(eb.e1.f.g("Unneeded hedging"));
                } else {
                    if (tVar != null) {
                        y2 y2Var5 = y2.this;
                        tVar.a(y2Var5.f6911d.schedule(new u(tVar), y2Var5.f6913g.f6888b, TimeUnit.NANOSECONDS));
                    }
                    y2.this.t(this.f6965a);
                }
            }
        }

        public u(t tVar) {
            this.f6963a = tVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            y2 y2Var = y2.this;
            a0 r10 = y2Var.r(y2Var.f6921o.f6977e, false);
            if (r10 == null) {
                return;
            }
            y2.this.f6909b.execute(new a(r10));
        }
    }

    public static final class v {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f6967a;

        /* renamed from: b, reason: collision with root package name */
        public final long f6968b;

        public v(long j10, boolean z10) {
            this.f6967a = z10;
            this.f6968b = j10;
        }
    }

    public static final class w {

        /* renamed from: a, reason: collision with root package name */
        public final eb.e1 f6969a;

        /* renamed from: b, reason: collision with root package name */
        public final t.a f6970b;

        /* renamed from: c, reason: collision with root package name */
        public final eb.s0 f6971c;

        public w(eb.e1 e1Var, t.a aVar, eb.s0 s0Var) {
            this.f6969a = e1Var;
            this.f6970b = aVar;
            this.f6971c = s0Var;
        }
    }

    public class x implements q {
        public x() {
        }

        @Override // gb.y2.q
        public final void a(a0 a0Var) {
            a0Var.f6932a.l(new z(a0Var));
        }
    }

    public static final class y {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f6973a;

        /* renamed from: b, reason: collision with root package name */
        public final List<q> f6974b;

        /* renamed from: c, reason: collision with root package name */
        public final Collection<a0> f6975c;

        /* renamed from: d, reason: collision with root package name */
        public final Collection<a0> f6976d;

        /* renamed from: e, reason: collision with root package name */
        public final int f6977e;
        public final a0 f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f6978g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f6979h;

        public y(List<q> list, Collection<a0> collection, Collection<a0> collection2, a0 a0Var, boolean z10, boolean z11, boolean z12, int i10) {
            this.f6974b = list;
            x6.b.y(collection, "drainedSubstreams");
            this.f6975c = collection;
            this.f = a0Var;
            this.f6976d = collection2;
            this.f6978g = z10;
            this.f6973a = z11;
            this.f6979h = z12;
            this.f6977e = i10;
            x6.b.I(!z11 || list == null, "passThrough should imply buffer is null");
            x6.b.I((z11 && a0Var == null) ? false : true, "passThrough should imply winningSubstream != null");
            x6.b.I(!z11 || (collection.size() == 1 && collection.contains(a0Var)) || (collection.size() == 0 && a0Var.f6933b), "passThrough should imply winningSubstream is drained");
            x6.b.I((z10 && a0Var == null) ? false : true, "cancelled should imply committed");
        }

        public final y a(a0 a0Var) {
            Collection unmodifiableCollection;
            x6.b.I(!this.f6979h, "hedging frozen");
            x6.b.I(this.f == null, "already committed");
            if (this.f6976d == null) {
                unmodifiableCollection = Collections.singleton(a0Var);
            } else {
                ArrayList arrayList = new ArrayList(this.f6976d);
                arrayList.add(a0Var);
                unmodifiableCollection = Collections.unmodifiableCollection(arrayList);
            }
            return new y(this.f6974b, this.f6975c, unmodifiableCollection, this.f, this.f6978g, this.f6973a, this.f6979h, this.f6977e + 1);
        }

        public final y b(a0 a0Var) {
            ArrayList arrayList = new ArrayList(this.f6976d);
            arrayList.remove(a0Var);
            return new y(this.f6974b, this.f6975c, Collections.unmodifiableCollection(arrayList), this.f, this.f6978g, this.f6973a, this.f6979h, this.f6977e);
        }

        public final y c(a0 a0Var, a0 a0Var2) {
            ArrayList arrayList = new ArrayList(this.f6976d);
            arrayList.remove(a0Var);
            arrayList.add(a0Var2);
            return new y(this.f6974b, this.f6975c, Collections.unmodifiableCollection(arrayList), this.f, this.f6978g, this.f6973a, this.f6979h, this.f6977e);
        }

        public final y d(a0 a0Var) {
            a0Var.f6933b = true;
            if (!this.f6975c.contains(a0Var)) {
                return this;
            }
            ArrayList arrayList = new ArrayList(this.f6975c);
            arrayList.remove(a0Var);
            return new y(this.f6974b, Collections.unmodifiableCollection(arrayList), this.f6976d, this.f, this.f6978g, this.f6973a, this.f6979h, this.f6977e);
        }

        public final y e(a0 a0Var) {
            Collection unmodifiableCollection;
            x6.b.I(!this.f6973a, "Already passThrough");
            if (a0Var.f6933b) {
                unmodifiableCollection = this.f6975c;
            } else if (this.f6975c.isEmpty()) {
                unmodifiableCollection = Collections.singletonList(a0Var);
            } else {
                ArrayList arrayList = new ArrayList(this.f6975c);
                arrayList.add(a0Var);
                unmodifiableCollection = Collections.unmodifiableCollection(arrayList);
            }
            Collection collection = unmodifiableCollection;
            a0 a0Var2 = this.f;
            boolean z10 = a0Var2 != null;
            List<q> list = this.f6974b;
            if (z10) {
                x6.b.I(a0Var2 == a0Var, "Another RPC attempt has already committed");
                list = null;
            }
            return new y(list, collection, this.f6976d, this.f, this.f6978g, z10, this.f6979h, this.f6977e);
        }
    }

    public final class z implements gb.t {

        /* renamed from: a, reason: collision with root package name */
        public final a0 f6980a;

        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ eb.s0 f6982a;

            public a(eb.s0 s0Var) {
                this.f6982a = s0Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                y2.this.f6926u.b(this.f6982a);
            }
        }

        public class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a0 f6984a;

            public class a implements Runnable {
                public a() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    b bVar = b.this;
                    y2 y2Var = y2.this;
                    a0 a0Var = bVar.f6984a;
                    s0.b bVar2 = y2.A;
                    y2Var.t(a0Var);
                }
            }

            public b(a0 a0Var) {
                this.f6984a = a0Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                y2.this.f6909b.execute(new a());
            }
        }

        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                y2 y2Var = y2.this;
                y2Var.f6931z = true;
                gb.t tVar = y2Var.f6926u;
                w wVar = y2Var.f6925s;
                tVar.d(wVar.f6969a, wVar.f6970b, wVar.f6971c);
            }
        }

        public class d implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a0 f6988a;

            public d(a0 a0Var) {
                this.f6988a = a0Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                y2 y2Var = y2.this;
                a0 a0Var = this.f6988a;
                s0.b bVar = y2.A;
                y2Var.t(a0Var);
            }
        }

        public class e implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ n3.a f6990a;

            public e(n3.a aVar) {
                this.f6990a = aVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                y2.this.f6926u.a(this.f6990a);
            }
        }

        public class f implements Runnable {
            public f() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                y2 y2Var = y2.this;
                if (y2Var.f6931z) {
                    return;
                }
                y2Var.f6926u.c();
            }
        }

        public z(a0 a0Var) {
            this.f6980a = a0Var;
        }

        @Override // gb.n3
        public final void a(n3.a aVar) {
            y yVar = y2.this.f6921o;
            x6.b.I(yVar.f != null, "Headers should be received prior to messages.");
            if (yVar.f == this.f6980a) {
                y2.this.f6910c.execute(new e(aVar));
                return;
            }
            Logger logger = v0.f6828a;
            while (true) {
                InputStream next = aVar.next();
                if (next == null) {
                    return;
                } else {
                    v0.b(next);
                }
            }
        }

        @Override // gb.t
        public final void b(eb.s0 s0Var) {
            int i10;
            int i11;
            if (this.f6980a.f6935d > 0) {
                s0.b bVar = y2.A;
                s0Var.a(bVar);
                s0Var.f(bVar, String.valueOf(this.f6980a.f6935d));
            }
            y2 y2Var = y2.this;
            a0 a0Var = this.f6980a;
            s0.b bVar2 = y2.A;
            z2 q10 = y2Var.q(a0Var);
            if (q10 != null) {
                y2Var.f6909b.execute(q10);
            }
            if (y2.this.f6921o.f == this.f6980a) {
                b0 b0Var = y2.this.f6919m;
                if (b0Var != null) {
                    do {
                        i10 = b0Var.f6940d.get();
                        i11 = b0Var.f6937a;
                        if (i10 == i11) {
                            break;
                        }
                    } while (!b0Var.f6940d.compareAndSet(i10, Math.min(b0Var.f6939c + i10, i11)));
                }
                y2.this.f6910c.execute(new a(s0Var));
            }
        }

        @Override // gb.n3
        public final void c() {
            if (y2.this.b()) {
                y2.this.f6910c.execute(new f());
            }
        }

        @Override // gb.t
        public final void d(eb.e1 e1Var, t.a aVar, eb.s0 s0Var) {
            boolean z10;
            v vVar;
            long nanos;
            y2 y2Var;
            long j10;
            y2 y2Var2;
            t tVar;
            synchronized (y2.this.f6915i) {
                y2 y2Var3 = y2.this;
                y2Var3.f6921o = y2Var3.f6921o.d(this.f6980a);
                y2.this.f6920n.e(e1Var.f5081a);
            }
            if (y2.this.f6924r.decrementAndGet() == Integer.MIN_VALUE) {
                y2.this.f6910c.execute(new c());
                return;
            }
            a0 a0Var = this.f6980a;
            if (a0Var.f6934c) {
                y2 y2Var4 = y2.this;
                z2 q10 = y2Var4.q(a0Var);
                if (q10 != null) {
                    y2Var4.f6909b.execute(q10);
                }
                if (y2.this.f6921o.f == this.f6980a) {
                    y2.this.z(e1Var, aVar, s0Var);
                    return;
                }
                return;
            }
            t.a aVar2 = t.a.MISCARRIED;
            if (aVar == aVar2 && y2.this.f6923q.incrementAndGet() > 1000) {
                y2 y2Var5 = y2.this;
                z2 q11 = y2Var5.q(this.f6980a);
                if (q11 != null) {
                    y2Var5.f6909b.execute(q11);
                }
                if (y2.this.f6921o.f == this.f6980a) {
                    y2.this.z(eb.e1.f5077m.g("Too many transparent retries. Might be a bug in gRPC").f(new eb.g1(e1Var)), aVar, s0Var);
                    return;
                }
                return;
            }
            if (y2.this.f6921o.f == null) {
                if (aVar == aVar2 || (aVar == t.a.REFUSED && y2.this.f6922p.compareAndSet(false, true))) {
                    a0 r10 = y2.this.r(this.f6980a.f6935d, true);
                    if (r10 == null) {
                        return;
                    }
                    y2 y2Var6 = y2.this;
                    if (y2Var6.f6914h) {
                        synchronized (y2Var6.f6915i) {
                            y2 y2Var7 = y2.this;
                            y2Var7.f6921o = y2Var7.f6921o.c(this.f6980a, r10);
                        }
                    }
                    y2.this.f6909b.execute(new d(r10));
                    return;
                }
                if (aVar == t.a.DROPPED) {
                    y2 y2Var8 = y2.this;
                    if (y2Var8.f6914h) {
                        y2Var8.u();
                    }
                } else {
                    y2.this.f6922p.set(true);
                    y2 y2Var9 = y2.this;
                    Integer num = null;
                    if (y2Var9.f6914h) {
                        String str = (String) s0Var.c(y2.B);
                        if (str != null) {
                            try {
                                num = Integer.valueOf(str);
                            } catch (NumberFormatException unused) {
                                num = -1;
                            }
                        }
                        boolean z11 = !y2.this.f6913g.f6889c.contains(e1Var.f5081a);
                        boolean z12 = (y2.this.f6919m == null || (z11 && (num == null || num.intValue() >= 0))) ? false : !y2.this.f6919m.a();
                        if (!z11 && !z12 && !e1Var.e() && num != null && num.intValue() > 0) {
                            num = 0;
                        }
                        boolean z13 = (z11 || z12) ? false : true;
                        if (z13) {
                            y2.c(y2.this, num);
                        }
                        synchronized (y2.this.f6915i) {
                            y2 y2Var10 = y2.this;
                            y2Var10.f6921o = y2Var10.f6921o.b(this.f6980a);
                            if (z13) {
                                y2 y2Var11 = y2.this;
                                if (y2Var11.v(y2Var11.f6921o) || !y2.this.f6921o.f6976d.isEmpty()) {
                                    return;
                                }
                            }
                        }
                    } else {
                        a3 a3Var = y2Var9.f;
                        long j11 = 0;
                        if (a3Var == null) {
                            vVar = new v(0L, false);
                        } else {
                            boolean contains = a3Var.f.contains(e1Var.f5081a);
                            String str2 = (String) s0Var.c(y2.B);
                            if (str2 != null) {
                                try {
                                    num = Integer.valueOf(str2);
                                } catch (NumberFormatException unused2) {
                                    num = -1;
                                }
                            }
                            boolean z14 = (y2.this.f6919m == null || (!contains && (num == null || num.intValue() >= 0))) ? false : !y2.this.f6919m.a();
                            if (y2.this.f.f6189a > this.f6980a.f6935d + 1 && !z14) {
                                if (num == null) {
                                    if (contains) {
                                        nanos = (long) (y2.D.nextDouble() * r4.f6929x);
                                        y2Var = y2.this;
                                        double d10 = y2Var.f6929x;
                                        a3 a3Var2 = y2Var.f;
                                        j10 = Math.min((long) (d10 * a3Var2.f6192d), a3Var2.f6191c);
                                        y2Var.f6929x = j10;
                                        z10 = true;
                                        j11 = nanos;
                                    }
                                } else if (num.intValue() >= 0) {
                                    nanos = TimeUnit.MILLISECONDS.toNanos(num.intValue());
                                    y2Var = y2.this;
                                    j10 = y2Var.f.f6190b;
                                    y2Var.f6929x = j10;
                                    z10 = true;
                                    j11 = nanos;
                                }
                                vVar = new v(j11, z10);
                            }
                            z10 = false;
                            vVar = new v(j11, z10);
                        }
                        if (vVar.f6967a) {
                            a0 r11 = y2.this.r(this.f6980a.f6935d + 1, false);
                            if (r11 == null) {
                                return;
                            }
                            synchronized (y2.this.f6915i) {
                                y2Var2 = y2.this;
                                tVar = new t(y2Var2.f6915i);
                                y2Var2.f6927v = tVar;
                            }
                            tVar.a(y2Var2.f6911d.schedule(new b(r11), vVar.f6968b, TimeUnit.NANOSECONDS));
                            return;
                        }
                    }
                }
            }
            y2 y2Var12 = y2.this;
            z2 q12 = y2Var12.q(this.f6980a);
            if (q12 != null) {
                y2Var12.f6909b.execute(q12);
            }
            if (y2.this.f6921o.f == this.f6980a) {
                y2.this.z(e1Var, aVar, s0Var);
            }
        }
    }

    static {
        s0.a aVar = eb.s0.f5206d;
        BitSet bitSet = s0.d.f5211d;
        A = new s0.b("grpc-previous-rpc-attempts", aVar);
        B = new s0.b("grpc-retry-pushback-ms", aVar);
        C = eb.e1.f.g("Stream thrown away because RetriableStream committed");
        D = new Random();
    }

    public y2(eb.t0<ReqT, ?> t0Var, eb.s0 s0Var, s sVar, long j10, long j11, Executor executor, ScheduledExecutorService scheduledExecutorService, a3 a3Var, x0 x0Var, b0 b0Var) {
        this.f6908a = t0Var;
        this.f6916j = sVar;
        this.f6917k = j10;
        this.f6918l = j11;
        this.f6909b = executor;
        this.f6911d = scheduledExecutorService;
        this.f6912e = s0Var;
        this.f = a3Var;
        if (a3Var != null) {
            this.f6929x = a3Var.f6190b;
        }
        this.f6913g = x0Var;
        x6.b.s("Should not provide both retryPolicy and hedgingPolicy", a3Var == null || x0Var == null);
        this.f6914h = x0Var != null;
        this.f6919m = b0Var;
    }

    public static void c(y2 y2Var, Integer num) {
        y2Var.getClass();
        if (num == null) {
            return;
        }
        if (num.intValue() < 0) {
            y2Var.u();
            return;
        }
        synchronized (y2Var.f6915i) {
            t tVar = y2Var.f6928w;
            if (tVar != null) {
                tVar.f6962c = true;
                Future<?> future = tVar.f6961b;
                t tVar2 = new t(y2Var.f6915i);
                y2Var.f6928w = tVar2;
                if (future != null) {
                    future.cancel(false);
                }
                tVar2.a(y2Var.f6911d.schedule(new u(tVar2), num.intValue(), TimeUnit.MILLISECONDS));
            }
        }
    }

    public final void A(ReqT reqt) {
        y yVar = this.f6921o;
        if (yVar.f6973a) {
            yVar.f.f6932a.d(this.f6908a.f5219d.b(reqt));
        } else {
            s(new m(reqt));
        }
    }

    @Override // gb.m3
    public final void a(eb.l lVar) {
        s(new c(lVar));
    }

    @Override // gb.m3
    public final boolean b() {
        Iterator<a0> it = this.f6921o.f6975c.iterator();
        while (it.hasNext()) {
            if (it.next().f6932a.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // gb.m3
    public final void d(InputStream inputStream) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    @Override // gb.m3
    public final void e() {
        s(new k());
    }

    @Override // gb.m3
    public final void f(int i10) {
        y yVar = this.f6921o;
        if (yVar.f6973a) {
            yVar.f.f6932a.f(i10);
        } else {
            s(new l(i10));
        }
    }

    @Override // gb.m3
    public final void flush() {
        y yVar = this.f6921o;
        if (yVar.f6973a) {
            yVar.f.f6932a.flush();
        } else {
            s(new f());
        }
    }

    @Override // gb.s
    public final void g(int i10) {
        s(new i(i10));
    }

    @Override // gb.s
    public final void h(int i10) {
        s(new j(i10));
    }

    @Override // gb.s
    public final void i(d2.q qVar) {
        y yVar;
        d2.q qVar2;
        String str;
        synchronized (this.f6915i) {
            qVar.f(this.f6920n, "closed");
            yVar = this.f6921o;
        }
        if (yVar.f != null) {
            qVar2 = new d2.q();
            yVar.f.f6932a.i(qVar2);
            str = "committed";
        } else {
            qVar2 = new d2.q();
            for (a0 a0Var : yVar.f6975c) {
                d2.q qVar3 = new d2.q();
                a0Var.f6932a.i(qVar3);
                qVar2.e(qVar3);
            }
            str = "open";
        }
        qVar.f(qVar2, str);
    }

    @Override // gb.s
    public final void j(eb.q qVar) {
        s(new d(qVar));
    }

    @Override // gb.s
    public final void k(String str) {
        s(new b(str));
    }

    @Override // gb.s
    public final void l(gb.t tVar) {
        this.f6926u = tVar;
        eb.e1 y10 = y();
        if (y10 != null) {
            n(y10);
            return;
        }
        synchronized (this.f6915i) {
            this.f6921o.f6974b.add(new x());
        }
        a0 r10 = r(0, false);
        if (r10 == null) {
            return;
        }
        if (this.f6914h) {
            t tVar2 = null;
            synchronized (this.f6915i) {
                try {
                    this.f6921o = this.f6921o.a(r10);
                    if (v(this.f6921o)) {
                        b0 b0Var = this.f6919m;
                        if (b0Var != null) {
                            if (b0Var.f6940d.get() > b0Var.f6938b) {
                            }
                        }
                        tVar2 = new t(this.f6915i);
                        this.f6928w = tVar2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (tVar2 != null) {
                tVar2.a(this.f6911d.schedule(new u(tVar2), this.f6913g.f6888b, TimeUnit.NANOSECONDS));
            }
        }
        t(r10);
    }

    @Override // gb.s
    public final void m() {
        s(new h());
    }

    @Override // gb.s
    public final void n(eb.e1 e1Var) {
        a0 a0Var = new a0(0);
        a0Var.f6932a = new l2();
        z2 q10 = q(a0Var);
        if (q10 != null) {
            synchronized (this.f6915i) {
                this.f6921o = this.f6921o.e(a0Var);
            }
            q10.run();
            z(e1Var, t.a.PROCESSED, new eb.s0());
            return;
        }
        a0 a0Var2 = null;
        synchronized (this.f6915i) {
            if (this.f6921o.f6975c.contains(this.f6921o.f)) {
                a0Var2 = this.f6921o.f;
            } else {
                this.f6930y = e1Var;
            }
            y yVar = this.f6921o;
            this.f6921o = new y(yVar.f6974b, yVar.f6975c, yVar.f6976d, yVar.f, true, yVar.f6973a, yVar.f6979h, yVar.f6977e);
        }
        if (a0Var2 != null) {
            a0Var2.f6932a.n(e1Var);
        }
    }

    @Override // gb.s
    public final void o(eb.s sVar) {
        s(new e(sVar));
    }

    @Override // gb.s
    public final void p(boolean z10) {
        s(new g(z10));
    }

    public final z2 q(a0 a0Var) {
        List<q> list;
        Collection emptyList;
        Future<?> future;
        Future<?> future2;
        synchronized (this.f6915i) {
            if (this.f6921o.f != null) {
                return null;
            }
            Collection<a0> collection = this.f6921o.f6975c;
            y yVar = this.f6921o;
            boolean z10 = false;
            x6.b.I(yVar.f == null, "Already committed");
            List<q> list2 = yVar.f6974b;
            if (yVar.f6975c.contains(a0Var)) {
                list = null;
                emptyList = Collections.singleton(a0Var);
                z10 = true;
            } else {
                list = list2;
                emptyList = Collections.emptyList();
            }
            this.f6921o = new y(list, emptyList, yVar.f6976d, a0Var, yVar.f6978g, z10, yVar.f6979h, yVar.f6977e);
            this.f6916j.f6959a.addAndGet(-this.t);
            t tVar = this.f6927v;
            if (tVar != null) {
                tVar.f6962c = true;
                future = tVar.f6961b;
                this.f6927v = null;
            } else {
                future = null;
            }
            t tVar2 = this.f6928w;
            if (tVar2 != null) {
                tVar2.f6962c = true;
                Future<?> future3 = tVar2.f6961b;
                this.f6928w = null;
                future2 = future3;
            } else {
                future2 = null;
            }
            return new z2(this, collection, a0Var, future, future2);
        }
    }

    public final a0 r(int i10, boolean z10) {
        int i11;
        do {
            i11 = this.f6924r.get();
            if (i11 < 0) {
                return null;
            }
        } while (!this.f6924r.compareAndSet(i11, i11 + 1));
        a0 a0Var = new a0(i10);
        n nVar = new n(new r(a0Var));
        eb.s0 s0Var = this.f6912e;
        eb.s0 s0Var2 = new eb.s0();
        s0Var2.d(s0Var);
        if (i10 > 0) {
            s0Var2.f(A, String.valueOf(i10));
        }
        a0Var.f6932a = w(s0Var2, nVar, i10, z10);
        return a0Var;
    }

    public final void s(q qVar) {
        Collection<a0> collection;
        synchronized (this.f6915i) {
            if (!this.f6921o.f6973a) {
                this.f6921o.f6974b.add(qVar);
            }
            collection = this.f6921o.f6975c;
        }
        Iterator<a0> it = collection.iterator();
        while (it.hasNext()) {
            qVar.a(it.next());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        if (r0 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        r8.f6910c.execute(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        if (r2 != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        r9.f6932a.l(new gb.y2.z(r8, r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        r0 = r9.f6932a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        if (r8.f6921o.f != r9) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        r9 = r8.f6930y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        r0.n(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        r9 = gb.y2.C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
    
        r1 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008b, code lost:
    
        if (r1.hasNext() == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008d, code lost:
    
        r4 = (gb.y2.q) r1.next();
        r4.a(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0098, code lost:
    
        if ((r4 instanceof gb.y2.x) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009a, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009b, code lost:
    
        r4 = r8.f6921o;
        r5 = r4.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009f, code lost:
    
        if (r5 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a1, code lost:
    
        if (r5 == r9) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a6, code lost:
    
        if (r4.f6978g == false) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(gb.y2.a0 r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            r3 = r0
            r2 = r1
        L4:
            java.lang.Object r4 = r8.f6915i
            monitor-enter(r4)
            gb.y2$y r5 = r8.f6921o     // Catch: java.lang.Throwable -> Lab
            gb.y2$a0 r6 = r5.f     // Catch: java.lang.Throwable -> Lab
            if (r6 == 0) goto L10
            if (r6 == r9) goto L10
            goto L30
        L10:
            boolean r6 = r5.f6978g     // Catch: java.lang.Throwable -> Lab
            if (r6 == 0) goto L15
            goto L30
        L15:
            java.util.List<gb.y2$q> r6 = r5.f6974b     // Catch: java.lang.Throwable -> Lab
            int r6 = r6.size()     // Catch: java.lang.Throwable -> Lab
            if (r1 != r6) goto L56
            gb.y2$y r0 = r5.e(r9)     // Catch: java.lang.Throwable -> Lab
            r8.f6921o = r0     // Catch: java.lang.Throwable -> Lab
            boolean r0 = r8.b()     // Catch: java.lang.Throwable -> Lab
            if (r0 != 0) goto L2b
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lab
            return
        L2b:
            gb.y2$o r0 = new gb.y2$o     // Catch: java.lang.Throwable -> Lab
            r0.<init>()     // Catch: java.lang.Throwable -> Lab
        L30:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto L39
            eb.h1 r9 = r8.f6910c
            r9.execute(r0)
            return
        L39:
            if (r2 != 0) goto L45
            gb.s r0 = r9.f6932a
            gb.y2$z r1 = new gb.y2$z
            r1.<init>(r9)
            r0.l(r1)
        L45:
            gb.s r0 = r9.f6932a
            gb.y2$y r1 = r8.f6921o
            gb.y2$a0 r1 = r1.f
            if (r1 != r9) goto L50
            eb.e1 r9 = r8.f6930y
            goto L52
        L50:
            eb.e1 r9 = gb.y2.C
        L52:
            r0.n(r9)
            return
        L56:
            boolean r6 = r9.f6933b     // Catch: java.lang.Throwable -> Lab
            if (r6 == 0) goto L5c
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lab
            return
        L5c:
            int r6 = r1 + 128
            java.util.List<gb.y2$q> r7 = r5.f6974b     // Catch: java.lang.Throwable -> Lab
            int r7 = r7.size()     // Catch: java.lang.Throwable -> Lab
            int r6 = java.lang.Math.min(r6, r7)     // Catch: java.lang.Throwable -> Lab
            if (r3 != 0) goto L76
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lab
            java.util.List<gb.y2$q> r5 = r5.f6974b     // Catch: java.lang.Throwable -> Lab
            java.util.List r1 = r5.subList(r1, r6)     // Catch: java.lang.Throwable -> Lab
            r3.<init>(r1)     // Catch: java.lang.Throwable -> Lab
            goto L82
        L76:
            r3.clear()     // Catch: java.lang.Throwable -> Lab
            java.util.List<gb.y2$q> r5 = r5.f6974b     // Catch: java.lang.Throwable -> Lab
            java.util.List r1 = r5.subList(r1, r6)     // Catch: java.lang.Throwable -> Lab
            r3.addAll(r1)     // Catch: java.lang.Throwable -> Lab
        L82:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lab
            java.util.Iterator r1 = r3.iterator()
        L87:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto La8
            java.lang.Object r4 = r1.next()
            gb.y2$q r4 = (gb.y2.q) r4
            r4.a(r9)
            boolean r4 = r4 instanceof gb.y2.x
            if (r4 == 0) goto L9b
            r2 = 1
        L9b:
            gb.y2$y r4 = r8.f6921o
            gb.y2$a0 r5 = r4.f
            if (r5 == 0) goto La4
            if (r5 == r9) goto La4
            goto La8
        La4:
            boolean r4 = r4.f6978g
            if (r4 == 0) goto L87
        La8:
            r1 = r6
            goto L4
        Lab:
            r9 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lab
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.y2.t(gb.y2$a0):void");
    }

    public final void u() {
        Future<?> future;
        synchronized (this.f6915i) {
            t tVar = this.f6928w;
            future = null;
            if (tVar != null) {
                tVar.f6962c = true;
                Future<?> future2 = tVar.f6961b;
                this.f6928w = null;
                future = future2;
            }
            y yVar = this.f6921o;
            if (!yVar.f6979h) {
                yVar = new y(yVar.f6974b, yVar.f6975c, yVar.f6976d, yVar.f, yVar.f6978g, yVar.f6973a, true, yVar.f6977e);
            }
            this.f6921o = yVar;
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    public final boolean v(y yVar) {
        return yVar.f == null && yVar.f6977e < this.f6913g.f6887a && !yVar.f6979h;
    }

    public abstract gb.s w(eb.s0 s0Var, n nVar, int i10, boolean z10);

    public abstract void x();

    public abstract eb.e1 y();

    public final void z(eb.e1 e1Var, t.a aVar, eb.s0 s0Var) {
        this.f6925s = new w(e1Var, aVar, s0Var);
        if (this.f6924r.addAndGet(Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            this.f6910c.execute(new p(e1Var, aVar, s0Var));
        }
    }
}
