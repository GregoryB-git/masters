package com.google.android.gms.internal.measurement;

import java.util.List;

public final class U
  extends A
{
  public final s b(String paramString, f3 paramf3, List paramList)
  {
    if ((paramString != null) && (!paramString.isEmpty()) && (paramf3.g(paramString)))
    {
      s locals = paramf3.c(paramString);
      if ((locals instanceof n)) {
        return ((n)locals).b(paramf3, paramList);
      }
      throw new IllegalArgumentException(String.format("Function %s is not defined", new Object[] { paramString }));
    }
    throw new IllegalArgumentException(String.format("Command not found: %s", new Object[] { paramString }));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.U
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */