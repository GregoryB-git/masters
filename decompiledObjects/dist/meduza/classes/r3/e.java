package r3;

import g;

public abstract class e
{
  public static final a a;
  
  static
  {
    Long localLong1 = Long.valueOf(10485760L);
    Integer localInteger1 = Integer.valueOf(200);
    Integer localInteger2 = Integer.valueOf(10000);
    Long localLong2 = Long.valueOf(604800000L);
    Integer localInteger3 = Integer.valueOf(81920);
    if (localLong1 == null) {
      localObject1 = " maxStorageSizeInBytes";
    } else {
      localObject1 = "";
    }
    Object localObject2 = localObject1;
    if (localInteger1 == null) {
      localObject2 = g.d((String)localObject1, " loadBatchSize");
    }
    Object localObject1 = localObject2;
    if (localInteger2 == null) {
      localObject1 = g.d((String)localObject2, " criticalSectionEnterTimeoutMs");
    }
    localObject2 = localObject1;
    if (localLong2 == null) {
      localObject2 = g.d((String)localObject1, " eventCleanUpAge");
    }
    localObject1 = localObject2;
    if (localInteger3 == null) {
      localObject1 = g.d((String)localObject2, " maxBlobByteSizePerRow");
    }
    if (((String)localObject1).isEmpty())
    {
      a = new a(localLong1.longValue(), localInteger1.intValue(), localInteger2.intValue(), localLong2.longValue(), localInteger3.intValue());
      return;
    }
    throw new IllegalStateException(g.d("Missing required properties:", (String)localObject1));
  }
  
  public abstract int a();
  
  public abstract long b();
  
  public abstract int c();
  
  public abstract int d();
  
  public abstract long e();
}

/* Location:
 * Qualified Name:     r3.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */