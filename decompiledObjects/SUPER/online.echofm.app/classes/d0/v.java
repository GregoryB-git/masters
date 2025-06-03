package d0;

import java.util.HashSet;

public abstract class v
{
  public static final HashSet a = new HashSet();
  public static String b = "media3.common";
  
  /* Error */
  public static void a(String paramString)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 17	d0/v:a	Ljava/util/HashSet;
    //   6: aload_0
    //   7: invokevirtual 27	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   10: ifeq +46 -> 56
    //   13: new 29	java/lang/StringBuilder
    //   16: astore_1
    //   17: aload_1
    //   18: invokespecial 30	java/lang/StringBuilder:<init>	()V
    //   21: aload_1
    //   22: getstatic 21	d0/v:b	Ljava/lang/String;
    //   25: invokevirtual 34	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   28: pop
    //   29: aload_1
    //   30: ldc 36
    //   32: invokevirtual 34	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   35: pop
    //   36: aload_1
    //   37: aload_0
    //   38: invokevirtual 34	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   41: pop
    //   42: aload_1
    //   43: invokevirtual 40	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   46: putstatic 21	d0/v:b	Ljava/lang/String;
    //   49: goto +7 -> 56
    //   52: astore_0
    //   53: goto +7 -> 60
    //   56: ldc 2
    //   58: monitorexit
    //   59: return
    //   60: ldc 2
    //   62: monitorexit
    //   63: aload_0
    //   64: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	65	0	paramString	String
    //   16	27	1	localStringBuilder	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   3	49	52	finally
  }
  
  public static String b()
  {
    try
    {
      String str = b;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}

/* Location:
 * Qualified Name:     d0.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */