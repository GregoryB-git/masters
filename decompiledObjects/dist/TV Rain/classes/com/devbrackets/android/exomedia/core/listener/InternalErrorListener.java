package com.devbrackets.android.exomedia.core.listener;

public abstract interface InternalErrorListener
{
  public abstract void onAudioSinkUnderrun(int paramInt, long paramLong1, long paramLong2);
  
  public abstract void onDrmSessionManagerError(Exception paramException);
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.core.listener.InternalErrorListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */