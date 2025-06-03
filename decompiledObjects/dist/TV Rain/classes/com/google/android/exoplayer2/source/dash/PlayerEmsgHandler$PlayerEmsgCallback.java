package com.google.android.exoplayer2.source.dash;

public abstract interface PlayerEmsgHandler$PlayerEmsgCallback
{
  public abstract void onDashLiveMediaPresentationEndSignalEncountered();
  
  public abstract void onDashManifestPublishTimeExpired(long paramLong);
  
  public abstract void onDashManifestRefreshRequested();
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.dash.PlayerEmsgHandler.PlayerEmsgCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */