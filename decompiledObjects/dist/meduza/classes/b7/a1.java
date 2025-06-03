package b7;

import android.os.Parcelable.Creator;

public final class a1
  implements Parcelable.Creator
{
  /* Error */
  public final Object createFromParcel(android.os.Parcel paramParcel)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 21	android/os/Parcel:readString	()Ljava/lang/String;
    //   4: astore_2
    //   5: aload_2
    //   6: astore_1
    //   7: aload_2
    //   8: ifnonnull +13 -> 21
    //   11: ldc 23
    //   13: astore_1
    //   14: goto +7 -> 21
    //   17: astore_1
    //   18: goto +56 -> 74
    //   21: invokestatic 29	b7/c0:values	()[Lb7/c0;
    //   24: astore_3
    //   25: aload_3
    //   26: arraylength
    //   27: istore 4
    //   29: iconst_0
    //   30: istore 5
    //   32: iload 5
    //   34: iload 4
    //   36: if_icmpge +27 -> 63
    //   39: aload_3
    //   40: iload 5
    //   42: aaload
    //   43: astore_2
    //   44: aload_1
    //   45: aload_2
    //   46: getfield 33	b7/c0:a	Ljava/lang/String;
    //   49: invokevirtual 39	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   52: ifeq +5 -> 57
    //   55: aload_2
    //   56: areturn
    //   57: iinc 5 1
    //   60: goto -28 -> 32
    //   63: new 15	b7/c0$a
    //   66: astore_2
    //   67: aload_2
    //   68: aload_1
    //   69: invokespecial 42	b7/c0$a:<init>	(Ljava/lang/String;)V
    //   72: aload_2
    //   73: athrow
    //   74: new 44	java/lang/RuntimeException
    //   77: dup
    //   78: aload_1
    //   79: invokespecial 47	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   82: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	83	0	this	a1
    //   0	83	1	paramParcel	android.os.Parcel
    //   4	69	2	localObject	Object
    //   24	16	3	arrayOfc0	c0[]
    //   27	10	4	i	int
    //   30	28	5	j	int
    // Exception table:
    //   from	to	target	type
    //   21	29	17	b7/c0$a
    //   44	55	17	b7/c0$a
    //   63	74	17	b7/c0$a
  }
}

/* Location:
 * Qualified Name:     b7.a1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */