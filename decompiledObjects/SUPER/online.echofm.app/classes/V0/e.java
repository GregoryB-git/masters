package V0;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class e
  extends b
{
  public static final Parcelable.Creator<e> CREATOR = new a();
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {}
  
  public class a
    implements Parcelable.Creator
  {
    public e a(Parcel paramParcel)
    {
      return new e();
    }
    
    public e[] b(int paramInt)
    {
      return new e[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     V0.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */