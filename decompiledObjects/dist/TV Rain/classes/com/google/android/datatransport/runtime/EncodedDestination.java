package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import java.util.Set;

public abstract interface EncodedDestination
  extends Destination
{
  public abstract Set<Encoding> getSupportedEncodings();
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.EncodedDestination
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */