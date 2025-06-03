package com.facebook;

import android.util.Log;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import z2;

public class GraphResponse
{
  private static final String BODY_KEY = "body";
  private static final String CODE_KEY = "code";
  public static final String NON_JSON_RESPONSE_PROPERTY = "FACEBOOK_NON_JSON_RESULT";
  private static final String RESPONSE_LOG_TAG = "Response";
  public static final String SUCCESS_KEY = "success";
  private static final String TAG = "GraphResponse";
  private final HttpURLConnection connection;
  private final FacebookRequestError error;
  private final JSONObject graphObject;
  private final JSONArray graphObjectArray;
  private final String rawResponse;
  private final GraphRequest request;
  
  public GraphResponse(GraphRequest paramGraphRequest, HttpURLConnection paramHttpURLConnection, FacebookRequestError paramFacebookRequestError)
  {
    this(paramGraphRequest, paramHttpURLConnection, null, null, null, paramFacebookRequestError);
  }
  
  public GraphResponse(GraphRequest paramGraphRequest, HttpURLConnection paramHttpURLConnection, String paramString, JSONArray paramJSONArray)
  {
    this(paramGraphRequest, paramHttpURLConnection, paramString, null, paramJSONArray, null);
  }
  
  public GraphResponse(GraphRequest paramGraphRequest, HttpURLConnection paramHttpURLConnection, String paramString, JSONObject paramJSONObject)
  {
    this(paramGraphRequest, paramHttpURLConnection, paramString, paramJSONObject, null, null);
  }
  
  public GraphResponse(GraphRequest paramGraphRequest, HttpURLConnection paramHttpURLConnection, String paramString, JSONObject paramJSONObject, JSONArray paramJSONArray, FacebookRequestError paramFacebookRequestError)
  {
    request = paramGraphRequest;
    connection = paramHttpURLConnection;
    rawResponse = paramString;
    graphObject = paramJSONObject;
    graphObjectArray = paramJSONArray;
    error = paramFacebookRequestError;
  }
  
  public static List<GraphResponse> constructErrorResponses(List<GraphRequest> paramList, HttpURLConnection paramHttpURLConnection, FacebookException paramFacebookException)
  {
    int i = paramList.size();
    ArrayList localArrayList = new ArrayList(i);
    for (int j = 0; j < i; j++) {
      localArrayList.add(new GraphResponse((GraphRequest)paramList.get(j), paramHttpURLConnection, new FacebookRequestError(paramHttpURLConnection, paramFacebookException)));
    }
    return localArrayList;
  }
  
  private static GraphResponse createResponseFromObject(GraphRequest paramGraphRequest, HttpURLConnection paramHttpURLConnection, Object paramObject1, Object paramObject2)
    throws JSONException
  {
    Object localObject = paramObject1;
    if ((paramObject1 instanceof JSONObject))
    {
      paramObject1 = (JSONObject)paramObject1;
      paramObject2 = FacebookRequestError.checkResponseAndCreateError((JSONObject)paramObject1, paramObject2, paramHttpURLConnection);
      if (paramObject2 != null)
      {
        Log.e(TAG, ((FacebookRequestError)paramObject2).toString());
        if ((((FacebookRequestError)paramObject2).getErrorCode() == 190) && (Utility.isCurrentAccessToken(paramGraphRequest.getAccessToken()))) {
          if (((FacebookRequestError)paramObject2).getSubErrorCode() != 493) {
            AccessToken.setCurrentAccessToken(null);
          } else if (!AccessToken.getCurrentAccessToken().isExpired()) {
            AccessToken.expireCurrentAccessToken();
          }
        }
        return new GraphResponse(paramGraphRequest, paramHttpURLConnection, (FacebookRequestError)paramObject2);
      }
      paramObject1 = Utility.getStringPropertyAsJSON((JSONObject)paramObject1, "body", "FACEBOOK_NON_JSON_RESULT");
      if ((paramObject1 instanceof JSONObject)) {
        return new GraphResponse(paramGraphRequest, paramHttpURLConnection, paramObject1.toString(), (JSONObject)paramObject1);
      }
      if ((paramObject1 instanceof JSONArray)) {
        return new GraphResponse(paramGraphRequest, paramHttpURLConnection, paramObject1.toString(), (JSONArray)paramObject1);
      }
      localObject = JSONObject.NULL;
    }
    if (localObject == JSONObject.NULL) {
      return new GraphResponse(paramGraphRequest, paramHttpURLConnection, localObject.toString(), null);
    }
    paramGraphRequest = z2.t("Got unexpected object type in response, class: ");
    paramGraphRequest.append(localObject.getClass().getSimpleName());
    throw new FacebookException(paramGraphRequest.toString());
  }
  
  private static List<GraphResponse> createResponsesFromObject(HttpURLConnection paramHttpURLConnection, List<GraphRequest> paramList, Object paramObject)
    throws FacebookException, JSONException
  {
    int i = paramList.size();
    ArrayList localArrayList = new ArrayList(i);
    int j = 0;
    GraphRequest localGraphRequest;
    int k;
    if (i == 1)
    {
      localGraphRequest = (GraphRequest)paramList.get(0);
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>();
        localJSONObject.put("body", paramObject);
        if (paramHttpURLConnection != null) {
          k = paramHttpURLConnection.getResponseCode();
        } else {
          k = 200;
        }
        localJSONObject.put("code", k);
        JSONArray localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>();
        localJSONArray.put(localJSONObject);
      }
      catch (IOException localIOException)
      {
        localArrayList.add(new GraphResponse(localGraphRequest, paramHttpURLConnection, new FacebookRequestError(paramHttpURLConnection, localIOException)));
      }
      catch (JSONException localJSONException2)
      {
        localArrayList.add(new GraphResponse(localGraphRequest, paramHttpURLConnection, new FacebookRequestError(paramHttpURLConnection, localJSONException2)));
      }
    }
    Object localObject = paramObject;
    if ((localObject instanceof JSONArray))
    {
      localObject = (JSONArray)localObject;
      if (((JSONArray)localObject).length() == i)
      {
        for (k = j; k < ((JSONArray)localObject).length(); k++)
        {
          localGraphRequest = (GraphRequest)paramList.get(k);
          try
          {
            localArrayList.add(createResponseFromObject(localGraphRequest, paramHttpURLConnection, ((JSONArray)localObject).get(k), paramObject));
          }
          catch (FacebookException localFacebookException)
          {
            localArrayList.add(new GraphResponse(localGraphRequest, paramHttpURLConnection, new FacebookRequestError(paramHttpURLConnection, localFacebookException)));
          }
          catch (JSONException localJSONException1)
          {
            localArrayList.add(new GraphResponse(localGraphRequest, paramHttpURLConnection, new FacebookRequestError(paramHttpURLConnection, localJSONException1)));
          }
        }
        return localArrayList;
      }
    }
    throw new FacebookException("Unexpected number of results");
  }
  
  public static List<GraphResponse> createResponsesFromStream(InputStream paramInputStream, HttpURLConnection paramHttpURLConnection, GraphRequestBatch paramGraphRequestBatch)
    throws FacebookException, JSONException, IOException
  {
    paramInputStream = Utility.readStreamToString(paramInputStream);
    Logger.log(LoggingBehavior.INCLUDE_RAW_RESPONSES, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", new Object[] { Integer.valueOf(paramInputStream.length()), paramInputStream });
    return createResponsesFromString(paramInputStream, paramHttpURLConnection, paramGraphRequestBatch);
  }
  
  public static List<GraphResponse> createResponsesFromString(String paramString, HttpURLConnection paramHttpURLConnection, GraphRequestBatch paramGraphRequestBatch)
    throws FacebookException, JSONException, IOException
  {
    paramHttpURLConnection = createResponsesFromObject(paramHttpURLConnection, paramGraphRequestBatch, new JSONTokener(paramString).nextValue());
    Logger.log(LoggingBehavior.REQUESTS, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", new Object[] { paramGraphRequestBatch.getId(), Integer.valueOf(paramString.length()), paramHttpURLConnection });
    return paramHttpURLConnection;
  }
  
  /* Error */
  public static List<GraphResponse> fromHttpConnection(HttpURLConnection paramHttpURLConnection, GraphRequestBatch paramGraphRequestBatch)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: aconst_null
    //   5: astore 4
    //   7: aload 4
    //   9: astore 5
    //   11: aload_2
    //   12: astore 6
    //   14: aload_3
    //   15: astore 7
    //   17: invokestatic 283	com/facebook/FacebookSdk:isFullyInitialized	()Z
    //   20: ifeq +85 -> 105
    //   23: aload 4
    //   25: astore 5
    //   27: aload_2
    //   28: astore 6
    //   30: aload_3
    //   31: astore 7
    //   33: aload_0
    //   34: invokevirtual 204	java/net/HttpURLConnection:getResponseCode	()I
    //   37: sipush 400
    //   40: if_icmplt +22 -> 62
    //   43: aload 4
    //   45: astore 5
    //   47: aload_2
    //   48: astore 6
    //   50: aload_3
    //   51: astore 7
    //   53: aload_0
    //   54: invokevirtual 287	java/net/HttpURLConnection:getErrorStream	()Ljava/io/InputStream;
    //   57: astore 4
    //   59: goto +19 -> 78
    //   62: aload 4
    //   64: astore 5
    //   66: aload_2
    //   67: astore 6
    //   69: aload_3
    //   70: astore 7
    //   72: aload_0
    //   73: invokevirtual 292	java/net/URLConnection:getInputStream	()Ljava/io/InputStream;
    //   76: astore 4
    //   78: aload 4
    //   80: astore 5
    //   82: aload 4
    //   84: astore 6
    //   86: aload 4
    //   88: astore 7
    //   90: aload 4
    //   92: aload_0
    //   93: aload_1
    //   94: invokestatic 294	com/facebook/GraphResponse:createResponsesFromStream	(Ljava/io/InputStream;Ljava/net/HttpURLConnection;Lcom/facebook/GraphRequestBatch;)Ljava/util/List;
    //   97: astore_2
    //   98: aload 4
    //   100: invokestatic 298	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   103: aload_2
    //   104: areturn
    //   105: aload 4
    //   107: astore 5
    //   109: aload_2
    //   110: astore 6
    //   112: aload_3
    //   113: astore 7
    //   115: getstatic 104	com/facebook/GraphResponse:TAG	Ljava/lang/String;
    //   118: ldc_w 300
    //   121: invokestatic 114	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   124: pop
    //   125: aload 4
    //   127: astore 5
    //   129: aload_2
    //   130: astore 6
    //   132: aload_3
    //   133: astore 7
    //   135: new 185	com/facebook/FacebookException
    //   138: astore 8
    //   140: aload 4
    //   142: astore 5
    //   144: aload_2
    //   145: astore 6
    //   147: aload_3
    //   148: astore 7
    //   150: aload 8
    //   152: ldc_w 300
    //   155: invokespecial 189	com/facebook/FacebookException:<init>	(Ljava/lang/String;)V
    //   158: aload 4
    //   160: astore 5
    //   162: aload_2
    //   163: astore 6
    //   165: aload_3
    //   166: astore 7
    //   168: aload 8
    //   170: athrow
    //   171: astore_0
    //   172: goto +113 -> 285
    //   175: astore 7
    //   177: aload 6
    //   179: astore 5
    //   181: getstatic 266	com/facebook/LoggingBehavior:REQUESTS	Lcom/facebook/LoggingBehavior;
    //   184: ldc 20
    //   186: ldc_w 302
    //   189: iconst_1
    //   190: anewarray 4	java/lang/Object
    //   193: dup
    //   194: iconst_0
    //   195: aload 7
    //   197: aastore
    //   198: invokestatic 249	com/facebook/internal/Logger:log	(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   201: aload 6
    //   203: astore 5
    //   205: new 185	com/facebook/FacebookException
    //   208: astore 4
    //   210: aload 6
    //   212: astore 5
    //   214: aload 4
    //   216: aload 7
    //   218: invokespecial 305	com/facebook/FacebookException:<init>	(Ljava/lang/Throwable;)V
    //   221: aload 6
    //   223: astore 5
    //   225: aload_1
    //   226: aload_0
    //   227: aload 4
    //   229: invokestatic 307	com/facebook/GraphResponse:constructErrorResponses	(Ljava/util/List;Ljava/net/HttpURLConnection;Lcom/facebook/FacebookException;)Ljava/util/List;
    //   232: astore_0
    //   233: aload 6
    //   235: invokestatic 298	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   238: aload_0
    //   239: areturn
    //   240: astore 4
    //   242: aload 7
    //   244: astore 5
    //   246: getstatic 266	com/facebook/LoggingBehavior:REQUESTS	Lcom/facebook/LoggingBehavior;
    //   249: ldc 20
    //   251: ldc_w 302
    //   254: iconst_1
    //   255: anewarray 4	java/lang/Object
    //   258: dup
    //   259: iconst_0
    //   260: aload 4
    //   262: aastore
    //   263: invokestatic 249	com/facebook/internal/Logger:log	(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   266: aload 7
    //   268: astore 5
    //   270: aload_1
    //   271: aload_0
    //   272: aload 4
    //   274: invokestatic 307	com/facebook/GraphResponse:constructErrorResponses	(Ljava/util/List;Ljava/net/HttpURLConnection;Lcom/facebook/FacebookException;)Ljava/util/List;
    //   277: astore_0
    //   278: aload 7
    //   280: invokestatic 298	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   283: aload_0
    //   284: areturn
    //   285: aload 5
    //   287: invokestatic 298	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   290: aload_0
    //   291: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	292	0	paramHttpURLConnection	HttpURLConnection
    //   0	292	1	paramGraphRequestBatch	GraphRequestBatch
    //   1	162	2	localList	List
    //   3	163	3	localObject1	Object
    //   5	223	4	localObject2	Object
    //   240	33	4	localFacebookException1	FacebookException
    //   9	277	5	localObject3	Object
    //   12	222	6	localObject4	Object
    //   15	152	7	localObject5	Object
    //   175	104	7	localException	Exception
    //   138	31	8	localFacebookException2	FacebookException
    // Exception table:
    //   from	to	target	type
    //   17	23	171	finally
    //   33	43	171	finally
    //   53	59	171	finally
    //   72	78	171	finally
    //   90	98	171	finally
    //   115	125	171	finally
    //   135	140	171	finally
    //   150	158	171	finally
    //   168	171	171	finally
    //   181	201	171	finally
    //   205	210	171	finally
    //   214	221	171	finally
    //   225	233	171	finally
    //   246	266	171	finally
    //   270	278	171	finally
    //   17	23	175	java/lang/Exception
    //   33	43	175	java/lang/Exception
    //   53	59	175	java/lang/Exception
    //   72	78	175	java/lang/Exception
    //   90	98	175	java/lang/Exception
    //   115	125	175	java/lang/Exception
    //   135	140	175	java/lang/Exception
    //   150	158	175	java/lang/Exception
    //   168	171	175	java/lang/Exception
    //   17	23	240	com/facebook/FacebookException
    //   33	43	240	com/facebook/FacebookException
    //   53	59	240	com/facebook/FacebookException
    //   72	78	240	com/facebook/FacebookException
    //   90	98	240	com/facebook/FacebookException
    //   115	125	240	com/facebook/FacebookException
    //   135	140	240	com/facebook/FacebookException
    //   150	158	240	com/facebook/FacebookException
    //   168	171	240	com/facebook/FacebookException
  }
  
  public final HttpURLConnection getConnection()
  {
    return connection;
  }
  
  public final FacebookRequestError getError()
  {
    return error;
  }
  
  public final JSONArray getJSONArray()
  {
    return graphObjectArray;
  }
  
  public final JSONObject getJSONObject()
  {
    return graphObject;
  }
  
  public String getRawResponse()
  {
    return rawResponse;
  }
  
  public GraphRequest getRequest()
  {
    return request;
  }
  
  public GraphRequest getRequestForPagedResults(PagingDirection paramPagingDirection)
  {
    Object localObject = graphObject;
    if (localObject != null)
    {
      localObject = ((JSONObject)localObject).optJSONObject("paging");
      if (localObject != null)
      {
        if (paramPagingDirection == PagingDirection.NEXT)
        {
          paramPagingDirection = ((JSONObject)localObject).optString("next");
          break label52;
        }
        paramPagingDirection = ((JSONObject)localObject).optString("previous");
        break label52;
      }
    }
    paramPagingDirection = null;
    label52:
    if (Utility.isNullOrEmpty(paramPagingDirection)) {
      return null;
    }
    if ((paramPagingDirection != null) && (paramPagingDirection.equals(request.getUrlForSingleRequest()))) {
      return null;
    }
    try
    {
      localObject = request.getAccessToken();
      URL localURL = new java/net/URL;
      localURL.<init>(paramPagingDirection);
      paramPagingDirection = new GraphRequest((AccessToken)localObject, localURL);
      return paramPagingDirection;
    }
    catch (MalformedURLException paramPagingDirection) {}
    return null;
  }
  
  public String toString()
  {
    String str;
    try
    {
      localObject1 = Locale.US;
      Object localObject2 = connection;
      int i;
      if (localObject2 != null) {
        i = ((HttpURLConnection)localObject2).getResponseCode();
      } else {
        i = 200;
      }
      localObject2 = String.format((Locale)localObject1, "%d", new Object[] { Integer.valueOf(i) });
    }
    catch (IOException localIOException)
    {
      str = "unknown";
    }
    Object localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append("{Response: ");
    ((StringBuilder)localObject1).append(" responseCode: ");
    ((StringBuilder)localObject1).append(str);
    ((StringBuilder)localObject1).append(", graphObject: ");
    ((StringBuilder)localObject1).append(graphObject);
    ((StringBuilder)localObject1).append(", error: ");
    ((StringBuilder)localObject1).append(error);
    ((StringBuilder)localObject1).append("}");
    return ((StringBuilder)localObject1).toString();
  }
  
  public static enum PagingDirection
  {
    static
    {
      PagingDirection localPagingDirection1 = new PagingDirection("NEXT", 0);
      NEXT = localPagingDirection1;
      PagingDirection localPagingDirection2 = new PagingDirection("PREVIOUS", 1);
      PREVIOUS = localPagingDirection2;
      $VALUES = new PagingDirection[] { localPagingDirection1, localPagingDirection2 };
    }
    
    private PagingDirection() {}
  }
}

/* Location:
 * Qualified Name:     com.facebook.GraphResponse
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */