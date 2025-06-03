package io.flutter.embedding.engine.systemchannels;

public abstract interface ScribeChannel$ScribeMethodHandler
{
  public abstract boolean isFeatureAvailable();
  
  public abstract boolean isStylusHandwritingAvailable();
  
  public abstract void startStylusHandwriting();
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.ScribeChannel.ScribeMethodHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */