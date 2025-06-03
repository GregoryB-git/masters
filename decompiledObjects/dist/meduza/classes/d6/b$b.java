package d6;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import java.util.Arrays;
import m6.h;
import m6.j;
import n6.a;

public final class b$b
  extends a
{
  public static final Parcelable.Creator<b> CREATOR = new v();
  public final boolean a;
  public final String b;
  
  public b$b(String paramString, boolean paramBoolean)
  {
    if (paramBoolean) {
      j.i(paramString);
    }
    a = paramBoolean;
    b = paramString;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof b)) {
      return false;
    }
    paramObject = (b)paramObject;
    return (a == a) && (h.a(b, b));
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { Boolean.valueOf(a), b });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.t(paramParcel, 1, a);
    z.F(paramParcel, 2, b, false);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     d6.b.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */