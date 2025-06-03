package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

public abstract class A
{
  public final List a = new ArrayList();
  
  public final s a(String paramString)
  {
    if (a.contains(C2.c(paramString)))
    {
      StringBuilder localStringBuilder = new StringBuilder("Command not implemented: ");
      localStringBuilder.append(paramString);
      throw new UnsupportedOperationException(localStringBuilder.toString());
    }
    throw new IllegalArgumentException("Command not supported");
  }
  
  public abstract s b(String paramString, f3 paramf3, List paramList);
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.A
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */