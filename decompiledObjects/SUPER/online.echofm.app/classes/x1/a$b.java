package x1;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import kotlin.jvm.internal.Intrinsics;

public final class a$b
  implements Parcelable.Creator
{
  public a a(Parcel paramParcel)
  {
    Intrinsics.checkNotNullParameter(paramParcel, "source");
    return new a(paramParcel);
  }
  
  public a[] b(int paramInt)
  {
    return new a[paramInt];
  }
}

/* Location:
 * Qualified Name:     x1.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */