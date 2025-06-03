package io.flutter.plugins.firebase.messaging;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;

public class FlutterFirebaseMessagingInitProvider
  extends ContentProvider
{
  public void attachInfo(Context paramContext, ProviderInfo paramProviderInfo)
  {
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
    if (ContextHolder.getApplicationContext() == null)
    {
      Context localContext1 = getContext();
      Context localContext2 = localContext1;
      if (localContext1 != null)
      {
        localContext2 = localContext1;
        if (localContext1.getApplicationContext() != null) {
          localContext2 = localContext1.getApplicationContext();
        }
      }
      ContextHolder.setApplicationContext(localContext2);
    }
    return false;
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
 * Qualified Name:     io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingInitProvider
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */