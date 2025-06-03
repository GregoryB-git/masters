/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.text.TextUtils
 *  android.util.Log
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.IllegalStateException
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.nio.charset.Charset
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.concurrent.CopyOnWriteArrayList
 *  java.util.concurrent.atomic.AtomicBoolean
 *  java.util.concurrent.atomic.AtomicReference
 */
package s3;

import A2.m;
import B3.g;
import B3.o;
import B3.x;
import C3.B;
import E.r;
import E2.l;
import V2.j;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import s3.d;
import s3.f;
import s3.m;
import s3.n;
import z2.c;

public class e {
    public static final Object k = new Object();
    public static final Map l = new t.a();
    public final Context a;
    public final String b;
    public final m c;
    public final o d;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean();
    public final x g;
    public final r4.b h;
    public final List i = new CopyOnWriteArrayList();
    public final List j = new CopyOnWriteArrayList();

    public e(Context context, String object, m object2) {
        this.a = (Context)A2.n.i((Object)context);
        this.b = A2.n.e((String)object);
        this.c = (m)A2.n.i(object2);
        object = FirebaseInitProvider.b();
        U4.c.b("Firebase");
        U4.c.b("ComponentDiscovery");
        List list = g.c(context, ComponentDiscoveryService.class).b();
        U4.c.a();
        U4.c.b("Runtime");
        object2 = o.m(B.o).d((Collection)list).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(B3.c.s((Object)context, Context.class, new Class[0])).b(B3.c.s(this, e.class, new Class[0])).b(B3.c.s(object2, m.class, new Class[0])).g(new U4.b());
        if (r.a(context) && FirebaseInitProvider.c()) {
            object2.b(B3.c.s(object, n.class, new Class[0]));
        }
        this.d = object = object2.e();
        U4.c.a();
        this.g = new x(new s3.c(this, context));
        this.h = object.g(o4.f.class);
        this.g(new d(this));
        U4.c.a();
    }

    public static String B(String string2) {
        return string2.trim();
    }

    public static /* synthetic */ void a(e e8, boolean bl) {
        e8.A(bl);
    }

    public static /* synthetic */ x4.a b(e e8, Context context) {
        return e8.z(context);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static List l() {
        ArrayList arrayList = new ArrayList();
        Object object = k;
        // MONITORENTER : object
        Iterator iterator = l.values().iterator();
        while (iterator.hasNext()) {
            arrayList.add((Object)((e)iterator.next()).q());
        }
        // MONITOREXIT : object
        Collections.sort((List)arrayList);
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static List n(Context object) {
        object = k;
        synchronized (object) {
            return new ArrayList(l.values());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static e o() {
        Object object = k;
        synchronized (object) {
            try {
                e e8 = (e)l.get((Object)"[DEFAULT]");
                if (e8 != null) {
                    ((o4.f)e8.h.get()).l();
                    return e8;
                }
                e8 = new StringBuilder();
                e8.append("Default FirebaseApp is not initialized in this process ");
                e8.append(E2.m.a());
                e8.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                throw new IllegalStateException(e8.toString());
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static e p(String string2) {
        Object object = k;
        synchronized (object) {
            try {
                Object object2 = (e)l.get((Object)e.B(string2));
                if (object2 != null) {
                    ((o4.f)object2.h.get()).l();
                    return object2;
                }
                object2 = e.l();
                if (object2.isEmpty()) {
                    object2 = "";
                    throw new IllegalStateException(String.format((String)"FirebaseApp with name %s doesn't exist. %s", (Object[])new Object[]{string2, object2}));
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Available app names: ");
                    stringBuilder.append(TextUtils.join((CharSequence)", ", (Iterable)object2));
                    object2 = stringBuilder.toString();
                }
                throw new IllegalStateException(String.format((String)"FirebaseApp with name %s doesn't exist. %s", (Object[])new Object[]{string2, object2}));
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static e u(Context object) {
        Object object2 = k;
        synchronized (object2) {
            try {
                if (l.containsKey((Object)"[DEFAULT]")) {
                    return e.o();
                }
                m m8 = m.a((Context)object);
                if (m8 != null) return e.v((Context)object, m8);
                Log.w((String)"FirebaseApp", (String)"Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static e v(Context context, m m8) {
        return e.w(context, m8, "[DEFAULT]");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static e w(Context object, m m8, String string2) {
        b.c((Context)object);
        string2 = e.B(string2);
        if (object.getApplicationContext() != null) {
            object = object.getApplicationContext();
        }
        Object object2 = k;
        synchronized (object2) {
            Map map = l;
            boolean bl = map.containsKey((Object)string2);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("FirebaseApp name ");
            stringBuilder.append(string2);
            stringBuilder.append(" already exists!");
            A2.n.m(bl ^ true, stringBuilder.toString());
            A2.n.j(object, "Application context cannot be null.");
            object = new e((Context)object, string2, m8);
            map.put((Object)string2, object);
        }
        object.t();
        return object;
    }

    public final /* synthetic */ void A(boolean bl) {
        if (!bl) {
            ((o4.f)this.h.get()).l();
        }
    }

    public final void C(boolean bl) {
        Log.d((String)"FirebaseApp", (String)"Notifying background state change listeners.");
        Iterator iterator = this.i.iterator();
        while (iterator.hasNext()) {
            ((a)iterator.next()).a(bl);
        }
    }

    public final void D() {
        Iterator iterator = this.j.iterator();
        while (iterator.hasNext()) {
            ((f)iterator.next()).a(this.b, this.c);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void E(boolean bl) {
        block2 : {
            block4 : {
                boolean bl2;
                block3 : {
                    this.i();
                    if (!this.e.compareAndSet(bl ^ true, bl)) break block2;
                    bl2 = z2.c.b().d();
                    if (!bl || !bl2) break block3;
                    bl = true;
                    break block4;
                }
                if (bl || !bl2) break block2;
                bl = false;
            }
            this.C(bl);
            return;
        }
    }

    public void F(Boolean bl) {
        this.i();
        ((x4.a)this.g.get()).e(bl);
    }

    public boolean equals(Object object) {
        if (!(object instanceof e)) {
            return false;
        }
        return this.b.equals((Object)((e)object).q());
    }

    public void g(a a8) {
        this.i();
        if (this.e.get() && z2.c.b().d()) {
            a8.a(true);
        }
        this.i.add((Object)a8);
    }

    public void h(f f8) {
        this.i();
        A2.n.i(f8);
        this.j.add((Object)f8);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public final void i() {
        A2.n.m(this.f.get() ^ true, "FirebaseApp was deleted");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void j() {
        if (!this.f.compareAndSet(false, true)) {
            return;
        }
        Object object = k;
        synchronized (object) {
            l.remove((Object)this.b);
        }
        this.D();
    }

    public Object k(Class class_) {
        this.i();
        return this.d.a(class_);
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
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(E2.c.a(this.q().getBytes(Charset.defaultCharset())));
        stringBuilder.append("+");
        stringBuilder.append(E2.c.a(this.r().c().getBytes(Charset.defaultCharset())));
        return stringBuilder.toString();
    }

    public final void t() {
        if (r.a(this.a) ^ true) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            stringBuilder.append(this.q());
            Log.i((String)"FirebaseApp", (String)stringBuilder.toString());
            c.b(this.a);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Device unlocked: initializing all Firebase APIs for app ");
        stringBuilder.append(this.q());
        Log.i((String)"FirebaseApp", (String)stringBuilder.toString());
        this.d.p(this.y());
        ((o4.f)this.h.get()).l();
    }

    public String toString() {
        return A2.m.c(this).a("name", this.b).a("options", this.c).toString();
    }

    public boolean x() {
        this.i();
        return ((x4.a)this.g.get()).b();
    }

    public boolean y() {
        return "[DEFAULT]".equals((Object)this.q());
    }

    public final /* synthetic */ x4.a z(Context context) {
        return new x4.a(context, this.s(), (n4.c)this.d.a(n4.c.class));
    }

    public static interface a {
        public void a(boolean var1);
    }

    public static class b
    implements c.a {
        public static AtomicReference a = new AtomicReference();

        public static void c(Context context) {
            if (l.a()) {
                b b8;
                if (!(context.getApplicationContext() instanceof Application)) {
                    return;
                }
                context = (Application)context.getApplicationContext();
                if (a.get() == null && t0.f.a(a, null, b8 = new b())) {
                    z2.c.c((Application)context);
                    z2.c.b().a(b8);
                }
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void a(boolean bl) {
            Object object = k;
            synchronized (object) {
                try {
                    Iterator iterator = new ArrayList(e.l.values()).iterator();
                    do {
                        if (!iterator.hasNext()) {
                            return;
                        }
                        e e8 = (e)iterator.next();
                        if (!e8.e.get()) continue;
                        e8.C(bl);
                    } while (true);
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
        }
    }

    public static class c
    extends BroadcastReceiver {
        public static AtomicReference b = new AtomicReference();
        public final Context a;

        public c(Context context) {
            this.a = context;
        }

        public static void b(Context context) {
            c c8;
            if (b.get() == null && t0.f.a(b, null, (Object)(c8 = new c(context)))) {
                context.registerReceiver((BroadcastReceiver)c8, new IntentFilter("android.intent.action.USER_UNLOCKED"));
            }
        }

        public void c() {
            this.a.unregisterReceiver((BroadcastReceiver)this);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Converted monitor instructions to comments
         * Lifted jumps to return sites
         */
        public void onReceive(Context object, Intent intent) {
            object = k;
            // MONITORENTER : object
            intent = e.l.values().iterator();
            while (intent.hasNext()) {
                ((e)intent.next()).t();
            }
            // MONITOREXIT : object
            this.c();
        }
    }

}

