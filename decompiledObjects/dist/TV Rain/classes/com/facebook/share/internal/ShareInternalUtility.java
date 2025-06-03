package com.facebook.share.internal;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.Callback;
import com.facebook.GraphRequest.ParcelableResourceWithMimeType;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.CallbackManagerImpl.Callback;
import com.facebook.internal.NativeAppCallAttachmentStore;
import com.facebook.internal.NativeAppCallAttachmentStore.Attachment;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.Utility.Mapper;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.share.Sharer.Result;
import com.facebook.share.model.CameraEffectTextures;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import com.facebook.share.widget.LikeView.ObjectType;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class ShareInternalUtility
{
  public static final String MY_PHOTOS = "me/photos";
  private static final String MY_STAGING_RESOURCES = "me/staging_resources";
  private static final String STAGING_PARAM = "file";
  
  private static AppCall getAppCallFromActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
      return null;
    }
    try
    {
      paramIntent = NativeProtocol.getCallIdFromIntent(paramIntent);
      if (paramIntent == null) {
        return null;
      }
      paramIntent = AppCall.finishPendingCall(paramIntent, paramInt1);
      return paramIntent;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramIntent, ShareInternalUtility.class);
    }
    return null;
  }
  
  private static NativeAppCallAttachmentStore.Attachment getAttachment(UUID paramUUID, Uri paramUri, Bitmap paramBitmap)
  {
    boolean bool = CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class);
    Object localObject = null;
    if (bool) {
      return null;
    }
    if (paramBitmap != null)
    {
      try
      {
        paramBitmap = NativeAppCallAttachmentStore.createAttachment(paramUUID, paramBitmap);
      }
      finally
      {
        break label48;
      }
    }
    else
    {
      paramBitmap = (Bitmap)localObject;
      if (paramUri != null)
      {
        return NativeAppCallAttachmentStore.createAttachment(paramUUID, paramUri);
        label48:
        CrashShieldHandler.handleThrowable(paramUUID, ShareInternalUtility.class);
        paramBitmap = (Bitmap)localObject;
      }
    }
    return paramBitmap;
  }
  
  private static NativeAppCallAttachmentStore.Attachment getAttachment(UUID paramUUID, ShareMedia paramShareMedia)
  {
    if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
      return null;
    }
    try
    {
      Object localObject;
      if ((paramShareMedia instanceof SharePhoto))
      {
        localObject = (SharePhoto)paramShareMedia;
        paramShareMedia = ((SharePhoto)localObject).getBitmap();
        localObject = ((SharePhoto)localObject).getImageUrl();
      }
      else if ((paramShareMedia instanceof ShareVideo))
      {
        localObject = ((ShareVideo)paramShareMedia).getLocalUrl();
        paramShareMedia = null;
      }
      else
      {
        localObject = null;
        paramShareMedia = (ShareMedia)localObject;
      }
      paramUUID = getAttachment(paramUUID, (Uri)localObject, paramShareMedia);
      return paramUUID;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramUUID, ShareInternalUtility.class);
    }
    return null;
  }
  
  @Nullable
  public static Bundle getBackgroundAssetMediaInfo(ShareStoryContent paramShareStoryContent, UUID paramUUID)
  {
    if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
      return null;
    }
    if (paramShareStoryContent != null) {
      try
      {
        if (paramShareStoryContent.getBackgroundAsset() != null)
        {
          ArrayList localArrayList = new java/util/ArrayList;
          localArrayList.<init>();
          localArrayList.add(paramShareStoryContent.getBackgroundAsset());
          paramShareStoryContent = new java/util/ArrayList;
          paramShareStoryContent.<init>();
          Utility.Mapper local11 = new com/facebook/share/internal/ShareInternalUtility$11;
          local11.<init>(paramUUID, paramShareStoryContent);
          paramUUID = Utility.map(localArrayList, local11);
          NativeAppCallAttachmentStore.addAttachments(paramShareStoryContent);
          paramShareStoryContent = (Bundle)paramUUID.get(0);
          return paramShareStoryContent;
        }
      }
      finally
      {
        CrashShieldHandler.handleThrowable(paramShareStoryContent, ShareInternalUtility.class);
      }
    }
    return null;
  }
  
  public static Pair<String, String> getFieldNameAndNamespaceFromFullName(String paramString)
  {
    if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
      return null;
    }
    try
    {
      int i = paramString.indexOf(':');
      if (i != -1)
      {
        int j = paramString.length();
        int k = i + 1;
        if (j > k)
        {
          str = paramString.substring(0, i);
          paramString = paramString.substring(k);
          break label56;
        }
      }
      String str = null;
      label56:
      paramString = new Pair(str, paramString);
      return paramString;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString, ShareInternalUtility.class);
    }
    return null;
  }
  
  public static List<Bundle> getMediaInfos(ShareMediaContent paramShareMediaContent, UUID paramUUID)
  {
    if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
      return null;
    }
    if (paramShareMediaContent != null) {
      try
      {
        List localList = paramShareMediaContent.getMedia();
        if (localList != null)
        {
          paramShareMediaContent = new java/util/ArrayList;
          paramShareMediaContent.<init>();
          Utility.Mapper local6 = new com/facebook/share/internal/ShareInternalUtility$6;
          local6.<init>(paramUUID, paramShareMediaContent);
          paramUUID = Utility.map(localList, local6);
          NativeAppCallAttachmentStore.addAttachments(paramShareMediaContent);
          return paramUUID;
        }
      }
      finally
      {
        CrashShieldHandler.handleThrowable(paramShareMediaContent, ShareInternalUtility.class);
      }
    }
    return null;
  }
  
  @Nullable
  public static LikeView.ObjectType getMostSpecificObjectType(LikeView.ObjectType paramObjectType1, LikeView.ObjectType paramObjectType2)
  {
    if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
      return null;
    }
    if (paramObjectType1 == paramObjectType2) {
      return paramObjectType1;
    }
    try
    {
      LikeView.ObjectType localObjectType = LikeView.ObjectType.UNKNOWN;
      if (paramObjectType1 == localObjectType) {
        return paramObjectType2;
      }
      if (paramObjectType2 == localObjectType) {
        return paramObjectType1;
      }
      return null;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramObjectType1, ShareInternalUtility.class);
    }
    return null;
  }
  
  public static String getNativeDialogCompletionGesture(Bundle paramBundle)
  {
    if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
      return null;
    }
    try
    {
      if (paramBundle.containsKey("completionGesture")) {
        return paramBundle.getString("completionGesture");
      }
      paramBundle = paramBundle.getString("com.facebook.platform.extra.COMPLETION_GESTURE");
      return paramBundle;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramBundle, ShareInternalUtility.class);
    }
    return null;
  }
  
  public static List<String> getPhotoUrls(SharePhotoContent paramSharePhotoContent, UUID paramUUID)
  {
    if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
      return null;
    }
    if (paramSharePhotoContent != null) {
      try
      {
        List localList = paramSharePhotoContent.getPhotos();
        if (localList != null)
        {
          paramSharePhotoContent = new com/facebook/share/internal/ShareInternalUtility$4;
          paramSharePhotoContent.<init>(paramUUID);
          paramSharePhotoContent = Utility.map(localList, paramSharePhotoContent);
          paramUUID = new com/facebook/share/internal/ShareInternalUtility$5;
          paramUUID.<init>();
          paramUUID = Utility.map(paramSharePhotoContent, paramUUID);
          NativeAppCallAttachmentStore.addAttachments(paramSharePhotoContent);
          return paramUUID;
        }
      }
      finally
      {
        CrashShieldHandler.handleThrowable(paramSharePhotoContent, ShareInternalUtility.class);
      }
    }
    return null;
  }
  
  public static String getShareDialogPostId(Bundle paramBundle)
  {
    if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
      return null;
    }
    try
    {
      if (paramBundle.containsKey("postId")) {
        return paramBundle.getString("postId");
      }
      if (paramBundle.containsKey("com.facebook.platform.extra.POST_ID")) {
        return paramBundle.getString("com.facebook.platform.extra.POST_ID");
      }
      paramBundle = paramBundle.getString("post_id");
      return paramBundle;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramBundle, ShareInternalUtility.class);
    }
    return null;
  }
  
  public static ResultProcessor getShareResultProcessor(final FacebookCallback<Sharer.Result> paramFacebookCallback)
  {
    if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
      return null;
    }
    try
    {
      paramFacebookCallback = new ResultProcessor(paramFacebookCallback)
      {
        public void onCancel(AppCall paramAnonymousAppCall)
        {
          ShareInternalUtility.invokeOnCancelCallback(paramFacebookCallback);
        }
        
        public void onError(AppCall paramAnonymousAppCall, FacebookException paramAnonymousFacebookException)
        {
          ShareInternalUtility.invokeOnErrorCallback(paramFacebookCallback, paramAnonymousFacebookException);
        }
        
        public void onSuccess(AppCall paramAnonymousAppCall, Bundle paramAnonymousBundle)
        {
          if (paramAnonymousBundle != null)
          {
            paramAnonymousAppCall = ShareInternalUtility.getNativeDialogCompletionGesture(paramAnonymousBundle);
            if ((paramAnonymousAppCall != null) && (!"post".equalsIgnoreCase(paramAnonymousAppCall)))
            {
              if ("cancel".equalsIgnoreCase(paramAnonymousAppCall)) {
                ShareInternalUtility.invokeOnCancelCallback(paramFacebookCallback);
              } else {
                ShareInternalUtility.invokeOnErrorCallback(paramFacebookCallback, new FacebookException("UnknownError"));
              }
            }
            else
            {
              paramAnonymousAppCall = ShareInternalUtility.getShareDialogPostId(paramAnonymousBundle);
              ShareInternalUtility.invokeOnSuccessCallback(paramFacebookCallback, paramAnonymousAppCall);
            }
          }
        }
      };
      return paramFacebookCallback;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramFacebookCallback, ShareInternalUtility.class);
    }
    return null;
  }
  
  @Nullable
  public static Bundle getStickerUrl(ShareStoryContent paramShareStoryContent, UUID paramUUID)
  {
    if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
      return null;
    }
    if (paramShareStoryContent != null) {
      try
      {
        if (paramShareStoryContent.getStickerAsset() != null)
        {
          ArrayList localArrayList = new java/util/ArrayList;
          localArrayList.<init>();
          localArrayList.add(paramShareStoryContent.getStickerAsset());
          paramShareStoryContent = new com/facebook/share/internal/ShareInternalUtility$9;
          paramShareStoryContent.<init>(paramUUID);
          paramShareStoryContent = Utility.map(localArrayList, paramShareStoryContent);
          paramUUID = new com/facebook/share/internal/ShareInternalUtility$10;
          paramUUID.<init>();
          paramUUID = Utility.map(paramShareStoryContent, paramUUID);
          NativeAppCallAttachmentStore.addAttachments(paramShareStoryContent);
          paramShareStoryContent = (Bundle)paramUUID.get(0);
          return paramShareStoryContent;
        }
      }
      finally
      {
        CrashShieldHandler.handleThrowable(paramShareStoryContent, ShareInternalUtility.class);
      }
    }
    return null;
  }
  
  public static Bundle getTextureUrlBundle(ShareCameraEffectContent paramShareCameraEffectContent, UUID paramUUID)
  {
    if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
      return null;
    }
    if (paramShareCameraEffectContent != null) {
      try
      {
        CameraEffectTextures localCameraEffectTextures = paramShareCameraEffectContent.getTextures();
        if (localCameraEffectTextures != null)
        {
          Bundle localBundle = new android/os/Bundle;
          localBundle.<init>();
          ArrayList localArrayList = new java/util/ArrayList;
          localArrayList.<init>();
          paramShareCameraEffectContent = localCameraEffectTextures.keySet().iterator();
          while (paramShareCameraEffectContent.hasNext())
          {
            String str = (String)paramShareCameraEffectContent.next();
            NativeAppCallAttachmentStore.Attachment localAttachment = getAttachment(paramUUID, localCameraEffectTextures.getTextureUri(str), localCameraEffectTextures.getTextureBitmap(str));
            localArrayList.add(localAttachment);
            localBundle.putString(str, localAttachment.getAttachmentUrl());
          }
          NativeAppCallAttachmentStore.addAttachments(localArrayList);
          return localBundle;
        }
      }
      finally
      {
        CrashShieldHandler.handleThrowable(paramShareCameraEffectContent, ShareInternalUtility.class);
      }
    }
    return null;
  }
  
  @Nullable
  public static String getUriExtension(Uri paramUri)
  {
    if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
      return null;
    }
    if (paramUri == null) {
      return null;
    }
    try
    {
      paramUri = paramUri.toString();
      int i = paramUri.lastIndexOf('.');
      if (i == -1) {
        return null;
      }
      paramUri = paramUri.substring(i);
      return paramUri;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramUri, ShareInternalUtility.class);
    }
    return null;
  }
  
  public static String getVideoUrl(ShareVideoContent paramShareVideoContent, UUID paramUUID)
  {
    if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
      return null;
    }
    if (paramShareVideoContent != null) {
      try
      {
        if (paramShareVideoContent.getVideo() != null)
        {
          paramUUID = NativeAppCallAttachmentStore.createAttachment(paramUUID, paramShareVideoContent.getVideo().getLocalUrl());
          paramShareVideoContent = new java/util/ArrayList;
          paramShareVideoContent.<init>(1);
          paramShareVideoContent.add(paramUUID);
          NativeAppCallAttachmentStore.addAttachments(paramShareVideoContent);
          paramShareVideoContent = paramUUID.getAttachmentUrl();
          return paramShareVideoContent;
        }
      }
      finally
      {
        CrashShieldHandler.handleThrowable(paramShareVideoContent, ShareInternalUtility.class);
      }
    }
    return null;
  }
  
  public static boolean handleActivityResult(int paramInt1, int paramInt2, Intent paramIntent, ResultProcessor paramResultProcessor)
  {
    if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
      return false;
    }
    try
    {
      AppCall localAppCall = getAppCallFromActivityResult(paramInt1, paramInt2, paramIntent);
      if (localAppCall == null) {
        return false;
      }
      NativeAppCallAttachmentStore.cleanupAttachmentsForCall(localAppCall.getCallId());
      if (paramResultProcessor == null) {
        return true;
      }
      FacebookException localFacebookException = NativeProtocol.getExceptionFromErrorData(NativeProtocol.getErrorDataFromResultIntent(paramIntent));
      if (localFacebookException != null)
      {
        if ((localFacebookException instanceof FacebookOperationCanceledException)) {
          paramResultProcessor.onCancel(localAppCall);
        } else {
          paramResultProcessor.onError(localAppCall, localFacebookException);
        }
      }
      else {
        paramResultProcessor.onSuccess(localAppCall, NativeProtocol.getSuccessResultsFromIntent(paramIntent));
      }
      return true;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramIntent, ShareInternalUtility.class);
    }
    return false;
  }
  
  public static void invokeCallbackWithError(FacebookCallback<Sharer.Result> paramFacebookCallback, String paramString)
  {
    if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
      return;
    }
    try
    {
      invokeOnErrorCallback(paramFacebookCallback, paramString);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramFacebookCallback, ShareInternalUtility.class);
    }
  }
  
  public static void invokeCallbackWithException(FacebookCallback<Sharer.Result> paramFacebookCallback, Exception paramException)
  {
    if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
      return;
    }
    try
    {
      if ((paramException instanceof FacebookException))
      {
        invokeOnErrorCallback(paramFacebookCallback, (FacebookException)paramException);
        return;
      }
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append("Error preparing share content: ");
      localStringBuilder.append(paramException.getLocalizedMessage());
      invokeCallbackWithError(paramFacebookCallback, localStringBuilder.toString());
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramFacebookCallback, ShareInternalUtility.class);
    }
  }
  
  public static void invokeCallbackWithResults(FacebookCallback<Sharer.Result> paramFacebookCallback, String paramString, GraphResponse paramGraphResponse)
  {
    if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
      return;
    }
    try
    {
      Object localObject = paramGraphResponse.getError();
      if (localObject != null)
      {
        localObject = ((FacebookRequestError)localObject).getErrorMessage();
        paramString = (String)localObject;
        if (Utility.isNullOrEmpty((String)localObject)) {
          paramString = "Unexpected error sharing.";
        }
        invokeOnErrorCallback(paramFacebookCallback, paramGraphResponse, paramString);
      }
      else
      {
        invokeOnSuccessCallback(paramFacebookCallback, paramString);
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramFacebookCallback, ShareInternalUtility.class);
    }
  }
  
  public static void invokeOnCancelCallback(FacebookCallback<Sharer.Result> paramFacebookCallback)
  {
    if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
      return;
    }
    try
    {
      logShareResult("cancelled", null);
      if (paramFacebookCallback != null) {
        paramFacebookCallback.onCancel();
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramFacebookCallback, ShareInternalUtility.class);
    }
  }
  
  public static void invokeOnErrorCallback(FacebookCallback<Sharer.Result> paramFacebookCallback, FacebookException paramFacebookException)
  {
    if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
      return;
    }
    try
    {
      logShareResult("error", paramFacebookException.getMessage());
      if (paramFacebookCallback != null) {
        paramFacebookCallback.onError(paramFacebookException);
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramFacebookCallback, ShareInternalUtility.class);
    }
  }
  
  public static void invokeOnErrorCallback(FacebookCallback<Sharer.Result> paramFacebookCallback, GraphResponse paramGraphResponse, String paramString)
  {
    if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
      return;
    }
    try
    {
      logShareResult("error", paramString);
      if (paramFacebookCallback != null)
      {
        FacebookGraphResponseException localFacebookGraphResponseException = new com/facebook/FacebookGraphResponseException;
        localFacebookGraphResponseException.<init>(paramGraphResponse, paramString);
        paramFacebookCallback.onError(localFacebookGraphResponseException);
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramFacebookCallback, ShareInternalUtility.class);
    }
  }
  
  public static void invokeOnErrorCallback(FacebookCallback<Sharer.Result> paramFacebookCallback, String paramString)
  {
    if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
      return;
    }
    try
    {
      logShareResult("error", paramString);
      if (paramFacebookCallback != null)
      {
        FacebookException localFacebookException = new com/facebook/FacebookException;
        localFacebookException.<init>(paramString);
        paramFacebookCallback.onError(localFacebookException);
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramFacebookCallback, ShareInternalUtility.class);
    }
  }
  
  public static void invokeOnSuccessCallback(FacebookCallback<Sharer.Result> paramFacebookCallback, String paramString)
  {
    if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
      return;
    }
    try
    {
      logShareResult("succeeded", null);
      if (paramFacebookCallback != null)
      {
        Sharer.Result localResult = new com/facebook/share/Sharer$Result;
        localResult.<init>(paramString);
        paramFacebookCallback.onSuccess(localResult);
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramFacebookCallback, ShareInternalUtility.class);
    }
  }
  
  private static void logShareResult(String paramString1, String paramString2)
  {
    if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
      return;
    }
    try
    {
      Object localObject = FacebookSdk.getApplicationContext();
      InternalAppEventsLogger localInternalAppEventsLogger = new com/facebook/appevents/InternalAppEventsLogger;
      localInternalAppEventsLogger.<init>((Context)localObject);
      localObject = new android/os/Bundle;
      ((Bundle)localObject).<init>();
      ((BaseBundle)localObject).putString("fb_share_dialog_outcome", paramString1);
      if (paramString2 != null) {
        ((BaseBundle)localObject).putString("error_message", paramString2);
      }
      localInternalAppEventsLogger.logEventImplicitly("fb_share_dialog_result", (Bundle)localObject);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString1, ShareInternalUtility.class);
    }
  }
  
  public static GraphRequest newUploadStagingResourceWithImageRequest(AccessToken paramAccessToken, Bitmap paramBitmap, GraphRequest.Callback paramCallback)
  {
    if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
      return null;
    }
    try
    {
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>(1);
      localBundle.putParcelable("file", paramBitmap);
      paramAccessToken = new GraphRequest(paramAccessToken, "me/staging_resources", localBundle, HttpMethod.POST, paramCallback);
      return paramAccessToken;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramAccessToken, ShareInternalUtility.class);
    }
    return null;
  }
  
  public static GraphRequest newUploadStagingResourceWithImageRequest(AccessToken paramAccessToken, Uri paramUri, GraphRequest.Callback paramCallback)
    throws FileNotFoundException
  {
    if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
      return null;
    }
    try
    {
      Object localObject;
      if (Utility.isFileUri(paramUri))
      {
        localObject = new java/io/File;
        ((File)localObject).<init>(paramUri.getPath());
        return newUploadStagingResourceWithImageRequest(paramAccessToken, (File)localObject, paramCallback);
      }
      if (Utility.isContentUri(paramUri))
      {
        localObject = new com/facebook/GraphRequest$ParcelableResourceWithMimeType;
        ((GraphRequest.ParcelableResourceWithMimeType)localObject).<init>(paramUri, "image/png");
        paramUri = new android/os/Bundle;
        paramUri.<init>(1);
        paramUri.putParcelable("file", (Parcelable)localObject);
        return new GraphRequest(paramAccessToken, "me/staging_resources", paramUri, HttpMethod.POST, paramCallback);
      }
      paramAccessToken = new com/facebook/FacebookException;
      paramAccessToken.<init>("The image Uri must be either a file:// or content:// Uri");
      throw paramAccessToken;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramAccessToken, ShareInternalUtility.class);
    }
    return null;
  }
  
  public static GraphRequest newUploadStagingResourceWithImageRequest(AccessToken paramAccessToken, File paramFile, GraphRequest.Callback paramCallback)
    throws FileNotFoundException
  {
    if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
      return null;
    }
    try
    {
      Object localObject = ParcelFileDescriptor.open(paramFile, 268435456);
      paramFile = new com/facebook/GraphRequest$ParcelableResourceWithMimeType;
      paramFile.<init>((Parcelable)localObject, "image/png");
      localObject = new android/os/Bundle;
      ((Bundle)localObject).<init>(1);
      ((Bundle)localObject).putParcelable("file", paramFile);
      paramAccessToken = new GraphRequest(paramAccessToken, "me/staging_resources", (Bundle)localObject, HttpMethod.POST, paramCallback);
      return paramAccessToken;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramAccessToken, ShareInternalUtility.class);
    }
    return null;
  }
  
  public static void registerSharerCallback(int paramInt, CallbackManager paramCallbackManager, FacebookCallback<Sharer.Result> paramFacebookCallback)
  {
    if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
      return;
    }
    try
    {
      if ((paramCallbackManager instanceof CallbackManagerImpl))
      {
        CallbackManagerImpl localCallbackManagerImpl = (CallbackManagerImpl)paramCallbackManager;
        paramCallbackManager = new com/facebook/share/internal/ShareInternalUtility$3;
        paramCallbackManager.<init>(paramInt, paramFacebookCallback);
        localCallbackManagerImpl.registerCallback(paramInt, paramCallbackManager);
        return;
      }
      paramCallbackManager = new com/facebook/FacebookException;
      paramCallbackManager.<init>("Unexpected CallbackManager, please use the provided Factory.");
      throw paramCallbackManager;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramCallbackManager, ShareInternalUtility.class);
    }
  }
  
  public static void registerStaticShareCallback(int paramInt)
  {
    if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
      return;
    }
    try
    {
      CallbackManagerImpl.Callback local2 = new com/facebook/share/internal/ShareInternalUtility$2;
      local2.<init>(paramInt);
      CallbackManagerImpl.registerStaticCallback(paramInt, local2);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, ShareInternalUtility.class);
    }
  }
  
  public static JSONArray removeNamespacesFromOGJsonArray(JSONArray paramJSONArray, boolean paramBoolean)
    throws JSONException
  {
    if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
      return null;
    }
    try
    {
      JSONArray localJSONArray = new org/json/JSONArray;
      localJSONArray.<init>();
      for (int i = 0; i < paramJSONArray.length(); i++)
      {
        Object localObject1 = paramJSONArray.get(i);
        Object localObject2;
        if ((localObject1 instanceof JSONArray))
        {
          localObject2 = removeNamespacesFromOGJsonArray((JSONArray)localObject1, paramBoolean);
        }
        else
        {
          localObject2 = localObject1;
          if ((localObject1 instanceof JSONObject)) {
            localObject2 = removeNamespacesFromOGJsonObject((JSONObject)localObject1, paramBoolean);
          }
        }
        localJSONArray.put(localObject2);
      }
      return localJSONArray;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramJSONArray, ShareInternalUtility.class);
    }
    return null;
  }
  
  /* Error */
  public static JSONObject removeNamespacesFromOGJsonObject(JSONObject paramJSONObject, boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 49	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   5: ifeq +5 -> 10
    //   8: aconst_null
    //   9: areturn
    //   10: aload_0
    //   11: ifnonnull +5 -> 16
    //   14: aconst_null
    //   15: areturn
    //   16: new 535	org/json/JSONObject
    //   19: astore_2
    //   20: aload_2
    //   21: invokespecial 544	org/json/JSONObject:<init>	()V
    //   24: new 535	org/json/JSONObject
    //   27: astore_3
    //   28: aload_3
    //   29: invokespecial 544	org/json/JSONObject:<init>	()V
    //   32: aload_0
    //   33: invokevirtual 548	org/json/JSONObject:names	()Lorg/json/JSONArray;
    //   36: astore 4
    //   38: iconst_0
    //   39: istore 5
    //   41: iload 5
    //   43: aload 4
    //   45: invokevirtual 530	org/json/JSONArray:length	()I
    //   48: if_icmpge +210 -> 258
    //   51: aload 4
    //   53: iload 5
    //   55: invokevirtual 550	org/json/JSONArray:getString	(I)Ljava/lang/String;
    //   58: astore 6
    //   60: aload_0
    //   61: aload 6
    //   63: invokevirtual 553	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   66: astore 7
    //   68: aload 7
    //   70: instanceof 535
    //   73: ifeq +17 -> 90
    //   76: aload 7
    //   78: checkcast 535	org/json/JSONObject
    //   81: iconst_1
    //   82: invokestatic 539	com/facebook/share/internal/ShareInternalUtility:removeNamespacesFromOGJsonObject	(Lorg/json/JSONObject;Z)Lorg/json/JSONObject;
    //   85: astore 8
    //   87: goto +26 -> 113
    //   90: aload 7
    //   92: astore 8
    //   94: aload 7
    //   96: instanceof 528
    //   99: ifeq +14 -> 113
    //   102: aload 7
    //   104: checkcast 528	org/json/JSONArray
    //   107: iconst_1
    //   108: invokestatic 533	com/facebook/share/internal/ShareInternalUtility:removeNamespacesFromOGJsonArray	(Lorg/json/JSONArray;Z)Lorg/json/JSONArray;
    //   111: astore 8
    //   113: aload 6
    //   115: invokestatic 555	com/facebook/share/internal/ShareInternalUtility:getFieldNameAndNamespaceFromFullName	(Ljava/lang/String;)Landroid/util/Pair;
    //   118: astore 9
    //   120: aload 9
    //   122: getfield 559	android/util/Pair:first	Ljava/lang/Object;
    //   125: checkcast 138	java/lang/String
    //   128: astore 7
    //   130: aload 9
    //   132: getfield 562	android/util/Pair:second	Ljava/lang/Object;
    //   135: checkcast 138	java/lang/String
    //   138: astore 9
    //   140: iload_1
    //   141: ifeq +74 -> 215
    //   144: aload 7
    //   146: ifnull +26 -> 172
    //   149: aload 7
    //   151: ldc_w 564
    //   154: invokevirtual 567	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   157: ifeq +15 -> 172
    //   160: aload_2
    //   161: aload 6
    //   163: aload 8
    //   165: invokevirtual 570	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   168: pop
    //   169: goto +83 -> 252
    //   172: aload 7
    //   174: ifnull +29 -> 203
    //   177: aload 7
    //   179: ldc_w 572
    //   182: invokevirtual 567	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   185: ifeq +6 -> 191
    //   188: goto +15 -> 203
    //   191: aload_3
    //   192: aload 9
    //   194: aload 8
    //   196: invokevirtual 570	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   199: pop
    //   200: goto +52 -> 252
    //   203: aload_2
    //   204: aload 9
    //   206: aload 8
    //   208: invokevirtual 570	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   211: pop
    //   212: goto +40 -> 252
    //   215: aload 7
    //   217: ifnull +26 -> 243
    //   220: aload 7
    //   222: ldc_w 574
    //   225: invokevirtual 567	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   228: ifeq +15 -> 243
    //   231: aload_2
    //   232: aload 6
    //   234: aload 8
    //   236: invokevirtual 570	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   239: pop
    //   240: goto +12 -> 252
    //   243: aload_2
    //   244: aload 9
    //   246: aload 8
    //   248: invokevirtual 570	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   251: pop
    //   252: iinc 5 1
    //   255: goto -214 -> 41
    //   258: aload_3
    //   259: invokevirtual 575	org/json/JSONObject:length	()I
    //   262: ifle +12 -> 274
    //   265: aload_2
    //   266: ldc_w 577
    //   269: aload_3
    //   270: invokevirtual 570	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   273: pop
    //   274: aload_2
    //   275: areturn
    //   276: astore_0
    //   277: goto +17 -> 294
    //   280: astore_0
    //   281: new 344	com/facebook/FacebookException
    //   284: astore_0
    //   285: aload_0
    //   286: ldc_w 579
    //   289: invokespecial 420	com/facebook/FacebookException:<init>	(Ljava/lang/String;)V
    //   292: aload_0
    //   293: athrow
    //   294: aload_0
    //   295: ldc 2
    //   297: invokestatic 56	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   300: aconst_null
    //   301: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	302	0	paramJSONObject	JSONObject
    //   0	302	1	paramBoolean	boolean
    //   19	256	2	localJSONObject1	JSONObject
    //   27	243	3	localJSONObject2	JSONObject
    //   36	16	4	localJSONArray	JSONArray
    //   39	214	5	i	int
    //   58	175	6	str	String
    //   66	155	7	localObject1	Object
    //   85	162	8	localObject2	Object
    //   118	127	9	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   16	38	276	finally
    //   41	87	276	finally
    //   94	113	276	finally
    //   113	140	276	finally
    //   149	169	276	finally
    //   177	188	276	finally
    //   191	200	276	finally
    //   203	212	276	finally
    //   220	240	276	finally
    //   243	252	276	finally
    //   258	274	276	finally
    //   281	294	276	finally
    //   16	38	280	org/json/JSONException
    //   41	87	280	org/json/JSONException
    //   94	113	280	org/json/JSONException
    //   113	140	280	org/json/JSONException
    //   149	169	280	org/json/JSONException
    //   177	188	280	org/json/JSONException
    //   191	200	280	org/json/JSONException
    //   203	212	280	org/json/JSONException
    //   220	240	280	org/json/JSONException
    //   243	252	280	org/json/JSONException
    //   258	274	280	org/json/JSONException
  }
  
  public static JSONObject toJSONObjectForCall(UUID paramUUID, ShareOpenGraphContent paramShareOpenGraphContent)
    throws JSONException
  {
    if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
      return null;
    }
    try
    {
      ShareOpenGraphAction localShareOpenGraphAction = paramShareOpenGraphContent.getAction();
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      Object localObject = new com/facebook/share/internal/ShareInternalUtility$7;
      ((7)localObject).<init>(paramUUID, localArrayList);
      localObject = OpenGraphJSONUtility.toJSONObject(localShareOpenGraphAction, (OpenGraphJSONUtility.PhotoJSONProcessor)localObject);
      NativeAppCallAttachmentStore.addAttachments(localArrayList);
      if ((paramShareOpenGraphContent.getPlaceId() != null) && (Utility.isNullOrEmpty(((JSONObject)localObject).optString("place")))) {
        ((JSONObject)localObject).put("place", paramShareOpenGraphContent.getPlaceId());
      }
      if (paramShareOpenGraphContent.getPeopleIds() != null)
      {
        paramUUID = ((JSONObject)localObject).optJSONArray("tags");
        if (paramUUID == null)
        {
          paramUUID = new java/util/HashSet;
          paramUUID.<init>();
        }
        else
        {
          paramUUID = Utility.jsonArrayToSet(paramUUID);
        }
        paramShareOpenGraphContent = paramShareOpenGraphContent.getPeopleIds().iterator();
        while (paramShareOpenGraphContent.hasNext()) {
          paramUUID.add((String)paramShareOpenGraphContent.next());
        }
        paramShareOpenGraphContent = new org/json/JSONArray;
        paramShareOpenGraphContent.<init>(paramUUID);
        ((JSONObject)localObject).put("tags", paramShareOpenGraphContent);
      }
      return (JSONObject)localObject;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramUUID, ShareInternalUtility.class);
    }
    return null;
  }
  
  public static JSONObject toJSONObjectForWeb(ShareOpenGraphContent paramShareOpenGraphContent)
    throws JSONException
  {
    if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
      return null;
    }
    try
    {
      ShareOpenGraphAction localShareOpenGraphAction = paramShareOpenGraphContent.getAction();
      paramShareOpenGraphContent = new com/facebook/share/internal/ShareInternalUtility$8;
      paramShareOpenGraphContent.<init>();
      paramShareOpenGraphContent = OpenGraphJSONUtility.toJSONObject(localShareOpenGraphAction, paramShareOpenGraphContent);
      return paramShareOpenGraphContent;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramShareOpenGraphContent, ShareInternalUtility.class);
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.internal.ShareInternalUtility
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */