package com.google.android.exoplayer2;

public abstract interface RendererCapabilities
{
  public static final int ADAPTIVE_NOT_SEAMLESS = 8;
  public static final int ADAPTIVE_NOT_SUPPORTED = 0;
  public static final int ADAPTIVE_SEAMLESS = 16;
  public static final int ADAPTIVE_SUPPORT_MASK = 24;
  public static final int FORMAT_EXCEEDS_CAPABILITIES = 3;
  public static final int FORMAT_HANDLED = 4;
  public static final int FORMAT_SUPPORT_MASK = 7;
  public static final int FORMAT_UNSUPPORTED_DRM = 2;
  public static final int FORMAT_UNSUPPORTED_SUBTYPE = 1;
  public static final int FORMAT_UNSUPPORTED_TYPE = 0;
  public static final int TUNNELING_NOT_SUPPORTED = 0;
  public static final int TUNNELING_SUPPORTED = 32;
  public static final int TUNNELING_SUPPORT_MASK = 32;
  
  public abstract int getTrackType();
  
  public abstract int supportsFormat(Format paramFormat)
    throws ExoPlaybackException;
  
  public abstract int supportsMixedMimeTypeAdaptation()
    throws ExoPlaybackException;
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.RendererCapabilities
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */