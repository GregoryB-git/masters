package com.google.android.recaptcha.internal;

import java.util.Iterator;

final class zznq
  implements Iterator
{
  private final Iterator zza;
  
  public zznq(Iterator paramIterator)
  {
    zza = paramIterator;
  }
  
  public final boolean hasNext()
  {
    return zza.hasNext();
  }
  
  public final void remove()
  {
    zza.remove();
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zznq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */