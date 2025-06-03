package i9;

import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;
import n9.a;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: c, reason: collision with root package name */
    public static final long f7767c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f7768d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f7769e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final p f7770a;

    /* renamed from: b, reason: collision with root package name */
    public final b f7771b;

    public class a implements k1 {

        /* renamed from: a, reason: collision with root package name */
        public final n9.a f7772a;

        /* renamed from: b, reason: collision with root package name */
        public final n f7773b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f7774c = false;

        /* renamed from: d, reason: collision with root package name */
        public a.C0174a f7775d;

        public a(n9.a aVar, n nVar) {
            this.f7772a = aVar;
            this.f7773b = nVar;
        }

        @Override // i9.k1
        public final void start() {
            if (q.this.f7771b.f7777a != -1) {
                this.f7775d = this.f7772a.b(a.c.GARBAGE_COLLECTION, this.f7774c ? q.f7768d : q.f7767c, new b.m(this, 16));
            }
        }

        @Override // i9.k1
        public final void stop() {
            a.C0174a c0174a = this.f7775d;
            if (c0174a != null) {
                c0174a.a();
            }
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public long f7777a;

        public b(long j10) {
            this.f7777a = j10;
        }
    }

    public static class c {
    }

    public static class d {

        /* renamed from: c, reason: collision with root package name */
        public static final q5.i f7778c = new q5.i(4);

        /* renamed from: a, reason: collision with root package name */
        public final PriorityQueue<Long> f7779a;

        /* renamed from: b, reason: collision with root package name */
        public final int f7780b;

        public d(int i10) {
            this.f7780b = i10;
            this.f7779a = new PriorityQueue<>(i10, f7778c);
        }

        public final void a(Long l10) {
            if (this.f7779a.size() >= this.f7780b) {
                if (l10.longValue() >= this.f7779a.peek().longValue()) {
                    return;
                } else {
                    this.f7779a.poll();
                }
            }
            this.f7779a.add(l10);
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        f7767c = timeUnit.toMillis(1L);
        f7768d = timeUnit.toMillis(5L);
    }

    public q(p pVar, b bVar) {
        this.f7770a = pVar;
        this.f7771b = bVar;
    }
}
