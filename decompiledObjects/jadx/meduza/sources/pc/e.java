package pc;

import d2.h0;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final k<Object> f13141a = new k<>(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f13142b = x6.b.w0("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);

    /* renamed from: c, reason: collision with root package name */
    public static final int f13143c = x6.b.w0("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12);

    /* renamed from: d, reason: collision with root package name */
    public static final h0 f13144d = new h0("BUFFERED", 9);

    /* renamed from: e, reason: collision with root package name */
    public static final h0 f13145e = new h0("SHOULD_BUFFER", 9);
    public static final h0 f = new h0("S_RESUMING_BY_RCV", 9);

    /* renamed from: g, reason: collision with root package name */
    public static final h0 f13146g = new h0("RESUMING_BY_EB", 9);

    /* renamed from: h, reason: collision with root package name */
    public static final h0 f13147h = new h0("POISONED", 9);

    /* renamed from: i, reason: collision with root package name */
    public static final h0 f13148i = new h0("DONE_RCV", 9);

    /* renamed from: j, reason: collision with root package name */
    public static final h0 f13149j = new h0("INTERRUPTED_SEND", 9);

    /* renamed from: k, reason: collision with root package name */
    public static final h0 f13150k = new h0("INTERRUPTED_RCV", 9);

    /* renamed from: l, reason: collision with root package name */
    public static final h0 f13151l = new h0("CHANNEL_CLOSED", 9);

    /* renamed from: m, reason: collision with root package name */
    public static final h0 f13152m = new h0("SUSPEND", 9);

    /* renamed from: n, reason: collision with root package name */
    public static final h0 f13153n = new h0("SUSPEND_NO_WAITER", 9);

    /* renamed from: o, reason: collision with root package name */
    public static final h0 f13154o = new h0("FAILED", 9);

    /* renamed from: p, reason: collision with root package name */
    public static final h0 f13155p = new h0("NO_RECEIVE_RESULT", 9);

    /* renamed from: q, reason: collision with root package name */
    public static final h0 f13156q = new h0("CLOSE_HANDLER_CLOSED", 9);

    /* renamed from: r, reason: collision with root package name */
    public static final h0 f13157r = new h0("CLOSE_HANDLER_INVOKED", 9);

    /* renamed from: s, reason: collision with root package name */
    public static final h0 f13158s = new h0("NO_CLOSE_CAUSE", 9);

    public static final <T> boolean a(nc.k<? super T> kVar, T t, dc.l<? super Throwable, rb.h> lVar) {
        h0 j10 = kVar.j(t, lVar);
        if (j10 == null) {
            return false;
        }
        kVar.n(j10);
        return true;
    }
}
