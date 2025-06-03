package com.google.ads.interactivemedia.v3.internal;

class so
{
  private final tm a;
  private final float b;
  private final long c;
  private long[][] d;
  
  public so(tm paramtm, float paramFloat, long paramLong)
  {
    a = paramtm;
    b = paramFloat;
    c = paramLong;
  }
  
  public long a()
  {
    long l1 = Math.max(0L, ((float)a.a() * b) - c);
    if (d == null) {
      return l1;
    }
    for (int i = 1;; i++)
    {
      localObject1 = d;
      if ((i >= localObject1.length - 1) || (localObject1[i][0] >= l1)) {
        break;
      }
    }
    Object localObject2 = localObject1[(i - 1)];
    Object localObject1 = localObject1[i];
    long l2 = localObject2[0];
    float f = (float)(l1 - l2) / (float)(localObject1[0] - l2);
    l1 = localObject2[1];
    return l1 + (f * (float)(localObject1[1] - l1));
  }
  
  public void a(long[][] paramArrayOfLong)
  {
    boolean bool;
    if (paramArrayOfLong.length >= 2) {
      bool = true;
    } else {
      bool = false;
    }
    rp.b(bool);
    d = paramArrayOfLong;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.so
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */