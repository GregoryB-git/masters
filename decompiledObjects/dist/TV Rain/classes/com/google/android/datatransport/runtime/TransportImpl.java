package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportScheduleCallback;

final class TransportImpl<T>
  implements Transport<T>
{
  private final String name;
  private final Encoding payloadEncoding;
  private final Transformer<T, byte[]> transformer;
  private final TransportContext transportContext;
  private final TransportInternal transportInternal;
  
  public TransportImpl(TransportContext paramTransportContext, String paramString, Encoding paramEncoding, Transformer<T, byte[]> paramTransformer, TransportInternal paramTransportInternal)
  {
    transportContext = paramTransportContext;
    name = paramString;
    payloadEncoding = paramEncoding;
    transformer = paramTransformer;
    transportInternal = paramTransportInternal;
  }
  
  public TransportContext getTransportContext()
  {
    return transportContext;
  }
  
  public void schedule(Event<T> paramEvent, TransportScheduleCallback paramTransportScheduleCallback)
  {
    transportInternal.send(SendRequest.builder().setTransportContext(transportContext).setEvent(paramEvent).setTransportName(name).setTransformer(transformer).setEncoding(payloadEncoding).build(), paramTransportScheduleCallback);
  }
  
  public void send(Event<T> paramEvent)
  {
    schedule(paramEvent, new a());
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.TransportImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */