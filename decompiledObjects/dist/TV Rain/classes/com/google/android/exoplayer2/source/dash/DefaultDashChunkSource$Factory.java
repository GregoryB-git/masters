package com.google.android.exoplayer2.source.dash;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSource.Factory;
import com.google.android.exoplayer2.upstream.LoaderErrorThrower;
import com.google.android.exoplayer2.upstream.TransferListener;

public final class DefaultDashChunkSource$Factory
  implements DashChunkSource.Factory
{
  private final DataSource.Factory dataSourceFactory;
  private final int maxSegmentsPerLoad;
  
  public DefaultDashChunkSource$Factory(DataSource.Factory paramFactory)
  {
    this(paramFactory, 1);
  }
  
  public DefaultDashChunkSource$Factory(DataSource.Factory paramFactory, int paramInt)
  {
    dataSourceFactory = paramFactory;
    maxSegmentsPerLoad = paramInt;
  }
  
  public DashChunkSource createDashChunkSource(LoaderErrorThrower paramLoaderErrorThrower, DashManifest paramDashManifest, int paramInt1, int[] paramArrayOfInt, TrackSelection paramTrackSelection, int paramInt2, long paramLong, boolean paramBoolean1, boolean paramBoolean2, @Nullable PlayerEmsgHandler.PlayerTrackEmsgHandler paramPlayerTrackEmsgHandler, @Nullable TransferListener paramTransferListener)
  {
    DataSource localDataSource = dataSourceFactory.createDataSource();
    if (paramTransferListener != null) {
      localDataSource.addTransferListener(paramTransferListener);
    }
    return new DefaultDashChunkSource(paramLoaderErrorThrower, paramDashManifest, paramInt1, paramArrayOfInt, paramTrackSelection, paramInt2, localDataSource, paramLong, maxSegmentsPerLoad, paramBoolean1, paramBoolean2, paramPlayerTrackEmsgHandler);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.dash.DefaultDashChunkSource.Factory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */