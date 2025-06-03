package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.ParsableByteArray;

abstract class TagPayloadReader
{
  public final TrackOutput output;
  
  public TagPayloadReader(TrackOutput paramTrackOutput)
  {
    output = paramTrackOutput;
  }
  
  public final void consume(ParsableByteArray paramParsableByteArray, long paramLong)
    throws ParserException
  {
    if (parseHeader(paramParsableByteArray)) {
      parsePayload(paramParsableByteArray, paramLong);
    }
  }
  
  public abstract boolean parseHeader(ParsableByteArray paramParsableByteArray)
    throws ParserException;
  
  public abstract void parsePayload(ParsableByteArray paramParsableByteArray, long paramLong)
    throws ParserException;
  
  public abstract void seek();
  
  public static final class UnsupportedFormatException
    extends ParserException
  {
    public UnsupportedFormatException(String paramString)
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.flv.TagPayloadReader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */