package com.google.android.exoplayer2.source.hls.playlist;

public abstract interface HlsPlaylistTracker$PlaylistEventListener
{
  public abstract void onPlaylistChanged();
  
  public abstract boolean onPlaylistError(HlsMasterPlaylist.HlsUrl paramHlsUrl, long paramLong);
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.PlaylistEventListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */