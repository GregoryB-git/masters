package Y1;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import kotlin.jvm.internal.Intrinsics;

public final class r$a
  implements Parcelable.Creator
{
  public r a(Parcel paramParcel)
  {
    Intrinsics.checkNotNullParameter(paramParcel, "source");
    return new r(paramParcel);
  }
  
  public r[] b(int paramInt)
  {
    return new r[paramInt];
  }
}

/* Location:
 * Qualified Name:     Y1.r.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */