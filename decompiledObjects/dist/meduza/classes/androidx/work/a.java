package androidx.work;

import android.os.Build.VERSION;
import b.a0;
import java.util.concurrent.ExecutorService;
import o2.k;
import o2.r;
import o2.s;
import p2.c;
import p2.m0;

public final class a
{
  public final ExecutorService a = a0.f(false);
  public final ExecutorService b = a0.f(true);
  public final m0 c = new m0();
  public final r d;
  public final k e;
  public final c f;
  public final int g;
  public final int h;
  public final int i;
  public final int j;
  
  public a(a parama)
  {
    parama = s.a;
    d = new r();
    e = k.b;
    f = new c();
    g = 4;
    h = Integer.MAX_VALUE;
    int k;
    if (Build.VERSION.SDK_INT == 23) {
      k = 10;
    } else {
      k = 20;
    }
    j = k;
    i = 8;
  }
  
  public static final class a {}
  
  public static abstract interface b
  {
    public abstract a a();
  }
}

/* Location:
 * Qualified Name:     androidx.work.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */