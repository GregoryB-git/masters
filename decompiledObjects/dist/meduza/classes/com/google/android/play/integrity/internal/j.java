package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.Parcel;
import m7.l;
import m7.q;

public abstract class j
  extends b
  implements q
{
  public j()
  {
    super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
  }
  
  public final boolean a(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    if (paramInt1 != 2)
    {
      if (paramInt1 != 3)
      {
        if (paramInt1 != 4)
        {
          if (paramInt1 != 5) {
            return false;
          }
          paramParcel2 = (Bundle)l.a(paramParcel1, Bundle.CREATOR);
          l.b(paramParcel1);
          b(paramParcel2);
        }
        else
        {
          paramParcel2 = (Bundle)l.a(paramParcel1, Bundle.CREATOR);
          l.b(paramParcel1);
          d(paramParcel2);
        }
      }
      else
      {
        paramParcel2 = (Bundle)l.a(paramParcel1, Bundle.CREATOR);
        l.b(paramParcel1);
        c(paramParcel2);
      }
    }
    else
    {
      paramParcel2 = (Bundle)l.a(paramParcel1, Bundle.CREATOR);
      l.b(paramParcel1);
      e(paramParcel2);
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.play.integrity.internal.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */