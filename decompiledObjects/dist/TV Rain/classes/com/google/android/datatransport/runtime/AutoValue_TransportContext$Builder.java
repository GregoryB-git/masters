package com.google.android.datatransport.runtime;

import androidx.annotation.Nullable;
import com.google.android.datatransport.Priority;
import z2;

final class AutoValue_TransportContext$Builder
  extends TransportContext.Builder
{
  private String backendName;
  private byte[] extras;
  private Priority priority;
  
  public TransportContext build()
  {
    String str1;
    if (backendName == null) {
      str1 = " backendName";
    } else {
      str1 = "";
    }
    String str2 = str1;
    if (priority == null) {
      str2 = z2.o(str1, " priority");
    }
    if (str2.isEmpty()) {
      return new AutoValue_TransportContext(backendName, extras, priority, null);
    }
    throw new IllegalStateException(z2.o("Missing required properties:", str2));
  }
  
  public TransportContext.Builder setBackendName(String paramString)
  {
    if (paramString != null)
    {
      backendName = paramString;
      return this;
    }
    throw new NullPointerException("Null backendName");
  }
  
  public TransportContext.Builder setExtras(@Nullable byte[] paramArrayOfByte)
  {
    extras = paramArrayOfByte;
    return this;
  }
  
  public TransportContext.Builder setPriority(Priority paramPriority)
  {
    if (paramPriority != null)
    {
      priority = paramPriority;
      return this;
    }
    throw new NullPointerException("Null priority");
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.AutoValue_TransportContext.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */