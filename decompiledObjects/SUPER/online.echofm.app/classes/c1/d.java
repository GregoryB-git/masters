package c1;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import g0.b;
import java.util.List;

public final class d
{
  public byte[] a(List paramList, long paramLong)
  {
    paramList = b.b(paramList, new c());
    Object localObject = new Bundle();
    ((Bundle)localObject).putParcelableArrayList("c", paramList);
    ((BaseBundle)localObject).putLong("d", paramLong);
    paramList = Parcel.obtain();
    paramList.writeBundle((Bundle)localObject);
    localObject = paramList.marshall();
    paramList.recycle();
    return (byte[])localObject;
  }
}

/* Location:
 * Qualified Name:     c1.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */