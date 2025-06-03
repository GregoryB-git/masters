package c7;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import java.util.ArrayList;
import n6.b;

public final class k
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    Integer localInteger = null;
    Object localObject1 = localInteger;
    Object localObject2 = localObject1;
    Object localObject3 = localObject2;
    Object localObject4 = localObject3;
    Object localObject5 = localObject4;
    Object localObject6 = localObject5;
    while (paramParcel.dataPosition() < i)
    {
      int j = paramParcel.readInt();
      switch ((char)j)
      {
      default: 
        b.t(j, paramParcel);
        break;
      case '\b': 
        localObject6 = b.f(j, paramParcel);
        break;
      case '\007': 
        localObject5 = (a)b.e(paramParcel, j, a.CREATOR);
        break;
      case '\006': 
        localObject4 = b.i(paramParcel, j, e.CREATOR);
        break;
      case '\005': 
        localObject3 = b.i(paramParcel, j, d.CREATOR);
        break;
      case '\004': 
        localObject2 = (Uri)b.e(paramParcel, j, Uri.CREATOR);
        break;
      case '\003': 
        localObject1 = b.m(j, paramParcel);
        break;
      case '\002': 
        localInteger = b.p(j, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new RegisterRequestParams(localInteger, (Double)localObject1, (Uri)localObject2, (ArrayList)localObject3, (ArrayList)localObject4, (a)localObject5, (String)localObject6);
  }
}

/* Location:
 * Qualified Name:     c7.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */