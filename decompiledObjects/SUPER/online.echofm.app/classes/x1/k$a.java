package x1;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import kotlin.jvm.internal.Intrinsics;

public final class k$a
  implements Parcelable.Creator
{
  public k a(Parcel paramParcel)
  {
    Intrinsics.checkNotNullParameter(paramParcel, "source");
    return new k(paramParcel);
  }
  
  public k[] b(int paramInt)
  {
    return new k[paramInt];
  }
}

/* Location:
 * Qualified Name:     x1.k.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */