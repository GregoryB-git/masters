/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.Exception
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.InvocationHandler
 *  java.lang.reflect.Method
 *  java.lang.reflect.Proxy
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.CopyOnWriteArraySet
 *  java.util.concurrent.atomic.AtomicBoolean
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package E1;

import E1.g;
import E1.l;
import E1.m;
import android.content.Context;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.i;
import org.json.JSONException;
import org.json.JSONObject;

public final class h {
    public static final b s = new b(null);
    public static final AtomicBoolean t = new AtomicBoolean(false);
    public static h u;
    public static final AtomicBoolean v;
    public static final Map w;
    public static final Map x;
    public final Context a;
    public final Object b;
    public final Class c;
    public final Class d;
    public final Class e;
    public final Class f;
    public final Class g;
    public final Class h;
    public final Class i;
    public final Method j;
    public final Method k;
    public final Method l;
    public final Method m;
    public final Method n;
    public final Method o;
    public final Method p;
    public final l q;
    public final Set r;

    static {
        v = new AtomicBoolean(false);
        w = new ConcurrentHashMap();
        x = new ConcurrentHashMap();
    }

    public h(Context context, Object object, Class class_, Class class_2, Class class_3, Class class_4, Class class_5, Class class_6, Class class_7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, l l8) {
        this.a = context;
        this.b = object;
        this.c = class_;
        this.d = class_2;
        this.e = class_3;
        this.f = class_4;
        this.g = class_5;
        this.h = class_6;
        this.i = class_7;
        this.j = method;
        this.k = method2;
        this.l = method3;
        this.m = method4;
        this.n = method5;
        this.o = method6;
        this.p = method7;
        this.q = l8;
        this.r = new CopyOnWriteArraySet();
    }

    public /* synthetic */ h(Context context, Object object, Class class_, Class class_2, Class class_3, Class class_4, Class class_5, Class class_6, Class class_7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, l l8, kotlin.jvm.internal.g g8) {
        this(context, object, class_, class_2, class_3, class_4, class_5, class_6, class_7, method, method2, method3, method4, method5, method6, method7, l8);
    }

    public static /* synthetic */ void a(h h8, Runnable runnable) {
        h.q(h8, runnable);
    }

    public static final /* synthetic */ Context b(h h8) {
        if (T1.a.d(h.class)) {
            return null;
        }
        try {
            h8 = h8.a;
            return h8;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, h.class);
            return null;
        }
    }

    public static final /* synthetic */ Method c(h h8) {
        if (T1.a.d(h.class)) {
            return null;
        }
        try {
            h8 = h8.n;
            return h8;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, h.class);
            return null;
        }
    }

    public static final /* synthetic */ Method d(h h8) {
        if (T1.a.d(h.class)) {
            return null;
        }
        try {
            h8 = h8.m;
            return h8;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, h.class);
            return null;
        }
    }

    public static final /* synthetic */ Set e(h h8) {
        if (T1.a.d(h.class)) {
            return null;
        }
        try {
            h8 = h8.r;
            return h8;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, h.class);
            return null;
        }
    }

    public static final /* synthetic */ AtomicBoolean f() {
        if (T1.a.d(h.class)) {
            return null;
        }
        try {
            AtomicBoolean atomicBoolean = t;
            return atomicBoolean;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, h.class);
            return null;
        }
    }

    public static final /* synthetic */ h g() {
        if (T1.a.d(h.class)) {
            return null;
        }
        try {
            h h8 = u;
            return h8;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, h.class);
            return null;
        }
    }

    public static final /* synthetic */ Map h() {
        if (T1.a.d(h.class)) {
            return null;
        }
        try {
            Map map = w;
            return map;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, h.class);
            return null;
        }
    }

    public static final /* synthetic */ Class i(h h8) {
        if (T1.a.d(h.class)) {
            return null;
        }
        try {
            h8 = h8.g;
            return h8;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, h.class);
            return null;
        }
    }

    public static final /* synthetic */ Class j(h h8) {
        if (T1.a.d(h.class)) {
            return null;
        }
        try {
            h8 = h8.f;
            return h8;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, h.class);
            return null;
        }
    }

    public static final /* synthetic */ Map k() {
        if (T1.a.d(h.class)) {
            return null;
        }
        try {
            Map map = x;
            return map;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, h.class);
            return null;
        }
    }

    public static final /* synthetic */ AtomicBoolean l() {
        if (T1.a.d(h.class)) {
            return null;
        }
        try {
            AtomicBoolean atomicBoolean = v;
            return atomicBoolean;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, h.class);
            return null;
        }
    }

    public static final /* synthetic */ void m(h h8) {
        if (T1.a.d(h.class)) {
            return;
        }
        try {
            u = h8;
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, h.class);
            return;
        }
    }

    public static final /* synthetic */ void n(h h8) {
        if (T1.a.d(h.class)) {
            return;
        }
        try {
            h8.t();
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, h.class);
            return;
        }
    }

    public static final void q(h h8, Runnable runnable) {
        if (T1.a.d(h.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(h8, "this$0");
            Intrinsics.checkNotNullParameter((Object)runnable, "$queryPurchaseHistoryRunnable");
            h8.s("inapp", (List)new ArrayList((Collection)h8.r), runnable);
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, h.class);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void o(String string2, Runnable runnable) {
        ArrayList arrayList;
        Iterator iterator;
        Object object;
        Throwable throwable2;
        block9 : {
            block8 : {
                if (T1.a.d(this)) {
                    return;
                }
                try {
                    Intrinsics.checkNotNullParameter(string2, "skuType");
                    Intrinsics.checkNotNullParameter((Object)runnable, "querySkuRunnable");
                    object = m.a;
                    object = m.e(this.c, this.j, this.b, "inapp");
                    object = m.e(this.d, this.k, object, new Object[0]);
                    if (!(object instanceof List)) {
                        return;
                    }
                    if ((object = (List)object) != null) break block8;
                    return;
                }
                catch (Throwable throwable2) {
                    break block9;
                }
            }
            try {
                arrayList = new ArrayList();
                iterator = object.iterator();
            }
            catch (JSONException jSONException) {
                return;
            }
        }
        T1.a.b(throwable2, this);
        return;
        do {
            if (!iterator.hasNext()) {
                this.s(string2, (List)arrayList, runnable);
                return;
            }
            object = iterator.next();
            Object object2 = m.a;
            object = (object = m.e(this.e, this.l, object, new Object[0])) instanceof String ? (String)object : null;
            if (object == null || !(object = new JSONObject((String)object)).has("productId")) continue;
            object2 = object.getString("productId");
            arrayList.add(object2);
            Map map = w;
            Intrinsics.checkNotNullExpressionValue(object2, "skuID");
            map.put(object2, object);
        } while (true);
    }

    public final void p(String string2, Runnable runnable) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(string2, "skuType");
            Intrinsics.checkNotNullParameter((Object)runnable, "queryPurchaseHistoryRunnable");
            this.r(string2, new g(this, runnable));
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, this);
            return;
        }
    }

    public final void r(String string2, Runnable object) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            Object object2 = this.i.getClassLoader();
            Class class_ = this.i;
            object = new c((Runnable)object);
            object = Proxy.newProxyInstance((ClassLoader)object2, (Class[])new Class[]{class_}, (InvocationHandler)object);
            object2 = m.a;
            m.e(this.c, this.p, this.b, string2, object);
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, this);
            return;
        }
    }

    public final void s(String object, List object2, Runnable object3) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            ClassLoader classLoader = this.h.getClassLoader();
            Class class_ = this.h;
            object3 = new e((Runnable)object3);
            object3 = Proxy.newProxyInstance((ClassLoader)classLoader, (Class[])new Class[]{class_}, (InvocationHandler)object3);
            object = this.q.d((String)object, (List)object2);
            object2 = m.a;
            m.e(this.c, this.o, this.b, object, object3);
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, this);
            return;
        }
    }

    public final void t() {
        Object object;
        Method method;
        block6 : {
            block5 : {
                if (T1.a.d(this)) {
                    return;
                }
                try {
                    object = m.a("com.android.billingclient.api.BillingClientStateListener");
                    if (object != null) break block5;
                    return;
                }
                catch (Throwable throwable) {
                    T1.a.b(throwable, this);
                    return;
                }
            }
            method = m.d(this.c, "startConnection", new Class[]{object});
            if (method != null) break block6;
            return;
        }
        ClassLoader classLoader = object.getClassLoader();
        a a8 = new a();
        object = Proxy.newProxyInstance((ClassLoader)classLoader, (Class[])new Class[]{object}, (InvocationHandler)a8);
        m.e(this.c, method, this.b, object);
    }

    public static final class a
    implements InvocationHandler {
        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public Object invoke(Object object, Method method, Object[] arrobject) {
            if (T1.a.d(this)) {
                return null;
            }
            try {
                Intrinsics.checkNotNullParameter(object, "proxy");
                Intrinsics.checkNotNullParameter((Object)method, "m");
                if (Intrinsics.a(method.getName(), "onBillingSetupFinished")) {
                    h.s.f().set(true);
                    return null;
                }
                object = method.getName();
                Intrinsics.checkNotNullExpressionValue(object, "m.name");
                if (i.k((String)object, "onBillingServiceDisconnected", false, 2, null)) {
                    h.s.f().set(false);
                }
                return null;
            }
            catch (Throwable throwable) {}
            T1.a.b(throwable, this);
            return null;
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g g8) {
            this();
        }

        public final Object a(Context object, Class class_) {
            Class class_2 = m.a("com.android.billingclient.api.BillingClient$Builder");
            Class class_3 = m.a("com.android.billingclient.api.PurchasesUpdatedListener");
            d d8 = null;
            Object object2 = d8;
            if (class_2 != null) {
                if (class_3 == null) {
                    return null;
                }
                Method method = m.d(class_, "newBuilder", Context.class);
                Method method2 = m.d(class_2, "enablePendingPurchases", new Class[0]);
                Method method3 = m.d(class_2, "setListener", class_3);
                Method method4 = m.d(class_2, "build", new Class[0]);
                object2 = d8;
                if (method != null) {
                    object2 = d8;
                    if (method2 != null) {
                        object2 = d8;
                        if (method3 != null) {
                            if (method4 == null) {
                                return null;
                            }
                            Object[] arrobject = new Object[]{object};
                            object = m.e(class_, method, null, arrobject);
                            if (object == null) {
                                return null;
                            }
                            class_ = class_3.getClassLoader();
                            if ((object = m.e(class_2, method3, object, Proxy.newProxyInstance((ClassLoader)class_, (Class[])new Class[]{class_3}, (InvocationHandler)(object2 = new d())))) == null) {
                                return null;
                            }
                            if ((object = m.e(class_2, method2, object, new Object[0])) == null) {
                                return null;
                            }
                            object2 = m.e(class_2, method4, object, new Object[0]);
                        }
                    }
                }
            }
            return object2;
        }

        public final void b(Context object) {
            l l8 = l.g.b();
            if (l8 == null) {
                return;
            }
            Class class_ = m.a("com.android.billingclient.api.BillingClient");
            Class class_2 = m.a("com.android.billingclient.api.Purchase");
            Class class_3 = m.a("com.android.billingclient.api.Purchase$PurchasesResult");
            Class class_4 = m.a("com.android.billingclient.api.SkuDetails");
            Class class_5 = m.a("com.android.billingclient.api.PurchaseHistoryRecord");
            Class class_6 = m.a("com.android.billingclient.api.SkuDetailsResponseListener");
            Class class_7 = m.a("com.android.billingclient.api.PurchaseHistoryResponseListener");
            if (class_ == null || class_3 == null || class_2 == null || class_4 == null || class_6 == null || class_5 == null || class_7 == null) {
                return;
            }
            Method method = m.d(class_, "queryPurchases", String.class);
            Method method2 = m.d(class_3, "getPurchasesList", new Class[0]);
            Method method3 = m.d(class_2, "getOriginalJson", new Class[0]);
            Method method4 = m.d(class_4, "getOriginalJson", new Class[0]);
            Method method5 = m.d(class_5, "getOriginalJson", new Class[0]);
            Method method6 = m.d(class_, "querySkuDetailsAsync", l8.e(), class_6);
            Method method7 = m.d(class_, "queryPurchaseHistoryAsync", String.class, class_7);
            if (method == null || method2 == null || method3 == null || method4 == null || method5 == null || method6 == null || method7 == null) {
                return;
            }
            Object object2 = this.a((Context)object, class_);
            if (object2 == null) {
                return;
            }
            h.m(new h((Context)object, object2, class_, class_3, class_2, class_4, class_5, class_6, class_7, method, method2, method3, method4, method5, method6, method7, l8, null));
            object = h.g();
            if (object != null) {
                h.n((h)object);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper");
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final h c(Context object) {
            synchronized (this) {
                Throwable throwable2;
                block4 : {
                    try {
                        Intrinsics.checkNotNullParameter(object, "context");
                        if (h.f().get()) {
                            return h.g();
                        }
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                    this.b((Context)object);
                    h.f().set(true);
                    return h.g();
                }
                throw throwable2;
            }
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

    public final class c
    implements InvocationHandler {
        public Runnable a;

        public c(Runnable runnable) {
            Intrinsics.checkNotNullParameter(h.this, "this$0");
            Intrinsics.checkNotNullParameter((Object)runnable, "runnable");
            this.a = runnable;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final void a(List object) {
            Iterator iterator;
            block7 : {
                if (T1.a.d(this)) {
                    return;
                }
                try {
                    iterator = object.iterator();
                    break block7;
                }
                catch (Throwable throwable) {}
                T1.a.b(throwable, this);
                return;
            }
            do {
                Object object2;
                if (!iterator.hasNext()) {
                    this.a.run();
                    return;
                }
                object = iterator.next();
                try {
                    object2 = m.a;
                    object = m.e(h.i(h.this), h.c(h.this), object, new Object[0]);
                    object = object instanceof String ? (String)object : null;
                }
                catch (Exception exception) {
                }
                if (object == null) continue;
                object = new JSONObject((String)object);
                object.put("packageName", (Object)h.b(h.this).getPackageName());
                if (!object.has("productId")) continue;
                object2 = object.getString("productId");
                h.e(h.this).add(object2);
                Map map = h.s.d();
                Intrinsics.checkNotNullExpressionValue(object2, "skuID");
                map.put(object2, object);
            } while (true);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public Object invoke(Object object, Method method, Object[] arrobject) {
            block5 : {
                block6 : {
                    if (T1.a.d(this)) {
                        return null;
                    }
                    try {
                        Intrinsics.checkNotNullParameter(object, "proxy");
                        Intrinsics.checkNotNullParameter((Object)method, "method");
                        if (!Intrinsics.a(method.getName(), "onPurchaseHistoryResponse")) break block5;
                        if (arrobject == null) {
                            return null;
                        }
                        break block6;
                    }
                    catch (Throwable throwable) {}
                    T1.a.b(throwable, this);
                    return null;
                }
                object = arrobject[1];
                if (object != null && object instanceof List) {
                    this.a((List)object);
                    return null;
                }
            }
            return null;
        }
    }

    public static final class d
    implements InvocationHandler {
        public Object invoke(Object object, Method method, Object[] arrobject) {
            if (T1.a.d(this)) {
                return null;
            }
            try {
                Intrinsics.checkNotNullParameter(object, "proxy");
                Intrinsics.checkNotNullParameter((Object)method, "m");
                return null;
            }
            catch (Throwable throwable) {
                T1.a.b(throwable, this);
                return null;
            }
        }
    }

    public final class e
    implements InvocationHandler {
        public Runnable a;

        public e(Runnable runnable) {
            Intrinsics.checkNotNullParameter(h.this, "this$0");
            Intrinsics.checkNotNullParameter((Object)runnable, "runnable");
            this.a = runnable;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final void a(List object) {
            Iterator iterator;
            block7 : {
                if (T1.a.d(this)) {
                    return;
                }
                try {
                    Intrinsics.checkNotNullParameter(object, "skuDetailsObjectList");
                    iterator = object.iterator();
                    break block7;
                }
                catch (Throwable throwable) {}
                T1.a.b(throwable, this);
                return;
            }
            do {
                Object object2;
                if (!iterator.hasNext()) {
                    this.a.run();
                    return;
                }
                object = iterator.next();
                try {
                    object2 = m.a;
                    object = m.e(h.j(h.this), h.d(h.this), object, new Object[0]);
                    object = object instanceof String ? (String)object : null;
                }
                catch (Exception exception) {
                }
                if (object == null || !(object = new JSONObject((String)object)).has("productId")) continue;
                object2 = object.getString("productId");
                Map map = h.s.e();
                Intrinsics.checkNotNullExpressionValue(object2, "skuID");
                map.put(object2, object);
            } while (true);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public Object invoke(Object object, Method method, Object[] arrobject) {
            block5 : {
                block6 : {
                    if (T1.a.d(this)) {
                        return null;
                    }
                    try {
                        Intrinsics.checkNotNullParameter(object, "proxy");
                        Intrinsics.checkNotNullParameter((Object)method, "m");
                        if (!Intrinsics.a(method.getName(), "onSkuDetailsResponse")) break block5;
                        if (arrobject == null) {
                            return null;
                        }
                        break block6;
                    }
                    catch (Throwable throwable) {}
                    T1.a.b(throwable, this);
                    return null;
                }
                object = arrobject[1];
                if (object != null && object instanceof List) {
                    this.a((List)object);
                    return null;
                }
            }
            return null;
        }
    }

}

