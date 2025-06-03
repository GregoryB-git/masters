package I3;

import E3.f;
import M3.g;
import java.io.File;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public class d
{
  public static final Charset b = Charset.forName("UTF-8");
  public final g a;
  
  public d(g paramg)
  {
    a = paramg;
  }
  
  public static Map d(String paramString)
  {
    paramString = new JSONObject(paramString);
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramString.keys();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localHashMap.put(str, k(paramString, str));
    }
    return localHashMap;
  }
  
  public static String f(Map paramMap)
  {
    return new JSONObject(paramMap).toString();
  }
  
  public static void i(File paramFile)
  {
    if ((paramFile.exists()) && (paramFile.delete()))
    {
      f localf = f.f();
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Deleted corrupt file: ");
      localStringBuilder.append(paramFile.getAbsolutePath());
      localf.g(localStringBuilder.toString());
    }
  }
  
  public static String j(String paramString)
  {
    return new a().toString();
  }
  
  public static String k(JSONObject paramJSONObject, String paramString)
  {
    boolean bool = paramJSONObject.isNull(paramString);
    String str = null;
    if (!bool) {
      str = paramJSONObject.optString(paramString, null);
    }
    return str;
  }
  
  public File a(String paramString)
  {
    return a.o(paramString, "internal-keys");
  }
  
  public File b(String paramString)
  {
    return a.o(paramString, "keys");
  }
  
  public File c(String paramString)
  {
    return a.o(paramString, "user-data");
  }
  
  public final String e(String paramString)
  {
    return k(new JSONObject(paramString), "userId");
  }
  
  /* Error */
  public Map g(String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: iload_2
    //   1: ifeq +12 -> 13
    //   4: aload_0
    //   5: aload_1
    //   6: invokevirtual 138	I3/d:a	(Ljava/lang/String;)Ljava/io/File;
    //   9: astore_3
    //   10: goto +9 -> 19
    //   13: aload_0
    //   14: aload_1
    //   15: invokevirtual 140	I3/d:b	(Ljava/lang/String;)Ljava/io/File;
    //   18: astore_3
    //   19: aload_3
    //   20: invokevirtual 81	java/io/File:exists	()Z
    //   23: ifeq +118 -> 141
    //   26: aload_3
    //   27: invokevirtual 144	java/io/File:length	()J
    //   30: lconst_0
    //   31: lcmp
    //   32: ifne +6 -> 38
    //   35: goto +106 -> 141
    //   38: aconst_null
    //   39: astore 4
    //   41: new 146	java/io/FileInputStream
    //   44: astore 5
    //   46: aload 5
    //   48: aload_3
    //   49: invokespecial 148	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   52: aload 5
    //   54: astore_1
    //   55: aload 5
    //   57: invokestatic 154	H3/i:B	(Ljava/io/InputStream;)Ljava/lang/String;
    //   60: invokestatic 156	I3/d:d	(Ljava/lang/String;)Ljava/util/Map;
    //   63: astore 4
    //   65: aload 5
    //   67: ldc -98
    //   69: invokestatic 161	H3/i:f	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   72: aload 4
    //   74: areturn
    //   75: astore 5
    //   77: aload_1
    //   78: astore_3
    //   79: aload 5
    //   81: astore_1
    //   82: goto +51 -> 133
    //   85: astore 4
    //   87: goto +15 -> 102
    //   90: astore_1
    //   91: aload 4
    //   93: astore_3
    //   94: goto +39 -> 133
    //   97: astore 4
    //   99: aconst_null
    //   100: astore 5
    //   102: aload 5
    //   104: astore_1
    //   105: invokestatic 89	E3/f:f	()LE3/f;
    //   108: ldc -93
    //   110: aload 4
    //   112: invokevirtual 167	E3/f:l	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   115: aload 5
    //   117: astore_1
    //   118: aload_3
    //   119: invokestatic 169	I3/d:i	(Ljava/io/File;)V
    //   122: aload 5
    //   124: ldc -98
    //   126: invokestatic 161	H3/i:f	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   129: invokestatic 175	java/util/Collections:emptyMap	()Ljava/util/Map;
    //   132: areturn
    //   133: aload_3
    //   134: ldc -98
    //   136: invokestatic 161	H3/i:f	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   139: aload_1
    //   140: athrow
    //   141: aload_3
    //   142: invokestatic 169	I3/d:i	(Ljava/io/File;)V
    //   145: invokestatic 175	java/util/Collections:emptyMap	()Ljava/util/Map;
    //   148: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	149	0	this	d
    //   0	149	1	paramString	String
    //   0	149	2	paramBoolean	boolean
    //   9	133	3	localObject1	Object
    //   39	34	4	localMap	Map
    //   85	7	4	localException1	Exception
    //   97	14	4	localException2	Exception
    //   44	22	5	localFileInputStream	java.io.FileInputStream
    //   75	5	5	localObject2	Object
    //   100	23	5	localCloseable	java.io.Closeable
    // Exception table:
    //   from	to	target	type
    //   55	65	75	finally
    //   105	115	75	finally
    //   118	122	75	finally
    //   55	65	85	java/lang/Exception
    //   41	52	90	finally
    //   41	52	97	java/lang/Exception
  }
  
  /* Error */
  public String h(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual 178	I3/d:c	(Ljava/lang/String;)Ljava/io/File;
    //   5: astore_2
    //   6: aload_2
    //   7: invokevirtual 81	java/io/File:exists	()Z
    //   10: istore_3
    //   11: aconst_null
    //   12: astore 4
    //   14: iload_3
    //   15: ifeq +212 -> 227
    //   18: aload_2
    //   19: invokevirtual 144	java/io/File:length	()J
    //   22: lconst_0
    //   23: lcmp
    //   24: ifne +6 -> 30
    //   27: goto +200 -> 227
    //   30: new 146	java/io/FileInputStream
    //   33: astore 5
    //   35: aload 5
    //   37: aload_2
    //   38: invokespecial 148	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   41: aload 5
    //   43: astore 6
    //   45: aload_0
    //   46: aload 5
    //   48: invokestatic 154	H3/i:B	(Ljava/io/InputStream;)Ljava/lang/String;
    //   51: invokevirtual 180	I3/d:e	(Ljava/lang/String;)Ljava/lang/String;
    //   54: astore 4
    //   56: aload 5
    //   58: astore 6
    //   60: invokestatic 89	E3/f:f	()LE3/f;
    //   63: astore 7
    //   65: aload 5
    //   67: astore 6
    //   69: new 91	java/lang/StringBuilder
    //   72: astore 8
    //   74: aload 5
    //   76: astore 6
    //   78: aload 8
    //   80: invokespecial 92	java/lang/StringBuilder:<init>	()V
    //   83: aload 5
    //   85: astore 6
    //   87: aload 8
    //   89: ldc -74
    //   91: invokevirtual 98	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   94: pop
    //   95: aload 5
    //   97: astore 6
    //   99: aload 8
    //   101: aload 4
    //   103: invokevirtual 98	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   106: pop
    //   107: aload 5
    //   109: astore 6
    //   111: aload 8
    //   113: ldc -72
    //   115: invokevirtual 98	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   118: pop
    //   119: aload 5
    //   121: astore 6
    //   123: aload 8
    //   125: aload_1
    //   126: invokevirtual 98	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   129: pop
    //   130: aload 5
    //   132: astore 6
    //   134: aload 7
    //   136: aload 8
    //   138: invokevirtual 102	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   141: invokevirtual 186	E3/f:b	(Ljava/lang/String;)V
    //   144: aload 5
    //   146: ldc -98
    //   148: invokestatic 161	H3/i:f	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   151: aload 4
    //   153: areturn
    //   154: astore 5
    //   156: aload 6
    //   158: astore_1
    //   159: aload 5
    //   161: astore 6
    //   163: goto +55 -> 218
    //   166: astore 6
    //   168: aload 5
    //   170: astore_1
    //   171: aload 6
    //   173: astore 5
    //   175: goto +15 -> 190
    //   178: astore 6
    //   180: aload 4
    //   182: astore_1
    //   183: goto +35 -> 218
    //   186: astore 5
    //   188: aconst_null
    //   189: astore_1
    //   190: aload_1
    //   191: astore 6
    //   193: invokestatic 89	E3/f:f	()LE3/f;
    //   196: ldc -93
    //   198: aload 5
    //   200: invokevirtual 167	E3/f:l	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   203: aload_1
    //   204: astore 6
    //   206: aload_2
    //   207: invokestatic 169	I3/d:i	(Ljava/io/File;)V
    //   210: aload_1
    //   211: ldc -98
    //   213: invokestatic 161	H3/i:f	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   216: aconst_null
    //   217: areturn
    //   218: aload_1
    //   219: ldc -98
    //   221: invokestatic 161	H3/i:f	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   224: aload 6
    //   226: athrow
    //   227: invokestatic 89	E3/f:f	()LE3/f;
    //   230: astore 6
    //   232: new 91	java/lang/StringBuilder
    //   235: dup
    //   236: invokespecial 92	java/lang/StringBuilder:<init>	()V
    //   239: astore 5
    //   241: aload 5
    //   243: ldc -68
    //   245: invokevirtual 98	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   248: pop
    //   249: aload 5
    //   251: aload_1
    //   252: invokevirtual 98	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   255: pop
    //   256: aload 6
    //   258: aload 5
    //   260: invokevirtual 102	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   263: invokevirtual 186	E3/f:b	(Ljava/lang/String;)V
    //   266: aload_2
    //   267: invokestatic 169	I3/d:i	(Ljava/io/File;)V
    //   270: aconst_null
    //   271: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	272	0	this	d
    //   0	272	1	paramString	String
    //   5	262	2	localFile	File
    //   10	5	3	bool	boolean
    //   12	169	4	str	String
    //   33	112	5	localFileInputStream	java.io.FileInputStream
    //   154	15	5	localObject1	Object
    //   173	1	5	localObject2	Object
    //   186	13	5	localException1	Exception
    //   239	20	5	localStringBuilder1	StringBuilder
    //   43	119	6	localObject3	Object
    //   166	6	6	localException2	Exception
    //   178	1	6	localObject4	Object
    //   191	66	6	localObject5	Object
    //   63	72	7	localf	f
    //   72	65	8	localStringBuilder2	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   45	56	154	finally
    //   60	65	154	finally
    //   69	74	154	finally
    //   78	83	154	finally
    //   87	95	154	finally
    //   99	107	154	finally
    //   111	119	154	finally
    //   123	130	154	finally
    //   134	144	154	finally
    //   193	203	154	finally
    //   206	210	154	finally
    //   45	56	166	java/lang/Exception
    //   60	65	166	java/lang/Exception
    //   69	74	166	java/lang/Exception
    //   78	83	166	java/lang/Exception
    //   87	95	166	java/lang/Exception
    //   99	107	166	java/lang/Exception
    //   111	119	166	java/lang/Exception
    //   123	130	166	java/lang/Exception
    //   134	144	166	java/lang/Exception
    //   30	41	178	finally
    //   30	41	186	java/lang/Exception
  }
  
  public void l(String paramString, Map paramMap)
  {
    m(paramString, paramMap, false);
  }
  
  /* Error */
  public void m(String paramString, Map paramMap, boolean paramBoolean)
  {
    // Byte code:
    //   0: iload_3
    //   1: ifeq +13 -> 14
    //   4: aload_0
    //   5: aload_1
    //   6: invokevirtual 138	I3/d:a	(Ljava/lang/String;)Ljava/io/File;
    //   9: astore 4
    //   11: goto +10 -> 21
    //   14: aload_0
    //   15: aload_1
    //   16: invokevirtual 140	I3/d:b	(Ljava/lang/String;)Ljava/io/File;
    //   19: astore 4
    //   21: aconst_null
    //   22: astore 5
    //   24: aconst_null
    //   25: astore 6
    //   27: aload 6
    //   29: astore_1
    //   30: aload_2
    //   31: invokestatic 195	I3/d:f	(Ljava/util/Map;)Ljava/lang/String;
    //   34: astore 7
    //   36: aload 6
    //   38: astore_1
    //   39: new 197	java/io/BufferedWriter
    //   42: astore_2
    //   43: aload 6
    //   45: astore_1
    //   46: new 199	java/io/OutputStreamWriter
    //   49: astore 8
    //   51: aload 6
    //   53: astore_1
    //   54: new 201	java/io/FileOutputStream
    //   57: astore 9
    //   59: aload 6
    //   61: astore_1
    //   62: aload 9
    //   64: aload 4
    //   66: invokespecial 202	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   69: aload 6
    //   71: astore_1
    //   72: aload 8
    //   74: aload 9
    //   76: getstatic 22	I3/d:b	Ljava/nio/charset/Charset;
    //   79: invokespecial 205	java/io/OutputStreamWriter:<init>	(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V
    //   82: aload 6
    //   84: astore_1
    //   85: aload_2
    //   86: aload 8
    //   88: invokespecial 208	java/io/BufferedWriter:<init>	(Ljava/io/Writer;)V
    //   91: aload_2
    //   92: aload 7
    //   94: invokevirtual 213	java/io/Writer:write	(Ljava/lang/String;)V
    //   97: aload_2
    //   98: invokevirtual 216	java/io/Writer:flush	()V
    //   101: aload_2
    //   102: ldc -38
    //   104: invokestatic 161	H3/i:f	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   107: goto +52 -> 159
    //   110: astore 4
    //   112: aload_2
    //   113: astore_1
    //   114: aload 4
    //   116: astore_2
    //   117: goto +43 -> 160
    //   120: astore 6
    //   122: goto +12 -> 134
    //   125: astore_2
    //   126: goto +34 -> 160
    //   129: astore 6
    //   131: aload 5
    //   133: astore_2
    //   134: aload_2
    //   135: astore_1
    //   136: invokestatic 89	E3/f:f	()LE3/f;
    //   139: ldc -36
    //   141: aload 6
    //   143: invokevirtual 167	E3/f:l	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   146: aload_2
    //   147: astore_1
    //   148: aload 4
    //   150: invokestatic 169	I3/d:i	(Ljava/io/File;)V
    //   153: aload_2
    //   154: ldc -38
    //   156: invokestatic 161	H3/i:f	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   159: return
    //   160: aload_1
    //   161: ldc -38
    //   163: invokestatic 161	H3/i:f	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   166: aload_2
    //   167: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	168	0	this	d
    //   0	168	1	paramString	String
    //   0	168	2	paramMap	Map
    //   0	168	3	paramBoolean	boolean
    //   9	56	4	localFile1	File
    //   110	39	4	localFile2	File
    //   22	110	5	localObject1	Object
    //   25	58	6	localObject2	Object
    //   120	1	6	localException1	Exception
    //   129	13	6	localException2	Exception
    //   34	59	7	str	String
    //   49	38	8	localOutputStreamWriter	java.io.OutputStreamWriter
    //   57	18	9	localFileOutputStream	java.io.FileOutputStream
    // Exception table:
    //   from	to	target	type
    //   91	101	110	finally
    //   91	101	120	java/lang/Exception
    //   30	36	125	finally
    //   39	43	125	finally
    //   46	51	125	finally
    //   54	59	125	finally
    //   62	69	125	finally
    //   72	82	125	finally
    //   85	91	125	finally
    //   136	146	125	finally
    //   148	153	125	finally
    //   30	36	129	java/lang/Exception
    //   39	43	129	java/lang/Exception
    //   46	51	129	java/lang/Exception
    //   54	59	129	java/lang/Exception
    //   62	69	129	java/lang/Exception
    //   72	82	129	java/lang/Exception
    //   85	91	129	java/lang/Exception
  }
  
  /* Error */
  public void n(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual 178	I3/d:c	(Ljava/lang/String;)Ljava/io/File;
    //   5: astore_3
    //   6: aconst_null
    //   7: astore 4
    //   9: aconst_null
    //   10: astore 5
    //   12: aload 5
    //   14: astore_1
    //   15: aload_2
    //   16: invokestatic 224	I3/d:j	(Ljava/lang/String;)Ljava/lang/String;
    //   19: astore 6
    //   21: aload 5
    //   23: astore_1
    //   24: new 197	java/io/BufferedWriter
    //   27: astore_2
    //   28: aload 5
    //   30: astore_1
    //   31: new 199	java/io/OutputStreamWriter
    //   34: astore 7
    //   36: aload 5
    //   38: astore_1
    //   39: new 201	java/io/FileOutputStream
    //   42: astore 8
    //   44: aload 5
    //   46: astore_1
    //   47: aload 8
    //   49: aload_3
    //   50: invokespecial 202	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   53: aload 5
    //   55: astore_1
    //   56: aload 7
    //   58: aload 8
    //   60: getstatic 22	I3/d:b	Ljava/nio/charset/Charset;
    //   63: invokespecial 205	java/io/OutputStreamWriter:<init>	(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V
    //   66: aload 5
    //   68: astore_1
    //   69: aload_2
    //   70: aload 7
    //   72: invokespecial 208	java/io/BufferedWriter:<init>	(Ljava/io/Writer;)V
    //   75: aload_2
    //   76: aload 6
    //   78: invokevirtual 213	java/io/Writer:write	(Ljava/lang/String;)V
    //   81: aload_2
    //   82: invokevirtual 216	java/io/Writer:flush	()V
    //   85: aload_2
    //   86: ldc -98
    //   88: invokestatic 161	H3/i:f	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   91: goto +45 -> 136
    //   94: astore 5
    //   96: aload_2
    //   97: astore_1
    //   98: aload 5
    //   100: astore_2
    //   101: goto +36 -> 137
    //   104: astore 5
    //   106: goto +12 -> 118
    //   109: astore_2
    //   110: goto +27 -> 137
    //   113: astore 5
    //   115: aload 4
    //   117: astore_2
    //   118: aload_2
    //   119: astore_1
    //   120: invokestatic 89	E3/f:f	()LE3/f;
    //   123: ldc -30
    //   125: aload 5
    //   127: invokevirtual 167	E3/f:l	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   130: aload_2
    //   131: ldc -98
    //   133: invokestatic 161	H3/i:f	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   136: return
    //   137: aload_1
    //   138: ldc -98
    //   140: invokestatic 161	H3/i:f	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   143: aload_2
    //   144: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	145	0	this	d
    //   0	145	1	paramString1	String
    //   0	145	2	paramString2	String
    //   5	45	3	localFile	File
    //   7	109	4	localObject1	Object
    //   10	57	5	localObject2	Object
    //   94	5	5	localObject3	Object
    //   104	1	5	localException1	Exception
    //   113	13	5	localException2	Exception
    //   19	58	6	str	String
    //   34	37	7	localOutputStreamWriter	java.io.OutputStreamWriter
    //   42	17	8	localFileOutputStream	java.io.FileOutputStream
    // Exception table:
    //   from	to	target	type
    //   75	85	94	finally
    //   75	85	104	java/lang/Exception
    //   15	21	109	finally
    //   24	28	109	finally
    //   31	36	109	finally
    //   39	44	109	finally
    //   47	53	109	finally
    //   56	66	109	finally
    //   69	75	109	finally
    //   120	130	109	finally
    //   15	21	113	java/lang/Exception
    //   24	28	113	java/lang/Exception
    //   31	36	113	java/lang/Exception
    //   39	44	113	java/lang/Exception
    //   47	53	113	java/lang/Exception
    //   56	66	113	java/lang/Exception
    //   69	75	113	java/lang/Exception
  }
  
  public class a
    extends JSONObject
  {
    public a()
    {
      put("userId", d.this);
    }
  }
}

/* Location:
 * Qualified Name:     I3.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */