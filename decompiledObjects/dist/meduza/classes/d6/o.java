package d6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.ArrayList;
import n6.b;

public final class o
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    String str1 = null;
    String str2 = str1;
    String str3 = str2;
    Object localObject1 = str3;
    Object localObject2 = localObject1;
    Object localObject3 = localObject2;
    while (paramParcel.dataPosition() < i)
    {
      int j = paramParcel.readInt();
      switch ((char)j)
      {
      default: 
        b.t(j, paramParcel);
        break;
      case '\006': 
        localObject3 = (PendingIntent)b.e(paramParcel, j, PendingIntent.CREATOR);
        break;
      case '\005': 
        localObject2 = (GoogleSignInAccount)b.e(paramParcel, j, GoogleSignInAccount.CREATOR);
        break;
      case '\004': 
        localObject1 = b.g(j, paramParcel);
        break;
      case '\003': 
        str3 = b.f(j, paramParcel);
        break;
      case '\002': 
        str2 = b.f(j, paramParcel);
        break;
      case '\001': 
        str1 = b.f(j, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new a(str1, str2, str3, (ArrayList)localObject1, (GoogleSignInAccount)localObject2, (PendingIntent)localObject3);
  }
}

/* Location:
 * Qualified Name:     d6.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */