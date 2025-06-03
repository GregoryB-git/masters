package b5;

public abstract class i
{
  public static final int[] a = { 5, 7, 10, 11, 12, 14, 18, 20, 24, 28, 36, 42, 48, 56, 62, 68 };
  public static final int[][] b;
  public static final int[] c;
  public static final int[] d;
  
  static
  {
    int[] arrayOfInt1 = { 228, 48, 15, 111, 62 };
    int[] arrayOfInt2 = { 23, 68, 144, 134, 240, 92, 254 };
    int[] arrayOfInt3 = { 28, 24, 185, 166, 223, 248, 116, 255, 110, 61 };
    int[] arrayOfInt4 = { 175, 138, 205, 12, 194, 168, 39, 245, 60, 97, 120 };
    int[] arrayOfInt5 = { 41, 153, 158, 91, 61, 42, 142, 213, 97, 178, 100, 242 };
    int[] arrayOfInt6 = { 156, 97, 192, 252, 95, 9, 157, 119, 138, 45, 18, 186, 83, 185 };
    int[] arrayOfInt7 = { 83, 195, 100, 39, 188, 75, 66, 61, 241, 213, 109, 129, 94, 254, 225, 48, 90, 188 };
    int[] arrayOfInt8 = { 15, 195, 244, 9, 233, 71, 168, 2, 188, 160, 153, 145, 253, 79, 108, 82, 27, 174, 186, 172 };
    int[] arrayOfInt9 = { 211, 231, 43, 97, 71, 96, 103, 174, 37, 151, 170, 53, 75, 34, 249, 121, 17, 138, 110, 213, 141, 136, 120, 151, 233, 168, 93, 255 };
    int[] arrayOfInt10 = { 77, 193, 137, 31, 19, 38, 22, 153, 247, 105, 122, 2, 245, 133, 242, 8, 175, 95, 100, 9, 167, 105, 214, 111, 57, 121, 21, 1, 253, 57, 54, 101, 248, 202, 69, 50, 150, 177, 226, 5, 9, 5 };
    int[] arrayOfInt11 = { 245, 132, 172, 223, 96, 32, 117, 22, 238, 133, 238, 231, 205, 188, 237, 87, 191, 106, 16, 147, 118, 23, 37, 90, 170, 205, 131, 88, 120, 100, 66, 138, 186, 240, 82, 44, 176, 87, 187, 147, 160, 175, 69, 213, 92, 253, 225, 19 };
    int[] arrayOfInt12 = { 175, 9, 223, 238, 12, 17, 220, 208, 100, 29, 175, 170, 230, 192, 215, 235, 150, 159, 36, 223, 38, 200, 132, 54, 228, 146, 218, 234, 117, 203, 29, 232, 144, 238, 22, 150, 201, 117, 62, 207, 164, 13, 137, 245, 127, 67, 247, 28, 155, 43, 203, 107, 233, 53, 143, 46 };
    int[] arrayOfInt13 = { 242, 93, 169, 50, 144, 210, 39, 118, 202, 188, 201, 189, 143, 108, 196, 37, 185, 112, 134, 230, 245, 63, 197, 190, 250, 106, 185, 221, 175, 64, 114, 71, 161, 44, 147, 6, 27, 218, 51, 63, 87, 10, 40, 130, 188, 17, 163, 31, 176, 170, 4, 107, 232, 7, 94, 166, 224, 124, 86, 47, 11, 204 };
    b = new int[][] { arrayOfInt1, arrayOfInt2, arrayOfInt3, arrayOfInt4, arrayOfInt5, arrayOfInt6, arrayOfInt7, arrayOfInt8, { 52, 190, 88, 205, 109, 39, 176, 21, 155, 197, 251, 223, 155, 21, 5, 172, 254, 124, 12, 181, 184, 96, 50, 193 }, arrayOfInt9, { 245, 127, 242, 218, 130, 250, 162, 181, 102, 120, 84, 179, 220, 251, 80, 182, 229, 18, 2, 4, 68, 33, 101, 137, 95, 119, 115, 44, 175, 184, 59, 25, 225, 98, 81, 112 }, arrayOfInt10, arrayOfInt11, arrayOfInt12, arrayOfInt13, { 220, 228, 173, 89, 251, 149, 159, 56, 89, 33, 147, 244, 154, 36, 73, 127, 213, 136, 248, 180, 234, 197, 158, 177, 68, 122, 93, 213, 15, 160, 227, 236, 66, 139, 153, 185, 202, 167, 179, 25, 220, 232, 96, 210, 231, 136, 223, 239, 181, 241, 59, 52, 172, 25, 49, 232, 211, 189, 64, 54, 108, 153, 132, 63, 96, 103, 82, 186 } };
    c = new int['Ā'];
    d = new int['ÿ'];
    int i = 0;
    int j = 1;
    while (i < 255)
    {
      d[i] = j;
      c[j] = i;
      int k = j << 1;
      j = k;
      if (k >= 256) {
        j = k ^ 0x12D;
      }
      i++;
    }
  }
  
  public static String a(CharSequence paramCharSequence, int paramInt)
  {
    return b(paramCharSequence, 0, paramCharSequence.length(), paramInt);
  }
  
  public static String b(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = 0;
    Object localObject;
    for (int j = 0;; j++)
    {
      localObject = a;
      if (j >= localObject.length) {
        break;
      }
      if (localObject[j] == paramInt3) {
        break label40;
      }
    }
    j = -1;
    label40:
    if (j >= 0)
    {
      int[] arrayOfInt1 = b[j];
      localObject = new char[paramInt3];
      for (j = 0; j < paramInt3; j++) {
        localObject[j] = ((char)0);
      }
      for (j = paramInt1; j < paramInt1 + paramInt2; j++)
      {
        int k = paramInt3 - 1;
        int m = localObject[k] ^ paramCharSequence.charAt(j);
        int[] arrayOfInt2;
        int[] arrayOfInt3;
        while (k > 0)
        {
          if (m != 0)
          {
            int n = arrayOfInt1[k];
            if (n != 0)
            {
              int i1 = localObject[(k - 1)];
              arrayOfInt2 = d;
              arrayOfInt3 = c;
              localObject[k] = ((char)(char)(arrayOfInt2[((arrayOfInt3[m] + arrayOfInt3[n]) % 255)] ^ i1));
              break label197;
            }
          }
          localObject[k] = ((char)localObject[(k - 1)]);
          label197:
          k--;
        }
        if (m != 0)
        {
          k = arrayOfInt1[0];
          if (k != 0)
          {
            arrayOfInt2 = d;
            arrayOfInt3 = c;
            localObject[0] = ((char)(char)arrayOfInt2[((arrayOfInt3[m] + arrayOfInt3[k]) % 255)]);
            continue;
          }
        }
        localObject[0] = ((char)0);
      }
      paramCharSequence = new char[paramInt3];
      for (paramInt1 = i; paramInt1 < paramInt3; paramInt1++) {
        paramCharSequence[paramInt1] = ((char)localObject[(paramInt3 - paramInt1 - 1)]);
      }
      return String.valueOf(paramCharSequence);
    }
    throw new IllegalArgumentException("Illegal number of error correction codewords specified: ".concat(String.valueOf(paramInt3)));
  }
  
  public static String c(String paramString, k paramk)
  {
    if (paramString.length() == paramk.a())
    {
      StringBuilder localStringBuilder = new StringBuilder(paramk.a() + paramk.c());
      localStringBuilder.append(paramString);
      int i = paramk.f();
      if (i == 1)
      {
        localStringBuilder.append(a(paramString, paramk.c()));
      }
      else
      {
        localStringBuilder.setLength(localStringBuilder.capacity());
        int[] arrayOfInt1 = new int[i];
        int[] arrayOfInt2 = new int[i];
        Object localObject = new int[i];
        int k;
        for (int j = 0; j < i; j = k)
        {
          k = j + 1;
          arrayOfInt1[j] = paramk.b(k);
          arrayOfInt2[j] = paramk.d(k);
          localObject[j] = 0;
          if (j > 0) {
            localObject[j] = (localObject[(j - 1)] + arrayOfInt1[j]);
          }
        }
        for (j = 0; j < i; j++)
        {
          localObject = new StringBuilder(arrayOfInt1[j]);
          k = j;
          while (k < paramk.a())
          {
            ((StringBuilder)localObject).append(paramString.charAt(k));
            k += i;
          }
          localObject = a(((StringBuilder)localObject).toString(), arrayOfInt2[j]);
          int m = j;
          for (k = 0; m < arrayOfInt2[j] * i; k++)
          {
            localStringBuilder.setCharAt(paramk.a() + m, ((String)localObject).charAt(k));
            m += i;
          }
        }
      }
      return localStringBuilder.toString();
    }
    throw new IllegalArgumentException("The number of codewords does not match the selected symbol");
  }
}

/* Location:
 * Qualified Name:     b5.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */