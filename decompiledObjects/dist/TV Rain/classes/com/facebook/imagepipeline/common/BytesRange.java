package com.facebook.imagepipeline.common;

import com.facebook.common.internal.Preconditions;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

@Immutable
public class BytesRange
{
  public static final int TO_END_OF_CONTENT = Integer.MAX_VALUE;
  @Nullable
  private static Pattern sHeaderParsingRegEx;
  public final int from;
  public final int to;
  
  public BytesRange(int paramInt1, int paramInt2)
  {
    from = paramInt1;
    to = paramInt2;
  }
  
  public static BytesRange from(int paramInt)
  {
    boolean bool;
    if (paramInt >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkArgument(bool);
    return new BytesRange(paramInt, Integer.MAX_VALUE);
  }
  
  @Nullable
  public static BytesRange fromContentRangeHeader(@Nullable String paramString)
    throws IllegalArgumentException
  {
    if (paramString == null) {
      return null;
    }
    if (sHeaderParsingRegEx == null) {
      sHeaderParsingRegEx = Pattern.compile("[-/ ]");
    }
    try
    {
      Object localObject = sHeaderParsingRegEx.split(paramString);
      boolean bool;
      if (localObject.length == 4) {
        bool = true;
      } else {
        bool = false;
      }
      Preconditions.checkArgument(bool);
      Preconditions.checkArgument(localObject[0].equals("bytes"));
      int i = Integer.parseInt(localObject[1]);
      int j = Integer.parseInt(localObject[2]);
      int k = Integer.parseInt(localObject[3]);
      if (j > i) {
        bool = true;
      } else {
        bool = false;
      }
      Preconditions.checkArgument(bool);
      if (k > j) {
        bool = true;
      } else {
        bool = false;
      }
      Preconditions.checkArgument(bool);
      if (j < k - 1) {
        return new BytesRange(i, j);
      }
      localObject = new BytesRange(i, Integer.MAX_VALUE);
      return (BytesRange)localObject;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      throw new IllegalArgumentException(String.format(null, "Invalid Content-Range header value: \"%s\"", new Object[] { paramString }), localIllegalArgumentException);
    }
  }
  
  public static BytesRange toMax(int paramInt)
  {
    boolean bool;
    if (paramInt > 0) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkArgument(bool);
    return new BytesRange(0, paramInt);
  }
  
  private static String valueOrEmpty(int paramInt)
  {
    if (paramInt == Integer.MAX_VALUE) {
      return "";
    }
    return Integer.toString(paramInt);
  }
  
  public boolean contains(@Nullable BytesRange paramBytesRange)
  {
    boolean bool1 = false;
    if (paramBytesRange == null) {
      return false;
    }
    boolean bool2 = bool1;
    if (from <= from)
    {
      bool2 = bool1;
      if (to >= to) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public String toHttpRangeHeaderValue()
  {
    return String.format(null, "bytes=%s-%s", new Object[] { valueOrEmpty(from), valueOrEmpty(to) });
  }
  
  public String toString()
  {
    return String.format(null, "%s-%s", new Object[] { valueOrEmpty(from), valueOrEmpty(to) });
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.common.BytesRange
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */