package r6;

import g6.p;
import p6.InterfaceC1858l;
import u6.F;
import u6.I;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final i f19104a = new i(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f19105b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f19106c;

    /* renamed from: d, reason: collision with root package name */
    public static final F f19107d;

    /* renamed from: e, reason: collision with root package name */
    public static final F f19108e;

    /* renamed from: f, reason: collision with root package name */
    public static final F f19109f;

    /* renamed from: g, reason: collision with root package name */
    public static final F f19110g;

    /* renamed from: h, reason: collision with root package name */
    public static final F f19111h;

    /* renamed from: i, reason: collision with root package name */
    public static final F f19112i;

    /* renamed from: j, reason: collision with root package name */
    public static final F f19113j;

    /* renamed from: k, reason: collision with root package name */
    public static final F f19114k;

    /* renamed from: l, reason: collision with root package name */
    public static final F f19115l;

    /* renamed from: m, reason: collision with root package name */
    public static final F f19116m;

    /* renamed from: n, reason: collision with root package name */
    public static final F f19117n;

    /* renamed from: o, reason: collision with root package name */
    public static final F f19118o;

    /* renamed from: p, reason: collision with root package name */
    public static final F f19119p;

    /* renamed from: q, reason: collision with root package name */
    public static final F f19120q;

    /* renamed from: r, reason: collision with root package name */
    public static final F f19121r;

    /* renamed from: s, reason: collision with root package name */
    public static final F f19122s;

    public /* synthetic */ class a extends kotlin.jvm.internal.j implements p {

        /* renamed from: o, reason: collision with root package name */
        public static final a f19123o = new a();

        public a() {
            super(2, c.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        public final i b(long j7, i iVar) {
            return c.x(j7, iVar);
        }

        @Override // g6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b(((Number) obj).longValue(), (i) obj2);
        }
    }

    static {
        int e7;
        int e8;
        e7 = I.e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);
        f19105b = e7;
        e8 = I.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);
        f19106c = e8;
        f19107d = new F("BUFFERED");
        f19108e = new F("SHOULD_BUFFER");
        f19109f = new F("S_RESUMING_BY_RCV");
        f19110g = new F("RESUMING_BY_EB");
        f19111h = new F("POISONED");
        f19112i = new F("DONE_RCV");
        f19113j = new F("INTERRUPTED_SEND");
        f19114k = new F("INTERRUPTED_RCV");
        f19115l = new F("CHANNEL_CLOSED");
        f19116m = new F("SUSPEND");
        f19117n = new F("SUSPEND_NO_WAITER");
        f19118o = new F("FAILED");
        f19119p = new F("NO_RECEIVE_RESULT");
        f19120q = new F("CLOSE_HANDLER_CLOSED");
        f19121r = new F("CLOSE_HANDLER_INVOKED");
        f19122s = new F("NO_CLOSE_CAUSE");
    }

    public static final long A(int i7) {
        if (i7 == 0) {
            return 0L;
        }
        if (i7 != Integer.MAX_VALUE) {
            return i7;
        }
        return Long.MAX_VALUE;
    }

    public static final boolean B(InterfaceC1858l interfaceC1858l, Object obj, g6.l lVar) {
        Object g7 = interfaceC1858l.g(obj, null, lVar);
        if (g7 == null) {
            return false;
        }
        interfaceC1858l.p(g7);
        return true;
    }

    public static /* synthetic */ boolean C(InterfaceC1858l interfaceC1858l, Object obj, g6.l lVar, int i7, Object obj2) {
        if ((i7 & 2) != 0) {
            lVar = null;
        }
        return B(interfaceC1858l, obj, lVar);
    }

    public static final long v(long j7, boolean z7) {
        return (z7 ? 4611686018427387904L : 0L) + j7;
    }

    public static final long w(long j7, int i7) {
        return (i7 << 60) + j7;
    }

    public static final i x(long j7, i iVar) {
        return new i(j7, iVar, iVar.u(), 0);
    }

    public static final m6.e y() {
        return a.f19123o;
    }

    public static final F z() {
        return f19115l;
    }
}
