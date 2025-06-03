package androidx.media2.common;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.util.Log;
import androidx.versionedparcelable.ParcelImpl;
import java.util.ArrayList;
import java.util.List;

public class ParcelImplListSlice
  implements Parcelable
{
  public static final Parcelable.Creator<ParcelImplListSlice> CREATOR = new b();
  public final List<ParcelImpl> a;
  
  public ParcelImplListSlice(Parcel paramParcel)
  {
    int i = paramParcel.readInt();
    a = new ArrayList(i);
    if (i <= 0) {
      return;
    }
    Object localObject1;
    for (int j = 0; (j < i) && (paramParcel.readInt() != 0); j++)
    {
      localObject1 = (ParcelImpl)paramParcel.readParcelable(ParcelImpl.class.getClassLoader());
      a.add(localObject1);
    }
    if (j >= i) {
      return;
    }
    Object localObject2 = paramParcel.readStrongBinder();
    while (j < i)
    {
      paramParcel = Parcel.obtain();
      localObject1 = Parcel.obtain();
      try
      {
        paramParcel.writeInt(j);
        try
        {
          ((IBinder)localObject2).transact(1, paramParcel, (Parcel)localObject1, 0);
          while ((j < i) && (((Parcel)localObject1).readInt() != 0))
          {
            ParcelImpl localParcelImpl = (ParcelImpl)((Parcel)localObject1).readParcelable(ParcelImpl.class.getClassLoader());
            a.add(localParcelImpl);
            j++;
          }
        }
        catch (RemoteException localRemoteException)
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          ((StringBuilder)localObject2).append("Failure retrieving array; only received ");
          ((StringBuilder)localObject2).append(j);
          ((StringBuilder)localObject2).append(" of ");
          ((StringBuilder)localObject2).append(i);
          Log.w("ParcelImplListSlice", ((StringBuilder)localObject2).toString(), localRemoteException);
          return;
        }
        return;
      }
      finally
      {
        ((Parcel)localObject1).recycle();
        paramParcel.recycle();
      }
    }
  }
  
  public ParcelImplListSlice(ArrayList paramArrayList)
  {
    a = paramArrayList;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    final int i = a.size();
    paramParcel.writeInt(i);
    if (i > 0)
    {
      for (int j = 0; (j < i) && (j < 1) && (paramParcel.dataSize() < 65536); j++)
      {
        paramParcel.writeInt(1);
        paramParcel.writeParcelable((ParcelImpl)a.get(j), paramInt);
      }
      if (j < i)
      {
        paramParcel.writeInt(0);
        paramParcel.writeStrongBinder(new a(i));
      }
    }
  }
  
  public final class a
    extends Binder
  {
    public a(int paramInt) {}
    
    public final boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      if (paramInt1 != 1) {
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      }
      for (paramInt1 = paramParcel1.readInt(); (paramInt1 < i) && (paramParcel2.dataSize() < 65536); paramInt1++)
      {
        paramParcel2.writeInt(1);
        paramParcel2.writeParcelable((ParcelImpl)a.get(paramInt1), paramInt2);
      }
      if (paramInt1 < i) {
        paramParcel2.writeInt(0);
      }
      return true;
    }
  }
  
  public final class b
    implements Parcelable.Creator<ParcelImplListSlice>
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      return new ParcelImplListSlice(paramParcel);
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new ParcelImplListSlice[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     androidx.media2.common.ParcelImplListSlice
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */