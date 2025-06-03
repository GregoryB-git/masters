package a0;

import android.media.VolumeProvider;

public class o$a
  extends VolumeProvider
{
  public o$a(o paramo, int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    super(paramInt1, paramInt2, paramInt3, paramString);
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
 * Qualified Name:     a0.o.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */