package com.google.android.play.core.review.internal;

import android.os.IBinder;
import android.os.IInterface;
import k7.b;
import k7.c;

public abstract class zze
  extends zzb
  implements c
{
  public static c zzb(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
    if ((localIInterface instanceof c)) {
      return (c)localIInterface;
    }
    return new b(paramIBinder);
  }
}

/* Location:
 * Qualified Name:     com.google.android.play.core.review.internal.zze
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */