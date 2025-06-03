package l8;

import a9.d;
import android.util.Log;
import f;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p8.e;

public final class h
{
  public static final Charset b = Charset.forName("UTF-8");
  public final e a;
  
  public h(e parame)
  {
    a = parame;
  }
  
  public static HashMap a(String paramString)
  {
    JSONObject localJSONObject = new JSONObject(paramString);
    HashMap localHashMap = new HashMap();
    Iterator localIterator = localJSONObject.keys();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      boolean bool = localJSONObject.isNull(str);
      paramString = null;
      if (!bool) {
        paramString = localJSONObject.optString(str, null);
      }
      localHashMap.put(str, paramString);
    }
    return localHashMap;
  }
  
  public static ArrayList b(String paramString)
  {
    paramString = new JSONObject(paramString).getJSONArray("rolloutsState");
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < paramString.length(); i++)
    {
      String str = paramString.getString(i);
      try
      {
        localArrayList.add(k.a(str));
      }
      catch (Exception localException)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Failed de-serializing rollouts state. ");
        localStringBuilder.append(str);
        Log.w("FirebaseCrashlytics", localStringBuilder.toString(), localException);
      }
    }
    return localArrayList;
  }
  
  public static String e(List<k> paramList)
  {
    HashMap localHashMap = new HashMap();
    JSONArray localJSONArray = new JSONArray();
    for (int i = 0; i < paramList.size(); i++)
    {
      String str = k.a.a(paramList.get(i));
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(str);
        localJSONArray.put(localJSONObject);
      }
      catch (JSONException localJSONException)
      {
        Log.w("FirebaseCrashlytics", "Exception parsing rollout assignment!", localJSONException);
      }
    }
    localHashMap.put("rolloutsState", localJSONArray);
    return new JSONObject(localHashMap).toString();
  }
  
  public static void f(File paramFile)
  {
    if ((paramFile.exists()) && (paramFile.delete()))
    {
      StringBuilder localStringBuilder = f.l("Deleted corrupt file: ");
      localStringBuilder.append(paramFile.getAbsolutePath());
      Log.i("FirebaseCrashlytics", localStringBuilder.toString(), null);
    }
  }
  
  public static void g(File paramFile, String paramString)
  {
    if ((paramFile.exists()) && (paramFile.delete())) {
      Log.i("FirebaseCrashlytics", String.format("Deleted corrupt file: %s\nReason: %s", new Object[] { paramFile.getAbsolutePath(), paramString }), null);
    }
  }
  
  /* Error */
  public final java.util.Map<String, String> c(String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: iload_2
    //   1: ifeq +17 -> 18
    //   4: aload_0
    //   5: getfield 27	l8/h:a	Lp8/e;
    //   8: aload_1
    //   9: ldc -73
    //   11: invokevirtual 188	p8/e:b	(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
    //   14: astore_3
    //   15: goto +14 -> 29
    //   18: aload_0
    //   19: getfield 27	l8/h:a	Lp8/e;
    //   22: aload_1
    //   23: ldc -67
    //   25: invokevirtual 188	p8/e:b	(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
    //   28: astore_3
    //   29: aload_3
    //   30: invokevirtual 156	java/io/File:exists	()Z
    //   33: ifeq +120 -> 153
    //   36: aload_3
    //   37: invokevirtual 192	java/io/File:length	()J
    //   40: lconst_0
    //   41: lcmp
    //   42: ifne +6 -> 48
    //   45: goto +108 -> 153
    //   48: aconst_null
    //   49: astore 4
    //   51: new 194	java/io/FileInputStream
    //   54: astore 5
    //   56: aload 5
    //   58: aload_3
    //   59: invokespecial 196	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   62: aload 5
    //   64: astore_1
    //   65: aload 5
    //   67: invokestatic 202	j8/g:j	(Ljava/io/FileInputStream;)Ljava/lang/String;
    //   70: invokestatic 204	l8/h:a	(Ljava/lang/String;)Ljava/util/HashMap;
    //   73: astore 4
    //   75: aload 5
    //   77: ldc -50
    //   79: invokestatic 209	j8/g:b	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   82: aload 4
    //   84: areturn
    //   85: astore 4
    //   87: goto +16 -> 103
    //   90: astore_1
    //   91: aload 4
    //   93: astore 5
    //   95: goto +49 -> 144
    //   98: astore 4
    //   100: aconst_null
    //   101: astore 5
    //   103: aload 5
    //   105: astore_1
    //   106: ldc 106
    //   108: ldc -45
    //   110: aload 4
    //   112: invokestatic 116	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   115: pop
    //   116: aload 5
    //   118: astore_1
    //   119: aload_3
    //   120: invokestatic 213	l8/h:f	(Ljava/io/File;)V
    //   123: aload 5
    //   125: ldc -50
    //   127: invokestatic 209	j8/g:b	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   130: invokestatic 219	java/util/Collections:emptyMap	()Ljava/util/Map;
    //   133: areturn
    //   134: astore 5
    //   136: aload_1
    //   137: astore_3
    //   138: aload 5
    //   140: astore_1
    //   141: aload_3
    //   142: astore 5
    //   144: aload 5
    //   146: ldc -50
    //   148: invokestatic 209	j8/g:b	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   151: aload_1
    //   152: athrow
    //   153: new 97	java/lang/StringBuilder
    //   156: dup
    //   157: invokespecial 98	java/lang/StringBuilder:<init>	()V
    //   160: astore 5
    //   162: aload 5
    //   164: ldc -35
    //   166: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   169: pop
    //   170: aload 5
    //   172: aload_1
    //   173: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   176: pop
    //   177: aload_3
    //   178: aload 5
    //   180: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   183: invokestatic 223	l8/h:g	(Ljava/io/File;Ljava/lang/String;)V
    //   186: goto -56 -> 130
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	189	0	this	h
    //   0	189	1	paramString	String
    //   0	189	2	paramBoolean	boolean
    //   14	164	3	localObject1	Object
    //   49	34	4	localHashMap	HashMap
    //   85	7	4	localException1	Exception
    //   98	13	4	localException2	Exception
    //   54	70	5	localObject2	Object
    //   134	5	5	localObject3	Object
    //   142	37	5	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   65	75	85	java/lang/Exception
    //   51	62	90	finally
    //   51	62	98	java/lang/Exception
    //   65	75	134	finally
    //   106	116	134	finally
    //   119	123	134	finally
  }
  
  /* Error */
  public final String d(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 27	l8/h:a	Lp8/e;
    //   4: aload_1
    //   5: ldc -28
    //   7: invokevirtual 188	p8/e:b	(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
    //   10: astore_2
    //   11: aload_2
    //   12: invokevirtual 156	java/io/File:exists	()Z
    //   15: istore_3
    //   16: aconst_null
    //   17: astore 4
    //   19: iload_3
    //   20: ifeq +262 -> 282
    //   23: aload_2
    //   24: invokevirtual 192	java/io/File:length	()J
    //   27: lconst_0
    //   28: lcmp
    //   29: ifne +6 -> 35
    //   32: goto +250 -> 282
    //   35: new 194	java/io/FileInputStream
    //   38: astore 5
    //   40: aload 5
    //   42: aload_2
    //   43: invokespecial 196	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   46: aload 5
    //   48: astore 4
    //   50: aload 5
    //   52: invokestatic 202	j8/g:j	(Ljava/io/FileInputStream;)Ljava/lang/String;
    //   55: astore 6
    //   57: aload 5
    //   59: astore 4
    //   61: new 30	org/json/JSONObject
    //   64: astore 7
    //   66: aload 5
    //   68: astore 4
    //   70: aload 7
    //   72: aload 6
    //   74: invokespecial 33	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   77: aload 5
    //   79: astore 4
    //   81: aload 7
    //   83: ldc -26
    //   85: invokevirtual 56	org/json/JSONObject:isNull	(Ljava/lang/String;)Z
    //   88: ifne +20 -> 108
    //   91: aload 5
    //   93: astore 4
    //   95: aload 7
    //   97: ldc -26
    //   99: aconst_null
    //   100: invokevirtual 60	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   103: astore 6
    //   105: goto +6 -> 111
    //   108: aconst_null
    //   109: astore 6
    //   111: aload 5
    //   113: astore 4
    //   115: new 97	java/lang/StringBuilder
    //   118: astore 7
    //   120: aload 5
    //   122: astore 4
    //   124: aload 7
    //   126: invokespecial 98	java/lang/StringBuilder:<init>	()V
    //   129: aload 5
    //   131: astore 4
    //   133: aload 7
    //   135: ldc -24
    //   137: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   140: pop
    //   141: aload 5
    //   143: astore 4
    //   145: aload 7
    //   147: aload 6
    //   149: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   152: pop
    //   153: aload 5
    //   155: astore 4
    //   157: aload 7
    //   159: ldc -22
    //   161: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   164: pop
    //   165: aload 5
    //   167: astore 4
    //   169: aload 7
    //   171: aload_1
    //   172: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   175: pop
    //   176: aload 5
    //   178: astore 4
    //   180: aload 7
    //   182: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   185: astore_1
    //   186: aload 5
    //   188: astore 4
    //   190: ldc 106
    //   192: iconst_3
    //   193: invokestatic 238	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   196: ifeq +15 -> 211
    //   199: aload 5
    //   201: astore 4
    //   203: ldc 106
    //   205: aload_1
    //   206: aconst_null
    //   207: invokestatic 240	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   210: pop
    //   211: aload 5
    //   213: ldc -50
    //   215: invokestatic 209	j8/g:b	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   218: aload 6
    //   220: areturn
    //   221: astore_1
    //   222: goto +51 -> 273
    //   225: astore 4
    //   227: aload 5
    //   229: astore_1
    //   230: aload 4
    //   232: astore 5
    //   234: goto +11 -> 245
    //   237: astore_1
    //   238: goto +35 -> 273
    //   241: astore 5
    //   243: aconst_null
    //   244: astore_1
    //   245: aload_1
    //   246: astore 4
    //   248: ldc 106
    //   250: ldc -45
    //   252: aload 5
    //   254: invokestatic 116	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   257: pop
    //   258: aload_1
    //   259: astore 4
    //   261: aload_2
    //   262: invokestatic 213	l8/h:f	(Ljava/io/File;)V
    //   265: aload_1
    //   266: ldc -50
    //   268: invokestatic 209	j8/g:b	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   271: aconst_null
    //   272: areturn
    //   273: aload 4
    //   275: ldc -50
    //   277: invokestatic 209	j8/g:b	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   280: aload_1
    //   281: athrow
    //   282: ldc -14
    //   284: aload_1
    //   285: invokestatic 245	g:d	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   288: astore_1
    //   289: ldc 106
    //   291: iconst_3
    //   292: invokestatic 238	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   295: ifeq +11 -> 306
    //   298: ldc 106
    //   300: aload_1
    //   301: aconst_null
    //   302: invokestatic 240	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   305: pop
    //   306: aload_2
    //   307: invokestatic 213	l8/h:f	(Ljava/io/File;)V
    //   310: aconst_null
    //   311: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	312	0	this	h
    //   0	312	1	paramString	String
    //   10	297	2	localFile	File
    //   15	5	3	bool	boolean
    //   17	185	4	localObject1	Object
    //   225	6	4	localException1	Exception
    //   246	28	4	str1	String
    //   38	195	5	localObject2	Object
    //   241	12	5	localException2	Exception
    //   55	164	6	str2	String
    //   64	117	7	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   50	57	221	finally
    //   61	66	221	finally
    //   70	77	221	finally
    //   81	91	221	finally
    //   95	105	221	finally
    //   115	120	221	finally
    //   124	129	221	finally
    //   133	141	221	finally
    //   145	153	221	finally
    //   157	165	221	finally
    //   169	176	221	finally
    //   180	186	221	finally
    //   190	199	221	finally
    //   203	211	221	finally
    //   248	258	221	finally
    //   261	265	221	finally
    //   50	57	225	java/lang/Exception
    //   61	66	225	java/lang/Exception
    //   70	77	225	java/lang/Exception
    //   81	91	225	java/lang/Exception
    //   95	105	225	java/lang/Exception
    //   115	120	225	java/lang/Exception
    //   124	129	225	java/lang/Exception
    //   133	141	225	java/lang/Exception
    //   145	153	225	java/lang/Exception
    //   157	165	225	java/lang/Exception
    //   169	176	225	java/lang/Exception
    //   180	186	225	java/lang/Exception
    //   190	199	225	java/lang/Exception
    //   203	211	225	java/lang/Exception
    //   35	46	237	finally
    //   35	46	241	java/lang/Exception
  }
  
  /* Error */
  public final void h(String paramString, java.util.Map<String, String> paramMap, boolean paramBoolean)
  {
    // Byte code:
    //   0: iload_3
    //   1: ifeq +18 -> 19
    //   4: aload_0
    //   5: getfield 27	l8/h:a	Lp8/e;
    //   8: aload_1
    //   9: ldc -73
    //   11: invokevirtual 188	p8/e:b	(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
    //   14: astore 4
    //   16: goto +15 -> 31
    //   19: aload_0
    //   20: getfield 27	l8/h:a	Lp8/e;
    //   23: aload_1
    //   24: ldc -67
    //   26: invokevirtual 188	p8/e:b	(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
    //   29: astore 4
    //   31: aconst_null
    //   32: astore 5
    //   34: aconst_null
    //   35: astore 6
    //   37: aload 6
    //   39: astore_1
    //   40: new 30	org/json/JSONObject
    //   43: astore 7
    //   45: aload 6
    //   47: astore_1
    //   48: aload 7
    //   50: aload_2
    //   51: invokespecial 146	org/json/JSONObject:<init>	(Ljava/util/Map;)V
    //   54: aload 6
    //   56: astore_1
    //   57: aload 7
    //   59: invokevirtual 147	org/json/JSONObject:toString	()Ljava/lang/String;
    //   62: astore 7
    //   64: aload 6
    //   66: astore_1
    //   67: new 249	java/io/BufferedWriter
    //   70: astore_2
    //   71: aload 6
    //   73: astore_1
    //   74: new 251	java/io/OutputStreamWriter
    //   77: astore 8
    //   79: aload 6
    //   81: astore_1
    //   82: new 253	java/io/FileOutputStream
    //   85: astore 9
    //   87: aload 6
    //   89: astore_1
    //   90: aload 9
    //   92: aload 4
    //   94: invokespecial 254	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   97: aload 6
    //   99: astore_1
    //   100: aload 8
    //   102: aload 9
    //   104: getstatic 20	l8/h:b	Ljava/nio/charset/Charset;
    //   107: invokespecial 257	java/io/OutputStreamWriter:<init>	(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V
    //   110: aload 6
    //   112: astore_1
    //   113: aload_2
    //   114: aload 8
    //   116: invokespecial 260	java/io/BufferedWriter:<init>	(Ljava/io/Writer;)V
    //   119: aload_2
    //   120: aload 7
    //   122: invokevirtual 265	java/io/Writer:write	(Ljava/lang/String;)V
    //   125: aload_2
    //   126: invokevirtual 268	java/io/Writer:flush	()V
    //   129: aload_2
    //   130: ldc_w 270
    //   133: invokestatic 209	j8/g:b	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   136: goto +49 -> 185
    //   139: astore_1
    //   140: goto +51 -> 191
    //   143: astore 6
    //   145: goto +13 -> 158
    //   148: astore 4
    //   150: goto +36 -> 186
    //   153: astore 6
    //   155: aload 5
    //   157: astore_2
    //   158: aload_2
    //   159: astore_1
    //   160: ldc 106
    //   162: ldc_w 272
    //   165: aload 6
    //   167: invokestatic 116	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   170: pop
    //   171: aload_2
    //   172: astore_1
    //   173: aload 4
    //   175: invokestatic 213	l8/h:f	(Ljava/io/File;)V
    //   178: aload_2
    //   179: ldc_w 270
    //   182: invokestatic 209	j8/g:b	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   185: return
    //   186: aload_1
    //   187: astore_2
    //   188: aload 4
    //   190: astore_1
    //   191: aload_2
    //   192: ldc_w 270
    //   195: invokestatic 209	j8/g:b	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   198: aload_1
    //   199: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	200	0	this	h
    //   0	200	1	paramString	String
    //   0	200	2	paramMap	java.util.Map<String, String>
    //   0	200	3	paramBoolean	boolean
    //   14	79	4	localFile1	File
    //   148	41	4	localFile2	File
    //   32	124	5	localObject1	Object
    //   35	76	6	localObject2	Object
    //   143	1	6	localException1	Exception
    //   153	13	6	localException2	Exception
    //   43	78	7	localObject3	Object
    //   77	38	8	localOutputStreamWriter	java.io.OutputStreamWriter
    //   85	18	9	localFileOutputStream	java.io.FileOutputStream
    // Exception table:
    //   from	to	target	type
    //   119	129	139	finally
    //   119	129	143	java/lang/Exception
    //   40	45	148	finally
    //   48	54	148	finally
    //   57	64	148	finally
    //   67	71	148	finally
    //   74	79	148	finally
    //   82	87	148	finally
    //   90	97	148	finally
    //   100	110	148	finally
    //   113	119	148	finally
    //   160	171	148	finally
    //   173	178	148	finally
    //   40	45	153	java/lang/Exception
    //   48	54	153	java/lang/Exception
    //   57	64	153	java/lang/Exception
    //   67	71	153	java/lang/Exception
    //   74	79	153	java/lang/Exception
    //   82	87	153	java/lang/Exception
    //   90	97	153	java/lang/Exception
    //   100	110	153	java/lang/Exception
    //   113	119	153	java/lang/Exception
  }
  
  /* Error */
  public final void i(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 27	l8/h:a	Lp8/e;
    //   4: aload_1
    //   5: ldc -28
    //   7: invokevirtual 188	p8/e:b	(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
    //   10: astore_3
    //   11: aconst_null
    //   12: astore 4
    //   14: aconst_null
    //   15: astore 5
    //   17: aload 5
    //   19: astore_1
    //   20: new 276	l8/g
    //   23: astore 6
    //   25: aload 5
    //   27: astore_1
    //   28: aload 6
    //   30: aload_2
    //   31: invokespecial 277	l8/g:<init>	(Ljava/lang/String;)V
    //   34: aload 5
    //   36: astore_1
    //   37: aload 6
    //   39: invokevirtual 278	java/lang/Object:toString	()Ljava/lang/String;
    //   42: astore 6
    //   44: aload 5
    //   46: astore_1
    //   47: new 249	java/io/BufferedWriter
    //   50: astore_2
    //   51: aload 5
    //   53: astore_1
    //   54: new 251	java/io/OutputStreamWriter
    //   57: astore 7
    //   59: aload 5
    //   61: astore_1
    //   62: new 253	java/io/FileOutputStream
    //   65: astore 8
    //   67: aload 5
    //   69: astore_1
    //   70: aload 8
    //   72: aload_3
    //   73: invokespecial 254	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   76: aload 5
    //   78: astore_1
    //   79: aload 7
    //   81: aload 8
    //   83: getstatic 20	l8/h:b	Ljava/nio/charset/Charset;
    //   86: invokespecial 257	java/io/OutputStreamWriter:<init>	(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V
    //   89: aload 5
    //   91: astore_1
    //   92: aload_2
    //   93: aload 7
    //   95: invokespecial 260	java/io/BufferedWriter:<init>	(Ljava/io/Writer;)V
    //   98: aload_2
    //   99: aload 6
    //   101: invokevirtual 265	java/io/Writer:write	(Ljava/lang/String;)V
    //   104: aload_2
    //   105: invokevirtual 268	java/io/Writer:flush	()V
    //   108: aload_2
    //   109: ldc -50
    //   111: invokestatic 209	j8/g:b	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   114: goto +43 -> 157
    //   117: astore_1
    //   118: goto +45 -> 163
    //   121: astore_1
    //   122: aload_1
    //   123: astore 5
    //   125: goto +13 -> 138
    //   128: astore 5
    //   130: goto +28 -> 158
    //   133: astore 5
    //   135: aload 4
    //   137: astore_2
    //   138: aload_2
    //   139: astore_1
    //   140: ldc 106
    //   142: ldc_w 280
    //   145: aload 5
    //   147: invokestatic 116	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   150: pop
    //   151: aload_2
    //   152: ldc -50
    //   154: invokestatic 209	j8/g:b	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   157: return
    //   158: aload_1
    //   159: astore_2
    //   160: aload 5
    //   162: astore_1
    //   163: aload_2
    //   164: ldc -50
    //   166: invokestatic 209	j8/g:b	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   169: aload_1
    //   170: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	171	0	this	h
    //   0	171	1	paramString1	String
    //   0	171	2	paramString2	String
    //   10	63	3	localFile	File
    //   12	124	4	localObject1	Object
    //   15	109	5	str	String
    //   128	1	5	localObject2	Object
    //   133	28	5	localException	Exception
    //   23	77	6	localObject3	Object
    //   57	37	7	localOutputStreamWriter	java.io.OutputStreamWriter
    //   65	17	8	localFileOutputStream	java.io.FileOutputStream
    // Exception table:
    //   from	to	target	type
    //   98	108	117	finally
    //   98	108	121	java/lang/Exception
    //   20	25	128	finally
    //   28	34	128	finally
    //   37	44	128	finally
    //   47	51	128	finally
    //   54	59	128	finally
    //   62	67	128	finally
    //   70	76	128	finally
    //   79	89	128	finally
    //   92	98	128	finally
    //   140	151	128	finally
    //   20	25	133	java/lang/Exception
    //   28	34	133	java/lang/Exception
    //   37	44	133	java/lang/Exception
    //   47	51	133	java/lang/Exception
    //   54	59	133	java/lang/Exception
    //   62	67	133	java/lang/Exception
    //   70	76	133	java/lang/Exception
    //   79	89	133	java/lang/Exception
    //   92	98	133	java/lang/Exception
  }
}

/* Location:
 * Qualified Name:     l8.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */