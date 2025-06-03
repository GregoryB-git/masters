package Y1;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import kotlin.jvm.internal.Intrinsics;

public final class u$b
  implements Parcelable.Creator
{
  public u a(Parcel paramParcel)
  {
    Intrinsics.checkNotNullParameter(paramParcel, "source");
    return new u(paramParcel);
  }
  
  public u[] b(int paramInt)
  {
    return new u[paramInt];
  }
}

/* Location:
 * Qualified Name:     Y1.u.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */