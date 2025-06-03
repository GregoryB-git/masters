package com.google.android.datatransport.runtime.backends;

import androidx.annotation.Nullable;

public abstract interface BackendRegistry
{
  @Nullable
  public abstract TransportBackend get(String paramString);
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.backends.BackendRegistry
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */