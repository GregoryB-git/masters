/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.String
 */
package r6;

import g6.l;
import g6.p;
import kotlin.jvm.internal.j;
import m6.e;
import r6.b;
import r6.i;
import u6.F;
import u6.G;

public abstract class c {
    public static final i a = new i(-1L, null, null, 0);
    public static final int b = G.g("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);
    public static final int c = G.g("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);
    public static final F d = new F("BUFFERED");
    public static final F e = new F("SHOULD_BUFFER");
    public static final F f = new F("S_RESUMING_BY_RCV");
    public static final F g = new F("RESUMING_BY_EB");
    public static final F h = new F("POISONED");
    public static final F i = new F("DONE_RCV");
    public static final F j = new F("INTERRUPTED_SEND");
    public static final F k = new F("INTERRUPTED_RCV");
    public static final F l = new F("CHANNEL_CLOSED");
    public static final F m = new F("SUSPEND");
    public static final F n = new F("SUSPEND_NO_WAITER");
    public static final F o = new F("FAILED");
    public static final F p = new F("NO_RECEIVE_RESULT");
    public static final F q = new F("CLOSE_HANDLER_CLOSED");
    public static final F r = new F("CLOSE_HANDLER_INVOKED");
    public static final F s = new F("NO_CLOSE_CAUSE");

    public static final long A(int n8) {
        if (n8 != 0) {
            if (n8 != Integer.MAX_VALUE) {
                return n8;
            }
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    public static final boolean B(p6.l l8, Object object, l l9) {
        if ((object = l8.g(object, null, l9)) != null) {
            l8.p(object);
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean C(p6.l l8, Object object, l l9, int n8, Object object2) {
        if ((n8 & 2) != 0) {
            l9 = null;
        }
        return c.B(l8, object, l9);
    }

    public static final /* synthetic */ long a(long l8, boolean bl) {
        return c.v(l8, bl);
    }

    public static final /* synthetic */ long b(long l8, int n8) {
        return c.w(l8, n8);
    }

    public static final /* synthetic */ F d() {
        return q;
    }

    public static final /* synthetic */ F e() {
        return r;
    }

    public static final /* synthetic */ F f() {
        return i;
    }

    public static final /* synthetic */ int g() {
        return c;
    }

    public static final /* synthetic */ F h() {
        return o;
    }

    public static final /* synthetic */ F i() {
        return k;
    }

    public static final /* synthetic */ F j() {
        return j;
    }

    public static final /* synthetic */ F k() {
        return e;
    }

    public static final /* synthetic */ F l() {
        return s;
    }

    public static final /* synthetic */ F m() {
        return p;
    }

    public static final /* synthetic */ i n() {
        return a;
    }

    public static final /* synthetic */ F o() {
        return h;
    }

    public static final /* synthetic */ F p() {
        return g;
    }

    public static final /* synthetic */ F q() {
        return f;
    }

    public static final /* synthetic */ F r() {
        return m;
    }

    public static final /* synthetic */ F s() {
        return n;
    }

    public static final /* synthetic */ long t(int n8) {
        return c.A(n8);
    }

    public static final /* synthetic */ boolean u(p6.l l8, Object object, l l9) {
        return c.B(l8, object, l9);
    }

    public static final long v(long l8, boolean bl) {
        long l9 = bl ? 0x4000000000000000L : 0L;
        return l9 + l8;
    }

    public static final long w(long l8, int n8) {
        return ((long)n8 << 60) + l8;
    }

    public static final i x(long l8, i i8) {
        return new i(l8, i8, i8.u(), 0);
    }

    public static final e y() {
        return .o;
    }

    public static final F z() {
        return l;
    }

}

