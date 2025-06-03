package androidx.fragment.app;

import H.e;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.u;

public class i
{
  public final k a;
  
  public i(k paramk)
  {
    a = paramk;
  }
  
  public static i b(k paramk)
  {
    return new i((k)e.c(paramk, "callbacks == null"));
  }
  
  public void a(Fragment paramFragment)
  {
    k localk = a;
    s.k(localk, localk, paramFragment);
  }
  
  public void c()
  {
    a.s.y();
  }
  
  public void d(Configuration paramConfiguration)
  {
    a.s.A(paramConfiguration);
  }
  
  public boolean e(MenuItem paramMenuItem)
  {
    return a.s.B(paramMenuItem);
  }
  
  public void f()
  {
    a.s.C();
  }
  
  public boolean g(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    return a.s.D(paramMenu, paramMenuInflater);
  }
  
  public void h()
  {
    a.s.E();
  }
  
  public void i()
  {
    a.s.G();
  }
  
  public void j(boolean paramBoolean)
  {
    a.s.H(paramBoolean);
  }
  
  public boolean k(MenuItem paramMenuItem)
  {
    return a.s.J(paramMenuItem);
  }
  
  public void l(Menu paramMenu)
  {
    a.s.K(paramMenu);
  }
  
  public void m()
  {
    a.s.M();
  }
  
  public void n(boolean paramBoolean)
  {
    a.s.N(paramBoolean);
  }
  
  public boolean o(Menu paramMenu)
  {
    return a.s.O(paramMenu);
  }
  
  public void p()
  {
    a.s.Q();
  }
  
  public void q()
  {
    a.s.R();
  }
  
  public void r()
  {
    a.s.T();
  }
  
  public boolean s()
  {
    return a.s.a0(true);
  }
  
  public n t()
  {
    return a.s;
  }
  
  public void u()
  {
    a.s.P0();
  }
  
  public View v(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    return a.s.t0().onCreateView(paramView, paramString, paramContext, paramAttributeSet);
  }
  
  public void w(Parcelable paramParcelable)
  {
    k localk = a;
    if ((localk instanceof u))
    {
      s.c1(paramParcelable);
      return;
    }
    throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
  }
  
  public Parcelable x()
  {
    return a.s.e1();
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */