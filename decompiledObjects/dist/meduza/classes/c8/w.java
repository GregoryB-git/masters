package c8;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import b8.c1;
import com.google.android.gms.internal.firebase_auth_api.zzaic;
import f1.a;
import f1.a.c;
import java.util.ArrayList;
import java.util.HashMap;
import m6.j;
import n6.d;

public final class w
{
  public static w c;
  public boolean a = false;
  public BroadcastReceiver b;
  
  public static c1 a(Intent paramIntent)
  {
    j.i(paramIntent);
    return c1.H(((zzaic)d.a(paramIntent, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST", zzaic.CREATOR)).zzc(true));
  }
  
  public static void c(Context arg0)
  {
    Object localObject1 = c;
    a = false;
    if (b != null)
    {
      a locala = a.a(???);
      BroadcastReceiver localBroadcastReceiver = cb;
      synchronized (b)
      {
        ArrayList localArrayList1 = (ArrayList)b.remove(localBroadcastReceiver);
        if (localArrayList1 != null)
        {
          int i;
          do
          {
            i = localArrayList1.size() - 1;
          } while (i < 0);
          a.c localc1 = (a.c)localArrayList1.get(i);
          d = true;
          for (int j = 0; j < a.countActions(); j++)
          {
            localObject1 = a.getAction(j);
            ArrayList localArrayList2 = (ArrayList)c.get(localObject1);
            if (localArrayList2 != null)
            {
              for (int k = localArrayList2.size() - 1; k >= 0; k--)
              {
                a.c localc2 = (a.c)localArrayList2.get(k);
                if (b == localBroadcastReceiver)
                {
                  d = true;
                  localArrayList2.remove(k);
                }
              }
              if (localArrayList2.size() <= 0) {
                c.remove(localObject1);
              }
            }
          }
          i--;
        }
      }
    }
    cb = null;
  }
  
  public final void b(Activity paramActivity, BroadcastReceiver paramBroadcastReceiver)
  {
    b = paramBroadcastReceiver;
    a locala = a.a(paramActivity);
    IntentFilter localIntentFilter = new IntentFilter("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
    synchronized (b)
    {
      a.c localc = new f1/a$c;
      localc.<init>(paramBroadcastReceiver, localIntentFilter);
      Object localObject = (ArrayList)b.get(paramBroadcastReceiver);
      paramActivity = (Activity)localObject;
      if (localObject == null)
      {
        paramActivity = new java/util/ArrayList;
        paramActivity.<init>(1);
        b.put(paramBroadcastReceiver, paramActivity);
      }
      paramActivity.add(localc);
      for (int i = 0; i < localIntentFilter.countActions(); i++)
      {
        localObject = localIntentFilter.getAction(i);
        paramBroadcastReceiver = (ArrayList)c.get(localObject);
        paramActivity = paramBroadcastReceiver;
        if (paramBroadcastReceiver == null)
        {
          paramActivity = new java/util/ArrayList;
          paramActivity.<init>(1);
          c.put(localObject, paramActivity);
        }
        paramActivity.add(localc);
      }
      return;
    }
  }
}

/* Location:
 * Qualified Name:     c8.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */