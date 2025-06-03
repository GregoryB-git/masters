package b8;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;

public final class u
  extends f
{
  public static final Parcelable.Creator<u> CREATOR = new s0();
  public final String a;
  public final String b;
  
  public u(String paramString1, String paramString2)
  {
    if ((paramString1 == null) && (paramString2 == null)) {
      throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
    }
    if ((paramString1 != null) && (paramString1.length() == 0)) {
      throw new IllegalArgumentException("idToken cannot be empty");
    }
    if ((paramString2 != null) && (paramString2.length() == 0)) {
      throw new IllegalArgumentException("accessToken cannot be empty");
    }
    a = paramString1;
    b = paramString2;
  }
  
  public final String D()
  {
    return "google.com";
  }
  
  public final String E()
  {
    return "google.com";
  }
  
  public final f F()
  {
    return new u(a, b);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.F(paramParcel, 1, a, false);
    z.F(paramParcel, 2, b, false);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     b8.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */