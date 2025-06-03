package x1;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import kotlin.jvm.internal.Intrinsics;

public final class l$a
  implements Parcelable.Creator
{
  public l a(Parcel paramParcel)
  {
    Intrinsics.checkNotNullParameter(paramParcel, "source");
    return new l(paramParcel);
  }
  
  public l[] b(int paramInt)
  {
    return new l[paramInt];
  }
}

/* Location:
 * Qualified Name:     x1.l.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */