package com.facebook.gamingservices.internal;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.Callback;
import com.facebook.HttpMethod;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.AutoHandleExceptions;
import java.io.File;
import java.io.FileNotFoundException;

@AutoHandleExceptions
public abstract class GamingMediaUploader
{
  private static final String photoUploadEdge = "me/photos";
  
  public static void uploadToGamingServices(String paramString, Bitmap paramBitmap, Bundle paramBundle, GraphRequest.Callback paramCallback)
  {
    GraphRequest.newUploadPhotoRequest(AccessToken.getCurrentAccessToken(), "me/photos", paramBitmap, paramString, paramBundle, paramCallback).executeAsync();
  }
  
  public static void uploadToGamingServices(String paramString, Uri paramUri, Bundle paramBundle, GraphRequest.Callback paramCallback)
    throws FileNotFoundException
  {
    AccessToken localAccessToken = AccessToken.getCurrentAccessToken();
    if ((!Utility.isFileUri(paramUri)) && (!Utility.isContentUri(paramUri)))
    {
      Bundle localBundle = new Bundle();
      if (paramBundle != null) {
        localBundle.putAll(paramBundle);
      }
      localBundle.putString("url", paramUri.toString());
      if ((paramString != null) && (!paramString.isEmpty())) {
        localBundle.putString("caption", paramString);
      }
      new GraphRequest(localAccessToken, "me/photos", localBundle, HttpMethod.POST, paramCallback).executeAsync();
    }
    else
    {
      GraphRequest.newUploadPhotoRequest(localAccessToken, "me/photos", paramUri, paramString, paramBundle, paramCallback).executeAsync();
    }
  }
  
  public static void uploadToGamingServices(String paramString, File paramFile, Bundle paramBundle, GraphRequest.Callback paramCallback)
    throws FileNotFoundException
  {
    GraphRequest.newUploadPhotoRequest(AccessToken.getCurrentAccessToken(), "me/photos", paramFile, paramString, paramBundle, paramCallback).executeAsync();
  }
}

/* Location:
 * Qualified Name:     com.facebook.gamingservices.internal.GamingMediaUploader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */