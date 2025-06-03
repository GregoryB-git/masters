package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.Parcel;
import m7.l;
import m7.t;

public abstract class o
  extends b
  implements t
{
  public o()
  {
    super("com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
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
 * Qualified Name:     com.google.android.play.integrity.internal.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */