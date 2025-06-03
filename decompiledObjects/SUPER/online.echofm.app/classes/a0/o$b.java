package a0;

import android.media.VolumeProvider;

public class o$b
  extends VolumeProvider
{
  public o$b(o paramo, int paramInt1, int paramInt2, int paramInt3)
  {
    super(paramInt1, paramInt2, paramInt3);
  }
  
  public void onAdjustVolume(int paramInt)
  {
    a.d(paramInt);
  }
  
  public void onSetVolumeTo(int paramInt)
  {
    a.e(paramInt);
  }
}

/* Location:
 * Qualified Name:     a0.o.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */