package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.auto.value.AutoValue.Builder;

@AutoValue.Builder
public abstract class SendRequest$Builder
{
  public abstract SendRequest build();
  
  public abstract Builder setEncoding(Encoding paramEncoding);
  
  public abstract Builder setEvent(Event<?> paramEvent);
  
  public <T> Builder setEvent(Event<T> paramEvent, Encoding paramEncoding, Transformer<T, byte[]> paramTransformer)
  {
    setEvent(paramEvent);
    setEncoding(paramEncoding);
    setTransformer(paramTransformer);
    return this;
  }
  
  public abstract Builder setTransformer(Transformer<?, byte[]> paramTransformer);
  
  public abstract Builder setTransportContext(TransportContext paramTransportContext);
  
  public abstract Builder setTransportName(String paramString);
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.SendRequest.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */