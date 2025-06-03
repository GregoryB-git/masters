package android.support.customtabs.trusted;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class ITrustedWebActivityService$a
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
  
  public static void b(Parcel paramParcel, Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      paramParcel.writeInt(1);
      paramBundle.writeToParcel(paramParcel, 1);
    }
    else
    {
      paramParcel.writeInt(0);
    }
  }
}

/* Location:
 * Qualified Name:     android.support.customtabs.trusted.ITrustedWebActivityService.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */