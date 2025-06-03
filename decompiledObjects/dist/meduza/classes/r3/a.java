package r3;

import a0.j;
import f;

public final class a
  extends e
{
  public final long b;
  public final int c;
  public final int d;
  public final long e;
  public final int f;
  
  public a(long paramLong1, int paramInt1, int paramInt2, long paramLong2, int paramInt3)
  {
    b = paramLong1;
    c = paramInt1;
    d = paramInt2;
    e = paramLong2;
    f = paramInt3;
  }
  
  public final int a()
  {
    return d;
  }
  
  public final long b()
  {
    return e;
  }
  
  public final int c()
  {
    return c;
  }
  
  public final int d()
  {
    return f;
  }
  
  public final long e()
  {
    return b;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof e))
    {
      paramObject = (e)paramObject;
      if ((b != ((e)paramObject).e()) || (c != ((e)paramObject).c()) || (d != ((e)paramObject).a()) || (e != ((e)paramObject).b()) || (f != ((e)paramObject).d())) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    long l = b;
    int i = (int)(l ^ l >>> 32);
    int j = c;
    int k = d;
    l = e;
    return ((((i ^ 0xF4243) * 1000003 ^ j) * 1000003 ^ k) * 1000003 ^ (int)(l >>> 32 ^ l)) * 1000003 ^ f;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("EventStoreConfig{maxStorageSizeInBytes=");
    localStringBuilder.append(b);
    localStringBuilder.append(", loadBatchSize=");
    localStringBuilder.append(c);
    localStringBuilder.append(", criticalSectionEnterTimeoutMs=");
    localStringBuilder.append(d);
    localStringBuilder.append(", eventCleanUpAge=");
    localStringBuilder.append(e);
    localStringBuilder.append(", maxBlobByteSizePerRow=");
    return j.m(localStringBuilder, f, "}");
  }
}

/* Location:
 * Qualified Name:     r3.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */