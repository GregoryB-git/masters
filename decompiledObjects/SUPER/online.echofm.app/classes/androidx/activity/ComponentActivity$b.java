package androidx.activity;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.e;
import d.a.a;
import java.util.ArrayList;
import java.util.List;
import w.b;

public class ComponentActivity$b
  extends ActivityResultRegistry
{
  public ComponentActivity$b(ComponentActivity paramComponentActivity) {}
  
  public void f(final int paramInt, final d.a parama, Object paramObject, b paramb)
  {
    paramb = h;
    final Object localObject = parama.b(paramb, paramObject);
    if (localObject != null)
    {
      new Handler(Looper.getMainLooper()).post(new a(paramInt, (a.a)localObject));
      return;
    }
    paramObject = parama.a(paramb, paramObject);
    if (((Intent)paramObject).hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"))
    {
      parama = ((Intent)paramObject).getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
      ((Intent)paramObject).removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
    }
    else
    {
      parama = null;
    }
    if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(((Intent)paramObject).getAction()))
    {
      localObject = ((Intent)paramObject).getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
      if (localObject == null) {
        return;
      }
      paramObject = new ArrayList();
      int i = localObject.length;
      for (int j = 0; j < i; j++)
      {
        parama = localObject[j];
        if (h.checkPermission(parama, Process.myPid(), Process.myUid()) != 0) {
          ((List)paramObject).add(parama);
        }
      }
      if (!((List)paramObject).isEmpty()) {
        w.a.l(paramb, (String[])((List)paramObject).toArray(new String[0]), paramInt);
      }
    }
    else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(((Intent)paramObject).getAction()))
    {
      paramObject = (e)((Intent)paramObject).getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
      try
      {
        w.a.o(paramb, ((e)paramObject).d(), paramInt, ((e)paramObject).a(), ((e)paramObject).b(), ((e)paramObject).c(), 0, parama);
      }
      catch (IntentSender.SendIntentException parama)
      {
        new Handler(Looper.getMainLooper()).post(new b(paramInt, parama));
      }
    }
    else
    {
      w.a.n(paramb, (Intent)paramObject, paramInt, parama);
    }
  }
  
  public class a
    implements Runnable
  {
    public a(int paramInt, a.a parama) {}
    
    public void run()
    {
      c(paramInt, localObject.a());
    }
  }
  
  public class b
    implements Runnable
  {
    public b(int paramInt, IntentSender.SendIntentException paramSendIntentException) {}
    
    public void run()
    {
      b(paramInt, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", parama));
    }
  }
}

/* Location:
 * Qualified Name:     androidx.activity.ComponentActivity.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */