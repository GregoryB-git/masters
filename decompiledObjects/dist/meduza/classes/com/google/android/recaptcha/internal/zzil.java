package com.google.android.recaptcha.internal;

import android.webkit.WebSettings;
import android.webkit.WebView;
import dc.p;
import rb.f;
import rb.h;
import ub.e;
import vb.a;
import wb.i;

final class zzil
  extends i
  implements p
{
  public Object zza;
  public int zzb;
  
  public zzil(zzja paramzzja, e parame)
  {
    super(2, parame);
  }
  
  public final e create(Object paramObject, e parame)
  {
    return new zzil(zzc, parame);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    a locala = a.a;
    int i = zzb;
    Object localObject;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2)
        {
          f.b(paramObject);
          localObject = paramObject;
          if (i == 3) {
            break label160;
          }
          break label208;
        }
        localObject = (zzja)zza;
        f.b(paramObject);
        break label121;
      }
      f.b(paramObject);
    }
    else
    {
      f.b(paramObject);
      paramObject = zzc;
      zzb = 1;
      paramObject = ((zzja)paramObject).zzw(this);
      if (paramObject == locala) {
        return locala;
      }
    }
    ((WebView)paramObject).removeJavascriptInterface("RN");
    paramObject = zzc;
    zza = paramObject;
    zzb = 2;
    paramObject = ((zzja)paramObject).zzw(this);
    if (paramObject != locala)
    {
      label121:
      ((WebView)paramObject).getSettings().setJavaScriptEnabled(true);
      paramObject = zzc;
      zza = null;
      zzb = 3;
      localObject = ((zzja)paramObject).zzw(this);
      if (localObject != locala)
      {
        label160:
        paramObject = zzc;
        ((WebView)localObject).addJavascriptInterface(((zzja)paramObject).zzq(), "RN");
        paramObject = zzc;
        zzb = 4;
        localObject = ((zzja)paramObject).zzw(this);
        paramObject = localObject;
        if (localObject != locala)
        {
          label208:
          localObject = zzc;
          ((WebView)paramObject).setWebViewClient(new zzik((zzja)localObject));
          return h.a;
        }
      }
    }
    return locala;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */