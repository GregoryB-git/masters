package com.google.firebase.messaging;

import V2.j;
import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import r1.m;

public class l0
  extends Binder
{
  public final a b;
  
  public l0(a parama)
  {
    b = parama;
  }
  
  public void c(o0.a parama)
  {
    if (Binder.getCallingUid() == Process.myUid())
    {
      if (Log.isLoggable("FirebaseMessaging", 3)) {
        Log.d("FirebaseMessaging", "service received new intent via bind strategy");
      }
      b.a(a).c(new m(), new k0(parama));
      return;
    }
    throw new SecurityException("Binding only allowed within app");
  }
  
  public static abstract interface a
  {
    public abstract j a(Intent paramIntent);
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.messaging.l0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */