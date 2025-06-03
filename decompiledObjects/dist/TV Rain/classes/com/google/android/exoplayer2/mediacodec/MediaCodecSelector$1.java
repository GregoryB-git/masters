package com.google.android.exoplayer2.mediacodec;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

final class MediaCodecSelector$1
  implements MediaCodecSelector
{
  public List<MediaCodecInfo> getDecoderInfos(String paramString, boolean paramBoolean)
    throws MediaCodecUtil.DecoderQueryException
  {
    paramString = MediaCodecUtil.getDecoderInfos(paramString, paramBoolean);
    if (paramString.isEmpty()) {
      paramString = Collections.emptyList();
    } else {
      paramString = Collections.singletonList(paramString.get(0));
    }
    return paramString;
  }
  
  @Nullable
  public MediaCodecInfo getPassthroughDecoderInfo()
    throws MediaCodecUtil.DecoderQueryException
  {
    return MediaCodecUtil.getPassthroughDecoderInfo();
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.mediacodec.MediaCodecSelector.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */