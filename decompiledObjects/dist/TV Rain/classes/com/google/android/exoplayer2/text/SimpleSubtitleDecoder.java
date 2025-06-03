package com.google.android.exoplayer2.text;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.decoder.SimpleDecoder;
import java.nio.ByteBuffer;

public abstract class SimpleSubtitleDecoder
  extends SimpleDecoder<SubtitleInputBuffer, SubtitleOutputBuffer, SubtitleDecoderException>
  implements SubtitleDecoder
{
  private final String name;
  
  public SimpleSubtitleDecoder(String paramString)
  {
    super(new SubtitleInputBuffer[2], new SubtitleOutputBuffer[2]);
    name = paramString;
    setInitialInputBufferSize(1024);
  }
  
  public final SubtitleInputBuffer createInputBuffer()
  {
    return new SubtitleInputBuffer();
  }
  
  public final SubtitleOutputBuffer createOutputBuffer()
  {
    return new SimpleSubtitleOutputBuffer(this);
  }
  
  public final SubtitleDecoderException createUnexpectedDecodeException(Throwable paramThrowable)
  {
    return new SubtitleDecoderException("Unexpected decode error", paramThrowable);
  }
  
  public abstract Subtitle decode(byte[] paramArrayOfByte, int paramInt, boolean paramBoolean)
    throws SubtitleDecoderException;
  
  public final SubtitleDecoderException decode(SubtitleInputBuffer paramSubtitleInputBuffer, SubtitleOutputBuffer paramSubtitleOutputBuffer, boolean paramBoolean)
  {
    try
    {
      Object localObject = data;
      localObject = decode(((ByteBuffer)localObject).array(), ((java.nio.Buffer)localObject).limit(), paramBoolean);
      paramSubtitleOutputBuffer.setContent(timeUs, (Subtitle)localObject, subsampleOffsetUs);
      paramSubtitleOutputBuffer.clearFlag(Integer.MIN_VALUE);
      return null;
    }
    catch (SubtitleDecoderException paramSubtitleInputBuffer) {}
    return paramSubtitleInputBuffer;
  }
  
  public final String getName()
  {
    return name;
  }
  
  public final void releaseOutputBuffer(SubtitleOutputBuffer paramSubtitleOutputBuffer)
  {
    super.releaseOutputBuffer(paramSubtitleOutputBuffer);
  }
  
  public void setPositionUs(long paramLong) {}
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.text.SimpleSubtitleDecoder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */