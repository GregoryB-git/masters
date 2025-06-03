package androidx.work;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import o2.j;

public final class c
{
  public static final String b = j.f("Data");
  public static final c c;
  public HashMap a;
  
  static
  {
    c localc = new c(new HashMap());
    e(localc);
    c = localc;
  }
  
  public c() {}
  
  public c(c paramc)
  {
    a = new HashMap(a);
  }
  
  public c(HashMap paramHashMap)
  {
    a = new HashMap(paramHashMap);
  }
  
  /* Error */
  public static c a(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aload_0
    //   1: arraylength
    //   2: sipush 10240
    //   5: if_icmpgt +239 -> 244
    //   8: new 26	java/util/HashMap
    //   11: dup
    //   12: invokespecial 29	java/util/HashMap:<init>	()V
    //   15: astore_1
    //   16: new 53	java/io/ByteArrayInputStream
    //   19: dup
    //   20: aload_0
    //   21: invokespecial 56	java/io/ByteArrayInputStream:<init>	([B)V
    //   24: astore_2
    //   25: aconst_null
    //   26: astore_3
    //   27: new 58	java/io/ObjectInputStream
    //   30: astore 4
    //   32: aload 4
    //   34: aload_2
    //   35: invokespecial 61	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   38: aload 4
    //   40: astore_0
    //   41: aload 4
    //   43: invokevirtual 65	java/io/ObjectInputStream:readInt	()I
    //   46: istore 5
    //   48: iload 5
    //   50: ifle +27 -> 77
    //   53: aload 4
    //   55: astore_0
    //   56: aload_1
    //   57: aload 4
    //   59: invokevirtual 69	java/io/ObjectInputStream:readUTF	()Ljava/lang/String;
    //   62: aload 4
    //   64: invokevirtual 73	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   67: invokevirtual 77	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   70: pop
    //   71: iinc 5 -1
    //   74: goto -26 -> 48
    //   77: aload 4
    //   79: invokevirtual 80	java/io/ObjectInputStream:close	()V
    //   82: goto +14 -> 96
    //   85: astore_0
    //   86: getstatic 24	androidx/work/c:b	Ljava/lang/String;
    //   89: ldc 82
    //   91: aload_0
    //   92: invokestatic 87	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   95: pop
    //   96: aload_2
    //   97: invokevirtual 88	java/io/ByteArrayInputStream:close	()V
    //   100: goto +84 -> 184
    //   103: astore_0
    //   104: goto +70 -> 174
    //   107: astore 4
    //   109: goto +84 -> 193
    //   112: astore_3
    //   113: goto +21 -> 134
    //   116: astore_3
    //   117: goto +17 -> 134
    //   120: astore_0
    //   121: goto +77 -> 198
    //   124: astore_0
    //   125: goto +4 -> 129
    //   128: astore_0
    //   129: aconst_null
    //   130: astore 4
    //   132: aload_0
    //   133: astore_3
    //   134: aload 4
    //   136: astore_0
    //   137: getstatic 24	androidx/work/c:b	Ljava/lang/String;
    //   140: ldc 82
    //   142: aload_3
    //   143: invokestatic 87	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   146: pop
    //   147: aload 4
    //   149: ifnull -53 -> 96
    //   152: aload 4
    //   154: invokevirtual 80	java/io/ObjectInputStream:close	()V
    //   157: goto -61 -> 96
    //   160: astore_0
    //   161: getstatic 24	androidx/work/c:b	Ljava/lang/String;
    //   164: ldc 82
    //   166: aload_0
    //   167: invokestatic 87	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   170: pop
    //   171: goto -75 -> 96
    //   174: getstatic 24	androidx/work/c:b	Ljava/lang/String;
    //   177: ldc 82
    //   179: aload_0
    //   180: invokestatic 87	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   183: pop
    //   184: new 2	androidx/work/c
    //   187: dup
    //   188: aload_1
    //   189: invokespecial 32	androidx/work/c:<init>	(Ljava/util/HashMap;)V
    //   192: areturn
    //   193: aload_0
    //   194: astore_3
    //   195: aload 4
    //   197: astore_0
    //   198: aload_3
    //   199: ifnull +23 -> 222
    //   202: aload_3
    //   203: invokevirtual 80	java/io/ObjectInputStream:close	()V
    //   206: goto +16 -> 222
    //   209: astore 4
    //   211: getstatic 24	androidx/work/c:b	Ljava/lang/String;
    //   214: ldc 82
    //   216: aload 4
    //   218: invokestatic 87	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   221: pop
    //   222: aload_2
    //   223: invokevirtual 88	java/io/ByteArrayInputStream:close	()V
    //   226: goto +16 -> 242
    //   229: astore 4
    //   231: getstatic 24	androidx/work/c:b	Ljava/lang/String;
    //   234: ldc 82
    //   236: aload 4
    //   238: invokestatic 87	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   241: pop
    //   242: aload_0
    //   243: athrow
    //   244: new 90	java/lang/IllegalStateException
    //   247: dup
    //   248: ldc 92
    //   250: invokespecial 95	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   253: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	254	0	paramArrayOfByte	byte[]
    //   15	174	1	localHashMap	HashMap
    //   24	199	2	localByteArrayInputStream	java.io.ByteArrayInputStream
    //   26	1	3	localObject1	Object
    //   112	1	3	localClassNotFoundException	ClassNotFoundException
    //   116	1	3	localIOException1	java.io.IOException
    //   133	70	3	arrayOfByte	byte[]
    //   30	48	4	localObjectInputStream	java.io.ObjectInputStream
    //   107	1	4	localObject2	Object
    //   130	66	4	localObject3	Object
    //   209	8	4	localIOException2	java.io.IOException
    //   229	8	4	localIOException3	java.io.IOException
    //   46	26	5	i	int
    // Exception table:
    //   from	to	target	type
    //   77	82	85	java/io/IOException
    //   96	100	103	java/io/IOException
    //   41	48	107	finally
    //   56	71	107	finally
    //   137	147	107	finally
    //   41	48	112	java/lang/ClassNotFoundException
    //   56	71	112	java/lang/ClassNotFoundException
    //   41	48	116	java/io/IOException
    //   56	71	116	java/io/IOException
    //   27	38	120	finally
    //   27	38	124	java/lang/ClassNotFoundException
    //   27	38	128	java/io/IOException
    //   152	157	160	java/io/IOException
    //   202	206	209	java/io/IOException
    //   222	226	229	java/io/IOException
  }
  
  /* Error */
  public static byte[] e(c paramc)
  {
    // Byte code:
    //   0: new 97	java/io/ByteArrayOutputStream
    //   3: dup
    //   4: invokespecial 98	java/io/ByteArrayOutputStream:<init>	()V
    //   7: astore_1
    //   8: aconst_null
    //   9: astore_2
    //   10: aconst_null
    //   11: astore_3
    //   12: aload_3
    //   13: astore 4
    //   15: new 100	java/io/ObjectOutputStream
    //   18: astore 5
    //   20: aload_3
    //   21: astore 4
    //   23: aload 5
    //   25: aload_1
    //   26: invokespecial 103	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   29: aload 5
    //   31: aload_0
    //   32: getfield 43	androidx/work/c:a	Ljava/util/HashMap;
    //   35: invokevirtual 106	java/util/HashMap:size	()I
    //   38: invokevirtual 110	java/io/ObjectOutputStream:writeInt	(I)V
    //   41: aload_0
    //   42: getfield 43	androidx/work/c:a	Ljava/util/HashMap;
    //   45: invokevirtual 114	java/util/HashMap:entrySet	()Ljava/util/Set;
    //   48: invokeinterface 120 1 0
    //   53: astore 4
    //   55: aload 4
    //   57: invokeinterface 126 1 0
    //   62: ifeq +42 -> 104
    //   65: aload 4
    //   67: invokeinterface 129 1 0
    //   72: checkcast 131	java/util/Map$Entry
    //   75: astore_0
    //   76: aload 5
    //   78: aload_0
    //   79: invokeinterface 134 1 0
    //   84: checkcast 136	java/lang/String
    //   87: invokevirtual 139	java/io/ObjectOutputStream:writeUTF	(Ljava/lang/String;)V
    //   90: aload 5
    //   92: aload_0
    //   93: invokeinterface 142 1 0
    //   98: invokevirtual 146	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   101: goto -46 -> 55
    //   104: aload 5
    //   106: invokevirtual 147	java/io/ObjectOutputStream:close	()V
    //   109: goto +14 -> 123
    //   112: astore_0
    //   113: getstatic 24	androidx/work/c:b	Ljava/lang/String;
    //   116: ldc -107
    //   118: aload_0
    //   119: invokestatic 87	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   122: pop
    //   123: aload_1
    //   124: invokevirtual 150	java/io/ByteArrayOutputStream:close	()V
    //   127: goto +14 -> 141
    //   130: astore_0
    //   131: getstatic 24	androidx/work/c:b	Ljava/lang/String;
    //   134: ldc -107
    //   136: aload_0
    //   137: invokestatic 87	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   140: pop
    //   141: aload_1
    //   142: invokevirtual 151	java/io/ByteArrayOutputStream:size	()I
    //   145: sipush 10240
    //   148: if_icmpgt +8 -> 156
    //   151: aload_1
    //   152: invokevirtual 155	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   155: areturn
    //   156: new 90	java/lang/IllegalStateException
    //   159: dup
    //   160: ldc 92
    //   162: invokespecial 95	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   165: athrow
    //   166: astore_0
    //   167: goto +93 -> 260
    //   170: astore 4
    //   172: aload 5
    //   174: astore_0
    //   175: aload 4
    //   177: astore 5
    //   179: goto +11 -> 190
    //   182: astore_0
    //   183: goto +73 -> 256
    //   186: astore 5
    //   188: aload_2
    //   189: astore_0
    //   190: aload_0
    //   191: astore 4
    //   193: getstatic 24	androidx/work/c:b	Ljava/lang/String;
    //   196: ldc -107
    //   198: aload 5
    //   200: invokestatic 87	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   203: pop
    //   204: aload_0
    //   205: astore 4
    //   207: aload_1
    //   208: invokevirtual 155	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   211: astore 5
    //   213: aload_0
    //   214: ifnull +21 -> 235
    //   217: aload_0
    //   218: invokevirtual 147	java/io/ObjectOutputStream:close	()V
    //   221: goto +14 -> 235
    //   224: astore_0
    //   225: getstatic 24	androidx/work/c:b	Ljava/lang/String;
    //   228: ldc -107
    //   230: aload_0
    //   231: invokestatic 87	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   234: pop
    //   235: aload_1
    //   236: invokevirtual 150	java/io/ByteArrayOutputStream:close	()V
    //   239: goto +14 -> 253
    //   242: astore_0
    //   243: getstatic 24	androidx/work/c:b	Ljava/lang/String;
    //   246: ldc -107
    //   248: aload_0
    //   249: invokestatic 87	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   252: pop
    //   253: aload 5
    //   255: areturn
    //   256: aload 4
    //   258: astore 5
    //   260: aload 5
    //   262: ifnull +24 -> 286
    //   265: aload 5
    //   267: invokevirtual 147	java/io/ObjectOutputStream:close	()V
    //   270: goto +16 -> 286
    //   273: astore 4
    //   275: getstatic 24	androidx/work/c:b	Ljava/lang/String;
    //   278: ldc -107
    //   280: aload 4
    //   282: invokestatic 87	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   285: pop
    //   286: aload_1
    //   287: invokevirtual 150	java/io/ByteArrayOutputStream:close	()V
    //   290: goto +16 -> 306
    //   293: astore 4
    //   295: getstatic 24	androidx/work/c:b	Ljava/lang/String;
    //   298: ldc -107
    //   300: aload 4
    //   302: invokestatic 87	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   305: pop
    //   306: aload_0
    //   307: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	308	0	paramc	c
    //   7	280	1	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    //   9	180	2	localObject1	Object
    //   11	10	3	localObject2	Object
    //   13	53	4	localObject3	Object
    //   170	6	4	localIOException1	java.io.IOException
    //   191	66	4	localc	c
    //   273	8	4	localIOException2	java.io.IOException
    //   293	8	4	localIOException3	java.io.IOException
    //   18	160	5	localObject4	Object
    //   186	13	5	localIOException4	java.io.IOException
    //   211	55	5	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   104	109	112	java/io/IOException
    //   123	127	130	java/io/IOException
    //   29	55	166	finally
    //   55	101	166	finally
    //   29	55	170	java/io/IOException
    //   55	101	170	java/io/IOException
    //   15	20	182	finally
    //   23	29	182	finally
    //   193	204	182	finally
    //   207	213	182	finally
    //   15	20	186	java/io/IOException
    //   23	29	186	java/io/IOException
    //   217	221	224	java/io/IOException
    //   235	239	242	java/io/IOException
    //   265	270	273	java/io/IOException
    //   286	290	293	java/io/IOException
  }
  
  public final boolean b(String paramString)
  {
    paramString = a.get(paramString);
    if ((paramString instanceof Boolean)) {
      return ((Boolean)paramString).booleanValue();
    }
    return false;
  }
  
  public final long c(String paramString)
  {
    paramString = a.get(paramString);
    if ((paramString instanceof Long)) {
      return ((Long)paramString).longValue();
    }
    return 0L;
  }
  
  public final String d(String paramString)
  {
    paramString = a.get(paramString);
    if ((paramString instanceof String)) {
      return (String)paramString;
    }
    return null;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (c.class == paramObject.getClass()))
    {
      paramObject = (c)paramObject;
      Object localObject1 = a.keySet();
      if (!((Set)localObject1).equals(a.keySet())) {
        return false;
      }
      Iterator localIterator = ((Set)localObject1).iterator();
      while (localIterator.hasNext())
      {
        Object localObject2 = (String)localIterator.next();
        localObject1 = a.get(localObject2);
        localObject2 = a.get(localObject2);
        boolean bool;
        if ((localObject1 != null) && (localObject2 != null))
        {
          if (((localObject1 instanceof Object[])) && ((localObject2 instanceof Object[]))) {
            bool = Arrays.deepEquals((Object[])localObject1, (Object[])localObject2);
          } else {
            bool = localObject1.equals(localObject2);
          }
        }
        else if (localObject1 == localObject2) {
          bool = true;
        } else {
          bool = false;
        }
        if (!bool) {
          return false;
        }
      }
      return true;
    }
    return false;
  }
  
  public final int hashCode()
  {
    return a.hashCode() * 31;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("Data {");
    if (!a.isEmpty())
    {
      Iterator localIterator = a.keySet().iterator();
      while (localIterator.hasNext())
      {
        Object localObject = (String)localIterator.next();
        localStringBuilder.append((String)localObject);
        localStringBuilder.append(" : ");
        localObject = a.get(localObject);
        if ((localObject instanceof Object[])) {
          localStringBuilder.append(Arrays.toString((Object[])localObject));
        } else {
          localStringBuilder.append(localObject);
        }
        localStringBuilder.append(", ");
      }
    }
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static final class a
  {
    public HashMap a = new HashMap();
    
    public final void a(HashMap paramHashMap)
    {
      Object localObject1 = paramHashMap.entrySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        Object localObject2 = (Map.Entry)((Iterator)localObject1).next();
        paramHashMap = (String)((Map.Entry)localObject2).getKey();
        localObject2 = ((Map.Entry)localObject2).getValue();
        if (localObject2 == null)
        {
          a.put(paramHashMap, null);
        }
        else
        {
          Object localObject3 = localObject2.getClass();
          if ((localObject3 != Boolean.class) && (localObject3 != Byte.class) && (localObject3 != Integer.class) && (localObject3 != Long.class) && (localObject3 != Float.class) && (localObject3 != Double.class) && (localObject3 != String.class) && (localObject3 != Boolean[].class) && (localObject3 != Byte[].class) && (localObject3 != Integer[].class) && (localObject3 != Long[].class) && (localObject3 != Float[].class) && (localObject3 != Double[].class) && (localObject3 != String[].class))
          {
            int i = 0;
            int j = 0;
            int k = 0;
            int m = 0;
            int n = 0;
            int i1 = 0;
            Object localObject4;
            if (localObject3 == boolean[].class)
            {
              localObject3 = a;
              localObject2 = (boolean[])localObject2;
              localObject4 = c.b;
              localObject4 = new Boolean[localObject2.length];
              while (i1 < localObject2.length)
              {
                localObject4[i1] = Boolean.valueOf(localObject2[i1]);
                i1++;
              }
              ((HashMap)localObject3).put(paramHashMap, localObject4);
            }
            else if (localObject3 == byte[].class)
            {
              localObject3 = a;
              localObject2 = (byte[])localObject2;
              localObject4 = c.b;
              localObject4 = new Byte[localObject2.length];
              for (i1 = i; i1 < localObject2.length; i1++) {
                localObject4[i1] = Byte.valueOf(localObject2[i1]);
              }
              ((HashMap)localObject3).put(paramHashMap, localObject4);
            }
            else if (localObject3 == int[].class)
            {
              localObject3 = a;
              localObject2 = (int[])localObject2;
              localObject4 = c.b;
              localObject4 = new Integer[localObject2.length];
              for (i1 = j; i1 < localObject2.length; i1++) {
                localObject4[i1] = Integer.valueOf(localObject2[i1]);
              }
              ((HashMap)localObject3).put(paramHashMap, localObject4);
            }
            else if (localObject3 == long[].class)
            {
              localObject3 = a;
              localObject2 = (long[])localObject2;
              localObject4 = c.b;
              localObject4 = new Long[localObject2.length];
              for (i1 = k; i1 < localObject2.length; i1++) {
                localObject4[i1] = Long.valueOf(localObject2[i1]);
              }
              ((HashMap)localObject3).put(paramHashMap, localObject4);
            }
            else if (localObject3 == float[].class)
            {
              localObject3 = a;
              localObject2 = (float[])localObject2;
              localObject4 = c.b;
              localObject4 = new Float[localObject2.length];
              for (i1 = m; i1 < localObject2.length; i1++) {
                localObject4[i1] = Float.valueOf(localObject2[i1]);
              }
              ((HashMap)localObject3).put(paramHashMap, localObject4);
            }
            else if (localObject3 == double[].class)
            {
              localObject3 = a;
              localObject2 = (double[])localObject2;
              localObject4 = c.b;
              localObject4 = new Double[localObject2.length];
              for (i1 = n; i1 < localObject2.length; i1++) {
                localObject4[i1] = Double.valueOf(localObject2[i1]);
              }
              ((HashMap)localObject3).put(paramHashMap, localObject4);
            }
            else
            {
              localObject1 = new StringBuilder();
              ((StringBuilder)localObject1).append("Key ");
              ((StringBuilder)localObject1).append(paramHashMap);
              ((StringBuilder)localObject1).append(" has invalid type ");
              ((StringBuilder)localObject1).append(localObject3);
              throw new IllegalArgumentException(((StringBuilder)localObject1).toString());
            }
          }
          else
          {
            a.put(paramHashMap, localObject2);
          }
        }
      }
    }
    
    public final void b(String paramString1, String paramString2)
    {
      a.put(paramString1, paramString2);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */