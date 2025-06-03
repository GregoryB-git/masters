package com.google.android.exoplayer2.source.dash;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.upstream.LoaderErrorThrower;
import com.google.android.exoplayer2.upstream.TransferListener;

public abstract interface DashChunkSource$Factory
{
  public abstract DashChunkSource createDashChunkSource(LoaderErrorThrower paramLoaderErrorThrower, DashManifest paramDashManifest, int paramInt1, int[] paramArrayOfInt, TrackSelection paramTrackSelection, int paramInt2, long paramLong, boolean paramBoolean1, boolean paramBoolean2, @Nullable PlayerEmsgHandler.PlayerTrackEmsgHandler paramPlayerTrackEmsgHandler, @Nullable TransferListener paramTransferListener);
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.dash.DashChunkSource.Factory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */