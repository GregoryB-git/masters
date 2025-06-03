package androidx.work;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class Data
{
  public static final Data EMPTY = new Builder().build();
  @SuppressLint({"MinMaxConstant"})
  public static final int MAX_DATA_BYTES = 10240;
  private static final String TAG = Logger.tagWithPrefix("Data");
  public Map<String, Object> mValues;
  
  public Data() {}
  
  public Data(@NonNull Data paramData)
  {
    mValues = new HashMap(mValues);
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public Data(@NonNull Map<String, ?> paramMap)
  {
    mValues = new HashMap(paramMap);
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public static Boolean[] convertPrimitiveBooleanArray(@NonNull boolean[] paramArrayOfBoolean)
  {
    Boolean[] arrayOfBoolean = new Boolean[paramArrayOfBoolean.length];
    for (int i = 0; i < paramArrayOfBoolean.length; i++) {
      arrayOfBoolean[i] = Boolean.valueOf(paramArrayOfBoolean[i]);
    }
    return arrayOfBoolean;
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public static Byte[] convertPrimitiveByteArray(@NonNull byte[] paramArrayOfByte)
  {
    Byte[] arrayOfByte = new Byte[paramArrayOfByte.length];
    for (int i = 0; i < paramArrayOfByte.length; i++) {
      arrayOfByte[i] = Byte.valueOf(paramArrayOfByte[i]);
    }
    return arrayOfByte;
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public static Double[] convertPrimitiveDoubleArray(@NonNull double[] paramArrayOfDouble)
  {
    Double[] arrayOfDouble = new Double[paramArrayOfDouble.length];
    for (int i = 0; i < paramArrayOfDouble.length; i++) {
      arrayOfDouble[i] = Double.valueOf(paramArrayOfDouble[i]);
    }
    return arrayOfDouble;
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public static Float[] convertPrimitiveFloatArray(@NonNull float[] paramArrayOfFloat)
  {
    Float[] arrayOfFloat = new Float[paramArrayOfFloat.length];
    for (int i = 0; i < paramArrayOfFloat.length; i++) {
      arrayOfFloat[i] = Float.valueOf(paramArrayOfFloat[i]);
    }
    return arrayOfFloat;
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public static Integer[] convertPrimitiveIntArray(@NonNull int[] paramArrayOfInt)
  {
    Integer[] arrayOfInteger = new Integer[paramArrayOfInt.length];
    for (int i = 0; i < paramArrayOfInt.length; i++) {
      arrayOfInteger[i] = Integer.valueOf(paramArrayOfInt[i]);
    }
    return arrayOfInteger;
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public static Long[] convertPrimitiveLongArray(@NonNull long[] paramArrayOfLong)
  {
    Long[] arrayOfLong = new Long[paramArrayOfLong.length];
    for (int i = 0; i < paramArrayOfLong.length; i++) {
      arrayOfLong[i] = Long.valueOf(paramArrayOfLong[i]);
    }
    return arrayOfLong;
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public static byte[] convertToPrimitiveArray(@NonNull Byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte = new byte[paramArrayOfByte.length];
    for (int i = 0; i < paramArrayOfByte.length; i++) {
      arrayOfByte[i] = paramArrayOfByte[i].byteValue();
    }
    return arrayOfByte;
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public static double[] convertToPrimitiveArray(@NonNull Double[] paramArrayOfDouble)
  {
    double[] arrayOfDouble = new double[paramArrayOfDouble.length];
    for (int i = 0; i < paramArrayOfDouble.length; i++) {
      arrayOfDouble[i] = paramArrayOfDouble[i].doubleValue();
    }
    return arrayOfDouble;
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public static float[] convertToPrimitiveArray(@NonNull Float[] paramArrayOfFloat)
  {
    float[] arrayOfFloat = new float[paramArrayOfFloat.length];
    for (int i = 0; i < paramArrayOfFloat.length; i++) {
      arrayOfFloat[i] = paramArrayOfFloat[i].floatValue();
    }
    return arrayOfFloat;
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public static int[] convertToPrimitiveArray(@NonNull Integer[] paramArrayOfInteger)
  {
    int[] arrayOfInt = new int[paramArrayOfInteger.length];
    for (int i = 0; i < paramArrayOfInteger.length; i++) {
      arrayOfInt[i] = paramArrayOfInteger[i].intValue();
    }
    return arrayOfInt;
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public static long[] convertToPrimitiveArray(@NonNull Long[] paramArrayOfLong)
  {
    long[] arrayOfLong = new long[paramArrayOfLong.length];
    for (int i = 0; i < paramArrayOfLong.length; i++) {
      arrayOfLong[i] = paramArrayOfLong[i].longValue();
    }
    return arrayOfLong;
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public static boolean[] convertToPrimitiveArray(@NonNull Boolean[] paramArrayOfBoolean)
  {
    boolean[] arrayOfBoolean = new boolean[paramArrayOfBoolean.length];
    for (int i = 0; i < paramArrayOfBoolean.length; i++) {
      arrayOfBoolean[i] = paramArrayOfBoolean[i].booleanValue();
    }
    return arrayOfBoolean;
  }
  
  /* Error */
  @NonNull
  @androidx.room.TypeConverter
  public static Data fromByteArray(@NonNull byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aload_0
    //   1: arraylength
    //   2: sipush 10240
    //   5: if_icmpgt +219 -> 224
    //   8: new 47	java/util/HashMap
    //   11: dup
    //   12: invokespecial 141	java/util/HashMap:<init>	()V
    //   15: astore_1
    //   16: new 143	java/io/ByteArrayInputStream
    //   19: dup
    //   20: aload_0
    //   21: invokespecial 146	java/io/ByteArrayInputStream:<init>	([B)V
    //   24: astore_2
    //   25: new 148	java/io/ObjectInputStream
    //   28: astore_3
    //   29: aload_3
    //   30: aload_2
    //   31: invokespecial 151	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   34: aload_3
    //   35: astore_0
    //   36: aload_3
    //   37: invokevirtual 154	java/io/ObjectInputStream:readInt	()I
    //   40: istore 4
    //   42: iload 4
    //   44: ifle +24 -> 68
    //   47: aload_3
    //   48: astore_0
    //   49: aload_1
    //   50: aload_3
    //   51: invokevirtual 158	java/io/ObjectInputStream:readUTF	()Ljava/lang/String;
    //   54: aload_3
    //   55: invokevirtual 162	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   58: invokevirtual 166	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   61: pop
    //   62: iinc 4 -1
    //   65: goto -23 -> 42
    //   68: aload_3
    //   69: invokevirtual 169	java/io/ObjectInputStream:close	()V
    //   72: goto +14 -> 86
    //   75: astore_0
    //   76: getstatic 32	androidx/work/Data:TAG	Ljava/lang/String;
    //   79: ldc -85
    //   81: aload_0
    //   82: invokestatic 177	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   85: pop
    //   86: aload_2
    //   87: invokevirtual 178	java/io/ByteArrayInputStream:close	()V
    //   90: goto +82 -> 172
    //   93: astore 5
    //   95: goto +24 -> 119
    //   98: astore 5
    //   100: goto +19 -> 119
    //   103: astore_3
    //   104: aconst_null
    //   105: astore_0
    //   106: goto +76 -> 182
    //   109: astore_0
    //   110: goto +4 -> 114
    //   113: astore_0
    //   114: aconst_null
    //   115: astore_3
    //   116: aload_0
    //   117: astore 5
    //   119: aload_3
    //   120: astore_0
    //   121: getstatic 32	androidx/work/Data:TAG	Ljava/lang/String;
    //   124: ldc -85
    //   126: aload 5
    //   128: invokestatic 177	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   131: pop
    //   132: aload_3
    //   133: ifnull +21 -> 154
    //   136: aload_3
    //   137: invokevirtual 169	java/io/ObjectInputStream:close	()V
    //   140: goto +14 -> 154
    //   143: astore_0
    //   144: getstatic 32	androidx/work/Data:TAG	Ljava/lang/String;
    //   147: ldc -85
    //   149: aload_0
    //   150: invokestatic 177	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   153: pop
    //   154: aload_2
    //   155: invokevirtual 178	java/io/ByteArrayInputStream:close	()V
    //   158: goto +14 -> 172
    //   161: astore_0
    //   162: getstatic 32	androidx/work/Data:TAG	Ljava/lang/String;
    //   165: ldc -85
    //   167: aload_0
    //   168: invokestatic 177	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   171: pop
    //   172: new 2	androidx/work/Data
    //   175: dup
    //   176: aload_1
    //   177: invokespecial 179	androidx/work/Data:<init>	(Ljava/util/Map;)V
    //   180: areturn
    //   181: astore_3
    //   182: aload_0
    //   183: ifnull +21 -> 204
    //   186: aload_0
    //   187: invokevirtual 169	java/io/ObjectInputStream:close	()V
    //   190: goto +14 -> 204
    //   193: astore_0
    //   194: getstatic 32	androidx/work/Data:TAG	Ljava/lang/String;
    //   197: ldc -85
    //   199: aload_0
    //   200: invokestatic 177	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   203: pop
    //   204: aload_2
    //   205: invokevirtual 178	java/io/ByteArrayInputStream:close	()V
    //   208: goto +14 -> 222
    //   211: astore_0
    //   212: getstatic 32	androidx/work/Data:TAG	Ljava/lang/String;
    //   215: ldc -85
    //   217: aload_0
    //   218: invokestatic 177	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   221: pop
    //   222: aload_3
    //   223: athrow
    //   224: new 181	java/lang/IllegalStateException
    //   227: dup
    //   228: ldc -73
    //   230: invokespecial 186	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   233: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	234	0	paramArrayOfByte	byte[]
    //   15	162	1	localHashMap	HashMap
    //   24	181	2	localByteArrayInputStream	java.io.ByteArrayInputStream
    //   28	41	3	localObjectInputStream	java.io.ObjectInputStream
    //   103	1	3	localObject1	Object
    //   115	22	3	localObject2	Object
    //   181	42	3	localObject3	Object
    //   40	23	4	i	int
    //   93	1	5	localClassNotFoundException	ClassNotFoundException
    //   98	1	5	localIOException	java.io.IOException
    //   117	10	5	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   68	72	75	java/io/IOException
    //   36	42	93	java/lang/ClassNotFoundException
    //   49	62	93	java/lang/ClassNotFoundException
    //   36	42	98	java/io/IOException
    //   49	62	98	java/io/IOException
    //   25	34	103	finally
    //   25	34	109	java/lang/ClassNotFoundException
    //   25	34	113	java/io/IOException
    //   136	140	143	java/io/IOException
    //   86	90	161	java/io/IOException
    //   154	158	161	java/io/IOException
    //   36	42	181	finally
    //   49	62	181	finally
    //   121	132	181	finally
    //   186	190	193	java/io/IOException
    //   204	208	211	java/io/IOException
  }
  
  /* Error */
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  @androidx.room.TypeConverter
  public static byte[] toByteArrayInternal(@NonNull Data paramData)
  {
    // Byte code:
    //   0: new 190	java/io/ByteArrayOutputStream
    //   3: dup
    //   4: invokespecial 191	java/io/ByteArrayOutputStream:<init>	()V
    //   7: astore_1
    //   8: aconst_null
    //   9: astore_2
    //   10: aconst_null
    //   11: astore_3
    //   12: aload_3
    //   13: astore 4
    //   15: new 193	java/io/ObjectOutputStream
    //   18: astore 5
    //   20: aload_3
    //   21: astore 4
    //   23: aload 5
    //   25: aload_1
    //   26: invokespecial 196	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   29: aload 5
    //   31: aload_0
    //   32: invokevirtual 199	androidx/work/Data:size	()I
    //   35: invokevirtual 203	java/io/ObjectOutputStream:writeInt	(I)V
    //   38: aload_0
    //   39: getfield 49	androidx/work/Data:mValues	Ljava/util/Map;
    //   42: invokeinterface 209 1 0
    //   47: invokeinterface 215 1 0
    //   52: astore 4
    //   54: aload 4
    //   56: invokeinterface 220 1 0
    //   61: ifeq +42 -> 103
    //   64: aload 4
    //   66: invokeinterface 223 1 0
    //   71: checkcast 225	java/util/Map$Entry
    //   74: astore_0
    //   75: aload 5
    //   77: aload_0
    //   78: invokeinterface 228 1 0
    //   83: checkcast 230	java/lang/String
    //   86: invokevirtual 233	java/io/ObjectOutputStream:writeUTF	(Ljava/lang/String;)V
    //   89: aload 5
    //   91: aload_0
    //   92: invokeinterface 236 1 0
    //   97: invokevirtual 240	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   100: goto -46 -> 54
    //   103: aload 5
    //   105: invokevirtual 241	java/io/ObjectOutputStream:close	()V
    //   108: goto +14 -> 122
    //   111: astore_0
    //   112: getstatic 32	androidx/work/Data:TAG	Ljava/lang/String;
    //   115: ldc -13
    //   117: aload_0
    //   118: invokestatic 177	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   121: pop
    //   122: aload_1
    //   123: invokevirtual 244	java/io/ByteArrayOutputStream:close	()V
    //   126: goto +14 -> 140
    //   129: astore_0
    //   130: getstatic 32	androidx/work/Data:TAG	Ljava/lang/String;
    //   133: ldc -13
    //   135: aload_0
    //   136: invokestatic 177	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   139: pop
    //   140: aload_1
    //   141: invokevirtual 245	java/io/ByteArrayOutputStream:size	()I
    //   144: sipush 10240
    //   147: if_icmpgt +8 -> 155
    //   150: aload_1
    //   151: invokevirtual 249	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   154: areturn
    //   155: new 181	java/lang/IllegalStateException
    //   158: dup
    //   159: ldc -73
    //   161: invokespecial 186	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   164: athrow
    //   165: astore_0
    //   166: aload 5
    //   168: astore 4
    //   170: goto +89 -> 259
    //   173: astore 4
    //   175: aload 5
    //   177: astore_0
    //   178: aload 4
    //   180: astore 5
    //   182: goto +11 -> 193
    //   185: astore_0
    //   186: goto +73 -> 259
    //   189: astore 5
    //   191: aload_2
    //   192: astore_0
    //   193: aload_0
    //   194: astore 4
    //   196: getstatic 32	androidx/work/Data:TAG	Ljava/lang/String;
    //   199: ldc -13
    //   201: aload 5
    //   203: invokestatic 177	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   206: pop
    //   207: aload_0
    //   208: astore 4
    //   210: aload_1
    //   211: invokevirtual 249	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   214: astore 5
    //   216: aload_0
    //   217: ifnull +21 -> 238
    //   220: aload_0
    //   221: invokevirtual 241	java/io/ObjectOutputStream:close	()V
    //   224: goto +14 -> 238
    //   227: astore_0
    //   228: getstatic 32	androidx/work/Data:TAG	Ljava/lang/String;
    //   231: ldc -13
    //   233: aload_0
    //   234: invokestatic 177	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   237: pop
    //   238: aload_1
    //   239: invokevirtual 244	java/io/ByteArrayOutputStream:close	()V
    //   242: goto +14 -> 256
    //   245: astore_0
    //   246: getstatic 32	androidx/work/Data:TAG	Ljava/lang/String;
    //   249: ldc -13
    //   251: aload_0
    //   252: invokestatic 177	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   255: pop
    //   256: aload 5
    //   258: areturn
    //   259: aload 4
    //   261: ifnull +24 -> 285
    //   264: aload 4
    //   266: invokevirtual 241	java/io/ObjectOutputStream:close	()V
    //   269: goto +16 -> 285
    //   272: astore 4
    //   274: getstatic 32	androidx/work/Data:TAG	Ljava/lang/String;
    //   277: ldc -13
    //   279: aload 4
    //   281: invokestatic 177	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   284: pop
    //   285: aload_1
    //   286: invokevirtual 244	java/io/ByteArrayOutputStream:close	()V
    //   289: goto +16 -> 305
    //   292: astore 4
    //   294: getstatic 32	androidx/work/Data:TAG	Ljava/lang/String;
    //   297: ldc -13
    //   299: aload 4
    //   301: invokestatic 177	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   304: pop
    //   305: aload_0
    //   306: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	307	0	paramData	Data
    //   7	279	1	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    //   9	183	2	localObject1	Object
    //   11	10	3	localObject2	Object
    //   13	156	4	localObject3	Object
    //   173	6	4	localIOException1	java.io.IOException
    //   194	71	4	localData	Data
    //   272	8	4	localIOException2	java.io.IOException
    //   292	8	4	localIOException3	java.io.IOException
    //   18	163	5	localObject4	Object
    //   189	13	5	localIOException4	java.io.IOException
    //   214	43	5	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   103	108	111	java/io/IOException
    //   122	126	129	java/io/IOException
    //   29	54	165	finally
    //   54	100	165	finally
    //   29	54	173	java/io/IOException
    //   54	100	173	java/io/IOException
    //   15	20	185	finally
    //   23	29	185	finally
    //   196	207	185	finally
    //   210	216	185	finally
    //   15	20	189	java/io/IOException
    //   23	29	189	java/io/IOException
    //   220	224	227	java/io/IOException
    //   238	242	245	java/io/IOException
    //   264	269	272	java/io/IOException
    //   285	289	292	java/io/IOException
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (Data.class == paramObject.getClass()))
    {
      paramObject = (Data)paramObject;
      Object localObject1 = mValues.keySet();
      if (!((Set)localObject1).equals(mValues.keySet())) {
        return false;
      }
      localObject1 = ((Set)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        Object localObject2 = (String)((Iterator)localObject1).next();
        Object localObject3 = mValues.get(localObject2);
        localObject2 = mValues.get(localObject2);
        boolean bool;
        if ((localObject3 != null) && (localObject2 != null))
        {
          if (((localObject3 instanceof Object[])) && ((localObject2 instanceof Object[]))) {
            bool = Arrays.deepEquals((Object[])localObject3, (Object[])localObject2);
          } else {
            bool = localObject3.equals(localObject2);
          }
        }
        else if (localObject3 == localObject2) {
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
  
  public boolean getBoolean(@NonNull String paramString, boolean paramBoolean)
  {
    paramString = mValues.get(paramString);
    if ((paramString instanceof Boolean)) {
      return ((Boolean)paramString).booleanValue();
    }
    return paramBoolean;
  }
  
  @Nullable
  public boolean[] getBooleanArray(@NonNull String paramString)
  {
    paramString = mValues.get(paramString);
    if ((paramString instanceof Boolean[])) {
      return convertToPrimitiveArray((Boolean[])paramString);
    }
    return null;
  }
  
  public byte getByte(@NonNull String paramString, byte paramByte)
  {
    paramString = mValues.get(paramString);
    if ((paramString instanceof Byte)) {
      return ((Byte)paramString).byteValue();
    }
    return paramByte;
  }
  
  @Nullable
  public byte[] getByteArray(@NonNull String paramString)
  {
    paramString = mValues.get(paramString);
    if ((paramString instanceof Byte[])) {
      return convertToPrimitiveArray((Byte[])paramString);
    }
    return null;
  }
  
  public double getDouble(@NonNull String paramString, double paramDouble)
  {
    paramString = mValues.get(paramString);
    if ((paramString instanceof Double)) {
      return ((Double)paramString).doubleValue();
    }
    return paramDouble;
  }
  
  @Nullable
  public double[] getDoubleArray(@NonNull String paramString)
  {
    paramString = mValues.get(paramString);
    if ((paramString instanceof Double[])) {
      return convertToPrimitiveArray((Double[])paramString);
    }
    return null;
  }
  
  public float getFloat(@NonNull String paramString, float paramFloat)
  {
    paramString = mValues.get(paramString);
    if ((paramString instanceof Float)) {
      return ((Float)paramString).floatValue();
    }
    return paramFloat;
  }
  
  @Nullable
  public float[] getFloatArray(@NonNull String paramString)
  {
    paramString = mValues.get(paramString);
    if ((paramString instanceof Float[])) {
      return convertToPrimitiveArray((Float[])paramString);
    }
    return null;
  }
  
  public int getInt(@NonNull String paramString, int paramInt)
  {
    paramString = mValues.get(paramString);
    if ((paramString instanceof Integer)) {
      return ((Integer)paramString).intValue();
    }
    return paramInt;
  }
  
  @Nullable
  public int[] getIntArray(@NonNull String paramString)
  {
    paramString = mValues.get(paramString);
    if ((paramString instanceof Integer[])) {
      return convertToPrimitiveArray((Integer[])paramString);
    }
    return null;
  }
  
  @NonNull
  public Map<String, Object> getKeyValueMap()
  {
    return Collections.unmodifiableMap(mValues);
  }
  
  public long getLong(@NonNull String paramString, long paramLong)
  {
    paramString = mValues.get(paramString);
    if ((paramString instanceof Long)) {
      return ((Long)paramString).longValue();
    }
    return paramLong;
  }
  
  @Nullable
  public long[] getLongArray(@NonNull String paramString)
  {
    paramString = mValues.get(paramString);
    if ((paramString instanceof Long[])) {
      return convertToPrimitiveArray((Long[])paramString);
    }
    return null;
  }
  
  @Nullable
  public String getString(@NonNull String paramString)
  {
    paramString = mValues.get(paramString);
    if ((paramString instanceof String)) {
      return (String)paramString;
    }
    return null;
  }
  
  @Nullable
  public String[] getStringArray(@NonNull String paramString)
  {
    paramString = mValues.get(paramString);
    if ((paramString instanceof String[])) {
      return (String[])paramString;
    }
    return null;
  }
  
  public <T> boolean hasKeyWithValueOfType(@NonNull String paramString, @NonNull Class<T> paramClass)
  {
    paramString = mValues.get(paramString);
    boolean bool;
    if ((paramString != null) && (paramClass.isAssignableFrom(paramString.getClass()))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    return mValues.hashCode() * 31;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  @VisibleForTesting
  public int size()
  {
    return mValues.size();
  }
  
  @NonNull
  public byte[] toByteArray()
  {
    return toByteArrayInternal(this);
  }
  
  @NonNull
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("Data {");
    if (!mValues.isEmpty())
    {
      Iterator localIterator = mValues.keySet().iterator();
      while (localIterator.hasNext())
      {
        Object localObject = (String)localIterator.next();
        localStringBuilder.append((String)localObject);
        localStringBuilder.append(" : ");
        localObject = mValues.get(localObject);
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
  
  public static final class Builder
  {
    private Map<String, Object> mValues = new HashMap();
    
    @NonNull
    public Data build()
    {
      Data localData = new Data(mValues);
      Data.toByteArrayInternal(localData);
      return localData;
    }
    
    @NonNull
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public Builder put(@NonNull String paramString, @Nullable Object paramObject)
    {
      if (paramObject == null)
      {
        mValues.put(paramString, null);
      }
      else
      {
        Class localClass = paramObject.getClass();
        if ((localClass != Boolean.class) && (localClass != Byte.class) && (localClass != Integer.class) && (localClass != Long.class) && (localClass != Float.class) && (localClass != Double.class) && (localClass != String.class) && (localClass != Boolean[].class) && (localClass != Byte[].class) && (localClass != Integer[].class) && (localClass != Long[].class) && (localClass != Float[].class) && (localClass != Double[].class) && (localClass != String[].class))
        {
          if (localClass == boolean[].class) {
            mValues.put(paramString, Data.convertPrimitiveBooleanArray((boolean[])paramObject));
          } else if (localClass == byte[].class) {
            mValues.put(paramString, Data.convertPrimitiveByteArray((byte[])paramObject));
          } else if (localClass == int[].class) {
            mValues.put(paramString, Data.convertPrimitiveIntArray((int[])paramObject));
          } else if (localClass == long[].class) {
            mValues.put(paramString, Data.convertPrimitiveLongArray((long[])paramObject));
          } else if (localClass == float[].class) {
            mValues.put(paramString, Data.convertPrimitiveFloatArray((float[])paramObject));
          } else if (localClass == double[].class) {
            mValues.put(paramString, Data.convertPrimitiveDoubleArray((double[])paramObject));
          } else {
            throw new IllegalArgumentException(String.format("Key %s has invalid type %s", new Object[] { paramString, localClass }));
          }
        }
        else {
          mValues.put(paramString, paramObject);
        }
      }
      return this;
    }
    
    @NonNull
    public Builder putAll(@NonNull Data paramData)
    {
      putAll(mValues);
      return this;
    }
    
    @NonNull
    public Builder putAll(@NonNull Map<String, Object> paramMap)
    {
      paramMap = paramMap.entrySet().iterator();
      while (paramMap.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)paramMap.next();
        put((String)localEntry.getKey(), localEntry.getValue());
      }
      return this;
    }
    
    @NonNull
    public Builder putBoolean(@NonNull String paramString, boolean paramBoolean)
    {
      mValues.put(paramString, Boolean.valueOf(paramBoolean));
      return this;
    }
    
    @NonNull
    public Builder putBooleanArray(@NonNull String paramString, @NonNull boolean[] paramArrayOfBoolean)
    {
      mValues.put(paramString, Data.convertPrimitiveBooleanArray(paramArrayOfBoolean));
      return this;
    }
    
    @NonNull
    public Builder putByte(@NonNull String paramString, byte paramByte)
    {
      mValues.put(paramString, Byte.valueOf(paramByte));
      return this;
    }
    
    @NonNull
    public Builder putByteArray(@NonNull String paramString, @NonNull byte[] paramArrayOfByte)
    {
      mValues.put(paramString, Data.convertPrimitiveByteArray(paramArrayOfByte));
      return this;
    }
    
    @NonNull
    public Builder putDouble(@NonNull String paramString, double paramDouble)
    {
      mValues.put(paramString, Double.valueOf(paramDouble));
      return this;
    }
    
    @NonNull
    public Builder putDoubleArray(@NonNull String paramString, @NonNull double[] paramArrayOfDouble)
    {
      mValues.put(paramString, Data.convertPrimitiveDoubleArray(paramArrayOfDouble));
      return this;
    }
    
    @NonNull
    public Builder putFloat(@NonNull String paramString, float paramFloat)
    {
      mValues.put(paramString, Float.valueOf(paramFloat));
      return this;
    }
    
    @NonNull
    public Builder putFloatArray(@NonNull String paramString, @NonNull float[] paramArrayOfFloat)
    {
      mValues.put(paramString, Data.convertPrimitiveFloatArray(paramArrayOfFloat));
      return this;
    }
    
    @NonNull
    public Builder putInt(@NonNull String paramString, int paramInt)
    {
      mValues.put(paramString, Integer.valueOf(paramInt));
      return this;
    }
    
    @NonNull
    public Builder putIntArray(@NonNull String paramString, @NonNull int[] paramArrayOfInt)
    {
      mValues.put(paramString, Data.convertPrimitiveIntArray(paramArrayOfInt));
      return this;
    }
    
    @NonNull
    public Builder putLong(@NonNull String paramString, long paramLong)
    {
      mValues.put(paramString, Long.valueOf(paramLong));
      return this;
    }
    
    @NonNull
    public Builder putLongArray(@NonNull String paramString, @NonNull long[] paramArrayOfLong)
    {
      mValues.put(paramString, Data.convertPrimitiveLongArray(paramArrayOfLong));
      return this;
    }
    
    @NonNull
    public Builder putString(@NonNull String paramString1, @Nullable String paramString2)
    {
      mValues.put(paramString1, paramString2);
      return this;
    }
    
    @NonNull
    public Builder putStringArray(@NonNull String paramString, @NonNull String[] paramArrayOfString)
    {
      mValues.put(paramString, paramArrayOfString);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.Data
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */