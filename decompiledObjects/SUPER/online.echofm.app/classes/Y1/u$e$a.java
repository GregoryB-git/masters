package Y1;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import kotlin.jvm.internal.Intrinsics;

public final class u$e$a
  implements Parcelable.Creator
{
  public u.e a(Parcel paramParcel)
  {
    Intrinsics.checkNotNullParameter(paramParcel, "source");
    return new u.e(paramParcel, null);
  }
  
  public u.e[] b(int paramInt)
  {
    return new u.e[paramInt];
  }
}

/* Location:
 * Qualified Name:     Y1.u.e.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */