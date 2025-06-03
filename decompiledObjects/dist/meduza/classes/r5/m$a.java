package r5;

import android.os.BaseBundle;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import o7.l0;
import o7.t;
import o7.t.a;
import v5.b;
import v5.e0;
import z4.i0;

public class m$a
{
  public int a;
  public int b;
  public int c;
  public int d;
  public int e;
  public int f;
  public int g;
  public int h;
  public int i;
  public int j;
  public boolean k;
  public t<String> l;
  public int m;
  public t<String> n;
  public int o;
  public int p;
  public int q;
  public t<String> r;
  public t<String> s;
  public int t;
  public int u;
  public boolean v;
  public boolean w;
  public boolean x;
  public HashMap<i0, l> y;
  public HashSet<Integer> z;
  
  @Deprecated
  public m$a()
  {
    a = Integer.MAX_VALUE;
    b = Integer.MAX_VALUE;
    c = Integer.MAX_VALUE;
    d = Integer.MAX_VALUE;
    i = Integer.MAX_VALUE;
    j = Integer.MAX_VALUE;
    k = true;
    Object localObject = t.b;
    localObject = l0.e;
    l = ((t)localObject);
    m = 0;
    n = ((t)localObject);
    o = 0;
    p = Integer.MAX_VALUE;
    q = Integer.MAX_VALUE;
    r = ((t)localObject);
    s = ((t)localObject);
    t = 0;
    u = 0;
    v = false;
    w = false;
    x = false;
    y = new HashMap();
    z = new HashSet();
  }
  
  public m$a(Bundle paramBundle)
  {
    Object localObject1 = m.O;
    Object localObject2 = m.I;
    a = paramBundle.getInt((String)localObject1, a);
    b = paramBundle.getInt(m.P, b);
    c = paramBundle.getInt(m.Q, c);
    d = paramBundle.getInt(m.R, d);
    e = paramBundle.getInt(m.S, e);
    f = paramBundle.getInt(m.T, f);
    g = paramBundle.getInt(m.U, o);
    h = paramBundle.getInt(m.V, p);
    i = paramBundle.getInt(m.W, q);
    j = paramBundle.getInt(m.X, r);
    k = paramBundle.getBoolean(m.Y, s);
    localObject1 = paramBundle.getStringArray(m.Z);
    int i1 = 0;
    if (localObject1 == null) {
      localObject1 = new String[0];
    }
    l = t.q((Object[])localObject1);
    m = paramBundle.getInt(m.h0, u);
    localObject1 = paramBundle.getStringArray(m.J);
    if (localObject1 == null) {
      localObject1 = new String[0];
    }
    n = a((String[])localObject1);
    o = paramBundle.getInt(m.K, w);
    p = paramBundle.getInt(m.a0, x);
    q = paramBundle.getInt(m.b0, y);
    localObject1 = paramBundle.getStringArray(m.c0);
    if (localObject1 == null) {
      localObject1 = new String[0];
    }
    r = t.q((Object[])localObject1);
    localObject1 = paramBundle.getStringArray(m.L);
    if (localObject1 == null) {
      localObject1 = new String[0];
    }
    s = a((String[])localObject1);
    t = paramBundle.getInt(m.M, B);
    u = paramBundle.getInt(m.i0, C);
    v = paramBundle.getBoolean(m.N, D);
    w = paramBundle.getBoolean(m.d0, E);
    x = paramBundle.getBoolean(m.e0, F);
    localObject1 = paramBundle.getParcelableArrayList(m.f0);
    if (localObject1 == null) {
      localObject1 = l0.e;
    } else {
      localObject1 = b.a(l.e, (ArrayList)localObject1);
    }
    y = new HashMap();
    for (int i2 = 0; i2 < d; i2++)
    {
      localObject2 = (l)((l0)localObject1).get(i2);
      y.put(a, localObject2);
    }
    paramBundle = paramBundle.getIntArray(m.g0);
    if (paramBundle == null) {
      paramBundle = new int[0];
    }
    z = new HashSet();
    int i3 = paramBundle.length;
    for (i2 = i1; i2 < i3; i2++)
    {
      i1 = paramBundle[i2];
      z.add(Integer.valueOf(i1));
    }
  }
  
  public static l0 a(String[] paramArrayOfString)
  {
    Object localObject = t.b;
    t.a locala = new t.a();
    int i1 = paramArrayOfString.length;
    for (int i2 = 0; i2 < i1; i2++)
    {
      localObject = paramArrayOfString[i2];
      localObject.getClass();
      locala.c(e0.J((String)localObject));
    }
    return locala.e();
  }
  
  public a b(int paramInt1, int paramInt2)
  {
    i = paramInt1;
    j = paramInt2;
    k = true;
    return this;
  }
}

/* Location:
 * Qualified Name:     r5.m.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */