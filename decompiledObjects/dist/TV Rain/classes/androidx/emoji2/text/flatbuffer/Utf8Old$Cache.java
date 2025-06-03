package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;

class Utf8Old$Cache
{
  public final CharsetDecoder decoder = StandardCharsets.UTF_8.newDecoder();
  public final CharsetEncoder encoder = StandardCharsets.UTF_8.newEncoder();
  public CharSequence lastInput = null;
  public ByteBuffer lastOutput = null;
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.flatbuffer.Utf8Old.Cache
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */