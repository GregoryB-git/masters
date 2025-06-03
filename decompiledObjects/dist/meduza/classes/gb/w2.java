package gb;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Logger;

public final class w2
  implements q1
{
  public static final Logger b = Logger.getLogger(w2.class.getName());
  public static final Constructor<?> c;
  public static final Method d;
  public static final RuntimeException e;
  public static final Object[] f = tmp174_171;
  public final Object a;
  
  /* Error */
  static
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokevirtual 27	java/lang/Class:getName	()Ljava/lang/String;
    //   5: invokestatic 33	java/util/logging/Logger:getLogger	(Ljava/lang/String;)Ljava/util/logging/Logger;
    //   8: putstatic 35	gb/w2:b	Ljava/util/logging/Logger;
    //   11: aconst_null
    //   12: astore_0
    //   13: ldc 37
    //   15: invokestatic 41	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   18: astore_1
    //   19: aload_1
    //   20: ldc 43
    //   22: iconst_1
    //   23: anewarray 23	java/lang/Class
    //   26: dup
    //   27: iconst_0
    //   28: getstatic 49	java/lang/Long:TYPE	Ljava/lang/Class;
    //   31: aastore
    //   32: invokevirtual 53	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   35: astore_2
    //   36: aload_1
    //   37: ldc 55
    //   39: iconst_0
    //   40: anewarray 23	java/lang/Class
    //   43: invokevirtual 53	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   46: pop
    //   47: aload_1
    //   48: invokevirtual 59	java/lang/Class:getConstructors	()[Ljava/lang/reflect/Constructor;
    //   51: astore_3
    //   52: aload_3
    //   53: arraylength
    //   54: istore 4
    //   56: iconst_0
    //   57: istore 5
    //   59: iload 5
    //   61: iload 4
    //   63: if_icmpge +29 -> 92
    //   66: aload_3
    //   67: iload 5
    //   69: aaload
    //   70: astore_1
    //   71: aload_1
    //   72: invokevirtual 65	java/lang/reflect/Constructor:getParameterTypes	()[Ljava/lang/Class;
    //   75: arraylength
    //   76: istore 6
    //   78: iload 6
    //   80: ifne +6 -> 86
    //   83: goto +11 -> 94
    //   86: iinc 5 1
    //   89: goto -30 -> 59
    //   92: aconst_null
    //   93: astore_1
    //   94: aconst_null
    //   95: astore_3
    //   96: aload_1
    //   97: astore 7
    //   99: goto +27 -> 126
    //   102: astore_1
    //   103: goto +6 -> 109
    //   106: astore_1
    //   107: aconst_null
    //   108: astore_2
    //   109: getstatic 35	gb/w2:b	Ljava/util/logging/Logger;
    //   112: getstatic 71	java/util/logging/Level:FINE	Ljava/util/logging/Level;
    //   115: ldc 73
    //   117: aload_1
    //   118: invokevirtual 77	java/util/logging/Logger:log	(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   121: aconst_null
    //   122: astore 7
    //   124: aload_1
    //   125: astore_3
    //   126: aload_3
    //   127: ifnonnull +22 -> 149
    //   130: aload 7
    //   132: ifnull +17 -> 149
    //   135: aload 7
    //   137: putstatic 79	gb/w2:c	Ljava/lang/reflect/Constructor;
    //   140: aload_2
    //   141: putstatic 81	gb/w2:d	Ljava/lang/reflect/Method;
    //   144: aload_0
    //   145: astore_1
    //   146: goto +20 -> 166
    //   149: aconst_null
    //   150: putstatic 79	gb/w2:c	Ljava/lang/reflect/Constructor;
    //   153: aconst_null
    //   154: putstatic 81	gb/w2:d	Ljava/lang/reflect/Method;
    //   157: new 83	java/lang/RuntimeException
    //   160: dup
    //   161: aload_3
    //   162: invokespecial 87	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   165: astore_1
    //   166: aload_1
    //   167: putstatic 89	gb/w2:e	Ljava/lang/RuntimeException;
    //   170: iconst_1
    //   171: anewarray 4	java/lang/Object
    //   174: dup
    //   175: iconst_0
    //   176: lconst_1
    //   177: invokestatic 93	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   180: aastore
    //   181: putstatic 95	gb/w2:f	[Ljava/lang/Object;
    //   184: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   12	133	0	localObject1	Object
    //   18	79	1	localClass1	Class
    //   102	1	1	localObject2	Object
    //   106	19	1	localThrowable	Throwable
    //   145	22	1	localObject3	Object
    //   35	106	2	localMethod	Method
    //   51	111	3	localObject4	Object
    //   54	10	4	i	int
    //   57	30	5	j	int
    //   76	3	6	k	int
    //   97	39	7	localClass2	Class
    // Exception table:
    //   from	to	target	type
    //   36	56	102	finally
    //   71	78	102	finally
    //   13	36	106	finally
  }
  
  public w2()
  {
    RuntimeException localRuntimeException = e;
    if (localRuntimeException == null) {
      try
      {
        a = c.newInstance(new Object[0]);
        return;
      }
      catch (InvocationTargetException localInvocationTargetException)
      {
        throw new RuntimeException(localInvocationTargetException);
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        throw new RuntimeException(localIllegalAccessException);
      }
      catch (InstantiationException localInstantiationException)
      {
        throw new RuntimeException(localInstantiationException);
      }
    }
    throw localInstantiationException;
  }
  
  public final void b()
  {
    try
    {
      d.invoke(a, f);
      return;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      throw new RuntimeException(localInvocationTargetException);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new RuntimeException(localIllegalAccessException);
    }
  }
}

/* Location:
 * Qualified Name:     gb.w2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */