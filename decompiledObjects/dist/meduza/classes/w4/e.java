package w4;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class e
  extends b
{
  public static final Parcelable.Creator<e> CREATOR = new a();
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {}
  
  public final class a
    implements Parcelable.Creator<e>
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      return new e();
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new e[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     w4.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */