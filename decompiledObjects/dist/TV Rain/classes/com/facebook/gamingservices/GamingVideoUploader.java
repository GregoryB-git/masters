package com.facebook.gamingservices;

import android.content.Context;
import android.net.Uri;
import com.facebook.GraphRequest.OnProgressCallback;
import com.facebook.share.internal.VideoUploader;
import com.facebook.share.model.ShareVideo.Builder;
import com.facebook.share.model.ShareVideoContent.Builder;
import java.io.FileNotFoundException;

public class GamingVideoUploader
{
  private Context context;
  
  public GamingVideoUploader(Context paramContext)
  {
    context = paramContext;
  }
  
  public void uploadToMediaLibrary(String paramString, Uri paramUri)
    throws FileNotFoundException
  {
    uploadToMediaLibrary(paramString, paramUri, null);
  }
  
  public void uploadToMediaLibrary(String paramString, Uri paramUri, GraphRequest.OnProgressCallback paramOnProgressCallback)
    throws FileNotFoundException
  {
    uploadToMediaLibrary(paramString, paramUri, false, paramOnProgressCallback);
  }
  
  public void uploadToMediaLibrary(String paramString, Uri paramUri, boolean paramBoolean, GraphRequest.OnProgressCallback paramOnProgressCallback)
    throws FileNotFoundException
  {
    paramUri = new ShareVideo.Builder().setLocalUrl(paramUri).build();
    paramUri = new ShareVideoContent.Builder().setVideo(paramUri).setContentDescription(paramString).build();
    paramString = paramOnProgressCallback;
    if (paramBoolean) {
      paramString = new OpenGamingMediaDialog(context, paramOnProgressCallback);
    }
    VideoUploader.uploadAsyncWithProgressCallback(paramUri, paramString);
  }
}

/* Location:
 * Qualified Name:     com.facebook.gamingservices.GamingVideoUploader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */