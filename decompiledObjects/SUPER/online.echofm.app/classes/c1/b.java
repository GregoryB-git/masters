package c1;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

public final class b
{
  public e a(long paramLong, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    Object localObject = Parcel.obtain();
    ((Parcel)localObject).unmarshall(paramArrayOfByte, paramInt1, paramInt2);
    ((Parcel)localObject).setDataPosition(0);
    paramArrayOfByte = ((Parcel)localObject).readBundle(Bundle.class.getClassLoader());
    ((Parcel)localObject).recycle();
    localObject = (ArrayList)g0.a.e(paramArrayOfByte.getParcelableArrayList("c"));
    return new e(g0.b.a(new a(), (List)localObject), paramLong, paramArrayOfByte.getLong("d"));
  }
}

/* Location:
 * Qualified Name:     c1.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */