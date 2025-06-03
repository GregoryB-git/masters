package com.google.android.exoplayer2.metadata;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.emsg.EventMessageDecoder;
import com.google.android.exoplayer2.metadata.id3.Id3Decoder;
import com.google.android.exoplayer2.metadata.scte35.SpliceInfoDecoder;

public abstract interface MetadataDecoderFactory
{
  public static final MetadataDecoderFactory DEFAULT = new MetadataDecoderFactory()
  {
    public MetadataDecoder createDecoder(Format paramAnonymousFormat)
    {
      paramAnonymousFormat = sampleMimeType;
      paramAnonymousFormat.getClass();
      int i = paramAnonymousFormat.hashCode();
      int j = -1;
      switch (i)
      {
      default: 
        break;
      case 1652648887: 
        if (paramAnonymousFormat.equals("application/x-scte35")) {
          j = 2;
        }
        break;
      case 1154383568: 
        if (paramAnonymousFormat.equals("application/x-emsg")) {
          j = 1;
        }
        break;
      case -1248341703: 
        if (paramAnonymousFormat.equals("application/id3")) {
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
    
    public boolean supportsFormat(Format paramAnonymousFormat)
    {
      paramAnonymousFormat = sampleMimeType;
      boolean bool;
      if ((!"application/id3".equals(paramAnonymousFormat)) && (!"application/x-emsg".equals(paramAnonymousFormat)) && (!"application/x-scte35".equals(paramAnonymousFormat))) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
  };
  
  public abstract MetadataDecoder createDecoder(Format paramFormat);
  
  public abstract boolean supportsFormat(Format paramFormat);
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.metadata.MetadataDecoderFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */