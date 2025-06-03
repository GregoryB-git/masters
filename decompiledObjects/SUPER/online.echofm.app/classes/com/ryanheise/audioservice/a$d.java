package com.ryanheise.audioservice;

import E5.c;
import E5.j;
import E5.k;
import E5.k.c;
import E5.k.d;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import java.util.Map;
import l5.h;

public class a$d
  implements k.c
{
  public Context a;
  public Activity b;
  public final c c;
  public final k d;
  public boolean e;
  public boolean f;
  
  public a$d(c paramc)
  {
    c = paramc;
    paramc = new k(paramc, "com.ryanheise.audio_service.client.methods");
    d = paramc;
    paramc.e(this);
  }
  
  private void d(Activity paramActivity)
  {
    b = paramActivity;
  }
  
  public final void e(Context paramContext)
  {
    a = paramContext;
  }
  
  public void f(boolean paramBoolean)
  {
    f = paramBoolean;
  }
  
  public void g(boolean paramBoolean)
  {
    e = paramBoolean;
  }
  
  public boolean h()
  {
    boolean bool;
    if ((b.getIntent().getFlags() & 0x100000) == 1048576) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void onMethodCall(j paramj, k.d paramd)
  {
    Map localMap;
    int i;
    try
    {
      if (e) {
        break label530;
      }
      localObject = a;
      if ((((String)localObject).hashCode() != -804429082) || (!((String)localObject).equals("configure"))) {
        return;
      }
      if (f) {
        break label517;
      }
      a.d(true);
      localMap = (Map)((Map)b).get("config");
      paramj = new l5/h;
      paramj.<init>(a.getApplicationContext());
      i = ((Boolean)localMap.get("androidNotificationClickStartsActivity")).booleanValue();
      j = ((Boolean)localMap.get("androidNotificationOngoing")).booleanValue();
      b = ((Boolean)localMap.get("androidResumeOnClick")).booleanValue();
      c = ((String)localMap.get("androidNotificationChannelId"));
      d = ((String)localMap.get("androidNotificationChannelName"));
      e = ((String)localMap.get("androidNotificationChannelDescription"));
      localObject = localMap.get("notificationColor");
      i = -1;
      if (localObject == null) {
        j = -1;
      } else {
        j = a.C(localMap.get("notificationColor")).intValue();
      }
      f = j;
      g = ((String)localMap.get("androidNotificationIcon"));
      h = ((Boolean)localMap.get("androidShowNotificationBadge")).booleanValue();
      k = ((Boolean)localMap.get("androidStopForegroundOnPause")).booleanValue();
      if (localMap.get("artDownscaleWidth") != null) {
        j = ((Integer)localMap.get("artDownscaleWidth")).intValue();
      }
    }
    catch (Exception paramj)
    {
      break label543;
    }
    int j = -1;
    l = j;
    j = i;
    if (localMap.get("artDownscaleHeight") != null) {
      j = ((Integer)localMap.get("artDownscaleHeight")).intValue();
    }
    m = j;
    paramj.c((Map)localMap.get("androidBrowsableRootExtras"));
    Object localObject = b;
    if (localObject != null) {
      n = localObject.getClass().getName();
    }
    paramj.b();
    localObject = AudioService.R;
    if (localObject != null) {
      ((AudioService)localObject).B(paramj);
    }
    a.q(this);
    if (a.e() == null)
    {
      paramj = new com/ryanheise/audioservice/a$c;
      paramj.<init>(c);
      a.f(paramj);
      AudioService.Q(a.e());
    }
    else
    {
      if (ea != c) {
        a.e().a0(c);
      }
      a.e().T();
    }
    if (a.n() != null)
    {
      paramd.a(a.F(new Object[0]));
    }
    else
    {
      a.t(paramd);
      return;
      label517:
      paramj = new java/lang/IllegalStateException;
      paramj.<init>("Unable to bind to AudioService. Please ensure you have declared a <service> element as described in the README.");
      throw paramj;
      label530:
      paramj = new java/lang/IllegalStateException;
      paramj.<init>("The Activity class declared in your AndroidManifest.xml is wrong or has not provided the correct FlutterEngine. Please see the README for instructions.");
      throw paramj;
      label543:
      paramj.printStackTrace();
      paramd.b(paramj.getMessage(), null, null);
    }
  }
}

/* Location:
 * Qualified Name:     com.ryanheise.audioservice.a.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */