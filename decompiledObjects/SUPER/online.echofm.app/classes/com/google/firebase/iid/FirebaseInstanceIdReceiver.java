package com.google.firebase.iid;

import V2.m;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.J;
import com.google.firebase.messaging.n;
import java.util.concurrent.ExecutionException;
import w2.a;
import w2.b;

public final class FirebaseInstanceIdReceiver
  extends b
{
  public static Intent g(Context paramContext, String paramString, Bundle paramBundle)
  {
    return new Intent(paramString).putExtras(paramBundle);
  }
  
  public int b(Context paramContext, a parama)
  {
    try
    {
      n localn = new com/google/firebase/messaging/n;
      localn.<init>(paramContext);
      int i = ((Integer)m.a(localn.k(parama.a()))).intValue();
      return i;
    }
    catch (InterruptedException paramContext) {}catch (ExecutionException paramContext) {}
    Log.e("FirebaseMessaging", "Failed to send message to service.", paramContext);
    return 500;
  }
  
  public void c(Context paramContext, Bundle paramBundle)
  {
    paramContext = g(paramContext, "com.google.firebase.messaging.NOTIFICATION_DISMISS", paramBundle);
    if (J.B(paramContext)) {
      J.s(paramContext);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.iid.FirebaseInstanceIdReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */