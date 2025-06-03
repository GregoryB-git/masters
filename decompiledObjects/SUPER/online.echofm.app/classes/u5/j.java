package u5;

import D5.k;
import D5.n;
import D5.v;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.window.BackEvent;
import io.flutter.embedding.engine.b.b;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.plugin.platform.h;
import io.flutter.plugin.platform.h.d;
import io.flutter.plugin.platform.r;
import java.util.Arrays;
import java.util.List;
import v5.c;
import w5.a.c;

public class j
  implements d
{
  public c a;
  public io.flutter.embedding.engine.a b;
  public D c;
  public h d;
  public ViewTreeObserver.OnPreDrawListener e;
  public boolean f;
  public boolean g;
  public boolean h;
  public boolean i;
  public Integer j;
  public io.flutter.embedding.engine.b k;
  public final io.flutter.embedding.engine.renderer.j l = new a();
  
  public j(c paramc)
  {
    this(paramc, null);
  }
  
  public j(c paramc, io.flutter.embedding.engine.b paramb)
  {
    a = paramc;
    h = false;
    k = paramb;
  }
  
  public void A(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    l();
    if (b != null)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Forwarding onRequestPermissionsResult() to FlutterEngine:\nrequestCode: ");
      localStringBuilder.append(paramInt);
      localStringBuilder.append("\npermissions: ");
      localStringBuilder.append(Arrays.toString(paramArrayOfString));
      localStringBuilder.append("\ngrantResults: ");
      localStringBuilder.append(Arrays.toString(paramArrayOfInt));
      t5.b.f("FlutterActivityAndFragmentDelegate", localStringBuilder.toString());
      b.i().b(paramInt, paramArrayOfString, paramArrayOfInt);
    }
    else
    {
      t5.b.g("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
    }
  }
  
  public void B(Bundle paramBundle)
  {
    t5.b.f("FlutterActivityAndFragmentDelegate", "onRestoreInstanceState. Giving framework and plugins an opportunity to restore state.");
    l();
    Bundle localBundle;
    if (paramBundle != null)
    {
      localBundle = paramBundle.getBundle("plugins");
      paramBundle = paramBundle.getByteArray("framework");
    }
    else
    {
      localBundle = null;
      paramBundle = null;
    }
    if (a.r()) {
      b.u().j(paramBundle);
    }
    if (a.n()) {
      b.i().e(localBundle);
    }
  }
  
  public void C()
  {
    t5.b.f("FlutterActivityAndFragmentDelegate", "onResume()");
    l();
    if (a.p())
    {
      io.flutter.embedding.engine.a locala = b;
      if (locala != null) {
        locala.l().e();
      }
    }
  }
  
  public void D(Bundle paramBundle)
  {
    t5.b.f("FlutterActivityAndFragmentDelegate", "onSaveInstanceState. Giving framework and plugins an opportunity to save state.");
    l();
    if (a.r()) {
      paramBundle.putByteArray("framework", b.u().h());
    }
    if (a.n())
    {
      Bundle localBundle = new Bundle();
      b.i().g(localBundle);
      paramBundle.putBundle("plugins", localBundle);
    }
  }
  
  public void E()
  {
    t5.b.f("FlutterActivityAndFragmentDelegate", "onStart()");
    l();
    k();
    Integer localInteger = j;
    if (localInteger != null) {
      c.setVisibility(localInteger.intValue());
    }
  }
  
  public void F()
  {
    t5.b.f("FlutterActivityAndFragmentDelegate", "onStop()");
    l();
    if (a.p())
    {
      locala = b;
      if (locala != null) {
        locala.l().d();
      }
    }
    j = Integer.valueOf(c.getVisibility());
    c.setVisibility(8);
    io.flutter.embedding.engine.a locala = b;
    if (locala != null) {
      locala.t().j(40);
    }
  }
  
  public void G(int paramInt)
  {
    l();
    io.flutter.embedding.engine.a locala = b;
    if (locala != null)
    {
      if ((h) && (paramInt >= 10))
      {
        locala.k().m();
        b.x().a();
      }
      b.t().j(paramInt);
      b.q().Z(paramInt);
    }
  }
  
  public void H()
  {
    l();
    if (b != null)
    {
      t5.b.f("FlutterActivityAndFragmentDelegate", "Forwarding onUserLeaveHint() to FlutterEngine.");
      b.i().h();
    }
    else
    {
      t5.b.g("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
    }
  }
  
  public void I(boolean paramBoolean)
  {
    l();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Received onWindowFocusChanged: ");
    Object localObject;
    if (paramBoolean) {
      localObject = "true";
    } else {
      localObject = "false";
    }
    localStringBuilder.append((String)localObject);
    t5.b.f("FlutterActivityAndFragmentDelegate", localStringBuilder.toString());
    if (a.p())
    {
      localObject = b;
      if (localObject != null) {
        if (paramBoolean) {
          ((io.flutter.embedding.engine.a)localObject).l().a();
        } else {
          ((io.flutter.embedding.engine.a)localObject).l().f();
        }
      }
    }
  }
  
  public void J()
  {
    a = null;
    b = null;
    c = null;
    d = null;
  }
  
  public void K()
  {
    t5.b.f("FlutterActivityAndFragmentDelegate", "Setting up FlutterEngine.");
    Object localObject1 = a.q();
    Object localObject2;
    if (localObject1 != null)
    {
      localObject2 = v5.a.b().a((String)localObject1);
      b = ((io.flutter.embedding.engine.a)localObject2);
      f = true;
      if (localObject2 != null) {
        return;
      }
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '");
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append("'");
      throw new IllegalStateException(((StringBuilder)localObject2).toString());
    }
    localObject1 = a;
    localObject1 = ((c)localObject1).C(((c)localObject1).getContext());
    b = ((io.flutter.embedding.engine.a)localObject1);
    if (localObject1 != null)
    {
      f = true;
      return;
    }
    localObject1 = a.h();
    if (localObject1 != null)
    {
      localObject2 = c.b().a((String)localObject1);
      if (localObject2 == null) {}
    }
    for (localObject1 = ((io.flutter.embedding.engine.b)localObject2).a(g(new b.b(a.getContext())));; localObject1 = ((io.flutter.embedding.engine.b)localObject1).a(g(new b.b(a.getContext()).h(false).l(a.r()))))
    {
      b = ((io.flutter.embedding.engine.a)localObject1);
      f = false;
      return;
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("The requested cached FlutterEngineGroup did not exist in the FlutterEngineGroupCache: '");
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append("'");
      throw new IllegalStateException(((StringBuilder)localObject2).toString());
      t5.b.f("FlutterActivityAndFragmentDelegate", "No preferred FlutterEngine was provided. Creating a new FlutterEngine for this FlutterFragment.");
      localObject2 = k;
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = new io.flutter.embedding.engine.b(a.getContext(), a.z().b());
      }
    }
  }
  
  public void L(BackEvent paramBackEvent)
  {
    l();
    if (b != null)
    {
      t5.b.f("FlutterActivityAndFragmentDelegate", "Forwarding startBackGesture() to FlutterEngine.");
      b.j().d(paramBackEvent);
    }
    else
    {
      t5.b.g("FlutterActivityAndFragmentDelegate", "Invoked startBackGesture() before FlutterFragment was attached to an Activity.");
    }
  }
  
  public void M(BackEvent paramBackEvent)
  {
    l();
    if (b != null)
    {
      t5.b.f("FlutterActivityAndFragmentDelegate", "Forwarding updateBackGestureProgress() to FlutterEngine.");
      b.j().e(paramBackEvent);
    }
    else
    {
      t5.b.g("FlutterActivityAndFragmentDelegate", "Invoked updateBackGestureProgress() before FlutterFragment was attached to an Activity.");
    }
  }
  
  public void N()
  {
    h localh = d;
    if (localh != null) {
      localh.E();
    }
  }
  
  public void d()
  {
    if (!a.o())
    {
      a.d();
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("The internal FlutterEngine created by ");
    localStringBuilder.append(a);
    localStringBuilder.append(" has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
    throw new AssertionError(localStringBuilder.toString());
  }
  
  public final b.b g(b.b paramb)
  {
    String str1 = a.w();
    if (str1 != null)
    {
      str2 = str1;
      if (!str1.isEmpty()) {}
    }
    else
    {
      str2 = t5.a.e().c().j();
    }
    a.c localc = new a.c(str2, a.s());
    str1 = a.i();
    String str2 = str1;
    if (str1 == null)
    {
      str1 = q(a.c().getIntent());
      str2 = str1;
      if (str1 == null) {
        str2 = "/";
      }
    }
    return paramb.i(localc).k(str2).j(a.m());
  }
  
  public void h()
  {
    l();
    if (b != null)
    {
      t5.b.f("FlutterActivityAndFragmentDelegate", "Forwarding cancelBackGesture() to FlutterEngine.");
      b.j().b();
    }
    else
    {
      t5.b.g("FlutterActivityAndFragmentDelegate", "Invoked cancelBackGesture() before FlutterFragment was attached to an Activity.");
    }
  }
  
  public void i()
  {
    l();
    if (b != null)
    {
      t5.b.f("FlutterActivityAndFragmentDelegate", "Forwarding commitBackGesture() to FlutterEngine.");
      b.j().c();
    }
    else
    {
      t5.b.g("FlutterActivityAndFragmentDelegate", "Invoked commitBackGesture() before FlutterFragment was attached to an Activity.");
    }
  }
  
  public final void j(final D paramD)
  {
    if (a.A() == O.o)
    {
      if (e != null) {
        paramD.getViewTreeObserver().removeOnPreDrawListener(e);
      }
      e = new b(paramD);
      paramD.getViewTreeObserver().addOnPreDrawListener(e);
      return;
    }
    throw new IllegalArgumentException("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
  }
  
  public final void k()
  {
    if (a.q() != null) {
      return;
    }
    if (b.k().l()) {
      return;
    }
    Object localObject1 = a.i();
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject1 = q(a.c().getIntent());
      localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = "/";
      }
    }
    String str = a.u();
    localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append("Executing Dart entrypoint: ");
    ((StringBuilder)localObject1).append(a.s());
    ((StringBuilder)localObject1).append(", library uri: ");
    ((StringBuilder)localObject1).append(str);
    if (((StringBuilder)localObject1).toString() == null)
    {
      localObject1 = "\"\"";
    }
    else
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append(str);
      ((StringBuilder)localObject1).append(", and sending initial route: ");
      ((StringBuilder)localObject1).append((String)localObject2);
      localObject1 = ((StringBuilder)localObject1).toString();
    }
    t5.b.f("FlutterActivityAndFragmentDelegate", (String)localObject1);
    b.o().c((String)localObject2);
    localObject1 = a.w();
    if (localObject1 != null)
    {
      localObject2 = localObject1;
      if (!((String)localObject1).isEmpty()) {}
    }
    else
    {
      localObject2 = t5.a.e().c().j();
    }
    if (str == null) {
      localObject2 = new a.c((String)localObject2, a.s());
    } else {
      localObject2 = new a.c((String)localObject2, str, a.s());
    }
    b.k().k((a.c)localObject2, a.m());
  }
  
  public final void l()
  {
    if (a != null) {
      return;
    }
    throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
  }
  
  public Activity m()
  {
    Activity localActivity = a.c();
    if (localActivity != null) {
      return localActivity;
    }
    throw new AssertionError("FlutterActivityAndFragmentDelegate's getAppComponent should only be queried after onAttach, when the host's activity should always be non-null");
  }
  
  public io.flutter.embedding.engine.a n()
  {
    return b;
  }
  
  public boolean o()
  {
    return i;
  }
  
  public boolean p()
  {
    return f;
  }
  
  public final String q(Intent paramIntent)
  {
    if (a.y())
    {
      paramIntent = paramIntent.getData();
      if (paramIntent != null) {
        return paramIntent.toString();
      }
    }
    return null;
  }
  
  public void r(int paramInt1, int paramInt2, Intent paramIntent)
  {
    l();
    if (b != null)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Forwarding onActivityResult() to FlutterEngine:\nrequestCode: ");
      localStringBuilder.append(paramInt1);
      localStringBuilder.append("\nresultCode: ");
      localStringBuilder.append(paramInt2);
      localStringBuilder.append("\ndata: ");
      localStringBuilder.append(paramIntent);
      t5.b.f("FlutterActivityAndFragmentDelegate", localStringBuilder.toString());
      b.i().a(paramInt1, paramInt2, paramIntent);
    }
    else
    {
      t5.b.g("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
    }
  }
  
  public void s(Context paramContext)
  {
    l();
    if (b == null) {
      K();
    }
    if (a.n())
    {
      t5.b.f("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to the Activity that owns this delegate.");
      b.i().i(this, a.g());
    }
    paramContext = a;
    d = paramContext.v(paramContext.c(), b);
    a.E(b);
    i = true;
  }
  
  public void t()
  {
    l();
    if (b != null)
    {
      t5.b.f("FlutterActivityAndFragmentDelegate", "Forwarding onBackPressed() to FlutterEngine.");
      b.o().a();
    }
    else
    {
      t5.b.g("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
    }
  }
  
  public View u(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle, int paramInt, boolean paramBoolean)
  {
    t5.b.f("FlutterActivityAndFragmentDelegate", "Creating FlutterView.");
    l();
    paramLayoutInflater = a.A();
    paramViewGroup = O.o;
    boolean bool1 = false;
    boolean bool2 = false;
    if (paramLayoutInflater == paramViewGroup)
    {
      paramLayoutInflater = a.getContext();
      if (a.D() == P.p) {
        bool2 = true;
      }
      paramLayoutInflater = new s(paramLayoutInflater, bool2);
      a.l(paramLayoutInflater);
    }
    for (paramLayoutInflater = new D(a.getContext(), paramLayoutInflater);; paramLayoutInflater = new D(a.getContext(), paramLayoutInflater))
    {
      c = paramLayoutInflater;
      break;
      paramLayoutInflater = new t(a.getContext());
      bool2 = bool1;
      if (a.D() == P.o) {
        bool2 = true;
      }
      paramLayoutInflater.setOpaque(bool2);
      a.x(paramLayoutInflater);
    }
    c.l(l);
    if (a.B())
    {
      t5.b.f("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to FlutterView.");
      c.n(b);
    }
    c.setId(paramInt);
    if (paramBoolean) {
      j(c);
    }
    return c;
  }
  
  public void v()
  {
    t5.b.f("FlutterActivityAndFragmentDelegate", "onDestroyView()");
    l();
    if (e != null)
    {
      c.getViewTreeObserver().removeOnPreDrawListener(e);
      e = null;
    }
    D localD = c;
    if (localD != null)
    {
      localD.s();
      c.y(l);
    }
  }
  
  public void w()
  {
    if (!i) {
      return;
    }
    t5.b.f("FlutterActivityAndFragmentDelegate", "onDetach()");
    l();
    a.t(b);
    if (a.n())
    {
      t5.b.f("FlutterActivityAndFragmentDelegate", "Detaching FlutterEngine from the Activity that owns this Fragment.");
      if (a.c().isChangingConfigurations()) {
        b.i().d();
      } else {
        b.i().f();
      }
    }
    Object localObject = d;
    if (localObject != null)
    {
      ((h)localObject).q();
      d = null;
    }
    if (a.p())
    {
      localObject = b;
      if (localObject != null) {
        ((io.flutter.embedding.engine.a)localObject).l().b();
      }
    }
    if (a.o())
    {
      b.g();
      if (a.q() != null) {
        v5.a.b().d(a.q());
      }
      b = null;
    }
    i = false;
  }
  
  public void x(Intent paramIntent)
  {
    l();
    if (b != null)
    {
      t5.b.f("FlutterActivityAndFragmentDelegate", "Forwarding onNewIntent() to FlutterEngine and sending pushRouteInformation message.");
      b.i().onNewIntent(paramIntent);
      paramIntent = q(paramIntent);
      if ((paramIntent != null) && (!paramIntent.isEmpty())) {
        b.o().b(paramIntent);
      }
    }
    else
    {
      t5.b.g("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
    }
  }
  
  public void y()
  {
    t5.b.f("FlutterActivityAndFragmentDelegate", "onPause()");
    l();
    if (a.p())
    {
      io.flutter.embedding.engine.a locala = b;
      if (locala != null) {
        locala.l().c();
      }
    }
  }
  
  public void z()
  {
    t5.b.f("FlutterActivityAndFragmentDelegate", "onPostResume()");
    l();
    if (b != null)
    {
      N();
      b.q().Y();
    }
    else
    {
      t5.b.g("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
    }
  }
  
  public class a
    implements io.flutter.embedding.engine.renderer.j
  {
    public a() {}
    
    public void b()
    {
      j.a(j.this).b();
      j.c(j.this, false);
    }
    
    public void e()
    {
      j.a(j.this).e();
      j.c(j.this, true);
      j.f(j.this, true);
    }
  }
  
  public class b
    implements ViewTreeObserver.OnPreDrawListener
  {
    public b(D paramD) {}
    
    public boolean onPreDraw()
    {
      if ((j.b(j.this)) && (e != null))
      {
        paramD.getViewTreeObserver().removeOnPreDrawListener(this);
        e = null;
      }
      return j.b(j.this);
    }
  }
  
  public static abstract interface c
    extends h.d
  {
    public abstract O A();
    
    public abstract boolean B();
    
    public abstract io.flutter.embedding.engine.a C(Context paramContext);
    
    public abstract P D();
    
    public abstract void E(io.flutter.embedding.engine.a parama);
    
    public abstract void b();
    
    public abstract Activity c();
    
    public abstract void d();
    
    public abstract void e();
    
    public abstract androidx.lifecycle.d g();
    
    public abstract Context getContext();
    
    public abstract String h();
    
    public abstract String i();
    
    public abstract void l(s params);
    
    public abstract List m();
    
    public abstract boolean n();
    
    public abstract boolean o();
    
    public abstract boolean p();
    
    public abstract String q();
    
    public abstract boolean r();
    
    public abstract String s();
    
    public abstract void t(io.flutter.embedding.engine.a parama);
    
    public abstract String u();
    
    public abstract h v(Activity paramActivity, io.flutter.embedding.engine.a parama);
    
    public abstract String w();
    
    public abstract void x(t paramt);
    
    public abstract boolean y();
    
    public abstract v5.j z();
  }
}

/* Location:
 * Qualified Name:     u5.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */