package C4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class f extends v {

    /* renamed from: a, reason: collision with root package name */
    public static f f1000a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f1001b = Collections.unmodifiableMap(new a());

    public class a extends HashMap {
        public a() {
            put(461L, "FIREPERF_AUTOPUSH");
            put(462L, "FIREPERF");
            put(675L, "FIREPERF_INTERNAL_LOW");
            put(676L, "FIREPERF_INTERNAL_HIGH");
        }
    }

    public static synchronized f e() {
        f fVar;
        synchronized (f.class) {
            try {
                if (f1000a == null) {
                    f1000a = new f();
                }
                fVar = f1000a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    public static String f(long j7) {
        return (String) f1001b.get(Long.valueOf(j7));
    }

    public static boolean g(long j7) {
        return f1001b.containsKey(Long.valueOf(j7));
    }

    @Override // C4.v
    public String a() {
        return "com.google.firebase.perf.LogSourceName";
    }

    @Override // C4.v
    public String c() {
        return "fpr_log_source";
    }

    public String d() {
        return A4.a.f545c;
    }
}
