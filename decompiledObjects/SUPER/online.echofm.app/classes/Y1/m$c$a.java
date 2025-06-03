package Y1;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import kotlin.jvm.internal.Intrinsics;

public final class m$c$a
  implements Parcelable.Creator
{
  public m.c a(Parcel paramParcel)
  {
    Intrinsics.checkNotNullParameter(paramParcel, "parcel");
    return new m.c(paramParcel);
  }
  
  public m.c[] b(int paramInt)
  {
    return new m.c[paramInt];
  }
}

/* Location:
 * Qualified Name:     Y1.m.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */