// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package E1;

import kotlin.text.i;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import T1.a;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.g;
import java.util.Set;
import java.lang.reflect.Method;
import android.content.Context;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public final class h
{
    public static final b s;
    public static final AtomicBoolean t;
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
        s = new b(null);
        t = new AtomicBoolean(false);
        v = new AtomicBoolean(false);
        w = new ConcurrentHashMap();
        x = new ConcurrentHashMap();
    }
    
    public h(final Context a, final Object b, final Class c, final Class d, final Class e, final Class f, final Class g, final Class h, final Class i, final Method j, final Method k, final Method l, final Method m, final Method n, final Method o, final Method p17, final l q) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p17;
        this.q = q;
        this.r = new CopyOnWriteArraySet();
    }
    
    public static final /* synthetic */ Context b(final h h) {
        if (T1.a.d(h.class)) {
            return null;
        }
        try {
            return h.a;
        }
        finally {
            final Throwable t;
            T1.a.b(t, h.class);
            return null;
        }
    }
    
    public static final /* synthetic */ Method c(final h h) {
        if (T1.a.d(h.class)) {
            return null;
        }
        try {
            return h.n;
        }
        finally {
            final Throwable t;
            T1.a.b(t, h.class);
            return null;
        }
    }
    
    public static final /* synthetic */ Method d(final h h) {
        if (T1.a.d(h.class)) {
            return null;
        }
        try {
            return h.m;
        }
        finally {
            final Throwable t;
            T1.a.b(t, h.class);
            return null;
        }
    }
    
    public static final /* synthetic */ Set e(final h h) {
        if (T1.a.d(h.class)) {
            return null;
        }
        try {
            return h.r;
        }
        finally {
            final Throwable t;
            T1.a.b(t, h.class);
            return null;
        }
    }
    
    public static final /* synthetic */ AtomicBoolean f() {
        if (T1.a.d(h.class)) {
            return null;
        }
        try {
            return h.t;
        }
        finally {
            final Throwable t;
            T1.a.b(t, h.class);
            return null;
        }
    }
    
    public static final /* synthetic */ h g() {
        if (T1.a.d(h.class)) {
            return null;
        }
        try {
            return h.u;
        }
        finally {
            final Throwable t;
            T1.a.b(t, h.class);
            return null;
        }
    }
    
    public static final /* synthetic */ Map h() {
        if (T1.a.d(h.class)) {
            return null;
        }
        try {
            return h.w;
        }
        finally {
            final Throwable t;
            T1.a.b(t, h.class);
            return null;
        }
    }
    
    public static final /* synthetic */ Class i(final h h) {
        if (T1.a.d(h.class)) {
            return null;
        }
        try {
            return h.g;
        }
        finally {
            final Throwable t;
            T1.a.b(t, h.class);
            return null;
        }
    }
    
    public static final /* synthetic */ Class j(final h h) {
        if (T1.a.d(h.class)) {
            return null;
        }
        try {
            return h.f;
        }
        finally {
            final Throwable t;
            T1.a.b(t, h.class);
            return null;
        }
    }
    
    public static final /* synthetic */ Map k() {
        if (T1.a.d(h.class)) {
            return null;
        }
        try {
            return h.x;
        }
        finally {
            final Throwable t;
            T1.a.b(t, h.class);
            return null;
        }
    }
    
    public static final /* synthetic */ AtomicBoolean l() {
        if (T1.a.d(h.class)) {
            return null;
        }
        try {
            return h.v;
        }
        finally {
            final Throwable t;
            T1.a.b(t, h.class);
            return null;
        }
    }
    
    public static final /* synthetic */ void m(final h u) {
        if (T1.a.d(h.class)) {
            return;
        }
        try {
            h.u = u;
        }
        finally {
            final Throwable t;
            T1.a.b(t, h.class);
        }
    }
    
    public static final /* synthetic */ void n(final h h) {
        if (T1.a.d(h.class)) {
            return;
        }
        try {
            h.t();
        }
        finally {
            final Throwable t;
            T1.a.b(t, h.class);
        }
    }
    
    public static final void q(final h h, final Runnable runnable) {
        if (T1.a.d(h.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(h, "this$0");
            Intrinsics.checkNotNullParameter(runnable, "$queryPurchaseHistoryRunnable");
            h.s("inapp", new ArrayList(h.r), runnable);
        }
        finally {
            final Throwable t;
            T1.a.b(t, h.class);
        }
    }
    
    public final void o(final String s, final Runnable runnable) {
        if (T1.a.d(this)) {
            return;
        }
        while (true) {
            Object o = null;
            Label_0087: {
                Label_0235: {
                    try {
                        Intrinsics.checkNotNullParameter(s, "skuType");
                        Intrinsics.checkNotNullParameter(runnable, "querySkuRunnable");
                        o = E1.m.a;
                        o = E1.m.e(this.c, this.j, this.b, "inapp");
                        o = E1.m.e(this.d, this.k, o, new Object[0]);
                        if (o instanceof List) {
                            o = o;
                            break Label_0087;
                        }
                    }
                    finally {
                        break Label_0235;
                    }
                    break Label_0235;
                Label_0164_Outer:
                    while (true) {
                        while (true) {
                            while (true) {
                                String s3 = null;
                                Label_0245: {
                                    Label_0243: {
                                        try {
                                            final ArrayList<String> list = new ArrayList<String>();
                                            final Iterator<?> iterator = ((List<?>)o).iterator();
                                            if (!iterator.hasNext()) {
                                                final String s2;
                                                this.s(s2, list, runnable);
                                                return;
                                            }
                                            final Object next = iterator.next();
                                            final m a = E1.m.a;
                                            final Object e = E1.m.e(this.e, this.l, next, new Object[0]);
                                            if (e instanceof String) {
                                                s3 = (String)e;
                                                break Label_0245;
                                            }
                                            break Label_0243;
                                            final JSONObject jsonObject = new JSONObject(s3);
                                            // iftrue(Label_0109:, !jsonObject.has("productId"))
                                            final String string = jsonObject.getString("productId");
                                            list.add(string);
                                            final Map w = E1.h.w;
                                            Intrinsics.checkNotNullExpressionValue(string, "skuID");
                                            w.put(string, jsonObject);
                                            continue Label_0164_Outer;
                                            final String s2;
                                            T1.a.b((Throwable)s2, this);
                                            return;
                                        }
                                        catch (JSONException ex) {
                                            return;
                                        }
                                    }
                                    s3 = null;
                                }
                                if (s3 == null) {
                                    continue Label_0164_Outer;
                                }
                                break;
                            }
                            continue;
                        }
                    }
                }
                o = null;
            }
            if (o == null) {
                return;
            }
            continue;
        }
    }
    
    public final void p(final String s, final Runnable runnable) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(s, "skuType");
            Intrinsics.checkNotNullParameter(runnable, "queryPurchaseHistoryRunnable");
            this.r(s, new E1.g(this, runnable));
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
        }
    }
    
    public final void r(final String s, final Runnable runnable) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            final Object proxyInstance = Proxy.newProxyInstance(this.i.getClassLoader(), new Class[] { this.i }, new c(runnable));
            final m a = E1.m.a;
            E1.m.e(this.c, this.p, this.b, s, proxyInstance);
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
        }
    }
    
    public final void s(final String s, final List list, final Runnable runnable) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            final Object proxyInstance = Proxy.newProxyInstance(this.h.getClassLoader(), new Class[] { this.h }, new e(runnable));
            final Object d = this.q.d(s, list);
            final m a = E1.m.a;
            E1.m.e(this.c, this.o, this.b, d, proxyInstance);
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
        }
    }
    
    public final void t() {
        if (T1.a.d(this)) {
            return;
        }
        try {
            final Class a = E1.m.a("com.android.billingclient.api.BillingClientStateListener");
            if (a == null) {
                return;
            }
            final Method d = E1.m.d(this.c, "startConnection", a);
            if (d == null) {
                return;
            }
            E1.m.e(this.c, d, this.b, Proxy.newProxyInstance(a.getClassLoader(), new Class[] { a }, new a()));
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
        }
    }
    
    public static final class a implements InvocationHandler
    {
        @Override
        public Object invoke(final Object o, final Method method, final Object[] array) {
            if (T1.a.d(this)) {
                return null;
            }
            while (true) {
                try {
                    Intrinsics.checkNotNullParameter(o, "proxy");
                    Intrinsics.checkNotNullParameter(method, "m");
                    if (Intrinsics.a(method.getName(), "onBillingSetupFinished")) {
                        E1.h.s.f().set(true);
                        return null;
                    }
                    final String name = method.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "m.name");
                    if (kotlin.text.i.k(name, "onBillingServiceDisconnected", false, 2, null)) {
                        E1.h.s.f().set(false);
                    }
                    return null;
                    final Throwable t;
                    T1.a.b(t, this);
                    return null;
                }
                finally {
                    continue;
                }
                break;
            }
        }
    }
    
    public static final class b
    {
        public final Object a(final Context context, final Class clazz) {
            final Class a = E1.m.a("com.android.billingclient.api.BillingClient$Builder");
            final Class a2 = E1.m.a("com.android.billingclient.api.PurchasesUpdatedListener");
            Object e;
            final Object o = e = null;
            if (a != null) {
                if (a2 == null) {
                    return null;
                }
                final Method d = E1.m.d(clazz, "newBuilder", Context.class);
                final Method d2 = E1.m.d(a, "enablePendingPurchases", new Class[0]);
                final Method d3 = E1.m.d(a, "setListener", a2);
                final Method d4 = E1.m.d(a, "build", new Class[0]);
                e = o;
                if (d != null) {
                    e = o;
                    if (d2 != null) {
                        e = o;
                        if (d3 != null) {
                            if (d4 == null) {
                                return null;
                            }
                            final Object e2 = E1.m.e(clazz, d, null, context);
                            if (e2 == null) {
                                return null;
                            }
                            final Object e3 = E1.m.e(a, d3, e2, Proxy.newProxyInstance(a2.getClassLoader(), new Class[] { a2 }, new d()));
                            if (e3 == null) {
                                return null;
                            }
                            final Object e4 = E1.m.e(a, d2, e3, new Object[0]);
                            if (e4 == null) {
                                return null;
                            }
                            e = E1.m.e(a, d4, e4, new Object[0]);
                        }
                    }
                }
            }
            return e;
        }
        
        public final void b(final Context context) {
            final l b = E1.l.g.b();
            if (b == null) {
                return;
            }
            final Class a = E1.m.a("com.android.billingclient.api.BillingClient");
            final Class a2 = E1.m.a("com.android.billingclient.api.Purchase");
            final Class a3 = E1.m.a("com.android.billingclient.api.Purchase$PurchasesResult");
            final Class a4 = E1.m.a("com.android.billingclient.api.SkuDetails");
            final Class a5 = E1.m.a("com.android.billingclient.api.PurchaseHistoryRecord");
            final Class a6 = E1.m.a("com.android.billingclient.api.SkuDetailsResponseListener");
            final Class a7 = E1.m.a("com.android.billingclient.api.PurchaseHistoryResponseListener");
            if (a == null || a3 == null || a2 == null || a4 == null || a6 == null || a5 == null || a7 == null) {
                return;
            }
            final Method d = E1.m.d(a, "queryPurchases", String.class);
            final Method d2 = E1.m.d(a3, "getPurchasesList", new Class[0]);
            final Method d3 = E1.m.d(a2, "getOriginalJson", new Class[0]);
            final Method d4 = E1.m.d(a4, "getOriginalJson", new Class[0]);
            final Method d5 = E1.m.d(a5, "getOriginalJson", new Class[0]);
            final Method d6 = E1.m.d(a, "querySkuDetailsAsync", b.e(), a6);
            final Method d7 = E1.m.d(a, "queryPurchaseHistoryAsync", String.class, a7);
            if (d == null || d2 == null || d3 == null || d4 == null || d5 == null || d6 == null || d7 == null) {
                return;
            }
            final Object a8 = this.a(context, a);
            if (a8 == null) {
                return;
            }
            E1.h.m(new h(context, a8, a, a3, a2, a4, a5, a6, a7, d, d2, d3, d4, d5, d6, d7, b, null));
            final h g = E1.h.g();
            if (g != null) {
                E1.h.n(g);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper");
        }
        
        public final h c(final Context context) {
            // monitorenter(this)
            // monitorexit(this)
            Label_0049: {
                try {
                    Intrinsics.checkNotNullParameter(context, "context");
                    if (E1.h.f().get()) {
                        // monitorexit(this)
                        return E1.h.g();
                    }
                }
                finally {
                    break Label_0049;
                }
                final Context context2;
                this.b(context2);
                E1.h.f().set(true);
                return E1.h.g();
            }
        }
        // monitorexit(this)
        
        public final Map d() {
            return E1.h.h();
        }
        
        public final Map e() {
            return E1.h.k();
        }
        
        public final AtomicBoolean f() {
            return E1.h.l();
        }
    }
    
    public final class c implements InvocationHandler
    {
        public Runnable a;
        
        public c(final Runnable a) {
            Intrinsics.checkNotNullParameter(E1.h.this, "this$0");
            Intrinsics.checkNotNullParameter(a, "runnable");
            this.a = a;
        }
        
        public final void a(final List list) {
            if (T1.a.d(this)) {
                return;
            }
            Iterator<Object> iterator;
            Object next;
            m a;
            Object e;
            String s;
            JSONObject jsonObject;
            String string;
            Map d;
            Throwable t = null;
            final Throwable t2;
            Label_0015_Outer:Label_0073_Outer:
            while (true) {
                while (true) {
                    while (true) {
                        Label_0182: {
                            Label_0180: {
                                while (true) {
                                    try {
                                        iterator = list.iterator();
                                        while (true) {
                                            Label_0156: {
                                                if (!iterator.hasNext()) {
                                                    break Label_0156;
                                                }
                                                next = iterator.next();
                                                try {
                                                    a = E1.m.a;
                                                    e = E1.m.e(E1.h.i(E1.h.this), E1.h.c(E1.h.this), next, new Object[0]);
                                                    if (e instanceof String) {
                                                        s = (String)e;
                                                        break Label_0182;
                                                    }
                                                    break Label_0180;
                                                    // iftrue(Label_0015:, !jsonObject.has("productId"))
                                                    while (true) {
                                                        string = jsonObject.getString("productId");
                                                        E1.h.e(E1.h.this).add(string);
                                                        d = E1.h.s.d();
                                                        Intrinsics.checkNotNullExpressionValue(string, "skuID");
                                                        d.put(string, jsonObject);
                                                        continue Label_0015_Outer;
                                                        jsonObject = new JSONObject((String)t);
                                                        jsonObject.put("packageName", (Object)E1.h.b(E1.h.this).getPackageName());
                                                        continue Label_0073_Outer;
                                                    }
                                                    T1.a.b(t, this);
                                                    return;
                                                    this.a.run();
                                                    return;
                                                }
                                                catch (Exception ex) {}
                                            }
                                        }
                                    }
                                    finally {}
                                    t = t2;
                                    continue;
                                }
                            }
                            t = null;
                        }
                        if (t == null) {
                            continue Label_0073_Outer;
                        }
                        break;
                    }
                    continue;
                }
            }
        }
        
        @Override
        public Object invoke(Object o, final Method method, final Object[] array) {
            if (T1.a.d(this)) {
                return null;
            }
            while (true) {
            Label_0069:
                while (true) {
                    Label_0076: {
                        try {
                            Intrinsics.checkNotNullParameter(o, "proxy");
                            Intrinsics.checkNotNullParameter(method, "method");
                            if (Intrinsics.a(method.getName(), "onPurchaseHistoryResponse")) {
                                if (array != null) {
                                    break Label_0076;
                                }
                                o = null;
                                if (o != null && o instanceof List) {
                                    this.a((List)o);
                                    return null;
                                }
                            }
                        }
                        finally {
                            break Label_0069;
                        }
                        return null;
                    }
                    o = array[1];
                    continue;
                }
                final Throwable t;
                T1.a.b(t, this);
                return null;
            }
        }
    }
    
    public static final class d implements InvocationHandler
    {
        @Override
        public Object invoke(final Object o, final Method method, final Object[] array) {
            if (T1.a.d(this)) {
                return null;
            }
            try {
                Intrinsics.checkNotNullParameter(o, "proxy");
                Intrinsics.checkNotNullParameter(method, "m");
                return null;
            }
            finally {
                final Throwable t;
                T1.a.b(t, this);
                return null;
            }
        }
    }
    
    public final class e implements InvocationHandler
    {
        public Runnable a;
        
        public e(final Runnable a) {
            Intrinsics.checkNotNullParameter(E1.h.this, "this$0");
            Intrinsics.checkNotNullParameter(a, "runnable");
            this.a = a;
        }
        
        public final void a(final List list) {
            if (T1.a.d(this)) {
                return;
            }
            Iterator<Object> iterator;
            Object next;
            m a;
            Object e;
            String s;
            Throwable t = null;
            JSONObject jsonObject;
            String string;
            Map e2;
            final Throwable t2;
            Label_0021_Outer:Label_0079_Outer:
            while (true) {
                while (true) {
                    while (true) {
                        Label_0157: {
                            Label_0155: {
                                while (true) {
                                    try {
                                        Intrinsics.checkNotNullParameter(list, "skuDetailsObjectList");
                                        iterator = list.iterator();
                                        while (true) {
                                            Label_0131: {
                                                if (!iterator.hasNext()) {
                                                    break Label_0131;
                                                }
                                                next = iterator.next();
                                                try {
                                                    a = E1.m.a;
                                                    e = E1.m.e(E1.h.j(E1.h.this), E1.h.d(E1.h.this), next, new Object[0]);
                                                    if (e instanceof String) {
                                                        s = (String)e;
                                                        break Label_0157;
                                                    }
                                                    break Label_0155;
                                                    this.a.run();
                                                    return;
                                                    jsonObject = new JSONObject((String)t);
                                                    // iftrue(Label_0021:, !jsonObject.has("productId"))
                                                    string = jsonObject.getString("productId");
                                                    e2 = E1.h.s.e();
                                                    Intrinsics.checkNotNullExpressionValue(string, "skuID");
                                                    e2.put(string, jsonObject);
                                                    continue Label_0021_Outer;
                                                    T1.a.b(t, this);
                                                    return;
                                                }
                                                catch (Exception ex) {}
                                            }
                                        }
                                    }
                                    finally {}
                                    t = t2;
                                    continue;
                                }
                            }
                            t = null;
                        }
                        if (t == null) {
                            continue Label_0079_Outer;
                        }
                        break;
                    }
                    continue;
                }
            }
        }
        
        @Override
        public Object invoke(Object o, final Method method, final Object[] array) {
            if (T1.a.d(this)) {
                return null;
            }
            while (true) {
            Label_0069:
                while (true) {
                    Label_0076: {
                        try {
                            Intrinsics.checkNotNullParameter(o, "proxy");
                            Intrinsics.checkNotNullParameter(method, "m");
                            if (Intrinsics.a(method.getName(), "onSkuDetailsResponse")) {
                                if (array != null) {
                                    break Label_0076;
                                }
                                o = null;
                                if (o != null && o instanceof List) {
                                    this.a((List)o);
                                    return null;
                                }
                            }
                        }
                        finally {
                            break Label_0069;
                        }
                        return null;
                    }
                    o = array[1];
                    continue;
                }
                final Throwable t;
                T1.a.b(t, this);
                return null;
            }
        }
    }
}
