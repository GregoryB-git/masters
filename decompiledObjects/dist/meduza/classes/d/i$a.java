package d;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class i$a
  implements Parcelable.Creator<i>
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    ec.i.e(paramParcel, "inParcel");
    Parcelable localParcelable = paramParcel.readParcelable(IntentSender.class.getClassLoader());
    ec.i.b(localParcelable);
    return new i((IntentSender)localParcelable, (Intent)paramParcel.readParcelable(Intent.class.getClassLoader()), paramParcel.readInt(), paramParcel.readInt());
  }
  
  public final Object[] newArray(int paramInt)
  {
    return new i[paramInt];
  }
}

/* Location:
 * Qualified Name:     d.i.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */