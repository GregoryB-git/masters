package com.facebook.share.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.AccessTokenTracker;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.Callback;
import com.facebook.GraphRequest.OnProgressCallback;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.internal.WorkQueue;
import com.facebook.internal.WorkQueue.WorkItem;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.share.Sharer.Result;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.AbstractCollection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import z2;

public class VideoUploader
{
  private static final String ERROR_BAD_SERVER_RESPONSE = "Unexpected error in server response";
  private static final String ERROR_UPLOAD = "Video upload failed";
  private static final int MAX_RETRIES_PER_PHASE = 2;
  private static final String PARAM_DESCRIPTION = "description";
  private static final String PARAM_END_OFFSET = "end_offset";
  private static final String PARAM_FILE_SIZE = "file_size";
  private static final String PARAM_REF = "ref";
  private static final String PARAM_SESSION_ID = "upload_session_id";
  private static final String PARAM_START_OFFSET = "start_offset";
  private static final String PARAM_TITLE = "title";
  private static final String PARAM_UPLOAD_PHASE = "upload_phase";
  private static final String PARAM_VALUE_UPLOAD_FINISH_PHASE = "finish";
  private static final String PARAM_VALUE_UPLOAD_START_PHASE = "start";
  private static final String PARAM_VALUE_UPLOAD_TRANSFER_PHASE = "transfer";
  private static final String PARAM_VIDEO_FILE_CHUNK = "video_file_chunk";
  private static final String PARAM_VIDEO_ID = "video_id";
  private static final int RETRY_DELAY_BACK_OFF_FACTOR = 3;
  private static final int RETRY_DELAY_UNIT_MS = 5000;
  private static final String TAG = "VideoUploader";
  private static final int UPLOAD_QUEUE_MAX_CONCURRENT = 8;
  private static AccessTokenTracker accessTokenTracker;
  private static Handler handler;
  private static boolean initialized;
  private static Set<UploadContext> pendingUploads = new HashSet();
  private static WorkQueue uploadQueue = new WorkQueue(8);
  
  private static void cancelAllRequests()
  {
    try
    {
      Iterator localIterator = pendingUploads.iterator();
      while (localIterator.hasNext()) {
        nextisCanceled = true;
      }
      return;
    }
    finally {}
  }
  
  private static void enqueueRequest(UploadContext paramUploadContext, Runnable paramRunnable)
  {
    try
    {
      workItem = uploadQueue.addActiveWorkItem(paramRunnable);
      return;
    }
    finally
    {
      paramUploadContext = finally;
      throw paramUploadContext;
    }
  }
  
  private static void enqueueUploadChunk(UploadContext paramUploadContext, String paramString1, String paramString2, int paramInt)
  {
    enqueueRequest(paramUploadContext, new TransferChunkWorkItem(paramUploadContext, paramString1, paramString2, paramInt));
  }
  
  private static void enqueueUploadFinish(UploadContext paramUploadContext, int paramInt)
  {
    enqueueRequest(paramUploadContext, new FinishUploadWorkItem(paramUploadContext, paramInt));
  }
  
  private static void enqueueUploadStart(UploadContext paramUploadContext, int paramInt)
  {
    enqueueRequest(paramUploadContext, new StartUploadWorkItem(paramUploadContext, paramInt));
  }
  
  private static byte[] getChunk(UploadContext paramUploadContext, String paramString1, String paramString2)
    throws IOException
  {
    if (!Utility.areObjectsEqual(paramString1, chunkStart))
    {
      logError(null, "Error reading video chunk. Expected chunk '%s'. Requested chunk '%s'.", new Object[] { chunkStart, paramString1 });
      return null;
    }
    long l = Long.parseLong(paramString1);
    int i = (int)(Long.parseLong(paramString2) - l);
    paramString1 = new ByteArrayOutputStream();
    byte[] arrayOfByte = new byte[Math.min(8192, i)];
    int j;
    int k;
    do
    {
      j = videoStream.read(arrayOfByte);
      if (j == -1) {
        break;
      }
      paramString1.write(arrayOfByte, 0, j);
      k = i - j;
      if (k == 0) {
        break;
      }
      i = k;
    } while (k >= 0);
    logError(null, "Error reading video chunk. Expected buffer length - '%d'. Actual - '%d'.", new Object[] { Integer.valueOf(k + j), Integer.valueOf(j) });
    return null;
    chunkStart = paramString2;
    return paramString1.toByteArray();
  }
  
  private static Handler getHandler()
  {
    try
    {
      if (handler == null)
      {
        localHandler = new android/os/Handler;
        localHandler.<init>(Looper.getMainLooper());
        handler = localHandler;
      }
      Handler localHandler = handler;
      return localHandler;
    }
    finally {}
  }
  
  private static void issueResponse(UploadContext paramUploadContext, FacebookException paramFacebookException, GraphResponse paramGraphResponse, String paramString)
  {
    removePendingUpload(paramUploadContext);
    Utility.closeQuietly(videoStream);
    FacebookCallback localFacebookCallback = callback;
    if (localFacebookCallback != null) {
      if (paramFacebookException != null) {
        ShareInternalUtility.invokeOnErrorCallback(localFacebookCallback, paramFacebookException);
      } else if (isCanceled) {
        ShareInternalUtility.invokeOnCancelCallback(localFacebookCallback);
      } else {
        ShareInternalUtility.invokeOnSuccessCallback(localFacebookCallback, paramString);
      }
    }
    if ((progressCallback == null) || (paramGraphResponse != null)) {}
    try
    {
      if (paramGraphResponse.getJSONObject() != null) {
        paramGraphResponse.getJSONObject().put("video_id", paramString);
      }
      progressCallback.onCompleted(paramGraphResponse);
      return;
    }
    catch (JSONException paramFacebookException)
    {
      for (;;) {}
    }
  }
  
  private static void logError(Exception paramException, String paramString, Object... paramVarArgs)
  {
    Log.e("VideoUploader", String.format(Locale.ROOT, paramString, paramVarArgs), paramException);
  }
  
  private static void registerAccessTokenTracker()
  {
    accessTokenTracker = new AccessTokenTracker()
    {
      public void onCurrentAccessTokenChanged(AccessToken paramAnonymousAccessToken1, AccessToken paramAnonymousAccessToken2)
      {
        if (paramAnonymousAccessToken1 == null) {
          return;
        }
        if ((paramAnonymousAccessToken2 == null) || (!Utility.areObjectsEqual(paramAnonymousAccessToken2.getUserId(), paramAnonymousAccessToken1.getUserId()))) {
          VideoUploader.access$200();
        }
      }
    };
  }
  
  private static void removePendingUpload(UploadContext paramUploadContext)
  {
    try
    {
      pendingUploads.remove(paramUploadContext);
      return;
    }
    finally
    {
      paramUploadContext = finally;
      throw paramUploadContext;
    }
  }
  
  public static void uploadAsync(ShareVideoContent paramShareVideoContent, String paramString, FacebookCallback<Sharer.Result> paramFacebookCallback)
    throws FileNotFoundException
  {
    try
    {
      uploadAsync(paramShareVideoContent, paramString, paramFacebookCallback, null);
      return;
    }
    finally
    {
      paramShareVideoContent = finally;
      throw paramShareVideoContent;
    }
  }
  
  private static void uploadAsync(ShareVideoContent paramShareVideoContent, String paramString, FacebookCallback<Sharer.Result> paramFacebookCallback, GraphRequest.OnProgressCallback paramOnProgressCallback)
    throws FileNotFoundException
  {
    try
    {
      if (!initialized)
      {
        registerAccessTokenTracker();
        initialized = true;
      }
      Validate.notNull(paramShareVideoContent, "videoContent");
      Validate.notNull(paramString, "graphNode");
      Object localObject = paramShareVideoContent.getVideo();
      Validate.notNull(localObject, "videoContent.video");
      Validate.notNull(((ShareVideo)localObject).getLocalUrl(), "videoContent.video.localUrl");
      localObject = new com/facebook/share/internal/VideoUploader$UploadContext;
      ((UploadContext)localObject).<init>(paramShareVideoContent, paramString, paramFacebookCallback, paramOnProgressCallback, null);
      UploadContext.access$100((UploadContext)localObject);
      pendingUploads.add(localObject);
      enqueueUploadStart((UploadContext)localObject, 0);
      return;
    }
    finally {}
  }
  
  public static void uploadAsyncWithProgressCallback(ShareVideoContent paramShareVideoContent, GraphRequest.OnProgressCallback paramOnProgressCallback)
    throws FileNotFoundException
  {
    try
    {
      uploadAsync(paramShareVideoContent, "me", null, paramOnProgressCallback);
      return;
    }
    finally
    {
      paramShareVideoContent = finally;
      throw paramShareVideoContent;
    }
  }
  
  public static void uploadAsyncWithProgressCallback(ShareVideoContent paramShareVideoContent, String paramString, GraphRequest.OnProgressCallback paramOnProgressCallback)
    throws FileNotFoundException
  {
    try
    {
      uploadAsync(paramShareVideoContent, paramString, null, paramOnProgressCallback);
      return;
    }
    finally
    {
      paramShareVideoContent = finally;
      throw paramShareVideoContent;
    }
  }
  
  public static class FinishUploadWorkItem
    extends VideoUploader.UploadWorkItemBase
  {
    public static final Set<Integer> transientErrorCodes = new HashSet() {};
    
    public FinishUploadWorkItem(VideoUploader.UploadContext paramUploadContext, int paramInt)
    {
      super(paramInt);
    }
    
    public void enqueueRetry(int paramInt)
    {
      VideoUploader.access$700(uploadContext, paramInt);
    }
    
    public Bundle getParameters()
    {
      Bundle localBundle1 = new Bundle();
      Bundle localBundle2 = uploadContext.params;
      if (localBundle2 != null) {
        localBundle1.putAll(localBundle2);
      }
      localBundle1.putString("upload_phase", "finish");
      localBundle1.putString("upload_session_id", uploadContext.sessionId);
      Utility.putNonEmptyString(localBundle1, "title", uploadContext.title);
      Utility.putNonEmptyString(localBundle1, "description", uploadContext.description);
      Utility.putNonEmptyString(localBundle1, "ref", uploadContext.ref);
      return localBundle1;
    }
    
    public Set<Integer> getTransientErrorCodes()
    {
      return transientErrorCodes;
    }
    
    public void handleError(FacebookException paramFacebookException)
    {
      VideoUploader.access$400(paramFacebookException, "Video '%s' failed to finish uploading", new Object[] { uploadContext.videoId });
      endUploadWithFailure(paramFacebookException);
    }
    
    public void handleSuccess(JSONObject paramJSONObject)
      throws JSONException
    {
      if (paramJSONObject.getBoolean("success")) {
        issueResponseOnMainThread(null, uploadContext.videoId);
      } else {
        handleError(new FacebookException("Unexpected error in server response"));
      }
    }
  }
  
  public static class StartUploadWorkItem
    extends VideoUploader.UploadWorkItemBase
  {
    public static final Set<Integer> transientErrorCodes = new HashSet() {};
    
    public StartUploadWorkItem(VideoUploader.UploadContext paramUploadContext, int paramInt)
    {
      super(paramInt);
    }
    
    public void enqueueRetry(int paramInt)
    {
      VideoUploader.access$500(uploadContext, paramInt);
    }
    
    public Bundle getParameters()
    {
      Bundle localBundle = z2.d("upload_phase", "start");
      localBundle.putLong("file_size", uploadContext.videoSize);
      return localBundle;
    }
    
    public Set<Integer> getTransientErrorCodes()
    {
      return transientErrorCodes;
    }
    
    public void handleError(FacebookException paramFacebookException)
    {
      VideoUploader.access$400(paramFacebookException, "Error starting video upload", new Object[0]);
      endUploadWithFailure(paramFacebookException);
    }
    
    public void handleSuccess(JSONObject paramJSONObject)
      throws JSONException
    {
      uploadContext.sessionId = paramJSONObject.getString("upload_session_id");
      uploadContext.videoId = paramJSONObject.getString("video_id");
      String str1 = paramJSONObject.getString("start_offset");
      String str2 = paramJSONObject.getString("end_offset");
      if (uploadContext.progressCallback != null)
      {
        long l = Long.parseLong(str1);
        paramJSONObject = uploadContext;
        progressCallback.onProgress(l, videoSize);
      }
      VideoUploader.access$300(uploadContext, str1, str2, 0);
    }
  }
  
  public static class TransferChunkWorkItem
    extends VideoUploader.UploadWorkItemBase
  {
    public static final Set<Integer> transientErrorCodes = new HashSet() {};
    private String chunkEnd;
    private String chunkStart;
    
    public TransferChunkWorkItem(VideoUploader.UploadContext paramUploadContext, String paramString1, String paramString2, int paramInt)
    {
      super(paramInt);
      chunkStart = paramString1;
      chunkEnd = paramString2;
    }
    
    public void enqueueRetry(int paramInt)
    {
      VideoUploader.access$300(uploadContext, chunkStart, chunkEnd, paramInt);
    }
    
    public Bundle getParameters()
      throws IOException
    {
      Bundle localBundle = z2.d("upload_phase", "transfer");
      localBundle.putString("upload_session_id", uploadContext.sessionId);
      localBundle.putString("start_offset", chunkStart);
      byte[] arrayOfByte = VideoUploader.access$600(uploadContext, chunkStart, chunkEnd);
      if (arrayOfByte != null)
      {
        localBundle.putByteArray("video_file_chunk", arrayOfByte);
        return localBundle;
      }
      throw new FacebookException("Error reading video");
    }
    
    public Set<Integer> getTransientErrorCodes()
    {
      return transientErrorCodes;
    }
    
    public void handleError(FacebookException paramFacebookException)
    {
      VideoUploader.access$400(paramFacebookException, "Error uploading video '%s'", new Object[] { uploadContext.videoId });
      endUploadWithFailure(paramFacebookException);
    }
    
    public void handleSuccess(JSONObject paramJSONObject)
      throws JSONException
    {
      String str1 = paramJSONObject.getString("start_offset");
      String str2 = paramJSONObject.getString("end_offset");
      if (uploadContext.progressCallback != null)
      {
        long l = Long.parseLong(str1);
        paramJSONObject = uploadContext;
        progressCallback.onProgress(l, videoSize);
      }
      if (Utility.areObjectsEqual(str1, str2)) {
        VideoUploader.access$700(uploadContext, 0);
      } else {
        VideoUploader.access$300(uploadContext, str1, str2, 0);
      }
    }
  }
  
  public static class UploadContext
  {
    public final AccessToken accessToken = AccessToken.getCurrentAccessToken();
    public final FacebookCallback<Sharer.Result> callback;
    public String chunkStart = "0";
    public final String description;
    public final String graphNode;
    public boolean isCanceled;
    public Bundle params;
    public final GraphRequest.OnProgressCallback progressCallback;
    public final String ref;
    public String sessionId;
    public final String title;
    public String videoId;
    public long videoSize;
    public InputStream videoStream;
    public final Uri videoUri;
    public WorkQueue.WorkItem workItem;
    
    private UploadContext(ShareVideoContent paramShareVideoContent, String paramString, FacebookCallback<Sharer.Result> paramFacebookCallback, GraphRequest.OnProgressCallback paramOnProgressCallback)
    {
      videoUri = paramShareVideoContent.getVideo().getLocalUrl();
      title = paramShareVideoContent.getContentTitle();
      description = paramShareVideoContent.getContentDescription();
      ref = paramShareVideoContent.getRef();
      graphNode = paramString;
      callback = paramFacebookCallback;
      progressCallback = paramOnProgressCallback;
      params = paramShareVideoContent.getVideo().getParameters();
      if (!Utility.isNullOrEmpty(paramShareVideoContent.getPeopleIds())) {
        params.putString("tags", TextUtils.join(", ", paramShareVideoContent.getPeopleIds()));
      }
      if (!Utility.isNullOrEmpty(paramShareVideoContent.getPlaceId())) {
        params.putString("place", paramShareVideoContent.getPlaceId());
      }
      if (!Utility.isNullOrEmpty(paramShareVideoContent.getRef())) {
        params.putString("ref", paramShareVideoContent.getRef());
      }
    }
    
    private void initialize()
      throws FileNotFoundException
    {
      try
      {
        if (Utility.isFileUri(videoUri))
        {
          localObject = new java/io/File;
          ((File)localObject).<init>(videoUri.getPath());
          localObject = ParcelFileDescriptor.open((File)localObject, 268435456);
          videoSize = ((ParcelFileDescriptor)localObject).getStatSize();
          ParcelFileDescriptor.AutoCloseInputStream localAutoCloseInputStream = new android/os/ParcelFileDescriptor$AutoCloseInputStream;
          localAutoCloseInputStream.<init>((ParcelFileDescriptor)localObject);
          videoStream = localAutoCloseInputStream;
        }
        else
        {
          if (!Utility.isContentUri(videoUri)) {
            break label96;
          }
          videoSize = Utility.getContentSize(videoUri);
          videoStream = FacebookSdk.getApplicationContext().getContentResolver().openInputStream(videoUri);
        }
        return;
        label96:
        Object localObject = new com/facebook/FacebookException;
        ((FacebookException)localObject).<init>("Uri must be a content:// or file:// uri");
        throw ((Throwable)localObject);
      }
      catch (FileNotFoundException localFileNotFoundException)
      {
        Utility.closeQuietly(videoStream);
        throw localFileNotFoundException;
      }
    }
  }
  
  public static abstract class UploadWorkItemBase
    implements Runnable
  {
    public int completedRetries;
    public GraphResponse response;
    public VideoUploader.UploadContext uploadContext;
    
    public UploadWorkItemBase(VideoUploader.UploadContext paramUploadContext, int paramInt)
    {
      uploadContext = paramUploadContext;
      completedRetries = paramInt;
    }
    
    private boolean attemptRetry(int paramInt)
    {
      if ((completedRetries < 2) && (getTransientErrorCodes().contains(Integer.valueOf(paramInt))))
      {
        paramInt = (int)Math.pow(3.0D, completedRetries);
        VideoUploader.access$800().postDelayed(new Runnable()
        {
          public void run()
          {
            if (CrashShieldHandler.isObjectCrashing(this)) {
              return;
            }
            try
            {
              VideoUploader.UploadWorkItemBase localUploadWorkItemBase = VideoUploader.UploadWorkItemBase.this;
              localUploadWorkItemBase.enqueueRetry(completedRetries + 1);
              return;
            }
            finally
            {
              CrashShieldHandler.handleThrowable(localThrowable, this);
            }
          }
        }, paramInt * 5000);
        return true;
      }
      return false;
    }
    
    public void endUploadWithFailure(FacebookException paramFacebookException)
    {
      issueResponseOnMainThread(paramFacebookException, null);
    }
    
    public abstract void enqueueRetry(int paramInt);
    
    public void executeGraphRequestSynchronously(Bundle paramBundle)
    {
      Object localObject = uploadContext;
      paramBundle = new GraphRequest(accessToken, String.format(Locale.ROOT, "%s/videos", new Object[] { graphNode }), paramBundle, HttpMethod.POST, null).executeAndWait();
      response = paramBundle;
      if (paramBundle != null)
      {
        paramBundle = paramBundle.getError();
        localObject = response.getJSONObject();
        if (paramBundle != null)
        {
          if (!attemptRetry(paramBundle.getSubErrorCode())) {
            handleError(new FacebookGraphResponseException(response, "Video upload failed"));
          }
        }
        else if (localObject != null) {
          try
          {
            handleSuccess((JSONObject)localObject);
          }
          catch (JSONException paramBundle)
          {
            endUploadWithFailure(new FacebookException("Unexpected error in server response", paramBundle));
          }
        } else {
          handleError(new FacebookException("Unexpected error in server response"));
        }
      }
      else
      {
        handleError(new FacebookException("Unexpected error in server response"));
      }
    }
    
    public abstract Bundle getParameters()
      throws Exception;
    
    public abstract Set<Integer> getTransientErrorCodes();
    
    public abstract void handleError(FacebookException paramFacebookException);
    
    public abstract void handleSuccess(JSONObject paramJSONObject)
      throws JSONException;
    
    public void issueResponseOnMainThread(final FacebookException paramFacebookException, final String paramString)
    {
      VideoUploader.access$800().post(new Runnable()
      {
        public void run()
        {
          if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
          }
          try
          {
            VideoUploader.UploadWorkItemBase localUploadWorkItemBase = VideoUploader.UploadWorkItemBase.this;
            VideoUploader.access$900(uploadContext, paramFacebookException, response, paramString);
            return;
          }
          finally
          {
            CrashShieldHandler.handleThrowable(localThrowable, this);
          }
        }
      });
    }
    
    public void run()
    {
      if (CrashShieldHandler.isObjectCrashing(this)) {
        return;
      }
      try
      {
        boolean bool = uploadContext.isCanceled;
        if (!bool) {
          try
          {
            executeGraphRequestSynchronously(getParameters());
          }
          catch (Exception localException)
          {
            FacebookException localFacebookException2 = new com/facebook/FacebookException;
            localFacebookException2.<init>("Video upload failed", localException);
            endUploadWithFailure(localFacebookException2);
          }
          catch (FacebookException localFacebookException1)
          {
            endUploadWithFailure(localFacebookException1);
          }
        } else {
          endUploadWithFailure(null);
        }
        return;
      }
      finally
      {
        CrashShieldHandler.handleThrowable(localThrowable, this);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.internal.VideoUploader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */