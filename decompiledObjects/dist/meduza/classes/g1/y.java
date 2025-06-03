package g1;

import android.media.VolumeProvider;
import android.os.Build.VERSION;

public abstract class y
{
  public final int a;
  public final int b;
  public final String c;
  public int d;
  public VolumeProvider e;
  
  public y(int paramInt1, int paramInt2, int paramInt3)
  {
    a = paramInt1;
    b = paramInt2;
    d = paramInt3;
    c = null;
  }
  
  public final VolumeProvider a()
  {
    if (e == null)
    {
      Object localObject;
      if (Build.VERSION.SDK_INT >= 30) {
        localObject = new w(this, a, b, d, c);
      } else {
        localObject = new x(this, a, b, d);
      }
      e = ((VolumeProvider)localObject);
    }
    return e;
  }
  
  public abstract void b(int paramInt);
  
  public abstract void c(int paramInt);
  
  public static final class a
  {
    public static void a(VolumeProvider paramVolumeProvider, int paramInt)
    {
      paramVolumeProvider.setCurrentVolume(paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     g1.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */