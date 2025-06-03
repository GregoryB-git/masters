package com.google.android.exoplayer2.mediacodec;

import androidx.annotation.Nullable;
import java.util.List;

final class MediaCodecSelector$2
  implements MediaCodecSelector
{
  public List<MediaCodecInfo> getDecoderInfos(String paramString, boolean paramBoolean)
    throws MediaCodecUtil.DecoderQueryException
  {
    return MediaCodecUtil.getDecoderInfos(paramString, paramBoolean);
  }
  
  @Nullable
  public MediaCodecInfo getPassthroughDecoderInfo()
    throws MediaCodecUtil.DecoderQueryException
  {
    return MediaCodecUtil.getPassthroughDecoderInfo();
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.mediacodec.MediaCodecSelector.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */