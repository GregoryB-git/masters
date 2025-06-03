package x1;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import kotlin.jvm.internal.Intrinsics;

public final class i$a
  implements Parcelable.Creator
{
  public i a(Parcel paramParcel)
  {
    Intrinsics.checkNotNullParameter(paramParcel, "source");
    return new i(paramParcel);
  }
  
  public i[] b(int paramInt)
  {
    return new i[paramInt];
  }
}

/* Location:
 * Qualified Name:     x1.i.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */