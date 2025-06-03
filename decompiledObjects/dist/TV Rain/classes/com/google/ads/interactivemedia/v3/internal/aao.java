package com.google.ads.interactivemedia.v3.internal;

public final class aao
  implements yp
{
  private final za a;
  
  public aao(za paramza)
  {
    a = paramza;
  }
  
  public static yn<?> a(za paramza, xu paramxu, acx<?> paramacx, ys paramys)
  {
    Object localObject = paramza.a(acx.a(paramys.a())).a();
    if ((localObject instanceof yn))
    {
      paramza = (yn)localObject;
    }
    else if ((localObject instanceof yp))
    {
      paramza = ((yp)localObject).a(paramxu, paramacx);
    }
    else
    {
      boolean bool = localObject instanceof ym;
      if ((!bool) && (!(localObject instanceof ye)))
      {
        paramza = new StringBuilder("Invalid attempt to bind an instance of ");
        paramza.append(localObject.getClass().getName());
        paramza.append(" as a @JsonAdapter for ");
        paramza.append(paramacx.toString());
        paramza.append(". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
        throw new IllegalArgumentException(paramza.toString());
      }
      ye localye = null;
      if (bool) {
        paramza = (ym)localObject;
      } else {
        paramza = null;
      }
      if ((localObject instanceof ye)) {
        localye = (ye)localObject;
      }
      paramza = new abe(paramza, localye, paramxu, paramacx, null);
    }
    paramxu = paramza;
    if (paramza != null)
    {
      paramxu = paramza;
      if (paramys.b()) {
        paramxu = paramza.nullSafe();
      }
    }
    return paramxu;
  }
  
  public final <T> yn<T> a(xu paramxu, acx<T> paramacx)
  {
    ys localys = (ys)paramacx.a().getAnnotation(ys.class);
    if (localys == null) {
      return null;
    }
    return a(a, paramxu, paramacx, localys);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.aao
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */