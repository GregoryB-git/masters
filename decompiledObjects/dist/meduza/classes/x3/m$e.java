package x3;

import f;
import v3.i0;

public final class m$e
  extends Exception
{
  public final int a;
  public final boolean b;
  public final i0 c;
  
  public m$e(int paramInt, i0 parami0, boolean paramBoolean)
  {
    super(f.h("AudioTrack write failed: ", paramInt));
    b = paramBoolean;
    a = paramInt;
    c = parami0;
  }
}

/* Location:
 * Qualified Name:     x3.m.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */