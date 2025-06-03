package androidx.emoji2.text.flatbuffer;

import a5;
import b5;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.StandardCharsets;

public class Utf8Old
  extends Utf8
{
  private static final ThreadLocal<Cache> CACHE = new b5(new a5());
  
  public String decodeUtf8(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2)
  {
    CharsetDecoder localCharsetDecoder = CACHEgetdecoder;
    localCharsetDecoder.reset();
    paramByteBuffer = paramByteBuffer.duplicate();
    paramByteBuffer.position(paramInt1);
    paramByteBuffer.limit(paramInt1 + paramInt2);
    try
    {
      paramByteBuffer = localCharsetDecoder.decode(paramByteBuffer).toString();
      return paramByteBuffer;
    }
    catch (CharacterCodingException paramByteBuffer)
    {
      throw new IllegalArgumentException("Bad encoding", paramByteBuffer);
    }
  }
  
  public void encodeUtf8(CharSequence paramCharSequence, ByteBuffer paramByteBuffer)
  {
    Cache localCache = (Cache)CACHE.get();
    if (lastInput != paramCharSequence) {
      encodedLength(paramCharSequence);
    }
    paramByteBuffer.put(lastOutput);
  }
  
  public int encodedLength(CharSequence paramCharSequence)
  {
    Cache localCache = (Cache)CACHE.get();
    float f = paramCharSequence.length();
    int i = (int)(encoder.maxBytesPerChar() * f);
    ByteBuffer localByteBuffer = lastOutput;
    if ((localByteBuffer == null) || (localByteBuffer.capacity() < i)) {
      lastOutput = ByteBuffer.allocate(Math.max(128, i));
    }
    lastOutput.clear();
    lastInput = paramCharSequence;
    if ((paramCharSequence instanceof CharBuffer)) {
      paramCharSequence = (CharBuffer)paramCharSequence;
    } else {
      paramCharSequence = CharBuffer.wrap(paramCharSequence);
    }
    paramCharSequence = encoder.encode(paramCharSequence, lastOutput, true);
    if (paramCharSequence.isError()) {
      try
      {
        paramCharSequence.throwException();
      }
      catch (CharacterCodingException paramCharSequence)
      {
        throw new IllegalArgumentException("bad character encoding", paramCharSequence);
      }
    }
    lastOutput.flip();
    return lastOutput.remaining();
  }
  
  public static class Cache
  {
    public final CharsetDecoder decoder = StandardCharsets.UTF_8.newDecoder();
    public final CharsetEncoder encoder = StandardCharsets.UTF_8.newEncoder();
    public CharSequence lastInput = null;
    public ByteBuffer lastOutput = null;
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.flatbuffer.Utf8Old
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */