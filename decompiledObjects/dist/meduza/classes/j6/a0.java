package j6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class a0
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    String str = null;
    Object localObject = str;
    boolean bool1 = false;
    boolean bool2 = bool1;
    boolean bool3 = bool2;
    boolean bool4 = bool3;
    while (paramParcel.dataPosition() < i)
    {
      int j = paramParcel.readInt();
      switch ((char)j)
      {
      default: 
        b.t(j, paramParcel);
        break;
      case '\006': 
        bool4 = b.k(j, paramParcel);
        break;
      case '\005': 
        bool3 = b.k(j, paramParcel);
        break;
      case '\004': 
        localObject = b.n(j, paramParcel);
        break;
      case '\003': 
        bool2 = b.k(j, paramParcel);
        break;
      case '\002': 
        bool1 = b.k(j, paramParcel);
        break;
      case '\001': 
        str = b.f(j, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new z(str, bool1, bool2, (IBinder)localObject, bool3, bool4);
  }
}

/* Location:
 * Qualified Name:     j6.a0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */