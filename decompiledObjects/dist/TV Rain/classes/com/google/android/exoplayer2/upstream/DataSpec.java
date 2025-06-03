package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import z2;

public final class DataSpec
{
  public static final int FLAG_ALLOW_CACHING_UNKNOWN_LENGTH = 2;
  public static final int FLAG_ALLOW_GZIP = 1;
  public static final int HTTP_METHOD_GET = 1;
  public static final int HTTP_METHOD_HEAD = 3;
  public static final int HTTP_METHOD_POST = 2;
  public final long absoluteStreamPosition;
  public final int flags;
  @Nullable
  public final byte[] httpBody;
  public final int httpMethod;
  @Nullable
  public final String key;
  public final long length;
  public final long position;
  @Deprecated
  @Nullable
  public final byte[] postBody;
  public final Uri uri;
  
  public DataSpec(Uri paramUri)
  {
    this(paramUri, 0);
  }
  
  public DataSpec(Uri paramUri, int paramInt)
  {
    this(paramUri, 0L, -1L, null, paramInt);
  }
  
  public DataSpec(Uri paramUri, int paramInt1, @Nullable byte[] paramArrayOfByte, long paramLong1, long paramLong2, long paramLong3, @Nullable String paramString, int paramInt2)
  {
    boolean bool1 = true;
    if (paramLong1 >= 0L) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    Assertions.checkArgument(bool2);
    if (paramLong2 >= 0L) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    Assertions.checkArgument(bool2);
    boolean bool2 = bool1;
    if (paramLong3 <= 0L) {
      if (paramLong3 == -1L) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
    }
    Assertions.checkArgument(bool2);
    uri = paramUri;
    httpMethod = paramInt1;
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0)) {
      paramArrayOfByte = null;
    }
    httpBody = paramArrayOfByte;
    postBody = paramArrayOfByte;
    absoluteStreamPosition = paramLong1;
    position = paramLong2;
    length = paramLong3;
    key = paramString;
    flags = paramInt2;
  }
  
  public DataSpec(Uri paramUri, long paramLong1, long paramLong2, long paramLong3, @Nullable String paramString, int paramInt)
  {
    this(paramUri, null, paramLong1, paramLong2, paramLong3, paramString, paramInt);
  }
  
  public DataSpec(Uri paramUri, long paramLong1, long paramLong2, @Nullable String paramString)
  {
    this(paramUri, paramLong1, paramLong1, paramLong2, paramString, 0);
  }
  
  public DataSpec(Uri paramUri, long paramLong1, long paramLong2, @Nullable String paramString, int paramInt)
  {
    this(paramUri, paramLong1, paramLong1, paramLong2, paramString, paramInt);
  }
  
  public DataSpec(Uri paramUri, @Nullable byte[] paramArrayOfByte, long paramLong1, long paramLong2, long paramLong3, @Nullable String paramString, int paramInt)
  {
    this(paramUri, i, paramArrayOfByte, paramLong1, paramLong2, paramLong3, paramString, paramInt);
  }
  
  public static String getStringForHttpMethod(int paramInt)
  {
    if (paramInt != 1)
    {
      if (paramInt != 2)
      {
        if (paramInt == 3) {
          return "HEAD";
        }
        throw new AssertionError(paramInt);
      }
      return "POST";
    }
    return "GET";
  }
  
  public final String getHttpMethodString()
  {
    return getStringForHttpMethod(httpMethod);
  }
  
  public boolean isFlagSet(int paramInt)
  {
    boolean bool;
    if ((flags & paramInt) == paramInt) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public DataSpec subrange(long paramLong)
  {
    long l1 = length;
    long l2 = -1L;
    if (l1 != -1L) {
      l2 = l1 - paramLong;
    }
    return subrange(paramLong, l2);
  }
  
  public DataSpec subrange(long paramLong1, long paramLong2)
  {
    if ((paramLong1 == 0L) && (length == paramLong2)) {
      return this;
    }
    return new DataSpec(uri, httpMethod, httpBody, absoluteStreamPosition + paramLong1, position + paramLong1, paramLong2, key, flags);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("DataSpec[");
    localStringBuilder.append(getHttpMethodString());
    localStringBuilder.append(" ");
    localStringBuilder.append(uri);
    localStringBuilder.append(", ");
    localStringBuilder.append(Arrays.toString(httpBody));
    localStringBuilder.append(", ");
    localStringBuilder.append(absoluteStreamPosition);
    localStringBuilder.append(", ");
    localStringBuilder.append(position);
    localStringBuilder.append(", ");
    localStringBuilder.append(length);
    localStringBuilder.append(", ");
    localStringBuilder.append(key);
    localStringBuilder.append(", ");
    return z2.q(localStringBuilder, flags, "]");
  }
  
  public DataSpec withUri(Uri paramUri)
  {
    return new DataSpec(paramUri, httpMethod, httpBody, absoluteStreamPosition, position, length, key, flags);
  }
  
  @Documented
  @Retention(RetentionPolicy.SOURCE)
  public static @interface Flags {}
  
  @Documented
  @Retention(RetentionPolicy.SOURCE)
  public static @interface HttpMethod {}
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.DataSpec
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */