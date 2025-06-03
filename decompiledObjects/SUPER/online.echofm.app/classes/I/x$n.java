package I;

public abstract class x$n
{
  public static int a(int paramInt)
  {
    int i = 0;
    int j = 1;
    while (j <= 256)
    {
      int k = i;
      if ((paramInt & j) != 0)
      {
        if (j != 1) {
          if (j != 2) {
            if (j != 4) {
              if (j != 8) {
                if (j != 16) {
                  if (j != 32) {
                    if (j != 64)
                    {
                      if (j != 128)
                      {
                        k = i;
                        break label130;
                      }
                      k = W.a();
                    }
                  }
                }
              }
            }
          }
        }
        for (;;)
        {
          k = i | k;
          break;
          k = V.a();
          continue;
          k = U.a();
          continue;
          k = T.a();
          continue;
          k = S.a();
          continue;
          k = Q.a();
          continue;
          k = P.a();
          continue;
          k = O.a();
        }
      }
      label130:
      j <<= 1;
      i = k;
    }
    return i;
  }
}

/* Location:
 * Qualified Name:     I.x.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */