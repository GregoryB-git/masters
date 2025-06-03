package v2;

import a3.b;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import ec.i;
import o2.j;

public abstract class e<T>
  extends g<T>
{
  public final a f = new a(this);
  
  public e(Context paramContext, b paramb)
  {
    super(paramContext, paramb);
  }
  
  public final void c()
  {
    j localj = j.d();
    String str = f.a;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(getClass().getSimpleName());
    localStringBuilder.append(": registering receiver");
    localj.a(str, localStringBuilder.toString());
    b.registerReceiver(f, e());
  }
  
  public final void d()
  {
    j localj = j.d();
    String str = f.a;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(getClass().getSimpleName());
    localStringBuilder.append(": unregistering receiver");
    localj.a(str, localStringBuilder.toString());
    b.unregisterReceiver(f);
  }
  
  public abstract IntentFilter e();
  
  public abstract void f(Intent paramIntent);
  
  public static final class a
    extends BroadcastReceiver
  {
    public a(e<T> parame) {}
    
    public final void onReceive(Context paramContext, Intent paramIntent)
    {
      i.e(paramContext, "context");
      i.e(paramIntent, "intent");
      a.f(paramIntent);
    }
  }
}

/* Location:
 * Qualified Name:     v2.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */