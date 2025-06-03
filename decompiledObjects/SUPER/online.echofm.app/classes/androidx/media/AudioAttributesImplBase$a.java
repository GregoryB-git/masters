package androidx.media;

public class AudioAttributesImplBase$a
  implements AudioAttributesImpl.a
{
  public int a = 0;
  public int b = 0;
  public int c = 0;
  public int d = -1;
  
  public AudioAttributesImpl a()
  {
    return new AudioAttributesImplBase(b, c, a, d);
  }
  
  public a e(int paramInt)
  {
    int i = paramInt;
    if (paramInt != 0)
    {
      i = paramInt;
      if (paramInt != 1)
      {
        i = paramInt;
        if (paramInt != 2)
        {
          i = paramInt;
          if (paramInt != 3)
          {
            i = paramInt;
            if (paramInt != 4) {
              i = 0;
            }
          }
        }
      }
    }
    b = i;
    return this;
  }
  
  public a f(int paramInt)
  {
    c = (paramInt & 0x3FF | c);
    return this;
  }
  
  public a g(int paramInt)
  {
    int i = paramInt;
    switch (paramInt)
    {
    }
    for (i = 0;; i = 12)
    {
      a = i;
      break;
    }
    return this;
  }
}

/* Location:
 * Qualified Name:     androidx.media.AudioAttributesImplBase.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */