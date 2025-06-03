package com.google.android.gms.internal.measurement;

public final class B4
  implements J4
{
  public J4[] a;
  
  public B4(J4... paramVarArgs)
  {
    a = paramVarArgs;
  }
  
  public final G4 a(Class paramClass)
  {
    for (localObject : a) {
      if (((J4)localObject).b(paramClass)) {
        return ((J4)localObject).a(paramClass);
      }
    }
    Object localObject = paramClass.getName();
    paramClass = new StringBuilder("No factory is available for message type: ");
    paramClass.append((String)localObject);
    throw new UnsupportedOperationException(paramClass.toString());
  }
  
  public final boolean b(Class paramClass)
  {
    J4[] arrayOfJ4 = a;
    int i = arrayOfJ4.length;
    for (int j = 0; j < i; j++) {
      if (arrayOfJ4[j].b(paramClass)) {
        return true;
      }
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.B4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */