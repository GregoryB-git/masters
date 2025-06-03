package com.google.android.datatransport;

public abstract interface TransportFactory
{
  public abstract <T> Transport<T> getTransport(String paramString, Class<T> paramClass, Encoding paramEncoding, Transformer<T, byte[]> paramTransformer);
  
  @Deprecated
  public abstract <T> Transport<T> getTransport(String paramString, Class<T> paramClass, Transformer<T, byte[]> paramTransformer);
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.TransportFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */