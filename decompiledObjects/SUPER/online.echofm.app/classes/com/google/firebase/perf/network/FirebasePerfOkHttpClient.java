package com.google.firebase.perf.network;

import B6.a;
import B6.b;
import B6.g;
import I4.i;
import L4.k;
import M4.l;
import androidx.annotation.Keep;
import java.io.IOException;

public class FirebasePerfOkHttpClient
{
  public static void a(g paramg, G4.j paramj, long paramLong1, long paramLong2)
  {
    throw null;
  }
  
  @Keep
  public static void enqueue(a parama, b paramb)
  {
    l locall = new l();
    long l = locall.e();
    parama.k(new i(paramb, k.l(), locall, l));
  }
  
  @Keep
  public static g execute(a parama)
  {
    G4.j localj = G4.j.h(k.l());
    l locall = new l();
    long l = locall.e();
    try
    {
      parama.e();
      a(null, localj, l, locall.c());
      return null;
    }
    catch (IOException localIOException)
    {
      parama.q();
      localj.w(l);
      localj.A(locall.c());
      I4.j.d(localj);
      throw localIOException;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.perf.network.FirebasePerfOkHttpClient
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */