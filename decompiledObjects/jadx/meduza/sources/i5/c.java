package i5;

import h5.h;
import h5.k;
import h5.l;
import io.flutter.plugins.firebase.auth.g;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import v5.e0;
import z3.h;

/* loaded from: classes.dex */
public abstract class c implements h {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque<a> f7556a = new ArrayDeque<>();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque<l> f7557b;

    /* renamed from: c, reason: collision with root package name */
    public final PriorityQueue<a> f7558c;

    /* renamed from: d, reason: collision with root package name */
    public a f7559d;

    /* renamed from: e, reason: collision with root package name */
    public long f7560e;
    public long f;

    public static final class a extends k implements Comparable<a> {

        /* renamed from: r, reason: collision with root package name */
        public long f7561r;

        @Override // java.lang.Comparable
        public final int compareTo(a aVar) {
            a aVar2 = aVar;
            if (m(4) == aVar2.m(4)) {
                long j10 = this.f17534e - aVar2.f17534e;
                if (j10 == 0) {
                    j10 = this.f7561r - aVar2.f7561r;
                    if (j10 == 0) {
                        return 0;
                    }
                }
                if (j10 > 0) {
                    return 1;
                }
            } else if (m(4)) {
                return 1;
            }
            return -1;
        }
    }

    public static final class b extends l {

        /* renamed from: e, reason: collision with root package name */
        public h.a<b> f7562e;

        public b(g gVar) {
            this.f7562e = gVar;
        }

        @Override // z3.h
        public final void o() {
            c cVar = (c) ((g) this.f7562e).f8032b;
            cVar.getClass();
            this.f17508a = 0;
            this.f7139c = null;
            cVar.f7557b.add(this);
        }
    }

    public c() {
        int i10;
        int i11 = 0;
        while (true) {
            i10 = 10;
            if (i11 >= 10) {
                break;
            }
            this.f7556a.add(new a());
            i11++;
        }
        this.f7557b = new ArrayDeque<>();
        for (int i12 = 0; i12 < 2; i12++) {
            this.f7557b.add(new b(new g(this, i10)));
        }
        this.f7558c = new PriorityQueue<>();
    }

    @Override // h5.h
    public final void a(long j10) {
        this.f7560e = j10;
    }

    @Override // z3.d
    public final k c() {
        x6.b.H(this.f7559d == null);
        if (this.f7556a.isEmpty()) {
            return null;
        }
        a pollFirst = this.f7556a.pollFirst();
        this.f7559d = pollFirst;
        return pollFirst;
    }

    @Override // z3.d
    public final void d(k kVar) {
        x6.b.q(kVar == this.f7559d);
        a aVar = (a) kVar;
        if (aVar.n()) {
            aVar.o();
            this.f7556a.add(aVar);
        } else {
            long j10 = this.f;
            this.f = 1 + j10;
            aVar.f7561r = j10;
            this.f7558c.add(aVar);
        }
        this.f7559d = null;
    }

    public abstract d e();

    public abstract void f(a aVar);

    @Override // z3.d
    public void flush() {
        this.f = 0L;
        this.f7560e = 0L;
        while (!this.f7558c.isEmpty()) {
            a poll = this.f7558c.poll();
            int i10 = e0.f15881a;
            poll.o();
            this.f7556a.add(poll);
        }
        a aVar = this.f7559d;
        if (aVar != null) {
            aVar.o();
            this.f7556a.add(aVar);
            this.f7559d = null;
        }
    }

    @Override // z3.d
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public l b() {
        l pollFirst;
        if (this.f7557b.isEmpty()) {
            return null;
        }
        while (!this.f7558c.isEmpty()) {
            a peek = this.f7558c.peek();
            int i10 = e0.f15881a;
            if (peek.f17534e > this.f7560e) {
                break;
            }
            a poll = this.f7558c.poll();
            if (poll.m(4)) {
                pollFirst = this.f7557b.pollFirst();
                pollFirst.l(4);
            } else {
                f(poll);
                if (h()) {
                    d e10 = e();
                    pollFirst = this.f7557b.pollFirst();
                    pollFirst.p(poll.f17534e, e10, Long.MAX_VALUE);
                } else {
                    poll.o();
                    this.f7556a.add(poll);
                }
            }
            poll.o();
            this.f7556a.add(poll);
            return pollFirst;
        }
        return null;
    }

    public abstract boolean h();

    @Override // z3.d
    public void release() {
    }
}
