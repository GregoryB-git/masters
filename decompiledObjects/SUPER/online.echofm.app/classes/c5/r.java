package c5;

public abstract class r
  extends p
{
  public static final int[] f = { 1, 1, 1, 1, 1, 1 };
  public static final int[][] g = { { 56, 52, 50, 49, 44, 38, 35, 42, 41, 37 }, { 7, 11, 13, 14, 19, 25, 28, 21, 22, 26 } };
  
  public static String c(String paramString)
  {
    char[] arrayOfChar = new char[6];
    paramString.getChars(1, 7, arrayOfChar, 0);
    StringBuilder localStringBuilder = new StringBuilder(12);
    localStringBuilder.append(paramString.charAt(0));
    char c = arrayOfChar[5];
    switch (c)
    {
    default: 
      localStringBuilder.append(arrayOfChar, 0, 5);
      localStringBuilder.append("0000");
      localStringBuilder.append(c);
      break;
    case '4': 
      localStringBuilder.append(arrayOfChar, 0, 4);
      localStringBuilder.append("00000");
      localStringBuilder.append(arrayOfChar[4]);
      break;
    case '3': 
      localStringBuilder.append(arrayOfChar, 0, 3);
      localStringBuilder.append("00000");
      localStringBuilder.append(arrayOfChar, 3, 2);
      break;
    case '0': 
    case '1': 
    case '2': 
      localStringBuilder.append(arrayOfChar, 0, 2);
      localStringBuilder.append(c);
      localStringBuilder.append("0000");
      localStringBuilder.append(arrayOfChar, 2, 3);
    }
    if (paramString.length() >= 8) {
      localStringBuilder.append(paramString.charAt(7));
    }
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     c5.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */