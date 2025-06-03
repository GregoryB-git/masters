package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import dc.p;
import rb.f;
import rb.h;
import ub.e;
import vb.a;
import wb.i;

final class zziq
  extends i
  implements p
{
  public int zza;
  
  public zziq(zzja paramzzja, String paramString, e parame)
  {
    super(2, parame);
  }
  
  public final e create(Object paramObject, e parame)
  {
    return new zziq(zzb, zzc, parame);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    Object localObject1 = a.a;
    int i = zza;
    f.b(paramObject);
    if (i == 0)
    {
      paramObject = zzb;
      zza = 1;
      localObject2 = ((zzja)paramObject).zzw(this);
      paramObject = localObject2;
      if (localObject2 == localObject1) {
        return localObject1;
      }
    }
    Object localObject2 = zzc;
    localObject1 = (WebView)paramObject;
    paramObject = new StringBuilder();
    ((StringBuilder)paramObject).append("recaptcha.m.Main.execute(\"");
    ((StringBuilder)paramObject).append((String)localObject2);
    ((StringBuilder)paramObject).append("\")");
    ((WebView)localObject1).evaluateJavascript(((StringBuilder)paramObject).toString(), null);
    return h.a;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zziq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */