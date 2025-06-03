package Y1;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import kotlin.jvm.internal.Intrinsics;

public final class c$a
  implements Parcelable.Creator
{
  public c a(Parcel paramParcel)
  {
    Intrinsics.checkNotNullParameter(paramParcel, "source");
    return new c(paramParcel);
  }
  
  public c[] b(int paramInt)
  {
    return new c[paramInt];
  }
}

/* Location:
 * Qualified Name:     Y1.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */