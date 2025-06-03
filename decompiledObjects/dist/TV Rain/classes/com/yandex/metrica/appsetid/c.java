package com.yandex.metrica.appsetid;

import org.jetbrains.annotations.NotNull;

public enum c
{
  @NotNull
  private final String a;
  
  static
  {
    c localc1 = new c("UNKNOWN", 0, "");
    b = localc1;
    c localc2 = new c("APP", 1, "app");
    c = localc2;
    c localc3 = new c("DEVELOPER", 2, "developer");
    d = localc3;
    e = new c[] { localc1, localc2, localc3 };
  }
  
  private c(String paramString)
  {
    a = paramString;
  }
  
  @NotNull
  public final String a()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     com.yandex.metrica.appsetid.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */