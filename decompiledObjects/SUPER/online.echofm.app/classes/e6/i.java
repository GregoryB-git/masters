package e6;

import V5.t;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import kotlin.jvm.internal.Intrinsics;

public class i
  extends h
{
  public static final ByteBuffer a(int paramInt, CharsetEncoder paramCharsetEncoder)
  {
    Intrinsics.checkNotNullParameter(paramCharsetEncoder, "encoder");
    paramCharsetEncoder = ByteBuffer.allocate(paramInt * (int)(float)Math.ceil(paramCharsetEncoder.maxBytesPerChar()));
    Intrinsics.checkNotNullExpressionValue(paramCharsetEncoder, "allocate(...)");
    return paramCharsetEncoder;
  }
  
  public static final CharsetEncoder b(Charset paramCharset)
  {
    Intrinsics.checkNotNullParameter(paramCharset, "<this>");
    CharsetEncoder localCharsetEncoder = paramCharset.newEncoder();
    paramCharset = CodingErrorAction.REPLACE;
    return localCharsetEncoder.onMalformedInput(paramCharset).onUnmappableCharacter(paramCharset);
  }
  
  public static final String c(File paramFile, Charset paramCharset)
  {
    Intrinsics.checkNotNullParameter(paramFile, "<this>");
    Intrinsics.checkNotNullParameter(paramCharset, "charset");
    paramFile = new InputStreamReader(new FileInputStream(paramFile), paramCharset);
    try
    {
      paramCharset = m.f(paramFile);
      b.a(paramFile, null);
      return paramCharset;
    }
    finally
    {
      try
      {
        throw paramCharset;
      }
      finally
      {
        b.a(paramFile, paramCharset);
      }
    }
  }
  
  public static final void e(File paramFile, String paramString, Charset paramCharset)
  {
    Intrinsics.checkNotNullParameter(paramFile, "<this>");
    Intrinsics.checkNotNullParameter(paramString, "text");
    Intrinsics.checkNotNullParameter(paramCharset, "charset");
    paramFile = new FileOutputStream(paramFile);
    try
    {
      g(paramFile, paramString, paramCharset);
      paramString = t.a;
      b.a(paramFile, null);
      return;
    }
    finally
    {
      try
      {
        throw paramString;
      }
      finally
      {
        b.a(paramFile, paramString);
      }
    }
  }
  
  public static final void g(OutputStream paramOutputStream, String paramString, Charset paramCharset)
  {
    Intrinsics.checkNotNullParameter(paramOutputStream, "<this>");
    Intrinsics.checkNotNullParameter(paramString, "text");
    Intrinsics.checkNotNullParameter(paramCharset, "charset");
    if (paramString.length() < 16384)
    {
      paramString = paramString.getBytes(paramCharset);
      Intrinsics.checkNotNullExpressionValue(paramString, "getBytes(...)");
      paramOutputStream.write(paramString);
      return;
    }
    CharsetEncoder localCharsetEncoder = b(paramCharset);
    CharBuffer localCharBuffer = CharBuffer.allocate(8192);
    Intrinsics.b(localCharsetEncoder);
    paramCharset = a(8192, localCharsetEncoder);
    int i = 0;
    int j = i;
    while (i < paramString.length())
    {
      int k = Math.min(8192 - j, paramString.length() - i);
      int m = i + k;
      char[] arrayOfChar = localCharBuffer.array();
      Intrinsics.checkNotNullExpressionValue(arrayOfChar, "array(...)");
      paramString.getChars(i, m, arrayOfChar, j);
      localCharBuffer.limit(k + j);
      i = paramString.length();
      j = 1;
      boolean bool;
      if (m == i) {
        bool = true;
      } else {
        bool = false;
      }
      if (localCharsetEncoder.encode(localCharBuffer, paramCharset, bool).isUnderflow())
      {
        paramOutputStream.write(paramCharset.array(), 0, paramCharset.position());
        if (localCharBuffer.position() != localCharBuffer.limit()) {
          localCharBuffer.put(0, localCharBuffer.get());
        } else {
          j = 0;
        }
        localCharBuffer.clear();
        paramCharset.clear();
        i = m;
      }
      else
      {
        throw new IllegalStateException("Check failed.".toString());
      }
    }
  }
}

/* Location:
 * Qualified Name:     e6.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */