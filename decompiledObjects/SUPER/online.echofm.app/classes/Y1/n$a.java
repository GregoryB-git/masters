package Y1;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import kotlin.jvm.internal.Intrinsics;

public final class n$a
  implements Parcelable.Creator
{
  public n a(Parcel paramParcel)
  {
    Intrinsics.checkNotNullParameter(paramParcel, "source");
    return new n(paramParcel);
  }
  
  public n[] b(int paramInt)
  {
    return new n[paramInt];
  }
}

/* Location:
 * Qualified Name:     Y1.n.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */