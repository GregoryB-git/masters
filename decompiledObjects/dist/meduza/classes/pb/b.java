package pb;

public final class b
{
  public static final a a;
  
  /* Error */
  static
  {
    // Byte code:
    //   0: ldc 10
    //   2: invokestatic 16	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   5: astore_0
    //   6: aconst_null
    //   7: astore_1
    //   8: goto +6 -> 14
    //   11: astore_1
    //   12: aconst_null
    //   13: astore_0
    //   14: aload_1
    //   15: astore_2
    //   16: aload_0
    //   17: ifnull +42 -> 59
    //   20: aload_0
    //   21: ldc 18
    //   23: invokevirtual 22	java/lang/Class:asSubclass	(Ljava/lang/Class;)Ljava/lang/Class;
    //   26: iconst_1
    //   27: anewarray 12	java/lang/Class
    //   30: dup
    //   31: iconst_0
    //   32: ldc 24
    //   34: aastore
    //   35: invokevirtual 28	java/lang/Class:getConstructor	([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   38: iconst_1
    //   39: anewarray 4	java/lang/Object
    //   42: dup
    //   43: iconst_0
    //   44: getstatic 31	pb/a:a	Lpb/c;
    //   47: aastore
    //   48: invokevirtual 37	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   51: checkcast 18	pb/a
    //   54: astore_2
    //   55: goto +10 -> 65
    //   58: astore_2
    //   59: aconst_null
    //   60: astore_0
    //   61: aload_2
    //   62: astore_1
    //   63: aload_0
    //   64: astore_2
    //   65: aload_2
    //   66: ifnull +6 -> 72
    //   69: goto +11 -> 80
    //   72: new 18	pb/a
    //   75: dup
    //   76: invokespecial 40	pb/a:<init>	()V
    //   79: astore_2
    //   80: aload_2
    //   81: putstatic 42	pb/b:a	Lpb/a;
    //   84: aload_1
    //   85: ifnull +114 -> 199
    //   88: ldc 44
    //   90: invokestatic 50	java/lang/Boolean:getBoolean	(Ljava/lang/String;)Z
    //   93: ifeq +106 -> 199
    //   96: ldc 52
    //   98: invokestatic 16	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   101: astore_2
    //   102: aload_2
    //   103: ldc 54
    //   105: iconst_1
    //   106: anewarray 12	java/lang/Class
    //   109: dup
    //   110: iconst_0
    //   111: ldc 56
    //   113: aastore
    //   114: invokevirtual 60	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   117: aconst_null
    //   118: iconst_1
    //   119: anewarray 4	java/lang/Object
    //   122: dup
    //   123: iconst_0
    //   124: ldc 2
    //   126: invokevirtual 64	java/lang/Class:getName	()Ljava/lang/String;
    //   129: aastore
    //   130: invokevirtual 70	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   133: astore_3
    //   134: ldc 72
    //   136: invokestatic 16	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   139: astore_0
    //   140: aload_0
    //   141: ldc 74
    //   143: invokevirtual 78	java/lang/Class:getField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   146: aconst_null
    //   147: invokevirtual 84	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   150: astore 4
    //   152: aload_2
    //   153: ldc 86
    //   155: iconst_3
    //   156: anewarray 12	java/lang/Class
    //   159: dup
    //   160: iconst_0
    //   161: aload_0
    //   162: aastore
    //   163: dup
    //   164: iconst_1
    //   165: ldc 56
    //   167: aastore
    //   168: dup
    //   169: iconst_2
    //   170: ldc 88
    //   172: aastore
    //   173: invokevirtual 60	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   176: aload_3
    //   177: iconst_3
    //   178: anewarray 4	java/lang/Object
    //   181: dup
    //   182: iconst_0
    //   183: aload 4
    //   185: aastore
    //   186: dup
    //   187: iconst_1
    //   188: ldc 90
    //   190: aastore
    //   191: dup
    //   192: iconst_2
    //   193: aload_1
    //   194: aastore
    //   195: invokevirtual 70	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   198: pop
    //   199: return
    //   200: astore_1
    //   201: goto -2 -> 199
    // Local variable table:
    //   start	length	slot	name	signature
    //   5	157	0	localClass	Class
    //   7	1	1	localObject1	Object
    //   11	4	1	localObject2	Object
    //   62	132	1	localObject3	Object
    //   200	1	1	localObject4	Object
    //   15	40	2	localObject5	Object
    //   58	4	2	localObject6	Object
    //   64	89	2	localObject7	Object
    //   133	44	3	localObject8	Object
    //   150	34	4	localObject9	Object
    // Exception table:
    //   from	to	target	type
    //   0	6	11	finally
    //   20	55	58	finally
    //   88	199	200	finally
  }
  
  public static void a()
  {
    a.getClass();
  }
  
  public static void b()
  {
    a.getClass();
  }
  
  public static void c()
  {
    a.getClass();
  }
}

/* Location:
 * Qualified Name:     pb.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */