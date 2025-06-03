package com.google.android.recaptcha.internal;

import java.util.Iterator;

public abstract class zzjk
  implements Iterable
{
  public final String toString()
  {
    Iterator localIterator = iterator();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append('[');
    for (int i = 1; localIterator.hasNext(); i = 0)
    {
      if (i == 0) {
        localStringBuilder.append(", ");
      }
      localStringBuilder.append(localIterator.next());
    }
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzjk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */