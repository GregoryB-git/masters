package com.google.android.gms.internal.measurement;

public final class Z3
  implements J4
{
  public static final Z3 a = new Z3();
  
  public static Z3 c()
  {
    return a;
  }
  
  public final G4 a(Class paramClass)
  {
    if (Y3.class.isAssignableFrom(paramClass)) {
      try
      {
        G4 localG4 = (G4)Y3.l(paramClass.asSubclass(Y3.class)).p(Y3.c.c, null, null);
        return localG4;
      }
      catch (Exception localException)
      {
        paramClass = paramClass.getName();
        StringBuilder localStringBuilder = new StringBuilder("Unable to get message info for ");
        localStringBuilder.append(paramClass);
        throw new RuntimeException(localStringBuilder.toString(), localException);
      }
    }
    String str = paramClass.getName();
    paramClass = new StringBuilder("Unsupported message type: ");
    paramClass.append(str);
    throw new IllegalArgumentException(paramClass.toString());
  }
  
  public final boolean b(Class paramClass)
  {
    return Y3.class.isAssignableFrom(paramClass);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.Z3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */