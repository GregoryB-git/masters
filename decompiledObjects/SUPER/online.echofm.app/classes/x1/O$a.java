package x1;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import kotlin.jvm.internal.Intrinsics;

public final class O$a
  implements Parcelable.Creator
{
  public O a(Parcel paramParcel)
  {
    Intrinsics.checkNotNullParameter(paramParcel, "source");
    return new O(paramParcel, null);
  }
  
  public O[] b(int paramInt)
  {
    return new O[paramInt];
  }
}

/* Location:
 * Qualified Name:     x1.O.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */