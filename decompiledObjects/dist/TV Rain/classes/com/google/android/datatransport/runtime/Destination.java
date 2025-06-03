package com.google.android.datatransport.runtime;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract interface Destination
{
  @Nullable
  public abstract byte[] getExtras();
  
  @NonNull
  public abstract String getName();
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.Destination
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */