package com.google.android.datatransport.runtime.backends;

import androidx.annotation.Nullable;
import com.google.android.datatransport.runtime.EventInternal;
import z2;

final class AutoValue_BackendRequest$Builder
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

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.backends.AutoValue_BackendRequest.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */