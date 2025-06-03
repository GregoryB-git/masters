package com.facebook.common.util;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.net.Uri.Builder;
import android.provider.ContactsContract;
import android.provider.MediaStore.Images.Media;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.annotation.Nullable;

public class UriUtil
{
  public static final String DATA_SCHEME = "data";
  public static final String HTTPS_SCHEME = "https";
  public static final String HTTP_SCHEME = "http";
  public static final String LOCAL_ASSET_SCHEME = "asset";
  private static final Uri LOCAL_CONTACT_IMAGE_URI = Uri.withAppendedPath(ContactsContract.AUTHORITY_URI, "display_photo");
  public static final String LOCAL_CONTENT_SCHEME = "content";
  public static final String LOCAL_FILE_SCHEME = "file";
  public static final String LOCAL_RESOURCE_SCHEME = "res";
  public static final String QUALIFIED_RESOURCE_SCHEME = "android.resource";
  
  @Nullable
  public static String getRealPathFromUri(ContentResolver paramContentResolver, Uri paramUri)
  {
    boolean bool = isLocalContentUri(paramUri);
    Object localObject1 = null;
    Cursor localCursor = null;
    Object localObject2 = null;
    if (bool) {}
    try
    {
      localCursor = paramContentResolver.query(paramUri, null, null, null, null);
      paramUri = (Uri)localObject2;
      if (localCursor != null)
      {
        paramUri = (Uri)localObject2;
        try
        {
          if (localCursor.moveToFirst())
          {
            int i = localCursor.getColumnIndex("_data");
            paramUri = (Uri)localObject2;
            if (i != -1) {
              paramUri = localCursor.getString(i);
            }
          }
        }
        finally
        {
          paramUri = localCursor;
          break label111;
        }
      }
      paramContentResolver = paramUri;
      if (localCursor != null)
      {
        localCursor.close();
        paramContentResolver = paramUri;
      }
    }
    finally
    {
      paramUri = (Uri)localObject1;
      label111:
      if (paramUri != null) {
        paramUri.close();
      }
    }
    return paramContentResolver;
  }
  
  @Nullable
  public static String getSchemeOrNull(@Nullable Uri paramUri)
  {
    if (paramUri == null) {
      paramUri = null;
    } else {
      paramUri = paramUri.getScheme();
    }
    return paramUri;
  }
  
  public static Uri getUriForFile(File paramFile)
  {
    return Uri.fromFile(paramFile);
  }
  
  public static Uri getUriForQualifiedResource(String paramString, int paramInt)
  {
    return new Uri.Builder().scheme("android.resource").authority(paramString).path(String.valueOf(paramInt)).build();
  }
  
  public static Uri getUriForResourceId(int paramInt)
  {
    return new Uri.Builder().scheme("res").path(String.valueOf(paramInt)).build();
  }
  
  public static boolean isDataUri(@Nullable Uri paramUri)
  {
    return "data".equals(getSchemeOrNull(paramUri));
  }
  
  public static boolean isLocalAssetUri(@Nullable Uri paramUri)
  {
    return "asset".equals(getSchemeOrNull(paramUri));
  }
  
  public static boolean isLocalCameraUri(Uri paramUri)
  {
    paramUri = paramUri.toString();
    boolean bool;
    if ((!paramUri.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString())) && (!paramUri.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString()))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static boolean isLocalContactUri(Uri paramUri)
  {
    boolean bool;
    if ((isLocalContentUri(paramUri)) && ("com.android.contacts".equals(paramUri.getAuthority())) && (!paramUri.getPath().startsWith(LOCAL_CONTACT_IMAGE_URI.getPath()))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean isLocalContentUri(@Nullable Uri paramUri)
  {
    return "content".equals(getSchemeOrNull(paramUri));
  }
  
  public static boolean isLocalFileUri(@Nullable Uri paramUri)
  {
    return "file".equals(getSchemeOrNull(paramUri));
  }
  
  public static boolean isLocalResourceUri(@Nullable Uri paramUri)
  {
    return "res".equals(getSchemeOrNull(paramUri));
  }
  
  public static boolean isNetworkUri(@Nullable Uri paramUri)
  {
    paramUri = getSchemeOrNull(paramUri);
    boolean bool;
    if ((!"https".equals(paramUri)) && (!"http".equals(paramUri))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static boolean isQualifiedResourceUri(@Nullable Uri paramUri)
  {
    return "android.resource".equals(getSchemeOrNull(paramUri));
  }
  
  public static Uri parseUriOrNull(@Nullable String paramString)
  {
    if (paramString != null) {
      paramString = Uri.parse(paramString);
    } else {
      paramString = null;
    }
    return paramString;
  }
  
  @Nullable
  public static URL uriToUrl(@Nullable Uri paramUri)
  {
    if (paramUri == null) {
      return null;
    }
    try
    {
      paramUri = new URL(paramUri.toString());
      return paramUri;
    }
    catch (MalformedURLException paramUri)
    {
      throw new RuntimeException(paramUri);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.common.util.UriUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */