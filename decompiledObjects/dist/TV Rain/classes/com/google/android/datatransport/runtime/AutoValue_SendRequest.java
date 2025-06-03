package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import z2;

final class AutoValue_SendRequest
  extends SendRequest
{
  private final Encoding encoding;
  private final Event<?> event;
  private final Transformer<?, byte[]> transformer;
  private final TransportContext transportContext;
  private final String transportName;
  
  private AutoValue_SendRequest(TransportContext paramTransportContext, String paramString, Event<?> paramEvent, Transformer<?, byte[]> paramTransformer, Encoding paramEncoding)
  {
    transportContext = paramTransportContext;
    transportName = paramString;
    event = paramEvent;
    transformer = paramTransformer;
    encoding = paramEncoding;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof SendRequest))
    {
      paramObject = (SendRequest)paramObject;
      if ((!transportContext.equals(((SendRequest)paramObject).getTransportContext())) || (!transportName.equals(((SendRequest)paramObject).getTransportName())) || (!event.equals(((SendRequest)paramObject).getEvent())) || (!transformer.equals(((SendRequest)paramObject).getTransformer())) || (!encoding.equals(((SendRequest)paramObject).getEncoding()))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public Encoding getEncoding()
  {
    return encoding;
  }
  
  public Event<?> getEvent()
  {
    return event;
  }
  
  public Transformer<?, byte[]> getTransformer()
  {
    return transformer;
  }
  
  public TransportContext getTransportContext()
  {
    return transportContext;
  }
  
  public String getTransportName()
  {
    return transportName;
  }
  
  public int hashCode()
  {
    return ((((transportContext.hashCode() ^ 0xF4243) * 1000003 ^ transportName.hashCode()) * 1000003 ^ event.hashCode()) * 1000003 ^ transformer.hashCode()) * 1000003 ^ encoding.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("SendRequest{transportContext=");
    localStringBuilder.append(transportContext);
    localStringBuilder.append(", transportName=");
    localStringBuilder.append(transportName);
    localStringBuilder.append(", event=");
    localStringBuilder.append(event);
    localStringBuilder.append(", transformer=");
    localStringBuilder.append(transformer);
    localStringBuilder.append(", encoding=");
    localStringBuilder.append(encoding);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static final class Builder
    extends SendRequest.Builder
  {
    private Encoding encoding;
    private Event<?> event;
    private Transformer<?, byte[]> transformer;
    private TransportContext transportContext;
    private String transportName;
    
    public SendRequest build()
    {
      if (transportContext == null) {
        localObject1 = " transportContext";
      } else {
        localObject1 = "";
      }
      Object localObject2 = localObject1;
      if (transportName == null) {
        localObject2 = z2.o((String)localObject1, " transportName");
      }
      Object localObject1 = localObject2;
      if (event == null) {
        localObject1 = z2.o((String)localObject2, " event");
      }
      localObject2 = localObject1;
      if (transformer == null) {
        localObject2 = z2.o((String)localObject1, " transformer");
      }
      localObject1 = localObject2;
      if (encoding == null) {
        localObject1 = z2.o((String)localObject2, " encoding");
      }
      if (((String)localObject1).isEmpty()) {
        return new AutoValue_SendRequest(transportContext, transportName, event, transformer, encoding, null);
      }
      throw new IllegalStateException(z2.o("Missing required properties:", (String)localObject1));
    }
    
    public SendRequest.Builder setEncoding(Encoding paramEncoding)
    {
      if (paramEncoding != null)
      {
        encoding = paramEncoding;
        return this;
      }
      throw new NullPointerException("Null encoding");
    }
    
    public SendRequest.Builder setEvent(Event<?> paramEvent)
    {
      if (paramEvent != null)
      {
        event = paramEvent;
        return this;
      }
      throw new NullPointerException("Null event");
    }
    
    public SendRequest.Builder setTransformer(Transformer<?, byte[]> paramTransformer)
    {
      if (paramTransformer != null)
      {
        transformer = paramTransformer;
        return this;
      }
      throw new NullPointerException("Null transformer");
    }
    
    public SendRequest.Builder setTransportContext(TransportContext paramTransportContext)
    {
      if (paramTransportContext != null)
      {
        transportContext = paramTransportContext;
        return this;
      }
      throw new NullPointerException("Null transportContext");
    }
    
    public SendRequest.Builder setTransportName(String paramString)
    {
      if (paramString != null)
      {
        transportName = paramString;
        return this;
      }
      throw new NullPointerException("Null transportName");
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.AutoValue_SendRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */