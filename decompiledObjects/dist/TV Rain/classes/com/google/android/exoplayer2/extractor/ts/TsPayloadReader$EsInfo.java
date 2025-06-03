package com.google.android.exoplayer2.extractor.ts;

import java.util.Collections;
import java.util.List;

public final class TsPayloadReader$EsInfo
{
  public final byte[] descriptorBytes;
  public final List<TsPayloadReader.DvbSubtitleInfo> dvbSubtitleInfos;
  public final String language;
  public final int streamType;
  
  public TsPayloadReader$EsInfo(int paramInt, String paramString, List<TsPayloadReader.DvbSubtitleInfo> paramList, byte[] paramArrayOfByte)
  {
    streamType = paramInt;
    language = paramString;
    if (paramList == null) {
      paramString = Collections.emptyList();
    } else {
      paramString = Collections.unmodifiableList(paramList);
    }
    dvbSubtitleInfos = paramString;
    descriptorBytes = paramArrayOfByte;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.ts.TsPayloadReader.EsInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */