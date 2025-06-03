package androidx.media2.common;

import android.os.Binder;
import android.os.Parcel;
import androidx.versionedparcelable.ParcelImpl;
import java.util.List;

public final class ParcelImplListSlice$a
  extends Binder
{
  public ParcelImplListSlice$a(ParcelImplListSlice paramParcelImplListSlice, int paramInt) {}
  
  public final boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    if (paramInt1 != 1) {
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (paramInt1 = paramParcel1.readInt(); (paramInt1 < a) && (paramParcel2.dataSize() < 65536); paramInt1++)
    {
      paramParcel2.writeInt(1);
      paramParcel2.writeParcelable((ParcelImpl)b.a.get(paramInt1), paramInt2);
    }
    if (paramInt1 < a) {
      paramParcel2.writeInt(0);
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     androidx.media2.common.ParcelImplListSlice.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */