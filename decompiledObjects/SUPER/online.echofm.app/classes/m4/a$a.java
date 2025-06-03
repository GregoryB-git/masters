package m4;

public final class a$a
  implements d
{
  public final int a;
  public final d.a b;
  
  public a$a(int paramInt, d.a parama)
  {
    a = paramInt;
    b = parama;
  }
  
  public Class annotationType()
  {
    return d.class;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof d)) {
      return false;
    }
    paramObject = (d)paramObject;
    if ((a != ((d)paramObject).tag()) || (!b.equals(((d)paramObject).intEncoding()))) {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    return (0xDE0D66 ^ a) + (b.hashCode() ^ 0x79AD669E);
  }
  
  public d.a intEncoding()
  {
    return b;
  }
  
  public int tag()
  {
    return a;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("@com.google.firebase.encoders.proto.Protobuf");
    localStringBuilder.append('(');
    localStringBuilder.append("tag=");
    localStringBuilder.append(a);
    localStringBuilder.append("intEncoding=");
    localStringBuilder.append(b);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     m4.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */