package com.google.android.datatransport.runtime;

import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.datatransport.Priority;
import com.google.auto.value.AutoValue;
import com.google.auto.value.AutoValue.Builder;

@AutoValue
public abstract class TransportContext
{
  public static Builder builder()
  {
    return new AutoValue_TransportContext.Builder().setPriority(Priority.DEFAULT);
  }
  
  public abstract String getBackendName();
  
  @Nullable
  public abstract byte[] getExtras();
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public abstract Priority getPriority();
  
  public boolean shouldUploadClientHealthMetrics()
  {
    boolean bool;
    if (getExtras() != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final String toString()
  {
    String str1 = getBackendName();
    Priority localPriority = getPriority();
    String str2;
    if (getExtras() == null) {
      str2 = "";
    } else {
      str2 = Base64.encodeToString(getExtras(), 2);
    }
    return String.format("TransportContext(%s, %s, %s)", new Object[] { str1, localPriority, str2 });
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public TransportContext withPriority(Priority paramPriority)
  {
    return builder().setBackendName(getBackendName()).setPriority(paramPriority).setExtras(getExtras()).build();
  }
  
  @AutoValue.Builder
  public static abstract class Builder
  {
    public abstract TransportContext build();
    
    public abstract Builder setBackendName(String paramString);
    
    public abstract Builder setExtras(@Nullable byte[] paramArrayOfByte);
    
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public abstract Builder setPriority(Priority paramPriority);
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.TransportContext
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */