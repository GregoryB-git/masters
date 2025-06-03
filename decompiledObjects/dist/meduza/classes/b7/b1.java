package b7;

import android.os.Parcelable.Creator;

public final class b1
  implements Parcelable.Creator
{
  /* Error */
  public final Object createFromParcel(android.os.Parcel paramParcel)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 21	android/os/Parcel:readString	()Ljava/lang/String;
    //   4: astore_1
    //   5: invokestatic 27	b7/d0$a:values	()[Lb7/d0$a;
    //   8: astore_2
    //   9: aload_2
    //   10: arraylength
    //   11: istore_3
    //   12: iconst_0
    //   13: istore 4
    //   15: iload 4
    //   17: iload_3
    //   18: if_icmpge +34 -> 52
    //   21: aload_2
    //   22: iload 4
    //   24: aaload
    //   25: astore 5
    //   27: aload_1
    //   28: aload 5
    //   30: getfield 31	b7/d0$a:a	Ljava/lang/String;
    //   33: invokevirtual 37	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   36: ifeq +6 -> 42
    //   39: aload 5
    //   41: areturn
    //   42: iinc 4 1
    //   45: goto -30 -> 15
    //   48: astore_1
    //   49: goto +17 -> 66
    //   52: new 15	b7/d0$b
    //   55: astore 5
    //   57: aload 5
    //   59: aload_1
    //   60: invokespecial 40	b7/d0$b:<init>	(Ljava/lang/String;)V
    //   63: aload 5
    //   65: athrow
    //   66: new 42	java/lang/RuntimeException
    //   69: dup
    //   70: aload_1
    //   71: invokespecial 45	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   74: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	75	0	this	b1
    //   0	75	1	paramParcel	android.os.Parcel
    //   8	14	2	arrayOfa	d0.a[]
    //   11	8	3	i	int
    //   13	30	4	j	int
    //   25	39	5	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   5	12	48	b7/d0$b
    //   27	39	48	b7/d0$b
    //   52	66	48	b7/d0$b
  }
}

/* Location:
 * Qualified Name:     b7.b1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */