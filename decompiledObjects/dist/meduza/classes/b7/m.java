package b7;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import java.util.Arrays;
import m6.h;
import m6.j;

public final class m
  extends n
{
  public static final Parcelable.Creator<m> CREATOR = new w1();
  public final x a;
  public final Uri b;
  public final byte[] c;
  
  public m(x paramx, Uri paramUri, byte[] paramArrayOfByte)
  {
    j.i(paramx);
    a = paramx;
    j.i(paramUri);
    paramx = paramUri.getScheme();
    boolean bool1 = false;
    boolean bool2;
    if (paramx != null) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    j.a("origin scheme must be non-empty", bool2);
    if (paramUri.getAuthority() != null) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    j.a("origin authority must be non-empty", bool2);
    b = paramUri;
    if (paramArrayOfByte != null)
    {
      bool2 = bool1;
      if (paramArrayOfByte.length != 32) {}
    }
    else
    {
      bool2 = true;
    }
    j.a("clientDataHash must be 32 bytes long", bool2);
    c = paramArrayOfByte;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof m)) {
      return false;
    }
    paramObject = (m)paramObject;
    return (h.a(a, a)) && (h.a(b, b));
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { a, b });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = z.J(20293, paramParcel);
    z.E(paramParcel, 2, a, paramInt, false);
    z.E(paramParcel, 3, b, paramInt, false);
    z.w(paramParcel, 4, c, false);
    z.L(i, paramParcel);
  }
}

/* Location:
 * Qualified Name:     b7.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */