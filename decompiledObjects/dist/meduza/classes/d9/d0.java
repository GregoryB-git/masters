package d9;

import com.google.firebase.firestore.f;
import q0.g;

public final class d0
{
  public static final d0 g = new d0(0, 0, 0L, 0L, null, 3);
  public final int a;
  public final int b;
  public final long c;
  public final long d;
  public final int e;
  public final Exception f;
  
  public d0(int paramInt1, int paramInt2, long paramLong1, long paramLong2, f paramf, int paramInt3)
  {
    a = paramInt1;
    b = paramInt2;
    c = paramLong1;
    d = paramLong2;
    e = paramInt3;
    f = paramf;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (d0.class == paramObject.getClass()))
    {
      Object localObject = (d0)paramObject;
      if (a != a) {
        return false;
      }
      if (b != b) {
        return false;
      }
      if (c != c) {
        return false;
      }
      if (d != d) {
        return false;
      }
      if (e != e) {
        return false;
      }
      paramObject = f;
      localObject = f;
      if (paramObject != null) {
        bool = paramObject.equals(localObject);
      } else if (localObject != null) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = a;
    int j = b;
    long l = c;
    int k = (int)(l ^ l >>> 32);
    l = d;
    int m = (int)(l ^ l >>> 32);
    int n = g.c(e);
    Exception localException = f;
    int i1;
    if (localException != null) {
      i1 = localException.hashCode();
    } else {
      i1 = 0;
    }
    return (n + (((i * 31 + j) * 31 + k) * 31 + m) * 31) * 31 + i1;
  }
}

/* Location:
 * Qualified Name:     d9.d0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */