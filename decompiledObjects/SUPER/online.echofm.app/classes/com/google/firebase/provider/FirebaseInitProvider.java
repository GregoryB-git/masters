package com.google.firebase.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import s3.e;

public class FirebaseInitProvider
  extends ContentProvider
{
  public static s3.n o = ;
  public static AtomicBoolean p = new AtomicBoolean(false);
  
  public static void a(ProviderInfo paramProviderInfo)
  {
    A2.n.j(paramProviderInfo, "FirebaseInitProvider ProviderInfo cannot be null.");
    if (!"com.google.firebase.firebaseinitprovider".equals(authority)) {
      return;
    }
    throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
  }
  
  public static s3.n b()
  {
    return o;
  }
  
  public static boolean c()
  {
    return p.get();
  }
  
  public void attachInfo(Context paramContext, ProviderInfo paramProviderInfo)
  {
    a(paramProviderInfo);
    super.attachInfo(paramContext, paramProviderInfo);
  }
  
  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
  
  public String getType(Uri paramUri)
  {
    return null;
  }
  
  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    return null;
  }
  
  public boolean onCreate()
  {
    String str;
    for (;;)
    {
      try
      {
        p.set(true);
        Object localObject1 = e.u(getContext());
        if (localObject1 == null)
        {
          localObject1 = "FirebaseApp initialization unsuccessful";
          Log.i("FirebaseInitProvider", (String)localObject1);
        }
      }
      finally
      {
        break;
      }
      str = "FirebaseApp initialization successful";
    }
    p.set(false);
    return false;
    p.set(false);
    throw str;
  }
  
  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    return null;
  }
  
  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.provider.FirebaseInitProvider
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */