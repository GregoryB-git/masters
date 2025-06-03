// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package T4;

import kotlin.text.Regex;
import java.util.Map;
import V2.j;
import java.io.Serializable;
import org.json.JSONException;
import kotlin.jvm.internal.u;
import org.json.JSONObject;
import Z5.k;
import g6.p;
import W5.C;
import V5.m;
import android.os.Build$VERSION;
import java.util.Arrays;
import android.os.Build;
import kotlin.jvm.internal.x;
import V5.q;
import android.util.Log;
import V5.t;
import V5.o;
import X5.d;
import kotlin.jvm.internal.Intrinsics;
import P.f;
import R4.b;
import s4.i;
import X5.g;

public final class c implements h
{
    public static final a g;
    public final g a;
    public final i b;
    public final b c;
    public final T4.a d;
    public final T4.g e;
    public final y6.a f;
    
    static {
        g = new a(null);
    }
    
    public c(final g a, final i b, final b c, final T4.a d, final f f) {
        Intrinsics.checkNotNullParameter(a, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(b, "firebaseInstallationsApi");
        Intrinsics.checkNotNullParameter(c, "appInfo");
        Intrinsics.checkNotNullParameter(d, "configsFetcher");
        Intrinsics.checkNotNullParameter(f, "dataStore");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = new T4.g(f);
        this.f = y6.c.b(false, 1, null);
    }
    
    public static final /* synthetic */ T4.g e(final c c) {
        return c.e;
    }
    
    @Override
    public Boolean a() {
        return this.e.g();
    }
    
    @Override
    public Double b() {
        return this.e.f();
    }
    
    @Override
    public Object c(d f) {
        Z5.d d = null;
        Label_0049: {
            if (f instanceof c$b) {
                d = (c$b)f;
                final int s = d.s;
                if ((s & Integer.MIN_VALUE) != 0x0) {
                    d.s = s + Integer.MIN_VALUE;
                    break Label_0049;
                }
            }
            d = new Z5.d(f) {
                public Object o;
                public Object p;
                public /* synthetic */ Object q;
                public final /* synthetic */ c r;
                public int s;
                
                @Override
                public final Object invokeSuspend(final Object q) {
                    this.q = q;
                    this.s |= Integer.MIN_VALUE;
                    return this.r.c(this);
                }
            };
        }
        Object o = d.q;
        final Object c = Y5.b.c();
        final int s2 = d.s;
        Label_0668: {
            final d d3;
            Label_0650: {
                c c2 = null;
                Label_0342: {
                    c c3;
                    if (s2 != 0) {
                        if (s2 != 1) {
                            if (s2 != 2) {
                                if (s2 == 3) {
                                    f = (d)d.o;
                                    try {
                                        V5.o.b(o);
                                        break Label_0650;
                                    }
                                    finally {
                                        break Label_0668;
                                    }
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            final y6.a a = (y6.a)d.p;
                            c2 = (c)d.o;
                            final Object o2 = a;
                            try {
                                V5.o.b(o);
                                break Label_0342;
                            }
                            finally {
                                f = (d)o2;
                                break Label_0668;
                            }
                        }
                        f = (d)d.p;
                        c3 = (c)d.o;
                        V5.o.b(o);
                    }
                    else {
                        V5.o.b(o);
                        if (!this.f.c() && !this.e.d()) {
                            return t.a;
                        }
                        f = (d)this.f;
                        d.o = this;
                        d.p = f;
                        d.s = 1;
                        if (((y6.a)f).a(null, d) == c) {
                            return c;
                        }
                        c3 = this;
                    }
                    try {
                        if (!c3.e.d()) {
                            final t a2 = t.a;
                            ((y6.a)f).b(null);
                            return a2;
                        }
                    }
                    finally {
                        break Label_0668;
                    }
                    final c o3;
                    final j a3 = o3.b.a();
                    Intrinsics.checkNotNullExpressionValue(a3, "firebaseInstallationsApi.id");
                    d.o = o3;
                    d.p = f;
                    d.s = 2;
                    o = z6.b.a(a3, d);
                    if (o == c) {
                        return c;
                    }
                    c2 = o3;
                }
                final String s3 = (String)o;
                if (s3 == null) {
                    Log.w("SessionConfigFetcher", "Error getting Firebase Installation ID. Skipping this Session Event.");
                    final t a4 = t.a;
                    ((y6.a)f).b(null);
                    return a4;
                }
                final m a5 = q.a("X-Crashlytics-Installation-ID", s3);
                final x a6 = x.a;
                final String format = String.format("%s/%s", Arrays.copyOf(new Object[] { Build.MANUFACTURER, Build.MODEL }, 2));
                Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
                final m a7 = q.a("X-Crashlytics-Device-Model", c2.f(format));
                final String incremental = Build$VERSION.INCREMENTAL;
                Intrinsics.checkNotNullExpressionValue(incremental, "INCREMENTAL");
                final m a8 = q.a("X-Crashlytics-OS-Build-Version", c2.f(incremental));
                final String release = Build$VERSION.RELEASE;
                Intrinsics.checkNotNullExpressionValue(release, "RELEASE");
                final Map f2 = C.f(a5, a7, a8, q.a("X-Crashlytics-OS-Display-Version", c2.f(release)), q.a("X-Crashlytics-API-Client-Version", c2.c.f()));
                final T4.a d2 = c2.d;
                final p p = new p() {
                    public Object o;
                    public Object p;
                    public int q;
                    public /* synthetic */ Object r;
                    public final /* synthetic */ c s;
                    
                    public final Object a(final JSONObject jsonObject, final X5.d d) {
                        return ((c$c)this.create(jsonObject, d)).invokeSuspend(t.a);
                    }
                    
                    @Override
                    public final X5.d create(final Object r, final X5.d d) {
                        final p p2 = new p() {
                            public Object o;
                            public Object p;
                            public int q;
                            public /* synthetic */ Object r;
                            public final /* synthetic */ c s = this.s;
                            
                            public final Object a(final JSONObject jsonObject, final X5.d d) {
                                return ((c$c)this.create(jsonObject, d)).invokeSuspend(t.a);
                            }
                        };
                        p2.r = r;
                        return p2;
                    }
                    
                    @Override
                    public final Object invokeSuspend(Object r) {
                        final Object c = Y5.b.c();
                        Label_0411: {
                            while (true) {
                                Label_0355: {
                                    Serializable p = null;
                                    Object e = null;
                                    Serializable r2 = null;
                                    JSONObject jsonObject = null;
                                    switch (this.q) {
                                        default: {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        case 6: {
                                            V5.o.b(r);
                                            break Label_0411;
                                        }
                                        case 5: {
                                            V5.o.b(r);
                                            break Label_0411;
                                        }
                                        case 4: {
                                            V5.o.b(r);
                                            break Label_0411;
                                        }
                                        case 3: {
                                            final Object o = this.r;
                                            V5.o.b(r);
                                            break Label_0411;
                                        }
                                        case 2: {
                                            final u u = (u)this.o;
                                            p = (u)this.r;
                                            V5.o.b(r);
                                            r = u;
                                            break Label_0411;
                                        }
                                        case 1: {
                                            final u o2 = (u)this.p;
                                            e = this.o;
                                            p = (u)this.r;
                                            V5.o.b(r);
                                            r = p;
                                            break Label_0411;
                                        }
                                        case 0: {
                                            V5.o.b(r);
                                            r = this.r;
                                            r2 = new u();
                                            e = new u();
                                            p = new u();
                                            if (((JSONObject)r).has("app_quality")) {
                                                r = ((JSONObject)r).get("app_quality");
                                                Intrinsics.c(r, "null cannot be cast to non-null type org.json.JSONObject");
                                                jsonObject = (JSONObject)r;
                                                try {
                                                    if (jsonObject.has("sessions_enabled")) {
                                                        r = jsonObject.get("sessions_enabled");
                                                        break;
                                                    }
                                                }
                                                catch (JSONException ex) {
                                                    r = null;
                                                    break Label_0341;
                                                }
                                                r = null;
                                                break;
                                            }
                                            break Label_0355;
                                        }
                                    }
                                    try {
                                        if (jsonObject.has("sampling_rate")) {
                                            ((u)r2).o = jsonObject.get("sampling_rate");
                                        }
                                        if (jsonObject.has("session_timeout_seconds")) {
                                            ((u)e).o = jsonObject.get("session_timeout_seconds");
                                        }
                                        Object o3 = r;
                                        if (jsonObject.has("cache_duration")) {
                                            ((u)p).o = jsonObject.get("cache_duration");
                                            o3 = r;
                                        }
                                        while (true) {
                                            u o2;
                                            if (o3 != null) {
                                                r = T4.c.e(this.s);
                                                this.r = r2;
                                                this.o = e;
                                                this.p = p;
                                                this.q = 1;
                                                if (((T4.g)r).n(o3, (X5.d)this) == c) {
                                                    return c;
                                                }
                                                r = r2;
                                                o2 = (u)p;
                                                r2 = (Serializable)e;
                                                e = r;
                                            }
                                            else {
                                                r = r2;
                                                o2 = (u)p;
                                                r2 = (Serializable)e;
                                                e = r;
                                            }
                                            r = o2;
                                            p = (Serializable)e;
                                            if (((u)r2).o != null) {
                                                final T4.g e2 = T4.c.e(this.s);
                                                r2 = (Integer)((u)r2).o;
                                                this.r = e;
                                                this.o = o2;
                                                this.p = null;
                                                this.q = 2;
                                                r = o2;
                                                p = (Serializable)e;
                                                if (e2.m((Integer)r2, this) == c) {
                                                    return c;
                                                }
                                            }
                                            Object o = r;
                                            if (((u)p).o != null) {
                                                e = T4.c.e(this.s);
                                                p = (Double)((u)p).o;
                                                this.r = r;
                                                this.o = null;
                                                this.p = null;
                                                this.q = 3;
                                                o = r;
                                                if (((T4.g)e).i(p, (X5.d)this) == c) {
                                                    return c;
                                                }
                                            }
                                            if (((u)o).o != null) {
                                                r = T4.c.e(this.s);
                                                final Integer n = (Integer)((u)o).o;
                                                this.r = null;
                                                this.o = null;
                                                this.p = null;
                                                this.q = 4;
                                                if (((T4.g)r).j(n, this) == c) {
                                                    return c;
                                                }
                                                r = t.a;
                                            }
                                            else {
                                                r = null;
                                            }
                                            if (r == null) {
                                                r = T4.c.e(this.s);
                                                final Integer b = Z5.b.b(86400);
                                                this.r = null;
                                                this.o = null;
                                                this.p = null;
                                                this.q = 5;
                                                if (((T4.g)r).j(b, this) == c) {
                                                    return c;
                                                }
                                            }
                                            r = T4.c.e(this.s);
                                            final Long c2 = Z5.b.c(System.currentTimeMillis());
                                            this.r = null;
                                            this.o = null;
                                            this.p = null;
                                            this.q = 6;
                                            if (((T4.g)r).k(c2, this) == c) {
                                                return c;
                                            }
                                            return t.a;
                                            final JSONException ex;
                                            Log.e("SessionConfigFetcher", "Error parsing the configs remotely fetched: ", (Throwable)ex);
                                            o3 = r;
                                            continue;
                                            o3 = null;
                                            continue;
                                        }
                                    }
                                    catch (JSONException ex) {
                                        continue;
                                    }
                                }
                                break;
                            }
                        }
                    }
                };
                final p p2 = new p(null) {
                    public int o;
                    public /* synthetic */ Object p;
                    
                    public final Object a(final String s, final X5.d d) {
                        return ((c$d)this.create(s, d)).invokeSuspend(t.a);
                    }
                    
                    @Override
                    public final X5.d create(final Object p2, final X5.d d) {
                        final p p3 = new p(d) {
                            public int o;
                            public /* synthetic */ Object p;
                            
                            public final Object a(final String s, final X5.d d) {
                                return ((c$d)this.create(s, d)).invokeSuspend(t.a);
                            }
                        };
                        p3.p = p2;
                        return p3;
                    }
                    
                    @Override
                    public final Object invokeSuspend(final Object o) {
                        Y5.b.c();
                        if (this.o == 0) {
                            o.b(o);
                            final String str = (String)this.p;
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Error failing to fetch the remote configs: ");
                            sb.append(str);
                            Log.e("SessionConfigFetcher", sb.toString());
                            return t.a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                };
                d.o = f;
                d.p = null;
                d.s = 3;
                if (d2.a(f2, p, p2, d) == c) {
                    return c;
                }
                d3 = f;
            }
            final t a9 = t.a;
            ((y6.a)d3).b(null);
            return t.a;
        }
        ((y6.a)f).b(null);
    }
    
    @Override
    public o6.a d() {
        final Integer e = this.e.e();
        if (e != null) {
            final o6.a.a p = o6.a.p;
            return o6.a.h(o6.c.o(e, o6.d.s));
        }
        return null;
    }
    
    public final String f(final String s) {
        return new Regex("/").replace(s, "");
    }
    
    public static final class a
    {
    }
}
