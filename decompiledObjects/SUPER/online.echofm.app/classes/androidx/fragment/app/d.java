package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.h;
import androidx.lifecycle.m;

public class d
  extends Fragment
  implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener
{
  public boolean A0;
  public boolean B0;
  public boolean C0;
  public boolean D0 = false;
  public Handler o0;
  public Runnable p0 = new a();
  public DialogInterface.OnCancelListener q0 = new b();
  public DialogInterface.OnDismissListener r0 = new c();
  public int s0 = 0;
  public int t0 = 0;
  public boolean u0 = true;
  public boolean v0 = true;
  public int w0 = -1;
  public boolean x0;
  public m y0 = new d();
  public Dialog z0;
  
  public void I0(Bundle paramBundle)
  {
    super.I0(paramBundle);
    Object localObject = z0;
    if (localObject != null)
    {
      localObject = ((Dialog)localObject).onSaveInstanceState();
      ((BaseBundle)localObject).putBoolean("android:dialogShowing", false);
      paramBundle.putBundle("android:savedDialogState", (Bundle)localObject);
    }
    int i = s0;
    if (i != 0) {
      paramBundle.putInt("android:style", i);
    }
    i = t0;
    if (i != 0) {
      paramBundle.putInt("android:theme", i);
    }
    boolean bool = u0;
    if (!bool) {
      paramBundle.putBoolean("android:cancelable", bool);
    }
    bool = v0;
    if (!bool) {
      paramBundle.putBoolean("android:showsDialog", bool);
    }
    i = w0;
    if (i != -1) {
      paramBundle.putInt("android:backStackId", i);
    }
  }
  
  public void J0()
  {
    super.J0();
    Dialog localDialog = z0;
    if (localDialog != null)
    {
      A0 = false;
      localDialog.show();
    }
  }
  
  public void K0()
  {
    super.K0();
    Dialog localDialog = z0;
    if (localDialog != null) {
      localDialog.hide();
    }
  }
  
  public final void K1(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (B0) {
      return;
    }
    B0 = true;
    C0 = false;
    Object localObject = z0;
    if (localObject != null)
    {
      ((Dialog)localObject).setOnDismissListener(null);
      z0.dismiss();
      if (!paramBoolean2) {
        if (Looper.myLooper() == o0.getLooper()) {
          onDismiss(z0);
        } else {
          o0.post(p0);
        }
      }
    }
    A0 = true;
    if (w0 >= 0)
    {
      F().R0(w0, 1);
      w0 = -1;
    }
    else
    {
      localObject = F().m();
      ((v)localObject).k(this);
      if (paramBoolean1) {
        ((v)localObject).g();
      } else {
        ((v)localObject).f();
      }
    }
  }
  
  public Dialog L1()
  {
    return z0;
  }
  
  public void M0(Bundle paramBundle)
  {
    super.M0(paramBundle);
    if ((z0 != null) && (paramBundle != null))
    {
      paramBundle = paramBundle.getBundle("android:savedDialogState");
      if (paramBundle != null) {
        z0.onRestoreInstanceState(paramBundle);
      }
    }
  }
  
  public int M1()
  {
    return t0;
  }
  
  public Dialog N1(Bundle paramBundle)
  {
    if (n.D0(3))
    {
      paramBundle = new StringBuilder();
      paramBundle.append("onCreateDialog called for DialogFragment ");
      paramBundle.append(this);
      Log.d("FragmentManager", paramBundle.toString());
    }
    return new Dialog(p1(), M1());
  }
  
  public View O1(int paramInt)
  {
    Dialog localDialog = z0;
    if (localDialog != null) {
      return localDialog.findViewById(paramInt);
    }
    return null;
  }
  
  public boolean P1()
  {
    return D0;
  }
  
  public final void Q1(Bundle paramBundle)
  {
    if (!v0) {
      return;
    }
    if (!D0)
    {
      try
      {
        x0 = true;
        paramBundle = N1(paramBundle);
        z0 = paramBundle;
        if (!v0) {
          break label118;
        }
        S1(paramBundle, s0);
        paramBundle = t();
        if ((paramBundle instanceof Activity)) {
          z0.setOwnerActivity((Activity)paramBundle);
        }
      }
      finally
      {
        break label131;
      }
      z0.setCancelable(u0);
      z0.setOnCancelListener(q0);
      z0.setOnDismissListener(r0);
      D0 = true;
      break label123;
      label118:
      z0 = null;
      label123:
      x0 = false;
      return;
      label131:
      x0 = false;
      throw paramBundle;
    }
  }
  
  public void R1(boolean paramBoolean)
  {
    v0 = paramBoolean;
  }
  
  public void S1(Dialog paramDialog, int paramInt)
  {
    if ((paramInt != 1) && (paramInt != 2))
    {
      if (paramInt != 3) {
        return;
      }
      Window localWindow = paramDialog.getWindow();
      if (localWindow != null) {
        localWindow.addFlags(24);
      }
    }
    paramDialog.requestWindowFeature(1);
  }
  
  public void T0(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    super.T0(paramLayoutInflater, paramViewGroup, paramBundle);
    if ((V == null) && (z0 != null) && (paramBundle != null))
    {
      paramLayoutInflater = paramBundle.getBundle("android:savedDialogState");
      if (paramLayoutInflater != null) {
        z0.onRestoreInstanceState(paramLayoutInflater);
      }
    }
  }
  
  public void T1(n paramn, String paramString)
  {
    B0 = false;
    C0 = true;
    paramn = paramn.m();
    paramn.d(this, paramString);
    paramn.f();
  }
  
  public g f()
  {
    return new e(super.f());
  }
  
  public void j0(Context paramContext)
  {
    super.j0(paramContext);
    S().e(y0);
    if (!C0) {
      B0 = false;
    }
  }
  
  public void m0(Bundle paramBundle)
  {
    super.m0(paramBundle);
    o0 = new Handler();
    boolean bool;
    if (L == 0) {
      bool = true;
    } else {
      bool = false;
    }
    v0 = bool;
    if (paramBundle != null)
    {
      s0 = paramBundle.getInt("android:style", 0);
      t0 = paramBundle.getInt("android:theme", 0);
      u0 = paramBundle.getBoolean("android:cancelable", true);
      v0 = paramBundle.getBoolean("android:showsDialog", v0);
      w0 = paramBundle.getInt("android:backStackId", -1);
    }
  }
  
  public void onCancel(DialogInterface paramDialogInterface) {}
  
  public void onDismiss(DialogInterface paramDialogInterface)
  {
    if (!A0)
    {
      if (n.D0(3))
      {
        paramDialogInterface = new StringBuilder();
        paramDialogInterface.append("onDismiss called for DialogFragment ");
        paramDialogInterface.append(this);
        Log.d("FragmentManager", paramDialogInterface.toString());
      }
      K1(true, true);
    }
  }
  
  public void t0()
  {
    super.t0();
    Dialog localDialog = z0;
    if (localDialog != null)
    {
      A0 = true;
      localDialog.setOnDismissListener(null);
      z0.dismiss();
      if (!B0) {
        onDismiss(z0);
      }
      z0 = null;
      D0 = false;
    }
  }
  
  public void u0()
  {
    super.u0();
    if ((!C0) && (!B0)) {
      B0 = true;
    }
    S().i(y0);
  }
  
  public LayoutInflater v0(Bundle paramBundle)
  {
    LayoutInflater localLayoutInflater = super.v0(paramBundle);
    Object localObject;
    if ((v0) && (!x0))
    {
      Q1(paramBundle);
      if (n.D0(2))
      {
        paramBundle = new StringBuilder();
        paramBundle.append("get layout inflater for DialogFragment ");
        paramBundle.append(this);
        paramBundle.append(" from dialog context");
        Log.d("FragmentManager", paramBundle.toString());
      }
      localObject = z0;
      paramBundle = localLayoutInflater;
      if (localObject != null) {
        paramBundle = localLayoutInflater.cloneInContext(((Dialog)localObject).getContext());
      }
      return paramBundle;
    }
    if (n.D0(2))
    {
      paramBundle = new StringBuilder();
      paramBundle.append("getting layout inflater for DialogFragment ");
      paramBundle.append(this);
      String str = paramBundle.toString();
      if (!v0) {
        localObject = new StringBuilder();
      }
      for (paramBundle = "mShowsDialog = false: ";; paramBundle = "mCreatingDialog = true: ")
      {
        ((StringBuilder)localObject).append(paramBundle);
        ((StringBuilder)localObject).append(str);
        Log.d("FragmentManager", ((StringBuilder)localObject).toString());
        break;
        localObject = new StringBuilder();
      }
    }
    return localLayoutInflater;
  }
  
  public class a
    implements Runnable
  {
    public a() {}
    
    public void run()
    {
      d.I1(d.this).onDismiss(d.H1(d.this));
    }
  }
  
  public class b
    implements DialogInterface.OnCancelListener
  {
    public b() {}
    
    public void onCancel(DialogInterface paramDialogInterface)
    {
      if (d.H1(d.this) != null)
      {
        paramDialogInterface = d.this;
        paramDialogInterface.onCancel(d.H1(paramDialogInterface));
      }
    }
  }
  
  public class c
    implements DialogInterface.OnDismissListener
  {
    public c() {}
    
    public void onDismiss(DialogInterface paramDialogInterface)
    {
      if (d.H1(d.this) != null)
      {
        paramDialogInterface = d.this;
        paramDialogInterface.onDismiss(d.H1(paramDialogInterface));
      }
    }
  }
  
  public class d
    implements m
  {
    public d() {}
    
    public void b(h paramh)
    {
      if ((paramh != null) && (d.J1(d.this)))
      {
        paramh = q1();
        if (paramh.getParent() == null)
        {
          if (d.H1(d.this) != null)
          {
            if (n.D0(3))
            {
              StringBuilder localStringBuilder = new StringBuilder();
              localStringBuilder.append("DialogFragment ");
              localStringBuilder.append(this);
              localStringBuilder.append(" setting the content view on ");
              localStringBuilder.append(d.H1(d.this));
              Log.d("FragmentManager", localStringBuilder.toString());
            }
            d.H1(d.this).setContentView(paramh);
          }
        }
        else {
          throw new IllegalStateException("DialogFragment can not be attached to a container view");
        }
      }
    }
  }
  
  public class e
    extends g
  {
    public e(g paramg) {}
    
    public View e(int paramInt)
    {
      View localView = O1(paramInt);
      if (localView != null) {
        return localView;
      }
      if (o.f()) {
        return o.e(paramInt);
      }
      return null;
    }
    
    public boolean f()
    {
      boolean bool;
      if ((!P1()) && (!o.f())) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */