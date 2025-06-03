package q3;

import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class e {

    public static abstract class a {

        /* renamed from: q3.e$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC0199a {
        }

        public abstract long a();

        public abstract Set<b> b();

        public abstract long c();
    }

    public enum b {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    public abstract t3.a a();

    public final long b(h3.e eVar, long j10, int i10) {
        long a10 = j10 - a().a();
        a aVar = c().get(eVar);
        long a11 = aVar.a();
        return Math.min(Math.max((long) (Math.pow(3.0d, i10 - 1) * a11 * Math.max(1.0d, Math.log(10000.0d) / Math.log((a11 > 1 ? a11 : 2L) * r12))), a10), aVar.c());
    }

    public abstract Map<h3.e, a> c();
}
