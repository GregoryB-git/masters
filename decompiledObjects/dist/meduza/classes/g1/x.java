package g1;

import android.media.VolumeProvider;

public final class x
  extends VolumeProvider
{
  public x(y paramy, int paramInt1, int paramInt2, int paramInt3)
  {
    super(paramInt1, paramInt2, paramInt3);
  }
  
  public final void onAdjustVolume(int paramInt)
  {
    a.b(paramInt);
  }
  
  public final void onSetVolumeTo(int paramInt)
  {
    a.c(paramInt);
  }
}

/* Location:
 * Qualified Name:     g1.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */