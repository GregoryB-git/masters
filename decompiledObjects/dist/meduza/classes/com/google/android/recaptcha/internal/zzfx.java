package com.google.android.recaptcha.internal;

import ec.i;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import rb.h;

public abstract class zzfx
  implements InvocationHandler
{
  private final Object zza;
  
  public zzfx(Object paramObject)
  {
    zza = paramObject;
  }
  
  public final Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    if ((i.a(paramMethod.getName(), "toString")) && (paramMethod.getParameterTypes().length == 0))
    {
      paramObject = "Proxy@".concat(String.valueOf(Integer.toHexString(paramObject.hashCode())));
    }
    else if ((i.a(paramMethod.getName(), "hashCode")) && (paramMethod.getParameterTypes().length == 0))
    {
      paramObject = Integer.valueOf(System.identityHashCode(paramObject));
    }
    else if ((i.a(paramMethod.getName(), "equals")) && (paramMethod.getParameterTypes().length != 0))
    {
      boolean bool1 = false;
      boolean bool2 = bool1;
      if (paramArrayOfObject != null) {
        if (paramArrayOfObject.length == 0)
        {
          bool2 = bool1;
        }
        else
        {
          paramMethod = paramArrayOfObject[0];
          int i;
          if (paramMethod != null) {
            i = paramMethod.hashCode();
          } else {
            i = 0;
          }
          bool2 = bool1;
          if (i == paramObject.hashCode()) {
            bool2 = true;
          }
        }
      }
      paramObject = Boolean.valueOf(bool2);
    }
    else if (!zza(paramObject, paramMethod, paramArrayOfObject))
    {
      paramObject = h.a;
    }
    else
    {
      if ((zza != null) || (!i.a(paramMethod.getReturnType(), Void.TYPE)))
      {
        paramObject = zza;
        if ((paramObject == null) || (!i.a(zzkm.zza(paramObject.getClass()), zzkm.zza(paramMethod.getReturnType())))) {
          break label247;
        }
      }
      paramMethod = zza;
      paramObject = paramMethod;
      if (paramMethod == null) {
        paramObject = h.a;
      }
    }
    return paramObject;
    label247:
    paramObject = zza;
    paramArrayOfObject = paramMethod.getReturnType();
    paramMethod = new StringBuilder();
    paramMethod.append(paramObject);
    paramMethod.append(" cannot be returned from method with return type ");
    paramMethod.append(paramArrayOfObject);
    throw new IllegalArgumentException(paramMethod.toString());
  }
  
  public abstract boolean zza(Object paramObject, Method paramMethod, Object[] paramArrayOfObject);
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzfx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */