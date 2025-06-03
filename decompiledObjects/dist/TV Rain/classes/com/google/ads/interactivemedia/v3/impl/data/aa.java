package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.aib;
import com.google.ads.interactivemedia.v3.internal.bw;
import com.google.ads.interactivemedia.v3.internal.fe.a;
import com.google.ads.interactivemedia.v3.internal.pz;
import com.google.ads.interactivemedia.v3.internal.qh;
import java.util.ArrayList;

public class aa
{
  public final bw a;
  public final String b;
  public final qh c;
  public final String d;
  public final ArrayList<fe.a> e;
  public final ArrayList<pz> f;
  public final long g;
  
  private aa() {}
  
  public aa(bw parambw, String paramString1, qh paramqh, String paramString2, ArrayList<fe.a> paramArrayList, ArrayList<pz> paramArrayList1, long paramLong)
  {
    a = parambw;
    b = paramString1;
    c = paramqh;
    d = paramString2;
    e = paramArrayList;
    f = paramArrayList1;
    g = -1L;
  }
  
  public static aib<String, ab> create(int paramInt)
  {
    return aib.a("GvnExternalLayer", ab.create(paramInt, true));
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.impl.data.aa
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */