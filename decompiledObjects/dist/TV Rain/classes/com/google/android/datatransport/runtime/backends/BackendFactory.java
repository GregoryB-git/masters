package com.google.android.datatransport.runtime.backends;

public abstract interface BackendFactory
{
  public abstract TransportBackend create(CreationContext paramCreationContext);
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.backends.BackendFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */