package I;

public abstract class x$m
{
  public static int a(int paramInt)
  {
    if (paramInt != 1)
    {
      if (paramInt != 2)
      {
        if (paramInt != 4)
        {
          if (paramInt != 8)
          {
            if (paramInt != 16)
            {
              if (paramInt != 32)
              {
                if (paramInt != 64)
                {
                  if (paramInt != 128)
                  {
                    if (paramInt == 256) {
                      return 8;
                    }
                    StringBuilder localStringBuilder = new StringBuilder();
                    localStringBuilder.append("type needs to be >= FIRST and <= LAST, type=");
                    localStringBuilder.append(paramInt);
                    throw new IllegalArgumentException(localStringBuilder.toString());
                  }
                  return 7;
                }
                return 6;
              }
              return 5;
            }
            return 4;
          }
          return 3;
        }
        return 2;
      }
      return 1;
    }
    return 0;
  }
}

/* Location:
 * Qualified Name:     I.x.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */