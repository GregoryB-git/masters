package eb;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import n7.g;

/* loaded from: classes.dex */
public abstract class u0 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f5237a;

        /* renamed from: b, reason: collision with root package name */
        public final z0 f5238b;

        /* renamed from: c, reason: collision with root package name */
        public final h1 f5239c;

        /* renamed from: d, reason: collision with root package name */
        public final f f5240d;

        /* renamed from: e, reason: collision with root package name */
        public final ScheduledExecutorService f5241e;
        public final eb.d f;

        /* renamed from: g, reason: collision with root package name */
        public final Executor f5242g;

        /* renamed from: h, reason: collision with root package name */
        public final String f5243h;

        public a(Integer num, z0 z0Var, h1 h1Var, f fVar, ScheduledExecutorService scheduledExecutorService, eb.d dVar, Executor executor, String str) {
            x6.b.y(num, "defaultPort not set");
            this.f5237a = num.intValue();
            x6.b.y(z0Var, "proxyDetector not set");
            this.f5238b = z0Var;
            x6.b.y(h1Var, "syncContext not set");
            this.f5239c = h1Var;
            x6.b.y(fVar, "serviceConfigParser not set");
            this.f5240d = fVar;
            this.f5241e = scheduledExecutorService;
            this.f = dVar;
            this.f5242g = executor;
            this.f5243h = str;
        }

        public final String toString() {
            g.a b10 = n7.g.b(this);
            b10.d(String.valueOf(this.f5237a), "defaultPort");
            b10.a(this.f5238b, "proxyDetector");
            b10.a(this.f5239c, "syncContext");
            b10.a(this.f5240d, "serviceConfigParser");
            b10.a(this.f5241e, "scheduledExecutorService");
            b10.a(this.f, "channelLogger");
            b10.a(this.f5242g, "executor");
            b10.a(this.f5243h, "overrideAuthority");
            return b10.toString();
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final e1 f5244a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f5245b;

        public b(e1 e1Var) {
            this.f5245b = null;
            x6.b.y(e1Var, "status");
            this.f5244a = e1Var;
            x6.b.n(e1Var, "cannot use OK status: %s", !e1Var.e());
        }

        public b(Object obj) {
            this.f5245b = obj;
            this.f5244a = null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return x6.b.Q(this.f5244a, bVar.f5244a) && x6.b.Q(this.f5245b, bVar.f5245b);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f5244a, this.f5245b});
        }

        public final String toString() {
            g.a b10;
            Object obj;
            String str;
            if (this.f5245b != null) {
                b10 = n7.g.b(this);
                obj = this.f5245b;
                str = "config";
            } else {
                b10 = n7.g.b(this);
                obj = this.f5244a;
                str = "error";
            }
            b10.a(obj, str);
            return b10.toString();
        }
    }

    public static abstract class c {
        public abstract void a();

        public abstract gb.i0 b(URI uri, a aVar);
    }

    public static abstract class d {
        public abstract void a(e1 e1Var);

        public abstract void b(e eVar);
    }

    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final List<u> f5246a;

        /* renamed from: b, reason: collision with root package name */
        public final eb.a f5247b;

        /* renamed from: c, reason: collision with root package name */
        public final b f5248c;

        public e(List<u> list, eb.a aVar, b bVar) {
            this.f5246a = Collections.unmodifiableList(new ArrayList(list));
            x6.b.y(aVar, "attributes");
            this.f5247b = aVar;
            this.f5248c = bVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return x6.b.Q(this.f5246a, eVar.f5246a) && x6.b.Q(this.f5247b, eVar.f5247b) && x6.b.Q(this.f5248c, eVar.f5248c);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f5246a, this.f5247b, this.f5248c});
        }

        public final String toString() {
            g.a b10 = n7.g.b(this);
            b10.a(this.f5246a, "addresses");
            b10.a(this.f5247b, "attributes");
            b10.a(this.f5248c, "serviceConfig");
            return b10.toString();
        }
    }

    public static abstract class f {
        public abstract b a(Map<String, ?> map);
    }

    public abstract String a();

    public abstract void b();

    public abstract void c();

    public abstract void d(d dVar);
}
