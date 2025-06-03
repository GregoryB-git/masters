package d9;

import f;

public final class u0
{
  public final boolean a;
  public final boolean b;
  
  public u0(boolean paramBoolean1, boolean paramBoolean2)
  {
    a = paramBoolean1;
    b = paramBoolean2;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof u0)) {
      return false;
    }
    paramObject = (u0)paramObject;
    if ((a != a) || (b != b)) {
      bool = false;
    }
    return bool;
  }
  
  public final int hashCode()
  {
    return a * true + b;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("SnapshotMetadata{hasPendingWrites=");
    localStringBuilder.append(a);
    localStringBuilder.append(", isFromCache=");
    localStringBuilder.append(b);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     d9.u0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */