package com.google.android.datatransport.runtime;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.datatransport.Priority;
import com.google.auto.value.AutoValue.Builder;

@AutoValue.Builder
public abstract class TransportContext$Builder
{
  public abstract TransportContext build();
  
  public abstract Builder setBackendName(String paramString);
  
  public abstract Builder setExtras(@Nullable byte[] paramArrayOfByte);
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public abstract Builder setPriority(Priority paramPriority);
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.TransportContext.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */