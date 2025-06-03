package com.google.android.datatransport.runtime;

import androidx.annotation.NonNull;
import com.google.android.datatransport.Encoding;
import java.util.Arrays;
import z2;

public final class EncodedPayload
{
  private final byte[] bytes;
  private final Encoding encoding;
  
  public EncodedPayload(@NonNull Encoding paramEncoding, @NonNull byte[] paramArrayOfByte)
  {
    if (paramEncoding != null)
    {
      if (paramArrayOfByte != null)
      {
        encoding = paramEncoding;
        bytes = paramArrayOfByte;
        return;
      }
      throw new NullPointerException("bytes is null");
    }
    throw new NullPointerException("encoding is null");
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof EncodedPayload)) {
      return false;
    }
    paramObject = (EncodedPayload)paramObject;
    if (!encoding.equals(encoding)) {
      return false;
    }
    return Arrays.equals(bytes, bytes);
  }
  
  public byte[] getBytes()
  {
    return bytes;
  }
  
  public Encoding getEncoding()
  {
    return encoding;
  }
  
  public int hashCode()
  {
    return (encoding.hashCode() ^ 0xF4243) * 1000003 ^ Arrays.hashCode(bytes);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("EncodedPayload{encoding=");
    localStringBuilder.append(encoding);
    localStringBuilder.append(", bytes=[...]}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.EncodedPayload
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */