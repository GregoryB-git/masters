package b7;

import android.os.Parcelable.Creator;

public final class i1
  implements Parcelable.Creator
{
  /* Error */
  public final Object createFromParcel(android.os.Parcel paramParcel)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 21	android/os/Parcel:readString	()Ljava/lang/String;
    //   4: astore_1
    //   5: invokestatic 27	b7/c:values	()[Lb7/c;
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
    //   30: getfield 31	b7/c:a	Ljava/lang/String;
    //   33: invokevirtual 37	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   36: ifeq +6 -> 42
    //   39: aload 5
    //   41: areturn
    //   42: iinc 4 1
    //   45: goto -30 -> 15
    //   48: astore_1
    //   49: goto +14 -> 63
    //   52: new 15	b7/c$a
    //   55: astore_2
    //   56: aload_2
    //   57: aload_1
    //   58: invokespecial 40	b7/c$a:<init>	(Ljava/lang/String;)V
    //   61: aload_2
    //   62: athrow
    //   63: new 42	java/lang/RuntimeException
    //   66: dup
    //   67: aload_1
    //   68: invokespecial 45	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   71: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	72	0	this	i1
    //   0	72	1	paramParcel	android.os.Parcel
    //   8	54	2	localObject1	Object
    //   11	8	3	i	int
    //   13	30	4	j	int
    //   25	15	5	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   5	12	48	b7/c$a
    //   27	39	48	b7/c$a
    //   52	63	48	b7/c$a
  }
}

/* Location:
 * Qualified Name:     b7.i1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */