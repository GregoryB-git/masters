package y1;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: y1.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2238G implements Serializable {

    /* renamed from: p, reason: collision with root package name */
    public static final a f21326p = new a(null);
    private static final long serialVersionUID = 20160629001L;

    /* renamed from: o, reason: collision with root package name */
    public final HashMap f21327o;

    /* renamed from: y1.G$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* renamed from: y1.G$b */
    public static final class b implements Serializable {

        /* renamed from: p, reason: collision with root package name */
        public static final a f21328p = new a(null);
        private static final long serialVersionUID = 20160629001L;

        /* renamed from: o, reason: collision with root package name */
        public final HashMap f21329o;

        /* renamed from: y1.G$b$a */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
                this();
            }
        }

        public b(HashMap proxyEvents) {
            Intrinsics.checkNotNullParameter(proxyEvents, "proxyEvents");
            this.f21329o = proxyEvents;
        }

        private final Object readResolve() {
            return new C2238G(this.f21329o);
        }
    }

    public C2238G() {
        this.f21327o = new HashMap();
    }

    private final Object writeReplace() {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            return new b(this.f21327o);
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }

    public final void a(C2244a accessTokenAppIdPair, List appEvents) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "accessTokenAppIdPair");
            Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            if (!this.f21327o.containsKey(accessTokenAppIdPair)) {
                this.f21327o.put(accessTokenAppIdPair, W5.w.I(appEvents));
                return;
            }
            List list = (List) this.f21327o.get(accessTokenAppIdPair);
            if (list == null) {
                return;
            }
            list.addAll(appEvents);
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public final Set b() {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            Set entrySet = this.f21327o.entrySet();
            Intrinsics.checkNotNullExpressionValue(entrySet, "events.entries");
            return entrySet;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }

    public C2238G(HashMap appEventMap) {
        Intrinsics.checkNotNullParameter(appEventMap, "appEventMap");
        HashMap hashMap = new HashMap();
        this.f21327o = hashMap;
        hashMap.putAll(appEventMap);
    }
}
