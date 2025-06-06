package com.google.android.exoplayer2.upstream.cache;

public abstract interface ContentMetadata
{
  public static final String INTERNAL_METADATA_NAME_PREFIX = "exo_";
  
  public abstract boolean contains(String paramString);
  
  public abstract long get(String paramString, long paramLong);
  
  public abstract String get(String paramString1, String paramString2);
  
  public abstract byte[] get(String paramString, byte[] paramArrayOfByte);
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.cache.ContentMetadata
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */