package c7;

import android.os.Parcelable.Creator;

public final class f
  implements Parcelable.Creator
{
  /* Error */
  public final Object createFromParcel(android.os.Parcel paramParcel)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 21	android/os/Parcel:readInt	()I
    //   4: istore_2
    //   5: getstatic 27	c7/a:CREATOR	Landroid/os/Parcelable$Creator;
    //   8: astore_1
    //   9: invokestatic 33	c7/a$a:values	()[Lc7/a$a;
    //   12: astore_1
    //   13: aload_1
    //   14: arraylength
    //   15: istore_3
    //   16: iconst_0
    //   17: istore 4
    //   19: iload 4
    //   21: iload_3
    //   22: if_icmpge +31 -> 53
    //   25: aload_1
    //   26: iload 4
    //   28: aaload
    //   29: astore 5
    //   31: iload_2
    //   32: aload 5
    //   34: getfield 37	c7/a$a:a	I
    //   37: if_icmpne +6 -> 43
    //   40: aload 5
    //   42: areturn
    //   43: iinc 4 1
    //   46: goto -27 -> 19
    //   49: astore_1
    //   50: goto +14 -> 64
    //   53: new 15	c7/a$b
    //   56: astore_1
    //   57: aload_1
    //   58: iload_2
    //   59: invokespecial 40	c7/a$b:<init>	(I)V
    //   62: aload_1
    //   63: athrow
    //   64: new 42	java/lang/RuntimeException
    //   67: dup
    //   68: aload_1
    //   69: invokespecial 45	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   72: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	73	0	this	f
    //   0	73	1	paramParcel	android.os.Parcel
    //   4	55	2	i	int
    //   15	8	3	j	int
    //   17	27	4	k	int
    //   29	12	5	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   5	16	49	c7/a$b
    //   31	40	49	c7/a$b
    //   53	64	49	c7/a$b
  }
}

/* Location:
 * Qualified Name:     c7.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */