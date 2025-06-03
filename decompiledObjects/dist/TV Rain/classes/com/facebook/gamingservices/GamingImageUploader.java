package com.facebook.gamingservices;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.Callback;
import java.io.File;
import java.io.FileNotFoundException;

public class GamingImageUploader
{
  private static final String photoUploadEdge = "me/photos";
  private Context context;
  
  public GamingImageUploader(Context paramContext)
  {
    context = paramContext;
  }
  
  public void uploadToMediaLibrary(String paramString, Bitmap paramBitmap, boolean paramBoolean)
  {
    uploadToMediaLibrary(paramString, paramBitmap, paramBoolean, null);
  }
  
  public void uploadToMediaLibrary(String paramString, Bitmap paramBitmap, boolean paramBoolean, GraphRequest.Callback paramCallback)
  {
    AccessToken localAccessToken = AccessToken.getCurrentAccessToken();
    if (paramBoolean) {
      paramCallback = new OpenGamingMediaDialog(context, paramCallback);
    }
    GraphRequest.newUploadPhotoRequest(localAccessToken, "me/photos", paramBitmap, paramString, null, paramCallback).executeAsync();
  }
  
  public void uploadToMediaLibrary(String paramString, Uri paramUri, boolean paramBoolean)
    throws FileNotFoundException
  {
    uploadToMediaLibrary(paramString, paramUri, paramBoolean, null);
  }
  
  public void uploadToMediaLibrary(String paramString, Uri paramUri, boolean paramBoolean, GraphRequest.Callback paramCallback)
    throws FileNotFoundException
  {
    AccessToken localAccessToken = AccessToken.getCurrentAccessToken();
    if (paramBoolean) {
      paramCallback = new OpenGamingMediaDialog(context, paramCallback);
    }
    GraphRequest.newUploadPhotoRequest(localAccessToken, "me/photos", paramUri, paramString, null, paramCallback).executeAsync();
  }
  
  public void uploadToMediaLibrary(String paramString, File paramFile, boolean paramBoolean)
    throws FileNotFoundException
  {
    uploadToMediaLibrary(paramString, paramFile, paramBoolean, null);
  }
  
  public void uploadToMediaLibrary(String paramString, File paramFile, boolean paramBoolean, GraphRequest.Callback paramCallback)
    throws FileNotFoundException
  {
    AccessToken localAccessToken = AccessToken.getCurrentAccessToken();
    if (paramBoolean) {
      paramCallback = new OpenGamingMediaDialog(context, paramCallback);
    }
    GraphRequest.newUploadPhotoRequest(localAccessToken, "me/photos", paramFile, paramString, null, paramCallback).executeAsync();
  }
}

/* Location:
 * Qualified Name:     com.facebook.gamingservices.GamingImageUploader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */