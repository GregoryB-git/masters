package androidx.startup;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class InitializationProvider
  extends ContentProvider
{
  public final int delete(@NonNull Uri paramUri, @Nullable String paramString, @Nullable String[] paramArrayOfString)
  {
    throw new IllegalStateException("Not allowed.");
  }
  
  @Nullable
  public final String getType(@NonNull Uri paramUri)
  {
    throw new IllegalStateException("Not allowed.");
  }
  
  @Nullable
  public final Uri insert(@NonNull Uri paramUri, @Nullable ContentValues paramContentValues)
  {
    throw new IllegalStateException("Not allowed.");
  }
  
  public final boolean onCreate()
  {
    Context localContext = getContext();
    if (localContext != null)
    {
      if (localContext.getApplicationContext() != null) {
        AppInitializer.getInstance(localContext).discoverAndInitialize();
      }
      return true;
    }
    throw new StartupException("Context cannot be null");
  }
  
  @Nullable
  public final Cursor query(@NonNull Uri paramUri, @Nullable String[] paramArrayOfString1, @Nullable String paramString1, @Nullable String[] paramArrayOfString2, @Nullable String paramString2)
  {
    throw new IllegalStateException("Not allowed.");
  }
  
  public final int update(@NonNull Uri paramUri, @Nullable ContentValues paramContentValues, @Nullable String paramString, @Nullable String[] paramArrayOfString)
  {
    throw new IllegalStateException("Not allowed.");
  }
}

/* Location:
 * Qualified Name:     androidx.startup.InitializationProvider
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */