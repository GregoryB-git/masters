// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u5;

import java.util.concurrent.atomic.AtomicLong;
import android.view.MotionEvent;
import java.util.PriorityQueue;
import android.util.LongSparseArray;

public final class N
{
    public static N c;
    public final LongSparseArray a;
    public final PriorityQueue b;
    
    public N() {
        this.a = new LongSparseArray();
        this.b = new PriorityQueue();
    }
    
    public static N a() {
        if (N.c == null) {
            N.c = new N();
        }
        return N.c;
    }
    
    public MotionEvent b(final a a) {
        while (!this.b.isEmpty() && this.b.peek() < N.a.a(a)) {
            this.a.remove((long)this.b.poll());
        }
        if (!this.b.isEmpty() && this.b.peek() == N.a.a(a)) {
            this.b.poll();
        }
        final MotionEvent motionEvent = (MotionEvent)this.a.get(N.a.a(a));
        this.a.remove(N.a.a(a));
        return motionEvent;
    }
    
    public a c(MotionEvent obtain) {
        final a b = N.a.b();
        obtain = MotionEvent.obtain(obtain);
        this.a.put(N.a.a(b), (Object)obtain);
        this.b.add(N.a.a(b));
        return b;
    }
    
    public static class a
    {
        public static final AtomicLong b;
        public final long a;
        
        static {
            b = new AtomicLong(0L);
        }
        
        public a(final long a) {
            this.a = a;
        }
        
        public static /* synthetic */ long a(final a a) {
            return a.a;
        }
        
        public static a b() {
            return c(a.b.incrementAndGet());
        }
        
        public static a c(final long n) {
            return new a(n);
        }
        
        public long d() {
            return this.a;
        }
    }
}
