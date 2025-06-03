package com.google.android.exoplayer2.upstream;

public abstract interface HttpDataSource$Factory
  extends DataSource.Factory
{
  @Deprecated
  public abstract void clearAllDefaultRequestProperties();
  
  @Deprecated
  public abstract void clearDefaultRequestProperty(String paramString);
  
  public abstract HttpDataSource createDataSource();
  
  public abstract HttpDataSource.RequestProperties getDefaultRequestProperties();
  
  @Deprecated
  public abstract void setDefaultRequestProperty(String paramString1, String paramString2);
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.HttpDataSource.Factory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */