package c7;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public enum a$a
  implements Parcelable
{
  public static final Parcelable.Creator<a> CREATOR = new f();
  public final int a;
  
  static
  {
    a locala1 = new a("ABSENT", 0, 0);
    b = locala1;
    a locala2 = new a("STRING", 1, 1);
    c = locala2;
    d = new a[] { locala1, locala2, new a("OBJECT", 2, 2) };
  }
  
  public a$a(int paramInt1)
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
}

/* Location:
 * Qualified Name:     c7.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */