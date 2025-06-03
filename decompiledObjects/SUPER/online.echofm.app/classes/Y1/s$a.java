package Y1;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import kotlin.jvm.internal.Intrinsics;

public final class s$a
  implements Parcelable.Creator
{
  public s a(Parcel paramParcel)
  {
    Intrinsics.checkNotNullParameter(paramParcel, "source");
    return new s(paramParcel);
  }
  
  public s[] b(int paramInt)
  {
    return new s[paramInt];
  }
}

/* Location:
 * Qualified Name:     Y1.s.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */