// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package J5;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.Map;
import s3.m;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import V2.j;
import s3.e;
import V2.k;
import android.content.Context;
import A5.a;

public class i implements a, p.b, p.a
{
    public Context a;
    public boolean b;
    
    public i() {
        this.b = false;
    }
    
    @Override
    public void a(final f f) {
        final k k = new k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new J5.d(this, k));
        this.y(k, f);
    }
    
    @Override
    public void b(final String s, final Boolean b, final f f) {
        final k k = new k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new J5.e(s, b, k));
        this.y(k, f);
    }
    
    @Override
    public void c(final f f) {
        final k k = new k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new b(this, k));
        this.y(k, f);
    }
    
    @Override
    public void d(final String s, final f f) {
        final k k = new k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new a(s, k));
        this.y(k, f);
    }
    
    @Override
    public void e(final String s, final d d, final f f) {
        final k k = new k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new J5.f(this, d, s, k));
        this.y(k, f);
    }
    
    @Override
    public void f(final String s, final Boolean b, final f f) {
        final k k = new k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new J5.c(s, b, k));
        this.y(k, f);
    }
    
    public final j o(final s3.e e) {
        final k k = new k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new h(this, e, k));
        return k.a();
    }
    
    @Override
    public void onAttachedToEngine(final b b) {
        t.e(b.b(), this);
        o.e(b.b(), this);
        this.a = b.a();
    }
    
    @Override
    public void onDetachedFromEngine(final b b) {
        this.a = null;
        t.e(b.b(), null);
        o.e(b.b(), null);
    }
    
    public final d p(final m m) {
        final d.a a = new p.d.a();
        a.b(m.b());
        a.c(m.c());
        if (m.f() != null) {
            a.e(m.f());
        }
        if (m.g() != null) {
            a.f(m.g());
        }
        a.d(m.d());
        a.g(m.h());
        a.h(m.e());
        return a.a();
    }
    
    public final void y(final k k, final f f) {
        k.a().b(new g(f));
    }
}
