package V3;

import i4.a;

public final class p
{
  public String a;
  public boolean b;
  public String c;
  public String d;
  
  public void a(a parama)
  {
    if (parama == null) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(parama.a());
    localStringBuilder.append(":");
    localStringBuilder.append(parama.b());
    parama = localStringBuilder.toString();
    a = parama;
    d = parama;
    b = false;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (p.class == paramObject.getClass()))
    {
      paramObject = (p)paramObject;
      if (b != b) {
        return false;
      }
      if (!a.equals(a)) {
        return false;
      }
      return c.equals(c);
    }
    return false;
  }
  
  public int hashCode()
  {
    return (a.hashCode() * 31 + b) * 31 + c.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("http");
    String str;
    if (b) {
      str = "s";
    } else {
      str = "";
    }
    localStringBuilder.append(str);
    localStringBuilder.append("://");
    localStringBuilder.append(a);
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     V3.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */