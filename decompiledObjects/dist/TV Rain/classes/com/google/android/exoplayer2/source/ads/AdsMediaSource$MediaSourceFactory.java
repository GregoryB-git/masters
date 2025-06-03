package com.google.android.exoplayer2.source.ads;

import android.net.Uri;
import com.google.android.exoplayer2.source.MediaSource;

public abstract interface AdsMediaSource$MediaSourceFactory
{
  public abstract MediaSource createMediaSource(Uri paramUri);
  
  public abstract int[] getSupportedTypes();
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.ads.AdsMediaSource.MediaSourceFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */