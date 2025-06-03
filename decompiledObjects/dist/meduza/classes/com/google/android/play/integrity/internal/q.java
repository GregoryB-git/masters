package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.Parcel;
import m7.l;
import m7.u;

public abstract class q
  extends b
  implements u
{
  public q()
  {
    super("com.google.android.play.core.integrity.protocol.IRequestDialogCallback");
  }
  
  public final boolean a(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    if (paramInt1 == 2)
    {
      paramParcel2 = (Bundle)l.a(paramParcel1, Bundle.CREATOR);
      l.b(paramParcel1);
      b(paramParcel2);
      return true;
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.play.integrity.internal.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */