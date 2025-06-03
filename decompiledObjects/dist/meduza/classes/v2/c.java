package v2;

import a3.b;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import ec.i;
import f;
import o2.j;

public final class c
  extends e<Boolean>
{
  public c(Context paramContext, b paramb)
  {
    super(paramContext, paramb);
  }
  
  public final Object a()
  {
    Object localObject = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    localObject = b.registerReceiver(null, (IntentFilter)localObject);
    if (localObject == null)
    {
      j.d().b(d.a, "getInitialState - null intent received");
      localObject = Boolean.FALSE;
    }
    else
    {
      int i = ((Intent)localObject).getIntExtra("status", -1);
      int j = ((Intent)localObject).getIntExtra("level", -1);
      int k = ((Intent)localObject).getIntExtra("scale", -1);
      float f = j / k;
      boolean bool1 = true;
      boolean bool2 = bool1;
      if (i != 1) {
        if (f > 0.15F) {
          bool2 = bool1;
        } else {
          bool2 = false;
        }
      }
      localObject = Boolean.valueOf(bool2);
    }
    return localObject;
  }
  
  public final IntentFilter e()
  {
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.intent.action.BATTERY_OKAY");
    localIntentFilter.addAction("android.intent.action.BATTERY_LOW");
    return localIntentFilter;
  }
  
  public final void f(Intent paramIntent)
  {
    i.e(paramIntent, "intent");
    if (paramIntent.getAction() == null) {
      return;
    }
    j localj = j.d();
    String str = d.a;
    StringBuilder localStringBuilder = f.l("Received ");
    localStringBuilder.append(paramIntent.getAction());
    localj.a(str, localStringBuilder.toString());
    paramIntent = paramIntent.getAction();
    if (paramIntent != null)
    {
      int i = paramIntent.hashCode();
      if (i != -1980154005)
      {
        if ((i != 490310653) || (!paramIntent.equals("android.intent.action.BATTERY_LOW"))) {
          return;
        }
        paramIntent = Boolean.FALSE;
      }
      else
      {
        if (!paramIntent.equals("android.intent.action.BATTERY_OKAY")) {
          return;
        }
        paramIntent = Boolean.TRUE;
      }
      b(paramIntent);
    }
  }
}

/* Location:
 * Qualified Name:     v2.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */