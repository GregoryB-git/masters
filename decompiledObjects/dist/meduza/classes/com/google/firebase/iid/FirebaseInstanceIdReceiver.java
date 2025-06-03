package com.google.firebase.iid;

import aa.j;
import aa.q;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import i6.a;
import i6.b;
import java.util.concurrent.ExecutionException;

public final class FirebaseInstanceIdReceiver
  extends b
{
  public final int a(Context paramContext, a parama)
  {
    try
    {
      j localj = new aa/j;
      localj.<init>(paramContext);
      int i = ((Integer)Tasks.await(localj.b(a))).intValue();
      return i;
    }
    catch (InterruptedException paramContext) {}catch (ExecutionException paramContext) {}
    Log.e("FirebaseMessaging", "Failed to send message to service.", paramContext);
    return 500;
  }
  
  public final void b(Bundle paramBundle)
  {
    paramBundle = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(paramBundle);
    if (q.d(paramBundle)) {
      q.c(paramBundle.getExtras(), "_nd");
    }
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.iid.FirebaseInstanceIdReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */