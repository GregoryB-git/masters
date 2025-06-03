package com.google.firebase.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import u7.a;
import u7.f;

public class FirebaseInitProvider
  extends ContentProvider
{
  public static a a = new a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
  public static AtomicBoolean b = new AtomicBoolean(false);
  
  public final void attachInfo(Context paramContext, ProviderInfo paramProviderInfo)
  {
    if (paramProviderInfo != null)
    {
      if (!"com.google.firebase.firebaseinitprovider".equals(authority))
      {
        super.attachInfo(paramContext, paramProviderInfo);
        return;
      }
      throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
    }
    throw new NullPointerException("FirebaseInitProvider ProviderInfo cannot be null.");
  }
  
  public final int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
  
  public final String getType(Uri paramUri)
  {
    return null;
  }
  
  public final Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    return null;
  }
  
  public final boolean onCreate()
  {
    try
    {
      b.set(true);
      Object localObject1 = f.i(getContext());
      if (localObject1 == null) {}
      for (localObject1 = "FirebaseApp initialization unsuccessful";; localObject1 = "FirebaseApp initialization successful")
      {
        Log.i("FirebaseInitProvider", (String)localObject1);
        break;
      }
      return false;
    }
    finally
    {
      b.set(false);
    }
  }
  
  public final Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    return null;
  }
  
  public final int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.provider.FirebaseInitProvider
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */