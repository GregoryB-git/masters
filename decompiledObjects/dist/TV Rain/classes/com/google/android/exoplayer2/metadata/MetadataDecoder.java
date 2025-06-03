package com.google.android.exoplayer2.metadata;

import androidx.annotation.Nullable;

public abstract interface MetadataDecoder
{
  @Nullable
  public abstract Metadata decode(MetadataInputBuffer paramMetadataInputBuffer);
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.metadata.MetadataDecoder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */