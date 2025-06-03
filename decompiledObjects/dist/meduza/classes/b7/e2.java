package b7;

import android.os.Parcelable.Creator;

public final class e2
  implements Parcelable.Creator
{
  /* Error */
  public final Object createFromParcel(android.os.Parcel paramParcel)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 21	android/os/Parcel:readInt	()I
    //   4: istore_2
    //   5: invokestatic 27	b7/q:values	()[Lb7/q;
    //   8: astore_1
    //   9: aload_1
    //   10: arraylength
    //   11: istore_3
    //   12: iconst_0
    //   13: istore 4
    //   15: iload 4
    //   17: iload_3
    //   18: if_icmpge +31 -> 49
    //   21: aload_1
    //   22: iload 4
    //   24: aaload
    //   25: astore 5
    //   27: iload_2
    //   28: aload 5
    //   30: getfield 31	b7/q:a	I
    //   33: if_icmpne +6 -> 39
    //   36: aload 5
    //   38: areturn
    //   39: iinc 4 1
    //   42: goto -27 -> 15
    //   45: astore_1
    //   46: goto +14 -> 60
    //   49: new 15	b7/q$a
    //   52: astore_1
    //   53: aload_1
    //   54: iload_2
    //   55: invokespecial 34	b7/q$a:<init>	(I)V
    //   58: aload_1
    //   59: athrow
    //   60: new 36	java/lang/IllegalArgumentException
    //   63: dup
    //   64: aload_1
    //   65: invokespecial 39	java/lang/IllegalArgumentException:<init>	(Ljava/lang/Throwable;)V
    //   68: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	69	0	this	e2
    //   0	69	1	paramParcel	android.os.Parcel
    //   4	51	2	i	int
    //   11	8	3	j	int
    //   13	27	4	k	int
    //   25	12	5	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   5	12	45	b7/q$a
    //   27	36	45	b7/q$a
    //   49	60	45	b7/q$a
  }
}

/* Location:
 * Qualified Name:     b7.e2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */