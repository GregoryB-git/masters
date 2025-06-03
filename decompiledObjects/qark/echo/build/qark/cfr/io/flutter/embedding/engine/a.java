/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.AssetManager
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Set
 */
package io.flutter.embedding.engine;

import D5.k;
import D5.l;
import D5.m;
import D5.n;
import D5.o;
import D5.s;
import D5.t;
import D5.u;
import D5.v;
import D5.w;
import F5.e;
import T5.g;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.plugin.platform.r;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import w5.a;
import y5.f;

public class a
implements g.a {
    public final FlutterJNI a;
    public final FlutterRenderer b;
    public final w5.a c;
    public final v5.b d;
    public final e e;
    public final D5.a f;
    public final D5.g g;
    public final k h;
    public final l i;
    public final m j;
    public final n k;
    public final D5.f l;
    public final s m;
    public final o n;
    public final D5.r o;
    public final t p;
    public final u q;
    public final v r;
    public final w s;
    public final r t;
    public final Set u;
    public final b v;

    public a(Context context) {
        this(context, null);
    }

    public a(Context context, f f8, FlutterJNI flutterJNI, r r8, String[] arrstring, boolean bl) {
        this(context, f8, flutterJNI, r8, arrstring, bl, false);
    }

    public a(Context context, f f8, FlutterJNI flutterJNI, r r8, String[] arrstring, boolean bl, boolean bl2) {
        this(context, f8, flutterJNI, r8, arrstring, bl, bl2, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public a(Context context, f object, FlutterJNI object2, r r8, String[] arrstring, boolean bl, boolean bl2, io.flutter.embedding.engine.b b8) {
        Object object3;
        block7 : {
            this.u = new HashSet();
            this.v = new b(){

                @Override
                public void a() {
                }

                @Override
                public void b() {
                    t5.b.f("FlutterEngine", "onPreEngineRestart()");
                    Iterator iterator = a.this.u.iterator();
                    while (iterator.hasNext()) {
                        ((b)iterator.next()).b();
                    }
                    a.this.t.X();
                    a.this.m.g();
                }
            };
            try {
                object3 = context.createPackageContext(context.getPackageName(), 0).getAssets();
                break block7;
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {}
            object3 = context.getAssets();
        }
        t5.a a8 = t5.a.e();
        Object object4 = object2;
        if (object2 == null) {
            object4 = a8.d().a();
        }
        this.a = object4;
        this.c = object2 = new w5.a((FlutterJNI)object4, (AssetManager)object3);
        object2.n();
        t5.a.e().a();
        this.f = new D5.a((w5.a)object2, (FlutterJNI)object4);
        this.g = new D5.g((w5.a)object2);
        this.h = new k((w5.a)object2);
        this.i = object3 = new l((w5.a)object2);
        this.j = new m((w5.a)object2);
        this.k = new n((w5.a)object2);
        this.l = new D5.f((w5.a)object2);
        this.n = new o((w5.a)object2);
        this.o = new D5.r((w5.a)object2, context.getPackageManager());
        this.m = new s((w5.a)object2, bl2);
        this.p = new t((w5.a)object2);
        this.q = new u((w5.a)object2);
        this.r = new v((w5.a)object2);
        this.s = new w((w5.a)object2);
        this.e = object3 = new e(context, (l)object3);
        object2 = object;
        if (object == null) {
            object2 = a8.c();
        }
        if (!object4.isAttached()) {
            object2.p(context.getApplicationContext());
            object2.h(context, arrstring);
        }
        object4.addEngineLifecycleListener(this.v);
        object4.setPlatformViewsController(r8);
        object4.setLocalizationPlugin((e)object3);
        a8.a();
        object4.setDeferredComponentManager(null);
        if (!object4.isAttached()) {
            this.f();
        }
        this.b = new FlutterRenderer((FlutterJNI)object4);
        this.t = r8;
        r8.R();
        this.d = object = new v5.b(context.getApplicationContext(), this, (f)object2, b8);
        object3.d(context.getResources().getConfiguration());
        if (bl && object2.g()) {
            C5.a.a(this);
        }
        g.a(context, this);
        object.c(new H5.a(this.s()));
    }

    public a(Context context, f f8, FlutterJNI flutterJNI, String[] arrstring, boolean bl) {
        this(context, f8, flutterJNI, new r(), arrstring, bl);
    }

    public a(Context context, String[] arrstring) {
        this(context, null, null, arrstring, true);
    }

    public a A(Context context, a.c c8, String string2, List list, r r8, boolean bl, boolean bl2) {
        if (this.z()) {
            return new a(context, null, this.a.spawn(c8.c, c8.b, string2, list), r8, null, bl, bl2);
        }
        throw new IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
    }

    @Override
    public void a(float f8, float f9, float f10) {
        this.a.updateDisplayMetrics(0, f8, f9, f10);
    }

    public void e(b b8) {
        this.u.add((Object)b8);
    }

    public final void f() {
        t5.b.f("FlutterEngine", "Attaching to JNI.");
        this.a.attachToNative();
        if (this.z()) {
            return;
        }
        throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
    }

    public void g() {
        t5.b.f("FlutterEngine", "Destroying.");
        Iterator iterator = this.u.iterator();
        while (iterator.hasNext()) {
            ((b)iterator.next()).a();
        }
        this.d.k();
        this.t.T();
        this.c.o();
        this.a.removeEngineLifecycleListener(this.v);
        this.a.setDeferredComponentManager(null);
        this.a.detachFromNativeAndReleaseResources();
        t5.a.e().a();
    }

    public D5.a h() {
        return this.f;
    }

    public B5.b i() {
        return this.d;
    }

    public D5.f j() {
        return this.l;
    }

    public w5.a k() {
        return this.c;
    }

    public k l() {
        return this.h;
    }

    public e m() {
        return this.e;
    }

    public m n() {
        return this.j;
    }

    public n o() {
        return this.k;
    }

    public o p() {
        return this.n;
    }

    public r q() {
        return this.t;
    }

    public A5.b r() {
        return this.d;
    }

    public D5.r s() {
        return this.o;
    }

    public FlutterRenderer t() {
        return this.b;
    }

    public s u() {
        return this.m;
    }

    public t v() {
        return this.p;
    }

    public u w() {
        return this.q;
    }

    public v x() {
        return this.r;
    }

    public w y() {
        return this.s;
    }

    public final boolean z() {
        return this.a.isAttached();
    }

    public static interface b {
        public void a();

        public void b();
    }

}

