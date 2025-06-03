package androidx.emoji2.text.flatbuffer;

import z2;

class Utf8$UnpairedSurrogateException
  extends IllegalArgumentException
{
  public Utf8$UnpairedSurrogateException(int paramInt1, int paramInt2)
  {
    super(z2.n("Unpaired surrogate at index ", paramInt1, " of ", paramInt2));
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.flatbuffer.Utf8.UnpairedSurrogateException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */