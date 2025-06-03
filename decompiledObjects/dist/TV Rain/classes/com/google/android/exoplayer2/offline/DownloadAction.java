package com.google.android.exoplayer2.offline;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.dash.offline.DashDownloadAction;
import com.google.android.exoplayer2.source.hls.offline.HlsDownloadAction;
import com.google.android.exoplayer2.source.smoothstreaming.offline.SsDownloadAction;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public abstract class DownloadAction
{
  @Nullable
  private static Deserializer[] defaultDeserializers;
  public final byte[] data;
  public final boolean isRemoveAction;
  public final String type;
  public final Uri uri;
  public final int version;
  
  public DownloadAction(String paramString, int paramInt, Uri paramUri, boolean paramBoolean, @Nullable byte[] paramArrayOfByte)
  {
    type = paramString;
    version = paramInt;
    uri = paramUri;
    isRemoveAction = paramBoolean;
    if (paramArrayOfByte == null) {
      paramArrayOfByte = Util.EMPTY_BYTE_ARRAY;
    }
    data = paramArrayOfByte;
  }
  
  public static DownloadAction deserializeFromStream(Deserializer[] paramArrayOfDeserializer, InputStream paramInputStream)
    throws IOException
  {
    DataInputStream localDataInputStream = new DataInputStream(paramInputStream);
    paramInputStream = localDataInputStream.readUTF();
    int i = localDataInputStream.readInt();
    int j = paramArrayOfDeserializer.length;
    for (int k = 0; k < j; k++)
    {
      Deserializer localDeserializer = paramArrayOfDeserializer[k];
      if ((paramInputStream.equals(type)) && (version >= i)) {
        return localDeserializer.readFromStream(i, localDataInputStream);
      }
    }
    paramArrayOfDeserializer = new StringBuilder();
    paramArrayOfDeserializer.append("No deserializer found for:");
    paramArrayOfDeserializer.append(paramInputStream);
    paramArrayOfDeserializer.append(", ");
    paramArrayOfDeserializer.append(i);
    throw new DownloadException(paramArrayOfDeserializer.toString());
  }
  
  public static Deserializer[] getDefaultDeserializers()
  {
    for (;;)
    {
      Deserializer[] arrayOfDeserializer;
      int i;
      Deserializer localDeserializer1;
      Deserializer localDeserializer2;
      int j;
      Deserializer localDeserializer3;
      try
      {
        arrayOfDeserializer = defaultDeserializers;
        if (arrayOfDeserializer != null) {
          return arrayOfDeserializer;
        }
        arrayOfDeserializer = new Deserializer[4];
        arrayOfDeserializer[0] = ProgressiveDownloadAction.DESERIALIZER;
        i = 1;
      }
      finally {}
      try
      {
        localDeserializer1 = DashDownloadAction.DESERIALIZER;
        i = 2;
        try
        {
          arrayOfDeserializer[1] = getDeserializer(DashDownloadAction.class);
        }
        catch (Exception localException1)
        {
          i = 2;
        }
      }
      catch (Exception localException4)
      {
        continue;
      }
      try
      {
        localDeserializer2 = HlsDownloadAction.DESERIALIZER;
        j = i + 1;
        try
        {
          arrayOfDeserializer[i] = getDeserializer(HlsDownloadAction.class);
          i = j;
        }
        catch (Exception localException2)
        {
          i = j;
        }
      }
      catch (Exception localException5)
      {
        continue;
      }
      try
      {
        localDeserializer3 = SsDownloadAction.DESERIALIZER;
        j = i + 1;
        try
        {
          arrayOfDeserializer[i] = getDeserializer(SsDownloadAction.class);
        }
        catch (Exception localException3)
        {
          i = j;
        }
      }
      catch (Exception localException6) {}
    }
    j = i;
    arrayOfDeserializer = (Deserializer[])Arrays.copyOf((Object[])Assertions.checkNotNull(arrayOfDeserializer), j);
    defaultDeserializers = arrayOfDeserializer;
    return arrayOfDeserializer;
  }
  
  private static Deserializer getDeserializer(Class<?> paramClass)
    throws NoSuchFieldException, IllegalAccessException
  {
    return (Deserializer)Assertions.checkNotNull(paramClass.getDeclaredField("DESERIALIZER").get(null));
  }
  
  public static void serializeToStream(DownloadAction paramDownloadAction, OutputStream paramOutputStream)
    throws IOException
  {
    paramOutputStream = new DataOutputStream(paramOutputStream);
    paramOutputStream.writeUTF(type);
    paramOutputStream.writeInt(version);
    paramDownloadAction.writeToStream(paramOutputStream);
    paramOutputStream.flush();
  }
  
  public abstract Downloader createDownloader(DownloaderConstructorHelper paramDownloaderConstructorHelper);
  
  public boolean equals(@Nullable Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (paramObject != null) {
      if (getClass() != paramObject.getClass())
      {
        bool2 = bool1;
      }
      else
      {
        paramObject = (DownloadAction)paramObject;
        bool2 = bool1;
        if (type.equals(type))
        {
          bool2 = bool1;
          if (version == version)
          {
            bool2 = bool1;
            if (uri.equals(uri))
            {
              bool2 = bool1;
              if (isRemoveAction == isRemoveAction)
              {
                bool2 = bool1;
                if (Arrays.equals(data, data)) {
                  bool2 = true;
                }
              }
            }
          }
        }
      }
    }
    return bool2;
  }
  
  public List<StreamKey> getKeys()
  {
    return Collections.emptyList();
  }
  
  public int hashCode()
  {
    int i = uri.hashCode();
    int j = isRemoveAction;
    return Arrays.hashCode(data) + (i * 31 + j) * 31;
  }
  
  public boolean isSameMedia(DownloadAction paramDownloadAction)
  {
    return uri.equals(uri);
  }
  
  public final byte[] toByteArray()
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    try
    {
      serializeToStream(this, localByteArrayOutputStream);
      return localByteArrayOutputStream.toByteArray();
    }
    catch (IOException localIOException)
    {
      throw new IllegalStateException();
    }
  }
  
  public abstract void writeToStream(DataOutputStream paramDataOutputStream)
    throws IOException;
  
  public static abstract class Deserializer
  {
    public final String type;
    public final int version;
    
    public Deserializer(String paramString, int paramInt)
    {
      type = paramString;
      version = paramInt;
    }
    
    public abstract DownloadAction readFromStream(int paramInt, DataInputStream paramDataInputStream)
      throws IOException;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.offline.DownloadAction
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */