package com.google.android.recaptcha.internal;

import dc.p;
import rb.f;
import rb.h;
import ub.e;
import vb.a;
import wb.i;

final class zzbg
  extends i
  implements p
{
  public zzbg(e parame)
  {
    super(2, parame);
  }
  
  public final e create(Object paramObject, e parame)
  {
    return new zzbg(parame);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    a locala = a.a;
    f.b(paramObject);
    Thread.currentThread().setPriority(8);
    return h.a;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzbg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */