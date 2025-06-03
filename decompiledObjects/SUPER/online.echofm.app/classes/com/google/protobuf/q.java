package com.google.protobuf;

public class q
  implements J
{
  public static final q a = new q();
  
  public static q c()
  {
    return a;
  }
  
  public I a(Class paramClass)
  {
    if (r.class.isAssignableFrom(paramClass)) {
      try
      {
        I localI = (I)r.A(paramClass.asSubclass(r.class)).m();
        return localI;
      }
      catch (Exception localException)
      {
        StringBuilder localStringBuilder2 = new StringBuilder();
        localStringBuilder2.append("Unable to get message info for ");
        localStringBuilder2.append(paramClass.getName());
        throw new RuntimeException(localStringBuilder2.toString(), localException);
      }
    }
    StringBuilder localStringBuilder1 = new StringBuilder();
    localStringBuilder1.append("Unsupported message type: ");
    localStringBuilder1.append(paramClass.getName());
    throw new IllegalArgumentException(localStringBuilder1.toString());
  }
  
  public boolean b(Class paramClass)
  {
    return r.class.isAssignableFrom(paramClass);
  }
}

/* Location:
 * Qualified Name:     com.google.protobuf.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */