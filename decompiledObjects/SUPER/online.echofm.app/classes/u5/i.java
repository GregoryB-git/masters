package u5;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.drawable.ColorDrawable;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import androidx.lifecycle.d;
import androidx.lifecycle.d.b;
import java.util.List;
import t5.b;

public abstract class i
  extends Activity
  implements j.c, androidx.lifecycle.h
{
  public static final int s = ;
  public boolean o = false;
  public j p;
  public androidx.lifecycle.i q;
  public final OnBackInvokedCallback r;
  
  public i()
  {
    OnBackInvokedCallback localOnBackInvokedCallback;
    if (Build.VERSION.SDK_INT < 33) {
      localOnBackInvokedCallback = null;
    } else {
      localOnBackInvokedCallback = K();
    }
    r = localOnBackInvokedCallback;
    q = new androidx.lifecycle.i(this);
  }
  
  public O A()
  {
    O localO;
    if (L() == k.o) {
      localO = O.o;
    } else {
      localO = O.p;
    }
    return localO;
  }
  
  public boolean B()
  {
    return true;
  }
  
  public P D()
  {
    P localP;
    if (L() == k.o) {
      localP = P.o;
    } else {
      localP = P.p;
    }
    return localP;
  }
  
  public void E(io.flutter.embedding.engine.a parama)
  {
    if (p.p()) {
      return;
    }
    C5.a.a(parama);
  }
  
  public void F()
  {
    if (S("cancelBackGesture")) {
      p.h();
    }
  }
  
  public void G()
  {
    if (S("commitBackGesture")) {
      p.i();
    }
  }
  
  public final void H()
  {
    Window localWindow = getWindow();
    localWindow.addFlags(Integer.MIN_VALUE);
    localWindow.setStatusBarColor(1073741824);
    localWindow.getDecorView().setSystemUiVisibility(1280);
  }
  
  public final void I()
  {
    if (L() == k.p) {
      getWindow().setBackgroundDrawable(new ColorDrawable(0));
    }
  }
  
  public final View J()
  {
    j localj = p;
    int i = s;
    if (A() == O.o) {}
    for (boolean bool = true;; bool = false) {
      break;
    }
    return localj.u(null, null, null, i, bool);
  }
  
  public final OnBackInvokedCallback K()
  {
    if (Build.VERSION.SDK_INT >= 34) {
      return new a();
    }
    return new h(this);
  }
  
  public k L()
  {
    if (getIntent().hasExtra("background_mode")) {
      return k.valueOf(getIntent().getStringExtra("background_mode"));
    }
    return k.o;
  }
  
  public io.flutter.embedding.engine.a M()
  {
    return p.n();
  }
  
  public Bundle N()
  {
    return getPackageManagergetActivityInfogetComponentName128metaData;
  }
  
  public final boolean O()
  {
    boolean bool;
    if ((getApplicationInfoflags & 0x2) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void P()
  {
    if (Build.VERSION.SDK_INT >= 33)
    {
      g.a(e.a(this), 0, r);
      o = true;
    }
  }
  
  public void Q()
  {
    U();
    j localj = p;
    if (localj != null)
    {
      localj.J();
      p = null;
    }
  }
  
  public void R(BackEvent paramBackEvent)
  {
    if (S("startBackGesture")) {
      p.L(paramBackEvent);
    }
  }
  
  public final boolean S(String paramString)
  {
    Object localObject = p;
    if (localObject == null)
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("FlutterActivity ");
      ((StringBuilder)localObject).append(hashCode());
      ((StringBuilder)localObject).append(" ");
      ((StringBuilder)localObject).append(paramString);
    }
    for (paramString = " called after release.";; paramString = " called after detach.")
    {
      ((StringBuilder)localObject).append(paramString);
      b.g("FlutterActivity", ((StringBuilder)localObject).toString());
      return false;
      if (((j)localObject).o()) {
        break;
      }
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("FlutterActivity ");
      ((StringBuilder)localObject).append(hashCode());
      ((StringBuilder)localObject).append(" ");
      ((StringBuilder)localObject).append(paramString);
    }
    return true;
  }
  
  public final void T()
  {
    try
    {
      Bundle localBundle = N();
      if (localBundle != null)
      {
        int i = localBundle.getInt("io.flutter.embedding.android.NormalTheme", -1);
        if (i != -1) {
          setTheme(i);
        }
      }
      else
      {
        b.f("FlutterActivity", "Using the launch theme as normal theme.");
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      b.b("FlutterActivity", "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
    }
  }
  
  public void U()
  {
    if (Build.VERSION.SDK_INT >= 33)
    {
      f.a(e.a(this), r);
      o = false;
    }
  }
  
  public void V(BackEvent paramBackEvent)
  {
    if (S("updateBackGestureProgress")) {
      p.M(paramBackEvent);
    }
  }
  
  public boolean a()
  {
    return false;
  }
  
  public void b() {}
  
  public Activity c()
  {
    return this;
  }
  
  public void d()
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("FlutterActivity ");
    ((StringBuilder)localObject).append(this);
    ((StringBuilder)localObject).append(" connection to the engine ");
    ((StringBuilder)localObject).append(M());
    ((StringBuilder)localObject).append(" evicted by another attaching activity");
    b.g("FlutterActivity", ((StringBuilder)localObject).toString());
    localObject = p;
    if (localObject != null)
    {
      ((j)localObject).v();
      p.w();
    }
  }
  
  public void e()
  {
    if (Build.VERSION.SDK_INT >= 29) {
      reportFullyDrawn();
    }
  }
  
  public void f(boolean paramBoolean)
  {
    if ((paramBoolean) && (!o)) {
      P();
    } else if ((!paramBoolean) && (o)) {
      U();
    }
  }
  
  public d g()
  {
    return q;
  }
  
  public Context getContext()
  {
    return this;
  }
  
  public String h()
  {
    return getIntent().getStringExtra("cached_engine_group_id");
  }
  
  public String i()
  {
    if (getIntent().hasExtra("route")) {
      return getIntent().getStringExtra("route");
    }
    localObject1 = null;
    try
    {
      Bundle localBundle = N();
      localObject2 = localObject1;
      if (localBundle != null) {
        localObject2 = localBundle.getString("io.flutter.InitialRoute");
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        Object localObject2;
        Object localObject3 = localObject1;
      }
    }
    return (String)localObject2;
  }
  
  public void l(s params) {}
  
  public List m()
  {
    return (List)getIntent().getSerializableExtra("dart_entrypoint_args");
  }
  
  public boolean n()
  {
    return true;
  }
  
  public boolean o()
  {
    boolean bool1 = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
    boolean bool2 = bool1;
    if (q() == null) {
      if (p.p()) {
        bool2 = bool1;
      } else {
        bool2 = getIntent().getBooleanExtra("destroy_engine_with_activity", true);
      }
    }
    return bool2;
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (S("onActivityResult")) {
      p.r(paramInt1, paramInt2, paramIntent);
    }
  }
  
  public void onBackPressed()
  {
    if (S("onBackPressed")) {
      p.t();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    T();
    super.onCreate(paramBundle);
    j localj = new j(this);
    p = localj;
    localj.s(this);
    p.B(paramBundle);
    q.h(d.b.ON_CREATE);
    I();
    setContentView(J());
    H();
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    if (S("onDestroy"))
    {
      p.v();
      p.w();
    }
    Q();
    q.h(d.b.ON_DESTROY);
  }
  
  public void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    if (S("onNewIntent")) {
      p.x(paramIntent);
    }
  }
  
  public void onPause()
  {
    super.onPause();
    if (S("onPause")) {
      p.y();
    }
    q.h(d.b.ON_PAUSE);
  }
  
  public void onPostResume()
  {
    super.onPostResume();
    if (S("onPostResume")) {
      p.z();
    }
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    if (S("onRequestPermissionsResult")) {
      p.A(paramInt, paramArrayOfString, paramArrayOfInt);
    }
  }
  
  public void onResume()
  {
    super.onResume();
    q.h(d.b.ON_RESUME);
    if (S("onResume")) {
      p.C();
    }
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    if (S("onSaveInstanceState")) {
      p.D(paramBundle);
    }
  }
  
  public void onStart()
  {
    super.onStart();
    q.h(d.b.ON_START);
    if (S("onStart")) {
      p.E();
    }
  }
  
  public void onStop()
  {
    super.onStop();
    if (S("onStop")) {
      p.F();
    }
    q.h(d.b.ON_STOP);
  }
  
  public void onTrimMemory(int paramInt)
  {
    super.onTrimMemory(paramInt);
    if (S("onTrimMemory")) {
      p.G(paramInt);
    }
  }
  
  public void onUserLeaveHint()
  {
    if (S("onUserLeaveHint")) {
      p.H();
    }
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    if (S("onWindowFocusChanged")) {
      p.I(paramBoolean);
    }
  }
  
  public boolean p()
  {
    return true;
  }
  
  public String q()
  {
    return getIntent().getStringExtra("cached_engine_id");
  }
  
  public boolean r()
  {
    if (getIntent().hasExtra("enable_state_restoration")) {
      return getIntent().getBooleanExtra("enable_state_restoration", false);
    }
    return q() == null;
  }
  
  public String s()
  {
    Object localObject1 = "main";
    if (getIntent().hasExtra("dart_entrypoint")) {
      return getIntent().getStringExtra("dart_entrypoint");
    }
    try
    {
      Object localObject2 = N();
      if (localObject2 != null) {
        localObject2 = ((BaseBundle)localObject2).getString("io.flutter.Entrypoint");
      } else {
        localObject2 = null;
      }
      if (localObject2 != null) {
        localObject1 = localObject2;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;) {}
    }
    return (String)localObject1;
  }
  
  public void t(io.flutter.embedding.engine.a parama) {}
  
  public String u()
  {
    localObject1 = null;
    try
    {
      Bundle localBundle = N();
      localObject2 = localObject1;
      if (localBundle != null) {
        localObject2 = localBundle.getString("io.flutter.EntrypointUri");
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        Object localObject2;
        Object localObject3 = localObject1;
      }
    }
    return (String)localObject2;
  }
  
  public io.flutter.plugin.platform.h v(Activity paramActivity, io.flutter.embedding.engine.a parama)
  {
    return new io.flutter.plugin.platform.h(c(), parama.p(), this);
  }
  
  public String w()
  {
    if ((O()) && ("android.intent.action.RUN".equals(getIntent().getAction())))
    {
      String str = getIntent().getDataString();
      if (str != null) {
        return str;
      }
    }
    return null;
  }
  
  public void x(t paramt) {}
  
  public boolean y()
  {
    bool1 = false;
    try
    {
      Bundle localBundle = N();
      bool2 = bool1;
      if (localBundle != null) {
        bool2 = localBundle.getBoolean("flutter_deeplinking_enabled");
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        boolean bool2 = bool1;
      }
    }
    return bool2;
  }
  
  public v5.j z()
  {
    return v5.j.a(getIntent());
  }
  
  public class a
    implements OnBackAnimationCallback
  {
    public a() {}
    
    public void onBackCancelled()
    {
      F();
    }
    
    public void onBackInvoked()
    {
      G();
    }
    
    public void onBackProgressed(BackEvent paramBackEvent)
    {
      V(paramBackEvent);
    }
    
    public void onBackStarted(BackEvent paramBackEvent)
    {
      R(paramBackEvent);
    }
  }
}

/* Location:
 * Qualified Name:     u5.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */