package eb;

import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;
import n7.g;

/* loaded from: classes.dex */
public final class t0<ReqT, RespT> {

    /* renamed from: a, reason: collision with root package name */
    public final c f5216a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5217b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5218c;

    /* renamed from: d, reason: collision with root package name */
    public final b<ReqT> f5219d;

    /* renamed from: e, reason: collision with root package name */
    public final b<RespT> f5220e;
    public final Object f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5221g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f5222h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f5223i;

    public static final class a<ReqT, RespT> {

        /* renamed from: a, reason: collision with root package name */
        public b<ReqT> f5224a;

        /* renamed from: b, reason: collision with root package name */
        public b<RespT> f5225b;

        /* renamed from: c, reason: collision with root package name */
        public c f5226c;

        /* renamed from: d, reason: collision with root package name */
        public String f5227d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f5228e;

        public final t0<ReqT, RespT> a() {
            return new t0<>(this.f5226c, this.f5227d, this.f5224a, this.f5225b, this.f5228e);
        }
    }

    public interface b<T> {
        ma.s0 a(InputStream inputStream);

        lb.a b(Object obj);
    }

    public enum c {
        UNARY,
        /* JADX INFO: Fake field, exist only in values array */
        CLIENT_STREAMING,
        SERVER_STREAMING,
        BIDI_STREAMING,
        /* JADX INFO: Fake field, exist only in values array */
        UNKNOWN
    }

    public t0(c cVar, String str, b bVar, b bVar2, boolean z10) {
        new AtomicReferenceArray(2);
        x6.b.y(cVar, "type");
        this.f5216a = cVar;
        x6.b.y(str, "fullMethodName");
        this.f5217b = str;
        int lastIndexOf = str.lastIndexOf(47);
        this.f5218c = lastIndexOf == -1 ? null : str.substring(0, lastIndexOf);
        x6.b.y(bVar, "requestMarshaller");
        this.f5219d = bVar;
        x6.b.y(bVar2, "responseMarshaller");
        this.f5220e = bVar2;
        this.f = null;
        this.f5221g = false;
        this.f5222h = false;
        this.f5223i = z10;
    }

    public static String a(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        x6.b.y(str, "fullServiceName");
        sb2.append(str);
        sb2.append(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
        x6.b.y(str2, "methodName");
        sb2.append(str2);
        return sb2.toString();
    }

    public static <ReqT, RespT> a<ReqT, RespT> b() {
        a<ReqT, RespT> aVar = new a<>();
        aVar.f5224a = null;
        aVar.f5225b = null;
        return aVar;
    }

    public final String toString() {
        g.a b10 = n7.g.b(this);
        b10.a(this.f5217b, "fullMethodName");
        b10.a(this.f5216a, "type");
        b10.c("idempotent", this.f5221g);
        b10.c("safe", this.f5222h);
        b10.c("sampledToLocalTracing", this.f5223i);
        b10.a(this.f5219d, "requestMarshaller");
        b10.a(this.f5220e, "responseMarshaller");
        b10.a(this.f, "schemaDescriptor");
        b10.f11291d = true;
        return b10.toString();
    }
}
