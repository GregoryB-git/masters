package d1;

import c1.k;
import c1.l;
import c1.p;
import c1.q;
import d1.e;
import g0.AbstractC1297a;
import g0.M;
import j0.j;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public abstract class e implements l {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f13107a = new ArrayDeque();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f13108b;

    /* renamed from: c, reason: collision with root package name */
    public final PriorityQueue f13109c;

    /* renamed from: d, reason: collision with root package name */
    public b f13110d;

    /* renamed from: e, reason: collision with root package name */
    public long f13111e;

    /* renamed from: f, reason: collision with root package name */
    public long f13112f;

    /* renamed from: g, reason: collision with root package name */
    public long f13113g;

    public static final class b extends p implements Comparable {

        /* renamed from: y, reason: collision with root package name */
        public long f13114y;

        public b() {
        }

        @Override // java.lang.Comparable
        /* renamed from: K, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            if (p() != bVar.p()) {
                return p() ? 1 : -1;
            }
            long j7 = this.f15402t - bVar.f15402t;
            if (j7 == 0) {
                j7 = this.f13114y - bVar.f13114y;
                if (j7 == 0) {
                    return 0;
                }
            }
            return j7 > 0 ? 1 : -1;
        }
    }

    public static final class c extends q {

        /* renamed from: u, reason: collision with root package name */
        public j.a f13115u;

        public c(j.a aVar) {
            this.f13115u = aVar;
        }

        @Override // j0.j
        public final void x() {
            this.f13115u.a(this);
        }
    }

    public e() {
        for (int i7 = 0; i7 < 10; i7++) {
            this.f13107a.add(new b());
        }
        this.f13108b = new ArrayDeque();
        for (int i8 = 0; i8 < 2; i8++) {
            this.f13108b.add(new c(new j.a() { // from class: d1.d
                @Override // j0.j.a
                public final void a(j jVar) {
                    e.this.p((e.c) jVar);
                }
            }));
        }
        this.f13109c = new PriorityQueue();
        this.f13113g = -9223372036854775807L;
    }

    @Override // j0.g
    public final void c(long j7) {
        this.f13113g = j7;
    }

    @Override // c1.l
    public void d(long j7) {
        this.f13111e = j7;
    }

    @Override // j0.g
    public void flush() {
        this.f13112f = 0L;
        this.f13111e = 0L;
        while (!this.f13109c.isEmpty()) {
            o((b) M.i((b) this.f13109c.poll()));
        }
        b bVar = this.f13110d;
        if (bVar != null) {
            o(bVar);
            this.f13110d = null;
        }
    }

    public abstract k g();

    public abstract void h(p pVar);

    @Override // j0.g
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public p f() {
        AbstractC1297a.f(this.f13110d == null);
        if (this.f13107a.isEmpty()) {
            return null;
        }
        b bVar = (b) this.f13107a.pollFirst();
        this.f13110d = bVar;
        return bVar;
    }

    @Override // j0.g
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public q a() {
        q qVar;
        if (this.f13108b.isEmpty()) {
            return null;
        }
        while (!this.f13109c.isEmpty() && ((b) M.i((b) this.f13109c.peek())).f15402t <= this.f13111e) {
            b bVar = (b) M.i((b) this.f13109c.poll());
            if (bVar.p()) {
                qVar = (q) M.i((q) this.f13108b.pollFirst());
                qVar.l(4);
            } else {
                h(bVar);
                if (m()) {
                    k g7 = g();
                    qVar = (q) M.i((q) this.f13108b.pollFirst());
                    qVar.z(bVar.f15402t, g7, Long.MAX_VALUE);
                } else {
                    o(bVar);
                }
            }
            o(bVar);
            return qVar;
        }
        return null;
    }

    public final q k() {
        return (q) this.f13108b.pollFirst();
    }

    public final long l() {
        return this.f13111e;
    }

    public abstract boolean m();

    @Override // j0.g
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void e(p pVar) {
        AbstractC1297a.a(pVar == this.f13110d);
        b bVar = (b) pVar;
        long j7 = this.f13113g;
        if (j7 == -9223372036854775807L || bVar.f15402t >= j7) {
            long j8 = this.f13112f;
            this.f13112f = 1 + j8;
            bVar.f13114y = j8;
            this.f13109c.add(bVar);
        } else {
            o(bVar);
        }
        this.f13110d = null;
    }

    public final void o(b bVar) {
        bVar.m();
        this.f13107a.add(bVar);
    }

    public void p(q qVar) {
        qVar.m();
        this.f13108b.add(qVar);
    }

    @Override // j0.g
    public void release() {
    }
}
