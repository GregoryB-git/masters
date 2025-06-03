package v3;

import aa.m0;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.TextureView.SurfaceTextureListener;
import d;
import h5.c;
import h5.m;
import io.flutter.plugins.firebase.auth.g;
import java.util.List;
import p4.a.b;
import r3.j;
import w5.n;
import x5.j.b;
import z3.i;

public final class d0$b
  implements n, x3.l, m, p4.e, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, j.b, d.b, b.b, p1.a, o
{
  public d0$b(d0 paramd0) {}
  
  public final void A(z3.e parame)
  {
    a.r.A(parame);
    a.getClass();
    a.getClass();
  }
  
  public final void B()
  {
    a.t0();
  }
  
  public final void C(long paramLong1, long paramLong2, String paramString)
  {
    a.r.C(paramLong1, paramLong2, paramString);
  }
  
  public final void a(z3.e parame)
  {
    a.r.a(parame);
    a.P = null;
  }
  
  public final void b(w5.o paramo)
  {
    a.getClass();
    a.l.e(25, new m0(paramo, 3));
  }
  
  public final void c(String paramString)
  {
    a.r.c(paramString);
  }
  
  public final void e(int paramInt, long paramLong)
  {
    a.r.e(paramInt, paramLong);
  }
  
  public final void f()
  {
    a.n0(null);
  }
  
  public final void g(z3.e parame)
  {
    a.getClass();
    a.r.g(parame);
  }
  
  public final void h(i0 parami0, i parami)
  {
    d0 locald0 = a;
    P = parami0;
    r.h(parami0, parami);
  }
  
  public final void i(String paramString)
  {
    a.r.i(paramString);
  }
  
  public final void j(c paramc)
  {
    a.getClass();
    a.l.e(27, new d(paramc, 6));
  }
  
  public final void k(int paramInt, long paramLong)
  {
    a.r.k(paramInt, paramLong);
  }
  
  public final void l(Object paramObject, long paramLong)
  {
    a.r.l(paramObject, paramLong);
    d0 locald0 = a;
    if (R == paramObject) {
      l.e(26, new j(6));
    }
  }
  
  public final void m(Surface paramSurface)
  {
    a.n0(paramSurface);
  }
  
  public final void n(z3.e parame)
  {
    a.getClass();
    a.r.n(parame);
  }
  
  public final void o(boolean paramBoolean)
  {
    d0 locald0 = a;
    if (Y == paramBoolean) {
      return;
    }
    Y = paramBoolean;
    l.e(23, new u(1, paramBoolean));
  }
  
  public final void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    d0 locald0 = a;
    locald0.getClass();
    paramSurfaceTexture = new Surface(paramSurfaceTexture);
    locald0.n0(paramSurfaceTexture);
    S = paramSurfaceTexture;
    a.g0(paramInt1, paramInt2);
  }
  
  public final boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    a.n0(null);
    a.g0(0, 0);
    return true;
  }
  
  public final void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    a.g0(paramInt1, paramInt2);
  }
  
  public final void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture) {}
  
  public final void p(Exception paramException)
  {
    a.r.p(paramException);
  }
  
  public final void r(List<h5.a> paramList)
  {
    a.l.e(27, new e(paramList, 4));
  }
  
  public final void s(long paramLong)
  {
    a.r.s(paramLong);
  }
  
  public final void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3)
  {
    a.g0(paramInt2, paramInt3);
  }
  
  public final void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    a.getClass();
  }
  
  public final void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
    a.getClass();
    a.g0(0, 0);
  }
  
  public final void t(Exception paramException)
  {
    a.r.t(paramException);
  }
  
  public final void u(i0 parami0, i parami)
  {
    a.getClass();
    a.r.u(parami0, parami);
  }
  
  public final void v(Exception paramException)
  {
    a.r.v(paramException);
  }
  
  public final void w(p4.a parama)
  {
    d0 locald0 = a;
    Object localObject = d0;
    localObject.getClass();
    localObject = new p0.a((p0)localObject);
    for (int i = 0;; i++)
    {
      a.b[] arrayOfb = a;
      if (i >= arrayOfb.length) {
        break;
      }
      arrayOfb[i].l((p0.a)localObject);
    }
    d0 = new p0((p0.a)localObject);
    localObject = a.X();
    if (!((p0)localObject).equals(a.O))
    {
      locald0 = a;
      O = ((p0)localObject);
      l.c(14, new g(this, 8));
    }
    a.l.c(28, new d(parama, 5));
    a.l.b();
  }
  
  public final void y(long paramLong1, long paramLong2, String paramString)
  {
    a.r.y(paramLong1, paramLong2, paramString);
  }
  
  public final void z(int paramInt, long paramLong1, long paramLong2)
  {
    a.r.z(paramInt, paramLong1, paramLong2);
  }
}

/* Location:
 * Qualified Name:     v3.d0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */