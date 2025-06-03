package com.google.android.gms.internal.measurement;

public enum K5
{
  public final U5 o;
  public final int p;
  
  static
  {
    K5 localK51 = new K5("DOUBLE", 0, U5.s, 1);
    q = localK51;
    K5 localK52 = new K5("FLOAT", 1, U5.r, 5);
    r = localK52;
    Object localObject1 = U5.q;
    K5 localK53 = new K5("INT64", 2, (U5)localObject1, 0);
    s = localK53;
    K5 localK54 = new K5("UINT64", 3, (U5)localObject1, 0);
    t = localK54;
    Object localObject2 = U5.p;
    K5 localK55 = new K5("INT32", 4, (U5)localObject2, 0);
    u = localK55;
    K5 localK56 = new K5("FIXED64", 5, (U5)localObject1, 1);
    v = localK56;
    K5 localK57 = new K5("FIXED32", 6, (U5)localObject2, 5);
    w = localK57;
    K5 localK58 = new K5("BOOL", 7, U5.t, 0);
    x = localK58;
    J5 localJ5 = new J5("STRING", 8, U5.u, 2, null);
    y = localJ5;
    Object localObject3 = U5.x;
    L5 localL5 = new L5("GROUP", 9, (U5)localObject3, 3, null);
    z = localL5;
    N5 localN5 = new N5("MESSAGE", 10, (U5)localObject3, 2, null);
    A = localN5;
    P5 localP5 = new P5("BYTES", 11, U5.v, 2, null);
    B = localP5;
    K5 localK59 = new K5("UINT32", 12, (U5)localObject2, 0);
    C = localK59;
    K5 localK510 = new K5("ENUM", 13, U5.w, 0);
    D = localK510;
    K5 localK511 = new K5("SFIXED32", 14, (U5)localObject2, 5);
    E = localK511;
    localObject3 = new K5("SFIXED64", 15, (U5)localObject1, 1);
    F = (K5)localObject3;
    localObject2 = new K5("SINT32", 16, (U5)localObject2, 0);
    G = (K5)localObject2;
    localObject1 = new K5("SINT64", 17, (U5)localObject1, 0);
    H = (K5)localObject1;
    I = new K5[] { localK51, localK52, localK53, localK54, localK55, localK56, localK57, localK58, localJ5, localL5, localN5, localP5, localK59, localK510, localK511, localObject3, localObject2, localObject1 };
  }
  
  public K5(U5 paramU5, int paramInt1)
  {
    o = paramU5;
    p = paramInt1;
  }
  
  public final U5 c()
  {
    return o;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.K5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */