package com.google.android.exoplayer2.text.dvb;

import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.List;

public final class DvbDecoder
  extends SimpleSubtitleDecoder
{
  private final DvbParser parser;
  
  public DvbDecoder(List<byte[]> paramList)
  {
    super("DvbDecoder");
    paramList = new ParsableByteArray((byte[])paramList.get(0));
    parser = new DvbParser(paramList.readUnsignedShort(), paramList.readUnsignedShort());
  }
  
  public DvbSubtitle decode(byte[] paramArrayOfByte, int paramInt, boolean paramBoolean)
  {
    if (paramBoolean) {
      parser.reset();
    }
    return new DvbSubtitle(parser.decode(paramArrayOfByte, paramInt));
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.text.dvb.DvbDecoder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */