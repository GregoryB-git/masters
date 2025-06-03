package com.yandex.metrica;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public enum CounterConfiguration$b
{
  @NonNull
  private final String a;
  
  static
  {
    b localb1 = new b("MAIN", 0, "main");
    b = localb1;
    b localb2 = new b("MANUAL", 1, "manual");
    c = localb2;
    b localb3 = new b("APPMETRICA", 2, "appmetrica");
    d = localb3;
    b localb4 = new b("COMMUTATION", 3, "commutation");
    e = localb4;
    b localb5 = new b("SELF_DIAGNOSTIC_MAIN", 4, "self_diagnostic_main");
    f = localb5;
    b localb6 = new b("SELF_DIAGNOSTIC_MANUAL", 5, "self_diagnostic_manual");
    g = localb6;
    b localb7 = new b("CRASH", 6, "crash");
    h = localb7;
    i = new b[] { localb1, localb2, localb3, localb4, localb5, localb6, localb7 };
  }
  
  private CounterConfiguration$b(@NonNull String paramString)
  {
    a = paramString;
  }
  
  @NonNull
  public static b a(@Nullable String paramString)
  {
    b[] arrayOfb = values();
    for (int j = 0; j < 7; j++)
    {
      b localb = arrayOfb[j];
      if (a.equals(paramString)) {
        return localb;
      }
    }
    return b;
  }
  
  @NonNull
  public String a()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     com.yandex.metrica.CounterConfiguration.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */