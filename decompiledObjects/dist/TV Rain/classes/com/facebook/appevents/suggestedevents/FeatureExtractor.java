package com.facebook.appevents.suggestedevents;

import android.util.Patterns;
import androidx.annotation.Nullable;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class FeatureExtractor
{
  private static final int NUM_OF_FEATURES = 30;
  private static final String REGEX_ADD_TO_CART_BUTTON_TEXT = "(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart";
  private static final String REGEX_ADD_TO_CART_PAGE_TITLE = "(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy";
  private static final String REGEX_CR_HAS_CONFIRM_PASSWORD_FIELD = "(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)";
  private static final String REGEX_CR_HAS_LOG_IN_KEYWORDS = "(?i)(sign in)|login|signIn";
  private static final String REGEX_CR_HAS_SIGN_ON_KEYWORDS = "(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)";
  private static final String REGEX_CR_PASSWORD_FIELD = "password";
  private static Map<String, String> eventInfo;
  private static boolean initialized = false;
  private static Map<String, String> languageInfo;
  private static JSONObject rules;
  private static Map<String, String> textTypeInfo;
  
  @Nullable
  public static float[] getDenseFeatures(JSONObject paramJSONObject, String paramString)
  {
    if (CrashShieldHandler.isObjectCrashing(FeatureExtractor.class)) {
      return null;
    }
    for (;;)
    {
      try
      {
        if (!initialized) {
          return null;
        }
        arrayOfFloat = new float[30];
        Arrays.fill(arrayOfFloat, 0.0F);
      }
      finally
      {
        float[] arrayOfFloat;
        String str1;
        String str2;
        JSONArray localJSONArray;
        CrashShieldHandler.handleThrowable(paramJSONObject, FeatureExtractor.class);
        return null;
      }
      try
      {
        str1 = paramString.toLowerCase();
        paramString = new org/json/JSONObject;
        paramString.<init>(paramJSONObject.optJSONObject("view").toString());
        str2 = paramJSONObject.optString("screenname");
        localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>();
        pruneTree(paramString, localJSONArray);
        sum(arrayOfFloat, parseFeatures(paramString));
        paramJSONObject = getInteractedNode(paramString);
        if (paramJSONObject == null) {
          return null;
        }
        sum(arrayOfFloat, nonparseFeatures(paramJSONObject, localJSONArray, str2, paramString.toString(), str1));
      }
      catch (JSONException paramJSONObject) {}
    }
    return arrayOfFloat;
  }
  
  /* Error */
  @Nullable
  private static JSONObject getInteractedNode(JSONObject paramJSONObject)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 52	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   5: ifeq +5 -> 10
    //   8: aconst_null
    //   9: areturn
    //   10: aload_0
    //   11: ldc 116
    //   13: invokevirtual 120	org/json/JSONObject:optBoolean	(Ljava/lang/String;)Z
    //   16: ifeq +5 -> 21
    //   19: aload_0
    //   20: areturn
    //   21: aload_0
    //   22: ldc 122
    //   24: invokevirtual 126	org/json/JSONObject:optJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   27: astore_1
    //   28: aload_1
    //   29: ifnonnull +5 -> 34
    //   32: aconst_null
    //   33: areturn
    //   34: iconst_0
    //   35: istore_2
    //   36: iload_2
    //   37: aload_1
    //   38: invokevirtual 130	org/json/JSONArray:length	()I
    //   41: if_icmpge +31 -> 72
    //   44: aload_1
    //   45: iload_2
    //   46: invokevirtual 134	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   49: invokestatic 105	com/facebook/appevents/suggestedevents/FeatureExtractor:getInteractedNode	(Lorg/json/JSONObject;)Lorg/json/JSONObject;
    //   52: astore_0
    //   53: aload_0
    //   54: ifnull +5 -> 59
    //   57: aload_0
    //   58: areturn
    //   59: iinc 2 1
    //   62: goto -26 -> 36
    //   65: astore_0
    //   66: aload_0
    //   67: ldc 2
    //   69: invokestatic 113	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   72: aconst_null
    //   73: areturn
    //   74: astore_0
    //   75: goto -3 -> 72
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	78	0	paramJSONObject	JSONObject
    //   27	18	1	localJSONArray	JSONArray
    //   35	25	2	i	int
    // Exception table:
    //   from	to	target	type
    //   10	19	65	finally
    //   21	28	65	finally
    //   36	53	65	finally
    //   10	19	74	org/json/JSONException
    //   21	28	74	org/json/JSONException
    //   36	53	74	org/json/JSONException
  }
  
  public static String getTextFeature(String paramString1, String paramString2, String paramString3)
  {
    if (CrashShieldHandler.isObjectCrashing(FeatureExtractor.class)) {
      return null;
    }
    try
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append(paramString3);
      localStringBuilder.append(" | ");
      localStringBuilder.append(paramString2);
      localStringBuilder.append(", ");
      localStringBuilder.append(paramString1);
      paramString1 = localStringBuilder.toString().toLowerCase();
      return paramString1;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString1, FeatureExtractor.class);
    }
    return null;
  }
  
  /* Error */
  public static void initialize(java.io.File paramFile)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 52	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   5: ifeq +4 -> 9
    //   8: return
    //   9: new 68	org/json/JSONObject
    //   12: astore_1
    //   13: aload_1
    //   14: invokespecial 153	org/json/JSONObject:<init>	()V
    //   17: aload_1
    //   18: putstatic 155	com/facebook/appevents/suggestedevents/FeatureExtractor:rules	Lorg/json/JSONObject;
    //   21: new 157	java/io/FileInputStream
    //   24: astore_1
    //   25: aload_1
    //   26: aload_0
    //   27: invokespecial 159	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   30: aload_1
    //   31: invokevirtual 164	java/io/InputStream:available	()I
    //   34: newarray <illegal type>
    //   36: astore_0
    //   37: aload_1
    //   38: aload_0
    //   39: invokevirtual 168	java/io/InputStream:read	([B)I
    //   42: pop
    //   43: aload_1
    //   44: invokevirtual 171	java/io/InputStream:close	()V
    //   47: new 68	org/json/JSONObject
    //   50: astore_2
    //   51: new 62	java/lang/String
    //   54: astore_1
    //   55: aload_1
    //   56: aload_0
    //   57: ldc -83
    //   59: invokespecial 176	java/lang/String:<init>	([BLjava/lang/String;)V
    //   62: aload_2
    //   63: aload_1
    //   64: invokespecial 80	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   67: aload_2
    //   68: putstatic 155	com/facebook/appevents/suggestedevents/FeatureExtractor:rules	Lorg/json/JSONObject;
    //   71: new 178	java/util/HashMap
    //   74: astore_0
    //   75: aload_0
    //   76: invokespecial 179	java/util/HashMap:<init>	()V
    //   79: aload_0
    //   80: putstatic 181	com/facebook/appevents/suggestedevents/FeatureExtractor:languageInfo	Ljava/util/Map;
    //   83: aload_0
    //   84: ldc -73
    //   86: ldc -71
    //   88: invokeinterface 191 3 0
    //   93: pop
    //   94: getstatic 181	com/facebook/appevents/suggestedevents/FeatureExtractor:languageInfo	Ljava/util/Map;
    //   97: ldc -63
    //   99: ldc -61
    //   101: invokeinterface 191 3 0
    //   106: pop
    //   107: getstatic 181	com/facebook/appevents/suggestedevents/FeatureExtractor:languageInfo	Ljava/util/Map;
    //   110: ldc -59
    //   112: ldc -57
    //   114: invokeinterface 191 3 0
    //   119: pop
    //   120: getstatic 181	com/facebook/appevents/suggestedevents/FeatureExtractor:languageInfo	Ljava/util/Map;
    //   123: ldc -55
    //   125: ldc -53
    //   127: invokeinterface 191 3 0
    //   132: pop
    //   133: new 178	java/util/HashMap
    //   136: astore_0
    //   137: aload_0
    //   138: invokespecial 179	java/util/HashMap:<init>	()V
    //   141: aload_0
    //   142: putstatic 205	com/facebook/appevents/suggestedevents/FeatureExtractor:eventInfo	Ljava/util/Map;
    //   145: aload_0
    //   146: ldc -49
    //   148: ldc -47
    //   150: invokeinterface 191 3 0
    //   155: pop
    //   156: getstatic 205	com/facebook/appevents/suggestedevents/FeatureExtractor:eventInfo	Ljava/util/Map;
    //   159: ldc -45
    //   161: ldc -71
    //   163: invokeinterface 191 3 0
    //   168: pop
    //   169: getstatic 205	com/facebook/appevents/suggestedevents/FeatureExtractor:eventInfo	Ljava/util/Map;
    //   172: ldc -43
    //   174: ldc -61
    //   176: invokeinterface 191 3 0
    //   181: pop
    //   182: getstatic 205	com/facebook/appevents/suggestedevents/FeatureExtractor:eventInfo	Ljava/util/Map;
    //   185: ldc -41
    //   187: ldc -57
    //   189: invokeinterface 191 3 0
    //   194: pop
    //   195: getstatic 205	com/facebook/appevents/suggestedevents/FeatureExtractor:eventInfo	Ljava/util/Map;
    //   198: ldc -39
    //   200: ldc -53
    //   202: invokeinterface 191 3 0
    //   207: pop
    //   208: getstatic 205	com/facebook/appevents/suggestedevents/FeatureExtractor:eventInfo	Ljava/util/Map;
    //   211: ldc -37
    //   213: ldc -35
    //   215: invokeinterface 191 3 0
    //   220: pop
    //   221: getstatic 205	com/facebook/appevents/suggestedevents/FeatureExtractor:eventInfo	Ljava/util/Map;
    //   224: ldc -33
    //   226: ldc -31
    //   228: invokeinterface 191 3 0
    //   233: pop
    //   234: getstatic 205	com/facebook/appevents/suggestedevents/FeatureExtractor:eventInfo	Ljava/util/Map;
    //   237: ldc -29
    //   239: ldc -27
    //   241: invokeinterface 191 3 0
    //   246: pop
    //   247: getstatic 205	com/facebook/appevents/suggestedevents/FeatureExtractor:eventInfo	Ljava/util/Map;
    //   250: ldc -25
    //   252: ldc -23
    //   254: invokeinterface 191 3 0
    //   259: pop
    //   260: new 178	java/util/HashMap
    //   263: astore_0
    //   264: aload_0
    //   265: invokespecial 179	java/util/HashMap:<init>	()V
    //   268: aload_0
    //   269: putstatic 235	com/facebook/appevents/suggestedevents/FeatureExtractor:textTypeInfo	Ljava/util/Map;
    //   272: aload_0
    //   273: ldc -19
    //   275: ldc -71
    //   277: invokeinterface 191 3 0
    //   282: pop
    //   283: getstatic 235	com/facebook/appevents/suggestedevents/FeatureExtractor:textTypeInfo	Ljava/util/Map;
    //   286: ldc -17
    //   288: ldc -61
    //   290: invokeinterface 191 3 0
    //   295: pop
    //   296: getstatic 235	com/facebook/appevents/suggestedevents/FeatureExtractor:textTypeInfo	Ljava/util/Map;
    //   299: ldc -15
    //   301: ldc -57
    //   303: invokeinterface 191 3 0
    //   308: pop
    //   309: getstatic 235	com/facebook/appevents/suggestedevents/FeatureExtractor:textTypeInfo	Ljava/util/Map;
    //   312: ldc -13
    //   314: ldc -53
    //   316: invokeinterface 191 3 0
    //   321: pop
    //   322: iconst_1
    //   323: putstatic 54	com/facebook/appevents/suggestedevents/FeatureExtractor:initialized	Z
    //   326: return
    //   327: astore_0
    //   328: aload_0
    //   329: ldc 2
    //   331: invokestatic 113	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   334: return
    //   335: astore_0
    //   336: goto -2 -> 334
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	339	0	paramFile	java.io.File
    //   12	52	1	localObject	Object
    //   50	18	2	localJSONObject	JSONObject
    // Exception table:
    //   from	to	target	type
    //   9	71	327	finally
    //   71	326	327	finally
    //   9	71	335	java/lang/Exception
  }
  
  private static boolean isButton(JSONObject paramJSONObject)
  {
    boolean bool1 = CrashShieldHandler.isObjectCrashing(FeatureExtractor.class);
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    try
    {
      int i = paramJSONObject.optInt("classtypebitmask");
      if ((i & 0x20) > 0) {
        bool2 = true;
      }
      return bool2;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramJSONObject, FeatureExtractor.class);
    }
    return false;
  }
  
  public static boolean isInitialized()
  {
    if (CrashShieldHandler.isObjectCrashing(FeatureExtractor.class)) {
      return false;
    }
    try
    {
      boolean bool = initialized;
      return bool;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, FeatureExtractor.class);
    }
    return false;
  }
  
  private static boolean matchIndicators(String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    if (CrashShieldHandler.isObjectCrashing(FeatureExtractor.class)) {
      return false;
    }
    try
    {
      int i = paramArrayOfString1.length;
      for (int j = 0; j < i; j++)
      {
        String str = paramArrayOfString1[j];
        int k = paramArrayOfString2.length;
        for (int m = 0; m < k; m++)
        {
          boolean bool = paramArrayOfString2[m].contains(str);
          if (bool) {
            return true;
          }
        }
      }
      return false;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramArrayOfString1, FeatureExtractor.class);
    }
    return false;
  }
  
  private static float[] nonparseFeatures(JSONObject paramJSONObject, JSONArray paramJSONArray, String paramString1, String paramString2, String paramString3)
  {
    if (CrashShieldHandler.isObjectCrashing(FeatureExtractor.class)) {
      return null;
    }
    for (;;)
    {
      try
      {
        arrayOfFloat = new float[30];
        Arrays.fill(arrayOfFloat, 0.0F);
        i = paramJSONArray.length();
        int j = 0;
        if (i > 1) {
          i--;
        } else {
          i = 0;
        }
        arrayOfFloat[3] = i;
        i = j;
      }
      finally
      {
        float[] arrayOfFloat;
        int i;
        float f;
        CrashShieldHandler.handleThrowable(paramJSONObject, FeatureExtractor.class);
        return null;
      }
      try
      {
        if (i < paramJSONArray.length())
        {
          if (isButton(paramJSONArray.getJSONObject(i))) {
            arrayOfFloat[9] += 1.0F;
          }
          i++;
        }
      }
      catch (JSONException paramJSONArray) {}
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
    updateHintAndTextRecursively(paramJSONObject, paramString1, paramString3);
    paramJSONObject = paramString3.toString();
    paramString1 = paramString1.toString();
    if (regexMatched("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_TEXT", paramString1)) {
      f = 1.0F;
    } else {
      f = 0.0F;
    }
    arrayOfFloat[15] = f;
    if (regexMatched("ENGLISH", "COMPLETE_REGISTRATION", "PAGE_TITLE", paramJSONArray)) {
      f = 1.0F;
    } else {
      f = 0.0F;
    }
    arrayOfFloat[16] = f;
    if (regexMatched("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_ID", paramJSONObject)) {
      f = 1.0F;
    } else {
      f = 0.0F;
    }
    arrayOfFloat[17] = f;
    if (paramString2.contains("password")) {
      f = 1.0F;
    } else {
      f = 0.0F;
    }
    arrayOfFloat[18] = f;
    if (regexMatched("(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)", paramString2)) {
      f = 1.0F;
    } else {
      f = 0.0F;
    }
    arrayOfFloat[19] = f;
    if (regexMatched("(?i)(sign in)|login|signIn", paramString2)) {
      f = 1.0F;
    } else {
      f = 0.0F;
    }
    arrayOfFloat[20] = f;
    if (regexMatched("(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)", paramString2)) {
      f = 1.0F;
    } else {
      f = 0.0F;
    }
    arrayOfFloat[21] = f;
    if (regexMatched("ENGLISH", "PURCHASE", "BUTTON_TEXT", paramString1)) {
      f = 1.0F;
    } else {
      f = 0.0F;
    }
    arrayOfFloat[22] = f;
    if (regexMatched("ENGLISH", "PURCHASE", "PAGE_TITLE", paramJSONArray)) {
      f = 1.0F;
    } else {
      f = 0.0F;
    }
    arrayOfFloat[24] = f;
    if (regexMatched("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart", paramString1)) {
      f = 1.0F;
    } else {
      f = 0.0F;
    }
    arrayOfFloat[25] = f;
    if (regexMatched("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy", paramJSONArray)) {
      f = 1.0F;
    } else {
      f = 0.0F;
    }
    arrayOfFloat[27] = f;
    if (regexMatched("ENGLISH", "LEAD", "BUTTON_TEXT", paramString1)) {
      f = 1.0F;
    } else {
      f = 0.0F;
    }
    arrayOfFloat[28] = f;
    if (regexMatched("ENGLISH", "LEAD", "PAGE_TITLE", paramJSONArray)) {
      f = 1.0F;
    } else {
      f = 0.0F;
    }
    arrayOfFloat[29] = f;
    return arrayOfFloat;
  }
  
  private static float[] parseFeatures(JSONObject paramJSONObject)
  {
    if (CrashShieldHandler.isObjectCrashing(FeatureExtractor.class)) {
      return null;
    }
    for (;;)
    {
      try
      {
        arrayOfFloat = new float[30];
        Arrays.fill(arrayOfFloat, 0.0F);
        String str1 = paramJSONObject.optString("text").toLowerCase();
        String str2 = paramJSONObject.optString("hint").toLowerCase();
        String str3 = paramJSONObject.optString("classname").toLowerCase();
        i = paramJSONObject.optInt("inputtype", -1);
        String[] arrayOfString = new String[2];
        j = 0;
        arrayOfString[0] = str1;
        arrayOfString[1] = str2;
        if (matchIndicators(new String[] { "$", "amount", "price", "total" }, arrayOfString)) {
          arrayOfFloat[0] = ((float)(arrayOfFloat[0] + 1.0D));
        }
        if (matchIndicators(new String[] { "password", "pwd" }, arrayOfString)) {
          arrayOfFloat[1] = ((float)(arrayOfFloat[1] + 1.0D));
        }
        if (matchIndicators(new String[] { "tel", "phone" }, arrayOfString)) {
          arrayOfFloat[2] = ((float)(arrayOfFloat[2] + 1.0D));
        }
        if (matchIndicators(new String[] { "search" }, arrayOfString)) {
          arrayOfFloat[4] = ((float)(arrayOfFloat[4] + 1.0D));
        }
        if (i >= 0) {
          arrayOfFloat[5] = ((float)(arrayOfFloat[5] + 1.0D));
        }
        if ((i == 3) || (i == 2)) {
          arrayOfFloat[6] = ((float)(arrayOfFloat[6] + 1.0D));
        }
        if ((i == 32) || (Patterns.EMAIL_ADDRESS.matcher(str1).matches())) {
          arrayOfFloat[7] = ((float)(arrayOfFloat[7] + 1.0D));
        }
        if (str3.contains("checkbox")) {
          arrayOfFloat[8] = ((float)(arrayOfFloat[8] + 1.0D));
        }
        if (matchIndicators(new String[] { "complete", "confirm", "done", "submit" }, new String[] { str1 })) {
          arrayOfFloat[10] = ((float)(arrayOfFloat[10] + 1.0D));
        }
        if ((str3.contains("radio")) && (str3.contains("button"))) {
          arrayOfFloat[12] = ((float)(arrayOfFloat[12] + 1.0D));
        }
      }
      finally
      {
        float[] arrayOfFloat;
        int i;
        int j;
        CrashShieldHandler.handleThrowable(paramJSONObject, FeatureExtractor.class);
        return null;
      }
      try
      {
        paramJSONObject = paramJSONObject.optJSONArray("childviews");
        i = paramJSONObject.length();
        if (j < i)
        {
          sum(arrayOfFloat, parseFeatures(paramJSONObject.getJSONObject(j)));
          j++;
        }
      }
      catch (JSONException paramJSONObject) {}
    }
    return arrayOfFloat;
  }
  
  /* Error */
  private static boolean pruneTree(JSONObject paramJSONObject, JSONArray paramJSONArray)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 52	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   5: ifeq +5 -> 10
    //   8: iconst_0
    //   9: ireturn
    //   10: aload_0
    //   11: ldc 116
    //   13: invokevirtual 120	org/json/JSONObject:optBoolean	(Ljava/lang/String;)Z
    //   16: ifeq +5 -> 21
    //   19: iconst_1
    //   20: ireturn
    //   21: aload_0
    //   22: ldc 122
    //   24: invokevirtual 126	org/json/JSONObject:optJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   27: astore_2
    //   28: iconst_0
    //   29: istore_3
    //   30: iload_3
    //   31: aload_2
    //   32: invokevirtual 130	org/json/JSONArray:length	()I
    //   35: if_icmpge +28 -> 63
    //   38: aload_2
    //   39: iload_3
    //   40: invokevirtual 134	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   43: ldc 116
    //   45: invokevirtual 120	org/json/JSONObject:optBoolean	(Ljava/lang/String;)Z
    //   48: ifeq +9 -> 57
    //   51: iconst_1
    //   52: istore 4
    //   54: goto +12 -> 66
    //   57: iinc 3 1
    //   60: goto -30 -> 30
    //   63: iconst_0
    //   64: istore 4
    //   66: iload 4
    //   68: istore 5
    //   70: new 88	org/json/JSONArray
    //   73: astore 6
    //   75: aload 6
    //   77: invokespecial 89	org/json/JSONArray:<init>	()V
    //   80: iload 4
    //   82: ifeq +33 -> 115
    //   85: iconst_0
    //   86: istore_3
    //   87: iload 5
    //   89: istore 4
    //   91: iload_3
    //   92: aload_2
    //   93: invokevirtual 130	org/json/JSONArray:length	()I
    //   96: if_icmpge +75 -> 171
    //   99: aload_1
    //   100: aload_2
    //   101: iload_3
    //   102: invokevirtual 134	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   105: invokevirtual 339	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   108: pop
    //   109: iinc 3 1
    //   112: goto -25 -> 87
    //   115: iconst_0
    //   116: istore_3
    //   117: iload_3
    //   118: aload_2
    //   119: invokevirtual 130	org/json/JSONArray:length	()I
    //   122: if_icmpge +36 -> 158
    //   125: aload_2
    //   126: iload_3
    //   127: invokevirtual 134	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   130: astore 7
    //   132: aload 7
    //   134: aload_1
    //   135: invokestatic 93	com/facebook/appevents/suggestedevents/FeatureExtractor:pruneTree	(Lorg/json/JSONObject;Lorg/json/JSONArray;)Z
    //   138: ifeq +14 -> 152
    //   141: aload 6
    //   143: aload 7
    //   145: invokevirtual 339	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   148: pop
    //   149: iconst_1
    //   150: istore 5
    //   152: iinc 3 1
    //   155: goto -38 -> 117
    //   158: aload_0
    //   159: ldc 122
    //   161: aload 6
    //   163: invokevirtual 342	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   166: pop
    //   167: iload 5
    //   169: istore 4
    //   171: iload 4
    //   173: ireturn
    //   174: astore_0
    //   175: aload_0
    //   176: ldc 2
    //   178: invokestatic 113	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   181: iconst_0
    //   182: ireturn
    //   183: astore_0
    //   184: goto -3 -> 181
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	187	0	paramJSONObject	JSONObject
    //   0	187	1	paramJSONArray	JSONArray
    //   27	99	2	localJSONArray1	JSONArray
    //   29	124	3	i	int
    //   52	120	4	bool1	boolean
    //   68	100	5	bool2	boolean
    //   73	89	6	localJSONArray2	JSONArray
    //   130	14	7	localJSONObject	JSONObject
    // Exception table:
    //   from	to	target	type
    //   10	19	174	finally
    //   21	28	174	finally
    //   30	51	174	finally
    //   70	80	174	finally
    //   91	109	174	finally
    //   117	132	174	finally
    //   132	149	174	finally
    //   158	167	174	finally
    //   10	19	183	org/json/JSONException
    //   21	28	183	org/json/JSONException
    //   30	51	183	org/json/JSONException
    //   70	80	183	org/json/JSONException
    //   91	109	183	org/json/JSONException
    //   117	132	183	org/json/JSONException
    //   132	149	183	org/json/JSONException
    //   158	167	183	org/json/JSONException
  }
  
  private static boolean regexMatched(String paramString1, String paramString2)
  {
    if (CrashShieldHandler.isObjectCrashing(FeatureExtractor.class)) {
      return false;
    }
    try
    {
      boolean bool = Pattern.compile(paramString1).matcher(paramString2).find();
      return bool;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString1, FeatureExtractor.class);
    }
    return false;
  }
  
  private static boolean regexMatched(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    if (CrashShieldHandler.isObjectCrashing(FeatureExtractor.class)) {
      return false;
    }
    try
    {
      boolean bool = regexMatched(rules.optJSONObject("rulesForLanguage").optJSONObject((String)languageInfo.get(paramString1)).optJSONObject("rulesForEvent").optJSONObject((String)eventInfo.get(paramString2)).optJSONObject("positiveRules").optString((String)textTypeInfo.get(paramString3)), paramString4);
      return bool;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString1, FeatureExtractor.class);
    }
    return false;
  }
  
  private static void sum(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    if (CrashShieldHandler.isObjectCrashing(FeatureExtractor.class)) {
      return;
    }
    int i = 0;
    try
    {
      while (i < paramArrayOfFloat1.length)
      {
        paramArrayOfFloat1[i] += paramArrayOfFloat2[i];
        i++;
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramArrayOfFloat1, FeatureExtractor.class);
    }
  }
  
  /* Error */
  private static void updateHintAndTextRecursively(JSONObject paramJSONObject, StringBuilder paramStringBuilder1, StringBuilder paramStringBuilder2)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 52	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   5: ifeq +4 -> 9
    //   8: return
    //   9: aload_0
    //   10: ldc_w 278
    //   13: ldc_w 361
    //   16: invokevirtual 364	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   19: invokevirtual 66	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   22: astore_3
    //   23: aload_0
    //   24: ldc_w 280
    //   27: ldc_w 361
    //   30: invokevirtual 364	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   33: invokevirtual 66	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   36: astore 4
    //   38: aload_3
    //   39: invokevirtual 367	java/lang/String:isEmpty	()Z
    //   42: istore 5
    //   44: iload 5
    //   46: ifne +17 -> 63
    //   49: aload_1
    //   50: aload_3
    //   51: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: pop
    //   55: aload_1
    //   56: ldc_w 369
    //   59: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   62: pop
    //   63: aload 4
    //   65: invokevirtual 367	java/lang/String:isEmpty	()Z
    //   68: ifne +18 -> 86
    //   71: aload_2
    //   72: aload 4
    //   74: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   77: pop
    //   78: aload_2
    //   79: ldc_w 369
    //   82: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   85: pop
    //   86: aload_0
    //   87: ldc 122
    //   89: invokevirtual 126	org/json/JSONObject:optJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   92: astore 4
    //   94: aload 4
    //   96: ifnonnull +4 -> 100
    //   99: return
    //   100: iconst_0
    //   101: istore 6
    //   103: aload 4
    //   105: invokevirtual 130	org/json/JSONArray:length	()I
    //   108: istore 7
    //   110: iload 6
    //   112: iload 7
    //   114: if_icmpge +21 -> 135
    //   117: aload 4
    //   119: iload 6
    //   121: invokevirtual 134	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   124: aload_1
    //   125: aload_2
    //   126: invokestatic 269	com/facebook/appevents/suggestedevents/FeatureExtractor:updateHintAndTextRecursively	(Lorg/json/JSONObject;Ljava/lang/StringBuilder;Ljava/lang/StringBuilder;)V
    //   129: iinc 6 1
    //   132: goto -29 -> 103
    //   135: return
    //   136: astore_0
    //   137: aload_0
    //   138: ldc 2
    //   140: invokestatic 113	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   143: return
    //   144: astore_0
    //   145: goto -16 -> 129
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	148	0	paramJSONObject	JSONObject
    //   0	148	1	paramStringBuilder1	StringBuilder
    //   0	148	2	paramStringBuilder2	StringBuilder
    //   22	29	3	str	String
    //   36	82	4	localObject	Object
    //   42	3	5	bool	boolean
    //   101	29	6	i	int
    //   108	7	7	j	int
    // Exception table:
    //   from	to	target	type
    //   9	44	136	finally
    //   49	63	136	finally
    //   63	86	136	finally
    //   86	94	136	finally
    //   103	110	136	finally
    //   117	129	136	finally
    //   117	129	144	org/json/JSONException
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.suggestedevents.FeatureExtractor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */