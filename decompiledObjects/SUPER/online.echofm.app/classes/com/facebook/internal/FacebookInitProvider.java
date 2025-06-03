package com.facebook.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import x1.B;

@Metadata
public final class FacebookInitProvider
  extends ContentProvider
{
  public static final a o = new a(null);
  public static final String p = FacebookInitProvider.class.getSimpleName();
  
  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    Intrinsics.checkNotNullParameter(paramUri, "uri");
    return 0;
  }
  
  public String getType(Uri paramUri)
  {
    Intrinsics.checkNotNullParameter(paramUri, "uri");
    return null;
  }
  
  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    Intrinsics.checkNotNullParameter(paramUri, "uri");
    return null;
  }
  
  public boolean onCreate()
  {
    try
    {
      Context localContext = getContext();
      if (localContext != null) {
        B.M(localContext);
      }
    }
    catch (Exception localException)
    {
      break label35;
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Required value was null.".toString());
      throw localIllegalArgumentException;
      label35:
      Log.i(p, "Failed to auto initialize the Facebook SDK", localIllegalArgumentException);
    }
    return false;
  }
  
  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    Intrinsics.checkNotNullParameter(paramUri, "uri");
    return null;
  }
  
  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    Intrinsics.checkNotNullParameter(paramUri, "uri");
    return 0;
  }
  
  public static final class a {}
}

/* Location:
 * Qualified Name:     com.facebook.internal.FacebookInitProvider
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */