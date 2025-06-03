package com.google.android.exoplayer2.source.hls;

import com.google.android.exoplayer2.source.SequenceableLoader.Callback;
import com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist.HlsUrl;

public abstract interface HlsSampleStreamWrapper$Callback
  extends SequenceableLoader.Callback<HlsSampleStreamWrapper>
{
  public abstract void onPlaylistRefreshRequired(HlsMasterPlaylist.HlsUrl paramHlsUrl);
  
  public abstract void onPrepared();
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper.Callback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */