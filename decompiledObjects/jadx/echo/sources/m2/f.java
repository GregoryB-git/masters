package m2;

import android.app.job.JobInfo;
import c2.EnumC0821d;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import m2.C1667c;
import p2.InterfaceC1791a;

/* loaded from: classes.dex */
public abstract class f {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public InterfaceC1791a f17682a;

        /* renamed from: b, reason: collision with root package name */
        public Map f17683b = new HashMap();

        public a a(EnumC0821d enumC0821d, b bVar) {
            this.f17683b.put(enumC0821d, bVar);
            return this;
        }

        public f b() {
            if (this.f17682a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.f17683b.keySet().size() < EnumC0821d.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map map = this.f17683b;
            this.f17683b = new HashMap();
            return f.d(this.f17682a, map);
        }

        public a c(InterfaceC1791a interfaceC1791a) {
            this.f17682a = interfaceC1791a;
            return this;
        }
    }

    public static abstract class b {

        public static abstract class a {
            public abstract b a();

            public abstract a b(long j7);

            public abstract a c(Set set);

            public abstract a d(long j7);
        }

        public static a a() {
            return new C1667c.b().c(Collections.emptySet());
        }

        public abstract long b();

        public abstract Set c();

        public abstract long d();
    }

    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    public static a b() {
        return new a();
    }

    public static f d(InterfaceC1791a interfaceC1791a, Map map) {
        return new C1666b(interfaceC1791a, map);
    }

    public static f f(InterfaceC1791a interfaceC1791a) {
        return b().a(EnumC0821d.DEFAULT, b.a().b(30000L).d(86400000L).a()).a(EnumC0821d.HIGHEST, b.a().b(1000L).d(86400000L).a()).a(EnumC0821d.VERY_LOW, b.a().b(86400000L).d(86400000L).c(i(c.DEVICE_IDLE)).a()).c(interfaceC1791a).b();
    }

    public static Set i(Object... objArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(objArr)));
    }

    public final long a(int i7, long j7) {
        return (long) (Math.pow(3.0d, i7 - 1) * j7 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j7 > 1 ? j7 : 2L) * r7)));
    }

    public JobInfo.Builder c(JobInfo.Builder builder, EnumC0821d enumC0821d, long j7, int i7) {
        builder.setMinimumLatency(g(enumC0821d, j7, i7));
        j(builder, ((b) h().get(enumC0821d)).c());
        return builder;
    }

    public abstract InterfaceC1791a e();

    public long g(EnumC0821d enumC0821d, long j7, int i7) {
        long a7 = j7 - e().a();
        b bVar = (b) h().get(enumC0821d);
        return Math.min(Math.max(a(i7, bVar.b()), a7), bVar.d());
    }

    public abstract Map h();

    public final void j(JobInfo.Builder builder, Set set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }
}
