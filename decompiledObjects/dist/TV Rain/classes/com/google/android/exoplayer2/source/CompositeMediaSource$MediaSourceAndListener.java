package com.google.android.exoplayer2.source;

final class CompositeMediaSource$MediaSourceAndListener
{
  public final MediaSourceEventListener eventListener;
  public final MediaSource.SourceInfoRefreshListener listener;
  public final MediaSource mediaSource;
  
  public CompositeMediaSource$MediaSourceAndListener(MediaSource paramMediaSource, MediaSource.SourceInfoRefreshListener paramSourceInfoRefreshListener, MediaSourceEventListener paramMediaSourceEventListener)
  {
    mediaSource = paramMediaSource;
    listener = paramSourceInfoRefreshListener;
    eventListener = paramMediaSourceEventListener;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.CompositeMediaSource.MediaSourceAndListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */