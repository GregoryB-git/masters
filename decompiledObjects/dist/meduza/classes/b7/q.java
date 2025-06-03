package b7;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Locale;

public enum q
  implements Parcelable
{
  public static final Parcelable.Creator<q> CREATOR = new e2();
  public final int a;
  
  public q(int paramInt1)
  {
    a = paramInt1;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(a);
  }
  
  public static final class a
    extends Exception
  {
    public a(int paramInt)
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     b7.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */