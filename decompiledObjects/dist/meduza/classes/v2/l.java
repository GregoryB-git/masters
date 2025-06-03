package v2;

import a3.b;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import ec.i;
import f;
import o2.j;

public final class l
  extends e<Boolean>
{
  public l(Context paramContext, b paramb)
  {
    super(paramContext, paramb);
  }
  
  public final Object a()
  {
    Object localObject = b.registerReceiver(null, e());
    boolean bool1 = false;
    if ((localObject != null) && (((Intent)localObject).getAction() != null))
    {
      localObject = ((Intent)localObject).getAction();
      bool2 = bool1;
      if (localObject == null) {
        break label93;
      }
      int i = ((String)localObject).hashCode();
      if (i != -1181163412)
      {
        if (i != -730838620)
        {
          bool2 = bool1;
          break label93;
        }
        if (!((String)localObject).equals("android.intent.action.DEVICE_STORAGE_OK"))
        {
          bool2 = bool1;
          break label93;
        }
      }
      else
      {
        ((String)localObject).equals("android.intent.action.DEVICE_STORAGE_LOW");
        bool2 = bool1;
        break label93;
      }
    }
    boolean bool2 = true;
    label93:
    return Boolean.valueOf(bool2);
  }
  
  public final IntentFilter e()
  {
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
    localIntentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
    return localIntentFilter;
  }
  
  public final void f(Intent paramIntent)
  {
    i.e(paramIntent, "intent");
    if (paramIntent.getAction() == null) {
      return;
    }
    j localj = j.d();
    String str = m.a;
    StringBuilder localStringBuilder = f.l("Received ");
    localStringBuilder.append(paramIntent.getAction());
    localj.a(str, localStringBuilder.toString());
    paramIntent = paramIntent.getAction();
    if (paramIntent != null)
    {
      int i = paramIntent.hashCode();
      if (i != -1181163412)
      {
        if ((i != -730838620) || (!paramIntent.equals("android.intent.action.DEVICE_STORAGE_OK"))) {
          return;
        }
        paramIntent = Boolean.TRUE;
      }
      else
      {
        if (!paramIntent.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
          return;
        }
        paramIntent = Boolean.FALSE;
      }
      b(paramIntent);
    }
  }
}

/* Location:
 * Qualified Name:     v2.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */