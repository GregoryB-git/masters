// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package s3;

import android.content.Intent;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.app.Application;
import E2.l;
import java.util.concurrent.atomic.AtomicReference;
import java.nio.charset.Charset;
import android.util.Log;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.Collections;
import java.util.ArrayList;
import o4.f;
import E.r;
import B3.j;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.FirebaseCommonRegistrar;
import java.util.Collection;
import java.util.concurrent.Executor;
import C3.B;
import B3.g;
import com.google.firebase.components.ComponentDiscoveryService;
import U4.c;
import com.google.firebase.provider.FirebaseInitProvider;
import A2.n;
import java.util.concurrent.CopyOnWriteArrayList;
import t.a;
import java.util.List;
import r4.b;
import B3.x;
import java.util.concurrent.atomic.AtomicBoolean;
import B3.o;
import android.content.Context;
import java.util.Map;

public class e
{
    public static final Object k;
    public static final Map l;
    public final Context a;
    public final String b;
    public final m c;
    public final o d;
    public final AtomicBoolean e;
    public final AtomicBoolean f;
    public final x g;
    public final r4.b h;
    public final List i;
    public final List j;
    
    static {
        k = new Object();
        l = new t.a();
    }
    
    public e(final Context context, final String s, final m m) {
        this.e = new AtomicBoolean(false);
        this.f = new AtomicBoolean();
        this.i = new CopyOnWriteArrayList();
        this.j = new CopyOnWriteArrayList();
        this.a = (Context)n.i(context);
        this.b = n.e(s);
        this.c = (m)n.i(m);
        final s3.n b = FirebaseInitProvider.b();
        U4.c.b("Firebase");
        U4.c.b("ComponentDiscovery");
        final List b2 = B3.g.c(context, ComponentDiscoveryService.class).b();
        U4.c.a();
        U4.c.b("Runtime");
        final o.b g = o.m(B.o).d(b2).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(B3.c.s(context, Context.class, new Class[0])).b(B3.c.s(this, e.class, new Class[0])).b(B3.c.s(m, m.class, new Class[0])).g(new U4.b());
        if (r.a(context) && FirebaseInitProvider.c()) {
            g.b(B3.c.s(b, s3.n.class, new Class[0]));
        }
        final o e = g.e();
        this.d = e;
        U4.c.a();
        this.g = new x(new s3.c(this, context));
        this.h = e.g(f.class);
        this.g((a)new d(this));
        U4.c.a();
    }
    
    public static String B(final String s) {
        return s.trim();
    }
    
    public static /* synthetic */ Object c() {
        return e.k;
    }
    
    public static /* synthetic */ AtomicBoolean e(final e e) {
        return e.e;
    }
    
    public static List l() {
        final ArrayList<String> list = (ArrayList<String>)new ArrayList<Comparable>();
        final Object k = e.k;
        // monitorenter(k)
        while (true) {
            try {
                final Iterator<e> iterator = e.l.values().iterator();
                while (iterator.hasNext()) {
                    list.add(iterator.next().q());
                }
                // monitorexit(k)
                Collections.sort((List<Comparable>)list);
                return list;
                // monitorexit(k)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static List n(final Context context) {
        synchronized (e.k) {
            return new ArrayList(e.l.values());
        }
    }
    
    public static e o() {
        final Object k = e.k;
        // monitorenter(k)
        while (true) {
            try {
                final e e = s3.e.l.get("[DEFAULT]");
                if (e != null) {
                    ((f)e.h.get()).l();
                    // monitorexit(k)
                    return e;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Default FirebaseApp is not initialized in this process ");
                sb.append(E2.m.a());
                sb.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                throw new IllegalStateException(sb.toString());
                // monitorexit(k)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static e p(final String s) {
        final Object k = e.k;
        // monitorenter(k)
        while (true) {
            try {
                final e e = s3.e.l.get(B(s));
                if (e != null) {
                    ((f)e.h.get()).l();
                    // monitorexit(k)
                    return e;
                }
                final List l = l();
                String string;
                if (l.isEmpty()) {
                    string = "";
                }
                else {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Available app names: ");
                    sb.append(TextUtils.join((CharSequence)", ", (Iterable)l));
                    string = sb.toString();
                }
                throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", s, string));
                // monitorexit(k)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static e u(final Context context) {
        final Object k = e.k;
        // monitorenter(k)
        while (true) {
            try {
                if (e.l.containsKey("[DEFAULT]")) {
                    // monitorexit(k)
                    return o();
                }
                final m a = m.a(context);
                if (a == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    // monitorexit(k)
                    return null;
                }
                // monitorexit(k)
                return v(context, a);
                // monitorexit(k)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static e v(final Context context, final m m) {
        return w(context, m, "[DEFAULT]");
    }
    
    public static e w(Context applicationContext, final m m, String b) {
        c(applicationContext);
        b = B(b);
        if (applicationContext.getApplicationContext() != null) {
            applicationContext = applicationContext.getApplicationContext();
        }
        synchronized (e.k) {
            final Map l = e.l;
            final boolean containsKey = l.containsKey(b);
            final StringBuilder sb = new StringBuilder();
            sb.append("FirebaseApp name ");
            sb.append(b);
            sb.append(" already exists!");
            n.m(containsKey ^ true, sb.toString());
            n.j(applicationContext, "Application context cannot be null.");
            final e e = new e(applicationContext, b, m);
            l.put(b, e);
            // monitorexit(e.k)
            e.t();
            return e;
        }
    }
    
    public final void C(final boolean b) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        final Iterator<a> iterator = this.i.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(b);
        }
    }
    
    public final void D() {
        final Iterator<s3.f> iterator = this.j.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(this.b, this.c);
        }
    }
    
    public void E(final boolean newValue) {
        this.i();
        if (this.e.compareAndSet(newValue ^ true, newValue)) {
            final boolean d = z2.c.b().d();
            boolean b;
            if (newValue && d) {
                b = true;
            }
            else {
                if (newValue || !d) {
                    return;
                }
                b = false;
            }
            this.C(b);
        }
    }
    
    public void F(final Boolean b) {
        this.i();
        ((x4.a)this.g.get()).e(b);
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof e && this.b.equals(((e)o).q());
    }
    
    public void g(final a a) {
        this.i();
        if (this.e.get() && z2.c.b().d()) {
            a.a(true);
        }
        this.i.add(a);
    }
    
    public void h(final s3.f f) {
        this.i();
        n.i(f);
        this.j.add(f);
    }
    
    @Override
    public int hashCode() {
        return this.b.hashCode();
    }
    
    public final void i() {
        n.m(this.f.get() ^ true, "FirebaseApp was deleted");
    }
    
    public void j() {
        if (!this.f.compareAndSet(false, true)) {
            return;
        }
        synchronized (s3.e.k) {
            s3.e.l.remove(this.b);
            // monitorexit(e.k)
            this.D();
        }
    }
    
    public Object k(final Class clazz) {
        this.i();
        return this.d.a(clazz);
    }
    
    public Context m() {
        this.i();
        return this.a;
    }
    
    public String q() {
        this.i();
        return this.b;
    }
    
    public m r() {
        this.i();
        return this.c;
    }
    
    public String s() {
        final StringBuilder sb = new StringBuilder();
        sb.append(E2.c.a(this.q().getBytes(Charset.defaultCharset())));
        sb.append("+");
        sb.append(E2.c.a(this.r().c().getBytes(Charset.defaultCharset())));
        return sb.toString();
    }
    
    public final void t() {
        if (r.a(this.a) ^ true) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            sb.append(this.q());
            Log.i("FirebaseApp", sb.toString());
            b(this.a);
            return;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Device unlocked: initializing all Firebase APIs for app ");
        sb2.append(this.q());
        Log.i("FirebaseApp", sb2.toString());
        this.d.p(this.y());
        ((f)this.h.get()).l();
    }
    
    @Override
    public String toString() {
        return A2.m.c(this).a("name", this.b).a("options", this.c).toString();
    }
    
    public boolean x() {
        this.i();
        return ((x4.a)this.g.get()).b();
    }
    
    public boolean y() {
        return "[DEFAULT]".equals(this.q());
    }
    
    public interface a
    {
        void a(final boolean p0);
    }
    
    public static class b implements c.a
    {
        public static AtomicReference a;
        
        static {
            b.a = new AtomicReference();
        }
        
        public static void c(final Context context) {
            if (E2.l.a()) {
                if (!(context.getApplicationContext() instanceof Application)) {
                    return;
                }
                final Application application = (Application)context.getApplicationContext();
                if (b.a.get() == null) {
                    final b b = new b();
                    if (t0.f.a(e.b.a, null, b)) {
                        z2.c.c(application);
                        z2.c.b().a((c.a)b);
                    }
                }
            }
        }
        
        @Override
        public void a(final boolean b) {
            final Object c = s3.e.c();
            // monitorenter(c)
            while (true) {
                try {
                    for (final e e : new ArrayList<e>(s3.e.l.values())) {
                        if (s3.e.e(e).get()) {
                            e.C(b);
                        }
                    }
                    // monitorexit(c)
                    return;
                    // monitorexit(c)
                    throw;
                }
                finally {
                    continue;
                }
                break;
            }
        }
    }
    
    public static class c extends BroadcastReceiver
    {
        public static AtomicReference b;
        public final Context a;
        
        static {
            c.b = new AtomicReference();
        }
        
        public c(final Context a) {
            this.a = a;
        }
        
        public static void b(final Context context) {
            if (c.b.get() == null) {
                final c c = new c(context);
                if (t0.f.a(e.c.b, null, c)) {
                    context.registerReceiver((BroadcastReceiver)c, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }
        
        public void c() {
            this.a.unregisterReceiver((BroadcastReceiver)this);
        }
        
        public void onReceive(Context c, final Intent intent) {
            c = (Context)s3.e.c();
            // monitorenter(c)
            while (true) {
                try {
                    final Iterator<e> iterator = s3.e.l.values().iterator();
                    while (iterator.hasNext()) {
                        iterator.next().t();
                    }
                    // monitorexit(c)
                    this.c();
                    return;
                    // monitorexit(c)
                    throw;
                }
                finally {
                    continue;
                }
                break;
            }
        }
    }
}
