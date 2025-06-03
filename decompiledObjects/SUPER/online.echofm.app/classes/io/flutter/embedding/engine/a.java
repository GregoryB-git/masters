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
import T5.g.a;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.AssetManager;
import android.content.res.Resources;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import w5.a.c;

public class a
  implements g.a
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
  public final D5.f l;
  public final s m;
  public final o n;
  public final D5.r o;
  public final t p;
  public final u q;
  public final v r;
  public final w s;
  public final io.flutter.plugin.platform.r t;
  public final Set u = new HashSet();
  public final b v = new a();
  
  public a(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public a(Context paramContext, y5.f paramf, FlutterJNI paramFlutterJNI, io.flutter.plugin.platform.r paramr, String[] paramArrayOfString, boolean paramBoolean)
  {
    this(paramContext, paramf, paramFlutterJNI, paramr, paramArrayOfString, paramBoolean, false);
  }
  
  public a(Context paramContext, y5.f paramf, FlutterJNI paramFlutterJNI, io.flutter.plugin.platform.r paramr, String[] paramArrayOfString, boolean paramBoolean1, boolean paramBoolean2)
  {
    this(paramContext, paramf, paramFlutterJNI, paramr, paramArrayOfString, paramBoolean1, paramBoolean2, null);
  }
  
  public a(Context paramContext, y5.f paramf, FlutterJNI paramFlutterJNI, io.flutter.plugin.platform.r paramr, String[] paramArrayOfString, boolean paramBoolean1, boolean paramBoolean2, b paramb)
  {
    try
    {
      localObject = paramContext.createPackageContext(paramContext.getPackageName(), 0).getAssets();
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      localObject = paramContext.getAssets();
    }
    t5.a locala = t5.a.e();
    FlutterJNI localFlutterJNI = paramFlutterJNI;
    if (paramFlutterJNI == null) {
      localFlutterJNI = locala.d().a();
    }
    a = localFlutterJNI;
    paramFlutterJNI = new w5.a(localFlutterJNI, (AssetManager)localObject);
    c = paramFlutterJNI;
    paramFlutterJNI.n();
    t5.a.e().a();
    f = new D5.a(paramFlutterJNI, localFlutterJNI);
    g = new D5.g(paramFlutterJNI);
    h = new k(paramFlutterJNI);
    Object localObject = new l(paramFlutterJNI);
    i = ((l)localObject);
    j = new m(paramFlutterJNI);
    k = new n(paramFlutterJNI);
    l = new D5.f(paramFlutterJNI);
    n = new o(paramFlutterJNI);
    o = new D5.r(paramFlutterJNI, paramContext.getPackageManager());
    m = new s(paramFlutterJNI, paramBoolean2);
    p = new t(paramFlutterJNI);
    q = new u(paramFlutterJNI);
    r = new v(paramFlutterJNI);
    s = new w(paramFlutterJNI);
    localObject = new e(paramContext, (l)localObject);
    e = ((e)localObject);
    paramFlutterJNI = paramf;
    if (paramf == null) {
      paramFlutterJNI = locala.c();
    }
    if (!localFlutterJNI.isAttached())
    {
      paramFlutterJNI.p(paramContext.getApplicationContext());
      paramFlutterJNI.h(paramContext, paramArrayOfString);
    }
    localFlutterJNI.addEngineLifecycleListener(v);
    localFlutterJNI.setPlatformViewsController(paramr);
    localFlutterJNI.setLocalizationPlugin((e)localObject);
    locala.a();
    localFlutterJNI.setDeferredComponentManager(null);
    if (!localFlutterJNI.isAttached()) {
      f();
    }
    b = new FlutterRenderer(localFlutterJNI);
    t = paramr;
    paramr.R();
    paramf = new v5.b(paramContext.getApplicationContext(), this, paramFlutterJNI, paramb);
    d = paramf;
    ((e)localObject).d(paramContext.getResources().getConfiguration());
    if ((paramBoolean1) && (paramFlutterJNI.g())) {
      C5.a.a(this);
    }
    T5.g.a(paramContext, this);
    paramf.c(new H5.a(s()));
  }
  
  public a(Context paramContext, y5.f paramf, FlutterJNI paramFlutterJNI, String[] paramArrayOfString, boolean paramBoolean)
  {
    this(paramContext, paramf, paramFlutterJNI, new io.flutter.plugin.platform.r(), paramArrayOfString, paramBoolean);
  }
  
  public a(Context paramContext, String[] paramArrayOfString)
  {
    this(paramContext, null, null, paramArrayOfString, true);
  }
  
  public a A(Context paramContext, a.c paramc, String paramString, List paramList, io.flutter.plugin.platform.r paramr, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (z()) {
      return new a(paramContext, null, a.spawn(c, b, paramString, paramList), paramr, null, paramBoolean1, paramBoolean2);
    }
    throw new IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
  }
  
  public void a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    a.updateDisplayMetrics(0, paramFloat1, paramFloat2, paramFloat3);
  }
  
  public void e(b paramb)
  {
    u.add(paramb);
  }
  
  public final void f()
  {
    t5.b.f("FlutterEngine", "Attaching to JNI.");
    a.attachToNative();
    if (z()) {
      return;
    }
    throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
  }
  
  public void g()
  {
    t5.b.f("FlutterEngine", "Destroying.");
    Iterator localIterator = u.iterator();
    while (localIterator.hasNext()) {
      ((b)localIterator.next()).a();
    }
    d.k();
    t.T();
    c.o();
    a.removeEngineLifecycleListener(v);
    a.setDeferredComponentManager(null);
    a.detachFromNativeAndReleaseResources();
    t5.a.e().a();
  }
  
  public D5.a h()
  {
    return f;
  }
  
  public B5.b i()
  {
    return d;
  }
  
  public D5.f j()
  {
    return l;
  }
  
  public w5.a k()
  {
    return c;
  }
  
  public k l()
  {
    return h;
  }
  
  public e m()
  {
    return e;
  }
  
  public m n()
  {
    return j;
  }
  
  public n o()
  {
    return k;
  }
  
  public o p()
  {
    return n;
  }
  
  public io.flutter.plugin.platform.r q()
  {
    return t;
  }
  
  public A5.b r()
  {
    return d;
  }
  
  public D5.r s()
  {
    return o;
  }
  
  public FlutterRenderer t()
  {
    return b;
  }
  
  public s u()
  {
    return m;
  }
  
  public t v()
  {
    return p;
  }
  
  public u w()
  {
    return q;
  }
  
  public v x()
  {
    return r;
  }
  
  public w y()
  {
    return s;
  }
  
  public final boolean z()
  {
    return a.isAttached();
  }
  
  public class a
    implements a.b
  {
    public a() {}
    
    public void a() {}
    
    public void b()
    {
      t5.b.f("FlutterEngine", "onPreEngineRestart()");
      Iterator localIterator = a.b(a.this).iterator();
      while (localIterator.hasNext()) {
        ((a.b)localIterator.next()).b();
      }
      a.c(a.this).X();
      a.d(a.this).g();
    }
  }
  
  public static abstract interface b
  {
    public abstract void a();
    
    public abstract void b();
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */