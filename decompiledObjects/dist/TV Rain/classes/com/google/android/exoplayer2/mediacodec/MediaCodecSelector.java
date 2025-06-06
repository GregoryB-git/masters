package com.google.android.exoplayer2.mediacodec;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

public abstract interface MediaCodecSelector
{
  public static final MediaCodecSelector DEFAULT = new MediaCodecSelector()
  {
    public List<MediaCodecInfo> getDecoderInfos(String paramAnonymousString, boolean paramAnonymousBoolean)
      throws MediaCodecUtil.DecoderQueryException
    {
      paramAnonymousString = MediaCodecUtil.getDecoderInfos(paramAnonymousString, paramAnonymousBoolean);
      if (paramAnonymousString.isEmpty()) {
        paramAnonymousString = Collections.emptyList();
      } else {
        paramAnonymousString = Collections.singletonList(paramAnonymousString.get(0));
      }
      return paramAnonymousString;
    }
    
    @Nullable
    public MediaCodecInfo getPassthroughDecoderInfo()
      throws MediaCodecUtil.DecoderQueryException
    {
      return MediaCodecUtil.getPassthroughDecoderInfo();
    }
  };
  public static final MediaCodecSelector DEFAULT_WITH_FALLBACK = new MediaCodecSelector()
  {
    public List<MediaCodecInfo> getDecoderInfos(String paramAnonymousString, boolean paramAnonymousBoolean)
      throws MediaCodecUtil.DecoderQueryException
    {
      return MediaCodecUtil.getDecoderInfos(paramAnonymousString, paramAnonymousBoolean);
    }
    
    @Nullable
    public MediaCodecInfo getPassthroughDecoderInfo()
      throws MediaCodecUtil.DecoderQueryException
    {
      return MediaCodecUtil.getPassthroughDecoderInfo();
    }
  };
  
  public abstract List<MediaCodecInfo> getDecoderInfos(String paramString, boolean paramBoolean)
    throws MediaCodecUtil.DecoderQueryException;
  
  @Nullable
  public abstract MediaCodecInfo getPassthroughDecoderInfo()
    throws MediaCodecUtil.DecoderQueryException;
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.mediacodec.MediaCodecSelector
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */