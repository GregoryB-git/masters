package k3;

import f;
import g;
import java.util.Arrays;
import java.util.Map;

public final class h
  extends n
{
  public final String a;
  public final Integer b;
  public final m c;
  public final long d;
  public final long e;
  public final Map<String, String> f;
  public final Integer g;
  public final String h;
  public final byte[] i;
  public final byte[] j;
  
  public h() {}
  
  public h(String paramString1, Integer paramInteger1, m paramm, long paramLong1, long paramLong2, Map paramMap, Integer paramInteger2, String paramString2, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    a = paramString1;
    b = paramInteger1;
    c = paramm;
    d = paramLong1;
    e = paramLong2;
    f = paramMap;
    g = paramInteger2;
    h = paramString2;
    i = paramArrayOfByte1;
    j = paramArrayOfByte2;
  }
  
  public final Map<String, String> b()
  {
    return f;
  }
  
  public final Integer c()
  {
    return b;
  }
  
  public final m d()
  {
    return c;
  }
  
  public final long e()
  {
    return d;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof n))
    {
      n localn = (n)paramObject;
      if (a.equals(localn.k()))
      {
        paramObject = b;
        if ((paramObject == null ? localn.c() == null : ((Integer)paramObject).equals(localn.c())) && (c.equals(localn.d())) && (d == localn.e()) && (e == localn.l()) && (f.equals(localn.b())))
        {
          paramObject = g;
          if (paramObject == null ? localn.i() == null : ((Integer)paramObject).equals(localn.i()))
          {
            paramObject = h;
            if (paramObject == null ? localn.j() == null : ((String)paramObject).equals(localn.j()))
            {
              byte[] arrayOfByte = i;
              boolean bool2 = localn instanceof h;
              if (bool2) {
                paramObject = i;
              } else {
                paramObject = localn.f();
              }
              if (Arrays.equals(arrayOfByte, (byte[])paramObject))
              {
                arrayOfByte = j;
                if (bool2) {
                  paramObject = j;
                } else {
                  paramObject = localn.g();
                }
                if (Arrays.equals(arrayOfByte, (byte[])paramObject)) {
                  break label262;
                }
              }
            }
          }
        }
      }
      bool1 = false;
      label262:
      return bool1;
    }
    return false;
  }
  
  public final byte[] f()
  {
    return i;
  }
  
  public final byte[] g()
  {
    return j;
  }
  
  public final int hashCode()
  {
    int k = a.hashCode();
    Object localObject = b;
    int m = 0;
    int n;
    if (localObject == null) {
      n = 0;
    } else {
      n = ((Integer)localObject).hashCode();
    }
    int i1 = c.hashCode();
    long l = d;
    int i2 = (int)(l ^ l >>> 32);
    l = e;
    int i3 = (int)(l ^ l >>> 32);
    int i4 = f.hashCode();
    localObject = g;
    int i5;
    if (localObject == null) {
      i5 = 0;
    } else {
      i5 = ((Integer)localObject).hashCode();
    }
    localObject = h;
    if (localObject != null) {
      m = ((String)localObject).hashCode();
    }
    return (((((((((k ^ 0xF4243) * 1000003 ^ n) * 1000003 ^ i1) * 1000003 ^ i2) * 1000003 ^ i3) * 1000003 ^ i4) * 1000003 ^ i5) * 1000003 ^ m) * 1000003 ^ Arrays.hashCode(i)) * 1000003 ^ Arrays.hashCode(j);
  }
  
  public final Integer i()
  {
    return g;
  }
  
  public final String j()
  {
    return h;
  }
  
  public final String k()
  {
    return a;
  }
  
  public final long l()
  {
    return e;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("EventInternal{transportName=");
    localStringBuilder.append(a);
    localStringBuilder.append(", code=");
    localStringBuilder.append(b);
    localStringBuilder.append(", encodedPayload=");
    localStringBuilder.append(c);
    localStringBuilder.append(", eventMillis=");
    localStringBuilder.append(d);
    localStringBuilder.append(", uptimeMillis=");
    localStringBuilder.append(e);
    localStringBuilder.append(", autoMetadata=");
    localStringBuilder.append(f);
    localStringBuilder.append(", productId=");
    localStringBuilder.append(g);
    localStringBuilder.append(", pseudonymousId=");
    localStringBuilder.append(h);
    localStringBuilder.append(", experimentIdsClear=");
    localStringBuilder.append(Arrays.toString(i));
    localStringBuilder.append(", experimentIdsEncrypted=");
    localStringBuilder.append(Arrays.toString(j));
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static final class a
    extends n.a
  {
    public String a;
    public Integer b;
    public m c;
    public Long d;
    public Long e;
    public Map<String, String> f;
    public Integer g;
    public String h;
    public byte[] i;
    public byte[] j;
    
    public final h b()
    {
      if (a == null) {
        localObject1 = " transportName";
      } else {
        localObject1 = "";
      }
      Object localObject2 = localObject1;
      if (c == null) {
        localObject2 = g.d((String)localObject1, " encodedPayload");
      }
      Object localObject1 = localObject2;
      if (d == null) {
        localObject1 = g.d((String)localObject2, " eventMillis");
      }
      localObject2 = localObject1;
      if (e == null) {
        localObject2 = g.d((String)localObject1, " uptimeMillis");
      }
      localObject1 = localObject2;
      if (f == null) {
        localObject1 = g.d((String)localObject2, " autoMetadata");
      }
      if (((String)localObject1).isEmpty()) {
        return new h(a, b, c, d.longValue(), e.longValue(), f, g, h, i, j);
      }
      throw new IllegalStateException(g.d("Missing required properties:", (String)localObject1));
    }
    
    public final a c(m paramm)
    {
      if (paramm != null)
      {
        c = paramm;
        return this;
      }
      throw new NullPointerException("Null encodedPayload");
    }
    
    public final a d(String paramString)
    {
      if (paramString != null)
      {
        a = paramString;
        return this;
      }
      throw new NullPointerException("Null transportName");
    }
  }
}

/* Location:
 * Qualified Name:     k3.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */