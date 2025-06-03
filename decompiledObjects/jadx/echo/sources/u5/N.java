package u5;

import android.util.LongSparseArray;
import android.view.MotionEvent;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: c, reason: collision with root package name */
    public static N f19885c;

    /* renamed from: a, reason: collision with root package name */
    public final LongSparseArray f19886a = new LongSparseArray();

    /* renamed from: b, reason: collision with root package name */
    public final PriorityQueue f19887b = new PriorityQueue();

    public static class a {

        /* renamed from: b, reason: collision with root package name */
        public static final AtomicLong f19888b = new AtomicLong(0);

        /* renamed from: a, reason: collision with root package name */
        public final long f19889a;

        public a(long j7) {
            this.f19889a = j7;
        }

        public static a b() {
            return c(f19888b.incrementAndGet());
        }

        public static a c(long j7) {
            return new a(j7);
        }

        public long d() {
            return this.f19889a;
        }
    }

    public static N a() {
        if (f19885c == null) {
            f19885c = new N();
        }
        return f19885c;
    }

    public MotionEvent b(a aVar) {
        while (!this.f19887b.isEmpty() && ((Long) this.f19887b.peek()).longValue() < aVar.f19889a) {
            this.f19886a.remove(((Long) this.f19887b.poll()).longValue());
        }
        if (!this.f19887b.isEmpty() && ((Long) this.f19887b.peek()).longValue() == aVar.f19889a) {
            this.f19887b.poll();
        }
        MotionEvent motionEvent = (MotionEvent) this.f19886a.get(aVar.f19889a);
        this.f19886a.remove(aVar.f19889a);
        return motionEvent;
    }

    public a c(MotionEvent motionEvent) {
        a b7 = a.b();
        this.f19886a.put(b7.f19889a, MotionEvent.obtain(motionEvent));
        this.f19887b.add(Long.valueOf(b7.f19889a));
        return b7;
    }
}
