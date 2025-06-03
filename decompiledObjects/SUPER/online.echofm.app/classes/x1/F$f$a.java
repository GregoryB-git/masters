package x1;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import kotlin.jvm.internal.Intrinsics;

public final class F$f$a
  implements Parcelable.Creator
{
  public F.f a(Parcel paramParcel)
  {
    Intrinsics.checkNotNullParameter(paramParcel, "source");
    return new F.f(paramParcel, null);
  }
  
  public F.f[] b(int paramInt)
  {
    return new F.f[paramInt];
  }
}

/* Location:
 * Qualified Name:     x1.F.f.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */