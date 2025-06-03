package b7;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public enum g1
  implements Parcelable
{
  public static final Parcelable.Creator<g1> CREATOR = new e1();
  public final String a;
  
  public g1(String paramString1)
  {
    a = paramString1;
  }
  
  public static g1 f(String paramString)
  {
    for (g1 localg1 : ) {
      if (paramString.equals(a)) {
        return localg1;
      }
    }
    throw new f1(paramString);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String toString()
  {
    return a;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(a);
  }
}

/* Location:
 * Qualified Name:     b7.g1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */