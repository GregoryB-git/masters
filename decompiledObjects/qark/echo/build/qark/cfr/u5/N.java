/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.LongSparseArray
 *  android.view.MotionEvent
 *  java.lang.Long
 *  java.lang.Object
 *  java.util.PriorityQueue
 *  java.util.concurrent.atomic.AtomicLong
 */
package u5;

import android.util.LongSparseArray;
import android.view.MotionEvent;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;

public final class N {
    public static N c;
    public final LongSparseArray a = new LongSparseArray();
    public final PriorityQueue b = new PriorityQueue();

    public static N a() {
        if (c == null) {
            c = new N();
        }
        return c;
    }

    public MotionEvent b(a a8) {
        while (!this.b.isEmpty() && (Long)this.b.peek() < a8.a) {
            this.a.remove(((Long)this.b.poll()).longValue());
        }
        if (!this.b.isEmpty() && (Long)this.b.peek() == a8.a) {
            this.b.poll();
        }
        MotionEvent motionEvent = (MotionEvent)this.a.get(a8.a);
        this.a.remove(a8.a);
        return motionEvent;
    }

    public a c(MotionEvent motionEvent) {
        a a8 = a.b();
        motionEvent = MotionEvent.obtain((MotionEvent)motionEvent);
        this.a.put(a8.a, (Object)motionEvent);
        this.b.add((Object)a8.a);
        return a8;
    }

    public static class a {
        public static final AtomicLong b = new AtomicLong(0L);
        public final long a;

        public a(long l8) {
            this.a = l8;
        }

        public static a b() {
            return a.c(b.incrementAndGet());
        }

        public static a c(long l8) {
            return new a(l8);
        }

        public long d() {
            return this.a;
        }
    }

}

