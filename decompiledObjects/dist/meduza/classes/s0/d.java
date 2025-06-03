package s0;

public final class d
{
  public static final Class<?> a;
  public static final boolean b;
  
  /* Error */
  static
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_0
    //   2: ldc 13
    //   4: invokestatic 19	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   7: astore_1
    //   8: goto +6 -> 14
    //   11: astore_1
    //   12: aconst_null
    //   13: astore_1
    //   14: aload_1
    //   15: putstatic 21	s0/d:a	Ljava/lang/Class;
    //   18: ldc 23
    //   20: invokestatic 19	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   23: astore_1
    //   24: aload_1
    //   25: ifnull +8 -> 33
    //   28: iconst_1
    //   29: istore_2
    //   30: goto +5 -> 35
    //   33: iconst_0
    //   34: istore_2
    //   35: iload_2
    //   36: putstatic 25	s0/d:b	Z
    //   39: return
    //   40: astore_1
    //   41: aload_0
    //   42: astore_1
    //   43: goto -19 -> 24
    // Local variable table:
    //   start	length	slot	name	signature
    //   1	41	0	localObject1	Object
    //   7	1	1	localClass1	Class
    //   11	1	1	localObject2	Object
    //   13	12	1	localClass2	Class
    //   40	1	1	localObject3	Object
    //   42	1	1	localObject4	Object
    //   29	7	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	8	11	finally
    //   18	24	40	finally
  }
  
  public static boolean a()
  {
    boolean bool;
    if ((a != null) && (!b)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     s0.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */