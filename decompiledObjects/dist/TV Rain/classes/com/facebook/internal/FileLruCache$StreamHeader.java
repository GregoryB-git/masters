package com.facebook.internal;

import com.facebook.LoggingBehavior;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import z2;

final class FileLruCache$StreamHeader
{
  private static final int HEADER_VERSION = 0;
  
  public static JSONObject readHeader(InputStream paramInputStream)
    throws IOException
  {
    if (paramInputStream.read() != 0) {
      return null;
    }
    int i = 0;
    int j = 0;
    int k = j;
    while (j < 3)
    {
      int m = paramInputStream.read();
      if (m == -1)
      {
        Logger.log(LoggingBehavior.CACHE, FileLruCache.TAG, "readHeader: stream.read returned -1 while reading header size");
        return null;
      }
      k = (k << 8) + (m & 0xFF);
      j++;
    }
    Object localObject1 = new byte[k];
    j = i;
    Object localObject2;
    while (j < k)
    {
      i = paramInputStream.read((byte[])localObject1, j, k - j);
      if (i < 1)
      {
        localObject2 = LoggingBehavior.CACHE;
        paramInputStream = FileLruCache.TAG;
        localObject1 = z2.t("readHeader: stream.read stopped at ");
        ((StringBuilder)localObject1).append(Integer.valueOf(j));
        ((StringBuilder)localObject1).append(" when expected ");
        ((StringBuilder)localObject1).append(k);
        Logger.log((LoggingBehavior)localObject2, paramInputStream, ((StringBuilder)localObject1).toString());
        return null;
      }
      j += i;
    }
    paramInputStream = new JSONTokener(new String((byte[])localObject1));
    try
    {
      localObject2 = paramInputStream.nextValue();
      if (!(localObject2 instanceof JSONObject))
      {
        localObject1 = LoggingBehavior.CACHE;
        String str = FileLruCache.TAG;
        paramInputStream = new java/lang/StringBuilder;
        paramInputStream.<init>();
        paramInputStream.append("readHeader: expected JSONObject, got ");
        paramInputStream.append(localObject2.getClass().getCanonicalName());
        Logger.log((LoggingBehavior)localObject1, str, paramInputStream.toString());
        return null;
      }
      paramInputStream = (JSONObject)localObject2;
      return paramInputStream;
    }
    catch (JSONException paramInputStream)
    {
      throw new IOException(paramInputStream.getMessage());
    }
  }
  
  public static void writeHeader(OutputStream paramOutputStream, JSONObject paramJSONObject)
    throws IOException
  {
    paramJSONObject = paramJSONObject.toString().getBytes();
    paramOutputStream.write(0);
    paramOutputStream.write(paramJSONObject.length >> 16 & 0xFF);
    paramOutputStream.write(paramJSONObject.length >> 8 & 0xFF);
    paramOutputStream.write(paramJSONObject.length >> 0 & 0xFF);
    paramOutputStream.write(paramJSONObject);
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.FileLruCache.StreamHeader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */