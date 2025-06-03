package com.google.android.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class a
  implements IInterface
{
  private final IBinder a;
  private final String b;
  
  public a(IBinder paramIBinder)
  {
    a = paramIBinder;
    b = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";
  }
  
  public final Parcel a()
  {
    Parcel localParcel = Parcel.obtain();
    localParcel.writeInterfaceToken(b);
    return localParcel;
  }
  
  public final IBinder asBinder()
  {
    return a;
  }
  
  /* Error */
  public final Parcel b(Parcel paramParcel)
    throws android.os.RemoteException
  {
    // Byte code:
    //   0: invokestatic 28	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield 17	com/google/android/a/a:a	Landroid/os/IBinder;
    //   8: iconst_1
    //   9: aload_1
    //   10: aload_2
    //   11: iconst_0
    //   12: invokeinterface 45 5 0
    //   17: pop
    //   18: aload_2
    //   19: invokevirtual 48	android/os/Parcel:readException	()V
    //   22: aload_1
    //   23: invokevirtual 51	android/os/Parcel:recycle	()V
    //   26: aload_2
    //   27: areturn
    //   28: astore_2
    //   29: goto +10 -> 39
    //   32: astore_3
    //   33: aload_2
    //   34: invokevirtual 51	android/os/Parcel:recycle	()V
    //   37: aload_3
    //   38: athrow
    //   39: aload_1
    //   40: invokevirtual 51	android/os/Parcel:recycle	()V
    //   43: aload_2
    //   44: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	45	0	this	a
    //   0	45	1	paramParcel	Parcel
    //   3	24	2	localParcel	Parcel
    //   28	16	2	localObject	Object
    //   32	6	3	localRuntimeException	RuntimeException
    // Exception table:
    //   from	to	target	type
    //   4	22	28	finally
    //   33	39	28	finally
    //   4	22	32	java/lang/RuntimeException
  }
}

/* Location:
 * Qualified Name:     com.google.android.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */