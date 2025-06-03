package androidx.fragment.app;

import Y.a;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.c;
import androidx.activity.result.ActivityResultRegistry;
import androidx.lifecycle.d.b;
import androidx.lifecycle.d.c;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistry.b;
import c.b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Iterator;
import w.a.e;

public abstract class e
  extends ComponentActivity
  implements a.e
{
  public boolean A;
  public boolean B;
  public boolean C = true;
  public final i y = i.b(new c());
  public final androidx.lifecycle.i z = new androidx.lifecycle.i(this);
  
  public e()
  {
    o();
  }
  
  public static boolean q(n paramn, d.c paramc)
  {
    Iterator localIterator = paramn.r0().iterator();
    boolean bool1 = false;
    while (localIterator.hasNext())
    {
      Fragment localFragment = (Fragment)localIterator.next();
      if (localFragment != null)
      {
        boolean bool2 = bool1;
        if (localFragment.z() != null) {
          bool2 = bool1 | q(localFragment.s(), paramc);
        }
        paramn = h0;
        bool1 = bool2;
        if (paramn != null)
        {
          bool1 = bool2;
          if (paramn.g().b().c(d.c.r))
          {
            h0.f(paramc);
            bool1 = true;
          }
        }
        if (g0.b().c(d.c.r))
        {
          g0.o(paramc);
          bool1 = true;
        }
      }
    }
    return bool1;
  }
  
  public final void a(int paramInt) {}
  
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    super.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("Local FragmentActivity ");
    paramPrintWriter.print(Integer.toHexString(System.identityHashCode(this)));
    paramPrintWriter.println(" State:");
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(paramString);
    ((StringBuilder)localObject).append("  ");
    localObject = ((StringBuilder)localObject).toString();
    paramPrintWriter.print((String)localObject);
    paramPrintWriter.print("mCreated=");
    paramPrintWriter.print(A);
    paramPrintWriter.print(" mResumed=");
    paramPrintWriter.print(B);
    paramPrintWriter.print(" mStopped=");
    paramPrintWriter.print(C);
    if (getApplication() != null) {
      a.b(this).a((String)localObject, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
    y.t().W(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
  }
  
  public final View m(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    return y.v(paramView, paramString, paramContext, paramAttributeSet);
  }
  
  public n n()
  {
    return y.t();
  }
  
  public final void o()
  {
    k().d("android:support:fragments", new a());
    f(new b());
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    y.u();
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    y.u();
    y.d(paramConfiguration);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    z.h(d.b.ON_CREATE);
    y.f();
  }
  
  public boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
  {
    if (paramInt == 0) {
      return super.onCreatePanelMenu(paramInt, paramMenu) | y.g(paramMenu, getMenuInflater());
    }
    return super.onCreatePanelMenu(paramInt, paramMenu);
  }
  
  public View onCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    View localView = m(paramView, paramString, paramContext, paramAttributeSet);
    if (localView == null) {
      return super.onCreateView(paramView, paramString, paramContext, paramAttributeSet);
    }
    return localView;
  }
  
  public View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    View localView = m(null, paramString, paramContext, paramAttributeSet);
    if (localView == null) {
      return super.onCreateView(paramString, paramContext, paramAttributeSet);
    }
    return localView;
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    y.h();
    z.h(d.b.ON_DESTROY);
  }
  
  public void onLowMemory()
  {
    super.onLowMemory();
    y.i();
  }
  
  public boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    if (super.onMenuItemSelected(paramInt, paramMenuItem)) {
      return true;
    }
    if (paramInt != 0)
    {
      if (paramInt != 6) {
        return false;
      }
      return y.e(paramMenuItem);
    }
    return y.k(paramMenuItem);
  }
  
  public void onMultiWindowModeChanged(boolean paramBoolean)
  {
    y.j(paramBoolean);
  }
  
  public void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    y.u();
  }
  
  public void onPanelClosed(int paramInt, Menu paramMenu)
  {
    if (paramInt == 0) {
      y.l(paramMenu);
    }
    super.onPanelClosed(paramInt, paramMenu);
  }
  
  public void onPause()
  {
    super.onPause();
    B = false;
    y.m();
    z.h(d.b.ON_PAUSE);
  }
  
  public void onPictureInPictureModeChanged(boolean paramBoolean)
  {
    y.n(paramBoolean);
  }
  
  public void onPostResume()
  {
    super.onPostResume();
    t();
  }
  
  public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
  {
    if (paramInt == 0) {
      return s(paramView, paramMenu) | y.o(paramMenu);
    }
    return super.onPreparePanel(paramInt, paramView, paramMenu);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    y.u();
    super.onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfInt);
  }
  
  public void onResume()
  {
    super.onResume();
    B = true;
    y.u();
    y.s();
  }
  
  public void onStart()
  {
    super.onStart();
    C = false;
    if (!A)
    {
      A = true;
      y.c();
    }
    y.u();
    y.s();
    z.h(d.b.ON_START);
    y.q();
  }
  
  public void onStateNotSaved()
  {
    y.u();
  }
  
  public void onStop()
  {
    super.onStop();
    C = true;
    p();
    y.r();
    z.h(d.b.ON_STOP);
  }
  
  public void p()
  {
    while (q(n(), d.c.q)) {}
  }
  
  public void r(Fragment paramFragment) {}
  
  public boolean s(View paramView, Menu paramMenu)
  {
    return super.onPreparePanel(0, paramView, paramMenu);
  }
  
  public void t()
  {
    z.h(d.b.ON_RESUME);
    y.p();
  }
  
  public void u()
  {
    invalidateOptionsMenu();
  }
  
  public class a
    implements SavedStateRegistry.b
  {
    public a() {}
    
    public Bundle a()
    {
      Bundle localBundle = new Bundle();
      p();
      z.h(d.b.ON_STOP);
      Parcelable localParcelable = y.x();
      if (localParcelable != null) {
        localBundle.putParcelable("android:support:fragments", localParcelable);
      }
      return localBundle;
    }
  }
  
  public class b
    implements b
  {
    public b() {}
    
    public void a(Context paramContext)
    {
      y.a(null);
      paramContext = k().a("android:support:fragments");
      if (paramContext != null)
      {
        paramContext = paramContext.getParcelable("android:support:fragments");
        y.w(paramContext);
      }
    }
  }
  
  public class c
    extends k
    implements u, c, androidx.activity.result.d, r
  {
    public c()
    {
      super();
    }
    
    public void a(n paramn, Fragment paramFragment)
    {
      r(paramFragment);
    }
    
    public ActivityResultRegistry c()
    {
      return e.this.c();
    }
    
    public t d()
    {
      return e.this.d();
    }
    
    public View e(int paramInt)
    {
      return findViewById(paramInt);
    }
    
    public boolean f()
    {
      Window localWindow = getWindow();
      boolean bool;
      if ((localWindow != null) && (localWindow.peekDecorView() != null)) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public androidx.lifecycle.d g()
    {
      return z;
    }
    
    public OnBackPressedDispatcher j()
    {
      return e.this.j();
    }
    
    public LayoutInflater n()
    {
      return getLayoutInflater().cloneInContext(e.this);
    }
    
    public boolean o(Fragment paramFragment)
    {
      return isFinishing() ^ true;
    }
    
    public void q()
    {
      u();
    }
    
    public e r()
    {
      return e.this;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */