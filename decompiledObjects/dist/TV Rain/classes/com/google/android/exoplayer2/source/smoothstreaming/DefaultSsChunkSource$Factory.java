package com.google.android.exoplayer2.source.smoothstreaming;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSource.Factory;
import com.google.android.exoplayer2.upstream.LoaderErrorThrower;
import com.google.android.exoplayer2.upstream.TransferListener;

public final class DefaultSsChunkSource$Factory
  implements SsChunkSource.Factory
{
  private final DataSource.Factory dataSourceFactory;
  
  public DefaultSsChunkSource$Factory(DataSource.Factory paramFactory)
  {
    dataSourceFactory = paramFactory;
  }
  
  public SsChunkSource createChunkSource(LoaderErrorThrower paramLoaderErrorThrower, SsManifest paramSsManifest, int paramInt, TrackSelection paramTrackSelection, TrackEncryptionBox[] paramArrayOfTrackEncryptionBox, @Nullable TransferListener paramTransferListener)
  {
    DataSource localDataSource = dataSourceFactory.createDataSource();
    if (paramTransferListener != null) {
      localDataSource.addTransferListener(paramTransferListener);
    }
    return new DefaultSsChunkSource(paramLoaderErrorThrower, paramSsManifest, paramInt, paramTrackSelection, localDataSource, paramArrayOfTrackEncryptionBox);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.smoothstreaming.DefaultSsChunkSource.Factory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */