package kotlin.text;

public class a
  extends CharsKt__CharJVMKt
{
  public static int c(char paramChar)
  {
    int i = CharsKt__CharJVMKt.a(paramChar, 10);
    if (i >= 0) {
      return i;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Char ");
    localStringBuilder.append(paramChar);
    localStringBuilder.append(" is not a decimal digit");
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public static final boolean d(char paramChar1, char paramChar2, boolean paramBoolean)
  {
    boolean bool = true;
    if (paramChar1 == paramChar2) {
      return true;
    }
    if (!paramBoolean) {
      return false;
    }
    paramChar1 = Character.toUpperCase(paramChar1);
    paramChar2 = Character.toUpperCase(paramChar2);
    paramBoolean = bool;
    if (paramChar1 != paramChar2) {
      if (Character.toLowerCase(paramChar1) == Character.toLowerCase(paramChar2)) {
        paramBoolean = bool;
      } else {
        paramBoolean = false;
      }
    }
    return paramBoolean;
  }
}

/* Location:
 * Qualified Name:     kotlin.text.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */