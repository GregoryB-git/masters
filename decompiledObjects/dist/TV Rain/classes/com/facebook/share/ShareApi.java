package com.facebook.share;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.Callback;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.internal.CollectionMapper;
import com.facebook.internal.CollectionMapper.Collection;
import com.facebook.internal.CollectionMapper.OnErrorListener;
import com.facebook.internal.CollectionMapper.OnMapValueCompleteListener;
import com.facebook.internal.CollectionMapper.OnMapperCompleteListener;
import com.facebook.internal.CollectionMapper.ValueMapper;
import com.facebook.internal.Mutable;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.share.internal.ShareContentValidation;
import com.facebook.share.internal.ShareInternalUtility;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.ShareOpenGraphObject;
import com.facebook.share.model.ShareOpenGraphValueContainer;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareVideoContent;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import z2;

public final class ShareApi
{
  private static final String DEFAULT_CHARSET = "UTF-8";
  private static final String DEFAULT_GRAPH_NODE = "me";
  private static final String GRAPH_PATH_FORMAT = "%s/%s";
  private static final String PHOTOS_EDGE = "photos";
  private static final String TAG = "ShareApi";
  private String graphNode;
  private String message;
  private final ShareContent shareContent;
  
  public ShareApi(ShareContent paramShareContent)
  {
    shareContent = paramShareContent;
    graphNode = "me";
  }
  
  private void addCommonParameters(Bundle paramBundle, ShareContent paramShareContent)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      List localList = paramShareContent.getPeopleIds();
      if (!Utility.isNullOrEmpty(localList)) {
        paramBundle.putString("tags", TextUtils.join(", ", localList));
      }
      if (!Utility.isNullOrEmpty(paramShareContent.getPlaceId())) {
        paramBundle.putString("place", paramShareContent.getPlaceId());
      }
      if (!Utility.isNullOrEmpty(paramShareContent.getPageId())) {
        paramBundle.putString("page", paramShareContent.getPageId());
      }
      if (!Utility.isNullOrEmpty(paramShareContent.getRef())) {
        paramBundle.putString("ref", paramShareContent.getRef());
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramBundle, this);
    }
  }
  
  /* Error */
  private String getGraphPath(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 68	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   4: ifeq +5 -> 9
    //   7: aconst_null
    //   8: areturn
    //   9: getstatic 156	java/util/Locale:ROOT	Ljava/util/Locale;
    //   12: ldc 40
    //   14: iconst_2
    //   15: anewarray 4	java/lang/Object
    //   18: dup
    //   19: iconst_0
    //   20: aload_0
    //   21: invokevirtual 159	com/facebook/share/ShareApi:getGraphNode	()Ljava/lang/String;
    //   24: ldc 34
    //   26: invokestatic 165	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   29: aastore
    //   30: dup
    //   31: iconst_1
    //   32: aload_1
    //   33: aastore
    //   34: invokestatic 171	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   37: astore_1
    //   38: aload_1
    //   39: areturn
    //   40: astore_1
    //   41: aload_1
    //   42: aload_0
    //   43: invokestatic 75	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   46: aconst_null
    //   47: areturn
    //   48: astore_1
    //   49: goto -3 -> 46
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	52	0	this	ShareApi
    //   0	52	1	paramString	String
    // Exception table:
    //   from	to	target	type
    //   9	38	40	finally
    //   9	38	48	java/io/UnsupportedEncodingException
  }
  
  private Bundle getSharePhotoCommonParameters(SharePhoto paramSharePhoto, SharePhotoContent paramSharePhotoContent)
    throws JSONException
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return null;
    }
    try
    {
      Bundle localBundle = paramSharePhoto.getParameters();
      if ((!localBundle.containsKey("place")) && (!Utility.isNullOrEmpty(paramSharePhotoContent.getPlaceId()))) {
        localBundle.putString("place", paramSharePhotoContent.getPlaceId());
      }
      if ((!localBundle.containsKey("tags")) && (!Utility.isNullOrEmpty(paramSharePhotoContent.getPeopleIds())))
      {
        Object localObject = paramSharePhotoContent.getPeopleIds();
        if (!Utility.isNullOrEmpty((Collection)localObject))
        {
          paramSharePhoto = new org/json/JSONArray;
          paramSharePhoto.<init>();
          Iterator localIterator = ((List)localObject).iterator();
          while (localIterator.hasNext())
          {
            String str = (String)localIterator.next();
            localObject = new org/json/JSONObject;
            ((JSONObject)localObject).<init>();
            ((JSONObject)localObject).put("tag_uid", str);
            paramSharePhoto.put(localObject);
          }
          localBundle.putString("tags", paramSharePhoto.toString());
        }
      }
      if ((!localBundle.containsKey("ref")) && (!Utility.isNullOrEmpty(paramSharePhotoContent.getRef()))) {
        localBundle.putString("ref", paramSharePhotoContent.getRef());
      }
      return localBundle;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramSharePhoto, this);
    }
    return null;
  }
  
  /* Error */
  private static void handleImagesOnAction(Bundle paramBundle)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 68	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   5: ifeq +4 -> 9
    //   8: return
    //   9: aload_0
    //   10: ldc -35
    //   12: invokevirtual 224	android/os/BaseBundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   15: astore_1
    //   16: aload_1
    //   17: ifnull +111 -> 128
    //   20: new 186	org/json/JSONArray
    //   23: astore_2
    //   24: aload_2
    //   25: aload_1
    //   26: invokespecial 227	org/json/JSONArray:<init>	(Ljava/lang/String;)V
    //   29: iconst_0
    //   30: istore_3
    //   31: iload_3
    //   32: aload_2
    //   33: invokevirtual 231	org/json/JSONArray:length	()I
    //   36: if_icmpge +63 -> 99
    //   39: aload_2
    //   40: iload_3
    //   41: invokevirtual 235	org/json/JSONArray:optJSONObject	(I)Lorg/json/JSONObject;
    //   44: astore 4
    //   46: aload 4
    //   48: ifnull +13 -> 61
    //   51: aload_0
    //   52: iload_3
    //   53: aload 4
    //   55: invokestatic 239	com/facebook/share/ShareApi:putImageInBundleWithArrayFormat	(Landroid/os/Bundle;ILorg/json/JSONObject;)V
    //   58: goto +35 -> 93
    //   61: aload_2
    //   62: iload_3
    //   63: invokevirtual 242	org/json/JSONArray:getString	(I)Ljava/lang/String;
    //   66: astore 4
    //   68: aload_0
    //   69: getstatic 156	java/util/Locale:ROOT	Ljava/util/Locale;
    //   72: ldc -12
    //   74: iconst_1
    //   75: anewarray 4	java/lang/Object
    //   78: dup
    //   79: iconst_0
    //   80: iload_3
    //   81: invokestatic 250	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   84: aastore
    //   85: invokestatic 171	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   88: aload 4
    //   90: invokevirtual 129	android/os/BaseBundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   93: iinc 3 1
    //   96: goto -65 -> 31
    //   99: aload_0
    //   100: ldc -35
    //   102: invokevirtual 255	android/os/Bundle:remove	(Ljava/lang/String;)V
    //   105: return
    //   106: astore_2
    //   107: new 205	org/json/JSONObject
    //   110: astore_2
    //   111: aload_2
    //   112: aload_1
    //   113: invokespecial 256	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   116: aload_0
    //   117: iconst_0
    //   118: aload_2
    //   119: invokestatic 239	com/facebook/share/ShareApi:putImageInBundleWithArrayFormat	(Landroid/os/Bundle;ILorg/json/JSONObject;)V
    //   122: aload_0
    //   123: ldc -35
    //   125: invokevirtual 255	android/os/Bundle:remove	(Ljava/lang/String;)V
    //   128: return
    //   129: astore_0
    //   130: aload_0
    //   131: ldc 2
    //   133: invokestatic 75	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   136: return
    //   137: astore_0
    //   138: goto -10 -> 128
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	141	0	paramBundle	Bundle
    //   15	98	1	str	String
    //   23	39	2	localJSONArray	JSONArray
    //   106	1	2	localJSONException	JSONException
    //   110	9	2	localJSONObject	JSONObject
    //   30	64	3	i	int
    //   44	45	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   20	29	106	org/json/JSONException
    //   31	46	106	org/json/JSONException
    //   51	58	106	org/json/JSONException
    //   61	93	106	org/json/JSONException
    //   99	105	106	org/json/JSONException
    //   9	16	129	finally
    //   20	29	129	finally
    //   31	46	129	finally
    //   51	58	129	finally
    //   61	93	129	finally
    //   99	105	129	finally
    //   107	128	129	finally
    //   107	128	137	org/json/JSONException
  }
  
  private static void putImageInBundleWithArrayFormat(Bundle paramBundle, int paramInt, JSONObject paramJSONObject)
    throws JSONException
  {
    if (CrashShieldHandler.isObjectCrashing(ShareApi.class)) {
      return;
    }
    try
    {
      Iterator localIterator = paramJSONObject.keys();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        paramBundle.putString(String.format(Locale.ROOT, "image[%d][%s]", new Object[] { Integer.valueOf(paramInt), str }), paramJSONObject.get(str).toString());
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramBundle, ShareApi.class);
    }
  }
  
  public static void share(ShareContent paramShareContent, FacebookCallback<Sharer.Result> paramFacebookCallback)
  {
    if (CrashShieldHandler.isObjectCrashing(ShareApi.class)) {
      return;
    }
    try
    {
      ShareApi localShareApi = new com/facebook/share/ShareApi;
      localShareApi.<init>(paramShareContent);
      localShareApi.share(paramFacebookCallback);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramShareContent, ShareApi.class);
    }
  }
  
  private void shareLinkContent(ShareLinkContent paramShareLinkContent, FacebookCallback<Sharer.Result> paramFacebookCallback)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      GraphRequest.Callback local4 = new com/facebook/share/ShareApi$4;
      local4.<init>(this, paramFacebookCallback);
      paramFacebookCallback = new android/os/Bundle;
      paramFacebookCallback.<init>();
      addCommonParameters(paramFacebookCallback, paramShareLinkContent);
      paramFacebookCallback.putString("message", getMessage());
      paramFacebookCallback.putString("link", Utility.getUriString(paramShareLinkContent.getContentUrl()));
      paramFacebookCallback.putString("picture", Utility.getUriString(paramShareLinkContent.getImageUrl()));
      paramFacebookCallback.putString("name", paramShareLinkContent.getContentTitle());
      paramFacebookCallback.putString("description", paramShareLinkContent.getContentDescription());
      paramFacebookCallback.putString("ref", paramShareLinkContent.getRef());
      paramShareLinkContent = new com/facebook/GraphRequest;
      paramShareLinkContent.<init>(AccessToken.getCurrentAccessToken(), getGraphPath("feed"), paramFacebookCallback, HttpMethod.POST, local4);
      paramShareLinkContent.executeAsync();
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramShareLinkContent, this);
    }
  }
  
  private void shareOpenGraphContent(ShareOpenGraphContent paramShareOpenGraphContent, FacebookCallback<Sharer.Result> paramFacebookCallback)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      GraphRequest.Callback local1 = new com/facebook/share/ShareApi$1;
      local1.<init>(this, paramFacebookCallback);
      ShareOpenGraphAction localShareOpenGraphAction = paramShareOpenGraphContent.getAction();
      Bundle localBundle = localShareOpenGraphAction.getBundle();
      addCommonParameters(localBundle, paramShareOpenGraphContent);
      if (!Utility.isNullOrEmpty(getMessage())) {
        localBundle.putString("message", getMessage());
      }
      paramShareOpenGraphContent = new com/facebook/share/ShareApi$2;
      paramShareOpenGraphContent.<init>(this, localBundle, localShareOpenGraphAction, local1, paramFacebookCallback);
      stageOpenGraphAction(localBundle, paramShareOpenGraphContent);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramShareOpenGraphContent, this);
    }
  }
  
  private void sharePhotoContent(SharePhotoContent paramSharePhotoContent, FacebookCallback<Sharer.Result> paramFacebookCallback)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      Mutable localMutable = new com/facebook/internal/Mutable;
      localMutable.<init>(Integer.valueOf(0));
      AccessToken localAccessToken = AccessToken.getCurrentAccessToken();
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      Object localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>();
      Object localObject2 = new java/util/ArrayList;
      ((ArrayList)localObject2).<init>();
      GraphRequest.Callback local3 = new com/facebook/share/ShareApi$3;
      local3.<init>(this, (ArrayList)localObject1, (ArrayList)localObject2, localMutable, paramFacebookCallback);
      try
      {
        Iterator localIterator = paramSharePhotoContent.getPhotos().iterator();
        while (localIterator.hasNext())
        {
          localObject1 = (SharePhoto)localIterator.next();
          try
          {
            Bundle localBundle = getSharePhotoCommonParameters((SharePhoto)localObject1, paramSharePhotoContent);
            Bitmap localBitmap = ((SharePhoto)localObject1).getBitmap();
            Uri localUri = ((SharePhoto)localObject1).getImageUrl();
            localObject2 = ((SharePhoto)localObject1).getCaption();
            localObject1 = localObject2;
            if (localObject2 == null) {
              localObject1 = getMessage();
            }
            if (localBitmap != null) {
              localArrayList.add(GraphRequest.newUploadPhotoRequest(localAccessToken, getGraphPath("photos"), localBitmap, (String)localObject1, localBundle, local3));
            } else if (localUri != null) {
              localArrayList.add(GraphRequest.newUploadPhotoRequest(localAccessToken, getGraphPath("photos"), localUri, (String)localObject1, localBundle, local3));
            }
          }
          catch (JSONException paramSharePhotoContent)
          {
            return;
          }
        }
        value = Integer.valueOf(((Integer)value).intValue() + localArrayList.size());
        paramSharePhotoContent = localArrayList.iterator();
        while (paramSharePhotoContent.hasNext()) {
          ((GraphRequest)paramSharePhotoContent.next()).executeAsync();
        }
        return;
      }
      catch (FileNotFoundException paramSharePhotoContent) {}
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramSharePhotoContent, this);
    }
  }
  
  /* Error */
  private void shareVideoContent(ShareVideoContent paramShareVideoContent, FacebookCallback<Sharer.Result> paramFacebookCallback)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 68	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   4: ifeq +4 -> 8
    //   7: return
    //   8: aload_1
    //   9: aload_0
    //   10: invokevirtual 159	com/facebook/share/ShareApi:getGraphNode	()Ljava/lang/String;
    //   13: aload_2
    //   14: invokestatic 428	com/facebook/share/internal/VideoUploader:uploadAsync	(Lcom/facebook/share/model/ShareVideoContent;Ljava/lang/String;Lcom/facebook/FacebookCallback;)V
    //   17: goto +13 -> 30
    //   20: astore_1
    //   21: goto +10 -> 31
    //   24: astore_1
    //   25: aload_2
    //   26: aload_1
    //   27: invokestatic 408	com/facebook/share/internal/ShareInternalUtility:invokeCallbackWithException	(Lcom/facebook/FacebookCallback;Ljava/lang/Exception;)V
    //   30: return
    //   31: aload_1
    //   32: aload_0
    //   33: invokestatic 75	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   36: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	37	0	this	ShareApi
    //   0	37	1	paramShareVideoContent	ShareVideoContent
    //   0	37	2	paramFacebookCallback	FacebookCallback<Sharer.Result>
    // Exception table:
    //   from	to	target	type
    //   8	17	20	finally
    //   25	30	20	finally
    //   8	17	24	java/io/FileNotFoundException
  }
  
  private void stageArrayList(ArrayList paramArrayList, CollectionMapper.OnMapValueCompleteListener paramOnMapValueCompleteListener)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      JSONArray localJSONArray = new org/json/JSONArray;
      localJSONArray.<init>();
      CollectionMapper.Collection local5 = new com/facebook/share/ShareApi$5;
      local5.<init>(this, paramArrayList, localJSONArray);
      paramArrayList = new com/facebook/share/ShareApi$6;
      paramArrayList.<init>(this, paramOnMapValueCompleteListener, localJSONArray);
      stageCollectionValues(local5, paramArrayList);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramArrayList, this);
    }
  }
  
  private <T> void stageCollectionValues(CollectionMapper.Collection<T> paramCollection, CollectionMapper.OnMapperCompleteListener paramOnMapperCompleteListener)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      CollectionMapper.ValueMapper local7 = new com/facebook/share/ShareApi$7;
      local7.<init>(this);
      CollectionMapper.iterate(paramCollection, local7, paramOnMapperCompleteListener);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramCollection, this);
    }
  }
  
  private void stageOpenGraphAction(Bundle paramBundle, CollectionMapper.OnMapperCompleteListener paramOnMapperCompleteListener)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      CollectionMapper.Collection local8 = new com/facebook/share/ShareApi$8;
      local8.<init>(this, paramBundle);
      stageCollectionValues(local8, paramOnMapperCompleteListener);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramBundle, this);
    }
  }
  
  private void stageOpenGraphObject(ShareOpenGraphObject paramShareOpenGraphObject, CollectionMapper.OnMapValueCompleteListener paramOnMapValueCompleteListener)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      Object localObject1 = paramShareOpenGraphObject.getString("type");
      Object localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = paramShareOpenGraphObject.getString("og:type");
      }
      if (localObject2 == null)
      {
        paramShareOpenGraphObject = new com/facebook/FacebookException;
        paramShareOpenGraphObject.<init>("Open Graph objects must contain a type value.");
        paramOnMapValueCompleteListener.onError(paramShareOpenGraphObject);
        return;
      }
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      localObject1 = new com/facebook/share/ShareApi$9;
      ((9)localObject1).<init>(this, paramShareOpenGraphObject, localJSONObject);
      GraphRequest.Callback local10 = new com/facebook/share/ShareApi$10;
      local10.<init>(this, paramOnMapValueCompleteListener);
      paramShareOpenGraphObject = new com/facebook/share/ShareApi$11;
      paramShareOpenGraphObject.<init>(this, localJSONObject, (String)localObject2, local10, paramOnMapValueCompleteListener);
      stageCollectionValues((CollectionMapper.Collection)localObject1, paramShareOpenGraphObject);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramShareOpenGraphObject, this);
    }
  }
  
  private void stagePhoto(SharePhoto paramSharePhoto, CollectionMapper.OnMapValueCompleteListener paramOnMapValueCompleteListener)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      Bitmap localBitmap = paramSharePhoto.getBitmap();
      Uri localUri = paramSharePhoto.getImageUrl();
      if ((localBitmap == null) && (localUri == null))
      {
        paramSharePhoto = new com/facebook/FacebookException;
        paramSharePhoto.<init>("Photos must have an imageURL or bitmap.");
        paramOnMapValueCompleteListener.onError(paramSharePhoto);
      }
      else
      {
        Object localObject = new com/facebook/share/ShareApi$12;
        ((12)localObject).<init>(this, paramOnMapValueCompleteListener, paramSharePhoto);
        if (localBitmap != null) {
          ShareInternalUtility.newUploadStagingResourceWithImageRequest(AccessToken.getCurrentAccessToken(), localBitmap, (GraphRequest.Callback)localObject).executeAsync();
        } else {
          try
          {
            ShareInternalUtility.newUploadStagingResourceWithImageRequest(AccessToken.getCurrentAccessToken(), localUri, (GraphRequest.Callback)localObject).executeAsync();
          }
          catch (FileNotFoundException paramSharePhoto)
          {
            localObject = paramSharePhoto.getLocalizedMessage();
            paramSharePhoto = (SharePhoto)localObject;
            if (localObject == null) {
              paramSharePhoto = "Error staging photo.";
            }
            localObject = new com/facebook/FacebookException;
            ((FacebookException)localObject).<init>(paramSharePhoto);
            paramOnMapValueCompleteListener.onError((FacebookException)localObject);
          }
        }
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramSharePhoto, this);
    }
  }
  
  public boolean canShare()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return false;
    }
    try
    {
      if (getShareContent() == null) {
        return false;
      }
      Object localObject = AccessToken.getCurrentAccessToken();
      if (!AccessToken.isCurrentAccessTokenActive()) {
        return false;
      }
      localObject = ((AccessToken)localObject).getPermissions();
      if ((localObject == null) || (!((Set)localObject).contains("publish_actions"))) {
        Log.w("ShareApi", "The publish_actions permissions are missing, the share will fail unless this app was authorized to publish in another installation.");
      }
      return true;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
    return false;
  }
  
  public String getGraphNode()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return null;
    }
    try
    {
      String str = graphNode;
      return str;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
    return null;
  }
  
  public String getMessage()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return null;
    }
    try
    {
      String str = message;
      return str;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
    return null;
  }
  
  public ShareContent getShareContent()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return null;
    }
    try
    {
      ShareContent localShareContent = shareContent;
      return localShareContent;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
    return null;
  }
  
  public void setGraphNode(String paramString)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      graphNode = paramString;
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString, this);
    }
  }
  
  public void setMessage(String paramString)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      message = paramString;
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString, this);
    }
  }
  
  public void share(FacebookCallback<Sharer.Result> paramFacebookCallback)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      if (!canShare())
      {
        ShareInternalUtility.invokeCallbackWithError(paramFacebookCallback, "Insufficient permissions for sharing content via Api.");
        return;
      }
      ShareContent localShareContent = getShareContent();
      try
      {
        ShareContentValidation.validateForApiShare(localShareContent);
        if ((localShareContent instanceof ShareLinkContent)) {
          shareLinkContent((ShareLinkContent)localShareContent, paramFacebookCallback);
        } else if ((localShareContent instanceof SharePhotoContent)) {
          sharePhotoContent((SharePhotoContent)localShareContent, paramFacebookCallback);
        } else if ((localShareContent instanceof ShareVideoContent)) {
          shareVideoContent((ShareVideoContent)localShareContent, paramFacebookCallback);
        } else if ((localShareContent instanceof ShareOpenGraphContent)) {
          shareOpenGraphContent((ShareOpenGraphContent)localShareContent, paramFacebookCallback);
        }
        return;
      }
      catch (FacebookException localFacebookException) {}
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramFacebookCallback, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.ShareApi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */