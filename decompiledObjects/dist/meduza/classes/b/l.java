package b;

import android.app.Dialog;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import b1.k.a;
import b1.o;
import b1.p;
import ec.i;
import s1.c;
import s1.d;
import s1.e;

public class l
  extends Dialog
  implements o, y, e
{
  public p a;
  public final d b = new d(this);
  public final w c = new w(new k(this, 0));
  
  public l(Context paramContext, int paramInt)
  {
    super(paramContext, paramInt);
  }
  
  public static void a(l paraml)
  {
    i.e(paraml, "this$0");
    paraml.onBackPressed();
  }
  
  public void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    i.e(paramView, "view");
    b();
    super.addContentView(paramView, paramLayoutParams);
  }
  
  public final void b()
  {
    Object localObject = getWindow();
    i.b(localObject);
    localObject = ((Window)localObject).getDecorView();
    i.d(localObject, "window!!.decorView");
    a0.G((View)localObject, this);
    localObject = getWindow();
    i.b(localObject);
    localObject = ((Window)localObject).getDecorView();
    i.d(localObject, "window!!.decorView");
    a0.F((View)localObject, this);
    localObject = getWindow();
    i.b(localObject);
    localObject = ((Window)localObject).getDecorView();
    i.d(localObject, "window!!.decorView");
    a0.H((View)localObject, this);
  }
  
  public final b1.k getLifecycle()
  {
    p localp1 = a;
    p localp2 = localp1;
    if (localp1 == null)
    {
      localp2 = new p(this);
      a = localp2;
    }
    return localp2;
  }
  
  public final w getOnBackPressedDispatcher()
  {
    return c;
  }
  
  public final c getSavedStateRegistry()
  {
    return b.b;
  }
  
  public final void onBackPressed()
  {
    c.b();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (Build.VERSION.SDK_INT >= 33)
    {
      localObject = c;
      OnBackInvokedDispatcher localOnBackInvokedDispatcher = getOnBackInvokedDispatcher();
      i.d(localOnBackInvokedDispatcher, "onBackInvokedDispatcher");
      localObject.getClass();
      f = localOnBackInvokedDispatcher;
      ((w)localObject).c(h);
    }
    b.b(paramBundle);
    Object localObject = a;
    paramBundle = (Bundle)localObject;
    if (localObject == null)
    {
      paramBundle = new p(this);
      a = paramBundle;
    }
    paramBundle.f(k.a.ON_CREATE);
  }
  
  public final Bundle onSaveInstanceState()
  {
    Bundle localBundle = super.onSaveInstanceState();
    i.d(localBundle, "super.onSaveInstanceState()");
    b.c(localBundle);
    return localBundle;
  }
  
  public final void onStart()
  {
    super.onStart();
    p localp1 = a;
    p localp2 = localp1;
    if (localp1 == null)
    {
      localp2 = new p(this);
      a = localp2;
    }
    localp2.f(k.a.ON_RESUME);
  }
  
  public void onStop()
  {
    p localp1 = a;
    p localp2 = localp1;
    if (localp1 == null)
    {
      localp2 = new p(this);
      a = localp2;
    }
    localp2.f(k.a.ON_DESTROY);
    a = null;
    super.onStop();
  }
  
  public void setContentView(int paramInt)
  {
    b();
    super.setContentView(paramInt);
  }
  
  public void setContentView(View paramView)
  {
    i.e(paramView, "view");
    b();
    super.setContentView(paramView);
  }
  
  public void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    i.e(paramView, "view");
    b();
    super.setContentView(paramView, paramLayoutParams);
  }
}

/* Location:
 * Qualified Name:     b.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */