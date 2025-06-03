package W0;

import R0.b;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class a
  extends b
{
  public static final Parcelable.Creator<a> CREATOR = new a();
  
  public a(Parcel paramParcel)
  {
    super(paramParcel);
  }
  
  public a(String paramString1, String paramString2)
  {
    super(paramString1, paramString2);
  }
  
  public class a
    implements Parcelable.Creator
  {
    public a a(Parcel paramParcel)
    {
      return new a(paramParcel);
    }
    
    public a[] b(int paramInt)
    {
      return new a[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     W0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */