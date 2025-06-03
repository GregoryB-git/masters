package x;

import android.graphics.Path;
import android.util.Log;
import g;
import java.util.ArrayList;

public final class d
{
  public static boolean a(a[] paramArrayOfa1, a[] paramArrayOfa2)
  {
    if ((paramArrayOfa1 != null) && (paramArrayOfa2 != null))
    {
      if (paramArrayOfa1.length != paramArrayOfa2.length) {
        return false;
      }
      int i = 0;
      while (i < paramArrayOfa1.length)
      {
        a locala1 = paramArrayOfa1[i];
        int j = a;
        a locala2 = paramArrayOfa2[i];
        if ((j == a) && (b.length == b.length)) {
          i++;
        } else {
          return false;
        }
      }
      return true;
    }
    return false;
  }
  
  public static float[] b(float[] paramArrayOfFloat, int paramInt)
  {
    if (paramInt >= 0)
    {
      int i = paramArrayOfFloat.length;
      if (i >= 0)
      {
        paramInt += 0;
        i = Math.min(paramInt, i - 0);
        float[] arrayOfFloat = new float[paramInt];
        System.arraycopy(paramArrayOfFloat, 0, arrayOfFloat, 0, i);
        return arrayOfFloat;
      }
      throw new ArrayIndexOutOfBoundsException();
    }
    throw new IllegalArgumentException();
  }
  
  public static a[] c(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    int m;
    for (int j = 1;; j = m)
    {
      int k = 0;
      if (j >= paramString.length()) {
        break;
      }
      while (j < paramString.length())
      {
        m = paramString.charAt(j);
        if ((((m - 90) * (m - 65) <= 0) || ((m - 122) * (m - 97) <= 0)) && (m != 101) && (m != 69)) {
          break;
        }
        j++;
      }
      String str = paramString.substring(i, j).trim();
      if (!str.isEmpty())
      {
        if ((str.charAt(0) != 'z') && (str.charAt(0) != 'Z')) {
          try
          {
            arrayOfFloat = new float[str.length()];
            int n = str.length();
            int i1 = 1;
            m = 0;
            while (i1 < n)
            {
              i = m;
              int i2 = i;
              int i3 = i2;
              int i5;
              for (int i4 = i1;; i4++)
              {
                i5 = i;
                if (i4 >= str.length()) {
                  break;
                }
                i5 = str.charAt(i4);
                int i6;
                if (i5 != 32) {
                  if ((i5 != 69) && (i5 != 101)) {
                    i6 = i;
                  }
                }
                switch (i5)
                {
                default: 
                  i5 = m;
                  i6 = i;
                  i7 = i2;
                  break;
                case 46: 
                  if (i2 == 0)
                  {
                    i7 = 1;
                    i5 = m;
                    i6 = i;
                  }
                  break;
                case 45: 
                  i5 = m;
                  i6 = i;
                  i7 = i2;
                  if (i4 == i1) {
                    break label340;
                  }
                  i5 = m;
                  i6 = i;
                  i7 = i2;
                  if (i3 != 0) {
                    break label340;
                  }
                  i6 = 1;
                  break label333;
                  i3 = 1;
                  break label354;
                  i6 = i;
                }
                label333:
                i5 = 1;
                int i7 = i2;
                label340:
                i3 = 0;
                i2 = i7;
                i = i6;
                m = i5;
                label354:
                if (m != 0)
                {
                  i5 = i;
                  break;
                }
              }
              i = k;
              if (i1 < i4)
              {
                arrayOfFloat[k] = Float.parseFloat(str.substring(i1, i4));
                i = k + 1;
              }
              if (i5 == 0) {
                i4++;
              }
              i1 = i4;
              m = 0;
              k = i;
            }
            arrayOfFloat = b(arrayOfFloat, k);
          }
          catch (NumberFormatException paramString)
          {
            throw new RuntimeException(g.e("error in parsing \"", str, "\""), paramString);
          }
        }
        float[] arrayOfFloat = new float[0];
        localArrayList.add(new a(str.charAt(0), arrayOfFloat));
      }
      m = j + 1;
      i = j;
    }
    if ((j - i == 1) && (i < paramString.length())) {
      localArrayList.add(new a(paramString.charAt(i), new float[0]));
    }
    return (a[])localArrayList.toArray(new a[0]);
  }
  
  public static Path d(String paramString)
  {
    Path localPath = new Path();
    a[] arrayOfa = c(paramString);
    try
    {
      a.b(arrayOfa, localPath);
      return localPath;
    }
    catch (RuntimeException localRuntimeException)
    {
      throw new RuntimeException(g.d("Error in parsing ", paramString), localRuntimeException);
    }
  }
  
  public static a[] e(a[] paramArrayOfa)
  {
    a[] arrayOfa = new a[paramArrayOfa.length];
    for (int i = 0; i < paramArrayOfa.length; i++) {
      arrayOfa[i] = new a(paramArrayOfa[i]);
    }
    return arrayOfa;
  }
  
  public static final class a
  {
    public char a;
    public final float[] b;
    
    public a(char paramChar, float[] paramArrayOfFloat)
    {
      a = ((char)paramChar);
      b = paramArrayOfFloat;
    }
    
    public a(a parama)
    {
      a = ((char)a);
      parama = b;
      b = d.b(parama, parama.length);
    }
    
    public static void a(Path paramPath, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, boolean paramBoolean1, boolean paramBoolean2)
    {
      double d1 = Math.toRadians(paramFloat7);
      double d2 = Math.cos(d1);
      double d3 = Math.sin(d1);
      double d4 = paramFloat1;
      double d5 = paramFloat2;
      double d6 = d4;
      double d7 = paramFloat5;
      d4 = (d5 * d3 + d4 * d2) / d7;
      double d8 = -paramFloat1;
      double d9 = paramFloat6;
      double d10 = (d5 * d2 + d8 * d3) / d9;
      double d11 = paramFloat3;
      d8 = paramFloat4;
      double d12 = (d8 * d3 + d11 * d2) / d7;
      double d13 = (d8 * d2 + -paramFloat3 * d3) / d9;
      double d14 = d4 - d12;
      double d15 = d10 - d13;
      d11 = (d4 + d12) / 2.0D;
      d8 = (d10 + d13) / 2.0D;
      double d16 = d15 * d15 + d14 * d14;
      if (d16 == 0.0D)
      {
        Log.w("PathParser", " Points are coincident");
        return;
      }
      double d17 = 1.0D / d16 - 0.25D;
      if (d17 < 0.0D)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Points are too far apart ");
        localStringBuilder.append(d16);
        Log.w("PathParser", localStringBuilder.toString());
        float f = (float)(Math.sqrt(d16) / 1.99999D);
        a(paramPath, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5 * f, paramFloat6 * f, paramFloat7, paramBoolean1, paramBoolean2);
        return;
      }
      d16 = Math.sqrt(d17);
      d14 *= d16;
      d15 = d16 * d15;
      if (paramBoolean1 == paramBoolean2)
      {
        d11 -= d15;
        d8 += d14;
      }
      else
      {
        d11 += d15;
        d8 -= d14;
      }
      d14 = Math.atan2(d10 - d8, d4 - d11);
      d10 = Math.atan2(d13 - d8, d12 - d11) - d14;
      boolean bool = d10 < 0.0D;
      if (!bool) {
        paramBoolean1 = true;
      } else {
        paramBoolean1 = false;
      }
      d4 = d10;
      if (paramBoolean2 != paramBoolean1) {
        if (bool) {
          d4 = d10 - 6.283185307179586D;
        } else {
          d4 = d10 + 6.283185307179586D;
        }
      }
      double d18 = d11 * d7;
      double d19 = d8 * d9;
      d11 = d18 * d2 - d19 * d3;
      int i = (int)Math.ceil(Math.abs(d4 * 4.0D / 3.141592653589793D));
      d13 = Math.cos(d1);
      double d20 = Math.sin(d1);
      d12 = Math.cos(d14);
      d1 = Math.sin(d14);
      d8 = -d7;
      double d21 = d8 * d13;
      double d22 = d9 * d20;
      d10 = d21 * d1 - d22 * d12;
      d15 = d8 * d20;
      d8 = d9 * d13;
      d1 = d12 * d8 + d1 * d15;
      d16 = d4 / i;
      int j = 0;
      d4 = d8;
      d12 = d5;
      d9 = d6;
      d6 = d7;
      d5 = d13;
      d8 = d15;
      d7 = d16;
      while (j < i)
      {
        double d23 = d14 + d7;
        d17 = Math.sin(d23);
        double d24 = Math.cos(d23);
        d15 = d6 * d5 * d24 + d11 - d22 * d17;
        d13 = d4 * d17 + (d6 * d20 * d24 + (d19 * d2 + d18 * d3));
        d16 = d21 * d17 - d22 * d24;
        d17 = d24 * d4 + d17 * d8;
        d24 = d23 - d14;
        d14 = Math.tan(d24 / 2.0D);
        d24 = Math.sin(d24);
        d14 = (Math.sqrt(d14 * 3.0D * d14 + 4.0D) - 1.0D) * d24 / 3.0D;
        paramPath.rLineTo(0.0F, 0.0F);
        paramPath.cubicTo((float)(d10 * d14 + d9), (float)(d1 * d14 + d12), (float)(d15 - d14 * d16), (float)(d13 - d14 * d17), (float)d15, (float)d13);
        j++;
        d14 = d23;
        d1 = d17;
        d10 = d16;
        d9 = d15;
        d12 = d13;
      }
    }
    
    @Deprecated
    public static void b(a[] paramArrayOfa, Path paramPath)
    {
      float[] arrayOfFloat1 = new float[6];
      int i = paramArrayOfa.length;
      int j = 0;
      int k = 109;
      while (j < i)
      {
        a locala = paramArrayOfa[j];
        int m = a;
        float[] arrayOfFloat2 = b;
        float f1 = arrayOfFloat1[0];
        float f2 = arrayOfFloat1[1];
        float f3 = arrayOfFloat1[2];
        float f4 = arrayOfFloat1[3];
        float f5 = arrayOfFloat1[4];
        float f6 = arrayOfFloat1[5];
        switch (m)
        {
        default: 
          break;
        case 90: 
        case 122: 
          paramPath.close();
          paramPath.moveTo(f5, f6);
          f1 = f5;
          f3 = f1;
          f2 = f6;
          f4 = f2;
          break;
        case 81: 
        case 83: 
        case 113: 
        case 115: 
          n = 4;
          break;
        case 72: 
        case 86: 
        case 104: 
        case 118: 
          n = 1;
          break;
        case 67: 
        case 99: 
          n = 6;
          break;
        case 65: 
        case 97: 
          n = 7;
          break;
        }
        int n = 2;
        float f7 = f5;
        f5 = f6;
        f6 = f1;
        f1 = f2;
        int i1 = 0;
        f2 = f6;
        int i2 = j;
        j = i1;
        while (j < arrayOfFloat2.length)
        {
          float f8;
          int i3;
          float f10;
          float[] arrayOfFloat3;
          label916:
          label1262:
          label1292:
          label1572:
          label1595:
          boolean bool1;
          boolean bool2;
          if (m != 65)
          {
            int i4;
            if (m != 67)
            {
              if (m != 72)
              {
                if (m != 81)
                {
                  if (m != 86)
                  {
                    if (m != 97)
                    {
                      if (m != 99)
                      {
                        if (m != 104)
                        {
                          if (m != 113)
                          {
                            if (m != 118)
                            {
                              if (m != 76)
                              {
                                if (m != 77)
                                {
                                  if (m != 83)
                                  {
                                    if (m != 84)
                                    {
                                      if (m != 108)
                                      {
                                        if (m != 109)
                                        {
                                          if (m != 115)
                                          {
                                            if (m == 116)
                                            {
                                              if ((k != 113) && (k != 116) && (k != 81) && (k != 84))
                                              {
                                                f4 = 0.0F;
                                                f3 = 0.0F;
                                              }
                                              else
                                              {
                                                f3 = f2 - f3;
                                                f4 = f1 - f4;
                                              }
                                              i1 = j + 0;
                                              f6 = arrayOfFloat2[i1];
                                              k = j + 1;
                                              paramPath.rQuadTo(f3, f4, f6, arrayOfFloat2[k]);
                                              f8 = f2 + arrayOfFloat2[i1];
                                              f6 = f1 + arrayOfFloat2[k];
                                              f4 += f1;
                                              f3 += f2;
                                              f2 = f8;
                                              f1 = f6;
                                            }
                                            break label1595;
                                          }
                                          if ((k != 99) && (k != 115) && (k != 67) && (k != 83))
                                          {
                                            f3 = 0.0F;
                                            f4 = 0.0F;
                                          }
                                          else
                                          {
                                            f3 = f2 - f3;
                                            f4 = f1 - f4;
                                          }
                                          i1 = j + 0;
                                          float f9 = arrayOfFloat2[i1];
                                          i3 = j + 1;
                                          f8 = arrayOfFloat2[i3];
                                          k = j + 2;
                                          f10 = arrayOfFloat2[k];
                                          i4 = j + 3;
                                          f6 = arrayOfFloat2[i4];
                                          arrayOfFloat3 = arrayOfFloat2;
                                          paramPath.rCubicTo(f3, f4, f9, f8, f10, f6);
                                          f3 = arrayOfFloat3[i1] + f2;
                                          f6 = arrayOfFloat3[i3] + f1;
                                          f4 = f2 + arrayOfFloat3[k];
                                          f8 = arrayOfFloat3[i4];
                                          f2 = f6;
                                          f6 = f8;
                                          break label1572;
                                        }
                                        k = j;
                                        arrayOfFloat3 = arrayOfFloat2;
                                        f6 = arrayOfFloat3[(k + 0)];
                                        f2 += f6;
                                        f8 = arrayOfFloat3[(k + 1)];
                                        f1 += f8;
                                        if (k > 0)
                                        {
                                          paramPath.rLineTo(f6, f8);
                                          break label1595;
                                        }
                                        paramPath.rMoveTo(f6, f8);
                                      }
                                      else
                                      {
                                        k = j;
                                        arrayOfFloat3 = arrayOfFloat2;
                                        i1 = k + 0;
                                        f6 = arrayOfFloat3[i1];
                                        k++;
                                        paramPath.rLineTo(f6, arrayOfFloat3[k]);
                                        f2 += arrayOfFloat3[i1];
                                        f6 = arrayOfFloat3[k];
                                        break label1292;
                                      }
                                    }
                                    else
                                    {
                                      i1 = j;
                                      arrayOfFloat3 = arrayOfFloat2;
                                      if ((k != 113) && (k != 116) && (k != 81) && (k != 84)) {
                                        break label916;
                                      }
                                      f2 = f2 * 2.0F - f3;
                                      f1 = f1 * 2.0F - f4;
                                      k = i1 + 0;
                                      f3 = arrayOfFloat3[k];
                                      i1++;
                                      paramPath.quadTo(f2, f1, f3, arrayOfFloat3[i1]);
                                      f4 = arrayOfFloat3[k];
                                      f6 = arrayOfFloat3[i1];
                                      f3 = f2;
                                      f2 = f4;
                                      f4 = f1;
                                      f1 = f6;
                                      break label2189;
                                    }
                                  }
                                  else
                                  {
                                    i1 = j;
                                    arrayOfFloat3 = arrayOfFloat2;
                                    if ((k != 99) && (k != 115) && (k != 67) && (k != 83))
                                    {
                                      f3 = f2;
                                      f2 = f1;
                                      f1 = f3;
                                    }
                                    else
                                    {
                                      f1 = f1 * 2.0F - f4;
                                      f3 = f2 * 2.0F - f3;
                                      f2 = f1;
                                      f1 = f3;
                                    }
                                    k = i1 + 0;
                                    f4 = arrayOfFloat3[k];
                                    i3 = i1 + 1;
                                    f3 = arrayOfFloat3[i3];
                                    i4 = i1 + 2;
                                    f6 = arrayOfFloat3[i4];
                                    i1 += 3;
                                    paramPath.cubicTo(f1, f2, f4, f3, f6, arrayOfFloat3[i1]);
                                    f3 = arrayOfFloat3[k];
                                    f4 = arrayOfFloat3[i3];
                                    f2 = arrayOfFloat3[i4];
                                    f1 = arrayOfFloat3[i1];
                                    break label1595;
                                  }
                                }
                                else
                                {
                                  k = j;
                                  arrayOfFloat3 = arrayOfFloat2;
                                  f2 = arrayOfFloat3[(k + 0)];
                                  f1 = arrayOfFloat3[(k + 1)];
                                  if (k > 0)
                                  {
                                    paramPath.lineTo(f2, f1);
                                    break label1262;
                                  }
                                  paramPath.moveTo(f2, f1);
                                }
                                f5 = f1;
                                f7 = f2;
                                break label2189;
                              }
                              else
                              {
                                k = j;
                                arrayOfFloat3 = arrayOfFloat2;
                                i1 = k + 0;
                                f1 = arrayOfFloat3[i1];
                                k++;
                                paramPath.lineTo(f1, arrayOfFloat3[k]);
                                f2 = arrayOfFloat3[i1];
                                f1 = arrayOfFloat3[k];
                              }
                              break label1595;
                            }
                            else
                            {
                              arrayOfFloat3 = arrayOfFloat2;
                              k = j + 0;
                              paramPath.rLineTo(0.0F, arrayOfFloat3[k]);
                              f6 = arrayOfFloat3[k];
                            }
                            f1 += f6;
                            break label1595;
                          }
                          else
                          {
                            k = j;
                            arrayOfFloat3 = arrayOfFloat2;
                            i1 = k + 0;
                            f4 = arrayOfFloat3[i1];
                            i3 = k + 1;
                            f6 = arrayOfFloat3[i3];
                            i4 = k + 2;
                            f3 = arrayOfFloat3[i4];
                            k += 3;
                            paramPath.rQuadTo(f4, f6, f3, arrayOfFloat3[k]);
                            f3 = arrayOfFloat3[i1] + f2;
                            f8 = arrayOfFloat3[i3] + f1;
                            f4 = f2 + arrayOfFloat3[i4];
                            f6 = arrayOfFloat3[k];
                            f2 = f8;
                          }
                        }
                        else
                        {
                          arrayOfFloat3 = arrayOfFloat2;
                          k = j + 0;
                          paramPath.rLineTo(arrayOfFloat3[k], 0.0F);
                          f2 += arrayOfFloat3[k];
                          break label1595;
                        }
                      }
                      else
                      {
                        k = j;
                        arrayOfFloat3 = arrayOfFloat2;
                        f10 = arrayOfFloat3[(k + 0)];
                        f8 = arrayOfFloat3[(k + 1)];
                        i4 = k + 2;
                        f6 = arrayOfFloat3[i4];
                        i1 = k + 3;
                        f3 = arrayOfFloat3[i1];
                        i3 = k + 4;
                        f4 = arrayOfFloat3[i3];
                        k += 5;
                        paramPath.rCubicTo(f10, f8, f6, f3, f4, arrayOfFloat3[k]);
                        f3 = arrayOfFloat3[i4] + f2;
                        f8 = arrayOfFloat3[i1] + f1;
                        f4 = f2 + arrayOfFloat3[i3];
                        f6 = arrayOfFloat3[k];
                        f2 = f8;
                      }
                      f6 = f1 + f6;
                      f1 = f2;
                      f2 = f4;
                      f4 = f1;
                      f1 = f6;
                      break label2189;
                    }
                    k = j;
                    arrayOfFloat3 = arrayOfFloat2;
                    i3 = k + 5;
                    f10 = arrayOfFloat3[i3];
                    i1 = k + 6;
                    f8 = arrayOfFloat3[i1];
                    f6 = arrayOfFloat3[(k + 0)];
                    f3 = arrayOfFloat3[(k + 1)];
                    f4 = arrayOfFloat3[(k + 2)];
                    if (arrayOfFloat3[(k + 3)] != 0.0F) {
                      bool1 = true;
                    } else {
                      bool1 = false;
                    }
                    if (arrayOfFloat3[(k + 4)] != 0.0F) {
                      bool2 = true;
                    } else {
                      bool2 = false;
                    }
                    a(paramPath, f2, f1, f10 + f2, f8 + f1, f6, f3, f4, bool1, bool2);
                    f2 += arrayOfFloat3[i3];
                    f1 += arrayOfFloat3[i1];
                    break label2181;
                  }
                  arrayOfFloat3 = arrayOfFloat2;
                  k = j + 0;
                  paramPath.lineTo(f2, arrayOfFloat3[k]);
                  f1 = arrayOfFloat3[k];
                  break label2189;
                }
                k = j;
                arrayOfFloat3 = arrayOfFloat2;
                i4 = k + 0;
                f3 = arrayOfFloat3[i4];
                i1 = k + 1;
                f1 = arrayOfFloat3[i1];
                i3 = k + 2;
                f2 = arrayOfFloat3[i3];
                k += 3;
                paramPath.quadTo(f3, f1, f2, arrayOfFloat3[k]);
                f4 = arrayOfFloat3[i4];
                f3 = arrayOfFloat3[i1];
                f2 = arrayOfFloat3[i3];
                f1 = arrayOfFloat3[k];
              }
              else
              {
                arrayOfFloat3 = arrayOfFloat2;
                k = j + 0;
                paramPath.lineTo(arrayOfFloat3[k], f1);
                f2 = arrayOfFloat3[k];
                break label2189;
              }
            }
            else
            {
              k = j;
              arrayOfFloat3 = arrayOfFloat2;
              f1 = arrayOfFloat3[(k + 0)];
              f2 = arrayOfFloat3[(k + 1)];
              i3 = k + 2;
              f4 = arrayOfFloat3[i3];
              i4 = k + 3;
              f6 = arrayOfFloat3[i4];
              i1 = k + 4;
              f3 = arrayOfFloat3[i1];
              k += 5;
              paramPath.cubicTo(f1, f2, f4, f6, f3, arrayOfFloat3[k]);
              f2 = arrayOfFloat3[i1];
              f1 = arrayOfFloat3[k];
              f4 = arrayOfFloat3[i3];
              f3 = arrayOfFloat3[i4];
            }
            f6 = f3;
            f3 = f4;
            f4 = f6;
            break label2189;
          }
          else
          {
            k = j;
            arrayOfFloat3 = arrayOfFloat2;
            i1 = k + 5;
            f10 = arrayOfFloat3[i1];
            i3 = k + 6;
            f6 = arrayOfFloat3[i3];
            f3 = arrayOfFloat3[(k + 0)];
            f8 = arrayOfFloat3[(k + 1)];
            f4 = arrayOfFloat3[(k + 2)];
            if (arrayOfFloat3[(k + 3)] != 0.0F) {
              bool1 = true;
            } else {
              bool1 = false;
            }
            if (arrayOfFloat3[(k + 4)] != 0.0F) {
              bool2 = true;
            } else {
              bool2 = false;
            }
            a(paramPath, f2, f1, f10, f6, f3, f8, f4, bool1, bool2);
            f2 = arrayOfFloat3[i1];
            f1 = arrayOfFloat3[i3];
          }
          label2181:
          f4 = f1;
          f3 = f2;
          label2189:
          j += n;
          i1 = i2;
          i2 = m;
          k = m;
          m = i2;
          i2 = i1;
        }
        arrayOfFloat1[0] = f2;
        arrayOfFloat1[1] = f1;
        arrayOfFloat1[2] = f3;
        arrayOfFloat1[3] = f4;
        arrayOfFloat1[4] = f7;
        arrayOfFloat1[5] = f5;
        k = a;
        j = i2 + 1;
      }
    }
  }
}

/* Location:
 * Qualified Name:     x.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */