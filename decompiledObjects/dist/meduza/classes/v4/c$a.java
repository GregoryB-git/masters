package v4;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

public final class c$a
  implements Parcelable.Creator<c>
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    ArrayList localArrayList = new ArrayList();
    paramParcel.readList(localArrayList, c.b.class.getClassLoader());
    return new c(localArrayList);
  }
  
  public final Object[] newArray(int paramInt)
  {
    return new c[paramInt];
  }
}

/* Location:
 * Qualified Name:     v4.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */