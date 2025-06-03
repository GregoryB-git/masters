package com.google.crypto.tink.shaded.protobuf;

public class w
  implements N
{
  public static final w a = new w();
  
  public static w c()
  {
    return a;
  }
  
  public M a(Class paramClass)
  {
    if (x.class.isAssignableFrom(paramClass)) {
      try
      {
        localObject = (M)x.v(paramClass.asSubclass(x.class)).k();
        return (M)localObject;
      }
      catch (Exception localException)
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Unable to get message info for ");
        ((StringBuilder)localObject).append(paramClass.getName());
        throw new RuntimeException(((StringBuilder)localObject).toString(), localException);
      }
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Unsupported message type: ");
    ((StringBuilder)localObject).append(paramClass.getName());
    throw new IllegalArgumentException(((StringBuilder)localObject).toString());
  }
  
  public boolean b(Class paramClass)
  {
    return x.class.isAssignableFrom(paramClass);
  }
}

/* Location:
 * Qualified Name:     com.google.crypto.tink.shaded.protobuf.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */