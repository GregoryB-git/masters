/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Service
 *  android.content.BroadcastReceiver
 *  android.content.ContentProvider
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Set
 */
package v5;

import A5.a;
import E5.m;
import E5.n;
import E5.o;
import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.plugin.platform.l;
import io.flutter.plugin.platform.r;
import io.flutter.view.TextureRegistry;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import u5.d;
import w5.a;
import y5.f;

public class b
implements A5.b,
B5.b {
    public final Map a = new HashMap();
    public final io.flutter.embedding.engine.a b;
    public final a.b c;
    public final Map d = new HashMap();
    public d e;
    public c f;
    public boolean g = false;
    public final Map h = new HashMap();
    public Service i;
    public final Map j = new HashMap();
    public BroadcastReceiver k;
    public final Map l = new HashMap();
    public ContentProvider m;

    public b(Context context, io.flutter.embedding.engine.a a8, f f8, io.flutter.embedding.engine.b b8) {
        this.b = a8;
        this.c = new a.b(context, a8, a8.k(), a8.t(), a8.q().M(), new b(f8, null), b8);
    }

    @Override
    public boolean a(int n8, int n9, Intent intent) {
        if (this.r()) {
            boolean bl;
            block6 : {
                T5.f f8 = T5.f.i("FlutterEngineConnectionRegistry#onActivityResult");
                try {
                    bl = this.f.a(n8, n9, intent);
                    if (f8 == null) break block6;
                }
                catch (Throwable throwable) {
                    if (f8 != null) {
                        try {
                            f8.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                f8.close();
            }
            return bl;
        }
        t5.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
        return false;
    }

    @Override
    public boolean b(int n8, String[] arrstring, int[] arrn) {
        if (this.r()) {
            boolean bl;
            block6 : {
                T5.f f8 = T5.f.i("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
                try {
                    bl = this.f.j(n8, arrstring, arrn);
                    if (f8 == null) break block6;
                }
                catch (Throwable throwable) {
                    if (f8 != null) {
                        try {
                            f8.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                f8.close();
            }
            return bl;
        }
        t5.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void c(A5.a a8) {
        Object object;
        Throwable throwable2;
        block9 : {
            block8 : {
                block7 : {
                    object = new StringBuilder();
                    object.append("FlutterEngineConnectionRegistry#add ");
                    object.append(a8.getClass().getSimpleName());
                    object = T5.f.i(object.toString());
                    try {
                        boolean bl = this.q(a8.getClass());
                        if (!bl) break block7;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Attempted to register plugin (");
                        stringBuilder.append((Object)a8);
                        stringBuilder.append(") but it was already registered with this FlutterEngine (");
                        stringBuilder.append((Object)this.b);
                        stringBuilder.append(").");
                        t5.b.g("FlutterEngineCxnRegstry", stringBuilder.toString());
                        if (object == null) return;
                    }
                    catch (Throwable throwable2) {}
                    object.close();
                    return;
                }
                Object object2 = new StringBuilder();
                object2.append("Adding plugin: ");
                object2.append((Object)a8);
                t5.b.f("FlutterEngineCxnRegstry", object2.toString());
                this.a.put((Object)a8.getClass(), (Object)a8);
                a8.onAttachedToEngine(this.c);
                if (a8 instanceof B5.a) {
                    object2 = (B5.a)((Object)a8);
                    this.d.put((Object)a8.getClass(), object2);
                    if (this.r()) {
                        object2.onAttachedToActivity(this.f);
                    }
                }
                if (object == null) return;
                break block8;
                break block9;
            }
            object.close();
            return;
        }
        if (object == null) throw throwable2;
        try {
            object.close();
            throw throwable2;
        }
        catch (Throwable throwable3) {
            throwable2.addSuppressed(throwable3);
        }
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void d() {
        if (!this.r()) {
            t5.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        T5.f f8 = T5.f.i("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
        try {
            this.g = true;
            Iterator iterator = this.d.values().iterator();
            while (iterator.hasNext()) {
                ((B5.a)iterator.next()).onDetachedFromActivityForConfigChanges();
            }
            this.l();
            if (f8 == null) return;
        }
        catch (Throwable throwable) {}
        f8.close();
        return;
        if (f8 == null) throw throwable;
        try {
            f8.close();
            throw throwable;
        }
        catch (Throwable throwable) {
            throwable.addSuppressed(throwable);
        }
        throw throwable;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void e(Bundle bundle) {
        if (this.r()) {
            T5.f f8 = T5.f.i("FlutterEngineConnectionRegistry#onRestoreInstanceState");
            try {
                this.f.k(bundle);
                if (f8 == null) return;
            }
            catch (Throwable throwable) {
                if (f8 == null) throw throwable;
                try {
                    f8.close();
                    throw throwable;
                }
                catch (Throwable throwable2) {
                    throwable.addSuppressed(throwable2);
                }
                throw throwable;
            }
            f8.close();
            return;
        }
        t5.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void f() {
        if (!this.r()) {
            t5.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        T5.f f8 = T5.f.i("FlutterEngineConnectionRegistry#detachFromActivity");
        try {
            Iterator iterator = this.d.values().iterator();
            while (iterator.hasNext()) {
                ((B5.a)iterator.next()).onDetachedFromActivity();
            }
            this.l();
            if (f8 == null) return;
        }
        catch (Throwable throwable) {}
        f8.close();
        return;
        if (f8 == null) throw throwable;
        try {
            f8.close();
            throw throwable;
        }
        catch (Throwable throwable) {
            throwable.addSuppressed(throwable);
        }
        throw throwable;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void g(Bundle bundle) {
        if (this.r()) {
            T5.f f8 = T5.f.i("FlutterEngineConnectionRegistry#onSaveInstanceState");
            try {
                this.f.l(bundle);
                if (f8 == null) return;
            }
            catch (Throwable throwable) {
                if (f8 == null) throw throwable;
                try {
                    f8.close();
                    throw throwable;
                }
                catch (Throwable throwable2) {
                    throwable.addSuppressed(throwable2);
                }
                throw throwable;
            }
            f8.close();
            return;
        }
        t5.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void h() {
        if (this.r()) {
            T5.f f8 = T5.f.i("FlutterEngineConnectionRegistry#onUserLeaveHint");
            try {
                this.f.m();
                if (f8 == null) return;
            }
            catch (Throwable throwable) {
                if (f8 == null) throw throwable;
                try {
                    f8.close();
                    throw throwable;
                }
                catch (Throwable throwable2) {
                    throwable.addSuppressed(throwable2);
                }
                throw throwable;
            }
            f8.close();
            return;
        }
        t5.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void i(d d8, androidx.lifecycle.d d9) {
        T5.f f8 = T5.f.i("FlutterEngineConnectionRegistry#attachToActivity");
        try {
            d d10 = this.e;
            if (d10 != null) {
                d10.d();
            }
            this.m();
            this.e = d8;
            this.j((Activity)d8.e(), d9);
            if (f8 == null) return;
        }
        catch (Throwable throwable) {}
        f8.close();
        return;
        if (f8 == null) throw throwable;
        try {
            f8.close();
            throw throwable;
        }
        catch (Throwable throwable) {
            throwable.addSuppressed(throwable);
        }
        throw throwable;
    }

    public final void j(Activity activity, androidx.lifecycle.d object2) {
        this.f = new c(activity, (androidx.lifecycle.d)object2);
        boolean bl = activity.getIntent() != null ? activity.getIntent().getBooleanExtra("enable-software-rendering", false) : false;
        this.b.q().f0(bl);
        this.b.q().u((Context)activity, this.b.t(), this.b.k());
        for (Object object2 : this.d.values()) {
            if (this.g) {
                object2.onReattachedToActivityForConfigChanges(this.f);
                continue;
            }
            object2.onAttachedToActivity(this.f);
        }
        this.g = false;
    }

    public void k() {
        t5.b.f("FlutterEngineCxnRegstry", "Destroying.");
        this.m();
        this.x();
    }

    public final void l() {
        this.b.q().E();
        this.e = null;
        this.f = null;
    }

    public final void m() {
        if (this.r()) {
            this.f();
            return;
        }
        if (this.u()) {
            this.p();
            return;
        }
        if (this.s()) {
            this.n();
            return;
        }
        if (this.t()) {
            this.o();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void n() {
        if (this.s()) {
            Iterator iterator;
            block6 : {
                T5.f f8 = T5.f.i("FlutterEngineConnectionRegistry#detachFromBroadcastReceiver");
                try {
                    iterator = this.j.values().iterator();
                    boolean bl = iterator.hasNext();
                    if (bl) break block6;
                    if (f8 == null) return;
                }
                catch (Throwable throwable) {
                    if (f8 == null) throw throwable;
                    try {
                        f8.close();
                        throw throwable;
                    }
                    catch (Throwable throwable2) {
                        throwable.addSuppressed(throwable2);
                    }
                    throw throwable;
                }
                f8.close();
                return;
            }
            android.support.v4.media.a.a(iterator.next());
            throw null;
        }
        t5.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a BroadcastReceiver when no BroadcastReceiver was attached.");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void o() {
        if (this.t()) {
            Iterator iterator;
            block6 : {
                T5.f f8 = T5.f.i("FlutterEngineConnectionRegistry#detachFromContentProvider");
                try {
                    iterator = this.l.values().iterator();
                    boolean bl = iterator.hasNext();
                    if (bl) break block6;
                    if (f8 == null) return;
                }
                catch (Throwable throwable) {
                    if (f8 == null) throw throwable;
                    try {
                        f8.close();
                        throw throwable;
                    }
                    catch (Throwable throwable2) {
                        throwable.addSuppressed(throwable2);
                    }
                    throw throwable;
                }
                f8.close();
                return;
            }
            android.support.v4.media.a.a(iterator.next());
            throw null;
        }
        t5.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a ContentProvider when no ContentProvider was attached.");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void onNewIntent(Intent intent) {
        if (this.r()) {
            T5.f f8 = T5.f.i("FlutterEngineConnectionRegistry#onNewIntent");
            try {
                this.f.b(intent);
                if (f8 == null) return;
            }
            catch (Throwable throwable) {
                if (f8 == null) throw throwable;
                try {
                    f8.close();
                    throw throwable;
                }
                catch (Throwable throwable2) {
                    throwable.addSuppressed(throwable2);
                }
                throw throwable;
            }
            f8.close();
            return;
        }
        t5.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void p() {
        Throwable throwable2;
        Iterator iterator;
        T5.f f8;
        block6 : {
            if (!this.u()) {
                t5.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a Service when no Service was attached.");
                return;
            }
            f8 = T5.f.i("FlutterEngineConnectionRegistry#detachFromService");
            try {
                iterator = this.h.values().iterator();
                if (iterator.hasNext()) break block6;
                this.i = null;
                if (f8 == null) return;
            }
            catch (Throwable throwable2) {}
            f8.close();
            return;
        }
        android.support.v4.media.a.a(iterator.next());
        throw null;
        if (f8 == null) throw throwable2;
        try {
            f8.close();
            throw throwable2;
        }
        catch (Throwable throwable3) {
            throwable2.addSuppressed(throwable3);
        }
        throw throwable2;
    }

    public boolean q(Class class_) {
        return this.a.containsKey((Object)class_);
    }

    public final boolean r() {
        if (this.e != null) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        if (this.k != null) {
            return true;
        }
        return false;
    }

    public final boolean t() {
        if (this.m != null) {
            return true;
        }
        return false;
    }

    public final boolean u() {
        if (this.i != null) {
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void v(Class class_) {
        A5.a a8 = (A5.a)this.a.get((Object)class_);
        if (a8 == null) {
            return;
        }
        Object object = new StringBuilder();
        object.append("FlutterEngineConnectionRegistry#remove ");
        object.append(class_.getSimpleName());
        object = T5.f.i(object.toString());
        try {
            if (a8 instanceof B5.a) {
                if (this.r()) {
                    ((B5.a)((Object)a8)).onDetachedFromActivity();
                }
                this.d.remove((Object)class_);
            }
            a8.onDetachedFromEngine(this.c);
            this.a.remove((Object)class_);
            if (object == null) return;
        }
        catch (Throwable throwable) {}
        object.close();
        return;
        if (object == null) throw throwable;
        try {
            object.close();
            throw throwable;
        }
        catch (Throwable throwable) {
            throwable.addSuppressed(throwable);
        }
        throw throwable;
    }

    public void w(Set set) {
        set = set.iterator();
        while (set.hasNext()) {
            this.v((Class)set.next());
        }
    }

    public void x() {
        this.w((Set)new HashSet((Collection)this.a.keySet()));
        this.a.clear();
    }

    public static class b
    implements a.a {
        public final f a;

        public b(f f8) {
            this.a = f8;
        }

        public /* synthetic */ b(f f8,  a8) {
            this(f8);
        }
    }

    public static class c
    implements B5.c {
        public final Activity a;
        public final HiddenLifecycleReference b;
        public final Set c = new HashSet();
        public final Set d = new HashSet();
        public final Set e = new HashSet();
        public final Set f = new HashSet();
        public final Set g = new HashSet();
        public final Set h = new HashSet();

        public c(Activity activity, androidx.lifecycle.d d8) {
            this.a = activity;
            this.b = new HiddenLifecycleReference(d8);
        }

        public boolean a(int n8, int n9, Intent intent) {
            boolean bl;
            Iterator iterator = new HashSet((Collection)this.d).iterator();
            block0 : do {
                bl = false;
                while (iterator.hasNext()) {
                    if (!((m)iterator.next()).a(n8, n9, intent) && !bl) continue block0;
                    bl = true;
                }
                break;
            } while (true);
            return bl;
        }

        public void b(Intent intent) {
            Iterator iterator = this.e.iterator();
            while (iterator.hasNext()) {
                ((n)iterator.next()).onNewIntent(intent);
            }
        }

        @Override
        public Activity c() {
            return this.a;
        }

        @Override
        public void d(m m8) {
            this.d.remove((Object)m8);
        }

        @Override
        public void e(o o8) {
            this.c.add((Object)o8);
        }

        @Override
        public void f(o o8) {
            this.c.remove((Object)o8);
        }

        @Override
        public void g(n n8) {
            this.e.add((Object)n8);
        }

        @Override
        public void h(m m8) {
            this.d.add((Object)m8);
        }

        @Override
        public void i(n n8) {
            this.e.remove((Object)n8);
        }

        public boolean j(int n8, String[] arrstring, int[] arrn) {
            boolean bl;
            Iterator iterator = this.c.iterator();
            block0 : do {
                bl = false;
                while (iterator.hasNext()) {
                    if (!((o)iterator.next()).b(n8, arrstring, arrn) && !bl) continue block0;
                    bl = true;
                }
                break;
            } while (true);
            return bl;
        }

        public void k(Bundle bundle) {
            bundle = this.h.iterator();
            if (!bundle.hasNext()) {
                return;
            }
            android.support.v4.media.a.a(bundle.next());
            throw null;
        }

        public void l(Bundle bundle) {
            bundle = this.h.iterator();
            if (!bundle.hasNext()) {
                return;
            }
            android.support.v4.media.a.a(bundle.next());
            throw null;
        }

        public void m() {
            Iterator iterator = this.f.iterator();
            if (!iterator.hasNext()) {
                return;
            }
            android.support.v4.media.a.a(iterator.next());
            throw null;
        }
    }

}

