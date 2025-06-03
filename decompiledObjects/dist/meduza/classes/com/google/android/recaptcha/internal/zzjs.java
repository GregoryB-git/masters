package com.google.android.recaptcha.internal;

import java.nio.charset.Charset;

abstract class zzjs
  implements zzjw
{
  public final zzjv zza(CharSequence paramCharSequence, Charset paramCharset)
  {
    zzjx localzzjx = zzb();
    paramCharSequence = paramCharSequence.toString().getBytes(paramCharset);
    paramCharSequence.getClass();
    int i = paramCharSequence.length;
    ((zzjr)localzzjx).zza(paramCharSequence, 0, i);
    return localzzjx.zzb();
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzjs
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */