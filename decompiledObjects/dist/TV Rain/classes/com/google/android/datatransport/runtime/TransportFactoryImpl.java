package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportFactory;
import java.util.Set;

final class TransportFactoryImpl
  implements TransportFactory
{
  private final Set<Encoding> supportedPayloadEncodings;
  private final TransportContext transportContext;
  private final TransportInternal transportInternal;
  
  public TransportFactoryImpl(Set<Encoding> paramSet, TransportContext paramTransportContext, TransportInternal paramTransportInternal)
  {
    supportedPayloadEncodings = paramSet;
    transportContext = paramTransportContext;
    transportInternal = paramTransportInternal;
  }
  
  public <T> Transport<T> getTransport(String paramString, Class<T> paramClass, Encoding paramEncoding, Transformer<T, byte[]> paramTransformer)
  {
    if (supportedPayloadEncodings.contains(paramEncoding)) {
      return new TransportImpl(transportContext, paramString, paramEncoding, paramTransformer, transportInternal);
    }
    throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[] { paramEncoding, supportedPayloadEncodings }));
  }
  
  public <T> Transport<T> getTransport(String paramString, Class<T> paramClass, Transformer<T, byte[]> paramTransformer)
  {
    return getTransport(paramString, paramClass, Encoding.of("proto"), paramTransformer);
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.TransportFactoryImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */