package R4;

import kotlin.jvm.internal.Intrinsics;

public final class f
{
  public final d a;
  public final d b;
  public final double c;
  
  public f(d paramd1, d paramd2, double paramDouble)
  {
    a = paramd1;
    b = paramd2;
    c = paramDouble;
  }
  
  public final d a()
  {
    return b;
  }
  
  public final d b()
  {
    return a;
  }
  
  public final double c()
  {
    return c;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof f)) {
      return false;
    }
    paramObject = (f)paramObject;
    if (a != a) {
      return false;
    }
    if (b != b) {
      return false;
    }
    return Intrinsics.a(Double.valueOf(c), Double.valueOf(c));
  }
  
  public int hashCode()
  {
    return (a.hashCode() * 31 + b.hashCode()) * 31 + e.a(c);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("DataCollectionStatus(performance=");
    localStringBuilder.append(a);
    localStringBuilder.append(", crashlytics=");
    localStringBuilder.append(b);
    localStringBuilder.append(", sessionSamplingRate=");
    localStringBuilder.append(c);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     R4.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */