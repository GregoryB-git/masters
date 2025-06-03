package y1;

import O1.P;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import x1.C2146B;
import x1.C2148a;

/* renamed from: y1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2244a implements Serializable {

    /* renamed from: q, reason: collision with root package name */
    public static final C0297a f21347q = new C0297a(null);
    private static final long serialVersionUID = 1;

    /* renamed from: o, reason: collision with root package name */
    public final String f21348o;

    /* renamed from: p, reason: collision with root package name */
    public final String f21349p;

    /* renamed from: y1.a$a, reason: collision with other inner class name */
    public static final class C0297a {
        public C0297a() {
        }

        public /* synthetic */ C0297a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* renamed from: y1.a$b */
    public static final class b implements Serializable {

        /* renamed from: q, reason: collision with root package name */
        public static final C0298a f21350q = new C0298a(null);
        private static final long serialVersionUID = -2488473066578201069L;

        /* renamed from: o, reason: collision with root package name */
        public final String f21351o;

        /* renamed from: p, reason: collision with root package name */
        public final String f21352p;

        /* renamed from: y1.a$b$a, reason: collision with other inner class name */
        public static final class C0298a {
            public C0298a() {
            }

            public /* synthetic */ C0298a(kotlin.jvm.internal.g gVar) {
                this();
            }
        }

        public b(String str, String appId) {
            Intrinsics.checkNotNullParameter(appId, "appId");
            this.f21351o = str;
            this.f21352p = appId;
        }

        private final Object readResolve() {
            return new C2244a(this.f21351o, this.f21352p);
        }
    }

    public C2244a(String str, String applicationId) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        this.f21348o = applicationId;
        this.f21349p = P.c0(str) ? null : str;
    }

    private final Object writeReplace() {
        return new b(this.f21349p, this.f21348o);
    }

    public final String a() {
        return this.f21349p;
    }

    public final String b() {
        return this.f21348o;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2244a)) {
            return false;
        }
        P p7 = P.f3756a;
        C2244a c2244a = (C2244a) obj;
        return P.e(c2244a.f21349p, this.f21349p) && P.e(c2244a.f21348o, this.f21348o);
    }

    public int hashCode() {
        String str = this.f21349p;
        return (str == null ? 0 : str.hashCode()) ^ this.f21348o.hashCode();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2244a(C2148a accessToken) {
        this(accessToken.l(), C2146B.m());
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
    }
}
