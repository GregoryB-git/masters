package com.google.android.datatransport.runtime.backends;

import androidx.annotation.Nullable;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.auto.value.AutoValue;
import com.google.auto.value.AutoValue.Builder;

@AutoValue
public abstract class BackendRequest
{
  public static Builder builder()
  {
    return new AutoValue_BackendRequest.Builder();
  }
  
  public static BackendRequest create(Iterable<EventInternal> paramIterable)
  {
    return builder().setEvents(paramIterable).build();
  }
  
  public abstract Iterable<EventInternal> getEvents();
  
  @Nullable
  public abstract byte[] getExtras();
  
  @AutoValue.Builder
  public static abstract class Builder
  {
    public abstract BackendRequest build();
    
    public abstract Builder setEvents(Iterable<EventInternal> paramIterable);
    
    public abstract Builder setExtras(@Nullable byte[] paramArrayOfByte);
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.backends.BackendRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */