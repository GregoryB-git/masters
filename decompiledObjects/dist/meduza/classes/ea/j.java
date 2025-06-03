package ea;

import f;

public final class j
{
  public final i a;
  public final i b;
  public final double c;
  
  public j()
  {
    this(locali, locali, 1.0D);
  }
  
  public j(i parami1, i parami2, double paramDouble)
  {
    a = parami1;
    b = parami2;
    c = paramDouble;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof j)) {
      return false;
    }
    paramObject = (j)paramObject;
    if (a != a) {
      return false;
    }
    if (b != b) {
      return false;
    }
    return Double.compare(c, c) == 0;
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    int j = b.hashCode();
    long l = Double.doubleToLongBits(c);
    return (j + i * 31) * 31 + (int)(l ^ l >>> 32);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("DataCollectionStatus(performance=");
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
 * Qualified Name:     ea.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */