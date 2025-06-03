package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzed;
import com.google.firebase.components.ComponentRegistrar;
import d8.b;
import d8.b.a;
import d8.k;
import eb.y;
import java.util.Arrays;
import java.util.List;
import m6.j;
import u7.f;
import w7.a;

public class AnalyticsConnectorRegistrar
  implements ComponentRegistrar
{
  public static a lambda$getComponents$0(d8.c paramc)
  {
    Object localObject = (f)paramc.get(f.class);
    Context localContext = (Context)paramc.get(Context.class);
    c9.d locald = (c9.d)paramc.get(c9.d.class);
    j.i(localObject);
    j.i(localContext);
    j.i(locald);
    j.i(localContext.getApplicationContext());
    if (w7.c.c == null) {
      try
      {
        if (w7.c.c == null)
        {
          paramc = new android/os/Bundle;
          paramc.<init>(1);
          ((f)localObject).a();
          if ("[DEFAULT]".equals(b))
          {
            w7.e locale = new w7/e;
            locale.<init>();
            w7.d locald1 = new w7/d;
            locald1.<init>();
            locald.d(locale, locald1);
            paramc.putBoolean("dataCollectionDefaultEnabled", ((f)localObject).k());
          }
          localObject = new w7/c;
          ((w7.c)localObject).<init>(zzed.zza(localContext, null, null, null, paramc).zzb());
          w7.c.c = (w7.c)localObject;
        }
      }
      finally {}
    }
    return w7.c.c;
  }
  
  public List<b<?>> getComponents()
  {
    b.a locala = b.b(a.class);
    locala.a(k.d(f.class));
    locala.a(k.d(Context.class));
    locala.a(k.d(c9.d.class));
    f = new y();
    locala.c(2);
    return Arrays.asList(new b[] { locala.b(), ca.e.a("fire-analytics", "22.2.0") });
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */