package com.facebook.appevents.ml;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.io.File;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import z2;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public final class Model
{
  private static final int SEQ_LEN = 128;
  private MTensor convs_0_bias;
  private MTensor convs_0_weight;
  private MTensor convs_1_bias;
  private MTensor convs_1_weight;
  private MTensor convs_2_bias;
  private MTensor convs_2_weight;
  private MTensor embedding;
  private MTensor fc1_bias;
  private MTensor fc1_weight;
  private MTensor fc2_bias;
  private MTensor fc2_weight;
  private final Map<String, MTensor> final_weights = new HashMap();
  
  private Model(Map<String, MTensor> paramMap)
  {
    embedding = ((MTensor)paramMap.get("embed.weight"));
    convs_0_weight = Operator.transpose3D((MTensor)paramMap.get("convs.0.weight"));
    convs_1_weight = Operator.transpose3D((MTensor)paramMap.get("convs.1.weight"));
    convs_2_weight = Operator.transpose3D((MTensor)paramMap.get("convs.2.weight"));
    convs_0_bias = ((MTensor)paramMap.get("convs.0.bias"));
    convs_1_bias = ((MTensor)paramMap.get("convs.1.bias"));
    convs_2_bias = ((MTensor)paramMap.get("convs.2.bias"));
    fc1_weight = Operator.transpose2D((MTensor)paramMap.get("fc1.weight"));
    fc2_weight = Operator.transpose2D((MTensor)paramMap.get("fc2.weight"));
    fc1_bias = ((MTensor)paramMap.get("fc1.bias"));
    fc2_bias = ((MTensor)paramMap.get("fc2.bias"));
    Iterator localIterator = new HashSet() {}.iterator();
    while (localIterator.hasNext())
    {
      String str1 = (String)localIterator.next();
      String str2 = z2.o(str1, ".weight");
      str1 = z2.o(str1, ".bias");
      MTensor localMTensor1 = (MTensor)paramMap.get(str2);
      MTensor localMTensor2 = (MTensor)paramMap.get(str1);
      if (localMTensor1 != null)
      {
        localMTensor1 = Operator.transpose2D(localMTensor1);
        final_weights.put(str2, localMTensor1);
      }
      if (localMTensor2 != null) {
        final_weights.put(str1, localMTensor2);
      }
    }
  }
  
  @Nullable
  public static Model build(File paramFile)
  {
    if (CrashShieldHandler.isObjectCrashing(Model.class)) {
      return null;
    }
    try
    {
      paramFile = parse(paramFile);
      try
      {
        paramFile = new Model(paramFile);
        return paramFile;
      }
      catch (Exception paramFile)
      {
        return null;
      }
      return null;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramFile, Model.class);
    }
  }
  
  private static Map<String, String> getMapping()
  {
    if (CrashShieldHandler.isObjectCrashing(Model.class)) {
      return null;
    }
    try
    {
      HashMap local2 = new HashMap() {};
      return local2;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, Model.class);
    }
    return null;
  }
  
  /* Error */
  @Nullable
  private static Map<String, MTensor> parse(File paramFile)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 150	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   5: ifeq +5 -> 10
    //   8: aconst_null
    //   9: areturn
    //   10: new 167	java/io/FileInputStream
    //   13: astore_1
    //   14: aload_1
    //   15: aload_0
    //   16: invokespecial 170	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   19: aload_1
    //   20: invokevirtual 176	java/io/InputStream:available	()I
    //   23: istore_2
    //   24: new 178	java/io/DataInputStream
    //   27: astore_0
    //   28: aload_0
    //   29: aload_1
    //   30: invokespecial 181	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   33: iload_2
    //   34: newarray <illegal type>
    //   36: astore_3
    //   37: aload_0
    //   38: aload_3
    //   39: invokevirtual 185	java/io/DataInputStream:readFully	([B)V
    //   42: aload_0
    //   43: invokevirtual 188	java/io/InputStream:close	()V
    //   46: iload_2
    //   47: iconst_4
    //   48: if_icmpge +5 -> 53
    //   51: aconst_null
    //   52: areturn
    //   53: aload_3
    //   54: iconst_0
    //   55: iconst_4
    //   56: invokestatic 194	java/nio/ByteBuffer:wrap	([BII)Ljava/nio/ByteBuffer;
    //   59: astore_0
    //   60: aload_0
    //   61: getstatic 200	java/nio/ByteOrder:LITTLE_ENDIAN	Ljava/nio/ByteOrder;
    //   64: invokevirtual 204	java/nio/ByteBuffer:order	(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    //   67: pop
    //   68: aload_0
    //   69: invokevirtual 207	java/nio/ByteBuffer:getInt	()I
    //   72: istore 4
    //   74: iload 4
    //   76: iconst_4
    //   77: iadd
    //   78: istore 5
    //   80: iload_2
    //   81: iload 5
    //   83: if_icmpge +5 -> 88
    //   86: aconst_null
    //   87: areturn
    //   88: new 122	java/lang/String
    //   91: astore_0
    //   92: aload_0
    //   93: aload_3
    //   94: iconst_4
    //   95: iload 4
    //   97: invokespecial 210	java/lang/String:<init>	([BII)V
    //   100: new 212	org/json/JSONObject
    //   103: astore 6
    //   105: aload 6
    //   107: aload_0
    //   108: invokespecial 215	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   111: aload 6
    //   113: invokevirtual 219	org/json/JSONObject:names	()Lorg/json/JSONArray;
    //   116: astore_0
    //   117: aload_0
    //   118: invokevirtual 224	org/json/JSONArray:length	()I
    //   121: istore 7
    //   123: iload 7
    //   125: anewarray 122	java/lang/String
    //   128: astore 8
    //   130: iconst_0
    //   131: istore 4
    //   133: iload 4
    //   135: iload 7
    //   137: if_icmpge +20 -> 157
    //   140: aload 8
    //   142: iload 4
    //   144: aload_0
    //   145: iload 4
    //   147: invokevirtual 228	org/json/JSONArray:getString	(I)Ljava/lang/String;
    //   150: aastore
    //   151: iinc 4 1
    //   154: goto -21 -> 133
    //   157: aload 8
    //   159: invokestatic 234	java/util/Arrays:sort	([Ljava/lang/Object;)V
    //   162: new 37	java/util/HashMap
    //   165: astore 9
    //   167: aload 9
    //   169: invokespecial 38	java/util/HashMap:<init>	()V
    //   172: invokestatic 236	com/facebook/appevents/ml/Model:getMapping	()Ljava/util/Map;
    //   175: astore 10
    //   177: iconst_0
    //   178: istore 11
    //   180: iload 5
    //   182: istore 4
    //   184: iload 11
    //   186: iload 7
    //   188: if_icmpge +188 -> 376
    //   191: aload 8
    //   193: iload 11
    //   195: aaload
    //   196: astore_1
    //   197: aload 6
    //   199: aload_1
    //   200: invokevirtual 240	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   203: astore 12
    //   205: aload 12
    //   207: invokevirtual 224	org/json/JSONArray:length	()I
    //   210: istore 13
    //   212: iload 13
    //   214: newarray <illegal type>
    //   216: astore_0
    //   217: iconst_0
    //   218: istore 14
    //   220: iconst_1
    //   221: istore 5
    //   223: iload 14
    //   225: iload 13
    //   227: if_icmpge +37 -> 264
    //   230: aload 12
    //   232: iload 14
    //   234: invokevirtual 243	org/json/JSONArray:getInt	(I)I
    //   237: istore 15
    //   239: aload_0
    //   240: iload 14
    //   242: iload 15
    //   244: iastore
    //   245: iload 5
    //   247: iload 15
    //   249: imul
    //   250: istore 5
    //   252: iinc 14 1
    //   255: goto -32 -> 223
    //   258: astore_0
    //   259: aconst_null
    //   260: astore_0
    //   261: goto +130 -> 391
    //   264: iload 5
    //   266: iconst_4
    //   267: imul
    //   268: istore 13
    //   270: iload 4
    //   272: iload 13
    //   274: iadd
    //   275: istore 14
    //   277: iload 14
    //   279: iload_2
    //   280: if_icmple +5 -> 285
    //   283: aconst_null
    //   284: areturn
    //   285: aload_3
    //   286: iload 4
    //   288: iload 13
    //   290: invokestatic 194	java/nio/ByteBuffer:wrap	([BII)Ljava/nio/ByteBuffer;
    //   293: astore 16
    //   295: aload 16
    //   297: getstatic 200	java/nio/ByteOrder:LITTLE_ENDIAN	Ljava/nio/ByteOrder;
    //   300: invokevirtual 204	java/nio/ByteBuffer:order	(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    //   303: pop
    //   304: new 50	com/facebook/appevents/ml/MTensor
    //   307: astore 12
    //   309: aload 12
    //   311: aload_0
    //   312: invokespecial 246	com/facebook/appevents/ml/MTensor:<init>	([I)V
    //   315: aload 16
    //   317: invokevirtual 250	java/nio/ByteBuffer:asFloatBuffer	()Ljava/nio/FloatBuffer;
    //   320: aload 12
    //   322: invokevirtual 254	com/facebook/appevents/ml/MTensor:getData	()[F
    //   325: iconst_0
    //   326: iload 5
    //   328: invokevirtual 259	java/nio/FloatBuffer:get	([FII)Ljava/nio/FloatBuffer;
    //   331: pop
    //   332: aload_1
    //   333: astore_0
    //   334: aload 10
    //   336: aload_1
    //   337: invokeinterface 262 2 0
    //   342: ifeq +15 -> 357
    //   345: aload 10
    //   347: aload_1
    //   348: invokeinterface 48 2 0
    //   353: checkcast 122	java/lang/String
    //   356: astore_0
    //   357: aload 9
    //   359: aload_0
    //   360: aload 12
    //   362: invokevirtual 263	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   365: pop
    //   366: iinc 11 1
    //   369: iload 14
    //   371: istore 4
    //   373: goto -189 -> 184
    //   376: aload 9
    //   378: areturn
    //   379: astore_0
    //   380: aload_0
    //   381: ldc 2
    //   383: invokestatic 160	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   386: aconst_null
    //   387: areturn
    //   388: astore_0
    //   389: aconst_null
    //   390: astore_0
    //   391: aload_0
    //   392: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	393	0	paramFile	File
    //   13	335	1	localFileInputStream	java.io.FileInputStream
    //   23	258	2	i	int
    //   36	250	3	arrayOfByte	byte[]
    //   72	300	4	j	int
    //   78	249	5	k	int
    //   103	95	6	localJSONObject	org.json.JSONObject
    //   121	68	7	m	int
    //   128	64	8	arrayOfString	String[]
    //   165	212	9	localHashMap	HashMap
    //   175	171	10	localMap	Map
    //   178	189	11	n	int
    //   203	158	12	localObject	Object
    //   210	79	13	i1	int
    //   218	152	14	i2	int
    //   237	13	15	i3	int
    //   293	23	16	localByteBuffer	java.nio.ByteBuffer
    // Exception table:
    //   from	to	target	type
    //   230	239	258	java/lang/Exception
    //   285	332	258	java/lang/Exception
    //   334	357	258	java/lang/Exception
    //   357	366	258	java/lang/Exception
    //   10	46	379	finally
    //   53	74	379	finally
    //   88	130	379	finally
    //   140	151	379	finally
    //   157	177	379	finally
    //   197	217	379	finally
    //   230	239	379	finally
    //   285	332	379	finally
    //   334	357	379	finally
    //   357	366	379	finally
    //   10	46	388	java/lang/Exception
    //   53	74	388	java/lang/Exception
    //   88	130	388	java/lang/Exception
    //   140	151	388	java/lang/Exception
    //   157	177	388	java/lang/Exception
    //   197	217	388	java/lang/Exception
  }
  
  @Nullable
  public MTensor predictOnMTML(MTensor paramMTensor, String[] paramArrayOfString, String paramString)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return null;
    }
    try
    {
      paramArrayOfString = Operator.conv1D(Operator.embedding(paramArrayOfString, 128, embedding), convs_0_weight);
      Operator.addmv(paramArrayOfString, convs_0_bias);
      Operator.relu(paramArrayOfString);
      Object localObject1 = Operator.conv1D(paramArrayOfString, convs_1_weight);
      Operator.addmv((MTensor)localObject1, convs_1_bias);
      Operator.relu((MTensor)localObject1);
      Object localObject2 = Operator.maxPool1D((MTensor)localObject1, 2);
      localObject1 = Operator.conv1D((MTensor)localObject2, convs_2_weight);
      Operator.addmv((MTensor)localObject1, convs_2_bias);
      Operator.relu((MTensor)localObject1);
      paramArrayOfString = Operator.maxPool1D(paramArrayOfString, paramArrayOfString.getShape(1));
      localObject2 = Operator.maxPool1D((MTensor)localObject2, ((MTensor)localObject2).getShape(1));
      localObject1 = Operator.maxPool1D((MTensor)localObject1, ((MTensor)localObject1).getShape(1));
      Operator.flatten(paramArrayOfString, 1);
      Operator.flatten((MTensor)localObject2, 1);
      Operator.flatten((MTensor)localObject1, 1);
      paramMTensor = Operator.dense(Operator.concatenate(new MTensor[] { paramArrayOfString, localObject2, localObject1, paramMTensor }), fc1_weight, fc1_bias);
      Operator.relu(paramMTensor);
      paramMTensor = Operator.dense(paramMTensor, fc2_weight, fc2_bias);
      Operator.relu(paramMTensor);
      localObject1 = final_weights;
      paramArrayOfString = new java/lang/StringBuilder;
      paramArrayOfString.<init>();
      paramArrayOfString.append(paramString);
      paramArrayOfString.append(".weight");
      paramArrayOfString = (MTensor)((Map)localObject1).get(paramArrayOfString.toString());
      localObject1 = final_weights;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append(paramString);
      ((StringBuilder)localObject2).append(".bias");
      paramString = (MTensor)((Map)localObject1).get(((StringBuilder)localObject2).toString());
      if ((paramArrayOfString != null) && (paramString != null))
      {
        paramMTensor = Operator.dense(paramMTensor, paramArrayOfString, paramString);
        Operator.softmax(paramMTensor);
        return paramMTensor;
      }
      return null;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramMTensor, this);
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.ml.Model
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */