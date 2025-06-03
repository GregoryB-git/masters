package com.google.android.exoplayer2.metadata;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.emsg.EventMessageDecoder;
import com.google.android.exoplayer2.metadata.id3.Id3Decoder;
import com.google.android.exoplayer2.metadata.scte35.SpliceInfoDecoder;

final class MetadataDecoderFactory$1
  implements MetadataDecoderFactory
{
  public MetadataDecoder createDecoder(Format paramFormat)
  {
    paramFormat = sampleMimeType;
    paramFormat.getClass();
    int i = paramFormat.hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 1652648887: 
      if (paramFormat.equals("application/x-scte35")) {
        j = 2;
      }
      break;
    case 1154383568: 
      if (paramFormat.equals("application/x-emsg")) {
        j = 1;
      }
      break;
    case -1248341703: 
      if (paramFormat.equals("application/id3")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      throw new IllegalArgumentException("Attempted to create decoder for unsupported format");
    case 2: 
      return new SpliceInfoDecoder();
    case 1: 
      return new EventMessageDecoder();
    }
    return new Id3Decoder();
  }
  
  public boolean supportsFormat(Format paramFormat)
  {
    paramFormat = sampleMimeType;
    boolean bool;
    if ((!"application/id3".equals(paramFormat)) && (!"application/x-emsg".equals(paramFormat)) && (!"application/x-scte35".equals(paramFormat))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.metadata.MetadataDecoderFactory.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */