package E1;

import android.content.Context;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.r;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: u, reason: collision with root package name */
    public static h f1551u;

    /* renamed from: a, reason: collision with root package name */
    public final Context f1555a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1556b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f1557c;

    /* renamed from: d, reason: collision with root package name */
    public final Class f1558d;

    /* renamed from: e, reason: collision with root package name */
    public final Class f1559e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f1560f;

    /* renamed from: g, reason: collision with root package name */
    public final Class f1561g;

    /* renamed from: h, reason: collision with root package name */
    public final Class f1562h;

    /* renamed from: i, reason: collision with root package name */
    public final Class f1563i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f1564j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f1565k;

    /* renamed from: l, reason: collision with root package name */
    public final Method f1566l;

    /* renamed from: m, reason: collision with root package name */
    public final Method f1567m;

    /* renamed from: n, reason: collision with root package name */
    public final Method f1568n;

    /* renamed from: o, reason: collision with root package name */
    public final Method f1569o;

    /* renamed from: p, reason: collision with root package name */
    public final Method f1570p;

    /* renamed from: q, reason: collision with root package name */
    public final l f1571q;

    /* renamed from: r, reason: collision with root package name */
    public final Set f1572r;

    /* renamed from: s, reason: collision with root package name */
    public static final b f1549s = new b(null);

    /* renamed from: t, reason: collision with root package name */
    public static final AtomicBoolean f1550t = new AtomicBoolean(false);

    /* renamed from: v, reason: collision with root package name */
    public static final AtomicBoolean f1552v = new AtomicBoolean(false);

    /* renamed from: w, reason: collision with root package name */
    public static final Map f1553w = new ConcurrentHashMap();

    /* renamed from: x, reason: collision with root package name */
    public static final Map f1554x = new ConcurrentHashMap();

    public static final class a implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method m7, Object[] objArr) {
            boolean k7;
            if (T1.a.d(this)) {
                return null;
            }
            try {
                Intrinsics.checkNotNullParameter(proxy, "proxy");
                Intrinsics.checkNotNullParameter(m7, "m");
                if (Intrinsics.a(m7.getName(), "onBillingSetupFinished")) {
                    h.f1549s.f().set(true);
                } else {
                    String name = m7.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "m.name");
                    k7 = r.k(name, "onBillingServiceDisconnected", false, 2, null);
                    if (k7) {
                        h.f1549s.f().set(false);
                    }
                }
                return null;
            } catch (Throwable th) {
                T1.a.b(th, this);
                return null;
            }
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final Object a(Context context, Class cls) {
            Object e7;
            Object e8;
            Object e9;
            Class a7 = m.a("com.android.billingclient.api.BillingClient$Builder");
            Class a8 = m.a("com.android.billingclient.api.PurchasesUpdatedListener");
            if (a7 == null || a8 == null) {
                return null;
            }
            Method d7 = m.d(cls, "newBuilder", Context.class);
            Method d8 = m.d(a7, "enablePendingPurchases", new Class[0]);
            Method d9 = m.d(a7, "setListener", a8);
            Method d10 = m.d(a7, "build", new Class[0]);
            if (d7 == null || d8 == null || d9 == null || d10 == null || (e7 = m.e(cls, d7, null, context)) == null || (e8 = m.e(a7, d9, e7, Proxy.newProxyInstance(a8.getClassLoader(), new Class[]{a8}, new d()))) == null || (e9 = m.e(a7, d8, e8, new Object[0])) == null) {
                return null;
            }
            return m.e(a7, d10, e9, new Object[0]);
        }

        public final void b(Context context) {
            l b7 = l.f1589g.b();
            if (b7 == null) {
                return;
            }
            Class a7 = m.a("com.android.billingclient.api.BillingClient");
            Class a8 = m.a("com.android.billingclient.api.Purchase");
            Class a9 = m.a("com.android.billingclient.api.Purchase$PurchasesResult");
            Class a10 = m.a("com.android.billingclient.api.SkuDetails");
            Class a11 = m.a("com.android.billingclient.api.PurchaseHistoryRecord");
            Class a12 = m.a("com.android.billingclient.api.SkuDetailsResponseListener");
            Class a13 = m.a("com.android.billingclient.api.PurchaseHistoryResponseListener");
            if (a7 == null || a9 == null || a8 == null || a10 == null || a12 == null || a11 == null || a13 == null) {
                return;
            }
            Method d7 = m.d(a7, "queryPurchases", String.class);
            Method d8 = m.d(a9, "getPurchasesList", new Class[0]);
            Method d9 = m.d(a8, "getOriginalJson", new Class[0]);
            Method d10 = m.d(a10, "getOriginalJson", new Class[0]);
            Method d11 = m.d(a11, "getOriginalJson", new Class[0]);
            Method d12 = m.d(a7, "querySkuDetailsAsync", b7.e(), a12);
            Method d13 = m.d(a7, "queryPurchaseHistoryAsync", String.class, a13);
            if (d7 == null || d8 == null || d9 == null || d10 == null || d11 == null || d12 == null || d13 == null) {
                return;
            }
            Object a14 = a(context, a7);
            if (a14 == null) {
                return;
            }
            h.m(new h(context, a14, a7, a9, a8, a10, a11, a12, a13, d7, d8, d9, d10, d11, d12, d13, b7, null));
            h g7 = h.g();
            if (g7 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper");
            }
            h.n(g7);
        }

        public final synchronized h c(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (h.f().get()) {
                return h.g();
            }
            b(context);
            h.f().set(true);
            return h.g();
        }

        public final Map d() {
            return h.h();
        }

        public final Map e() {
            return h.k();
        }

        public final AtomicBoolean f() {
            return h.l();
        }
    }

    public final class c implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        public Runnable f1573a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f1574b;

        public c(h this$0, Runnable runnable) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.f1574b = this$0;
            this.f1573a = runnable;
        }

        public final void a(List list) {
            if (T1.a.d(this)) {
                return;
            }
            try {
                for (Object obj : list) {
                    try {
                        m mVar = m.f1598a;
                        Object e7 = m.e(h.i(this.f1574b), h.c(this.f1574b), obj, new Object[0]);
                        String str = e7 instanceof String ? (String) e7 : null;
                        if (str != null) {
                            JSONObject jSONObject = new JSONObject(str);
                            jSONObject.put("packageName", h.b(this.f1574b).getPackageName());
                            if (jSONObject.has("productId")) {
                                String skuID = jSONObject.getString("productId");
                                h.e(this.f1574b).add(skuID);
                                Map d7 = h.f1549s.d();
                                Intrinsics.checkNotNullExpressionValue(skuID, "skuID");
                                d7.put(skuID, jSONObject);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                this.f1573a.run();
            } catch (Throwable th) {
                T1.a.b(th, this);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method method, Object[] objArr) {
            if (T1.a.d(this)) {
                return null;
            }
            try {
                Intrinsics.checkNotNullParameter(proxy, "proxy");
                Intrinsics.checkNotNullParameter(method, "method");
                if (Intrinsics.a(method.getName(), "onPurchaseHistoryResponse")) {
                    Object obj = objArr == null ? null : objArr[1];
                    if (obj != null && (obj instanceof List)) {
                        a((List) obj);
                    }
                }
                return null;
            } catch (Throwable th) {
                T1.a.b(th, this);
                return null;
            }
        }
    }

    public static final class d implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method m7, Object[] objArr) {
            if (T1.a.d(this)) {
                return null;
            }
            try {
                Intrinsics.checkNotNullParameter(proxy, "proxy");
                Intrinsics.checkNotNullParameter(m7, "m");
                return null;
            } catch (Throwable th) {
                T1.a.b(th, this);
                return null;
            }
        }
    }

    public final class e implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        public Runnable f1575a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f1576b;

        public e(h this$0, Runnable runnable) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.f1576b = this$0;
            this.f1575a = runnable;
        }

        public final void a(List skuDetailsObjectList) {
            if (T1.a.d(this)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(skuDetailsObjectList, "skuDetailsObjectList");
                for (Object obj : skuDetailsObjectList) {
                    try {
                        m mVar = m.f1598a;
                        Object e7 = m.e(h.j(this.f1576b), h.d(this.f1576b), obj, new Object[0]);
                        String str = e7 instanceof String ? (String) e7 : null;
                        if (str != null) {
                            JSONObject jSONObject = new JSONObject(str);
                            if (jSONObject.has("productId")) {
                                String skuID = jSONObject.getString("productId");
                                Map e8 = h.f1549s.e();
                                Intrinsics.checkNotNullExpressionValue(skuID, "skuID");
                                e8.put(skuID, jSONObject);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                this.f1575a.run();
            } catch (Throwable th) {
                T1.a.b(th, this);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method m7, Object[] objArr) {
            if (T1.a.d(this)) {
                return null;
            }
            try {
                Intrinsics.checkNotNullParameter(proxy, "proxy");
                Intrinsics.checkNotNullParameter(m7, "m");
                if (Intrinsics.a(m7.getName(), "onSkuDetailsResponse")) {
                    Object obj = objArr == null ? null : objArr[1];
                    if (obj != null && (obj instanceof List)) {
                        a((List) obj);
                    }
                }
                return null;
            } catch (Throwable th) {
                T1.a.b(th, this);
                return null;
            }
        }
    }

    public h(Context context, Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, l lVar) {
        this.f1555a = context;
        this.f1556b = obj;
        this.f1557c = cls;
        this.f1558d = cls2;
        this.f1559e = cls3;
        this.f1560f = cls4;
        this.f1561g = cls5;
        this.f1562h = cls6;
        this.f1563i = cls7;
        this.f1564j = method;
        this.f1565k = method2;
        this.f1566l = method3;
        this.f1567m = method4;
        this.f1568n = method5;
        this.f1569o = method6;
        this.f1570p = method7;
        this.f1571q = lVar;
        this.f1572r = new CopyOnWriteArraySet();
    }

    public static final /* synthetic */ Context b(h hVar) {
        if (T1.a.d(h.class)) {
            return null;
        }
        try {
            return hVar.f1555a;
        } catch (Throwable th) {
            T1.a.b(th, h.class);
            return null;
        }
    }

    public static final /* synthetic */ Method c(h hVar) {
        if (T1.a.d(h.class)) {
            return null;
        }
        try {
            return hVar.f1568n;
        } catch (Throwable th) {
            T1.a.b(th, h.class);
            return null;
        }
    }

    public static final /* synthetic */ Method d(h hVar) {
        if (T1.a.d(h.class)) {
            return null;
        }
        try {
            return hVar.f1567m;
        } catch (Throwable th) {
            T1.a.b(th, h.class);
            return null;
        }
    }

    public static final /* synthetic */ Set e(h hVar) {
        if (T1.a.d(h.class)) {
            return null;
        }
        try {
            return hVar.f1572r;
        } catch (Throwable th) {
            T1.a.b(th, h.class);
            return null;
        }
    }

    public static final /* synthetic */ AtomicBoolean f() {
        if (T1.a.d(h.class)) {
            return null;
        }
        try {
            return f1550t;
        } catch (Throwable th) {
            T1.a.b(th, h.class);
            return null;
        }
    }

    public static final /* synthetic */ h g() {
        if (T1.a.d(h.class)) {
            return null;
        }
        try {
            return f1551u;
        } catch (Throwable th) {
            T1.a.b(th, h.class);
            return null;
        }
    }

    public static final /* synthetic */ Map h() {
        if (T1.a.d(h.class)) {
            return null;
        }
        try {
            return f1553w;
        } catch (Throwable th) {
            T1.a.b(th, h.class);
            return null;
        }
    }

    public static final /* synthetic */ Class i(h hVar) {
        if (T1.a.d(h.class)) {
            return null;
        }
        try {
            return hVar.f1561g;
        } catch (Throwable th) {
            T1.a.b(th, h.class);
            return null;
        }
    }

    public static final /* synthetic */ Class j(h hVar) {
        if (T1.a.d(h.class)) {
            return null;
        }
        try {
            return hVar.f1560f;
        } catch (Throwable th) {
            T1.a.b(th, h.class);
            return null;
        }
    }

    public static final /* synthetic */ Map k() {
        if (T1.a.d(h.class)) {
            return null;
        }
        try {
            return f1554x;
        } catch (Throwable th) {
            T1.a.b(th, h.class);
            return null;
        }
    }

    public static final /* synthetic */ AtomicBoolean l() {
        if (T1.a.d(h.class)) {
            return null;
        }
        try {
            return f1552v;
        } catch (Throwable th) {
            T1.a.b(th, h.class);
            return null;
        }
    }

    public static final /* synthetic */ void m(h hVar) {
        if (T1.a.d(h.class)) {
            return;
        }
        try {
            f1551u = hVar;
        } catch (Throwable th) {
            T1.a.b(th, h.class);
        }
    }

    public static final /* synthetic */ void n(h hVar) {
        if (T1.a.d(h.class)) {
            return;
        }
        try {
            hVar.t();
        } catch (Throwable th) {
            T1.a.b(th, h.class);
        }
    }

    public static final void q(h this$0, Runnable queryPurchaseHistoryRunnable) {
        if (T1.a.d(h.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(queryPurchaseHistoryRunnable, "$queryPurchaseHistoryRunnable");
            this$0.s("inapp", new ArrayList(this$0.f1572r), queryPurchaseHistoryRunnable);
        } catch (Throwable th) {
            T1.a.b(th, h.class);
        }
    }

    public final void o(String skuType, Runnable querySkuRunnable) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(skuType, "skuType");
            Intrinsics.checkNotNullParameter(querySkuRunnable, "querySkuRunnable");
            m mVar = m.f1598a;
            Object e7 = m.e(this.f1558d, this.f1565k, m.e(this.f1557c, this.f1564j, this.f1556b, "inapp"), new Object[0]);
            List list = e7 instanceof List ? (List) e7 : null;
            if (list == null) {
                return;
            }
            try {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    m mVar2 = m.f1598a;
                    Object e8 = m.e(this.f1559e, this.f1566l, obj, new Object[0]);
                    String str = e8 instanceof String ? (String) e8 : null;
                    if (str != null) {
                        JSONObject jSONObject = new JSONObject(str);
                        if (jSONObject.has("productId")) {
                            String skuID = jSONObject.getString("productId");
                            arrayList.add(skuID);
                            Map map = f1553w;
                            Intrinsics.checkNotNullExpressionValue(skuID, "skuID");
                            map.put(skuID, jSONObject);
                        }
                    }
                }
                s(skuType, arrayList, querySkuRunnable);
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public final void p(String skuType, final Runnable queryPurchaseHistoryRunnable) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(skuType, "skuType");
            Intrinsics.checkNotNullParameter(queryPurchaseHistoryRunnable, "queryPurchaseHistoryRunnable");
            r(skuType, new Runnable() { // from class: E1.g
                @Override // java.lang.Runnable
                public final void run() {
                    h.q(h.this, queryPurchaseHistoryRunnable);
                }
            });
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public final void r(String str, Runnable runnable) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            Object newProxyInstance = Proxy.newProxyInstance(this.f1563i.getClassLoader(), new Class[]{this.f1563i}, new c(this, runnable));
            m mVar = m.f1598a;
            m.e(this.f1557c, this.f1570p, this.f1556b, str, newProxyInstance);
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public final void s(String str, List list, Runnable runnable) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            Object newProxyInstance = Proxy.newProxyInstance(this.f1562h.getClassLoader(), new Class[]{this.f1562h}, new e(this, runnable));
            Object d7 = this.f1571q.d(str, list);
            m mVar = m.f1598a;
            m.e(this.f1557c, this.f1569o, this.f1556b, d7, newProxyInstance);
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public final void t() {
        Method d7;
        if (T1.a.d(this)) {
            return;
        }
        try {
            Class a7 = m.a("com.android.billingclient.api.BillingClientStateListener");
            if (a7 == null || (d7 = m.d(this.f1557c, "startConnection", a7)) == null) {
                return;
            }
            m.e(this.f1557c, d7, this.f1556b, Proxy.newProxyInstance(a7.getClassLoader(), new Class[]{a7}, new a()));
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public /* synthetic */ h(Context context, Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, l lVar, kotlin.jvm.internal.g gVar) {
        this(context, obj, cls, cls2, cls3, cls4, cls5, cls6, cls7, method, method2, method3, method4, method5, method6, method7, lVar);
    }
}
