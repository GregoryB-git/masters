package Y1;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import kotlin.jvm.internal.Intrinsics;

public final class G$b
  implements Parcelable.Creator
{
  public G a(Parcel paramParcel)
  {
    Intrinsics.checkNotNullParameter(paramParcel, "source");
    return new G(paramParcel);
  }
  
  public G[] b(int paramInt)
  {
    return new G[paramInt];
  }
}

/* Location:
 * Qualified Name:     Y1.G.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */