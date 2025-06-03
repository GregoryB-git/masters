// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package io.flutter.embedding.engine;

import java.util.List;
import android.content.res.AssetManager;
import android.content.pm.PackageManager$NameNotFoundException;
import java.util.Iterator;
import java.util.HashSet;
import android.content.Context;
import java.util.Set;
import D5.w;
import D5.v;
import D5.u;
import D5.t;
import D5.r;
import D5.o;
import D5.s;
import D5.f;
import D5.n;
import D5.m;
import D5.l;
import D5.k;
import F5.e;
import v5.b;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import T5.g;

public class a implements g.a
{
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
    public final f l;
    public final s m;
    public final o n;
    public final r o;
    public final t p;
    public final u q;
    public final v r;
    public final w s;
    public final io.flutter.plugin.platform.r t;
    public final Set u;
    public final b v;
    
    public a(final Context context) {
        this(context, null);
    }
    
    public a(final Context context, final y5.f f, final FlutterJNI flutterJNI, final io.flutter.plugin.platform.r r, final String[] array, final boolean b) {
        this(context, f, flutterJNI, r, array, b, false);
    }
    
    public a(final Context context, final y5.f f, final FlutterJNI flutterJNI, final io.flutter.plugin.platform.r r, final String[] array, final boolean b, final boolean b2) {
        this(context, f, flutterJNI, r, array, b, b2, null);
    }
    
    public a(final Context context, y5.f d, FlutterJNI c, final io.flutter.plugin.platform.r r, final String[] array, final boolean b, final boolean b2, final io.flutter.embedding.engine.b b3) {
        this.u = new HashSet();
        this.v = (b)new b() {
            @Override
            public void a() {
            }
            
            @Override
            public void b() {
                t5.b.f("FlutterEngine", "onPreEngineRestart()");
                final Iterator<b> iterator = io.flutter.embedding.engine.a.b(io.flutter.embedding.engine.a.this).iterator();
                while (iterator.hasNext()) {
                    iterator.next().b();
                }
                io.flutter.embedding.engine.a.c(io.flutter.embedding.engine.a.this).X();
                io.flutter.embedding.engine.a.d(io.flutter.embedding.engine.a.this).g();
            }
        };
        while (true) {
            try {
                AssetManager assetManager = context.createPackageContext(context.getPackageName(), 0).getAssets();
                while (true) {
                    final t5.a e = t5.a.e();
                    FlutterJNI a = c;
                    if (c == null) {
                        a = e.d().a();
                    }
                    this.a = a;
                    c = (FlutterJNI)new w5.a(a, assetManager);
                    (this.c = (w5.a)c).n();
                    t5.a.e().a();
                    this.f = new D5.a((w5.a)c, a);
                    this.g = new D5.g((w5.a)c);
                    this.h = new k((w5.a)c);
                    final l i = new l((w5.a)c);
                    this.i = i;
                    this.j = new m((w5.a)c);
                    this.k = new n((w5.a)c);
                    this.l = new f((w5.a)c);
                    this.n = new o((w5.a)c);
                    this.o = new r((w5.a)c, context.getPackageManager());
                    this.m = new s((w5.a)c, b2);
                    this.p = new t((w5.a)c);
                    this.q = new u((w5.a)c);
                    this.r = new v((w5.a)c);
                    this.s = new w((w5.a)c);
                    final e e2 = new e(context, i);
                    this.e = e2;
                    if ((c = (FlutterJNI)d) == null) {
                        c = (FlutterJNI)e.c();
                    }
                    if (!a.isAttached()) {
                        ((y5.f)c).p(context.getApplicationContext());
                        ((y5.f)c).h(context, array);
                    }
                    a.addEngineLifecycleListener(this.v);
                    a.setPlatformViewsController(r);
                    a.setLocalizationPlugin(e2);
                    e.a();
                    a.setDeferredComponentManager(null);
                    if (!a.isAttached()) {
                        this.f();
                    }
                    this.b = new FlutterRenderer(a);
                    (this.t = r).R();
                    d = (y5.f)new v5.b(context.getApplicationContext(), this, (y5.f)c, b3);
                    this.d = (v5.b)d;
                    e2.d(context.getResources().getConfiguration());
                    if (b && ((y5.f)c).g()) {
                        C5.a.a(this);
                    }
                    T5.g.a(context, (g.a)this);
                    ((v5.b)d).c(new H5.a(this.s()));
                    return;
                    assetManager = context.getAssets();
                    continue;
                }
            }
            catch (PackageManager$NameNotFoundException ex) {}
            continue;
        }
    }
    
    public a(final Context context, final y5.f f, final FlutterJNI flutterJNI, final String[] array, final boolean b) {
        this(context, f, flutterJNI, new io.flutter.plugin.platform.r(), array, b);
    }
    
    public a(final Context context, final String[] array) {
        this(context, null, null, array, true);
    }
    
    public static /* synthetic */ Set b(final a a) {
        return a.u;
    }
    
    public static /* synthetic */ io.flutter.plugin.platform.r c(final a a) {
        return a.t;
    }
    
    public static /* synthetic */ s d(final a a) {
        return a.m;
    }
    
    public a A(final Context context, final w5.a.c c, final String s, final List list, final io.flutter.plugin.platform.r r, final boolean b, final boolean b2) {
        if (this.z()) {
            return new a(context, null, this.a.spawn(c.c, c.b, s, list), r, null, b, b2);
        }
        throw new IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
    }
    
    @Override
    public void a(final float n, final float n2, final float n3) {
        this.a.updateDisplayMetrics(0, n, n2, n3);
    }
    
    public void e(final b b) {
        this.u.add(b);
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
        final Iterator<b> iterator = this.u.iterator();
        while (iterator.hasNext()) {
            iterator.next().a();
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
    
    public f j() {
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
    
    public io.flutter.plugin.platform.r q() {
        return this.t;
    }
    
    public A5.b r() {
        return this.d;
    }
    
    public r s() {
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
    
    public interface b
    {
        void a();
        
        void b();
    }
}
