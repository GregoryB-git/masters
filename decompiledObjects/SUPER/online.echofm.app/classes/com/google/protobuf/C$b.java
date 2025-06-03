package com.google.protobuf;

public class C$b
  implements J
{
  public J[] a;
  
  public C$b(J... paramVarArgs)
  {
    a = paramVarArgs;
  }
  
  public I a(Class paramClass)
  {
    for (localObject : a) {
      if (((J)localObject).b(paramClass)) {
        return ((J)localObject).a(paramClass);
      }
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("No factory is available for message type: ");
    ((StringBuilder)localObject).append(paramClass.getName());
    throw new UnsupportedOperationException(((StringBuilder)localObject).toString());
  }
  
  public boolean b(Class paramClass)
  {
    J[] arrayOfJ = a;
    int i = arrayOfJ.length;
    for (int j = 0; j < i; j++) {
      if (arrayOfJ[j].b(paramClass)) {
        return true;
      }
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.protobuf.C.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */