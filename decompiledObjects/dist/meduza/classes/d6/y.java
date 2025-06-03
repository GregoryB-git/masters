package d6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import java.util.List;
import n6.b;

public final class y
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    PendingIntent localPendingIntent = null;
    Object localObject1 = localPendingIntent;
    Object localObject2 = localObject1;
    Object localObject3 = localObject2;
    Object localObject4 = localObject3;
    int j = 0;
    while (paramParcel.dataPosition() < i)
    {
      int k = paramParcel.readInt();
      switch ((char)k)
      {
      default: 
        b.t(k, paramParcel);
        break;
      case '\006': 
        j = b.o(k, paramParcel);
        break;
      case '\005': 
        localObject4 = b.f(k, paramParcel);
        break;
      case '\004': 
        localObject3 = b.g(k, paramParcel);
        break;
      case '\003': 
        localObject2 = b.f(k, paramParcel);
        break;
      case '\002': 
        localObject1 = b.f(k, paramParcel);
        break;
      case '\001': 
        localPendingIntent = (PendingIntent)b.e(paramParcel, k, PendingIntent.CREATOR);
      }
    }
    b.j(i, paramParcel);
    return new SaveAccountLinkingTokenRequest(localPendingIntent, (String)localObject1, (String)localObject2, (List)localObject3, (String)localObject4, j);
  }
}

/* Location:
 * Qualified Name:     d6.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */