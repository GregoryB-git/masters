package a0;

import android.media.VolumeProvider;
import android.os.Build.VERSION;

public abstract class o
{
  public final int a;
  public final int b;
  public final String c;
  public int d;
  public d e;
  public VolumeProvider f;
  
  public o(int paramInt1, int paramInt2, int paramInt3)
  {
    this(paramInt1, paramInt2, paramInt3, null);
  }
  
  public o(int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    a = paramInt1;
    b = paramInt2;
    d = paramInt3;
    c = paramString;
  }
  
  public final int a()
  {
    return b;
  }
  
  public final int b()
  {
    return a;
  }
  
  public Object c()
  {
    if (f == null)
    {
      if (Build.VERSION.SDK_INT >= 30) {}
      for (Object localObject = new a(a, b, d, c);; localObject = new b(a, b, d))
      {
        f = ((VolumeProvider)localObject);
        break;
      }
    }
    return f;
  }
  
  public abstract void d(int paramInt);
  
  public abstract void e(int paramInt);
  
  public final void f(int paramInt)
  {
    d = paramInt;
    c.a((VolumeProvider)c(), paramInt);
  }
  
  public class a
    extends VolumeProvider
  {
    public a(int paramInt1, int paramInt2, int paramInt3, String paramString)
    {
      super(paramInt2, paramInt3, paramString);
    }
    
    public void onAdjustVolume(int paramInt)
    {
      d(paramInt);
    }
    
    public void onSetVolumeTo(int paramInt)
    {
      e(paramInt);
    }
  }
  
  public class b
    extends VolumeProvider
  {
    public b(int paramInt1, int paramInt2, int paramInt3)
    {
      super(paramInt2, paramInt3);
    }
    
    public void onAdjustVolume(int paramInt)
    {
      d(paramInt);
    }
    
    public void onSetVolumeTo(int paramInt)
    {
      e(paramInt);
    }
  }
  
  public static abstract class c
  {
    public static void a(VolumeProvider paramVolumeProvider, int paramInt)
    {
      paramVolumeProvider.setCurrentVolume(paramInt);
    }
  }
  
  public static abstract class d
  {
    public abstract void a(o paramo);
  }
}

/* Location:
 * Qualified Name:     a0.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */