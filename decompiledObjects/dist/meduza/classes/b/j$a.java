package b;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import d.g;
import e.a;
import e.a.a;
import u.b;

public final class j$a
  extends g
{
  public j$a(j paramj) {}
  
  public final void b(int paramInt, a parama, Object paramObject)
  {
    j localj = h;
    Object localObject = parama.b(localj, paramObject);
    if (localObject != null)
    {
      new Handler(Looper.getMainLooper()).post(new h(this, paramInt, (a.a)localObject));
      return;
    }
    paramObject = parama.a(localj, paramObject);
    parama = null;
    if ((((Intent)paramObject).getExtras() != null) && (((Intent)paramObject).getExtras().getClassLoader() == null)) {
      ((Intent)paramObject).setExtrasClassLoader(localj.getClassLoader());
    }
    if (((Intent)paramObject).hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"))
    {
      parama = ((Intent)paramObject).getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
      ((Intent)paramObject).removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
    }
    if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(((Intent)paramObject).getAction()))
    {
      paramObject = ((Intent)paramObject).getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
      parama = (a)paramObject;
      if (paramObject == null) {
        parama = new String[0];
      }
      b.a(localj, parama, paramInt);
    }
    else
    {
      int i;
      if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(((Intent)paramObject).getAction()))
      {
        d.i locali = (d.i)((Intent)paramObject).getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try
        {
          localObject = a;
          paramObject = b;
          i = c;
          int j = d;
          int k = b.a;
          localj.startIntentSenderForResult((IntentSender)localObject, paramInt, (Intent)paramObject, i, j, 0, parama);
        }
        catch (IntentSender.SendIntentException parama)
        {
          new Handler(Looper.getMainLooper()).post(new i(this, paramInt, parama));
        }
      }
      else
      {
        i = b.a;
        localj.startActivityForResult((Intent)paramObject, paramInt, parama);
      }
    }
  }
}

/* Location:
 * Qualified Name:     b.j.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */