package com.google.android.exoplayer2.offline;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.cache.CacheUtil;
import com.google.android.exoplayer2.util.Util;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class ProgressiveDownloadAction
  extends DownloadAction
{
  public static final DownloadAction.Deserializer DESERIALIZER = new DownloadAction.Deserializer("progressive", 0)
  {
    public ProgressiveDownloadAction readFromStream(int paramAnonymousInt, DataInputStream paramAnonymousDataInputStream)
      throws IOException
    {
      Uri localUri = Uri.parse(paramAnonymousDataInputStream.readUTF());
      boolean bool = paramAnonymousDataInputStream.readBoolean();
      byte[] arrayOfByte = new byte[paramAnonymousDataInputStream.readInt()];
      paramAnonymousDataInputStream.readFully(arrayOfByte);
      if (paramAnonymousDataInputStream.readBoolean()) {
        paramAnonymousDataInputStream = paramAnonymousDataInputStream.readUTF();
      } else {
        paramAnonymousDataInputStream = null;
      }
      return new ProgressiveDownloadAction(localUri, bool, arrayOfByte, paramAnonymousDataInputStream);
    }
  };
  private static final String TYPE = "progressive";
  private static final int VERSION = 0;
  @Nullable
  private final String customCacheKey;
  
  @Deprecated
  public ProgressiveDownloadAction(Uri paramUri, boolean paramBoolean, @Nullable byte[] paramArrayOfByte, @Nullable String paramString)
  {
    super("progressive", 0, paramUri, paramBoolean, paramArrayOfByte);
    customCacheKey = paramString;
  }
  
  public static ProgressiveDownloadAction createDownloadAction(Uri paramUri, @Nullable byte[] paramArrayOfByte, @Nullable String paramString)
  {
    return new ProgressiveDownloadAction(paramUri, false, paramArrayOfByte, paramString);
  }
  
  public static ProgressiveDownloadAction createRemoveAction(Uri paramUri, @Nullable byte[] paramArrayOfByte, @Nullable String paramString)
  {
    return new ProgressiveDownloadAction(paramUri, true, paramArrayOfByte, paramString);
  }
  
  private String getCacheKey()
  {
    String str = customCacheKey;
    if (str == null) {
      str = CacheUtil.generateKey(uri);
    }
    return str;
  }
  
  public ProgressiveDownloader createDownloader(DownloaderConstructorHelper paramDownloaderConstructorHelper)
  {
    return new ProgressiveDownloader(uri, customCacheKey, paramDownloaderConstructorHelper);
  }
  
  public boolean equals(@Nullable Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!super.equals(paramObject)) {
      return false;
    }
    paramObject = (ProgressiveDownloadAction)paramObject;
    return Util.areEqual(customCacheKey, customCacheKey);
  }
  
  public int hashCode()
  {
    int i = super.hashCode();
    String str = customCacheKey;
    int j;
    if (str != null) {
      j = str.hashCode();
    } else {
      j = 0;
    }
    return i * 31 + j;
  }
  
  public boolean isSameMedia(DownloadAction paramDownloadAction)
  {
    boolean bool;
    if (((paramDownloadAction instanceof ProgressiveDownloadAction)) && (getCacheKey().equals(((ProgressiveDownloadAction)paramDownloadAction).getCacheKey()))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void writeToStream(DataOutputStream paramDataOutputStream)
    throws IOException
  {
    paramDataOutputStream.writeUTF(uri.toString());
    paramDataOutputStream.writeBoolean(isRemoveAction);
    paramDataOutputStream.writeInt(data.length);
    paramDataOutputStream.write(data);
    boolean bool;
    if (customCacheKey != null) {
      bool = true;
    } else {
      bool = false;
    }
    paramDataOutputStream.writeBoolean(bool);
    if (bool) {
      paramDataOutputStream.writeUTF(customCacheKey);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.offline.ProgressiveDownloadAction
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */