package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.auto.value.AutoValue;
import com.google.auto.value.AutoValue.Builder;

@AutoValue
abstract class SendRequest
{
  public static Builder builder()
  {
    return new AutoValue_SendRequest.Builder();
  }
  
  public abstract Encoding getEncoding();
  
  public abstract Event<?> getEvent();
  
  public byte[] getPayload()
  {
    return (byte[])getTransformer().apply(getEvent().getPayload());
  }
  
  public abstract Transformer<?, byte[]> getTransformer();
  
  public abstract TransportContext getTransportContext();
  
  public abstract String getTransportName();
  
  @AutoValue.Builder
  public static abstract class Builder
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
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.SendRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */