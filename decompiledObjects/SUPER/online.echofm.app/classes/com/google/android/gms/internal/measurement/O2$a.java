package com.google.android.gms.internal.measurement;

import W2.l;
import android.content.Context;
import android.os.Build;

public abstract class O2$a
{
  public static volatile l a;
  
  public static l a(Context paramContext)
  {
    try
    {
      Object localObject1 = a;
      localObject2 = localObject1;
      if (localObject1 != null) {
        break label119;
      }
      new O2();
      localObject1 = Build.TYPE;
      localObject2 = Build.TAGS;
      if (!((String)localObject1).equals("eng")) {
        if (!((String)localObject1).equals("userdebug")) {
          break label73;
        }
      }
    }
    finally
    {
      break label124;
    }
    if ((!((String)localObject2).contains("dev-keys")) && (!((String)localObject2).contains("test-keys"))) {}
    label73:
    for (paramContext = l.a();; paramContext = O2.a((Context)localObject2))
    {
      break;
      localObject2 = paramContext;
      if (z2.a()) {
        if (M2.a(paramContext)) {
          localObject2 = paramContext;
        } else {
          localObject2 = N2.a(paramContext);
        }
      }
    }
    a = paramContext;
    Object localObject2 = paramContext;
    label119:
    return (l)localObject2;
    label124:
    throw paramContext;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.O2.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */