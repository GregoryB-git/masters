// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package y2;

import V2.k;
import z2.M;
import android.os.Handler;
import z2.i;
import A2.c;
import z2.x;
import V2.j;
import z2.m;
import java.util.Collection;
import java.util.Collections;
import android.accounts.Account;
import java.lang.reflect.InvocationTargetException;
import z2.p;
import com.google.android.gms.common.api.GoogleApiActivity;
import z2.C;
import A2.n;
import android.app.Activity;
import z2.l;
import android.os.Looper;
import z2.b;
import android.content.Context;

public abstract class d
{
    public final Context a;
    public final String b;
    public final y2.a c;
    public final y2.a.d d;
    public final b e;
    public final Looper f;
    public final int g;
    public final e h;
    public final l i;
    public final z2.e j;
    
    public d(final Context obj, final Activity activity, y2.a x, final y2.a.d d, final a a) {
        n.j(obj, "Null context is not permitted.");
        n.j(x, "Api must not be null.");
        n.j(a, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.a = obj.getApplicationContext();
        final boolean k = E2.l.k();
        String b;
        final String s = b = null;
        while (true) {
            if (!k) {
                break Label_0075;
            }
            try {
                b = (String)Context.class.getMethod("getAttributionTag", (Class<?>[])new Class[0]).invoke(obj, new Object[0]);
                this.b = b;
                this.c = x;
                this.d = d;
                this.f = a.b;
                final b a2 = z2.b.a(x, d, b);
                this.e = a2;
                this.h = new C(this);
                x = (y2.a)z2.e.x(this.a);
                this.j = (z2.e)x;
                this.g = ((z2.e)x).m();
                this.i = a.a;
                if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
                    p.u(activity, (z2.e)x, a2);
                }
                ((z2.e)x).b(this);
            }
            catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException ex) {
                b = s;
                continue;
            }
            break;
        }
    }
    
    public d(final Context context, final y2.a a, final y2.a.d d, final a a2) {
        this(context, null, a, d, a2);
    }
    
    public A2.d.a b() {
        final A2.d.a a = new A2.d.a();
        a.d(null);
        a.c(Collections.emptySet());
        a.e(this.a.getClass().getName());
        a.b(this.a.getPackageName());
        return a;
    }
    
    public j c(final m m) {
        return this.i(2, m);
    }
    
    public final b d() {
        return this.e;
    }
    
    public String e() {
        return this.b;
    }
    
    public final int f() {
        return this.g;
    }
    
    public final y2.a.f g(final Looper looper, final x x) {
        final y2.a.f a = ((y2.a.a)n.i(this.c.a())).a(this.a, looper, this.b().a(), this.d, x, x);
        final String e = this.e();
        if (e != null && a instanceof c) {
            ((c)a).P(e);
        }
        if (e == null) {
            return a;
        }
        if (!(a instanceof i)) {
            return a;
        }
        final i i = (i)a;
        throw null;
    }
    
    public final M h(final Context context, final Handler handler) {
        return new M(context, handler, this.b().a());
    }
    
    public final j i(final int n, final m m) {
        final k k = new k();
        this.j.D(this, n, m, k, this.i);
        return k.a();
    }
    
    public static class a
    {
        public static final d.a c;
        public final l a;
        public final Looper b;
        
        static {
            c = new d.a.a().a();
        }
        
        public a(final l a, final Account account, final Looper b) {
            this.a = a;
            this.b = b;
        }
        
        public static class a
        {
            public l a;
            public Looper b;
            
            public d.a a() {
                if (this.a == null) {
                    this.a = new z2.a();
                }
                if (this.b == null) {
                    this.b = Looper.getMainLooper();
                }
                return new d.a(this.a, null, this.b, null);
            }
        }
    }
}
