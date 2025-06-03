package Y1;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import kotlin.jvm.internal.Intrinsics;

public final class q$a
  implements Parcelable.Creator
{
  public q a(Parcel paramParcel)
  {
    Intrinsics.checkNotNullParameter(paramParcel, "source");
    return new q(paramParcel);
  }
  
  public q[] b(int paramInt)
  {
    return new q[paramInt];
  }
}

/* Location:
 * Qualified Name:     Y1.q.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */