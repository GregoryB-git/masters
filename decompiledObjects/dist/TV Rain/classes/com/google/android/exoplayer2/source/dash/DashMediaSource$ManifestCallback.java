package com.google.android.exoplayer2.source.dash;

import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.upstream.Loader.Callback;
import com.google.android.exoplayer2.upstream.Loader.LoadErrorAction;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import java.io.IOException;

final class DashMediaSource$ManifestCallback
  implements Loader.Callback<ParsingLoadable<DashManifest>>
{
  private DashMediaSource$ManifestCallback(DashMediaSource paramDashMediaSource) {}
  
  public void onLoadCanceled(ParsingLoadable<DashManifest> paramParsingLoadable, long paramLong1, long paramLong2, boolean paramBoolean)
  {
    this$0.onLoadCanceled(paramParsingLoadable, paramLong1, paramLong2);
  }
  
  public void onLoadCompleted(ParsingLoadable<DashManifest> paramParsingLoadable, long paramLong1, long paramLong2)
  {
    this$0.onManifestLoadCompleted(paramParsingLoadable, paramLong1, paramLong2);
  }
  
  public Loader.LoadErrorAction onLoadError(ParsingLoadable<DashManifest> paramParsingLoadable, long paramLong1, long paramLong2, IOException paramIOException, int paramInt)
  {
    return this$0.onManifestLoadError(paramParsingLoadable, paramLong1, paramLong2, paramIOException);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.dash.DashMediaSource.ManifestCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */