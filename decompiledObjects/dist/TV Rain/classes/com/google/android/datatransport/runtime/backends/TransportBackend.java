package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.EventInternal;

public abstract interface TransportBackend
{
  public abstract EventInternal decorate(EventInternal paramEventInternal);
  
  public abstract BackendResponse send(BackendRequest paramBackendRequest);
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.backends.TransportBackend
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */