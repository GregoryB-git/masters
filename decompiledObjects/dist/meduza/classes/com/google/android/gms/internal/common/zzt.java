package com.google.android.gms.internal.common;

import java.util.Objects;
import org.jspecify.annotations.NullMarked;

@NullMarked
public final class zzt
{
  public static final CharSequence zza(Object paramObject, String paramString)
  {
    Objects.requireNonNull(paramObject);
    if ((paramObject instanceof CharSequence)) {
      paramObject = (CharSequence)paramObject;
    } else {
      paramObject = paramObject.toString();
    }
    return (CharSequence)paramObject;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.common.zzt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */