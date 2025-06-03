package com.facebook.share.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.text.TextUtils;
import com.facebook.AccessToken;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest.OnProgressCallback;
import com.facebook.internal.Utility;
import com.facebook.internal.WorkQueue.WorkItem;
import com.facebook.share.Sharer.Result;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

class VideoUploader$UploadContext
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
  
  private VideoUploader$UploadContext(ShareVideoContent paramShareVideoContent, String paramString, FacebookCallback<Sharer.Result> paramFacebookCallback, GraphRequest.OnProgressCallback paramOnProgressCallback)
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

/* Location:
 * Qualified Name:     com.facebook.share.internal.VideoUploader.UploadContext
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */