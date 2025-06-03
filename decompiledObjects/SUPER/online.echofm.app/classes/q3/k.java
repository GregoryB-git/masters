package q3;

public abstract class k
{
  public static byte[] a(String paramString)
  {
    if (paramString.length() % 2 == 0)
    {
      int i = paramString.length() / 2;
      byte[] arrayOfByte = new byte[i];
      int j = 0;
      while (j < i)
      {
        int k = j * 2;
        int m = Character.digit(paramString.charAt(k), 16);
        k = Character.digit(paramString.charAt(k + 1), 16);
        if ((m != -1) && (k != -1))
        {
          arrayOfByte[j] = ((byte)(byte)(m * 16 + k));
          j++;
        }
        else
        {
          throw new IllegalArgumentException("input is not hexadecimal");
        }
      }
      return arrayOfByte;
    }
    throw new IllegalArgumentException("Expected a string of even length");
  }
  
  public static String b(byte[] paramArrayOfByte)
  {
    StringBuilder localStringBuilder = new StringBuilder(paramArrayOfByte.length * 2);
    int i = paramArrayOfByte.length;
    for (int j = 0; j < i; j++)
    {
      int k = paramArrayOfByte[j] & 0xFF;
      localStringBuilder.append("0123456789abcdef".charAt(k / 16));
      localStringBuilder.append("0123456789abcdef".charAt(k % 16));
    }
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     q3.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */