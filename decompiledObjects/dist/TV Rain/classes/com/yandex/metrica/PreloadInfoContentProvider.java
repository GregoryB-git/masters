package com.yandex.metrica;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.E0;
import com.yandex.metrica.impl.ob.Qd;
import com.yandex.metrica.impl.ob.Rd;
import com.yandex.metrica.impl.ob.Y;
import com.yandex.metrica.impl.ob.Z;
import com.yandex.metrica.impl.ob.h2;
import com.yandex.metrica.impl.ob.t3;
import com.yandex.metrica.impl.ob.u3;
import z2;

public class PreloadInfoContentProvider
  extends ContentProvider
{
  private boolean a = false;
  private final UriMatcher b = new UriMatcher(-1);
  
  public int delete(@NonNull Uri paramUri, @Nullable String paramString, @Nullable String[] paramArrayOfString)
  {
    h2.b("Deleting is not supported", new Object[0]);
    return -1;
  }
  
  public void disable()
  {
    try
    {
      a = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  @Nullable
  public String getType(@NonNull Uri paramUri)
  {
    return null;
  }
  
  @Nullable
  public Uri insert(@NonNull Uri paramUri, @Nullable ContentValues paramContentValues)
  {
    try
    {
      if (a) {
        return null;
      }
      if (paramContentValues != null)
      {
        int i = b.match(paramUri);
        Z localZ;
        if (i != 1)
        {
          if (i != 2)
          {
            h2.b("Bad content provider uri: %s", new Object[] { paramUri });
          }
          else
          {
            localZ = new Z(new t3(), new u3(), new E0(), "clids");
            paramUri = getContext();
            if (paramUri == null) {
              paramUri = null;
            } else {
              paramUri = paramUri.getApplicationContext();
            }
            if (paramUri != null) {
              localZ.a(paramUri, paramContentValues);
            }
          }
        }
        else
        {
          localZ = new Z(new Qd(), new Rd(), new E0(), "preload info");
          paramUri = getContext();
          if (paramUri == null) {
            paramUri = null;
          } else {
            paramUri = paramUri.getApplicationContext();
          }
          if (paramUri != null) {
            localZ.a(paramUri, paramContentValues);
          }
        }
      }
      Y.a();
      return null;
    }
    finally {}
  }
  
  public boolean onCreate()
  {
    Object localObject = getContext();
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((Context)localObject).getApplicationContext();
    }
    if (localObject != null) {
      localObject = ((Context)localObject).getPackageName();
    } else {
      localObject = "";
    }
    localObject = z2.o((String)localObject, ".appmetrica.preloadinfo.retail");
    b.addURI((String)localObject, "preloadinfo", 1);
    b.addURI((String)localObject, "clids", 2);
    Y.a(this);
    return true;
  }
  
  @Nullable
  public Cursor query(@NonNull Uri paramUri, @Nullable String[] paramArrayOfString1, @Nullable String paramString1, @Nullable String[] paramArrayOfString2, @Nullable String paramString2)
  {
    h2.b("Query is not supported", new Object[0]);
    return null;
  }
  
  public int update(@NonNull Uri paramUri, @Nullable ContentValues paramContentValues, @Nullable String paramString, @Nullable String[] paramArrayOfString)
  {
    h2.b("Updating is not supported", new Object[0]);
    return -1;
  }
}

/* Location:
 * Qualified Name:     com.yandex.metrica.PreloadInfoContentProvider
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */