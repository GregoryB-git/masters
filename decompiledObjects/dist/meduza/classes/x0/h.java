package x0;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import b.a0;
import b.l;
import b1.o;
import b1.t;
import b1.x;
import f;

public class h
  extends i
  implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener
{
  public b a;
  public c b;
  public int c;
  public int d;
  public boolean e;
  public boolean f;
  public int o;
  public boolean p;
  public d q;
  public Dialog r;
  public boolean s;
  public boolean t;
  public boolean u;
  public boolean v;
  
  public h()
  {
    new a();
    a = new b();
    b = new c();
    c = 0;
    d = 0;
    e = true;
    f = true;
    o = -1;
    q = new d();
    v = false;
  }
  
  public final p createFragmentContainer()
  {
    return new e(super.createFragmentContainer());
  }
  
  public Dialog e()
  {
    if (y.L(3))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("onCreateDialog called for DialogFragment ");
      localStringBuilder.append(this);
      Log.d("FragmentManager", localStringBuilder.toString());
    }
    return new l(requireContext(), d);
  }
  
  @Deprecated
  public final void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
  }
  
  public final void onAttach(Context paramContext)
  {
    super.onAttach(paramContext);
    getViewLifecycleOwnerLiveData().observeForever(q);
    if (!u) {
      t = false;
    }
  }
  
  public void onCancel(DialogInterface paramDialogInterface) {}
  
  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    new Handler();
    boolean bool;
    if (mContainerId == 0) {
      bool = true;
    } else {
      bool = false;
    }
    f = bool;
    if (paramBundle != null)
    {
      c = paramBundle.getInt("android:style", 0);
      d = paramBundle.getInt("android:theme", 0);
      e = paramBundle.getBoolean("android:cancelable", true);
      f = paramBundle.getBoolean("android:showsDialog", f);
      o = paramBundle.getInt("android:backStackId", -1);
    }
  }
  
  public final void onDestroyView()
  {
    super.onDestroyView();
    Dialog localDialog = r;
    if (localDialog != null)
    {
      s = true;
      localDialog.setOnDismissListener(null);
      r.dismiss();
      if (!t) {
        onDismiss(r);
      }
      r = null;
      v = false;
    }
  }
  
  public final void onDetach()
  {
    super.onDetach();
    if ((!u) && (!t)) {
      t = true;
    }
    getViewLifecycleOwnerLiveData().removeObserver(q);
  }
  
  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    if (!s)
    {
      if (y.L(3))
      {
        paramDialogInterface = new StringBuilder();
        paramDialogInterface.append("onDismiss called for DialogFragment ");
        paramDialogInterface.append(this);
        Log.d("FragmentManager", paramDialogInterface.toString());
      }
      if (!t)
      {
        t = true;
        u = false;
        paramDialogInterface = r;
        if (paramDialogInterface != null)
        {
          paramDialogInterface.setOnDismissListener(null);
          r.dismiss();
        }
        s = true;
        if (o >= 0)
        {
          paramDialogInterface = getParentFragmentManager();
          int i = o;
          paramDialogInterface.getClass();
          if (i >= 0)
          {
            paramDialogInterface.y(new y.n(paramDialogInterface, i), true);
            o = -1;
          }
          else
          {
            throw new IllegalArgumentException(f.h("Bad id: ", i));
          }
        }
        else
        {
          paramDialogInterface = getParentFragmentManager();
          paramDialogInterface.getClass();
          paramDialogInterface = new a(paramDialogInterface);
          o = true;
          y localy = mFragmentManager;
          if ((localy != null) && (localy != p))
          {
            paramDialogInterface = f.l("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
            paramDialogInterface.append(toString());
            paramDialogInterface.append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(paramDialogInterface.toString());
          }
          paramDialogInterface.b(new g0.a(this, 3));
          paramDialogInterface.d(true);
        }
      }
    }
  }
  
  public final LayoutInflater onGetLayoutInflater(Bundle paramBundle)
  {
    LayoutInflater localLayoutInflater = super.onGetLayoutInflater(paramBundle);
    boolean bool = f;
    Object localObject;
    if ((bool) && (!p))
    {
      if ((bool) && (!v)) {
        try
        {
          p = true;
          paramBundle = e();
          r = paramBundle;
          if (f)
          {
            int i = c;
            if ((i != 1) && (i != 2))
            {
              if (i != 3) {
                break label112;
              }
              localObject = paramBundle.getWindow();
              if (localObject != null) {
                ((Window)localObject).addFlags(24);
              }
            }
            paramBundle.requestWindowFeature(1);
            label112:
            paramBundle = getContext();
            if ((paramBundle instanceof Activity)) {
              r.setOwnerActivity((Activity)paramBundle);
            }
            r.setCancelable(e);
            r.setOnCancelListener(a);
            r.setOnDismissListener(b);
            v = true;
          }
          else
          {
            r = null;
          }
        }
        finally
        {
          p = false;
        }
      }
      if (y.L(2))
      {
        paramBundle = new StringBuilder();
        paramBundle.append("get layout inflater for DialogFragment ");
        paramBundle.append(this);
        paramBundle.append(" from dialog context");
        Log.d("FragmentManager", paramBundle.toString());
      }
      localObject = r;
      paramBundle = localLayoutInflater;
      if (localObject != null) {
        paramBundle = localLayoutInflater.cloneInContext(((Dialog)localObject).getContext());
      }
      return paramBundle;
    }
    if (y.L(2))
    {
      paramBundle = new StringBuilder();
      paramBundle.append("getting layout inflater for DialogFragment ");
      paramBundle.append(this);
      String str = paramBundle.toString();
      if (!f)
      {
        localObject = new StringBuilder();
        paramBundle = "mShowsDialog = false: ";
      }
      else
      {
        localObject = new StringBuilder();
        paramBundle = "mCreatingDialog = true: ";
      }
      ((StringBuilder)localObject).append(paramBundle);
      ((StringBuilder)localObject).append(str);
      Log.d("FragmentManager", ((StringBuilder)localObject).toString());
    }
    return localLayoutInflater;
  }
  
  public final void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    Object localObject = r;
    if (localObject != null)
    {
      localObject = ((Dialog)localObject).onSaveInstanceState();
      ((BaseBundle)localObject).putBoolean("android:dialogShowing", false);
      paramBundle.putBundle("android:savedDialogState", (Bundle)localObject);
    }
    int i = c;
    if (i != 0) {
      paramBundle.putInt("android:style", i);
    }
    i = d;
    if (i != 0) {
      paramBundle.putInt("android:theme", i);
    }
    boolean bool = e;
    if (!bool) {
      paramBundle.putBoolean("android:cancelable", bool);
    }
    bool = f;
    if (!bool) {
      paramBundle.putBoolean("android:showsDialog", bool);
    }
    i = o;
    if (i != -1) {
      paramBundle.putInt("android:backStackId", i);
    }
  }
  
  public final void onStart()
  {
    super.onStart();
    Object localObject = r;
    if (localObject != null)
    {
      s = false;
      ((Dialog)localObject).show();
      localObject = r.getWindow().getDecorView();
      a0.G((View)localObject, this);
      ((View)localObject).setTag(2131362065, this);
      a0.H((View)localObject, this);
    }
  }
  
  public final void onStop()
  {
    super.onStop();
    Dialog localDialog = r;
    if (localDialog != null) {
      localDialog.hide();
    }
  }
  
  public final void onViewStateRestored(Bundle paramBundle)
  {
    super.onViewStateRestored(paramBundle);
    if ((r != null) && (paramBundle != null))
    {
      paramBundle = paramBundle.getBundle("android:savedDialogState");
      if (paramBundle != null) {
        r.onRestoreInstanceState(paramBundle);
      }
    }
  }
  
  public final void performCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    super.performCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
    if ((mView == null) && (r != null) && (paramBundle != null))
    {
      paramLayoutInflater = paramBundle.getBundle("android:savedDialogState");
      if (paramLayoutInflater != null) {
        r.onRestoreInstanceState(paramLayoutInflater);
      }
    }
  }
  
  public final class a
    implements Runnable
  {
    public a() {}
    
    public final void run()
    {
      h localh = h.this;
      b.onDismiss(r);
    }
  }
  
  public final class b
    implements DialogInterface.OnCancelListener
  {
    public b() {}
    
    public final void onCancel(DialogInterface paramDialogInterface)
    {
      h localh = h.this;
      paramDialogInterface = r;
      if (paramDialogInterface != null) {
        localh.onCancel(paramDialogInterface);
      }
    }
  }
  
  public final class c
    implements DialogInterface.OnDismissListener
  {
    public c() {}
    
    public final void onDismiss(DialogInterface paramDialogInterface)
    {
      paramDialogInterface = h.this;
      Dialog localDialog = r;
      if (localDialog != null) {
        paramDialogInterface.onDismiss(localDialog);
      }
    }
  }
  
  public final class d
    implements x<o>
  {
    public d() {}
    
    public final void a(Object paramObject)
    {
      if ((o)paramObject != null)
      {
        paramObject = h.this;
        if (f)
        {
          View localView = ((i)paramObject).requireView();
          if (localView.getParent() == null)
          {
            if (r != null)
            {
              if (y.L(3))
              {
                paramObject = new StringBuilder();
                ((StringBuilder)paramObject).append("DialogFragment ");
                ((StringBuilder)paramObject).append(this);
                ((StringBuilder)paramObject).append(" setting the content view on ");
                ((StringBuilder)paramObject).append(r);
                Log.d("FragmentManager", ((StringBuilder)paramObject).toString());
              }
              r.setContentView(localView);
            }
          }
          else {
            throw new IllegalStateException("DialogFragment can not be attached to a container view");
          }
        }
      }
    }
  }
  
  public final class e
    extends p
  {
    public e(p paramp) {}
    
    public final View b(int paramInt)
    {
      if (a.c()) {
        return a.b(paramInt);
      }
      Object localObject = r;
      if (localObject != null) {
        localObject = ((Dialog)localObject).findViewById(paramInt);
      } else {
        localObject = null;
      }
      return (View)localObject;
    }
    
    public final boolean c()
    {
      boolean bool;
      if ((!a.c()) && (!v)) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
  }
}

/* Location:
 * Qualified Name:     x0.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */