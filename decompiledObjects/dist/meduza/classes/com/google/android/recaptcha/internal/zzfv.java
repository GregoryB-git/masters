package com.google.android.recaptcha.internal;

import a0.j;
import android.webkit.WebView;
import dc.p;
import java.util.ArrayList;
import rb.f;
import rb.h;
import sb.q;
import ub.e;
import vb.a;
import wb.i;

final class zzfv
  extends i
  implements p
{
  public zzfv(String[] paramArrayOfString, zzfw paramzzfw, String paramString, e parame)
  {
    super(2, parame);
  }
  
  public final e create(Object paramObject, e parame)
  {
    return new zzfv(zza, zzb, zzc, parame);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    Object localObject1 = a.a;
    f.b(paramObject);
    String[] arrayOfString = zza;
    int i = arrayOfString.length;
    paramObject = new ArrayList(i);
    for (int j = 0; j < i; j++)
    {
      localObject1 = arrayOfString[j];
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("\"");
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append("\"");
      ((ArrayList)paramObject).add(((StringBuilder)localObject2).toString());
    }
    localObject1 = zzb;
    Object localObject2 = zzc;
    zzfw.zza((zzfw)localObject1).evaluateJavascript(j.k((String)localObject2, "(", q.p((Iterable)paramObject, ",", null, null, null, 62), ")"), null);
    return h.a;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzfv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */