package K1;

import android.util.Patterns;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
{
  public static final a a = new a();
  public static Map b;
  public static Map c;
  public static Map d;
  public static JSONObject e;
  public static boolean f;
  
  public static final float[] a(JSONObject paramJSONObject, String paramString)
  {
    if (T1.a.d(a.class)) {
      return null;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramJSONObject, "viewHierarchy");
      Intrinsics.checkNotNullParameter(paramString, "appName");
      if (!f) {
        return null;
      }
      float[] arrayOfFloat = new float[30];
      for (int i = 0; i < 30; i++) {
        arrayOfFloat[i] = 0.0F;
      }
      try
      {
        paramString = paramString.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(paramString, "(this as java.lang.String).toLowerCase()");
        Object localObject = new org/json/JSONObject;
        ((JSONObject)localObject).<init>(paramJSONObject.optJSONObject("view").toString());
        String str = paramJSONObject.optString("screenname");
        JSONArray localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>();
        a locala = a;
        locala.j((JSONObject)localObject, localJSONArray);
        locala.m(arrayOfFloat, locala.i((JSONObject)localObject));
        paramJSONObject = locala.b((JSONObject)localObject);
        if (paramJSONObject == null) {
          return null;
        }
        Intrinsics.checkNotNullExpressionValue(str, "screenName");
        localObject = ((JSONObject)localObject).toString();
        Intrinsics.checkNotNullExpressionValue(localObject, "viewTree.toString()");
        locala.m(arrayOfFloat, locala.h(paramJSONObject, localJSONArray, str, (String)localObject, paramString));
      }
      catch (JSONException paramJSONObject) {}
    }
    finally
    {
      break label189;
    }
    return arrayOfFloat;
    label189:
    T1.a.b(paramJSONObject, a.class);
    return null;
  }
  
  public static final String c(String paramString1, String paramString2, String paramString3)
  {
    if (T1.a.d(a.class)) {
      return null;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramString1, "buttonText");
      Intrinsics.checkNotNullParameter(paramString2, "activityName");
      Intrinsics.checkNotNullParameter(paramString3, "appName");
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append(paramString3);
      localStringBuilder.append(" | ");
      localStringBuilder.append(paramString2);
      localStringBuilder.append(", ");
      localStringBuilder.append(paramString1);
      paramString1 = localStringBuilder.toString();
      if (paramString1 != null)
      {
        paramString1 = paramString1.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(paramString1, "(this as java.lang.String).toLowerCase()");
        return paramString1;
      }
    }
    finally
    {
      break label106;
      paramString1 = new java/lang/NullPointerException;
      paramString1.<init>("null cannot be cast to non-null type java.lang.String");
      throw paramString1;
      label106:
      T1.a.b(paramString1, a.class);
    }
    return null;
  }
  
  /* Error */
  public static final void d(java.io.File paramFile)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 31	T1/a:d	(Ljava/lang/Object;)Z
    //   5: ifeq +4 -> 9
    //   8: return
    //   9: new 56	org/json/JSONObject
    //   12: astore_1
    //   13: aload_1
    //   14: invokespecial 129	org/json/JSONObject:<init>	()V
    //   17: aload_1
    //   18: putstatic 131	K1/a:e	Lorg/json/JSONObject;
    //   21: new 133	java/io/FileInputStream
    //   24: astore_1
    //   25: aload_1
    //   26: aload_0
    //   27: invokespecial 135	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   30: aload_1
    //   31: invokevirtual 141	java/io/InputStream:available	()I
    //   34: newarray <illegal type>
    //   36: astore_0
    //   37: aload_1
    //   38: aload_0
    //   39: invokevirtual 145	java/io/InputStream:read	([B)I
    //   42: pop
    //   43: aload_1
    //   44: invokevirtual 148	java/io/InputStream:close	()V
    //   47: new 56	org/json/JSONObject
    //   50: astore_2
    //   51: getstatic 153	kotlin/text/b:b	Ljava/nio/charset/Charset;
    //   54: astore_1
    //   55: new 45	java/lang/String
    //   58: astore_3
    //   59: aload_3
    //   60: aload_0
    //   61: aload_1
    //   62: invokespecial 156	java/lang/String:<init>	([BLjava/nio/charset/Charset;)V
    //   65: aload_2
    //   66: aload_3
    //   67: invokespecial 68	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   70: aload_2
    //   71: putstatic 131	K1/a:e	Lorg/json/JSONObject;
    //   74: iconst_4
    //   75: anewarray 158	V5/m
    //   78: dup
    //   79: iconst_0
    //   80: ldc -96
    //   82: ldc -94
    //   84: invokestatic 167	V5/q:a	(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;
    //   87: aastore
    //   88: dup
    //   89: iconst_1
    //   90: ldc -87
    //   92: ldc -85
    //   94: invokestatic 167	V5/q:a	(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;
    //   97: aastore
    //   98: dup
    //   99: iconst_2
    //   100: ldc -83
    //   102: ldc -81
    //   104: invokestatic 167	V5/q:a	(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;
    //   107: aastore
    //   108: dup
    //   109: iconst_3
    //   110: ldc -79
    //   112: ldc -77
    //   114: invokestatic 167	V5/q:a	(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;
    //   117: aastore
    //   118: invokestatic 184	W5/C:f	([LV5/m;)Ljava/util/Map;
    //   121: putstatic 186	K1/a:b	Ljava/util/Map;
    //   124: bipush 9
    //   126: anewarray 158	V5/m
    //   129: dup
    //   130: iconst_0
    //   131: ldc -68
    //   133: ldc -66
    //   135: invokestatic 167	V5/q:a	(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;
    //   138: aastore
    //   139: dup
    //   140: iconst_1
    //   141: ldc -64
    //   143: ldc -94
    //   145: invokestatic 167	V5/q:a	(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;
    //   148: aastore
    //   149: dup
    //   150: iconst_2
    //   151: ldc -62
    //   153: ldc -85
    //   155: invokestatic 167	V5/q:a	(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;
    //   158: aastore
    //   159: dup
    //   160: iconst_3
    //   161: ldc -60
    //   163: ldc -81
    //   165: invokestatic 167	V5/q:a	(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;
    //   168: aastore
    //   169: dup
    //   170: iconst_4
    //   171: ldc -58
    //   173: ldc -77
    //   175: invokestatic 167	V5/q:a	(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;
    //   178: aastore
    //   179: dup
    //   180: iconst_5
    //   181: ldc -56
    //   183: ldc -54
    //   185: invokestatic 167	V5/q:a	(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;
    //   188: aastore
    //   189: dup
    //   190: bipush 6
    //   192: ldc -52
    //   194: ldc -50
    //   196: invokestatic 167	V5/q:a	(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;
    //   199: aastore
    //   200: dup
    //   201: bipush 7
    //   203: ldc -48
    //   205: ldc -46
    //   207: invokestatic 167	V5/q:a	(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;
    //   210: aastore
    //   211: dup
    //   212: bipush 8
    //   214: ldc -44
    //   216: ldc -42
    //   218: invokestatic 167	V5/q:a	(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;
    //   221: aastore
    //   222: invokestatic 184	W5/C:f	([LV5/m;)Ljava/util/Map;
    //   225: putstatic 216	K1/a:c	Ljava/util/Map;
    //   228: iconst_4
    //   229: anewarray 158	V5/m
    //   232: dup
    //   233: iconst_0
    //   234: ldc -38
    //   236: ldc -94
    //   238: invokestatic 167	V5/q:a	(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;
    //   241: aastore
    //   242: dup
    //   243: iconst_1
    //   244: ldc -36
    //   246: ldc -85
    //   248: invokestatic 167	V5/q:a	(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;
    //   251: aastore
    //   252: dup
    //   253: iconst_2
    //   254: ldc -34
    //   256: ldc -81
    //   258: invokestatic 167	V5/q:a	(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;
    //   261: aastore
    //   262: dup
    //   263: iconst_3
    //   264: ldc -32
    //   266: ldc -77
    //   268: invokestatic 167	V5/q:a	(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;
    //   271: aastore
    //   272: invokestatic 184	W5/C:f	([LV5/m;)Ljava/util/Map;
    //   275: putstatic 226	K1/a:d	Ljava/util/Map;
    //   278: iconst_1
    //   279: putstatic 43	K1/a:f	Z
    //   282: return
    //   283: astore_0
    //   284: aload_0
    //   285: ldc 2
    //   287: invokestatic 103	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   290: return
    //   291: astore_0
    //   292: goto -2 -> 290
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	295	0	paramFile	java.io.File
    //   12	50	1	localObject	Object
    //   50	21	2	localJSONObject	JSONObject
    //   58	9	3	str	String
    // Exception table:
    //   from	to	target	type
    //   9	74	283	finally
    //   74	282	283	finally
    //   9	74	291	java/lang/Exception
  }
  
  public static final boolean f()
  {
    if (T1.a.d(a.class)) {
      return false;
    }
    try
    {
      boolean bool = f;
      return bool;
    }
    finally
    {
      T1.a.b(localThrowable, a.class);
    }
    return false;
  }
  
  /* Error */
  public final JSONObject b(JSONObject paramJSONObject)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 31	T1/a:d	(Ljava/lang/Object;)Z
    //   4: ifeq +5 -> 9
    //   7: aconst_null
    //   8: areturn
    //   9: aload_1
    //   10: ldc -27
    //   12: invokevirtual 233	org/json/JSONObject:optBoolean	(Ljava/lang/String;)Z
    //   15: ifeq +5 -> 20
    //   18: aload_1
    //   19: areturn
    //   20: aload_1
    //   21: ldc -21
    //   23: invokevirtual 239	org/json/JSONObject:optJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   26: astore_1
    //   27: aload_1
    //   28: ifnonnull +5 -> 33
    //   31: aconst_null
    //   32: areturn
    //   33: aload_1
    //   34: invokevirtual 242	org/json/JSONArray:length	()I
    //   37: istore_2
    //   38: iload_2
    //   39: ifle +61 -> 100
    //   42: iconst_0
    //   43: istore_3
    //   44: iload_3
    //   45: iconst_1
    //   46: iadd
    //   47: istore 4
    //   49: aload_1
    //   50: iload_3
    //   51: invokevirtual 246	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   54: astore 5
    //   56: aload 5
    //   58: ldc -8
    //   60: invokestatic 54	kotlin/jvm/internal/Intrinsics:checkNotNullExpressionValue	(Ljava/lang/Object;Ljava/lang/String;)V
    //   63: aload_0
    //   64: aload 5
    //   66: invokevirtual 92	K1/a:b	(Lorg/json/JSONObject;)Lorg/json/JSONObject;
    //   69: astore 5
    //   71: aload 5
    //   73: ifnull +6 -> 79
    //   76: aload 5
    //   78: areturn
    //   79: iload 4
    //   81: iload_2
    //   82: if_icmplt +6 -> 88
    //   85: goto +15 -> 100
    //   88: iload 4
    //   90: istore_3
    //   91: goto -47 -> 44
    //   94: astore_1
    //   95: aload_1
    //   96: aload_0
    //   97: invokestatic 103	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   100: aconst_null
    //   101: areturn
    //   102: astore_1
    //   103: goto -3 -> 100
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	106	0	this	a
    //   0	106	1	paramJSONObject	JSONObject
    //   37	46	2	i	int
    //   43	48	3	j	int
    //   47	42	4	k	int
    //   54	23	5	localJSONObject	JSONObject
    // Exception table:
    //   from	to	target	type
    //   9	18	94	finally
    //   20	27	94	finally
    //   33	38	94	finally
    //   49	71	94	finally
    //   9	18	102	org/json/JSONException
    //   20	27	102	org/json/JSONException
    //   33	38	102	org/json/JSONException
    //   49	71	102	org/json/JSONException
  }
  
  public final boolean e(JSONObject paramJSONObject)
  {
    boolean bool1 = T1.a.d(this);
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    try
    {
      int i = paramJSONObject.optInt("classtypebitmask");
      if ((i & 0x1) << 5 > 0) {
        bool2 = true;
      }
      return bool2;
    }
    finally
    {
      T1.a.b(paramJSONObject, this);
    }
    return false;
  }
  
  public final boolean g(String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    if (T1.a.d(this)) {
      return false;
    }
    try
    {
      int i = paramArrayOfString1.length;
      int j = 0;
      if (j < i)
      {
        String str1 = paramArrayOfString1[j];
        int k = j + 1;
        int m = paramArrayOfString2.length;
        int n = 0;
        boolean bool;
        do
        {
          j = k;
          if (n >= m) {
            break;
          }
          String str2 = paramArrayOfString2[n];
          n++;
          bool = i.v(str2, str1, false, 2, null);
        } while (!bool);
        return true;
      }
    }
    finally
    {
      break label85;
      return false;
      label85:
      T1.a.b(paramArrayOfString1, this);
    }
    return false;
  }
  
  public final float[] h(JSONObject paramJSONObject, JSONArray paramJSONArray, String paramString1, String paramString2, String paramString3)
  {
    if (T1.a.d(this)) {
      return null;
    }
    float[] arrayOfFloat;
    int i;
    try
    {
      arrayOfFloat = new float[30];
      for (i = 0; i < 30; i++) {
        arrayOfFloat[i] = 0.0F;
      }
      i = paramJSONArray.length();
    }
    finally
    {
      break label627;
    }
    float f1;
    if (i > 1) {
      f1 = i - 1.0F;
    } else {
      f1 = 0.0F;
    }
    arrayOfFloat[3] = f1;
    try
    {
      int j = paramJSONArray.length();
      if (j > 0)
      {
        int k;
        for (i = 0;; i = k)
        {
          k = i + 1;
          JSONObject localJSONObject = paramJSONArray.getJSONObject(i);
          Intrinsics.checkNotNullExpressionValue(localJSONObject, "siblings.getJSONObject(i)");
          if (e(localJSONObject)) {
            arrayOfFloat[9] += 1.0F;
          }
          if (k >= j) {
            break;
          }
        }
      }
    }
    catch (JSONException paramJSONArray)
    {
      for (;;) {}
    }
    arrayOfFloat[13] = -1.0F;
    arrayOfFloat[14] = -1.0F;
    paramJSONArray = new java/lang/StringBuilder;
    paramJSONArray.<init>();
    paramJSONArray.append(paramString1);
    paramJSONArray.append('|');
    paramJSONArray.append(paramString3);
    paramJSONArray = paramJSONArray.toString();
    paramString3 = new java/lang/StringBuilder;
    paramString3.<init>();
    paramString1 = new java/lang/StringBuilder;
    paramString1.<init>();
    n(paramJSONObject, paramString1, paramString3);
    paramJSONObject = paramString3.toString();
    Intrinsics.checkNotNullExpressionValue(paramJSONObject, "hintSB.toString()");
    paramString1 = paramString1.toString();
    Intrinsics.checkNotNullExpressionValue(paramString1, "textSB.toString()");
    if (l("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_TEXT", paramString1)) {
      f1 = 1.0F;
    } else {
      f1 = 0.0F;
    }
    arrayOfFloat[15] = f1;
    if (l("ENGLISH", "COMPLETE_REGISTRATION", "PAGE_TITLE", paramJSONArray)) {
      f1 = 1.0F;
    } else {
      f1 = 0.0F;
    }
    arrayOfFloat[16] = f1;
    if (l("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_ID", paramJSONObject)) {
      f1 = 1.0F;
    } else {
      f1 = 0.0F;
    }
    arrayOfFloat[17] = f1;
    if (i.v(paramString2, "password", false, 2, null)) {
      f1 = 1.0F;
    } else {
      f1 = 0.0F;
    }
    arrayOfFloat[18] = f1;
    if (k("(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)", paramString2)) {
      f1 = 1.0F;
    } else {
      f1 = 0.0F;
    }
    arrayOfFloat[19] = f1;
    if (k("(?i)(sign in)|login|signIn", paramString2)) {
      f1 = 1.0F;
    } else {
      f1 = 0.0F;
    }
    arrayOfFloat[20] = f1;
    if (k("(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)", paramString2)) {
      f1 = 1.0F;
    } else {
      f1 = 0.0F;
    }
    arrayOfFloat[21] = f1;
    if (l("ENGLISH", "PURCHASE", "BUTTON_TEXT", paramString1)) {
      f1 = 1.0F;
    } else {
      f1 = 0.0F;
    }
    arrayOfFloat[22] = f1;
    if (l("ENGLISH", "PURCHASE", "PAGE_TITLE", paramJSONArray)) {
      f1 = 1.0F;
    } else {
      f1 = 0.0F;
    }
    arrayOfFloat[24] = f1;
    if (k("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart", paramString1)) {
      f1 = 1.0F;
    } else {
      f1 = 0.0F;
    }
    arrayOfFloat[25] = f1;
    if (k("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy", paramJSONArray)) {
      f1 = 1.0F;
    } else {
      f1 = 0.0F;
    }
    arrayOfFloat[27] = f1;
    if (l("ENGLISH", "LEAD", "BUTTON_TEXT", paramString1)) {
      f1 = 1.0F;
    } else {
      f1 = 0.0F;
    }
    arrayOfFloat[28] = f1;
    if (l("ENGLISH", "LEAD", "PAGE_TITLE", paramJSONArray)) {
      f1 = 1.0F;
    } else {
      f1 = 0.0F;
    }
    arrayOfFloat[29] = f1;
    return arrayOfFloat;
    label627:
    T1.a.b(paramJSONObject, this);
    return null;
  }
  
  public final float[] i(JSONObject paramJSONObject)
  {
    if (T1.a.d(this)) {
      return null;
    }
    float[] arrayOfFloat;
    int i;
    try
    {
      arrayOfFloat = new float[30];
      i = 0;
      for (j = 0; j < 30; j++) {
        arrayOfFloat[j] = 0.0F;
      }
      localObject = paramJSONObject.optString("text");
    }
    finally
    {
      break label552;
    }
    Intrinsics.checkNotNullExpressionValue(localObject, "node.optString(TEXT_KEY)");
    Object localObject = ((String)localObject).toLowerCase();
    Intrinsics.checkNotNullExpressionValue(localObject, "(this as java.lang.String).toLowerCase()");
    String str1 = paramJSONObject.optString("hint");
    Intrinsics.checkNotNullExpressionValue(str1, "node.optString(HINT_KEY)");
    str1 = str1.toLowerCase();
    Intrinsics.checkNotNullExpressionValue(str1, "(this as java.lang.String).toLowerCase()");
    String str2 = paramJSONObject.optString("classname");
    Intrinsics.checkNotNullExpressionValue(str2, "node.optString(CLASS_NAME_KEY)");
    str2 = str2.toLowerCase();
    Intrinsics.checkNotNullExpressionValue(str2, "(this as java.lang.String).toLowerCase()");
    int j = paramJSONObject.optInt("inputtype", -1);
    String[] arrayOfString = new String[2];
    arrayOfString[0] = localObject;
    arrayOfString[1] = str1;
    if (g(new String[] { "$", "amount", "price", "total" }, arrayOfString)) {
      arrayOfFloat[0] += 1.0F;
    }
    if (g(new String[] { "password", "pwd" }, arrayOfString)) {
      arrayOfFloat[1] += 1.0F;
    }
    if (g(new String[] { "tel", "phone" }, arrayOfString)) {
      arrayOfFloat[2] += 1.0F;
    }
    if (g(new String[] { "search" }, arrayOfString)) {
      arrayOfFloat[4] += 1.0F;
    }
    if (j >= 0) {
      arrayOfFloat[5] += 1.0F;
    }
    if ((j == 3) || (j == 2)) {
      arrayOfFloat[6] += 1.0F;
    }
    if ((j == 32) || (Patterns.EMAIL_ADDRESS.matcher((CharSequence)localObject).matches())) {
      arrayOfFloat[7] += 1.0F;
    }
    if (i.v(str2, "checkbox", false, 2, null)) {
      arrayOfFloat[8] += 1.0F;
    }
    if (g(new String[] { "complete", "confirm", "done", "submit" }, new String[] { localObject })) {
      arrayOfFloat[10] += 1.0F;
    }
    if ((i.v(str2, "radio", false, 2, null)) && (i.v(str2, "button", false, 2, null))) {
      arrayOfFloat[12] += 1.0F;
    }
    try
    {
      paramJSONObject = paramJSONObject.optJSONArray("childviews");
      int k = paramJSONObject.length();
      if (k > 0) {
        for (j = i;; j = i)
        {
          i = j + 1;
          localObject = paramJSONObject.getJSONObject(j);
          Intrinsics.checkNotNullExpressionValue(localObject, "childViews.getJSONObject(i)");
          m(arrayOfFloat, i((JSONObject)localObject));
          if (i >= k) {
            break;
          }
        }
      }
    }
    catch (JSONException paramJSONObject)
    {
      for (;;) {}
    }
    return arrayOfFloat;
    label552:
    T1.a.b(paramJSONObject, this);
    return null;
  }
  
  /* Error */
  public final boolean j(JSONObject paramJSONObject, JSONArray paramJSONArray)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 31	T1/a:d	(Ljava/lang/Object;)Z
    //   4: ifeq +5 -> 9
    //   7: iconst_0
    //   8: ireturn
    //   9: aload_1
    //   10: ldc -27
    //   12: invokevirtual 233	org/json/JSONObject:optBoolean	(Ljava/lang/String;)Z
    //   15: ifeq +5 -> 20
    //   18: iconst_1
    //   19: ireturn
    //   20: aload_1
    //   21: ldc -21
    //   23: invokevirtual 239	org/json/JSONObject:optJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   26: astore_3
    //   27: aload_3
    //   28: invokevirtual 242	org/json/JSONArray:length	()I
    //   31: istore 4
    //   33: iload 4
    //   35: ifle +57 -> 92
    //   38: iconst_0
    //   39: istore 5
    //   41: iload 5
    //   43: iconst_1
    //   44: iadd
    //   45: istore 6
    //   47: aload_3
    //   48: iload 5
    //   50: invokevirtual 246	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   53: ldc -27
    //   55: invokevirtual 233	org/json/JSONObject:optBoolean	(Ljava/lang/String;)Z
    //   58: ifeq +13 -> 71
    //   61: iconst_1
    //   62: istore 7
    //   64: iload 7
    //   66: istore 8
    //   68: goto +30 -> 98
    //   71: iload 6
    //   73: iload 4
    //   75: if_icmplt +6 -> 81
    //   78: goto +14 -> 92
    //   81: iload 6
    //   83: istore 5
    //   85: goto -44 -> 41
    //   88: astore_1
    //   89: goto +178 -> 267
    //   92: iconst_0
    //   93: istore 7
    //   95: goto -31 -> 64
    //   98: new 76	org/json/JSONArray
    //   101: astore 9
    //   103: aload 9
    //   105: invokespecial 77	org/json/JSONArray:<init>	()V
    //   108: iload 7
    //   110: ifeq +59 -> 169
    //   113: aload_3
    //   114: invokevirtual 242	org/json/JSONArray:length	()I
    //   117: istore 4
    //   119: iload 8
    //   121: istore 7
    //   123: iload 4
    //   125: ifle +139 -> 264
    //   128: iconst_0
    //   129: istore 5
    //   131: iload 5
    //   133: iconst_1
    //   134: iadd
    //   135: istore 6
    //   137: aload_2
    //   138: aload_3
    //   139: iload 5
    //   141: invokevirtual 246	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   144: invokevirtual 371	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   147: pop
    //   148: iload 6
    //   150: iload 4
    //   152: if_icmplt +10 -> 162
    //   155: iload 8
    //   157: istore 7
    //   159: goto +105 -> 264
    //   162: iload 6
    //   164: istore 5
    //   166: goto -35 -> 131
    //   169: aload_3
    //   170: invokevirtual 242	org/json/JSONArray:length	()I
    //   173: istore 4
    //   175: iload 8
    //   177: istore 7
    //   179: iload 4
    //   181: ifle +74 -> 255
    //   184: iconst_0
    //   185: istore 5
    //   187: iload 5
    //   189: iconst_1
    //   190: iadd
    //   191: istore 6
    //   193: aload_3
    //   194: iload 5
    //   196: invokevirtual 246	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   199: astore 10
    //   201: aload 10
    //   203: ldc_w 373
    //   206: invokestatic 54	kotlin/jvm/internal/Intrinsics:checkNotNullExpressionValue	(Ljava/lang/Object;Ljava/lang/String;)V
    //   209: iload 8
    //   211: istore 7
    //   213: aload_0
    //   214: aload 10
    //   216: aload_2
    //   217: invokevirtual 81	K1/a:j	(Lorg/json/JSONObject;Lorg/json/JSONArray;)Z
    //   220: ifeq +14 -> 234
    //   223: aload 9
    //   225: aload 10
    //   227: invokevirtual 371	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   230: pop
    //   231: iconst_1
    //   232: istore 7
    //   234: iload 6
    //   236: iload 4
    //   238: if_icmplt +6 -> 244
    //   241: goto +14 -> 255
    //   244: iload 6
    //   246: istore 5
    //   248: iload 7
    //   250: istore 8
    //   252: goto -65 -> 187
    //   255: aload_1
    //   256: ldc -21
    //   258: aload 9
    //   260: invokevirtual 376	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   263: pop
    //   264: iload 7
    //   266: ireturn
    //   267: aload_1
    //   268: aload_0
    //   269: invokestatic 103	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   272: iconst_0
    //   273: ireturn
    //   274: astore_1
    //   275: goto -3 -> 272
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	278	0	this	a
    //   0	278	1	paramJSONObject	JSONObject
    //   0	278	2	paramJSONArray	JSONArray
    //   26	168	3	localJSONArray1	JSONArray
    //   31	208	4	i	int
    //   39	208	5	j	int
    //   45	200	6	k	int
    //   62	203	7	bool1	boolean
    //   66	185	8	bool2	boolean
    //   101	158	9	localJSONArray2	JSONArray
    //   199	27	10	localJSONObject	JSONObject
    // Exception table:
    //   from	to	target	type
    //   9	18	88	finally
    //   20	33	88	finally
    //   47	61	88	finally
    //   98	108	88	finally
    //   113	119	88	finally
    //   137	148	88	finally
    //   169	175	88	finally
    //   193	209	88	finally
    //   213	231	88	finally
    //   255	264	88	finally
    //   9	18	274	org/json/JSONException
    //   20	33	274	org/json/JSONException
    //   47	61	274	org/json/JSONException
    //   98	108	274	org/json/JSONException
    //   113	119	274	org/json/JSONException
    //   137	148	274	org/json/JSONException
    //   169	175	274	org/json/JSONException
    //   193	209	274	org/json/JSONException
    //   213	231	274	org/json/JSONException
    //   255	264	274	org/json/JSONException
  }
  
  public final boolean k(String paramString1, String paramString2)
  {
    if (T1.a.d(this)) {
      return false;
    }
    try
    {
      boolean bool = Pattern.compile(paramString1).matcher(paramString2).find();
      return bool;
    }
    finally
    {
      T1.a.b(paramString1, this);
    }
    return false;
  }
  
  public final boolean l(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    boolean bool1 = T1.a.d(this);
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    try
    {
      Object localObject1 = e;
      Object localObject2 = null;
      if (localObject1 != null)
      {
        JSONObject localJSONObject = ((JSONObject)localObject1).optJSONObject("rulesForLanguage");
        if (localJSONObject == null)
        {
          paramString1 = null;
        }
        else
        {
          localObject1 = b;
          if (localObject1 == null) {
            break label216;
          }
          paramString1 = localJSONObject.optJSONObject((String)((Map)localObject1).get(paramString1));
        }
        if (paramString1 == null) {}
        do
        {
          paramString1 = null;
          break;
          paramString1 = paramString1.optJSONObject("rulesForEvent");
        } while (paramString1 == null);
        localObject1 = c;
        if (localObject1 != null)
        {
          paramString1 = paramString1.optJSONObject((String)((Map)localObject1).get(paramString2));
          if (paramString1 == null)
          {
            paramString1 = (String)localObject2;
          }
          else
          {
            paramString1 = paramString1.optJSONObject("positiveRules");
            if (paramString1 == null)
            {
              paramString1 = (String)localObject2;
            }
            else
            {
              paramString2 = d;
              if (paramString2 == null) {
                break label200;
              }
              paramString1 = paramString1.optString((String)paramString2.get(paramString3));
            }
          }
          if (paramString1 != null) {
            bool2 = k(paramString1, paramString4);
          }
          return bool2;
        }
      }
    }
    finally
    {
      break label232;
      label200:
      Intrinsics.n("textTypeInfo");
      throw null;
      Intrinsics.n("eventInfo");
      throw null;
      label216:
      Intrinsics.n("languageInfo");
      throw null;
      Intrinsics.n("rules");
      throw null;
      label232:
      T1.a.b(paramString1, this);
    }
    return false;
  }
  
  /* Error */
  public final void m(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 31	T1/a:d	(Ljava/lang/Object;)Z
    //   4: ifeq +4 -> 8
    //   7: return
    //   8: aload_1
    //   9: arraylength
    //   10: iconst_1
    //   11: isub
    //   12: istore_3
    //   13: iload_3
    //   14: iflt +45 -> 59
    //   17: iconst_0
    //   18: istore 4
    //   20: iload 4
    //   22: iconst_1
    //   23: iadd
    //   24: istore 5
    //   26: aload_1
    //   27: iload 4
    //   29: aload_1
    //   30: iload 4
    //   32: faload
    //   33: aload_2
    //   34: iload 4
    //   36: faload
    //   37: fadd
    //   38: fastore
    //   39: iload 5
    //   41: iload_3
    //   42: if_icmple +6 -> 48
    //   45: goto +14 -> 59
    //   48: iload 5
    //   50: istore 4
    //   52: goto -32 -> 20
    //   55: astore_1
    //   56: goto +4 -> 60
    //   59: return
    //   60: aload_1
    //   61: aload_0
    //   62: invokestatic 103	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   65: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	66	0	this	a
    //   0	66	1	paramArrayOfFloat1	float[]
    //   0	66	2	paramArrayOfFloat2	float[]
    //   12	31	3	i	int
    //   18	33	4	j	int
    //   24	25	5	k	int
    // Exception table:
    //   from	to	target	type
    //   8	13	55	finally
  }
  
  public final void n(JSONObject paramJSONObject, StringBuilder paramStringBuilder1, StringBuilder paramStringBuilder2)
  {
    if (T1.a.d(this)) {
      return;
    }
    Object localObject;
    String str;
    int i;
    try
    {
      localObject = paramJSONObject.optString("text", "");
      Intrinsics.checkNotNullExpressionValue(localObject, "view.optString(TEXT_KEY, \"\")");
      localObject = ((String)localObject).toLowerCase();
      Intrinsics.checkNotNullExpressionValue(localObject, "(this as java.lang.String).toLowerCase()");
      str = paramJSONObject.optString("hint", "");
      Intrinsics.checkNotNullExpressionValue(str, "view.optString(HINT_KEY, \"\")");
      str = str.toLowerCase();
      Intrinsics.checkNotNullExpressionValue(str, "(this as java.lang.String).toLowerCase()");
      i = ((CharSequence)localObject).length();
      if (i > 0)
      {
        paramStringBuilder1.append((String)localObject);
        paramStringBuilder1.append(" ");
      }
    }
    finally
    {
      break label211;
    }
    if (str.length() > 0)
    {
      paramStringBuilder2.append(str);
      paramStringBuilder2.append(" ");
    }
    paramJSONObject = paramJSONObject.optJSONArray("childviews");
    if (paramJSONObject == null) {
      return;
    }
    int j = paramJSONObject.length();
    if (j > 0) {
      i = 0;
    }
    for (;;)
    {
      int k = i + 1;
      try
      {
        localObject = paramJSONObject.getJSONObject(i);
        Intrinsics.checkNotNullExpressionValue(localObject, "currentChildView");
        n((JSONObject)localObject, paramStringBuilder1, paramStringBuilder2);
        if (k < j)
        {
          i = k;
          continue;
        }
        return;
        label211:
        T1.a.b(paramJSONObject, this);
        return;
      }
      catch (JSONException localJSONException)
      {
        for (;;) {}
      }
    }
  }
}

/* Location:
 * Qualified Name:     K1.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */