package com.ryanheise.audioservice;

import g1.y;

public final class a
  extends y
{
  public a(int paramInt1, int paramInt2, int paramInt3)
  {
    super(paramInt1, paramInt2, paramInt3);
  }
  
  public final void b(int paramInt)
  {
    AudioService.c localc = AudioService.H;
    if (localc == null) {
      return;
    }
    ((b.c)localc).a("androidAdjustRemoteVolume", b.k(new Object[] { "direction", Integer.valueOf(paramInt) }), null);
  }
  
  public final void c(int paramInt)
  {
    AudioService.c localc = AudioService.H;
    if (localc == null) {
      return;
    }
    ((b.c)localc).a("androidSetRemoteVolume", b.k(new Object[] { "volumeIndex", Integer.valueOf(paramInt) }), null);
  }
}

/* Location:
 * Qualified Name:     com.ryanheise.audioservice.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */