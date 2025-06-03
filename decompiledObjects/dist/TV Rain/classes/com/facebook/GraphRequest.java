package com.facebook;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.location.Location;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.AsyncTask;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.InternalSettings;
import com.facebook.internal.Logger;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import z2;

public class GraphRequest
{
  private static final String ACCEPT_LANGUAGE_HEADER = "Accept-Language";
  public static final String ACCESS_TOKEN_PARAM = "access_token";
  private static final String ATTACHED_FILES_PARAM = "attached_files";
  private static final String ATTACHMENT_FILENAME_PREFIX = "file";
  private static final String BATCH_APP_ID_PARAM = "batch_app_id";
  private static final String BATCH_BODY_PARAM = "body";
  private static final String BATCH_ENTRY_DEPENDS_ON_PARAM = "depends_on";
  private static final String BATCH_ENTRY_NAME_PARAM = "name";
  private static final String BATCH_ENTRY_OMIT_RESPONSE_ON_SUCCESS_PARAM = "omit_response_on_success";
  private static final String BATCH_METHOD_PARAM = "method";
  private static final String BATCH_PARAM = "batch";
  private static final String BATCH_RELATIVE_URL_PARAM = "relative_url";
  private static final String CAPTION_PARAM = "caption";
  private static final String CONTENT_ENCODING_HEADER = "Content-Encoding";
  private static final String CONTENT_TYPE_HEADER = "Content-Type";
  private static final String DEBUG_KEY = "__debug__";
  private static final String DEBUG_MESSAGES_KEY = "messages";
  private static final String DEBUG_MESSAGE_KEY = "message";
  private static final String DEBUG_MESSAGE_LINK_KEY = "link";
  private static final String DEBUG_MESSAGE_TYPE_KEY = "type";
  private static final String DEBUG_PARAM = "debug";
  private static final String DEBUG_SEVERITY_INFO = "info";
  private static final String DEBUG_SEVERITY_WARNING = "warning";
  public static final String FIELDS_PARAM = "fields";
  private static final String FORMAT_JSON = "json";
  private static final String FORMAT_PARAM = "format";
  private static final String GRAPH_PATH_FORMAT = "%s/%s";
  private static final String ISO_8601_FORMAT_STRING = "yyyy-MM-dd'T'HH:mm:ssZ";
  public static final int MAXIMUM_BATCH_SIZE = 50;
  private static final String ME = "me";
  private static final String MIME_BOUNDARY;
  private static final String MY_FRIENDS = "me/friends";
  private static final String MY_PHOTOS = "me/photos";
  private static final String PICTURE_PARAM = "picture";
  private static final String SDK_ANDROID = "android";
  private static final String SDK_PARAM = "sdk";
  private static final String SEARCH = "search";
  public static final String TAG = "GraphRequest";
  private static final String USER_AGENT_BASE = "FBAndroidSDK";
  private static final String USER_AGENT_HEADER = "User-Agent";
  private static final String VIDEOS_SUFFIX = "/videos";
  private static String defaultBatchApplicationId;
  private static volatile String userAgent;
  private static Pattern versionPattern = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
  @Nullable
  private AccessToken accessToken;
  private String batchEntryDependsOn;
  private String batchEntryName;
  private boolean batchEntryOmitResultOnSuccess = true;
  private Callback callback;
  private JSONObject graphObject;
  private String graphPath;
  private HttpMethod httpMethod;
  private String overriddenURL;
  private Bundle parameters;
  private boolean skipClientToken = false;
  private Object tag;
  private String version;
  
  static
  {
    char[] arrayOfChar = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    StringBuilder localStringBuilder = new StringBuilder();
    SecureRandom localSecureRandom = new SecureRandom();
    int i = localSecureRandom.nextInt(11);
    for (int j = 0; j < i + 30; j++) {
      localStringBuilder.append(arrayOfChar[localSecureRandom.nextInt(arrayOfChar.length)]);
    }
    MIME_BOUNDARY = localStringBuilder.toString();
  }
  
  public GraphRequest()
  {
    this(null, null, null, null, null);
  }
  
  public GraphRequest(@Nullable AccessToken paramAccessToken, String paramString)
  {
    this(paramAccessToken, paramString, null, null, null);
  }
  
  public GraphRequest(@Nullable AccessToken paramAccessToken, String paramString, Bundle paramBundle, HttpMethod paramHttpMethod)
  {
    this(paramAccessToken, paramString, paramBundle, paramHttpMethod, null);
  }
  
  public GraphRequest(@Nullable AccessToken paramAccessToken, String paramString, Bundle paramBundle, HttpMethod paramHttpMethod, Callback paramCallback)
  {
    this(paramAccessToken, paramString, paramBundle, paramHttpMethod, paramCallback, null);
  }
  
  public GraphRequest(@Nullable AccessToken paramAccessToken, String paramString1, Bundle paramBundle, HttpMethod paramHttpMethod, Callback paramCallback, String paramString2)
  {
    accessToken = paramAccessToken;
    graphPath = paramString1;
    version = paramString2;
    setCallback(paramCallback);
    setHttpMethod(paramHttpMethod);
    if (paramBundle != null) {
      parameters = new Bundle(paramBundle);
    } else {
      parameters = new Bundle();
    }
    if (version == null) {
      version = FacebookSdk.getGraphApiVersion();
    }
  }
  
  public GraphRequest(@Nullable AccessToken paramAccessToken, URL paramURL)
  {
    accessToken = paramAccessToken;
    overriddenURL = paramURL.toString();
    setHttpMethod(HttpMethod.GET);
    parameters = new Bundle();
  }
  
  private void addCommonParameters()
  {
    String str1;
    if (accessToken != null)
    {
      if (!parameters.containsKey("access_token"))
      {
        str1 = accessToken.getToken();
        Logger.registerAccessToken(str1);
        parameters.putString("access_token", str1);
      }
    }
    else if ((!skipClientToken) && (!parameters.containsKey("access_token")))
    {
      String str2 = FacebookSdk.getApplicationId();
      str1 = FacebookSdk.getClientToken();
      if ((!Utility.isNullOrEmpty(str2)) && (!Utility.isNullOrEmpty(str1)))
      {
        str1 = z2.p(str2, "|", str1);
        parameters.putString("access_token", str1);
      }
      else
      {
        Utility.logd(TAG, "Warning: Request without access token missing application ID or client token.");
      }
    }
    parameters.putString("sdk", "android");
    parameters.putString("format", "json");
    if (FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.GRAPH_API_DEBUG_INFO)) {
      parameters.putString("debug", "info");
    } else if (FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.GRAPH_API_DEBUG_WARNING)) {
      parameters.putString("debug", "warning");
    }
  }
  
  private String appendParametersToBaseUrl(String paramString, Boolean paramBoolean)
  {
    if ((!paramBoolean.booleanValue()) && (httpMethod == HttpMethod.POST)) {
      return paramString;
    }
    Uri.Builder localBuilder = Uri.parse(paramString).buildUpon();
    Iterator localIterator = parameters.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      paramBoolean = parameters.get(str);
      paramString = paramBoolean;
      if (paramBoolean == null) {
        paramString = "";
      }
      if (isSupportedParameterType(paramString)) {
        localBuilder.appendQueryParameter(str, parameterToString(paramString).toString());
      } else if (httpMethod == HttpMethod.GET) {
        throw new IllegalArgumentException(String.format(Locale.US, "Unsupported parameter type for GET request: %s", new Object[] { paramString.getClass().getSimpleName() }));
      }
    }
    return localBuilder.toString();
  }
  
  private static HttpURLConnection createConnection(URL paramURL)
    throws IOException
  {
    paramURL = (HttpURLConnection)paramURL.openConnection();
    paramURL.setRequestProperty("User-Agent", getUserAgent());
    paramURL.setRequestProperty("Accept-Language", Locale.getDefault().toString());
    paramURL.setChunkedStreamingMode(0);
    return paramURL;
  }
  
  public static GraphResponse executeAndWait(GraphRequest paramGraphRequest)
  {
    paramGraphRequest = executeBatchAndWait(new GraphRequest[] { paramGraphRequest });
    if ((paramGraphRequest != null) && (paramGraphRequest.size() == 1)) {
      return (GraphResponse)paramGraphRequest.get(0);
    }
    throw new FacebookException("invalid state: expected a single response");
  }
  
  /* Error */
  public static List<GraphResponse> executeBatchAndWait(GraphRequestBatch paramGraphRequestBatch)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc_w 493
    //   4: invokestatic 499	com/facebook/internal/Validate:notEmptyAndContainsNoNulls	(Ljava/util/Collection;Ljava/lang/String;)V
    //   7: aconst_null
    //   8: astore_1
    //   9: aload_1
    //   10: astore_2
    //   11: aload_0
    //   12: invokestatic 503	com/facebook/GraphRequest:toHttpConnection	(Lcom/facebook/GraphRequestBatch;)Ljava/net/HttpURLConnection;
    //   15: astore_3
    //   16: aload_3
    //   17: astore_2
    //   18: aload_3
    //   19: aload_0
    //   20: invokestatic 507	com/facebook/GraphRequest:executeConnectionAndWait	(Ljava/net/HttpURLConnection;Lcom/facebook/GraphRequestBatch;)Ljava/util/List;
    //   23: astore_0
    //   24: aload_3
    //   25: invokestatic 511	com/facebook/internal/Utility:disconnectQuietly	(Ljava/net/URLConnection;)V
    //   28: aload_0
    //   29: areturn
    //   30: astore_0
    //   31: goto +51 -> 82
    //   34: astore 4
    //   36: aload_1
    //   37: astore_2
    //   38: aload_0
    //   39: invokevirtual 517	com/facebook/GraphRequestBatch:getRequests	()Ljava/util/List;
    //   42: astore_3
    //   43: aload_1
    //   44: astore_2
    //   45: new 485	com/facebook/FacebookException
    //   48: astore 5
    //   50: aload_1
    //   51: astore_2
    //   52: aload 5
    //   54: aload 4
    //   56: invokespecial 520	com/facebook/FacebookException:<init>	(Ljava/lang/Throwable;)V
    //   59: aload_1
    //   60: astore_2
    //   61: aload_3
    //   62: aconst_null
    //   63: aload 5
    //   65: invokestatic 524	com/facebook/GraphResponse:constructErrorResponses	(Ljava/util/List;Ljava/net/HttpURLConnection;Lcom/facebook/FacebookException;)Ljava/util/List;
    //   68: astore_3
    //   69: aload_1
    //   70: astore_2
    //   71: aload_0
    //   72: aload_3
    //   73: invokestatic 528	com/facebook/GraphRequest:runCallbacks	(Lcom/facebook/GraphRequestBatch;Ljava/util/List;)V
    //   76: aconst_null
    //   77: invokestatic 511	com/facebook/internal/Utility:disconnectQuietly	(Ljava/net/URLConnection;)V
    //   80: aload_3
    //   81: areturn
    //   82: aload_2
    //   83: invokestatic 511	com/facebook/internal/Utility:disconnectQuietly	(Ljava/net/URLConnection;)V
    //   86: aload_0
    //   87: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	88	0	paramGraphRequestBatch	GraphRequestBatch
    //   8	62	1	localObject1	Object
    //   10	73	2	localObject2	Object
    //   15	66	3	localObject3	Object
    //   34	21	4	localException	Exception
    //   48	16	5	localFacebookException	FacebookException
    // Exception table:
    //   from	to	target	type
    //   11	16	30	finally
    //   18	24	30	finally
    //   38	43	30	finally
    //   45	50	30	finally
    //   52	59	30	finally
    //   61	69	30	finally
    //   71	76	30	finally
    //   11	16	34	java/lang/Exception
  }
  
  public static List<GraphResponse> executeBatchAndWait(Collection<GraphRequest> paramCollection)
  {
    return executeBatchAndWait(new GraphRequestBatch(paramCollection));
  }
  
  public static List<GraphResponse> executeBatchAndWait(GraphRequest... paramVarArgs)
  {
    Validate.notNull(paramVarArgs, "requests");
    return executeBatchAndWait(Arrays.asList(paramVarArgs));
  }
  
  public static GraphRequestAsyncTask executeBatchAsync(GraphRequestBatch paramGraphRequestBatch)
  {
    Validate.notEmptyAndContainsNoNulls(paramGraphRequestBatch, "requests");
    paramGraphRequestBatch = new GraphRequestAsyncTask(paramGraphRequestBatch);
    paramGraphRequestBatch.executeOnExecutor(FacebookSdk.getExecutor(), new Void[0]);
    return paramGraphRequestBatch;
  }
  
  public static GraphRequestAsyncTask executeBatchAsync(Collection<GraphRequest> paramCollection)
  {
    return executeBatchAsync(new GraphRequestBatch(paramCollection));
  }
  
  public static GraphRequestAsyncTask executeBatchAsync(GraphRequest... paramVarArgs)
  {
    Validate.notNull(paramVarArgs, "requests");
    return executeBatchAsync(Arrays.asList(paramVarArgs));
  }
  
  public static List<GraphResponse> executeConnectionAndWait(HttpURLConnection paramHttpURLConnection, GraphRequestBatch paramGraphRequestBatch)
  {
    List localList = GraphResponse.fromHttpConnection(paramHttpURLConnection, paramGraphRequestBatch);
    Utility.disconnectQuietly(paramHttpURLConnection);
    int i = paramGraphRequestBatch.size();
    if (i == localList.size())
    {
      runCallbacks(paramGraphRequestBatch, localList);
      AccessTokenManager.getInstance().extendAccessTokenIfNeeded();
      return localList;
    }
    throw new FacebookException(String.format(Locale.US, "Received %d responses while expecting %d", new Object[] { Integer.valueOf(localList.size()), Integer.valueOf(i) }));
  }
  
  public static List<GraphResponse> executeConnectionAndWait(HttpURLConnection paramHttpURLConnection, Collection<GraphRequest> paramCollection)
  {
    return executeConnectionAndWait(paramHttpURLConnection, new GraphRequestBatch(paramCollection));
  }
  
  public static GraphRequestAsyncTask executeConnectionAsync(Handler paramHandler, HttpURLConnection paramHttpURLConnection, GraphRequestBatch paramGraphRequestBatch)
  {
    Validate.notNull(paramHttpURLConnection, "connection");
    paramHttpURLConnection = new GraphRequestAsyncTask(paramHttpURLConnection, paramGraphRequestBatch);
    paramGraphRequestBatch.setCallbackHandler(paramHandler);
    paramHttpURLConnection.executeOnExecutor(FacebookSdk.getExecutor(), new Void[0]);
    return paramHttpURLConnection;
  }
  
  public static GraphRequestAsyncTask executeConnectionAsync(HttpURLConnection paramHttpURLConnection, GraphRequestBatch paramGraphRequestBatch)
  {
    return executeConnectionAsync(null, paramHttpURLConnection, paramGraphRequestBatch);
  }
  
  private static String getBatchAppId(GraphRequestBatch paramGraphRequestBatch)
  {
    if (!Utility.isNullOrEmpty(paramGraphRequestBatch.getBatchApplicationId())) {
      return paramGraphRequestBatch.getBatchApplicationId();
    }
    paramGraphRequestBatch = paramGraphRequestBatch.iterator();
    while (paramGraphRequestBatch.hasNext())
    {
      Object localObject = nextaccessToken;
      if (localObject != null)
      {
        localObject = ((AccessToken)localObject).getApplicationId();
        if (localObject != null) {
          return (String)localObject;
        }
      }
    }
    if (!Utility.isNullOrEmpty(defaultBatchApplicationId)) {
      return defaultBatchApplicationId;
    }
    return FacebookSdk.getApplicationId();
  }
  
  public static final String getDefaultBatchApplicationId()
  {
    return defaultBatchApplicationId;
  }
  
  private static String getDefaultPhotoPathIfNull(String paramString)
  {
    String str = paramString;
    if (paramString == null) {
      str = "me/photos";
    }
    return str;
  }
  
  private String getGraphPathWithVersion()
  {
    if (versionPattern.matcher(graphPath).matches()) {
      return graphPath;
    }
    return String.format("%s/%s", new Object[] { version, graphPath });
  }
  
  private static String getMimeContentType()
  {
    return String.format("multipart/form-data; boundary=%s", new Object[] { MIME_BOUNDARY });
  }
  
  private static String getUserAgent()
  {
    if (userAgent == null)
    {
      userAgent = String.format("%s.%s", new Object[] { "FBAndroidSDK", "8.2.0" });
      String str = InternalSettings.getCustomUserAgent();
      if (!Utility.isNullOrEmpty(str)) {
        userAgent = String.format(Locale.ROOT, "%s/%s", new Object[] { userAgent, str });
      }
    }
    return userAgent;
  }
  
  private static boolean hasOnProgressCallbacks(GraphRequestBatch paramGraphRequestBatch)
  {
    Iterator localIterator = paramGraphRequestBatch.getCallbacks().iterator();
    while (localIterator.hasNext()) {
      if (((GraphRequestBatch.Callback)localIterator.next() instanceof GraphRequestBatch.OnProgressCallback)) {
        return true;
      }
    }
    paramGraphRequestBatch = paramGraphRequestBatch.iterator();
    while (paramGraphRequestBatch.hasNext()) {
      if ((((GraphRequest)paramGraphRequestBatch.next()).getCallback() instanceof OnProgressCallback)) {
        return true;
      }
    }
    return false;
  }
  
  private static boolean isGzipCompressible(GraphRequestBatch paramGraphRequestBatch)
  {
    GraphRequest localGraphRequest;
    String str;
    do
    {
      Iterator localIterator = paramGraphRequestBatch.iterator();
      while (!paramGraphRequestBatch.hasNext())
      {
        if (!localIterator.hasNext()) {
          break;
        }
        localGraphRequest = (GraphRequest)localIterator.next();
        paramGraphRequestBatch = parameters.keySet().iterator();
      }
      str = (String)paramGraphRequestBatch.next();
    } while (!isSupportedAttachmentType(parameters.get(str)));
    return false;
    return true;
  }
  
  private static boolean isMeRequest(String paramString)
  {
    Matcher localMatcher = versionPattern.matcher(paramString);
    if (localMatcher.matches()) {
      paramString = localMatcher.group(1);
    }
    return (paramString.startsWith("me/")) || (paramString.startsWith("/me/"));
  }
  
  private static boolean isSupportedAttachmentType(Object paramObject)
  {
    boolean bool;
    if ((!(paramObject instanceof Bitmap)) && (!(paramObject instanceof byte[])) && (!(paramObject instanceof Uri)) && (!(paramObject instanceof ParcelFileDescriptor)) && (!(paramObject instanceof ParcelableResourceWithMimeType))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  private static boolean isSupportedParameterType(Object paramObject)
  {
    boolean bool;
    if ((!(paramObject instanceof String)) && (!(paramObject instanceof Boolean)) && (!(paramObject instanceof Number)) && (!(paramObject instanceof Date))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static GraphRequest newCustomAudienceThirdPartyIdRequest(@Nullable AccessToken paramAccessToken, Context paramContext, Callback paramCallback)
  {
    return newCustomAudienceThirdPartyIdRequest(paramAccessToken, paramContext, null, paramCallback);
  }
  
  public static GraphRequest newCustomAudienceThirdPartyIdRequest(@Nullable AccessToken paramAccessToken, Context paramContext, String paramString, Callback paramCallback)
  {
    String str = paramString;
    if (paramString == null)
    {
      str = paramString;
      if (paramAccessToken != null) {
        str = paramAccessToken.getApplicationId();
      }
    }
    paramString = str;
    if (str == null) {
      paramString = Utility.getMetadataApplicationId(paramContext);
    }
    if (paramString != null)
    {
      str = z2.o(paramString, "/custom_audience_third_party_id");
      AttributionIdentifiers localAttributionIdentifiers = AttributionIdentifiers.getAttributionIdentifiers(paramContext);
      Bundle localBundle = new Bundle();
      if (paramAccessToken == null) {
        if (localAttributionIdentifiers != null)
        {
          if (localAttributionIdentifiers.getAttributionId() != null) {
            paramString = localAttributionIdentifiers.getAttributionId();
          } else {
            paramString = localAttributionIdentifiers.getAndroidAdvertiserId();
          }
          if (localAttributionIdentifiers.getAttributionId() != null) {
            localBundle.putString("udid", paramString);
          }
        }
        else
        {
          throw new FacebookException("There is no access token and attribution identifiers could not be retrieved");
        }
      }
      if ((FacebookSdk.getLimitEventAndDataUsage(paramContext)) || ((localAttributionIdentifiers != null) && (localAttributionIdentifiers.isTrackingLimited()))) {
        localBundle.putString("limit_event_usage", "1");
      }
      return new GraphRequest(paramAccessToken, str, localBundle, HttpMethod.GET, paramCallback);
    }
    throw new FacebookException("Facebook App ID cannot be determined");
  }
  
  public static GraphRequest newDeleteObjectRequest(@Nullable AccessToken paramAccessToken, String paramString, Callback paramCallback)
  {
    return new GraphRequest(paramAccessToken, paramString, null, HttpMethod.DELETE, paramCallback);
  }
  
  public static GraphRequest newGraphPathRequest(@Nullable AccessToken paramAccessToken, String paramString, Callback paramCallback)
  {
    return new GraphRequest(paramAccessToken, paramString, null, null, paramCallback);
  }
  
  public static GraphRequest newMeRequest(@Nullable AccessToken paramAccessToken, GraphJSONObjectCallback paramGraphJSONObjectCallback)
  {
    new GraphRequest(paramAccessToken, "me", null, null, new Callback()
    {
      public void onCompleted(GraphResponse paramAnonymousGraphResponse)
      {
        GraphRequest.GraphJSONObjectCallback localGraphJSONObjectCallback = val$callback;
        if (localGraphJSONObjectCallback != null) {
          localGraphJSONObjectCallback.onCompleted(paramAnonymousGraphResponse.getJSONObject(), paramAnonymousGraphResponse);
        }
      }
    });
  }
  
  public static GraphRequest newMyFriendsRequest(@Nullable AccessToken paramAccessToken, GraphJSONArrayCallback paramGraphJSONArrayCallback)
  {
    new GraphRequest(paramAccessToken, "me/friends", null, null, new Callback()
    {
      public void onCompleted(GraphResponse paramAnonymousGraphResponse)
      {
        if (val$callback != null)
        {
          Object localObject = paramAnonymousGraphResponse.getJSONObject();
          if (localObject != null) {
            localObject = ((JSONObject)localObject).optJSONArray("data");
          } else {
            localObject = null;
          }
          val$callback.onCompleted((JSONArray)localObject, paramAnonymousGraphResponse);
        }
      }
    });
  }
  
  public static GraphRequest newPlacesSearchRequest(@Nullable AccessToken paramAccessToken, Location paramLocation, int paramInt1, int paramInt2, String paramString, GraphJSONArrayCallback paramGraphJSONArrayCallback)
  {
    if ((paramLocation == null) && (Utility.isNullOrEmpty(paramString))) {
      throw new FacebookException("Either location or searchText must be specified.");
    }
    Bundle localBundle = new Bundle(5);
    localBundle.putString("type", "place");
    localBundle.putInt("limit", paramInt2);
    if (paramLocation != null)
    {
      localBundle.putString("center", String.format(Locale.US, "%f,%f", new Object[] { Double.valueOf(paramLocation.getLatitude()), Double.valueOf(paramLocation.getLongitude()) }));
      localBundle.putInt("distance", paramInt1);
    }
    if (!Utility.isNullOrEmpty(paramString)) {
      localBundle.putString("q", paramString);
    }
    paramLocation = new Callback()
    {
      public void onCompleted(GraphResponse paramAnonymousGraphResponse)
      {
        if (val$callback != null)
        {
          Object localObject = paramAnonymousGraphResponse.getJSONObject();
          if (localObject != null) {
            localObject = ((JSONObject)localObject).optJSONArray("data");
          } else {
            localObject = null;
          }
          val$callback.onCompleted((JSONArray)localObject, paramAnonymousGraphResponse);
        }
      }
    };
    return new GraphRequest(paramAccessToken, "search", localBundle, HttpMethod.GET, paramLocation);
  }
  
  public static GraphRequest newPostRequest(@Nullable AccessToken paramAccessToken, String paramString, JSONObject paramJSONObject, Callback paramCallback)
  {
    paramAccessToken = new GraphRequest(paramAccessToken, paramString, null, HttpMethod.POST, paramCallback);
    paramAccessToken.setGraphObject(paramJSONObject);
    return paramAccessToken;
  }
  
  public static GraphRequest newUploadPhotoRequest(@Nullable AccessToken paramAccessToken, String paramString1, Bitmap paramBitmap, String paramString2, Bundle paramBundle, Callback paramCallback)
  {
    paramString1 = getDefaultPhotoPathIfNull(paramString1);
    Bundle localBundle = new Bundle();
    if (paramBundle != null) {
      localBundle.putAll(paramBundle);
    }
    localBundle.putParcelable("picture", paramBitmap);
    if ((paramString2 != null) && (!paramString2.isEmpty())) {
      localBundle.putString("caption", paramString2);
    }
    return new GraphRequest(paramAccessToken, paramString1, localBundle, HttpMethod.POST, paramCallback);
  }
  
  public static GraphRequest newUploadPhotoRequest(@Nullable AccessToken paramAccessToken, String paramString1, Uri paramUri, String paramString2, Bundle paramBundle, Callback paramCallback)
    throws FileNotFoundException
  {
    String str = getDefaultPhotoPathIfNull(paramString1);
    if (Utility.isFileUri(paramUri)) {
      return newUploadPhotoRequest(paramAccessToken, str, new File(paramUri.getPath()), paramString2, paramBundle, paramCallback);
    }
    if (Utility.isContentUri(paramUri))
    {
      paramString1 = new Bundle();
      if (paramBundle != null) {
        paramString1.putAll(paramBundle);
      }
      paramString1.putParcelable("picture", paramUri);
      if ((paramString2 != null) && (!paramString2.isEmpty())) {
        paramString1.putString("caption", paramString2);
      }
      return new GraphRequest(paramAccessToken, str, paramString1, HttpMethod.POST, paramCallback);
    }
    throw new FacebookException("The photo Uri must be either a file:// or content:// Uri");
  }
  
  public static GraphRequest newUploadPhotoRequest(@Nullable AccessToken paramAccessToken, String paramString1, File paramFile, String paramString2, Bundle paramBundle, Callback paramCallback)
    throws FileNotFoundException
  {
    paramString1 = getDefaultPhotoPathIfNull(paramString1);
    ParcelFileDescriptor localParcelFileDescriptor = ParcelFileDescriptor.open(paramFile, 268435456);
    paramFile = new Bundle();
    if (paramBundle != null) {
      paramFile.putAll(paramBundle);
    }
    paramFile.putParcelable("picture", localParcelFileDescriptor);
    if ((paramString2 != null) && (!paramString2.isEmpty())) {
      paramFile.putString("caption", paramString2);
    }
    return new GraphRequest(paramAccessToken, paramString1, paramFile, HttpMethod.POST, paramCallback);
  }
  
  private static String parameterToString(Object paramObject)
  {
    if ((paramObject instanceof String)) {
      return (String)paramObject;
    }
    if ((!(paramObject instanceof Boolean)) && (!(paramObject instanceof Number)))
    {
      if ((paramObject instanceof Date)) {
        return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format(paramObject);
      }
      throw new IllegalArgumentException("Unsupported parameter type.");
    }
    return paramObject.toString();
  }
  
  private static void processGraphObject(JSONObject paramJSONObject, String paramString, KeyValueSerializer paramKeyValueSerializer)
    throws IOException
  {
    if (isMeRequest(paramString))
    {
      int i = paramString.indexOf(":");
      j = paramString.indexOf("?");
      if ((i > 3) && ((j == -1) || (i < j)))
      {
        j = 1;
        break label50;
      }
    }
    int j = 0;
    label50:
    Iterator localIterator = paramJSONObject.keys();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      paramString = paramJSONObject.opt(str);
      boolean bool;
      if ((j != 0) && (str.equalsIgnoreCase("image"))) {
        bool = true;
      } else {
        bool = false;
      }
      processGraphObjectProperty(str, paramString, paramKeyValueSerializer, bool);
    }
  }
  
  private static void processGraphObjectProperty(String paramString, Object paramObject, KeyValueSerializer paramKeyValueSerializer, boolean paramBoolean)
    throws IOException
  {
    Object localObject = paramObject.getClass();
    if (JSONObject.class.isAssignableFrom((Class)localObject))
    {
      localObject = (JSONObject)paramObject;
      if (paramBoolean)
      {
        paramObject = ((JSONObject)localObject).keys();
        while (((Iterator)paramObject).hasNext())
        {
          String str = (String)((Iterator)paramObject).next();
          processGraphObjectProperty(String.format("%s[%s]", new Object[] { paramString, str }), ((JSONObject)localObject).opt(str), paramKeyValueSerializer, paramBoolean);
        }
      }
      if (((JSONObject)localObject).has("id")) {
        processGraphObjectProperty(paramString, ((JSONObject)localObject).optString("id"), paramKeyValueSerializer, paramBoolean);
      } else if (((JSONObject)localObject).has("url")) {
        processGraphObjectProperty(paramString, ((JSONObject)localObject).optString("url"), paramKeyValueSerializer, paramBoolean);
      } else if (((JSONObject)localObject).has("fbsdk:create_object")) {
        processGraphObjectProperty(paramString, ((JSONObject)localObject).toString(), paramKeyValueSerializer, paramBoolean);
      }
    }
    else
    {
      if (JSONArray.class.isAssignableFrom((Class)localObject))
      {
        paramObject = (JSONArray)paramObject;
        int i = ((JSONArray)paramObject).length();
        for (int j = 0; j < i; j++) {
          processGraphObjectProperty(String.format(Locale.ROOT, "%s[%d]", new Object[] { paramString, Integer.valueOf(j) }), ((JSONArray)paramObject).opt(j), paramKeyValueSerializer, paramBoolean);
        }
      }
      if ((!String.class.isAssignableFrom((Class)localObject)) && (!Number.class.isAssignableFrom((Class)localObject)) && (!Boolean.class.isAssignableFrom((Class)localObject)))
      {
        if (Date.class.isAssignableFrom((Class)localObject))
        {
          paramObject = (Date)paramObject;
          paramKeyValueSerializer.writeString(paramString, new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date)paramObject));
        }
      }
      else {
        paramKeyValueSerializer.writeString(paramString, paramObject.toString());
      }
    }
  }
  
  private static void processRequest(GraphRequestBatch paramGraphRequestBatch, Logger paramLogger, int paramInt, URL paramURL, OutputStream paramOutputStream, boolean paramBoolean)
    throws IOException, JSONException
  {
    paramOutputStream = new Serializer(paramOutputStream, paramLogger, paramBoolean);
    if (paramInt == 1)
    {
      GraphRequest localGraphRequest = paramGraphRequestBatch.get(0);
      paramGraphRequestBatch = new HashMap();
      Iterator localIterator = parameters.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        Object localObject = parameters.get(str);
        if (isSupportedAttachmentType(localObject)) {
          paramGraphRequestBatch.put(str, new Attachment(localGraphRequest, localObject));
        }
      }
      if (paramLogger != null) {
        paramLogger.append("  Parameters:\n");
      }
      serializeParameters(parameters, paramOutputStream, localGraphRequest);
      if (paramLogger != null) {
        paramLogger.append("  Attachments:\n");
      }
      serializeAttachments(paramGraphRequestBatch, paramOutputStream);
      paramGraphRequestBatch = graphObject;
      if (paramGraphRequestBatch != null) {
        processGraphObject(paramGraphRequestBatch, paramURL.getPath(), paramOutputStream);
      }
    }
    else
    {
      paramURL = getBatchAppId(paramGraphRequestBatch);
      if (Utility.isNullOrEmpty(paramURL)) {
        break label228;
      }
      paramOutputStream.writeString("batch_app_id", paramURL);
      paramURL = new HashMap();
      serializeRequestsAsJSON(paramOutputStream, paramGraphRequestBatch, paramURL);
      if (paramLogger != null) {
        paramLogger.append("  Attachments:\n");
      }
      serializeAttachments(paramURL, paramOutputStream);
    }
    return;
    label228:
    throw new FacebookException("App ID was not specified at the request or Settings.");
  }
  
  public static void runCallbacks(final GraphRequestBatch paramGraphRequestBatch, List<GraphResponse> paramList)
  {
    int i = paramGraphRequestBatch.size();
    ArrayList localArrayList = new ArrayList();
    for (int j = 0; j < i; j++)
    {
      GraphRequest localGraphRequest = paramGraphRequestBatch.get(j);
      if (callback != null) {
        localArrayList.add(new Pair(callback, paramList.get(j)));
      }
    }
    if (localArrayList.size() > 0)
    {
      paramList = new Runnable()
      {
        public void run()
        {
          if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
          }
          try
          {
            Iterator localIterator = val$callbacks.iterator();
            while (localIterator.hasNext())
            {
              localObject = (Pair)localIterator.next();
              ((GraphRequest.Callback)first).onCompleted((GraphResponse)second);
            }
            Object localObject = paramGraphRequestBatch.getCallbacks().iterator();
            while (((Iterator)localObject).hasNext()) {
              ((GraphRequestBatch.Callback)((Iterator)localObject).next()).onBatchCompleted(paramGraphRequestBatch);
            }
            return;
          }
          finally
          {
            CrashShieldHandler.handleThrowable(localThrowable, this);
          }
        }
      };
      paramGraphRequestBatch = paramGraphRequestBatch.getCallbackHandler();
      if (paramGraphRequestBatch == null) {
        paramList.run();
      } else {
        paramGraphRequestBatch.post(paramList);
      }
    }
  }
  
  private static void serializeAttachments(Map<String, Attachment> paramMap, Serializer paramSerializer)
    throws IOException
  {
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Attachment localAttachment = (Attachment)paramMap.get(str);
      if (isSupportedAttachmentType(localAttachment.getValue())) {
        paramSerializer.writeObject(str, localAttachment.getValue(), localAttachment.getRequest());
      }
    }
  }
  
  private static void serializeParameters(Bundle paramBundle, Serializer paramSerializer, GraphRequest paramGraphRequest)
    throws IOException
  {
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject = paramBundle.get(str);
      if (isSupportedParameterType(localObject)) {
        paramSerializer.writeObject(str, localObject, paramGraphRequest);
      }
    }
  }
  
  private static void serializeRequestsAsJSON(Serializer paramSerializer, Collection<GraphRequest> paramCollection, Map<String, Attachment> paramMap)
    throws JSONException, IOException
  {
    JSONArray localJSONArray = new JSONArray();
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext()) {
      ((GraphRequest)localIterator.next()).serializeToBatch(localJSONArray, paramMap);
    }
    paramSerializer.writeRequestsAsJson("batch", localJSONArray, paramCollection);
  }
  
  private void serializeToBatch(JSONArray paramJSONArray, final Map<String, Attachment> paramMap)
    throws JSONException, IOException
  {
    JSONObject localJSONObject = new JSONObject();
    String str1 = batchEntryName;
    if (str1 != null)
    {
      localJSONObject.put("name", str1);
      localJSONObject.put("omit_response_on_success", batchEntryOmitResultOnSuccess);
    }
    str1 = batchEntryDependsOn;
    if (str1 != null) {
      localJSONObject.put("depends_on", str1);
    }
    str1 = getRelativeUrlForBatchedRequest();
    localJSONObject.put("relative_url", str1);
    localJSONObject.put("method", httpMethod);
    Object localObject1 = accessToken;
    if (localObject1 != null) {
      Logger.registerAccessToken(((AccessToken)localObject1).getToken());
    }
    localObject1 = new ArrayList();
    Iterator localIterator = parameters.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject2 = (String)localIterator.next();
      localObject2 = parameters.get((String)localObject2);
      if (isSupportedAttachmentType(localObject2))
      {
        String str2 = String.format(Locale.ROOT, "%s%d", new Object[] { "file", Integer.valueOf(paramMap.size()) });
        ((ArrayList)localObject1).add(str2);
        paramMap.put(str2, new Attachment(this, localObject2));
      }
    }
    if (!((ArrayList)localObject1).isEmpty()) {
      localJSONObject.put("attached_files", TextUtils.join(",", (Iterable)localObject1));
    }
    if (graphObject != null)
    {
      paramMap = new ArrayList();
      processGraphObject(graphObject, str1, new KeyValueSerializer()
      {
        public void writeString(String paramAnonymousString1, String paramAnonymousString2)
          throws IOException
        {
          paramMap.add(String.format(Locale.US, "%s=%s", new Object[] { paramAnonymousString1, URLEncoder.encode(paramAnonymousString2, "UTF-8") }));
        }
      });
      localJSONObject.put("body", TextUtils.join("&", paramMap));
    }
    paramJSONArray.put(localJSONObject);
  }
  
  /* Error */
  public static final void serializeToUrlConnection(GraphRequestBatch paramGraphRequestBatch, HttpURLConnection paramHttpURLConnection)
    throws IOException, JSONException
  {
    // Byte code:
    //   0: new 311	com/facebook/internal/Logger
    //   3: dup
    //   4: getstatic 1070	com/facebook/LoggingBehavior:REQUESTS	Lcom/facebook/LoggingBehavior;
    //   7: ldc_w 1072
    //   10: invokespecial 1075	com/facebook/internal/Logger:<init>	(Lcom/facebook/LoggingBehavior;Ljava/lang/String;)V
    //   13: astore_2
    //   14: aload_0
    //   15: invokevirtual 580	com/facebook/GraphRequestBatch:size	()I
    //   18: istore_3
    //   19: aload_0
    //   20: invokestatic 1077	com/facebook/GraphRequest:isGzipCompressible	(Lcom/facebook/GraphRequestBatch;)Z
    //   23: istore 4
    //   25: iconst_0
    //   26: istore 5
    //   28: iload_3
    //   29: iconst_1
    //   30: if_icmpne +16 -> 46
    //   33: aload_0
    //   34: iconst_0
    //   35: invokevirtual 927	com/facebook/GraphRequestBatch:get	(I)Lcom/facebook/GraphRequest;
    //   38: getfield 368	com/facebook/GraphRequest:httpMethod	Lcom/facebook/HttpMethod;
    //   41: astore 6
    //   43: goto +8 -> 51
    //   46: getstatic 371	com/facebook/HttpMethod:POST	Lcom/facebook/HttpMethod;
    //   49: astore 6
    //   51: aload_1
    //   52: aload 6
    //   54: invokevirtual 1081	java/lang/Enum:name	()Ljava/lang/String;
    //   57: invokevirtual 1084	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   60: aload_1
    //   61: iload 4
    //   63: invokestatic 1088	com/facebook/GraphRequest:setConnectionContentType	(Ljava/net/HttpURLConnection;Z)V
    //   66: aload_1
    //   67: invokevirtual 1092	java/net/URLConnection:getURL	()Ljava/net/URL;
    //   70: astore 7
    //   72: aload_2
    //   73: ldc_w 1094
    //   76: invokevirtual 941	com/facebook/internal/Logger:append	(Ljava/lang/String;)V
    //   79: aload_2
    //   80: ldc_w 1096
    //   83: aload_0
    //   84: invokevirtual 1099	com/facebook/GraphRequestBatch:getId	()Ljava/lang/String;
    //   87: invokevirtual 1103	com/facebook/internal/Logger:appendKeyValue	(Ljava/lang/String;Ljava/lang/Object;)V
    //   90: aload_2
    //   91: ldc_w 1105
    //   94: aload 7
    //   96: invokevirtual 1103	com/facebook/internal/Logger:appendKeyValue	(Ljava/lang/String;Ljava/lang/Object;)V
    //   99: aload_2
    //   100: ldc_w 1107
    //   103: aload_1
    //   104: invokevirtual 1110	java/net/HttpURLConnection:getRequestMethod	()Ljava/lang/String;
    //   107: invokevirtual 1103	com/facebook/internal/Logger:appendKeyValue	(Ljava/lang/String;Ljava/lang/Object;)V
    //   110: aload_2
    //   111: ldc -95
    //   113: aload_1
    //   114: ldc -95
    //   116: invokevirtual 1113	java/net/URLConnection:getRequestProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   119: invokevirtual 1103	com/facebook/internal/Logger:appendKeyValue	(Ljava/lang/String;Ljava/lang/Object;)V
    //   122: aload_2
    //   123: ldc 88
    //   125: aload_1
    //   126: ldc 88
    //   128: invokevirtual 1113	java/net/URLConnection:getRequestProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   131: invokevirtual 1103	com/facebook/internal/Logger:appendKeyValue	(Ljava/lang/String;Ljava/lang/Object;)V
    //   134: aload_1
    //   135: aload_0
    //   136: invokevirtual 1116	com/facebook/GraphRequestBatch:getTimeout	()I
    //   139: invokevirtual 1119	java/net/URLConnection:setConnectTimeout	(I)V
    //   142: aload_1
    //   143: aload_0
    //   144: invokevirtual 1116	com/facebook/GraphRequestBatch:getTimeout	()I
    //   147: invokevirtual 1122	java/net/URLConnection:setReadTimeout	(I)V
    //   150: aload 6
    //   152: getstatic 371	com/facebook/HttpMethod:POST	Lcom/facebook/HttpMethod;
    //   155: if_acmpne +6 -> 161
    //   158: iconst_1
    //   159: istore 5
    //   161: iload 5
    //   163: ifne +8 -> 171
    //   166: aload_2
    //   167: invokevirtual 1125	com/facebook/internal/Logger:log	()V
    //   170: return
    //   171: aload_1
    //   172: iconst_1
    //   173: invokevirtual 1129	java/net/URLConnection:setDoOutput	(Z)V
    //   176: aconst_null
    //   177: astore 8
    //   179: aload 8
    //   181: astore 6
    //   183: new 1131	java/io/BufferedOutputStream
    //   186: astore 9
    //   188: aload 8
    //   190: astore 6
    //   192: aload 9
    //   194: aload_1
    //   195: invokevirtual 1135	java/net/URLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   198: invokespecial 1138	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   201: iload 4
    //   203: ifeq +24 -> 227
    //   206: new 1140	java/util/zip/GZIPOutputStream
    //   209: astore_1
    //   210: aload_1
    //   211: aload 9
    //   213: invokespecial 1141	java/util/zip/GZIPOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   216: goto +14 -> 230
    //   219: astore_0
    //   220: aload 9
    //   222: astore 6
    //   224: goto +128 -> 352
    //   227: aload 9
    //   229: astore_1
    //   230: aload_1
    //   231: astore 6
    //   233: aload_0
    //   234: invokestatic 1143	com/facebook/GraphRequest:hasOnProgressCallbacks	(Lcom/facebook/GraphRequestBatch;)Z
    //   237: ifeq +87 -> 324
    //   240: aload_1
    //   241: astore 6
    //   243: new 1145	com/facebook/ProgressNoopOutputStream
    //   246: astore 9
    //   248: aload_1
    //   249: astore 6
    //   251: aload 9
    //   253: aload_0
    //   254: invokevirtual 986	com/facebook/GraphRequestBatch:getCallbackHandler	()Landroid/os/Handler;
    //   257: invokespecial 1147	com/facebook/ProgressNoopOutputStream:<init>	(Landroid/os/Handler;)V
    //   260: aload_1
    //   261: astore 6
    //   263: aload_0
    //   264: aconst_null
    //   265: iload_3
    //   266: aload 7
    //   268: aload 9
    //   270: iload 4
    //   272: invokestatic 1149	com/facebook/GraphRequest:processRequest	(Lcom/facebook/GraphRequestBatch;Lcom/facebook/internal/Logger;ILjava/net/URL;Ljava/io/OutputStream;Z)V
    //   275: aload_1
    //   276: astore 6
    //   278: aload 9
    //   280: invokevirtual 1152	com/facebook/ProgressNoopOutputStream:getMaxProgress	()I
    //   283: istore 5
    //   285: aload_1
    //   286: astore 6
    //   288: aload 9
    //   290: invokevirtual 1156	com/facebook/ProgressNoopOutputStream:getProgressMap	()Ljava/util/Map;
    //   293: astore 8
    //   295: aload_1
    //   296: astore 6
    //   298: new 1158	com/facebook/ProgressOutputStream
    //   301: astore 9
    //   303: aload_1
    //   304: astore 6
    //   306: aload 9
    //   308: aload_1
    //   309: aload_0
    //   310: aload 8
    //   312: iload 5
    //   314: i2l
    //   315: invokespecial 1161	com/facebook/ProgressOutputStream:<init>	(Ljava/io/OutputStream;Lcom/facebook/GraphRequestBatch;Ljava/util/Map;J)V
    //   318: aload 9
    //   320: astore_1
    //   321: goto +3 -> 324
    //   324: aload_0
    //   325: aload_2
    //   326: iload_3
    //   327: aload 7
    //   329: aload_1
    //   330: iload 4
    //   332: invokestatic 1149	com/facebook/GraphRequest:processRequest	(Lcom/facebook/GraphRequestBatch;Lcom/facebook/internal/Logger;ILjava/net/URL;Ljava/io/OutputStream;Z)V
    //   335: aload_1
    //   336: invokevirtual 1166	java/io/OutputStream:close	()V
    //   339: aload_2
    //   340: invokevirtual 1125	com/facebook/internal/Logger:log	()V
    //   343: return
    //   344: astore_0
    //   345: aload_1
    //   346: astore 6
    //   348: goto +4 -> 352
    //   351: astore_0
    //   352: aload 6
    //   354: ifnull +8 -> 362
    //   357: aload 6
    //   359: invokevirtual 1166	java/io/OutputStream:close	()V
    //   362: aload_0
    //   363: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	364	0	paramGraphRequestBatch	GraphRequestBatch
    //   0	364	1	paramHttpURLConnection	HttpURLConnection
    //   13	327	2	localLogger	Logger
    //   18	309	3	i	int
    //   23	308	4	bool	boolean
    //   26	287	5	j	int
    //   41	317	6	localObject1	Object
    //   70	258	7	localURL	URL
    //   177	134	8	localMap	Map
    //   186	133	9	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   206	216	219	finally
    //   324	335	344	finally
    //   183	188	351	finally
    //   192	201	351	finally
    //   233	240	351	finally
    //   243	248	351	finally
    //   251	260	351	finally
    //   263	275	351	finally
    //   278	285	351	finally
    //   288	295	351	finally
    //   298	303	351	finally
    //   306	318	351	finally
  }
  
  private static void setConnectionContentType(HttpURLConnection paramHttpURLConnection, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      paramHttpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
      paramHttpURLConnection.setRequestProperty("Content-Encoding", "gzip");
    }
    else
    {
      paramHttpURLConnection.setRequestProperty("Content-Type", getMimeContentType());
    }
  }
  
  public static final void setDefaultBatchApplicationId(String paramString)
  {
    defaultBatchApplicationId = paramString;
  }
  
  public static final boolean shouldWarnOnMissingFieldsParam(GraphRequest paramGraphRequest)
  {
    String str = paramGraphRequest.getVersion();
    boolean bool1 = Utility.isNullOrEmpty(str);
    boolean bool2 = true;
    if (bool1) {
      return true;
    }
    paramGraphRequest = str;
    if (str.startsWith("v")) {
      paramGraphRequest = str.substring(1);
    }
    paramGraphRequest = paramGraphRequest.split("\\.");
    if (paramGraphRequest.length >= 2)
    {
      bool1 = bool2;
      if (Integer.parseInt(paramGraphRequest[0]) > 2) {}
    }
    else if ((Integer.parseInt(paramGraphRequest[0]) >= 2) && (Integer.parseInt(paramGraphRequest[1]) >= 4))
    {
      bool1 = bool2;
    }
    else
    {
      bool1 = false;
    }
    return bool1;
  }
  
  public static HttpURLConnection toHttpConnection(GraphRequestBatch paramGraphRequestBatch)
  {
    validateFieldsParamForGetRequests(paramGraphRequestBatch);
    try
    {
      Object localObject1;
      if (paramGraphRequestBatch.size() == 1) {
        localObject1 = new URL(paramGraphRequestBatch.get(0).getUrlForSingleRequest());
      } else {
        localObject1 = new URL(ServerProtocol.getGraphUrlBase());
      }
      Object localObject2 = null;
      Object localObject3 = null;
      try
      {
        localObject1 = createConnection((URL)localObject1);
        localObject3 = localObject1;
        localObject2 = localObject1;
        serializeToUrlConnection(paramGraphRequestBatch, (HttpURLConnection)localObject1);
        return (HttpURLConnection)localObject1;
      }
      catch (JSONException paramGraphRequestBatch) {}catch (IOException paramGraphRequestBatch)
      {
        localObject3 = localObject2;
      }
      Utility.disconnectQuietly((URLConnection)localObject3);
      throw new FacebookException("could not construct request body", paramGraphRequestBatch);
    }
    catch (MalformedURLException paramGraphRequestBatch)
    {
      throw new FacebookException("could not construct URL for request", paramGraphRequestBatch);
    }
  }
  
  public static HttpURLConnection toHttpConnection(Collection<GraphRequest> paramCollection)
  {
    Validate.notEmptyAndContainsNoNulls(paramCollection, "requests");
    return toHttpConnection(new GraphRequestBatch(paramCollection));
  }
  
  public static HttpURLConnection toHttpConnection(GraphRequest... paramVarArgs)
  {
    return toHttpConnection(Arrays.asList(paramVarArgs));
  }
  
  public static final void validateFieldsParamForGetRequests(GraphRequestBatch paramGraphRequestBatch)
  {
    paramGraphRequestBatch = paramGraphRequestBatch.iterator();
    while (paramGraphRequestBatch.hasNext())
    {
      GraphRequest localGraphRequest = (GraphRequest)paramGraphRequestBatch.next();
      if ((HttpMethod.GET.equals(localGraphRequest.getHttpMethod())) && (shouldWarnOnMissingFieldsParam(localGraphRequest)))
      {
        Bundle localBundle = localGraphRequest.getParameters();
        if ((!localBundle.containsKey("fields")) || (Utility.isNullOrEmpty(localBundle.getString("fields")))) {
          Logger.log(LoggingBehavior.DEVELOPER_ERRORS, 5, "Request", "starting with Graph API v2.4, GET requests for /%s should contain an explicit \"fields\" parameter.", new Object[] { localGraphRequest.getGraphPath() });
        }
      }
    }
  }
  
  public final GraphResponse executeAndWait()
  {
    return executeAndWait(this);
  }
  
  public final GraphRequestAsyncTask executeAsync()
  {
    return executeBatchAsync(new GraphRequest[] { this });
  }
  
  @Nullable
  public final AccessToken getAccessToken()
  {
    return accessToken;
  }
  
  public final String getBatchEntryDependsOn()
  {
    return batchEntryDependsOn;
  }
  
  public final String getBatchEntryName()
  {
    return batchEntryName;
  }
  
  public final boolean getBatchEntryOmitResultOnSuccess()
  {
    return batchEntryOmitResultOnSuccess;
  }
  
  public final Callback getCallback()
  {
    return callback;
  }
  
  public final JSONObject getGraphObject()
  {
    return graphObject;
  }
  
  public final String getGraphPath()
  {
    return graphPath;
  }
  
  public final HttpMethod getHttpMethod()
  {
    return httpMethod;
  }
  
  public final Bundle getParameters()
  {
    return parameters;
  }
  
  public final String getRelativeUrlForBatchedRequest()
  {
    if (overriddenURL == null)
    {
      Object localObject = String.format("%s/%s", new Object[] { ServerProtocol.getGraphUrlBase(), getGraphPathWithVersion() });
      addCommonParameters();
      localObject = Uri.parse(appendParametersToBaseUrl((String)localObject, Boolean.TRUE));
      return String.format("%s?%s", new Object[] { ((Uri)localObject).getPath(), ((Uri)localObject).getQuery() });
    }
    throw new FacebookException("Can't override URL for a batch request");
  }
  
  public final Object getTag()
  {
    return tag;
  }
  
  public final String getUrlForSingleRequest()
  {
    String str = overriddenURL;
    if (str != null) {
      return str.toString();
    }
    if (getHttpMethod() == HttpMethod.POST)
    {
      str = graphPath;
      if ((str != null) && (str.endsWith("/videos")))
      {
        str = ServerProtocol.getGraphVideoUrlBase();
        break label53;
      }
    }
    str = ServerProtocol.getGraphUrlBase();
    label53:
    str = String.format("%s/%s", new Object[] { str, getGraphPathWithVersion() });
    addCommonParameters();
    return appendParametersToBaseUrl(str, Boolean.FALSE);
  }
  
  public final String getVersion()
  {
    return version;
  }
  
  public final void setAccessToken(AccessToken paramAccessToken)
  {
    accessToken = paramAccessToken;
  }
  
  public final void setBatchEntryDependsOn(String paramString)
  {
    batchEntryDependsOn = paramString;
  }
  
  public final void setBatchEntryName(String paramString)
  {
    batchEntryName = paramString;
  }
  
  public final void setBatchEntryOmitResultOnSuccess(boolean paramBoolean)
  {
    batchEntryOmitResultOnSuccess = paramBoolean;
  }
  
  public final void setCallback(final Callback paramCallback)
  {
    if ((!FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.GRAPH_API_DEBUG_INFO)) && (!FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.GRAPH_API_DEBUG_WARNING))) {
      callback = paramCallback;
    } else {
      callback = new Callback()
      {
        public void onCompleted(GraphResponse paramAnonymousGraphResponse)
        {
          Object localObject1 = paramAnonymousGraphResponse.getJSONObject();
          if (localObject1 != null) {
            localObject1 = ((JSONObject)localObject1).optJSONObject("__debug__");
          } else {
            localObject1 = null;
          }
          JSONArray localJSONArray;
          if (localObject1 != null) {
            localJSONArray = ((JSONObject)localObject1).optJSONArray("messages");
          } else {
            localJSONArray = null;
          }
          if (localJSONArray != null) {
            for (int i = 0; i < localJSONArray.length(); i++)
            {
              Object localObject2 = localJSONArray.optJSONObject(i);
              if (localObject2 != null) {
                localObject1 = ((JSONObject)localObject2).optString("message");
              } else {
                localObject1 = null;
              }
              Object localObject3;
              if (localObject2 != null) {
                localObject3 = ((JSONObject)localObject2).optString("type");
              } else {
                localObject3 = null;
              }
              if (localObject2 != null) {
                localObject2 = ((JSONObject)localObject2).optString("link");
              } else {
                localObject2 = null;
              }
              if ((localObject1 != null) && (localObject3 != null))
              {
                LoggingBehavior localLoggingBehavior = LoggingBehavior.GRAPH_API_DEBUG_INFO;
                if (((String)localObject3).equals("warning")) {
                  localLoggingBehavior = LoggingBehavior.GRAPH_API_DEBUG_WARNING;
                }
                localObject3 = localObject1;
                if (!Utility.isNullOrEmpty((String)localObject2)) {
                  localObject3 = z2.p((String)localObject1, " Link: ", (String)localObject2);
                }
                Logger.log(localLoggingBehavior, GraphRequest.TAG, (String)localObject3);
              }
            }
          }
          localObject1 = paramCallback;
          if (localObject1 != null) {
            ((GraphRequest.Callback)localObject1).onCompleted(paramAnonymousGraphResponse);
          }
        }
      };
    }
  }
  
  public final void setGraphObject(JSONObject paramJSONObject)
  {
    graphObject = paramJSONObject;
  }
  
  public final void setGraphPath(String paramString)
  {
    graphPath = paramString;
  }
  
  public final void setHttpMethod(HttpMethod paramHttpMethod)
  {
    if ((overriddenURL != null) && (paramHttpMethod != HttpMethod.GET)) {
      throw new FacebookException("Can't change HTTP method on request with overridden URL.");
    }
    if (paramHttpMethod == null) {
      paramHttpMethod = HttpMethod.GET;
    }
    httpMethod = paramHttpMethod;
  }
  
  public final void setParameters(Bundle paramBundle)
  {
    parameters = paramBundle;
  }
  
  public final void setSkipClientToken(boolean paramBoolean)
  {
    skipClientToken = paramBoolean;
  }
  
  public final void setTag(Object paramObject)
  {
    tag = paramObject;
  }
  
  public final void setVersion(String paramString)
  {
    version = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.u("{Request: ", " accessToken: ");
    AccessToken localAccessToken = accessToken;
    Object localObject = localAccessToken;
    if (localAccessToken == null) {
      localObject = "null";
    }
    localStringBuilder.append(localObject);
    localStringBuilder.append(", graphPath: ");
    localStringBuilder.append(graphPath);
    localStringBuilder.append(", graphObject: ");
    localStringBuilder.append(graphObject);
    localStringBuilder.append(", httpMethod: ");
    localStringBuilder.append(httpMethod);
    localStringBuilder.append(", parameters: ");
    localStringBuilder.append(parameters);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static class Attachment
  {
    private final GraphRequest request;
    private final Object value;
    
    public Attachment(GraphRequest paramGraphRequest, Object paramObject)
    {
      request = paramGraphRequest;
      value = paramObject;
    }
    
    public GraphRequest getRequest()
    {
      return request;
    }
    
    public Object getValue()
    {
      return value;
    }
  }
  
  public static abstract interface Callback
  {
    public abstract void onCompleted(GraphResponse paramGraphResponse);
  }
  
  public static abstract interface GraphJSONArrayCallback
  {
    public abstract void onCompleted(JSONArray paramJSONArray, GraphResponse paramGraphResponse);
  }
  
  public static abstract interface GraphJSONObjectCallback
  {
    public abstract void onCompleted(JSONObject paramJSONObject, GraphResponse paramGraphResponse);
  }
  
  public static abstract interface KeyValueSerializer
  {
    public abstract void writeString(String paramString1, String paramString2)
      throws IOException;
  }
  
  public static abstract interface OnProgressCallback
    extends GraphRequest.Callback
  {
    public abstract void onProgress(long paramLong1, long paramLong2);
  }
  
  public static class ParcelableResourceWithMimeType<RESOURCE extends Parcelable>
    implements Parcelable
  {
    public static final Parcelable.Creator<ParcelableResourceWithMimeType> CREATOR = new Parcelable.Creator()
    {
      public GraphRequest.ParcelableResourceWithMimeType createFromParcel(Parcel paramAnonymousParcel)
      {
        return new GraphRequest.ParcelableResourceWithMimeType(paramAnonymousParcel, null);
      }
      
      public GraphRequest.ParcelableResourceWithMimeType[] newArray(int paramAnonymousInt)
      {
        return new GraphRequest.ParcelableResourceWithMimeType[paramAnonymousInt];
      }
    };
    private final String mimeType;
    private final RESOURCE resource;
    
    private ParcelableResourceWithMimeType(Parcel paramParcel)
    {
      mimeType = paramParcel.readString();
      resource = paramParcel.readParcelable(FacebookSdk.getApplicationContext().getClassLoader());
    }
    
    public ParcelableResourceWithMimeType(RESOURCE paramRESOURCE, String paramString)
    {
      mimeType = paramString;
      resource = paramRESOURCE;
    }
    
    public int describeContents()
    {
      return 1;
    }
    
    public String getMimeType()
    {
      return mimeType;
    }
    
    public RESOURCE getResource()
    {
      return resource;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeString(mimeType);
      paramParcel.writeParcelable(resource, paramInt);
    }
  }
  
  public static class Serializer
    implements GraphRequest.KeyValueSerializer
  {
    private boolean firstWrite = true;
    private final Logger logger;
    private final OutputStream outputStream;
    private boolean useUrlEncode;
    
    public Serializer(OutputStream paramOutputStream, Logger paramLogger, boolean paramBoolean)
    {
      outputStream = paramOutputStream;
      logger = paramLogger;
      useUrlEncode = paramBoolean;
    }
    
    private RuntimeException getInvalidTypeError()
    {
      return new IllegalArgumentException("value is not a supported type.");
    }
    
    public void write(String paramString, Object... paramVarArgs)
      throws IOException
    {
      if (!useUrlEncode)
      {
        if (firstWrite)
        {
          outputStream.write("--".getBytes());
          outputStream.write(GraphRequest.access$200().getBytes());
          outputStream.write("\r\n".getBytes());
          firstWrite = false;
        }
        outputStream.write(String.format(paramString, paramVarArgs).getBytes());
      }
      else
      {
        outputStream.write(URLEncoder.encode(String.format(Locale.US, paramString, paramVarArgs), "UTF-8").getBytes());
      }
    }
    
    public void writeBitmap(String paramString, Bitmap paramBitmap)
      throws IOException
    {
      writeContentDisposition(paramString, paramString, "image/png");
      paramBitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream);
      writeLine("", new Object[0]);
      writeRecordBoundary();
      paramBitmap = logger;
      if (paramBitmap != null)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("    ");
        localStringBuilder.append(paramString);
        paramBitmap.appendKeyValue(localStringBuilder.toString(), "<Image>");
      }
    }
    
    public void writeBytes(String paramString, byte[] paramArrayOfByte)
      throws IOException
    {
      writeContentDisposition(paramString, paramString, "content/unknown");
      outputStream.write(paramArrayOfByte);
      writeLine("", new Object[0]);
      writeRecordBoundary();
      Logger localLogger = logger;
      if (localLogger != null) {
        localLogger.appendKeyValue(z2.o("    ", paramString), String.format(Locale.ROOT, "<Data: %d>", new Object[] { Integer.valueOf(paramArrayOfByte.length) }));
      }
    }
    
    public void writeContentDisposition(String paramString1, String paramString2, String paramString3)
      throws IOException
    {
      if (!useUrlEncode)
      {
        write("Content-Disposition: form-data; name=\"%s\"", new Object[] { paramString1 });
        if (paramString2 != null) {
          write("; filename=\"%s\"", new Object[] { paramString2 });
        }
        writeLine("", new Object[0]);
        if (paramString3 != null) {
          writeLine("%s: %s", new Object[] { "Content-Type", paramString3 });
        }
        writeLine("", new Object[0]);
      }
      else
      {
        outputStream.write(String.format("%s=", new Object[] { paramString1 }).getBytes());
      }
    }
    
    public void writeContentUri(String paramString1, Uri paramUri, String paramString2)
      throws IOException
    {
      String str = paramString2;
      if (paramString2 == null) {
        str = "content/unknown";
      }
      writeContentDisposition(paramString1, paramString1, str);
      int i;
      if ((outputStream instanceof ProgressNoopOutputStream))
      {
        long l = Utility.getContentSize(paramUri);
        ((ProgressNoopOutputStream)outputStream).addProgress(l);
        i = 0;
      }
      else
      {
        i = Utility.copyAndCloseInputStream(FacebookSdk.getApplicationContext().getContentResolver().openInputStream(paramUri), outputStream) + 0;
      }
      writeLine("", new Object[0]);
      writeRecordBoundary();
      paramUri = logger;
      if (paramUri != null) {
        paramUri.appendKeyValue(z2.o("    ", paramString1), String.format(Locale.ROOT, "<Data: %d>", new Object[] { Integer.valueOf(i) }));
      }
    }
    
    public void writeFile(String paramString1, ParcelFileDescriptor paramParcelFileDescriptor, String paramString2)
      throws IOException
    {
      String str = paramString2;
      if (paramString2 == null) {
        str = "content/unknown";
      }
      writeContentDisposition(paramString1, paramString1, str);
      paramString2 = outputStream;
      int i;
      if ((paramString2 instanceof ProgressNoopOutputStream))
      {
        ((ProgressNoopOutputStream)paramString2).addProgress(paramParcelFileDescriptor.getStatSize());
        i = 0;
      }
      else
      {
        i = Utility.copyAndCloseInputStream(new ParcelFileDescriptor.AutoCloseInputStream(paramParcelFileDescriptor), outputStream) + 0;
      }
      writeLine("", new Object[0]);
      writeRecordBoundary();
      paramParcelFileDescriptor = logger;
      if (paramParcelFileDescriptor != null) {
        paramParcelFileDescriptor.appendKeyValue(z2.o("    ", paramString1), String.format(Locale.ROOT, "<Data: %d>", new Object[] { Integer.valueOf(i) }));
      }
    }
    
    public void writeLine(String paramString, Object... paramVarArgs)
      throws IOException
    {
      write(paramString, paramVarArgs);
      if (!useUrlEncode) {
        write("\r\n", new Object[0]);
      }
    }
    
    public void writeObject(String paramString, Object paramObject, GraphRequest paramGraphRequest)
      throws IOException
    {
      OutputStream localOutputStream = outputStream;
      if ((localOutputStream instanceof RequestOutputStream)) {
        ((RequestOutputStream)localOutputStream).setCurrentRequest(paramGraphRequest);
      }
      if (GraphRequest.access$000(paramObject))
      {
        writeString(paramString, GraphRequest.access$100(paramObject));
      }
      else if ((paramObject instanceof Bitmap))
      {
        writeBitmap(paramString, (Bitmap)paramObject);
      }
      else if ((paramObject instanceof byte[]))
      {
        writeBytes(paramString, (byte[])paramObject);
      }
      else if ((paramObject instanceof Uri))
      {
        writeContentUri(paramString, (Uri)paramObject, null);
      }
      else if ((paramObject instanceof ParcelFileDescriptor))
      {
        writeFile(paramString, (ParcelFileDescriptor)paramObject, null);
      }
      else
      {
        if (!(paramObject instanceof GraphRequest.ParcelableResourceWithMimeType)) {
          break label187;
        }
        paramGraphRequest = (GraphRequest.ParcelableResourceWithMimeType)paramObject;
        paramObject = paramGraphRequest.getResource();
        paramGraphRequest = paramGraphRequest.getMimeType();
        if ((paramObject instanceof ParcelFileDescriptor))
        {
          writeFile(paramString, (ParcelFileDescriptor)paramObject, paramGraphRequest);
        }
        else
        {
          if (!(paramObject instanceof Uri)) {
            break label182;
          }
          writeContentUri(paramString, (Uri)paramObject, paramGraphRequest);
        }
      }
      return;
      label182:
      throw getInvalidTypeError();
      label187:
      throw getInvalidTypeError();
    }
    
    public void writeRecordBoundary()
      throws IOException
    {
      if (!useUrlEncode) {
        writeLine("--%s", new Object[] { GraphRequest.access$200() });
      } else {
        outputStream.write("&".getBytes());
      }
    }
    
    public void writeRequestsAsJson(String paramString, JSONArray paramJSONArray, Collection<GraphRequest> paramCollection)
      throws IOException, JSONException
    {
      Object localObject = outputStream;
      if (!(localObject instanceof RequestOutputStream))
      {
        writeString(paramString, paramJSONArray.toString());
        return;
      }
      localObject = (RequestOutputStream)localObject;
      writeContentDisposition(paramString, null, null);
      write("[", new Object[0]);
      Iterator localIterator = paramCollection.iterator();
      for (int i = 0; localIterator.hasNext(); i++)
      {
        GraphRequest localGraphRequest = (GraphRequest)localIterator.next();
        paramCollection = paramJSONArray.getJSONObject(i);
        ((RequestOutputStream)localObject).setCurrentRequest(localGraphRequest);
        if (i > 0) {
          write(",%s", new Object[] { paramCollection.toString() });
        } else {
          write("%s", new Object[] { paramCollection.toString() });
        }
      }
      write("]", new Object[0]);
      paramCollection = logger;
      if (paramCollection != null) {
        paramCollection.appendKeyValue(z2.o("    ", paramString), paramJSONArray.toString());
      }
    }
    
    public void writeString(String paramString1, String paramString2)
      throws IOException
    {
      writeContentDisposition(paramString1, null, null);
      writeLine("%s", new Object[] { paramString2 });
      writeRecordBoundary();
      Logger localLogger = logger;
      if (localLogger != null)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("    ");
        localStringBuilder.append(paramString1);
        localLogger.appendKeyValue(localStringBuilder.toString(), paramString2);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.GraphRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */