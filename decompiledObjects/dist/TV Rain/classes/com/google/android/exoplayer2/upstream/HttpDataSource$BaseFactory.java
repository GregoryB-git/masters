package com.google.android.exoplayer2.upstream;

public abstract class HttpDataSource$BaseFactory
  implements HttpDataSource.Factory
{
  private final HttpDataSource.RequestProperties defaultRequestProperties = new HttpDataSource.RequestProperties();
  
  @Deprecated
  public final void clearAllDefaultRequestProperties()
  {
    defaultRequestProperties.clear();
  }
  
  @Deprecated
  public final void clearDefaultRequestProperty(String paramString)
  {
    defaultRequestProperties.remove(paramString);
  }
  
  public final HttpDataSource createDataSource()
  {
    return createDataSourceInternal(defaultRequestProperties);
  }
  
  public abstract HttpDataSource createDataSourceInternal(HttpDataSource.RequestProperties paramRequestProperties);
  
  public final HttpDataSource.RequestProperties getDefaultRequestProperties()
  {
    return defaultRequestProperties;
  }
  
  @Deprecated
  public final void setDefaultRequestProperty(String paramString1, String paramString2)
  {
    defaultRequestProperties.set(paramString1, paramString2);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.HttpDataSource.BaseFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */