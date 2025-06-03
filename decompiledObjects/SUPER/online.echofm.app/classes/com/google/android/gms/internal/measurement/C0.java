package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

public abstract class C0
  extends b0
  implements E0
{
  public C0()
  {
    super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
  }
  
  public final boolean n(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    if (paramInt1 != 1)
    {
      if (paramInt1 != 2) {
        return false;
      }
      paramInt1 = a();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
    }
    else
    {
      String str1 = paramParcel1.readString();
      String str2 = paramParcel1.readString();
      Bundle localBundle = (Bundle)a0.a(paramParcel1, Bundle.CREATOR);
      long l = paramParcel1.readLong();
      a0.f(paramParcel1);
      L(str1, str2, localBundle, l);
      paramParcel2.writeNoException();
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.C0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */