package gb;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f6450c = Logger.getLogger(h.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final String f6451a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicLong f6452b;

    public final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f6453a;

        public a(long j10) {
            this.f6453a = j10;
        }
    }

    public h(long j10) {
        AtomicLong atomicLong = new AtomicLong();
        this.f6452b = atomicLong;
        x6.b.s("value must be positive", j10 > 0);
        this.f6451a = "keepalive time nanos";
        atomicLong.set(j10);
    }
}
