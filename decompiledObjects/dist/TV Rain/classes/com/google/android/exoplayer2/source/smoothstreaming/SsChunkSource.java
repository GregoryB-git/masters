package com.google.android.exoplayer2.source.smoothstreaming;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox;
import com.google.android.exoplayer2.source.chunk.ChunkSource;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.upstream.LoaderErrorThrower;
import com.google.android.exoplayer2.upstream.TransferListener;

public abstract interface SsChunkSource
  extends ChunkSource
{
  public abstract void updateManifest(SsManifest paramSsManifest);
  
  public static abstract interface Factory
  {
    public abstract SsChunkSource createChunkSource(LoaderErrorThrower paramLoaderErrorThrower, SsManifest paramSsManifest, int paramInt, TrackSelection paramTrackSelection, TrackEncryptionBox[] paramArrayOfTrackEncryptionBox, @Nullable TransferListener paramTransferListener);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.smoothstreaming.SsChunkSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */