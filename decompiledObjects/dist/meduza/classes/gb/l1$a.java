package gb;

import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.DirContext;

public final class l1$a
  implements l1.c
{
  public static void a(NamingEnumeration<?> paramNamingEnumeration, NamingException paramNamingException)
  {
    try
    {
      paramNamingEnumeration.close();
      throw paramNamingException;
    }
    catch (NamingException paramNamingEnumeration)
    {
      for (;;) {}
    }
  }
  
  public static void b(DirContext paramDirContext, NamingException paramNamingException)
  {
    try
    {
      paramDirContext.close();
      throw paramNamingException;
    }
    catch (NamingException paramDirContext)
    {
      for (;;) {}
    }
  }
  
  /* Error */
  public final java.util.ArrayList c(String paramString)
  {
    // Byte code:
    //   0: getstatic 34	gb/l1:a	Ljava/lang/Throwable;
    //   3: astore_2
    //   4: aload_2
    //   5: ifnonnull +173 -> 178
    //   8: new 36	java/util/ArrayList
    //   11: dup
    //   12: invokespecial 37	java/util/ArrayList:<init>	()V
    //   15: astore_3
    //   16: new 39	java/util/Hashtable
    //   19: dup
    //   20: invokespecial 40	java/util/Hashtable:<init>	()V
    //   23: astore_2
    //   24: aload_2
    //   25: ldc 42
    //   27: ldc 44
    //   29: invokevirtual 48	java/util/Hashtable:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   32: pop
    //   33: aload_2
    //   34: ldc 50
    //   36: ldc 44
    //   38: invokevirtual 48	java/util/Hashtable:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   41: pop
    //   42: new 52	javax/naming/directory/InitialDirContext
    //   45: dup
    //   46: aload_2
    //   47: invokespecial 55	javax/naming/directory/InitialDirContext:<init>	(Ljava/util/Hashtable;)V
    //   50: astore_2
    //   51: aload_2
    //   52: aload_1
    //   53: iconst_1
    //   54: anewarray 57	java/lang/String
    //   57: dup
    //   58: iconst_0
    //   59: ldc 59
    //   61: aastore
    //   62: invokeinterface 63 3 0
    //   67: invokeinterface 69 1 0
    //   72: astore_1
    //   73: aload_1
    //   74: invokeinterface 73 1 0
    //   79: ifeq +70 -> 149
    //   82: aload_1
    //   83: invokeinterface 77 1 0
    //   88: checkcast 79	javax/naming/directory/Attribute
    //   91: invokeinterface 80 1 0
    //   96: astore 4
    //   98: aload 4
    //   100: invokeinterface 73 1 0
    //   105: ifeq +21 -> 126
    //   108: aload_3
    //   109: aload 4
    //   111: invokeinterface 77 1 0
    //   116: invokestatic 84	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   119: invokevirtual 88	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   122: pop
    //   123: goto -25 -> 98
    //   126: aload 4
    //   128: invokeinterface 22 1 0
    //   133: goto -60 -> 73
    //   136: astore_3
    //   137: aload 4
    //   139: aload_3
    //   140: invokestatic 90	gb/l1$a:a	(Ljavax/naming/NamingEnumeration;Ljavax/naming/NamingException;)V
    //   143: aconst_null
    //   144: athrow
    //   145: astore_3
    //   146: goto +17 -> 163
    //   149: aload_1
    //   150: invokeinterface 22 1 0
    //   155: aload_2
    //   156: invokeinterface 29 1 0
    //   161: aload_3
    //   162: areturn
    //   163: aload_1
    //   164: aload_3
    //   165: invokestatic 90	gb/l1$a:a	(Ljavax/naming/NamingEnumeration;Ljavax/naming/NamingException;)V
    //   168: aconst_null
    //   169: athrow
    //   170: astore_1
    //   171: aload_2
    //   172: aload_1
    //   173: invokestatic 92	gb/l1$a:b	(Ljavax/naming/directory/DirContext;Ljavax/naming/NamingException;)V
    //   176: aconst_null
    //   177: athrow
    //   178: new 94	java/lang/UnsupportedOperationException
    //   181: dup
    //   182: ldc 96
    //   184: aload_2
    //   185: invokespecial 99	java/lang/UnsupportedOperationException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   188: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	189	0	this	a
    //   0	189	1	paramString	String
    //   3	182	2	localObject	Object
    //   15	94	3	localArrayList	java.util.ArrayList
    //   136	4	3	localNamingException1	NamingException
    //   145	20	3	localNamingException2	NamingException
    //   96	42	4	localNamingEnumeration	NamingEnumeration
    // Exception table:
    //   from	to	target	type
    //   98	123	136	javax/naming/NamingException
    //   73	98	145	javax/naming/NamingException
    //   126	133	145	javax/naming/NamingException
    //   137	145	145	javax/naming/NamingException
    //   51	73	170	javax/naming/NamingException
    //   149	155	170	javax/naming/NamingException
    //   163	170	170	javax/naming/NamingException
  }
}

/* Location:
 * Qualified Name:     gb.l1.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */