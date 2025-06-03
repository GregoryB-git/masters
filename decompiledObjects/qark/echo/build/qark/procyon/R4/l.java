// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R4;

import java.util.Iterator;
import java.util.Collection;
import java.util.Map;
import s3.m;
import android.content.Context;
import android.util.Log;
import android.app.Application;
import V5.t;
import X5.d;
import g6.a;
import kotlin.jvm.internal.Intrinsics;
import p6.F;
import s4.i;
import kotlin.jvm.internal.g;
import T4.f;
import s3.e;

public final class l
{
    public static final a h;
    public final e a;
    public final b b;
    public final f c;
    public final x d;
    public final s e;
    public final h f;
    public final o g;
    
    static {
        h = new a(null);
    }
    
    public l(final e a, final i i, final F f, final F f2, final r4.b b) {
        Intrinsics.checkNotNullParameter(a, "firebaseApp");
        Intrinsics.checkNotNullParameter(i, "firebaseInstallations");
        Intrinsics.checkNotNullParameter(f, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(f2, "blockingDispatcher");
        Intrinsics.checkNotNullParameter(b, "transportFactoryProvider");
        this.a = a;
        final b a2 = r.a.a(a);
        this.b = a2;
        final Context m = a.m();
        Intrinsics.checkNotNullExpressionValue(m, "firebaseApp.applicationContext");
        final f c = new f(m, f2, f, i, a2);
        this.c = c;
        final w d = new w();
        this.d = d;
        final h f3 = new h(b);
        this.f = f3;
        this.g = new o(i, f3);
        final s e = new s(this.f(), d, null, 4, null);
        this.e = e;
        final v v = new v(d, f, new u() {
            @Override
            public Object a(final p p2, final d d) {
                final Object c = l.this.d(p2, d);
                if (c == Y5.b.c()) {
                    return c;
                }
                return t.a;
            }
        }, c, e);
        final Context applicationContext = a.m().getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application)applicationContext).registerActivityLifecycleCallbacks(v.d());
            a.h(new k(applicationContext, v));
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Failed to register lifecycle callbacks, unexpected context ");
        sb.append(applicationContext.getClass());
        sb.append('.');
        Log.e("FirebaseSessions", sb.toString());
    }
    
    public static final void b(final Context context, final v v, final String s, final m m) {
        Intrinsics.checkNotNullParameter(v, "$sessionInitiator");
        Log.w("FirebaseSessions", "FirebaseApp instance deleted. Sessions library will not collect session data.");
        ((Application)context).unregisterActivityLifecycleCallbacks(v.d());
    }
    
    public final Object d(p p2, final d d) {
        Z5.d d2 = null;
        Label_0049: {
            if (d instanceof l$b) {
                d2 = (l$b)d;
                final int t = d2.t;
                if ((t & Integer.MIN_VALUE) != 0x0) {
                    d2.t = t + Integer.MIN_VALUE;
                    break Label_0049;
                }
            }
            d2 = new Z5.d(d) {
                public Object o;
                public Object p;
                public Object q;
                public /* synthetic */ Object r;
                public int t;
                
                @Override
                public final Object invokeSuspend(final Object r) {
                    this.r = r;
                    this.t |= Integer.MIN_VALUE;
                    return l.this.d(null, this);
                }
            };
        }
        Object o = d2.r;
        final Object c = Y5.b.c();
        final int t2 = d2.t;
        l o2 = null;
        Map<K, S4.b> q = null;
        while (true) {
            Label_0436: {
                if (t2 != 0) {
                    if (t2 != 1) {
                        if (t2 != 2) {
                            if (t2 == 3) {
                                Label_0534: {
                                    try {
                                        V5.o.b(o);
                                        return t.a;
                                    }
                                    catch (IllegalStateException ex) {
                                        break Label_0534;
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                final IllegalStateException ex;
                                Log.w("FirebaseSessions", "FirebaseApp is not initialized. Sessions library will not collect session data.", (Throwable)ex);
                                return t.a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        final Map map = (Map)d2.q;
                        p2 = (p)d2.p;
                        o2 = (l)d2.o;
                        V5.o.b(o);
                        q = (Map<K, S4.b>)map;
                        break Label_0436;
                    }
                    else {
                        p2 = (p)d2.p;
                        o2 = (l)d2.o;
                        V5.o.b(o);
                    }
                }
                else {
                    V5.o.b(o);
                    final S4.a a = S4.a.a;
                    d2.o = this;
                    d2.p = p2;
                    d2.t = 1;
                    o = a.c(d2);
                    if (o == c) {
                        return c;
                    }
                    o2 = this;
                }
                q = (Map<K, S4.b>)o;
                String s;
                if (q.isEmpty()) {
                    s = "Sessions SDK did not have any dependent SDKs register as dependencies. Events will not be sent.";
                }
                else {
                    final Iterator<Object> iterator = q.values().iterator();
                    while (iterator.hasNext()) {
                        iterator.next().b(new S4.b.b(p2.b()));
                    }
                    final Collection<S4.b> collection = q.values();
                    if (!(collection instanceof Collection) || !collection.isEmpty()) {
                        final Iterator<Object> iterator2 = collection.iterator();
                        while (iterator2.hasNext()) {
                            if (iterator2.next().c()) {
                                Log.d("FirebaseSessions", "Data Collection is enabled for at least one Subscriber");
                                final f c2 = o2.c;
                                d2.o = o2;
                                d2.p = p2;
                                d2.q = q;
                                d2.t = 2;
                                if (c2.g(d2) == c) {
                                    return c;
                                }
                                break Label_0436;
                            }
                        }
                    }
                    s = "Data Collection is disabled for all subscribers. Skipping this Session Event";
                }
                Log.d("FirebaseSessions", s);
                return t.a;
            }
            if (!o2.c.d()) {
                final String s = "Sessions SDK disabled. Events will not be sent.";
                continue;
            }
            if (!o2.e.c()) {
                final String s = "Sessions SDK has dropped this session due to sampling.";
                continue;
            }
            break;
        }
        final q c3 = r.a.c(o2.a, p2, o2.c, q);
        final o g = o2.g;
        d2.o = null;
        d2.p = null;
        d2.q = null;
        d2.t = 3;
        if (g.a(c3, d2) == c) {
            return c;
        }
        return t.a;
    }
    
    public final void e(final S4.b b) {
        Intrinsics.checkNotNullParameter(b, "subscriber");
        S4.a.a.e(b);
        final StringBuilder sb = new StringBuilder();
        sb.append("Registering Sessions SDK subscriber with name: ");
        sb.append(b.a());
        sb.append(", data collection enabled: ");
        sb.append(b.c());
        Log.d("FirebaseSessions", sb.toString());
        if (this.e.e()) {
            b.b(new S4.b.b(this.e.d().b()));
        }
    }
    
    public final boolean f() {
        return Math.random() <= this.c.b();
    }
    
    public static final class a
    {
    }
}
