package V3;

public final class y
{
  public final long a;
  
  public y(long paramLong)
  {
    a = paramLong;
  }
  
  public long a()
  {
    return a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (y.class == paramObject.getClass()))
    {
      paramObject = (y)paramObject;
      return a == a;
    }
    return false;
  }
  
  public int hashCode()
  {
    long l = a;
    return (int)(l ^ l >>> 32);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Tag{tagNumber=");
    localStringBuilder.append(a);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     V3.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */