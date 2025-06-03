package org.chromium.support_lib_boundary;

import android.content.ContentProvider;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;

public abstract interface DropDataContentProviderBoundaryInterface
{
  public abstract Uri cache(byte[] paramArrayOfByte, String paramString1, String paramString2);
  
  public abstract Bundle call(String paramString1, String paramString2, Bundle paramBundle);
  
  public abstract String[] getStreamTypes(Uri paramUri, String paramString);
  
  public abstract String getType(Uri paramUri);
  
  public abstract boolean onCreate();
  
  public abstract void onDragEnd(boolean paramBoolean);
  
  public abstract ParcelFileDescriptor openFile(ContentProvider paramContentProvider, Uri paramUri);
  
  public abstract Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2);
  
  public abstract void setClearCachedDataIntervalMs(int paramInt);
}

/* Location:
 * Qualified Name:     org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */