package io.flutter.plugins.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;

public final class a$c
  extends a.i
{
  public final Context d;
  public final PowerManager.WakeLock e;
  public final PowerManager.WakeLock f;
  public boolean g;
  public boolean h;
  
  public a$c(Context paramContext, ComponentName paramComponentName)
  {
    super(paramComponentName);
    d = paramContext.getApplicationContext();
    paramContext = (PowerManager)paramContext.getSystemService("power");
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(paramComponentName.getClassName());
    ((StringBuilder)localObject).append(":launch");
    localObject = paramContext.newWakeLock(1, ((StringBuilder)localObject).toString());
    e = ((PowerManager.WakeLock)localObject);
    ((PowerManager.WakeLock)localObject).setReferenceCounted(false);
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append(paramComponentName.getClassName());
    ((StringBuilder)localObject).append(":run");
    paramContext = paramContext.newWakeLock(1, ((StringBuilder)localObject).toString());
    f = paramContext;
    paramContext.setReferenceCounted(false);
  }
  
  public void a(Intent paramIntent)
  {
    paramIntent = new Intent(paramIntent);
    paramIntent.setComponent(a);
    if (d.startService(paramIntent) != null)
    {
      try
      {
        if (!g)
        {
          g = true;
          if (!h) {
            e.acquire(60000L);
          }
        }
      }
      finally
      {
        break label72;
      }
      return;
      label72:
      throw paramIntent;
    }
  }
  
  public void c()
  {
    try
    {
      if (!h) {
        break label45;
      }
      if (g) {
        e.acquire(60000L);
      }
    }
    finally
    {
      break label48;
    }
    h = false;
    f.release();
    label45:
    return;
    label48:
    throw ((Throwable)localObject);
  }
  
  public void d()
  {
    try
    {
      if (!h)
      {
        h = true;
        f.acquire(600000L);
        e.release();
      }
    }
    finally
    {
      break label41;
    }
    return;
    label41:
    throw ((Throwable)localObject);
  }
  
  public void e()
  {
    try
    {
      g = false;
      return;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.messaging.a.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */