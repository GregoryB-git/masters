package com.google.android.datatransport.runtime.backends;

import androidx.annotation.Nullable;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.auto.value.AutoValue.Builder;

@AutoValue.Builder
public abstract class BackendRequest$Builder
{
  public abstract BackendRequest build();
  
  public abstract Builder setEvents(Iterable<EventInternal> paramIterable);
  
  public abstract Builder setExtras(@Nullable byte[] paramArrayOfByte);
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.backends.BackendRequest.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */