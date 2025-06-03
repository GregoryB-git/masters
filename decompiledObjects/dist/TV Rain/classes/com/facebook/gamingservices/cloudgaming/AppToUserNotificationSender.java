package com.facebook.gamingservices.cloudgaming;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.facebook.GraphRequest.Callback;
import com.facebook.gamingservices.internal.GamingMediaUploader;
import java.io.File;
import java.io.FileNotFoundException;
import z2;

public abstract class AppToUserNotificationSender
{
  private static Bundle getParameters()
  {
    return z2.d("upload_source", "A2U");
  }
  
  public static void scheduleAppToUserNotification(String paramString1, String paramString2, Bitmap paramBitmap, int paramInt, @Nullable String paramString3, GraphRequest.Callback paramCallback)
    throws FileNotFoundException
  {
    paramString1 = new MediaUploadCallback(paramString1, paramString2, paramInt, paramString3, paramCallback);
    GamingMediaUploader.uploadToGamingServices("A2U Image", paramBitmap, getParameters(), paramString1);
  }
  
  public static void scheduleAppToUserNotification(String paramString1, String paramString2, Uri paramUri, int paramInt, @Nullable String paramString3, GraphRequest.Callback paramCallback)
    throws FileNotFoundException
  {
    paramString1 = new MediaUploadCallback(paramString1, paramString2, paramInt, paramString3, paramCallback);
    GamingMediaUploader.uploadToGamingServices("A2U Image", paramUri, getParameters(), paramString1);
  }
  
  public static void scheduleAppToUserNotification(String paramString1, String paramString2, File paramFile, int paramInt, @Nullable String paramString3, GraphRequest.Callback paramCallback)
    throws FileNotFoundException
  {
    paramString1 = new MediaUploadCallback(paramString1, paramString2, paramInt, paramString3, paramCallback);
    GamingMediaUploader.uploadToGamingServices("A2U Image", paramFile, getParameters(), paramString1);
  }
}

/* Location:
 * Qualified Name:     com.facebook.gamingservices.cloudgaming.AppToUserNotificationSender
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */