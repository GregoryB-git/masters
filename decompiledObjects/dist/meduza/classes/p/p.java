package p;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.customtabs.ICustomTabsService;
import android.support.customtabs.ICustomTabsService.Stub;

public abstract class p
  implements ServiceConnection
{
  private Context mApplicationContext;
  
  public Context getApplicationContext()
  {
    return mApplicationContext;
  }
  
  public abstract void onCustomTabsServiceConnected(ComponentName paramComponentName, n paramn);
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    if (mApplicationContext != null)
    {
      onCustomTabsServiceConnected(paramComponentName, new a(ICustomTabsService.Stub.asInterface(paramIBinder), paramComponentName));
      return;
    }
    throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
  }
  
  public void setApplicationContext(Context paramContext)
  {
    mApplicationContext = paramContext;
  }
  
  public final class a
    extends n
  {
    public a(ComponentName paramComponentName)
    {
      super(paramComponentName);
    }
  }
}

/* Location:
 * Qualified Name:     p.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */