package com.google.android.exoplayer2.source.dash;

import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.LoaderErrorThrower;
import java.io.IOException;

final class DashMediaSource$ManifestLoadErrorThrower
  implements LoaderErrorThrower
{
  public DashMediaSource$ManifestLoadErrorThrower(DashMediaSource paramDashMediaSource) {}
  
  private void maybeThrowManifestError()
    throws IOException
  {
    if (DashMediaSource.access$600(this$0) == null) {
      return;
    }
    throw DashMediaSource.access$600(this$0);
  }
  
  public void maybeThrowError()
    throws IOException
  {
    DashMediaSource.access$500(this$0).maybeThrowError();
    maybeThrowManifestError();
  }
  
  public void maybeThrowError(int paramInt)
    throws IOException
  {
    DashMediaSource.access$500(this$0).maybeThrowError(paramInt);
    maybeThrowManifestError();
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.dash.DashMediaSource.ManifestLoadErrorThrower
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */