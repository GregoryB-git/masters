package com.google.android.datatransport.runtime;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.datatransport.Priority;
import java.util.Arrays;
import z2;

final class AutoValue_TransportContext
  extends TransportContext
{
  private final String backendName;
  private final byte[] extras;
  private final Priority priority;
  
  private AutoValue_TransportContext(String paramString, @Nullable byte[] paramArrayOfByte, Priority paramPriority)
  {
    backendName = paramString;
    extras = paramArrayOfByte;
    priority = paramPriority;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof TransportContext))
    {
      TransportContext localTransportContext = (TransportContext)paramObject;
      if (backendName.equals(localTransportContext.getBackendName()))
      {
        byte[] arrayOfByte = extras;
        if ((localTransportContext instanceof AutoValue_TransportContext)) {
          paramObject = extras;
        } else {
          paramObject = localTransportContext.getExtras();
        }
        if ((Arrays.equals(arrayOfByte, (byte[])paramObject)) && (priority.equals(localTransportContext.getPriority()))) {}
      }
      else
      {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public String getBackendName()
  {
    return backendName;
  }
  
  @Nullable
  public byte[] getExtras()
  {
    return extras;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public Priority getPriority()
  {
    return priority;
  }
  
  public int hashCode()
  {
    return ((backendName.hashCode() ^ 0xF4243) * 1000003 ^ Arrays.hashCode(extras)) * 1000003 ^ priority.hashCode();
  }
  
  public static final class Builder
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
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.AutoValue_TransportContext
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */