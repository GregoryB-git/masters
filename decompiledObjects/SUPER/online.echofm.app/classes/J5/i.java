package J5;

import A5.a.b;
import V2.j;
import V2.k;
import android.content.Context;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import java.util.concurrent.Executor;
import s3.m;

public class i
  implements A5.a, p.b, p.a
{
  public Context a;
  public boolean b = false;
  
  public void a(p.f paramf)
  {
    k localk = new k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new d(this, localk));
    y(localk, paramf);
  }
  
  public void b(String paramString, Boolean paramBoolean, p.f paramf)
  {
    k localk = new k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new e(paramString, paramBoolean, localk));
    y(localk, paramf);
  }
  
  public void c(p.f paramf)
  {
    k localk = new k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new b(this, localk));
    y(localk, paramf);
  }
  
  public void d(String paramString, p.f paramf)
  {
    k localk = new k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new a(paramString, localk));
    y(localk, paramf);
  }
  
  public void e(String paramString, p.d paramd, p.f paramf)
  {
    k localk = new k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new f(this, paramd, paramString, localk));
    y(localk, paramf);
  }
  
  public void f(String paramString, Boolean paramBoolean, p.f paramf)
  {
    k localk = new k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new c(paramString, paramBoolean, localk));
    y(localk, paramf);
  }
  
  public final j o(s3.e parame)
  {
    k localk = new k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new h(this, parame, localk));
    return localk.a();
  }
  
  public void onAttachedToEngine(a.b paramb)
  {
    t.e(paramb.b(), this);
    o.e(paramb.b(), this);
    a = paramb.a();
  }
  
  public void onDetachedFromEngine(a.b paramb)
  {
    a = null;
    t.e(paramb.b(), null);
    o.e(paramb.b(), null);
  }
  
  public final p.d p(m paramm)
  {
    p.d.a locala = new p.d.a();
    locala.b(paramm.b());
    locala.c(paramm.c());
    if (paramm.f() != null) {
      locala.e(paramm.f());
    }
    if (paramm.g() != null) {
      locala.f(paramm.g());
    }
    locala.d(paramm.d());
    locala.g(paramm.h());
    locala.h(paramm.e());
    return locala.a();
  }
  
  public final void y(k paramk, p.f paramf)
  {
    paramk.a().b(new g(paramf));
  }
}

/* Location:
 * Qualified Name:     J5.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */