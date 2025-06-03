package J2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class a
  implements IInterface
{
  public final IBinder b;
  public final String c;
  
  public a(IBinder paramIBinder, String paramString)
  {
    b = paramIBinder;
    c = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";
  }
  
  public final IBinder asBinder()
  {
    return b;
  }
  
  public final Parcel n()
  {
    Parcel localParcel = Parcel.obtain();
    localParcel.writeInterfaceToken(c);
    return localParcel;
  }
  
  /* Error */
  public final Parcel o(int paramInt, Parcel paramParcel)
  {
    // Byte code:
    //   0: invokestatic 31	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_3
    //   4: aload_0
    //   5: getfield 17	J2/a:b	Landroid/os/IBinder;
    //   8: iload_1
    //   9: aload_2
    //   10: aload_3
    //   11: iconst_0
    //   12: invokeinterface 45 5 0
    //   17: pop
    //   18: aload_3
    //   19: invokevirtual 48	android/os/Parcel:readException	()V
    //   22: aload_2
    //   23: invokevirtual 51	android/os/Parcel:recycle	()V
    //   26: aload_3
    //   27: areturn
    //   28: astore 4
    //   30: goto +12 -> 42
    //   33: astore 4
    //   35: aload_3
    //   36: invokevirtual 51	android/os/Parcel:recycle	()V
    //   39: aload 4
    //   41: athrow
    //   42: aload_2
    //   43: invokevirtual 51	android/os/Parcel:recycle	()V
    //   46: aload 4
    //   48: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	49	0	this	a
    //   0	49	1	paramInt	int
    //   0	49	2	paramParcel	Parcel
    //   3	33	3	localParcel	Parcel
    //   28	1	4	localObject	Object
    //   33	14	4	localRuntimeException	RuntimeException
    // Exception table:
    //   from	to	target	type
    //   4	22	28	finally
    //   35	42	28	finally
    //   4	22	33	java/lang/RuntimeException
  }
}

/* Location:
 * Qualified Name:     J2.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */