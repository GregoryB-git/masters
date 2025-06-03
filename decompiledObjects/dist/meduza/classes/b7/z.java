package b7;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public enum z
  implements Parcelable
{
  public static final Parcelable.Creator<z> CREATOR = new y0();
  
  public z() {}
  
  public static z f(String paramString)
  {
    for (z localz : )
    {
      localz.getClass();
      if (paramString.equals("public-key")) {
        return localz;
      }
    }
    throw new a(String.format("PublicKeyCredentialType %s not supported", new Object[] { paramString }));
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String toString()
  {
    return "public-key";
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString("public-key");
  }
  
  public static final class a
    extends Exception
  {
    public a(String paramString)
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     b7.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */