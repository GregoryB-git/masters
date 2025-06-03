package h7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;
import k6.j;
import n6.a;

public final class f
  extends a
  implements j
{
  public static final Parcelable.Creator<f> CREATOR = new g();
  public final List a;
  public final String b;
  
  public f(String paramString, ArrayList paramArrayList)
  {
    a = paramArrayList;
    b = paramString;
  }
  
  public final Status getStatus()
  {
    if (b != null) {
      return Status.e;
    }
    return Status.q;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    List localList = a;
    paramInt = z.J(20293, paramParcel);
    z.G(paramParcel, 1, localList);
    z.F(paramParcel, 2, b, false);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     h7.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */