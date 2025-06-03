package d6;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import java.util.Arrays;
import m6.h;
import m6.j;
import n6.a;

public final class l
  extends a
{
  public static final Parcelable.Creator<l> CREATOR = new e0();
  public final String a;
  public final String b;
  
  public l(String paramString1, String paramString2)
  {
    if (paramString1 != null)
    {
      paramString1 = paramString1.trim();
      j.f("Account identifier cannot be empty", paramString1);
      a = paramString1;
      j.e(paramString2);
      b = paramString2;
      return;
    }
    throw new NullPointerException("Account identifier cannot be null");
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof l)) {
      return false;
    }
    paramObject = (l)paramObject;
    return (h.a(a, a)) && (h.a(b, b));
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { a, b });
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
 * Qualified Name:     d6.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */