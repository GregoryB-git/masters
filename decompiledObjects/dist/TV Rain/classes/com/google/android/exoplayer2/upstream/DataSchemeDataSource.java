package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.util.Base64;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.net.URLDecoder;
import z2;

public final class DataSchemeDataSource
  extends BaseDataSource
{
  public static final String SCHEME_DATA = "data";
  private int bytesRead;
  @Nullable
  private byte[] data;
  @Nullable
  private DataSpec dataSpec;
  
  public DataSchemeDataSource()
  {
    super(false);
  }
  
  public void close()
    throws IOException
  {
    if (data != null)
    {
      data = null;
      transferEnded();
    }
    dataSpec = null;
  }
  
  @Nullable
  public Uri getUri()
  {
    Object localObject = dataSpec;
    if (localObject != null) {
      localObject = uri;
    } else {
      localObject = null;
    }
    return (Uri)localObject;
  }
  
  public long open(DataSpec paramDataSpec)
    throws IOException
  {
    transferInitializing(paramDataSpec);
    dataSpec = paramDataSpec;
    Uri localUri = uri;
    Object localObject = localUri.getScheme();
    if ("data".equals(localObject))
    {
      localObject = Util.split(localUri.getSchemeSpecificPart(), ",");
      if (localObject.length == 2)
      {
        localUri = localObject[1];
        if (localObject[0].contains(";base64")) {
          try
          {
            data = Base64.decode(localUri, 0);
          }
          catch (IllegalArgumentException paramDataSpec)
          {
            throw new ParserException(z2.o("Error while parsing Base64 encoded string: ", localUri), paramDataSpec);
          }
        } else {
          data = Util.getUtf8Bytes(URLDecoder.decode(localUri, "US-ASCII"));
        }
        transferStarted(paramDataSpec);
        return data.length;
      }
      paramDataSpec = new StringBuilder();
      paramDataSpec.append("Unexpected URI format: ");
      paramDataSpec.append(localUri);
      throw new ParserException(paramDataSpec.toString());
    }
    throw new ParserException(z2.o("Unsupported scheme: ", (String)localObject));
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {
      return 0;
    }
    int i = data.length - bytesRead;
    if (i == 0) {
      return -1;
    }
    paramInt2 = Math.min(paramInt2, i);
    System.arraycopy(data, bytesRead, paramArrayOfByte, paramInt1, paramInt2);
    bytesRead += paramInt2;
    bytesTransferred(paramInt2);
    return paramInt2;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.DataSchemeDataSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */