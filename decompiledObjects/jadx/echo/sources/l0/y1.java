package l0;

import android.media.metrics.LogSessionId;
import g0.AbstractC1297a;
import java.util.Objects;

/* loaded from: classes.dex */
public final class y1 {

    /* renamed from: d, reason: collision with root package name */
    public static final y1 f16725d;

    /* renamed from: a, reason: collision with root package name */
    public final String f16726a;

    /* renamed from: b, reason: collision with root package name */
    public final a f16727b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f16728c;

    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f16729b;

        /* renamed from: a, reason: collision with root package name */
        public final LogSessionId f16730a;

        static {
            LogSessionId logSessionId;
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            f16729b = new a(logSessionId);
        }

        public a(LogSessionId logSessionId) {
            this.f16730a = logSessionId;
        }
    }

    static {
        f16725d = g0.M.f14261a < 31 ? new y1("") : new y1(a.f16729b, "");
    }

    public y1(LogSessionId logSessionId, String str) {
        this(new a(logSessionId), str);
    }

    public LogSessionId a() {
        return ((a) AbstractC1297a.e(this.f16727b)).f16730a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        return Objects.equals(this.f16726a, y1Var.f16726a) && Objects.equals(this.f16727b, y1Var.f16727b) && Objects.equals(this.f16728c, y1Var.f16728c);
    }

    public int hashCode() {
        return Objects.hash(this.f16726a, this.f16727b, this.f16728c);
    }

    public y1(String str) {
        AbstractC1297a.f(g0.M.f14261a < 31);
        this.f16726a = str;
        this.f16727b = null;
        this.f16728c = new Object();
    }

    public y1(a aVar, String str) {
        this.f16727b = aVar;
        this.f16726a = str;
        this.f16728c = new Object();
    }
}
