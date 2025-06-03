package U0;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

public class b$a
  implements Parcelable.Creator
{
  public b a(Parcel paramParcel)
  {
    ArrayList localArrayList = new ArrayList();
    paramParcel.readList(localArrayList, b.b.class.getClassLoader());
    return new b(localArrayList);
  }
  
  public b[] b(int paramInt)
  {
    return new b[paramInt];
  }
}

/* Location:
 * Qualified Name:     U0.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */