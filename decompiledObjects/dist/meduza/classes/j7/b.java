package j7;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public abstract class b
  implements Parcelable
{
  public static final Parcelable.Creator<b> CREATOR = new d();
  
  public abstract PendingIntent a();
  
  public abstract boolean b();
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeParcelable(a(), 0);
    paramParcel.writeInt(b());
  }
}

/* Location:
 * Qualified Name:     j7.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */