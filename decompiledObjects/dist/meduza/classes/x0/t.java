package x0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.PrintWriter;
import v.a;

public abstract class t<H>
  extends p
{
  public final Activity a;
  public final Context b;
  public final Handler c;
  public final z d;
  
  public t(m paramm)
  {
    a = paramm;
    b = paramm;
    c = localHandler;
    d = new z();
  }
  
  public abstract void d(PrintWriter paramPrintWriter, String[] paramArrayOfString);
  
  public abstract m e();
  
  public abstract LayoutInflater f();
  
  public abstract boolean g(String paramString);
  
  public final void h(i parami, Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    ec.i.e(parami, "fragment");
    ec.i.e(paramIntent, "intent");
    if (paramInt == -1) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    if (paramInt != 0)
    {
      a.startActivity(b, paramIntent, paramBundle);
      return;
    }
    throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host".toString());
  }
  
  public abstract void i();
}

/* Location:
 * Qualified Name:     x0.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */