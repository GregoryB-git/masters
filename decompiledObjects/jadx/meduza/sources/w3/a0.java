package w3;

import android.media.metrics.LogSessionId;
import v5.e0;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f16196a;

    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f16197b = 0;

        /* renamed from: a, reason: collision with root package name */
        public final LogSessionId f16198a;

        static {
            LogSessionId logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        }

        public a(LogSessionId logSessionId) {
            this.f16198a = logSessionId;
        }
    }

    static {
        if (e0.f15881a < 31) {
            new a0();
        } else {
            int i10 = a.f16197b;
        }
    }

    public a0() {
        this((a) null);
        x6.b.H(e0.f15881a < 31);
    }

    public a0(LogSessionId logSessionId) {
        this(new a(logSessionId));
    }

    public a0(a aVar) {
        this.f16196a = aVar;
    }
}
