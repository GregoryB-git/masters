package com.google.firebase.messaging;

import V2.j;
import V2.k;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class o0$a
{
  public final Intent a;
  public final k b = new k();
  
  public o0$a(Intent paramIntent)
  {
    a = paramIntent;
  }
  
  public void c(ScheduledExecutorService paramScheduledExecutorService)
  {
    ScheduledFuture localScheduledFuture = paramScheduledExecutorService.schedule(new m0(this), 20L, TimeUnit.SECONDS);
    e().c(paramScheduledExecutorService, new n0(localScheduledFuture));
  }
  
  public void d()
  {
    b.e(null);
  }
  
  public j e()
  {
    return b.a();
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.messaging.o0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */