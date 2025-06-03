package x4;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import s4.b;

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
  
  public final class a
    implements Parcelable.Creator<a>
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      return new a(paramParcel);
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new a[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     x4.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */