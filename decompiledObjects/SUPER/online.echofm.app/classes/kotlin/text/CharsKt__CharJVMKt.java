package kotlin.text;

import kotlin.Metadata;
import l6.c;

@Metadata
class CharsKt__CharJVMKt
{
  public static final int a(char paramChar, int paramInt)
  {
    return Character.digit(paramChar, paramInt);
  }
  
  public static final boolean b(char paramChar)
  {
    boolean bool;
    if ((!Character.isWhitespace(paramChar)) && (!Character.isSpaceChar(paramChar))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static final int checkRadix(int paramInt)
  {
    if ((2 <= paramInt) && (paramInt < 37)) {
      return paramInt;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("radix ");
    localStringBuilder.append(paramInt);
    localStringBuilder.append(" was not in valid range ");
    localStringBuilder.append(new c(2, 36));
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
}

/* Location:
 * Qualified Name:     kotlin.text.CharsKt__CharJVMKt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */