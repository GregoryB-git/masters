package R4;

import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5767a;

    /* renamed from: b, reason: collision with root package name */
    public final x f5768b;

    /* renamed from: c, reason: collision with root package name */
    public final g6.a f5769c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5770d;

    /* renamed from: e, reason: collision with root package name */
    public int f5771e;

    /* renamed from: f, reason: collision with root package name */
    public p f5772f;

    public /* synthetic */ class a extends kotlin.jvm.internal.j implements g6.a {

        /* renamed from: o, reason: collision with root package name */
        public static final a f5773o = new a();

        public a() {
            super(0, UUID.class, "randomUUID", "randomUUID()Ljava/util/UUID;", 0);
        }

        @Override // g6.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    public s(boolean z7, x timeProvider, g6.a uuidGenerator) {
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(uuidGenerator, "uuidGenerator");
        this.f5767a = z7;
        this.f5768b = timeProvider;
        this.f5769c = uuidGenerator;
        this.f5770d = b();
        this.f5771e = -1;
    }

    public final p a() {
        int i7 = this.f5771e + 1;
        this.f5771e = i7;
        this.f5772f = new p(i7 == 0 ? this.f5770d : b(), this.f5770d, this.f5771e, this.f5768b.a());
        return d();
    }

    public final String b() {
        String q7;
        String uuid = ((UUID) this.f5769c.invoke()).toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "uuidGenerator().toString()");
        q7 = kotlin.text.r.q(uuid, "-", "", false, 4, null);
        String lowerCase = q7.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public final boolean c() {
        return this.f5767a;
    }

    public final p d() {
        p pVar = this.f5772f;
        if (pVar != null) {
            return pVar;
        }
        Intrinsics.n("currentSession");
        return null;
    }

    public final boolean e() {
        return this.f5772f != null;
    }

    public /* synthetic */ s(boolean z7, x xVar, g6.a aVar, int i7, kotlin.jvm.internal.g gVar) {
        this(z7, xVar, (i7 & 4) != 0 ? a.f5773o : aVar);
    }
}
