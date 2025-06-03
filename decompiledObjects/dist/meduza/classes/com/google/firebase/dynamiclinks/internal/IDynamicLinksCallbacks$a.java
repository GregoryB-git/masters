package com.google.firebase.dynamiclinks.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class IDynamicLinksCallbacks$a
{
  public static Object a(Parcel paramParcel, Parcelable.Creator paramCreator)
  {
    if (paramParcel.readInt() != 0) {
      paramParcel = paramCreator.createFromParcel(paramParcel);
    } else {
      paramParcel = null;
    }
    return paramParcel;
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */