package com.google.android.exoplayer2.source.dash;

final class DashMediaSource$DefaultPlayerEmsgCallback
  implements PlayerEmsgHandler.PlayerEmsgCallback
{
  private DashMediaSource$DefaultPlayerEmsgCallback(DashMediaSource paramDashMediaSource) {}
  
  public void onDashLiveMediaPresentationEndSignalEncountered()
  {
    this$0.onDashLiveMediaPresentationEndSignalEncountered();
  }
  
  public void onDashManifestPublishTimeExpired(long paramLong)
  {
    this$0.onDashManifestPublishTimeExpired(paramLong);
  }
  
  public void onDashManifestRefreshRequested()
  {
    this$0.onDashManifestRefreshRequested();
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.dash.DashMediaSource.DefaultPlayerEmsgCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */