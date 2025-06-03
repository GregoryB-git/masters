package E2;

public abstract class j
{
  public static final char[] a = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70 };
  public static final char[] b = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
  
  public static String a(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    char[] arrayOfChar1 = new char[i + i];
    int j = 0;
    i = 0;
    for (;;)
    {
      int k = i;
      if (j >= paramArrayOfByte.length) {
        break;
      }
      int m = paramArrayOfByte[j];
      char[] arrayOfChar2 = b;
      arrayOfChar1[k] = ((char)arrayOfChar2[((m & 0xFF) >>> 4)]);
      i = k + 2;
      arrayOfChar1[(k + 1)] = ((char)arrayOfChar2[(m & 0xF)]);
      j++;
    }
    return new String(arrayOfChar1);
  }
  
  public static String b(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    int i = paramArrayOfByte.length;
    StringBuilder localStringBuilder = new StringBuilder(i + i);
    for (int j = 0; (j < i) && ((!paramBoolean) || (j != i - 1) || ((paramArrayOfByte[j] & 0xFF) != 0)); j++)
    {
      char[] arrayOfChar = a;
      localStringBuilder.append(arrayOfChar[((paramArrayOfByte[j] & 0xF0) >>> 4)]);
      localStringBuilder.append(arrayOfChar[(paramArrayOfByte[j] & 0xF)]);
    }
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     E2.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */