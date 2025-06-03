package c5;

public final class b
  extends n
{
  public static final char[] a;
  public static final char[] b = { 84, 78, 42, 69 };
  public static final char[] c = { 47, 58, 43, 46 };
  public static final char d = (char)arrayOfChar[0];
  
  static
  {
    char[] arrayOfChar = new char[4];
    arrayOfChar[0] = 65;
    arrayOfChar[1] = 66;
    arrayOfChar[2] = 67;
    arrayOfChar[3] = 68;
    arrayOfChar;
    a = arrayOfChar;
  }
  
  public boolean[] c(String paramString)
  {
    if (paramString.length() < 2) {}
    boolean bool1;
    for (Object localObject = new StringBuilder();; localObject = new StringBuilder())
    {
      char c1 = d;
      ((StringBuilder)localObject).append(c1);
      ((StringBuilder)localObject).append(paramString);
      ((StringBuilder)localObject).append(c1);
      paramString = ((StringBuilder)localObject).toString();
      break;
      c1 = Character.toUpperCase(paramString.charAt(0));
      char c2 = Character.toUpperCase(paramString.charAt(paramString.length() - 1));
      localObject = a;
      bool1 = a.a((char[])localObject, c1);
      boolean bool2 = a.a((char[])localObject, c2);
      localObject = b;
      boolean bool3 = a.a((char[])localObject, c1);
      boolean bool4 = a.a((char[])localObject, c2);
      if (bool1)
      {
        if (bool2) {
          break;
        }
        throw new IllegalArgumentException("Invalid start/end guards: ".concat(paramString));
      }
      if (bool3)
      {
        if (bool4) {
          break;
        }
        throw new IllegalArgumentException("Invalid start/end guards: ".concat(paramString));
      }
      if ((bool2) || (bool4)) {
        break label581;
      }
    }
    int i = 20;
    for (int j = 1; j < paramString.length() - 1; j++) {
      if ((!Character.isDigit(paramString.charAt(j))) && (paramString.charAt(j) != '-') && (paramString.charAt(j) != '$'))
      {
        if (a.a(c, paramString.charAt(j)))
        {
          i += 10;
        }
        else
        {
          localObject = new StringBuilder("Cannot encode : '");
          ((StringBuilder)localObject).append(paramString.charAt(j));
          ((StringBuilder)localObject).append('\'');
          throw new IllegalArgumentException(((StringBuilder)localObject).toString());
        }
      }
      else {
        i += 9;
      }
    }
    boolean[] arrayOfBoolean = new boolean[i + (paramString.length() - 1)];
    int k = 0;
    for (j = k; k < paramString.length(); j = i)
    {
      int m = Character.toUpperCase(paramString.charAt(k));
      if (k != 0)
      {
        i = m;
        if (k != paramString.length() - 1) {}
      }
      else if (m != 42)
      {
        if (m != 69)
        {
          if (m != 78)
          {
            if (m != 84) {
              i = m;
            } else {
              i = 65;
            }
          }
          else {
            i = 66;
          }
        }
        else {
          i = 68;
        }
      }
      else
      {
        i = 67;
      }
      for (m = 0;; m++)
      {
        localObject = a.a;
        if (m >= localObject.length) {
          break;
        }
        if (i == localObject[m])
        {
          m = a.b[m];
          break label471;
        }
      }
      m = 0;
      label471:
      int n = 0;
      i = n;
      bool1 = true;
      while (n < 7)
      {
        arrayOfBoolean[j] = bool1;
        j++;
        if (((m >> 6 - n & 0x1) != 0) && (i != 1))
        {
          i++;
        }
        else
        {
          bool1 ^= true;
          n++;
          i = 0;
        }
      }
      i = j;
      if (k < paramString.length() - 1)
      {
        arrayOfBoolean[j] = false;
        i = j + 1;
      }
      k++;
    }
    return arrayOfBoolean;
    label581:
    throw new IllegalArgumentException("Invalid start/end guards: ".concat(paramString));
  }
}

/* Location:
 * Qualified Name:     c5.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */