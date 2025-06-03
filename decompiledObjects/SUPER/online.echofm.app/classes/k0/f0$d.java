package k0;

import D0.E;
import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.TextureView.SurfaceTextureListener;
import d0.P;
import d0.l;
import d0.q;
import d0.w;
import d0.w.b;
import g0.n;
import java.util.List;
import l0.a;
import m0.z.a;
import z0.h;

public final class f0$d
  implements E, m0.x, h, u0.b, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, m.b, b.b, g1.b, w.a
{
  public f0$d(f0 paramf0) {}
  
  public void A(o paramo)
  {
    f0.x0(a, paramo);
    f0.X0(a).A(paramo);
  }
  
  public void B(int paramInt, boolean paramBoolean)
  {
    f0.a1(a).k(30, new m0(paramInt, paramBoolean));
  }
  
  public void C(boolean paramBoolean)
  {
    f0.S0(a);
  }
  
  public void D(int paramInt)
  {
    l locall = f0.P0(f0.O0(a));
    if (!locall.equals(f0.Q0(a)))
    {
      f0.R0(a, locall);
      f0.a1(a).k(29, new l0(locall));
    }
  }
  
  public void E()
  {
    f0.N0(a, false, -1, 3);
  }
  
  public void F(float paramFloat)
  {
    f0.L0(a);
  }
  
  public void a(z.a parama)
  {
    f0.X0(a).a(parama);
  }
  
  public void b(P paramP)
  {
    f0.Z0(a, paramP);
    f0.a1(a).k(25, new n0(paramP));
  }
  
  public void c(boolean paramBoolean)
  {
    if (f0.z0(a) == paramBoolean) {
      return;
    }
    f0.A0(a, paramBoolean);
    f0.a1(a).k(23, new p0(paramBoolean));
  }
  
  public void d(Exception paramException)
  {
    f0.X0(a).d(paramException);
  }
  
  public void e(z.a parama)
  {
    f0.X0(a).e(parama);
  }
  
  public void f(o paramo)
  {
    f0.X0(a).f(paramo);
    f0.y0(a, null);
    f0.x0(a, null);
  }
  
  public void g(String paramString)
  {
    f0.X0(a).g(paramString);
  }
  
  public void h(Object paramObject, long paramLong)
  {
    f0.X0(a).h(paramObject, paramLong);
    if (f0.b1(a) == paramObject) {
      f0.a1(a).k(26, new o0());
    }
  }
  
  public void i(String paramString, long paramLong1, long paramLong2)
  {
    f0.X0(a).i(paramString, paramLong1, paramLong2);
  }
  
  public void j(int paramInt)
  {
    boolean bool = a.u();
    f0.N0(a, bool, paramInt, f0.M0(paramInt));
  }
  
  public void k(List paramList)
  {
    f0.a1(a).k(27, new k0(paramList));
  }
  
  public void l(long paramLong)
  {
    f0.X0(a).l(paramLong);
  }
  
  public void n(o paramo)
  {
    f0.W0(a, paramo);
    f0.X0(a).n(paramo);
  }
  
  public void o(o paramo)
  {
    f0.X0(a).o(paramo);
    f0.Y0(a, null);
    f0.W0(a, null);
  }
  
  public void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    f0.K0(a, paramSurfaceTexture);
    f0.J0(a, paramInt1, paramInt2);
  }
  
  public boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    f0.I0(a, null);
    f0.J0(a, 0, 0);
    return true;
  }
  
  public void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    f0.J0(a, paramInt1, paramInt2);
  }
  
  public void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture) {}
  
  public void p(Exception paramException)
  {
    f0.X0(a).p(paramException);
  }
  
  public void q(Exception paramException)
  {
    f0.X0(a).q(paramException);
  }
  
  public void r(f0.b paramb)
  {
    f0.B0(a, paramb);
    f0.a1(a).k(27, new h0(paramb));
  }
  
  public void s(String paramString)
  {
    f0.X0(a).s(paramString);
  }
  
  public void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3)
  {
    f0.J0(a, paramInt2, paramInt3);
  }
  
  public void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    if (f0.H0(a)) {
      f0.I0(a, paramSurfaceHolder.getSurface());
    }
  }
  
  public void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
    if (f0.H0(a)) {
      f0.I0(a, null);
    }
    f0.J0(a, 0, 0);
  }
  
  public void t(String paramString, long paramLong1, long paramLong2)
  {
    f0.X0(a).t(paramString, paramLong1, paramLong2);
  }
  
  public void u(q paramq, p paramp)
  {
    f0.Y0(a, paramq);
    f0.X0(a).u(paramq, paramp);
  }
  
  public void v(int paramInt, long paramLong1, long paramLong2)
  {
    f0.X0(a).v(paramInt, paramLong1, paramLong2);
  }
  
  public void w(int paramInt, long paramLong)
  {
    f0.X0(a).w(paramInt, paramLong);
  }
  
  public void x(d0.x paramx)
  {
    Object localObject = a;
    f0.D0((f0)localObject, f0.C0((f0)localObject).a().L(paramx).I());
    localObject = f0.E0(a);
    if (!((w)localObject).equals(f0.F0(a)))
    {
      f0.G0(a, (w)localObject);
      f0.a1(a).i(14, new i0(this));
    }
    f0.a1(a).i(28, new j0(paramx));
    f0.a1(a).f();
  }
  
  public void y(long paramLong, int paramInt)
  {
    f0.X0(a).y(paramLong, paramInt);
  }
  
  public void z(q paramq, p paramp)
  {
    f0.y0(a, paramq);
    f0.X0(a).z(paramq, paramp);
  }
}

/* Location:
 * Qualified Name:     k0.f0.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */