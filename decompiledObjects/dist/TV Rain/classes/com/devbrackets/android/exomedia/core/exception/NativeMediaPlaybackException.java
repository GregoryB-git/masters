package com.devbrackets.android.exomedia.core.exception;

public class NativeMediaPlaybackException
  extends Exception
{
  public final int extra;
  public final int what;
  
  public NativeMediaPlaybackException(int paramInt1, int paramInt2)
  {
    super(localStringBuilder.toString());
    what = paramInt1;
    extra = paramInt2;
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.core.exception.NativeMediaPlaybackException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */