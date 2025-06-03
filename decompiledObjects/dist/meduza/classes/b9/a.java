package b9;

import java.lang.annotation.Annotation;

public final class a
  implements d
{
  public final int a;
  
  public a(int paramInt)
  {
    a = paramInt;
  }
  
  public final Class<? extends Annotation> annotationType()
  {
    return d.class;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof d)) {
      return false;
    }
    paramObject = (d)paramObject;
    int i = a;
    paramObject = (a)paramObject;
    if (i == a)
    {
      d.a locala = d.a.a;
      paramObject.getClass();
      if (locala.equals(locala)) {}
    }
    else
    {
      bool = false;
    }
    return bool;
  }
  
  public final int hashCode()
  {
    return (a ^ 0xDE0D66) + (d.a.a.hashCode() ^ 0x79AD669E);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("@com.google.firebase.encoders.proto.Protobuf");
    localStringBuilder.append('(');
    localStringBuilder.append("tag=");
    localStringBuilder.append(a);
    localStringBuilder.append("intEncoding=");
    localStringBuilder.append(d.a.a);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     b9.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */