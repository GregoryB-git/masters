package com.google.android.datatransport.runtime.backends;

import androidx.annotation.Nullable;
import com.google.android.datatransport.runtime.EventInternal;
import java.util.Arrays;
import z2;

final class AutoValue_BackendRequest
  extends BackendRequest
{
  private final Iterable<EventInternal> events;
  private final byte[] extras;
  
  private AutoValue_BackendRequest(Iterable<EventInternal> paramIterable, @Nullable byte[] paramArrayOfByte)
  {
    events = paramIterable;
    extras = paramArrayOfByte;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof BackendRequest))
    {
      paramObject = (BackendRequest)paramObject;
      if (events.equals(((BackendRequest)paramObject).getEvents()))
      {
        byte[] arrayOfByte = extras;
        if ((paramObject instanceof AutoValue_BackendRequest)) {
          paramObject = extras;
        } else {
          paramObject = ((BackendRequest)paramObject).getExtras();
        }
        if (Arrays.equals(arrayOfByte, (byte[])paramObject)) {}
      }
      else
      {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public Iterable<EventInternal> getEvents()
  {
    return events;
  }
  
  @Nullable
  public byte[] getExtras()
  {
    return extras;
  }
  
  public int hashCode()
  {
    return (events.hashCode() ^ 0xF4243) * 1000003 ^ Arrays.hashCode(extras);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("BackendRequest{events=");
    localStringBuilder.append(events);
    localStringBuilder.append(", extras=");
    localStringBuilder.append(Arrays.toString(extras));
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static final class Builder
    extends BackendRequest.Builder
  {
    private Iterable<EventInternal> events;
    private byte[] extras;
    
    public BackendRequest build()
    {
      String str;
      if (events == null) {
        str = " events";
      } else {
        str = "";
      }
      if (str.isEmpty()) {
        return new AutoValue_BackendRequest(events, extras, null);
      }
      throw new IllegalStateException(z2.o("Missing required properties:", str));
    }
    
    public BackendRequest.Builder setEvents(Iterable<EventInternal> paramIterable)
    {
      if (paramIterable != null)
      {
        events = paramIterable;
        return this;
      }
      throw new NullPointerException("Null events");
    }
    
    public BackendRequest.Builder setExtras(@Nullable byte[] paramArrayOfByte)
    {
      extras = paramArrayOfByte;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.backends.AutoValue_BackendRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */