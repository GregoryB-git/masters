package u4;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import o7.t;

public final class l$a
  implements Parcelable.Creator<l>
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    String str1 = paramParcel.readString();
    str1.getClass();
    String str2 = paramParcel.readString();
    paramParcel = paramParcel.createStringArray();
    paramParcel.getClass();
    return new l(str1, str2, t.q(paramParcel));
  }
  
  public final Object[] newArray(int paramInt)
  {
    return new l[paramInt];
  }
}

/* Location:
 * Qualified Name:     u4.l.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */