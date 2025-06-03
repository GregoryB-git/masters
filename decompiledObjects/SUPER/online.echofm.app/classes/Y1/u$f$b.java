package Y1;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import kotlin.jvm.internal.Intrinsics;

public final class u$f$b
  implements Parcelable.Creator
{
  public u.f a(Parcel paramParcel)
  {
    Intrinsics.checkNotNullParameter(paramParcel, "source");
    return new u.f(paramParcel, null);
  }
  
  public u.f[] b(int paramInt)
  {
    return new u.f[paramInt];
  }
}

/* Location:
 * Qualified Name:     Y1.u.f.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */