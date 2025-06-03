package com.google.ads.interactivemedia.v3.internal;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.TextureView.SurfaceTextureListener;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

final class cs
  implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, ci, dj, dn, xa
{
  private cs(cq paramcq) {}
  
  public final void a() {}
  
  public final void a(int paramInt) {}
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, float paramFloat)
  {
    Iterator localIterator = cq.b(a).iterator();
    while (localIterator.hasNext())
    {
      wx localwx = (wx)localIterator.next();
      if (!cq.a(a).contains(localwx)) {
        localwx.a(paramInt1, paramInt2, paramInt3, paramFloat);
      }
    }
    localIterator = cq.a(a).iterator();
    while (localIterator.hasNext()) {
      ((xa)localIterator.next()).a(paramInt1, paramInt2, paramInt3, paramFloat);
    }
  }
  
  public final void a(int paramInt, long paramLong)
  {
    Iterator localIterator = cq.a(a).iterator();
    while (localIterator.hasNext()) {
      ((xa)localIterator.next()).a(paramInt, paramLong);
    }
  }
  
  public final void a(int paramInt, long paramLong1, long paramLong2)
  {
    Iterator localIterator = cq.d(a).iterator();
    while (localIterator.hasNext()) {
      ((dn)localIterator.next()).a(paramInt, paramLong1, paramLong2);
    }
  }
  
  public final void a(Surface paramSurface)
  {
    if (cq.c(a) == paramSurface)
    {
      localIterator = cq.b(a).iterator();
      while (localIterator.hasNext()) {
        ((wx)localIterator.next()).d();
      }
    }
    Iterator localIterator = cq.a(a).iterator();
    while (localIterator.hasNext()) {
      ((xa)localIterator.next()).a(paramSurface);
    }
  }
  
  public final void a(ba paramba) {}
  
  public final void a(bw parambw)
  {
    Iterator localIterator = cq.a(a).iterator();
    while (localIterator.hasNext()) {
      ((xa)localIterator.next()).a(parambw);
    }
  }
  
  public final void a(cg paramcg) {}
  
  public final void a(cr paramcr, int paramInt)
  {
    h.a(this, paramcr, paramInt);
  }
  
  public final void a(fa paramfa)
  {
    Iterator localIterator = cq.a(a).iterator();
    while (localIterator.hasNext()) {
      ((xa)localIterator.next()).a(paramfa);
    }
  }
  
  public final void a(of paramof, td paramtd) {}
  
  public final void a(String paramString, long paramLong1, long paramLong2)
  {
    Iterator localIterator = cq.a(a).iterator();
    while (localIterator.hasNext()) {
      ((xa)localIterator.next()).a(paramString, paramLong1, paramLong2);
    }
  }
  
  public final void a(boolean paramBoolean) {}
  
  public final void a(boolean paramBoolean, int paramInt) {}
  
  public final void b()
  {
    cq.g(a);
  }
  
  public final void b(int paramInt)
  {
    if (cq.e(a) == paramInt) {
      return;
    }
    cq.a(a, paramInt);
    Iterator localIterator = cq.f(a).iterator();
    while (localIterator.hasNext())
    {
      localObject = (dm)localIterator.next();
      if (!cq.d(a).contains(localObject)) {
        ((dm)localObject).b(paramInt);
      }
    }
    Object localObject = cq.d(a).iterator();
    while (((Iterator)localObject).hasNext()) {
      ((dn)((Iterator)localObject).next()).b(paramInt);
    }
  }
  
  public final void b(bw parambw)
  {
    Iterator localIterator = cq.d(a).iterator();
    while (localIterator.hasNext()) {
      ((dn)localIterator.next()).b(parambw);
    }
  }
  
  public final void b(fa paramfa)
  {
    Iterator localIterator = cq.a(a).iterator();
    while (localIterator.hasNext()) {
      ((xa)localIterator.next()).b(paramfa);
    }
  }
  
  public final void b(String paramString, long paramLong1, long paramLong2)
  {
    Iterator localIterator = cq.d(a).iterator();
    while (localIterator.hasNext()) {
      ((dn)localIterator.next()).b(paramString, paramLong1, paramLong2);
    }
  }
  
  public final void c(int paramInt)
  {
    cq localcq = a;
    cq.a(localcq, localcq.b(), paramInt);
  }
  
  public final void c(fa paramfa)
  {
    Iterator localIterator = cq.d(a).iterator();
    while (localIterator.hasNext()) {
      ((dn)localIterator.next()).c(paramfa);
    }
  }
  
  public final void d(fa paramfa)
  {
    Iterator localIterator = cq.d(a).iterator();
    while (localIterator.hasNext()) {
      ((dn)localIterator.next()).d(paramfa);
    }
    cq.a(a, 0);
  }
  
  public final void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    cq.a(a, new Surface(paramSurfaceTexture), true);
    cq.a(a, paramInt1, paramInt2);
  }
  
  public final boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    cq.a(a, null, true);
    cq.a(a, 0, 0);
    return true;
  }
  
  public final void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    cq.a(a, paramInt1, paramInt2);
  }
  
  public final void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture) {}
  
  public final void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3)
  {
    cq.a(a, paramInt2, paramInt3);
  }
  
  public final void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    cq.a(a, paramSurfaceHolder.getSurface(), false);
  }
  
  public final void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
    cq.a(a, null, false);
    cq.a(a, 0, 0);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.cs
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */