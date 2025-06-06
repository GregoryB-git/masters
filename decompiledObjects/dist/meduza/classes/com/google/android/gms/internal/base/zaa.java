package com.google.android.gms.internal.base;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class zaa
  implements IInterface
{
  private final IBinder zaa;
  private final String zab;
  
  public zaa(IBinder paramIBinder, String paramString)
  {
    zaa = paramIBinder;
    zab = paramString;
  }
  
  public final IBinder asBinder()
  {
    return zaa;
  }
  
  public final Parcel zaa()
  {
    Parcel localParcel = Parcel.obtain();
    localParcel.writeInterfaceToken(zab);
    return localParcel;
  }
  
  /* Error */
  public final Parcel zab(int paramInt, Parcel paramParcel)
  {
    // Byte code:
    //   0: invokestatic 28	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_3
    //   4: aload_0
    //   5: getfield 17	com/google/android/gms/internal/base/zaa:zaa	Landroid/os/IBinder;
    //   8: iconst_2
    //   9: aload_2
    //   10: aload_3
    //   11: iconst_0
    //   12: invokeinterface 41 5 0
    //   17: pop
    //   18: aload_3
    //   19: invokevirtual 44	android/os/Parcel:readException	()V
    //   22: aload_2
    //   23: invokevirtual 47	android/os/Parcel:recycle	()V
    //   26: aload_3
    //   27: areturn
    //   28: astore_3
    //   29: goto +12 -> 41
    //   32: astore 4
    //   34: aload_3
    //   35: invokevirtual 47	android/os/Parcel:recycle	()V
    //   38: aload 4
    //   40: athrow
    //   41: aload_2
    //   42: invokevirtual 47	android/os/Parcel:recycle	()V
    //   45: aload_3
    //   46: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	47	0	this	zaa
    //   0	47	1	paramInt	int
    //   0	47	2	paramParcel	Parcel
    //   3	24	3	localParcel	Parcel
    //   28	18	3	localObject	Object
    //   32	7	4	localRuntimeException	RuntimeException
    // Exception table:
    //   from	to	target	type
    //   4	22	28	finally
    //   34	41	28	finally
    //   4	22	32	java/lang/RuntimeException
  }
  
  public final void zac(int paramInt, Parcel paramParcel)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      zaa.transact(paramInt, paramParcel, localParcel, 0);
      localParcel.readException();
      return;
    }
    finally
    {
      paramParcel.recycle();
      localParcel.recycle();
    }
  }
  
  public final void zad(int paramInt, Parcel paramParcel)
  {
    try
    {
      zaa.transact(1, paramParcel, null, 1);
      return;
    }
    finally
    {
      paramParcel.recycle();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.base.zaa
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */