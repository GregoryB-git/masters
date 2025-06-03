package ma;

import f;

public final class u1$d
  extends IllegalArgumentException
{
  public u1$d(int paramInt1, int paramInt2)
  {
    super(f.i("Unpaired surrogate at index ", paramInt1, " of ", paramInt2));
  }
}

/* Location:
 * Qualified Name:     ma.u1.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */