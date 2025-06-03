package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import com.google.android.datatransport.runtime.backends.BackendFactory;
import com.google.android.datatransport.runtime.backends.CreationContext;
import com.google.android.datatransport.runtime.backends.TransportBackend;

@Keep
public class CctBackendFactory
  implements BackendFactory
{
  public TransportBackend create(CreationContext paramCreationContext)
  {
    return new CctTransportBackend(paramCreationContext.getApplicationContext(), paramCreationContext.getWallClock(), paramCreationContext.getMonotonicClock());
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.cct.CctBackendFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */