package com.google.android.datatransport;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import z2;

public final class Encoding
{
  private final String name;
  
  private Encoding(@NonNull String paramString)
  {
    if (paramString != null)
    {
      name = paramString;
      return;
    }
    throw new NullPointerException("name is null");
  }
  
  public static Encoding of(@NonNull String paramString)
  {
    return new Encoding(paramString);
  }
  
  public boolean equals(@Nullable Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof Encoding)) {
      return false;
    }
    return name.equals(name);
  }
  
  public String getName()
  {
    return name;
  }
  
  public int hashCode()
  {
    return name.hashCode() ^ 0xF4243;
  }
  
  @NonNull
  public String toString()
  {
    return z2.s(z2.t("Encoding{name=\""), name, "\"}");
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.Encoding
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */