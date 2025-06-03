package E1;

import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: h, reason: collision with root package name */
    public static l f1590h;

    /* renamed from: a, reason: collision with root package name */
    public final Class f1592a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f1593b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f1594c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f1595d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f1596e;

    /* renamed from: f, reason: collision with root package name */
    public final Method f1597f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f1589g = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicBoolean f1591i = new AtomicBoolean(false);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final void a() {
            Class a7 = m.a("com.android.billingclient.api.SkuDetailsParams");
            Class a8 = m.a("com.android.billingclient.api.SkuDetailsParams$Builder");
            if (a7 == null || a8 == null) {
                return;
            }
            Method d7 = m.d(a7, "newBuilder", new Class[0]);
            Method d8 = m.d(a8, "setType", String.class);
            Method d9 = m.d(a8, "setSkusList", List.class);
            Method d10 = m.d(a8, "build", new Class[0]);
            if (d7 == null || d8 == null || d9 == null || d10 == null) {
                return;
            }
            l.c(new l(a7, a8, d7, d8, d9, d10));
        }

        public final l b() {
            if (l.a().get()) {
                return l.b();
            }
            a();
            l.a().set(true);
            return l.b();
        }
    }

    public l(Class skuDetailsParamsClazz, Class builderClazz, Method newBuilderMethod, Method setTypeMethod, Method setSkusListMethod, Method buildMethod) {
        Intrinsics.checkNotNullParameter(skuDetailsParamsClazz, "skuDetailsParamsClazz");
        Intrinsics.checkNotNullParameter(builderClazz, "builderClazz");
        Intrinsics.checkNotNullParameter(newBuilderMethod, "newBuilderMethod");
        Intrinsics.checkNotNullParameter(setTypeMethod, "setTypeMethod");
        Intrinsics.checkNotNullParameter(setSkusListMethod, "setSkusListMethod");
        Intrinsics.checkNotNullParameter(buildMethod, "buildMethod");
        this.f1592a = skuDetailsParamsClazz;
        this.f1593b = builderClazz;
        this.f1594c = newBuilderMethod;
        this.f1595d = setTypeMethod;
        this.f1596e = setSkusListMethod;
        this.f1597f = buildMethod;
    }

    public static final /* synthetic */ AtomicBoolean a() {
        if (T1.a.d(l.class)) {
            return null;
        }
        try {
            return f1591i;
        } catch (Throwable th) {
            T1.a.b(th, l.class);
            return null;
        }
    }

    public static final /* synthetic */ l b() {
        if (T1.a.d(l.class)) {
            return null;
        }
        try {
            return f1590h;
        } catch (Throwable th) {
            T1.a.b(th, l.class);
            return null;
        }
    }

    public static final /* synthetic */ void c(l lVar) {
        if (T1.a.d(l.class)) {
            return;
        }
        try {
            f1590h = lVar;
        } catch (Throwable th) {
            T1.a.b(th, l.class);
        }
    }

    public final Object d(String str, List list) {
        Object e7;
        Object e8;
        if (T1.a.d(this)) {
            return null;
        }
        try {
            m mVar = m.f1598a;
            Object e9 = m.e(this.f1592a, this.f1594c, null, new Object[0]);
            if (e9 != null && (e7 = m.e(this.f1593b, this.f1595d, e9, str)) != null && (e8 = m.e(this.f1593b, this.f1596e, e7, list)) != null) {
                return m.e(this.f1593b, this.f1597f, e8, new Object[0]);
            }
            return null;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }

    public final Class e() {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            return this.f1592a;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }
}
