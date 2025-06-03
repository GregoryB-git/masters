package androidx.emoji2.text;

import androidx.annotation.RequiresApi;

@RequiresApi(19)
final class EmojiProcessor$CodepointIndexFinder
{
  private static final int INVALID_INDEX = -1;
  
  public static int findIndexBackward(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    int i = paramCharSequence.length();
    if ((paramInt1 >= 0) && (i >= paramInt1))
    {
      if (paramInt2 < 0) {
        return -1;
      }
      i = 0;
      for (;;)
      {
        if (paramInt2 == 0) {
          return paramInt1;
        }
        paramInt1--;
        if (paramInt1 < 0)
        {
          if (i != 0) {
            return -1;
          }
          return 0;
        }
        char c = paramCharSequence.charAt(paramInt1);
        if (i != 0)
        {
          if (!Character.isHighSurrogate(c)) {
            return -1;
          }
          paramInt2--;
          break;
        }
        if (!Character.isSurrogate(c))
        {
          paramInt2--;
        }
        else
        {
          if (Character.isHighSurrogate(c)) {
            return -1;
          }
          i = 1;
        }
      }
    }
    return -1;
  }
  
  public static int findIndexForward(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    int i = paramCharSequence.length();
    if ((paramInt1 >= 0) && (i >= paramInt1))
    {
      if (paramInt2 < 0) {
        return -1;
      }
      int j = 0;
      for (;;)
      {
        if (paramInt2 == 0) {
          return paramInt1;
        }
        if (paramInt1 >= i)
        {
          if (j != 0) {
            return -1;
          }
          return i;
        }
        char c = paramCharSequence.charAt(paramInt1);
        if (j != 0)
        {
          if (!Character.isLowSurrogate(c)) {
            return -1;
          }
          paramInt2--;
          paramInt1++;
          break;
        }
        if (!Character.isSurrogate(c))
        {
          paramInt2--;
          paramInt1++;
        }
        else
        {
          if (Character.isLowSurrogate(c)) {
            return -1;
          }
          paramInt1++;
          j = 1;
        }
      }
    }
    return -1;
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.EmojiProcessor.CodepointIndexFinder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */