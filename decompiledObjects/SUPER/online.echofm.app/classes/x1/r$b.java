package x1;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import kotlin.jvm.internal.Intrinsics;

public final class r$b
  implements Parcelable.Creator
{
  public r a(Parcel paramParcel)
  {
    Intrinsics.checkNotNullParameter(paramParcel, "parcel");
    return new r(paramParcel, null);
  }
  
  public r[] b(int paramInt)
  {
    return new r[paramInt];
  }
}

/* Location:
 * Qualified Name:     x1.r.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */