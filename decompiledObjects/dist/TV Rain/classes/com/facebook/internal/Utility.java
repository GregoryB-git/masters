package com.facebook.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.BaseBundle;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.view.autofill.AutofillManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.Callback;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.appevents.UserDataStore;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public final class Utility
{
  private static final String ARC_DEVICE_PATTERN = ".+_cheets|cheets_.+";
  public static final int DEFAULT_STREAM_BUFFER_SIZE = 8192;
  private static final String EXTRA_APP_EVENTS_INFO_FORMAT_VERSION = "a2";
  private static final String HASH_ALGORITHM_MD5 = "MD5";
  private static final String HASH_ALGORITHM_SHA1 = "SHA-1";
  private static final String HASH_ALGORITHM_SHA256 = "SHA-256";
  public static final String LOG_TAG = "FacebookSDK";
  private static final int REFRESH_TIME_FOR_EXTENDED_DEVICE_INFO_MILLIS = 1800000;
  private static final String URL_SCHEME = "https";
  private static final String UTF8 = "UTF-8";
  private static long availableExternalStorageGB = -1L;
  private static String carrierName = "NoCarrier";
  private static String deviceTimeZoneName = "";
  private static String deviceTimezoneAbbreviation = "";
  private static final String noCarrierConstant = "NoCarrier";
  private static int numCPUCores = 0;
  private static long timestampOfLastCheck = -1L;
  private static long totalExternalStorageGB = -1L;
  
  public static Map<String, String> JsonStrToMap(String paramString)
  {
    if (paramString.isEmpty()) {
      return new HashMap();
    }
    try
    {
      HashMap localHashMap = new java/util/HashMap;
      localHashMap.<init>();
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      Iterator localIterator = localJSONObject.keys();
      while (localIterator.hasNext())
      {
        paramString = (String)localIterator.next();
        localHashMap.put(paramString, localJSONObject.getString(paramString));
      }
      return localHashMap;
    }
    catch (JSONException paramString) {}
    return new HashMap();
  }
  
  public static <T> boolean areObjectsEqual(T paramT1, T paramT2)
  {
    if (paramT1 == null)
    {
      boolean bool;
      if (paramT2 == null) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    return paramT1.equals(paramT2);
  }
  
  public static <T> ArrayList<T> arrayList(T... paramVarArgs)
  {
    ArrayList localArrayList = new ArrayList(paramVarArgs.length);
    int i = paramVarArgs.length;
    for (int j = 0; j < i; j++) {
      localArrayList.add(paramVarArgs[j]);
    }
    return localArrayList;
  }
  
  public static <T> List<T> asListNoNulls(T... paramVarArgs)
  {
    ArrayList localArrayList = new ArrayList();
    int i = paramVarArgs.length;
    for (int j = 0; j < i; j++)
    {
      T ? = paramVarArgs[j];
      if (? != null) {
        localArrayList.add(?);
      }
    }
    return localArrayList;
  }
  
  public static JSONObject awaitGetGraphMeRequestWithCache(String paramString)
  {
    JSONObject localJSONObject = ProfileInformationCache.getProfileInformation(paramString);
    if (localJSONObject != null) {
      return localJSONObject;
    }
    paramString = getGraphMeRequestWithCache(paramString).executeAndWait();
    if (paramString.getError() != null) {
      return null;
    }
    return paramString.getJSONObject();
  }
  
  public static Uri buildUri(String paramString1, String paramString2, Bundle paramBundle)
  {
    Uri.Builder localBuilder = new Uri.Builder();
    localBuilder.scheme("https");
    localBuilder.authority(paramString1);
    localBuilder.path(paramString2);
    if (paramBundle != null)
    {
      paramString1 = paramBundle.keySet().iterator();
      while (paramString1.hasNext())
      {
        String str = (String)paramString1.next();
        paramString2 = paramBundle.get(str);
        if ((paramString2 instanceof String)) {
          localBuilder.appendQueryParameter(str, (String)paramString2);
        }
      }
    }
    return localBuilder.build();
  }
  
  public static void clearCaches(Context paramContext)
  {
    ImageDownloader.clearCache(paramContext);
  }
  
  private static void clearCookiesForDomain(Context paramContext, String paramString)
  {
    CookieSyncManager.createInstance(paramContext).sync();
    paramContext = CookieManager.getInstance();
    Object localObject = paramContext.getCookie(paramString);
    if (localObject == null) {
      return;
    }
    localObject = ((String)localObject).split(";");
    int i = localObject.length;
    for (int j = 0; j < i; j++)
    {
      String[] arrayOfString = localObject[j].split("=");
      if (arrayOfString.length > 0)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(arrayOfString[0].trim());
        localStringBuilder.append("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
        paramContext.setCookie(paramString, localStringBuilder.toString());
      }
    }
    paramContext.removeExpiredCookie();
  }
  
  public static void clearFacebookCookies(Context paramContext)
  {
    clearCookiesForDomain(paramContext, "facebook.com");
    clearCookiesForDomain(paramContext, ".facebook.com");
    clearCookiesForDomain(paramContext, "https://facebook.com");
    clearCookiesForDomain(paramContext, "https://.facebook.com");
  }
  
  public static void closeQuietly(Closeable paramCloseable)
  {
    if (paramCloseable != null) {}
    try
    {
      paramCloseable.close();
      return;
    }
    catch (IOException paramCloseable)
    {
      for (;;) {}
    }
  }
  
  public static String coerceValueIfNullOrEmpty(String paramString1, String paramString2)
  {
    if (isNullOrEmpty(paramString1)) {
      return paramString2;
    }
    return paramString1;
  }
  
  private static long convertBytesToGB(double paramDouble)
  {
    return Math.round(paramDouble / 1.073741824E9D);
  }
  
  public static List<String> convertJSONArrayToList(JSONArray paramJSONArray)
  {
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      for (int i = 0; i < paramJSONArray.length(); i++) {
        localArrayList.add(paramJSONArray.getString(i));
      }
      return localArrayList;
    }
    catch (JSONException paramJSONArray) {}
    return new ArrayList();
  }
  
  public static Map<String, Object> convertJSONObjectToHashMap(JSONObject paramJSONObject)
  {
    HashMap localHashMap = new HashMap();
    JSONArray localJSONArray = paramJSONObject.names();
    int i = 0;
    while (i < localJSONArray.length()) {
      try
      {
        String str = localJSONArray.getString(i);
        Object localObject1 = paramJSONObject.get(str);
        Object localObject2 = localObject1;
        if ((localObject1 instanceof JSONObject)) {
          localObject2 = convertJSONObjectToHashMap((JSONObject)localObject1);
        }
        localHashMap.put(str, localObject2);
        i++;
      }
      catch (JSONException localJSONException)
      {
        for (;;) {}
      }
    }
    return localHashMap;
  }
  
  public static Map<String, String> convertJSONObjectToStringMap(@NonNull JSONObject paramJSONObject)
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramJSONObject.keys();
    while (localIterator.hasNext())
    {
      String str1 = (String)localIterator.next();
      String str2 = paramJSONObject.optString(str1);
      if (str2 != null) {
        localHashMap.put(str1, str2);
      }
    }
    return localHashMap;
  }
  
  /* Error */
  public static int copyAndCloseInputStream(java.io.InputStream paramInputStream, java.io.OutputStream paramOutputStream)
    throws IOException
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: new 325	java/io/BufferedInputStream
    //   5: astore_3
    //   6: aload_3
    //   7: aload_0
    //   8: invokespecial 328	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   11: sipush 8192
    //   14: newarray <illegal type>
    //   16: astore_2
    //   17: iconst_0
    //   18: istore 4
    //   20: aload_3
    //   21: aload_2
    //   22: invokevirtual 334	java/io/InputStream:read	([B)I
    //   25: istore 5
    //   27: iload 5
    //   29: iconst_m1
    //   30: if_icmpeq +21 -> 51
    //   33: aload_1
    //   34: aload_2
    //   35: iconst_0
    //   36: iload 5
    //   38: invokevirtual 340	java/io/OutputStream:write	([BII)V
    //   41: iload 4
    //   43: iload 5
    //   45: iadd
    //   46: istore 4
    //   48: goto -28 -> 20
    //   51: aload_3
    //   52: invokevirtual 341	java/io/BufferedInputStream:close	()V
    //   55: aload_0
    //   56: ifnull +7 -> 63
    //   59: aload_0
    //   60: invokevirtual 342	java/io/InputStream:close	()V
    //   63: iload 4
    //   65: ireturn
    //   66: astore_1
    //   67: goto +6 -> 73
    //   70: astore_1
    //   71: aload_2
    //   72: astore_3
    //   73: aload_3
    //   74: ifnull +7 -> 81
    //   77: aload_3
    //   78: invokevirtual 341	java/io/BufferedInputStream:close	()V
    //   81: aload_0
    //   82: ifnull +7 -> 89
    //   85: aload_0
    //   86: invokevirtual 342	java/io/InputStream:close	()V
    //   89: aload_1
    //   90: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	91	0	paramInputStream	java.io.InputStream
    //   0	91	1	paramOutputStream	java.io.OutputStream
    //   1	71	2	arrayOfByte	byte[]
    //   5	73	3	localObject	Object
    //   18	46	4	i	int
    //   25	21	5	j	int
    // Exception table:
    //   from	to	target	type
    //   11	17	66	finally
    //   20	27	66	finally
    //   33	41	66	finally
    //   2	11	70	finally
  }
  
  public static void deleteDirectory(File paramFile)
  {
    if (!paramFile.exists()) {
      return;
    }
    if (paramFile.isDirectory())
    {
      File[] arrayOfFile = paramFile.listFiles();
      if (arrayOfFile != null)
      {
        int i = arrayOfFile.length;
        for (int j = 0; j < i; j++) {
          deleteDirectory(arrayOfFile[j]);
        }
      }
    }
    paramFile.delete();
  }
  
  public static void disconnectQuietly(URLConnection paramURLConnection)
  {
    if ((paramURLConnection != null) && ((paramURLConnection instanceof HttpURLConnection))) {
      ((HttpURLConnection)paramURLConnection).disconnect();
    }
  }
  
  private static boolean externalStorageExists()
  {
    return "mounted".equals(Environment.getExternalStorageState());
  }
  
  public static <T> List<T> filter(List<T> paramList, Predicate<T> paramPredicate)
  {
    Object localObject = null;
    if (paramList == null) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      paramList = localIterator.next();
      if (paramPredicate.apply(paramList)) {
        localArrayList.add(paramList);
      }
    }
    if (localArrayList.size() == 0) {
      paramList = (List<T>)localObject;
    } else {
      paramList = localArrayList;
    }
    return paramList;
  }
  
  public static String generateRandomString(int paramInt)
  {
    return new BigInteger(paramInt * 5, new Random()).toString(32);
  }
  
  public static String getActivityName(Context paramContext)
  {
    if (paramContext == null) {
      return "null";
    }
    if (paramContext == paramContext.getApplicationContext()) {
      return "unknown";
    }
    return paramContext.getClass().getSimpleName();
  }
  
  public static String getAppName(Context paramContext)
  {
    try
    {
      Object localObject = FacebookSdk.getApplicationName();
      if (localObject != null) {
        return (String)localObject;
      }
      localObject = paramContext.getApplicationInfo();
      int i = labelRes;
      if (i == 0) {
        paramContext = nonLocalizedLabel.toString();
      } else {
        paramContext = paramContext.getString(i);
      }
      return paramContext;
    }
    catch (Exception paramContext) {}
    return "";
  }
  
  @Nullable
  public static String getAppVersion()
  {
    Object localObject = FacebookSdk.getApplicationContext();
    if (localObject == null) {
      return null;
    }
    String str = ((Context)localObject).getPackageName();
    try
    {
      localObject = getPackageManagergetPackageInfo0versionName;
      return (String)localObject;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
    return null;
  }
  
  public static Date getBundleLongAsDate(Bundle paramBundle, String paramString, Date paramDate)
  {
    localObject = null;
    if (paramBundle == null) {
      return null;
    }
    paramString = paramBundle.get(paramString);
    long l;
    if ((paramString instanceof Long))
    {
      l = ((Long)paramString).longValue();
    }
    else
    {
      paramBundle = (Bundle)localObject;
      if (!(paramString instanceof String)) {
        break label88;
      }
    }
    try
    {
      l = Long.parseLong((String)paramString);
      if (l == 0L) {
        return new Date(Long.MAX_VALUE);
      }
      paramBundle = new Date(l * 1000L + paramDate.getTime());
    }
    catch (NumberFormatException paramBundle)
    {
      for (;;)
      {
        label88:
        paramBundle = (Bundle)localObject;
      }
    }
    return paramBundle;
  }
  
  public static long getContentSize(Uri paramUri)
  {
    Uri localUri = null;
    try
    {
      paramUri = FacebookSdk.getApplicationContext().getContentResolver().query(paramUri, null, null, null, null);
      localUri = paramUri;
      int i = paramUri.getColumnIndex("_size");
      localUri = paramUri;
      paramUri.moveToFirst();
      localUri = paramUri;
      long l = paramUri.getLong(i);
      paramUri.close();
      return l;
    }
    finally
    {
      if (localUri != null) {
        localUri.close();
      }
    }
  }
  
  public static Locale getCurrentLocale()
  {
    Locale localLocale = getResourceLocale();
    if (localLocale == null) {
      localLocale = Locale.getDefault();
    }
    return localLocale;
  }
  
  @Nullable
  public static JSONObject getDataProcessingOptions()
  {
    if (CrashShieldHandler.isObjectCrashing(Utility.class)) {
      return null;
    }
    try
    {
      localObject = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).getString("data_processing_options", null);
      if (localObject == null) {}
    }
    finally
    {
      Object localObject;
      label45:
      CrashShieldHandler.handleThrowable(localThrowable, Utility.class);
      return null;
    }
    try
    {
      localObject = new JSONObject((String)localObject);
      return (JSONObject)localObject;
    }
    catch (JSONException localJSONException)
    {
      break label45;
    }
    return null;
  }
  
  private static GraphRequest getGraphMeRequestWithCache(String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("fields", "id,name,first_name,middle_name,last_name");
    localBundle.putString("access_token", paramString);
    return new GraphRequest(null, "me", localBundle, HttpMethod.GET, null);
  }
  
  public static void getGraphMeRequestWithCacheAsync(final String paramString, GraphMeRequestWithCacheCallback paramGraphMeRequestWithCacheCallback)
  {
    JSONObject localJSONObject = ProfileInformationCache.getProfileInformation(paramString);
    if (localJSONObject != null)
    {
      paramGraphMeRequestWithCacheCallback.onSuccess(localJSONObject);
      return;
    }
    paramGraphMeRequestWithCacheCallback = new GraphRequest.Callback()
    {
      public void onCompleted(GraphResponse paramAnonymousGraphResponse)
      {
        if (paramAnonymousGraphResponse.getError() != null)
        {
          val$callback.onFailure(paramAnonymousGraphResponse.getError().getException());
        }
        else
        {
          ProfileInformationCache.putProfileInformation(paramString, paramAnonymousGraphResponse.getJSONObject());
          val$callback.onSuccess(paramAnonymousGraphResponse.getJSONObject());
        }
      }
    };
    paramString = getGraphMeRequestWithCache(paramString);
    paramString.setCallback(paramGraphMeRequestWithCacheCallback);
    paramString.executeAsync();
  }
  
  public static String getMetadataApplicationId(Context paramContext)
  {
    Validate.notNull(paramContext, "context");
    FacebookSdk.sdkInitialize(paramContext);
    return FacebookSdk.getApplicationId();
  }
  
  public static Method getMethodQuietly(Class<?> paramClass, String paramString, Class<?>... paramVarArgs)
  {
    try
    {
      paramClass = paramClass.getMethod(paramString, paramVarArgs);
      return paramClass;
    }
    catch (NoSuchMethodException paramClass) {}
    return null;
  }
  
  public static Method getMethodQuietly(String paramString1, String paramString2, Class<?>... paramVarArgs)
  {
    try
    {
      paramString1 = getMethodQuietly(Class.forName(paramString1), paramString2, paramVarArgs);
      return paramString1;
    }
    catch (ClassNotFoundException paramString1) {}
    return null;
  }
  
  @Nullable
  public static Locale getResourceLocale()
  {
    try
    {
      Locale localLocale = getApplicationContextgetResourcesgetConfigurationlocale;
      return localLocale;
    }
    catch (Exception localException) {}
    return null;
  }
  
  public static Object getStringPropertyAsJSON(JSONObject paramJSONObject, String paramString1, String paramString2)
    throws JSONException
  {
    paramString1 = paramJSONObject.opt(paramString1);
    paramJSONObject = paramString1;
    if (paramString1 != null)
    {
      paramJSONObject = paramString1;
      if ((paramString1 instanceof String)) {
        paramJSONObject = new JSONTokener((String)paramString1).nextValue();
      }
    }
    if ((paramJSONObject != null) && (!(paramJSONObject instanceof JSONObject)) && (!(paramJSONObject instanceof JSONArray)))
    {
      if (paramString2 != null)
      {
        paramString1 = new JSONObject();
        paramString1.putOpt(paramString2, paramJSONObject);
        return paramString1;
      }
      throw new FacebookException("Got an unexpected non-JSON object.");
    }
    return paramJSONObject;
  }
  
  public static String getUriString(Uri paramUri)
  {
    if (paramUri == null) {
      paramUri = null;
    } else {
      paramUri = paramUri.toString();
    }
    return paramUri;
  }
  
  public static PermissionsLists handlePermissionResponse(JSONObject paramJSONObject)
    throws JSONException
  {
    JSONArray localJSONArray = paramJSONObject.getJSONObject("permissions").getJSONArray("data");
    paramJSONObject = new ArrayList(localJSONArray.length());
    ArrayList localArrayList1 = new ArrayList(localJSONArray.length());
    ArrayList localArrayList2 = new ArrayList(localJSONArray.length());
    for (int i = 0; i < localJSONArray.length(); i++)
    {
      Object localObject = localJSONArray.optJSONObject(i);
      String str = ((JSONObject)localObject).optString("permission");
      if ((str != null) && (!str.equals("installed")))
      {
        localObject = ((JSONObject)localObject).optString("status");
        if (localObject != null) {
          if (((String)localObject).equals("granted")) {
            paramJSONObject.add(str);
          } else if (((String)localObject).equals("declined")) {
            localArrayList1.add(str);
          } else if (((String)localObject).equals("expired")) {
            localArrayList2.add(str);
          }
        }
      }
    }
    return new PermissionsLists(paramJSONObject, localArrayList1, localArrayList2);
  }
  
  public static boolean hasSameId(JSONObject paramJSONObject1, JSONObject paramJSONObject2)
  {
    if ((paramJSONObject1 != null) && (paramJSONObject2 != null) && (paramJSONObject1.has("id")) && (paramJSONObject2.has("id")))
    {
      if (paramJSONObject1.equals(paramJSONObject2)) {
        return true;
      }
      paramJSONObject1 = paramJSONObject1.optString("id");
      paramJSONObject2 = paramJSONObject2.optString("id");
      if ((paramJSONObject1 != null) && (paramJSONObject2 != null)) {
        return paramJSONObject1.equals(paramJSONObject2);
      }
    }
    return false;
  }
  
  private static String hashBytes(MessageDigest paramMessageDigest, byte[] paramArrayOfByte)
  {
    paramMessageDigest.update(paramArrayOfByte);
    paramMessageDigest = paramMessageDigest.digest();
    paramArrayOfByte = new StringBuilder();
    int i = paramMessageDigest.length;
    for (int j = 0; j < i; j++)
    {
      int k = paramMessageDigest[j];
      paramArrayOfByte.append(Integer.toHexString(k >> 4 & 0xF));
      paramArrayOfByte.append(Integer.toHexString(k >> 0 & 0xF));
    }
    return paramArrayOfByte.toString();
  }
  
  public static <T> HashSet<T> hashSet(T... paramVarArgs)
  {
    HashSet localHashSet = new HashSet(paramVarArgs.length);
    int i = paramVarArgs.length;
    for (int j = 0; j < i; j++) {
      localHashSet.add(paramVarArgs[j]);
    }
    return localHashSet;
  }
  
  private static String hashWithAlgorithm(String paramString1, String paramString2)
  {
    return hashWithAlgorithm(paramString1, paramString2.getBytes());
  }
  
  private static String hashWithAlgorithm(String paramString, byte[] paramArrayOfByte)
  {
    try
    {
      paramString = MessageDigest.getInstance(paramString);
      return hashBytes(paramString, paramArrayOfByte);
    }
    catch (NoSuchAlgorithmException paramString) {}
    return null;
  }
  
  public static int[] intersectRanges(int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    if (paramArrayOfInt1 == null) {
      return paramArrayOfInt2;
    }
    if (paramArrayOfInt2 == null) {
      return paramArrayOfInt1;
    }
    int[] arrayOfInt = new int[paramArrayOfInt1.length + paramArrayOfInt2.length];
    int i = 0;
    int j = 0;
    int k = j;
    for (;;)
    {
      m = k;
      if (i >= paramArrayOfInt1.length) {
        break label287;
      }
      m = k;
      if (j >= paramArrayOfInt2.length) {
        break label287;
      }
      int n = paramArrayOfInt1[i];
      int i1 = paramArrayOfInt2[j];
      if (i < paramArrayOfInt1.length - 1) {
        i2 = paramArrayOfInt1[(i + 1)];
      } else {
        i2 = Integer.MAX_VALUE;
      }
      if (j < paramArrayOfInt2.length - 1) {
        m = paramArrayOfInt2[(j + 1)];
      } else {
        m = Integer.MAX_VALUE;
      }
      if (n < i1)
      {
        if (i2 > i1)
        {
          if (i2 > m)
          {
            j += 2;
            n = i1;
            i1 = j;
          }
          else
          {
            m = i + 2;
            n = i1;
            i1 = j;
            break label230;
          }
        }
        else
        {
          m = i + 2;
          break label216;
        }
      }
      else
      {
        if (m <= n) {
          break label210;
        }
        if (m > i2)
        {
          m = i + 2;
          i1 = j;
          break label230;
        }
        i1 = j + 2;
      }
      int i2 = m;
      m = i;
      break label230;
      label210:
      j += 2;
      m = i;
      label216:
      i2 = Integer.MAX_VALUE;
      n = Integer.MIN_VALUE;
      i1 = j;
      label230:
      i = m;
      j = i1;
      if (n != Integer.MIN_VALUE)
      {
        i = k + 1;
        arrayOfInt[k] = n;
        if (i2 == Integer.MAX_VALUE) {
          break;
        }
        k = i + 1;
        arrayOfInt[i] = i2;
        i = m;
        j = i1;
      }
    }
    int m = i;
    label287:
    return Arrays.copyOf(arrayOfInt, m);
  }
  
  public static Object invokeMethodQuietly(Object paramObject, Method paramMethod, Object... paramVarArgs)
  {
    try
    {
      paramObject = paramMethod.invoke(paramObject, paramVarArgs);
      return paramObject;
    }
    catch (IllegalAccessException|InvocationTargetException paramObject) {}
    return null;
  }
  
  public static boolean isAutoAppLinkSetup()
  {
    try
    {
      Intent localIntent = new android/content/Intent;
      localIntent.<init>("android.intent.action.VIEW");
      localIntent.setData(Uri.parse(String.format("fb%s://applinks", new Object[] { FacebookSdk.getApplicationId() })));
      Object localObject1 = FacebookSdk.getApplicationContext();
      Object localObject2 = ((Context)localObject1).getPackageManager();
      localObject1 = ((Context)localObject1).getPackageName();
      localObject2 = ((PackageManager)localObject2).queryIntentActivities(localIntent, 65536).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        boolean bool = ((String)localObject1).equals(nextactivityInfo.packageName);
        if (bool) {
          return true;
        }
      }
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    return false;
  }
  
  public static boolean isAutofillAvailable(Context paramContext)
  {
    int i = Build.VERSION.SDK_INT;
    boolean bool1 = false;
    if (i < 26) {
      return false;
    }
    paramContext = (AutofillManager)paramContext.getSystemService(AutofillManager.class);
    boolean bool2 = bool1;
    if (paramContext != null)
    {
      bool2 = bool1;
      if (paramContext.isAutofillSupported())
      {
        bool2 = bool1;
        if (paramContext.isEnabled()) {
          bool2 = true;
        }
      }
    }
    return bool2;
  }
  
  public static boolean isChromeOS(Context paramContext)
  {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 27)
    {
      bool = paramContext.getPackageManager().hasSystemFeature("android.hardware.type.pc");
    }
    else
    {
      paramContext = Build.DEVICE;
      if ((paramContext != null) && (paramContext.matches(".+_cheets|cheets_.+"))) {
        bool = true;
      } else {
        bool = false;
      }
    }
    return bool;
  }
  
  public static boolean isContentUri(Uri paramUri)
  {
    boolean bool;
    if ((paramUri != null) && ("content".equalsIgnoreCase(paramUri.getScheme()))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean isCurrentAccessToken(AccessToken paramAccessToken)
  {
    boolean bool;
    if ((paramAccessToken != null) && (paramAccessToken.equals(AccessToken.getCurrentAccessToken()))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean isDataProcessingRestricted()
  {
    if (CrashShieldHandler.isObjectCrashing(Utility.class)) {
      return false;
    }
    for (;;)
    {
      try
      {
        localObject = getDataProcessingOptions();
        if (localObject == null) {
          return false;
        }
      }
      finally
      {
        Object localObject;
        int i;
        CrashShieldHandler.handleThrowable(localThrowable, Utility.class);
        return false;
      }
      try
      {
        localObject = ((JSONObject)localObject).getJSONArray("data_processing_options");
        i = 0;
        if (i < ((JSONArray)localObject).length())
        {
          boolean bool = ((JSONArray)localObject).getString(i).toLowerCase().equals("ldu");
          if (bool) {
            return true;
          }
          i++;
        }
      }
      catch (Exception localException) {}
    }
    return false;
  }
  
  public static boolean isFileUri(Uri paramUri)
  {
    boolean bool;
    if ((paramUri != null) && ("file".equalsIgnoreCase(paramUri.getScheme()))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean isNullOrEmpty(String paramString)
  {
    boolean bool;
    if ((paramString != null) && (paramString.length() != 0)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static <T> boolean isNullOrEmpty(Collection<T> paramCollection)
  {
    boolean bool;
    if ((paramCollection != null) && (paramCollection.size() != 0)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static <T> boolean isSubset(Collection<T> paramCollection1, Collection<T> paramCollection2)
  {
    boolean bool = false;
    if ((paramCollection2 != null) && (paramCollection2.size() != 0))
    {
      paramCollection2 = new HashSet(paramCollection2);
      paramCollection1 = paramCollection1.iterator();
      while (paramCollection1.hasNext()) {
        if (!paramCollection2.contains(paramCollection1.next())) {
          return false;
        }
      }
      return true;
    }
    if ((paramCollection1 == null) || (paramCollection1.size() == 0)) {
      bool = true;
    }
    return bool;
  }
  
  public static boolean isWebUri(Uri paramUri)
  {
    boolean bool;
    if ((paramUri != null) && (("http".equalsIgnoreCase(paramUri.getScheme())) || ("https".equalsIgnoreCase(paramUri.getScheme())) || ("fbstaging".equalsIgnoreCase(paramUri.getScheme())))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static Set<String> jsonArrayToSet(JSONArray paramJSONArray)
    throws JSONException
  {
    HashSet localHashSet = new HashSet();
    for (int i = 0; i < paramJSONArray.length(); i++) {
      localHashSet.add(paramJSONArray.getString(i));
    }
    return localHashSet;
  }
  
  public static List<String> jsonArrayToStringList(JSONArray paramJSONArray)
    throws JSONException
  {
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < paramJSONArray.length(); i++) {
      localArrayList.add(paramJSONArray.getString(i));
    }
    return localArrayList;
  }
  
  public static void logd(String paramString, Exception paramException)
  {
    if ((FacebookSdk.isDebugEnabled()) && (paramString != null) && (paramException != null))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramException.getClass().getSimpleName());
      localStringBuilder.append(": ");
      localStringBuilder.append(paramException.getMessage());
      Log.d(paramString, localStringBuilder.toString());
    }
  }
  
  public static void logd(String paramString1, String paramString2)
  {
    if ((FacebookSdk.isDebugEnabled()) && (paramString1 != null) && (paramString2 != null)) {
      Log.d(paramString1, paramString2);
    }
  }
  
  public static void logd(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if ((FacebookSdk.isDebugEnabled()) && (!isNullOrEmpty(paramString1))) {
      Log.d(paramString1, paramString2, paramThrowable);
    }
  }
  
  public static <T, K> List<K> map(List<T> paramList, Mapper<T, K> paramMapper)
  {
    Object localObject1 = null;
    if (paramList == null) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      Object localObject2 = paramMapper.apply(paramList.next());
      if (localObject2 != null) {
        localArrayList.add(localObject2);
      }
    }
    if (localArrayList.size() == 0) {
      paramList = (List<T>)localObject1;
    } else {
      paramList = localArrayList;
    }
    return paramList;
  }
  
  public static String mapToJsonStr(Map<String, String> paramMap)
  {
    if (paramMap.isEmpty()) {
      return "";
    }
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      paramMap = paramMap.entrySet().iterator();
      while (paramMap.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)paramMap.next();
        localJSONObject.put((String)localEntry.getKey(), localEntry.getValue());
      }
      paramMap = localJSONObject.toString();
      return paramMap;
    }
    catch (JSONException paramMap) {}
    return "";
  }
  
  public static String md5hash(String paramString)
  {
    return hashWithAlgorithm("MD5", paramString);
  }
  
  public static boolean mustFixWindowParamsForAutofill(Context paramContext)
  {
    return isAutofillAvailable(paramContext);
  }
  
  public static Bundle parseUrlQueryString(String paramString)
  {
    Bundle localBundle = new Bundle();
    if (!isNullOrEmpty(paramString))
    {
      paramString = paramString.split("&");
      int i = paramString.length;
      for (int j = 0; j < i; j++)
      {
        String[] arrayOfString = paramString[j].split("=");
        try
        {
          int k = arrayOfString.length;
          if (k == 2) {
            localBundle.putString(URLDecoder.decode(arrayOfString[0], "UTF-8"), URLDecoder.decode(arrayOfString[1], "UTF-8"));
          } else if (arrayOfString.length == 1) {
            localBundle.putString(URLDecoder.decode(arrayOfString[0], "UTF-8"), "");
          }
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException)
        {
          logd("FacebookSDK", localUnsupportedEncodingException);
        }
      }
    }
    return localBundle;
  }
  
  public static void putCommaSeparatedStringList(Bundle paramBundle, String paramString, List<String> paramList)
  {
    if (paramList != null)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        localStringBuilder.append((String)paramList.next());
        localStringBuilder.append(",");
      }
      if (localStringBuilder.length() > 0) {
        paramList = localStringBuilder.substring(0, localStringBuilder.length() - 1);
      } else {
        paramList = "";
      }
      paramBundle.putString(paramString, paramList);
    }
  }
  
  public static boolean putJSONValueInBundle(Bundle paramBundle, String paramString, Object paramObject)
  {
    if (paramObject == null)
    {
      paramBundle.remove(paramString);
    }
    else if ((paramObject instanceof Boolean))
    {
      paramBundle.putBoolean(paramString, ((Boolean)paramObject).booleanValue());
    }
    else if ((paramObject instanceof boolean[]))
    {
      paramBundle.putBooleanArray(paramString, (boolean[])paramObject);
    }
    else if ((paramObject instanceof Double))
    {
      paramBundle.putDouble(paramString, ((Double)paramObject).doubleValue());
    }
    else if ((paramObject instanceof double[]))
    {
      paramBundle.putDoubleArray(paramString, (double[])paramObject);
    }
    else if ((paramObject instanceof Integer))
    {
      paramBundle.putInt(paramString, ((Integer)paramObject).intValue());
    }
    else if ((paramObject instanceof int[]))
    {
      paramBundle.putIntArray(paramString, (int[])paramObject);
    }
    else if ((paramObject instanceof Long))
    {
      paramBundle.putLong(paramString, ((Long)paramObject).longValue());
    }
    else if ((paramObject instanceof long[]))
    {
      paramBundle.putLongArray(paramString, (long[])paramObject);
    }
    else if ((paramObject instanceof String))
    {
      paramBundle.putString(paramString, (String)paramObject);
    }
    else if ((paramObject instanceof JSONArray))
    {
      paramBundle.putString(paramString, paramObject.toString());
    }
    else
    {
      if (!(paramObject instanceof JSONObject)) {
        break label232;
      }
      paramBundle.putString(paramString, paramObject.toString());
    }
    return true;
    label232:
    return false;
  }
  
  public static void putNonEmptyString(Bundle paramBundle, String paramString1, String paramString2)
  {
    if (!isNullOrEmpty(paramString2)) {
      paramBundle.putString(paramString1, paramString2);
    }
  }
  
  public static void putUri(Bundle paramBundle, String paramString, Uri paramUri)
  {
    if (paramUri != null) {
      putNonEmptyString(paramBundle, paramString, paramUri.toString());
    }
  }
  
  /* Error */
  public static String readStreamToString(java.io.InputStream paramInputStream)
    throws IOException
  {
    // Byte code:
    //   0: new 325	java/io/BufferedInputStream
    //   3: astore_1
    //   4: aload_1
    //   5: aload_0
    //   6: invokespecial 328	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   9: new 1043	java/io/InputStreamReader
    //   12: astore_2
    //   13: aload_2
    //   14: aload_1
    //   15: invokespecial 1044	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   18: new 236	java/lang/StringBuilder
    //   21: astore_3
    //   22: aload_3
    //   23: invokespecial 237	java/lang/StringBuilder:<init>	()V
    //   26: sipush 2048
    //   29: newarray <illegal type>
    //   31: astore_0
    //   32: aload_2
    //   33: aload_0
    //   34: invokevirtual 1049	java/io/Reader:read	([C)I
    //   37: istore 4
    //   39: iload 4
    //   41: iconst_m1
    //   42: if_icmpeq +15 -> 57
    //   45: aload_3
    //   46: aload_0
    //   47: iconst_0
    //   48: iload 4
    //   50: invokevirtual 1052	java/lang/StringBuilder:append	([CII)Ljava/lang/StringBuilder;
    //   53: pop
    //   54: goto -22 -> 32
    //   57: aload_3
    //   58: invokevirtual 250	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   61: astore_0
    //   62: aload_1
    //   63: invokestatic 1054	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   66: aload_2
    //   67: invokestatic 1054	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   70: aload_0
    //   71: areturn
    //   72: astore_0
    //   73: goto +14 -> 87
    //   76: astore_0
    //   77: aconst_null
    //   78: astore_2
    //   79: goto +8 -> 87
    //   82: astore_0
    //   83: aconst_null
    //   84: astore_1
    //   85: aload_1
    //   86: astore_2
    //   87: aload_1
    //   88: invokestatic 1054	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   91: aload_2
    //   92: invokestatic 1054	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   95: aload_0
    //   96: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	97	0	paramInputStream	java.io.InputStream
    //   3	85	1	localBufferedInputStream	java.io.BufferedInputStream
    //   12	80	2	localObject	Object
    //   21	37	3	localStringBuilder	StringBuilder
    //   37	12	4	i	int
    // Exception table:
    //   from	to	target	type
    //   18	32	72	finally
    //   32	39	72	finally
    //   45	54	72	finally
    //   57	62	72	finally
    //   9	18	76	finally
    //   0	9	82	finally
  }
  
  public static Map<String, String> readStringMapFromParcel(Parcel paramParcel)
  {
    int i = paramParcel.readInt();
    if (i < 0) {
      return null;
    }
    HashMap localHashMap = new HashMap();
    for (int j = 0; j < i; j++) {
      localHashMap.put(paramParcel.readString(), paramParcel.readString());
    }
    return localHashMap;
  }
  
  private static void refreshAvailableExternalStorage()
  {
    try
    {
      if (externalStorageExists())
      {
        File localFile = Environment.getExternalStorageDirectory();
        StatFs localStatFs = new android/os/StatFs;
        localStatFs.<init>(localFile.getPath());
        availableExternalStorageGB = localStatFs.getAvailableBlocks() * localStatFs.getBlockSize();
      }
      availableExternalStorageGB = convertBytesToGB(availableExternalStorageGB);
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  private static int refreshBestGuessNumberOfCPUCores()
  {
    int i = numCPUCores;
    if (i > 0) {
      return i;
    }
    try
    {
      File localFile = new java/io/File;
      localFile.<init>("/sys/devices/system/cpu/");
      Object localObject = new com/facebook/internal/Utility$2;
      ((2)localObject).<init>();
      localObject = localFile.listFiles((FilenameFilter)localObject);
      if (localObject != null) {
        numCPUCores = localObject.length;
      }
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    if (numCPUCores <= 0) {
      numCPUCores = Math.max(Runtime.getRuntime().availableProcessors(), 1);
    }
    return numCPUCores;
  }
  
  private static void refreshCarrierName(Context paramContext)
  {
    if (carrierName.equals("NoCarrier")) {}
    try
    {
      carrierName = ((TelephonyManager)paramContext.getSystemService("phone")).getNetworkOperatorName();
      return;
    }
    catch (Exception paramContext)
    {
      for (;;) {}
    }
  }
  
  private static void refreshPeriodicExtendedDeviceInfo(Context paramContext)
  {
    if ((timestampOfLastCheck == -1L) || (System.currentTimeMillis() - timestampOfLastCheck >= 1800000L))
    {
      timestampOfLastCheck = System.currentTimeMillis();
      refreshTimezone();
      refreshCarrierName(paramContext);
      refreshTotalExternalStorage();
      refreshAvailableExternalStorage();
    }
  }
  
  private static void refreshTimezone()
  {
    try
    {
      TimeZone localTimeZone = TimeZone.getDefault();
      Date localDate = new java/util/Date;
      localDate.<init>();
      deviceTimezoneAbbreviation = localTimeZone.getDisplayName(localTimeZone.inDaylightTime(localDate), 0);
      deviceTimeZoneName = localTimeZone.getID();
      return;
    }
    catch (AssertionError|Exception localAssertionError)
    {
      for (;;) {}
    }
  }
  
  private static void refreshTotalExternalStorage()
  {
    try
    {
      if (externalStorageExists())
      {
        File localFile = Environment.getExternalStorageDirectory();
        StatFs localStatFs = new android/os/StatFs;
        localStatFs.<init>(localFile.getPath());
        totalExternalStorageGB = localStatFs.getBlockCount() * localStatFs.getBlockSize();
      }
      totalExternalStorageGB = convertBytesToGB(totalExternalStorageGB);
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public static void runOnNonUiThread(Runnable paramRunnable)
  {
    try
    {
      FacebookSdk.getExecutor().execute(paramRunnable);
      return;
    }
    catch (Exception paramRunnable)
    {
      for (;;) {}
    }
  }
  
  public static String safeGetStringFromResponse(JSONObject paramJSONObject, String paramString)
  {
    String str = "";
    if (paramJSONObject != null) {
      str = paramJSONObject.optString(paramString, "");
    }
    return str;
  }
  
  public static void setAppEventAttributionParameters(JSONObject paramJSONObject, AttributionIdentifiers paramAttributionIdentifiers, String paramString, boolean paramBoolean)
    throws JSONException
  {
    paramJSONObject.put("anon_id", paramString);
    paramJSONObject.put("application_tracking_enabled", paramBoolean ^ true);
    paramJSONObject.put("advertiser_id_collection_enabled", FacebookSdk.getAdvertiserIDCollectionEnabled());
    if (paramAttributionIdentifiers != null)
    {
      if (paramAttributionIdentifiers.getAttributionId() != null) {
        paramJSONObject.put("attribution", paramAttributionIdentifiers.getAttributionId());
      }
      if (paramAttributionIdentifiers.getAndroidAdvertiserId() != null)
      {
        paramJSONObject.put("advertiser_id", paramAttributionIdentifiers.getAndroidAdvertiserId());
        paramJSONObject.put("advertiser_tracking_enabled", paramAttributionIdentifiers.isTrackingLimited() ^ true);
      }
      if (!paramAttributionIdentifiers.isTrackingLimited())
      {
        paramString = UserDataStore.getAllHashedUserData();
        if (!paramString.isEmpty()) {
          paramJSONObject.put("ud", paramString);
        }
      }
      if (paramAttributionIdentifiers.getAndroidInstallerPackage() != null) {
        paramJSONObject.put("installer_package", paramAttributionIdentifiers.getAndroidInstallerPackage());
      }
    }
  }
  
  public static void setAppEventExtendedDeviceInfoParameters(JSONObject paramJSONObject, Context paramContext)
    throws JSONException
  {
    JSONArray localJSONArray = new JSONArray();
    localJSONArray.put("a2");
    refreshPeriodicExtendedDeviceInfo(paramContext);
    Object localObject1 = paramContext.getPackageName();
    int i = 0;
    int j = 0;
    int k = -1;
    int m = k;
    Object localObject3;
    try
    {
      Object localObject2 = paramContext.getPackageManager().getPackageInfo((String)localObject1, 0);
      m = k;
      k = versionCode;
      m = k;
      localObject2 = versionName;
      m = k;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      localObject3 = "";
    }
    localJSONArray.put(localObject1);
    localJSONArray.put(m);
    localJSONArray.put(localObject3);
    localJSONArray.put(Build.VERSION.RELEASE);
    localJSONArray.put(Build.MODEL);
    Object localObject4;
    try
    {
      localObject3 = getResourcesgetConfigurationlocale;
    }
    catch (Exception localException)
    {
      localObject4 = Locale.getDefault();
    }
    localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append(((Locale)localObject4).getLanguage());
    ((StringBuilder)localObject1).append("_");
    ((StringBuilder)localObject1).append(((Locale)localObject4).getCountry());
    localJSONArray.put(((StringBuilder)localObject1).toString());
    localJSONArray.put(deviceTimezoneAbbreviation);
    localJSONArray.put(carrierName);
    double d = 0.0D;
    try
    {
      paramContext = (WindowManager)paramContext.getSystemService("window");
      if (paramContext != null)
      {
        localObject4 = paramContext.getDefaultDisplay();
        paramContext = new android/util/DisplayMetrics;
        paramContext.<init>();
        ((Display)localObject4).getMetrics(paramContext);
        n = widthPixels;
        m = i;
      }
    }
    catch (Exception paramContext)
    {
      int n;
      float f;
      label277:
      for (;;) {}
    }
    try
    {
      k = heightPixels;
      m = k;
      f = density;
      d = f;
      m = k;
    }
    catch (Exception paramContext)
    {
      break label277;
    }
    k = n;
    break label291;
    m = 0;
    k = j;
    label291:
    localJSONArray.put(k);
    localJSONArray.put(m);
    localJSONArray.put(new DecimalFormat("#.##").format(d));
    localJSONArray.put(refreshBestGuessNumberOfCPUCores());
    localJSONArray.put(totalExternalStorageGB);
    localJSONArray.put(availableExternalStorageGB);
    localJSONArray.put(deviceTimeZoneName);
    paramJSONObject.put("extinfo", localJSONArray.toString());
  }
  
  public static String sha1hash(String paramString)
  {
    return hashWithAlgorithm("SHA-1", paramString);
  }
  
  public static String sha1hash(byte[] paramArrayOfByte)
  {
    return hashWithAlgorithm("SHA-1", paramArrayOfByte);
  }
  
  @Nullable
  public static String sha256hash(@Nullable String paramString)
  {
    if (paramString == null) {
      return null;
    }
    return hashWithAlgorithm("SHA-256", paramString);
  }
  
  @Nullable
  public static String sha256hash(@Nullable byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    return hashWithAlgorithm("SHA-256", paramArrayOfByte);
  }
  
  public static boolean stringsEqualOrEmpty(String paramString1, String paramString2)
  {
    boolean bool1 = TextUtils.isEmpty(paramString1);
    boolean bool2 = TextUtils.isEmpty(paramString2);
    if ((bool1) && (bool2)) {
      return true;
    }
    if ((!bool1) && (!bool2)) {
      return paramString1.equals(paramString2);
    }
    return false;
  }
  
  public static JSONArray tryGetJSONArrayFromResponse(JSONObject paramJSONObject, String paramString)
  {
    if (paramJSONObject != null) {
      paramJSONObject = paramJSONObject.optJSONArray(paramString);
    } else {
      paramJSONObject = null;
    }
    return paramJSONObject;
  }
  
  public static JSONObject tryGetJSONObjectFromResponse(JSONObject paramJSONObject, String paramString)
  {
    if (paramJSONObject != null) {
      paramJSONObject = paramJSONObject.optJSONObject(paramString);
    } else {
      paramJSONObject = null;
    }
    return paramJSONObject;
  }
  
  public static <T> Collection<T> unmodifiableCollection(T... paramVarArgs)
  {
    return Collections.unmodifiableCollection(Arrays.asList(paramVarArgs));
  }
  
  public static void writeStringMapToParcel(Parcel paramParcel, Map<String, String> paramMap)
  {
    if (paramMap == null)
    {
      paramParcel.writeInt(-1);
    }
    else
    {
      paramParcel.writeInt(paramMap.size());
      Iterator localIterator = paramMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        paramMap = (Map.Entry)localIterator.next();
        paramParcel.writeString((String)paramMap.getKey());
        paramParcel.writeString((String)paramMap.getValue());
      }
    }
  }
  
  public static abstract interface GraphMeRequestWithCacheCallback
  {
    public abstract void onFailure(FacebookException paramFacebookException);
    
    public abstract void onSuccess(JSONObject paramJSONObject);
  }
  
  public static abstract interface Mapper<T, K>
  {
    public abstract K apply(T paramT);
  }
  
  public static class PermissionsLists
  {
    public List<String> declinedPermissions;
    public List<String> expiredPermissions;
    public List<String> grantedPermissions;
    
    public PermissionsLists(List<String> paramList1, List<String> paramList2, List<String> paramList3)
    {
      grantedPermissions = paramList1;
      declinedPermissions = paramList2;
      expiredPermissions = paramList3;
    }
    
    public List<String> getDeclinedPermissions()
    {
      return declinedPermissions;
    }
    
    public List<String> getExpiredPermissions()
    {
      return expiredPermissions;
    }
    
    public List<String> getGrantedPermissions()
    {
      return grantedPermissions;
    }
  }
  
  public static abstract interface Predicate<T>
  {
    public abstract boolean apply(T paramT);
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.Utility
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */