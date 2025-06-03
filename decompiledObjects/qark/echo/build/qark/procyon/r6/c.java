// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package r6;

import m6.e;
import p6.l;
import u6.G;
import u6.F;

public abstract class c
{
    public static final i a;
    public static final int b;
    public static final int c;
    public static final F d;
    public static final F e;
    public static final F f;
    public static final F g;
    public static final F h;
    public static final F i;
    public static final F j;
    public static final F k;
    public static final F l;
    public static final F m;
    public static final F n;
    public static final F o;
    public static final F p;
    public static final F q;
    public static final F r;
    public static final F s;
    
    static {
        a = new i(-1L, null, null, 0);
        b = G.g("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);
        c = G.g("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);
        d = new F("BUFFERED");
        e = new F("SHOULD_BUFFER");
        f = new F("S_RESUMING_BY_RCV");
        g = new F("RESUMING_BY_EB");
        h = new F("POISONED");
        i = new F("DONE_RCV");
        j = new F("INTERRUPTED_SEND");
        k = new F("INTERRUPTED_RCV");
        l = new F("CHANNEL_CLOSED");
        m = new F("SUSPEND");
        n = new F("SUSPEND_NO_WAITER");
        o = new F("FAILED");
        p = new F("NO_RECEIVE_RESULT");
        q = new F("CLOSE_HANDLER_CLOSED");
        r = new F("CLOSE_HANDLER_INVOKED");
        s = new F("NO_CLOSE_CAUSE");
    }
    
    public static final long A(final int n) {
        if (n == 0) {
            return 0L;
        }
        if (n != Integer.MAX_VALUE) {
            return n;
        }
        return Long.MAX_VALUE;
    }
    
    public static final boolean B(final l l, Object g, final g6.l i) {
        g = l.g(g, null, i);
        if (g != null) {
            l.p(g);
            return true;
        }
        return false;
    }
    
    public static final long v(final long n, final boolean b) {
        long n2;
        if (b) {
            n2 = 4611686018427387904L;
        }
        else {
            n2 = 0L;
        }
        return n2 + n;
    }
    
    public static final long w(final long n, final int n2) {
        return ((long)n2 << 60) + n;
    }
    
    public static final i x(final long n, final i i) {
        return new i(n, i, i.u(), 0);
    }
    
    public static final e y() {
        return c$a.o;
    }
    
    public static final F z() {
        return r6.c.l;
    }
}
