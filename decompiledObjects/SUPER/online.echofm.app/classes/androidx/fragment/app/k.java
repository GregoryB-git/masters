package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import x.a;

public abstract class k
  extends g
{
  public final Activity o;
  public final Context p;
  public final Handler q;
  public final int r;
  public final n s = new o();
  
  public k(Activity paramActivity, Context paramContext, Handler paramHandler, int paramInt)
  {
    o = paramActivity;
    p = ((Context)H.e.c(paramContext, "context == null"));
    q = ((Handler)H.e.c(paramHandler, "handler == null"));
    r = paramInt;
  }
  
  public k(e parame)
  {
    this(parame, parame, new Handler(), 0);
  }
  
  public Activity h()
  {
    return o;
  }
  
  public Context i()
  {
    return p;
  }
  
  public Handler l()
  {
    return q;
  }
  
  public abstract Object m();
  
  public abstract LayoutInflater n();
  
  public abstract boolean o(Fragment paramFragment);
  
  public void p(Fragment paramFragment, Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    if (paramInt == -1)
    {
      a.j(p, paramIntent, paramBundle);
      return;
    }
    throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
  }
  
  public abstract void q();
}

/* Location:
 * Qualified Name:     androidx.fragment.app.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */