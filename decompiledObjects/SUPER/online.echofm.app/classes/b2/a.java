package b2;

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
    c = paramString;
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
  public final Parcel o(Parcel paramParcel)
  {
    // Byte code:
    //   0: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield 17	b2/a:b	Landroid/os/IBinder;
    //   8: iconst_1
    //   9: aload_1
    //   10: aload_2
    //   11: iconst_0
    //   12: invokeinterface 43 5 0
    //   17: pop
    //   18: aload_2
    //   19: invokevirtual 46	android/os/Parcel:readException	()V
    //   22: aload_1
    //   23: invokevirtual 49	android/os/Parcel:recycle	()V
    //   26: aload_2
    //   27: areturn
    //   28: astore_3
    //   29: goto +10 -> 39
    //   32: astore_3
    //   33: aload_2
    //   34: invokevirtual 49	android/os/Parcel:recycle	()V
    //   37: aload_3
    //   38: athrow
    //   39: aload_1
    //   40: invokevirtual 49	android/os/Parcel:recycle	()V
    //   43: aload_3
    //   44: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	45	0	this	a
    //   0	45	1	paramParcel	Parcel
    //   3	31	2	localParcel	Parcel
    //   28	1	3	localObject	Object
    //   32	12	3	localRuntimeException	RuntimeException
    // Exception table:
    //   from	to	target	type
    //   4	22	28	finally
    //   33	39	28	finally
    //   4	22	32	java/lang/RuntimeException
  }
}

/* Location:
 * Qualified Name:     b2.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */