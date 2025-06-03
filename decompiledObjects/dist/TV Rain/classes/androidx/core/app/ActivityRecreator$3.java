package androidx.core.app;

class ActivityRecreator$3
  implements Runnable
{
  public ActivityRecreator$3(Object paramObject1, Object paramObject2) {}
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: getstatic 31	androidx/core/app/ActivityRecreator:performStopActivity3ParamsMethod	Ljava/lang/reflect/Method;
    //   3: astore_1
    //   4: aload_1
    //   5: ifnull +37 -> 42
    //   8: aload_1
    //   9: aload_0
    //   10: getfield 18	androidx/core/app/ActivityRecreator$3:val$activityThread	Ljava/lang/Object;
    //   13: iconst_3
    //   14: anewarray 4	java/lang/Object
    //   17: dup
    //   18: iconst_0
    //   19: aload_0
    //   20: getfield 20	androidx/core/app/ActivityRecreator$3:val$token	Ljava/lang/Object;
    //   23: aastore
    //   24: dup
    //   25: iconst_1
    //   26: getstatic 37	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   29: aastore
    //   30: dup
    //   31: iconst_2
    //   32: ldc 39
    //   34: aastore
    //   35: invokevirtual 45	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   38: pop
    //   39: goto +81 -> 120
    //   42: getstatic 48	androidx/core/app/ActivityRecreator:performStopActivity2ParamsMethod	Ljava/lang/reflect/Method;
    //   45: aload_0
    //   46: getfield 18	androidx/core/app/ActivityRecreator$3:val$activityThread	Ljava/lang/Object;
    //   49: iconst_2
    //   50: anewarray 4	java/lang/Object
    //   53: dup
    //   54: iconst_0
    //   55: aload_0
    //   56: getfield 20	androidx/core/app/ActivityRecreator$3:val$token	Ljava/lang/Object;
    //   59: aastore
    //   60: dup
    //   61: iconst_1
    //   62: getstatic 37	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   65: aastore
    //   66: invokevirtual 45	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   69: pop
    //   70: goto +50 -> 120
    //   73: astore_1
    //   74: ldc 50
    //   76: ldc 52
    //   78: aload_1
    //   79: invokestatic 58	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   82: pop
    //   83: goto +37 -> 120
    //   86: astore_1
    //   87: aload_1
    //   88: invokevirtual 62	java/lang/Object:getClass	()Ljava/lang/Class;
    //   91: ldc 27
    //   93: if_acmpne +27 -> 120
    //   96: aload_1
    //   97: invokevirtual 68	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   100: ifnull +20 -> 120
    //   103: aload_1
    //   104: invokevirtual 68	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   107: ldc 70
    //   109: invokevirtual 76	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   112: ifne +6 -> 118
    //   115: goto +5 -> 120
    //   118: aload_1
    //   119: athrow
    //   120: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	121	0	this	3
    //   3	6	1	localMethod	java.lang.reflect.Method
    //   73	6	1	localThrowable	Throwable
    //   86	33	1	localRuntimeException	RuntimeException
    // Exception table:
    //   from	to	target	type
    //   0	4	73	finally
    //   8	39	73	finally
    //   42	70	73	finally
    //   0	4	86	java/lang/RuntimeException
    //   8	39	86	java/lang/RuntimeException
    //   42	70	86	java/lang/RuntimeException
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.ActivityRecreator.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */