package com.google.android.recaptcha.internal;

import android.content.Context;
import android.webkit.WebView;
import dc.p;
import rb.f;
import ub.e;
import vb.a;
import wb.i;

final class zzjc
  extends i
  implements p
{
  public zzjc(zzjd paramzzjd, Context paramContext, e parame)
  {
    super(2, parame);
  }
  
  public final e create(Object paramObject, e parame)
  {
    return new zzjc(zza, zzb, parame);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    Object localObject = a.a;
    f.b(paramObject);
    localObject = zzjd.zza(zza);
    paramObject = localObject;
    if (localObject == null) {
      paramObject = new WebView(zzb);
    }
    zzjd.zzb(zza, (WebView)paramObject);
    return paramObject;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzjc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */