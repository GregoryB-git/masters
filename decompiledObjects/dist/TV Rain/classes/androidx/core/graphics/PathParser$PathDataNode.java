package androidx.core.graphics;

import android.graphics.Path;
import android.util.Log;

public class PathParser$PathDataNode
{
  public float[] mParams;
  public char mType;
  
  public PathParser$PathDataNode(char paramChar, float[] paramArrayOfFloat)
  {
    mType = ((char)paramChar);
    mParams = paramArrayOfFloat;
  }
  
  public PathParser$PathDataNode(PathDataNode paramPathDataNode)
  {
    mType = ((char)mType);
    paramPathDataNode = mParams;
    mParams = PathParser.copyOfRange(paramPathDataNode, 0, paramPathDataNode.length);
  }
  
  private static void addCommand(Path paramPath, float[] paramArrayOfFloat1, char paramChar1, char paramChar2, float[] paramArrayOfFloat2)
  {
    float f1 = paramArrayOfFloat1[0];
    float f2 = paramArrayOfFloat1[1];
    float f3 = paramArrayOfFloat1[2];
    float f4 = paramArrayOfFloat1[3];
    float f5 = paramArrayOfFloat1[4];
    float f6 = paramArrayOfFloat1[5];
    float f7 = f1;
    float f8 = f2;
    float f9 = f3;
    float f10 = f4;
    char c1;
    switch (paramChar2)
    {
    default: 
      f10 = f4;
      f9 = f3;
      f8 = f2;
      f7 = f1;
    case 'L': 
    case 'M': 
    case 'T': 
    case 'l': 
    case 'm': 
    case 't': 
    case 'Z': 
    case 'z': 
      for (;;)
      {
        c1 = '\002';
        break;
        paramPath.close();
        paramPath.moveTo(f5, f6);
        f7 = f5;
        f9 = f7;
        f8 = f6;
        f10 = f8;
      }
    case 'Q': 
    case 'S': 
    case 'q': 
    case 's': 
      c1 = '\004';
      f7 = f1;
      f8 = f2;
      f9 = f3;
      f10 = f4;
      break;
    case 'H': 
    case 'V': 
    case 'h': 
    case 'v': 
      c1 = '\001';
      f7 = f1;
      f8 = f2;
      f9 = f3;
      f10 = f4;
      break;
    case 'C': 
    case 'c': 
      c1 = '\006';
      break;
    case 'A': 
    case 'a': 
      c1 = '\007';
    }
    f10 = f4;
    f9 = f3;
    f8 = f2;
    f7 = f1;
    char c2 = '\000';
    int i = paramChar1;
    f4 = f6;
    f3 = f5;
    paramChar1 = c2;
    for (;;)
    {
      c2 = paramChar2;
      if (paramChar1 >= paramArrayOfFloat2.length) {
        break;
      }
      int j;
      label1191:
      label1517:
      label1528:
      boolean bool1;
      boolean bool2;
      if (c2 != 'A')
      {
        int k;
        if (c2 != 'C')
        {
          if (c2 != 'H')
          {
            if (c2 != 'Q')
            {
              if (c2 != 'V')
              {
                if (c2 != 'a')
                {
                  if (c2 != 'c') {
                    if (c2 != 'h') {
                      if (c2 != 'q') {
                        if (c2 != 'v') {
                          if (c2 != 'L') {
                            if (c2 != 'M') {
                              if (c2 != 'S') {
                                if (c2 != 'T') {
                                  if (c2 != 'l') {
                                    if (c2 != 'm') {
                                      if (c2 != 's') {
                                        if (c2 != 't') {
                                          break label2082;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  for (;;)
                  {
                    if ((i != 113) && (i != 116) && (i != 81) && (i != 84))
                    {
                      f10 = 0.0F;
                      f9 = 0.0F;
                    }
                    else
                    {
                      f9 = f7 - f9;
                      f10 = f8 - f10;
                    }
                    c2 = paramChar1 + '\000';
                    f6 = paramArrayOfFloat2[c2];
                    i = paramChar1 + '\001';
                    paramPath.rQuadTo(f9, f10, f6, paramArrayOfFloat2[i]);
                    f6 = f7 + paramArrayOfFloat2[c2];
                    f5 = f8 + paramArrayOfFloat2[i];
                    f10 += f8;
                    f9 += f7;
                    f8 = f5;
                    f7 = f6;
                    continue;
                    if ((i != 99) && (i != 115) && (i != 67) && (i != 83))
                    {
                      f9 = 0.0F;
                      f10 = 0.0F;
                    }
                    else
                    {
                      f10 = f8 - f10;
                      f9 = f7 - f9;
                    }
                    i = paramChar1 + '\000';
                    f6 = paramArrayOfFloat2[i];
                    j = paramChar1 + '\001';
                    f5 = paramArrayOfFloat2[j];
                    k = paramChar1 + '\002';
                    f1 = paramArrayOfFloat2[k];
                    c2 = paramChar1 + '\003';
                    paramPath.rCubicTo(f9, f10, f6, f5, f1, paramArrayOfFloat2[c2]);
                    f5 = paramArrayOfFloat2[i] + f7;
                    f9 = paramArrayOfFloat2[j] + f8;
                    f10 = f7 + paramArrayOfFloat2[k];
                    f6 = paramArrayOfFloat2[c2];
                    f7 = f5;
                    break label1517;
                    f6 = paramArrayOfFloat2[(paramChar1 + '\000')];
                    f7 += f6;
                    f5 = paramArrayOfFloat2[(paramChar1 + '\001')];
                    f8 += f5;
                    if (paramChar1 > 0)
                    {
                      paramPath.rLineTo(f6, f5);
                    }
                    else
                    {
                      paramPath.rMoveTo(f6, f5);
                      break label1191;
                      i = paramChar1 + '\000';
                      f6 = paramArrayOfFloat2[i];
                      c2 = paramChar1 + '\001';
                      paramPath.rLineTo(f6, paramArrayOfFloat2[c2]);
                      f7 += paramArrayOfFloat2[i];
                      for (f6 = paramArrayOfFloat2[c2];; f6 = paramArrayOfFloat2[i])
                      {
                        f8 += f6;
                        break;
                        if ((i != 113) && (i != 116) && (i != 81))
                        {
                          f5 = f8;
                          f6 = f7;
                          if (i != 84) {}
                        }
                        else
                        {
                          f6 = f7 * 2.0F - f9;
                          f5 = f8 * 2.0F - f10;
                        }
                        c2 = paramChar1 + '\000';
                        f7 = paramArrayOfFloat2[c2];
                        i = paramChar1 + '\001';
                        paramPath.quadTo(f6, f5, f7, paramArrayOfFloat2[i]);
                        f7 = paramArrayOfFloat2[c2];
                        f8 = paramArrayOfFloat2[i];
                        f10 = f5;
                        f9 = f6;
                        break;
                        if ((i != 99) && (i != 115) && (i != 67))
                        {
                          f5 = f8;
                          f6 = f7;
                          if (i != 83) {}
                        }
                        else
                        {
                          f6 = f7 * 2.0F - f9;
                          f5 = f8 * 2.0F - f10;
                        }
                        c2 = paramChar1 + '\000';
                        f9 = paramArrayOfFloat2[c2];
                        k = paramChar1 + '\001';
                        f7 = paramArrayOfFloat2[k];
                        i = paramChar1 + '\002';
                        f8 = paramArrayOfFloat2[i];
                        j = paramChar1 + '\003';
                        paramPath.cubicTo(f6, f5, f9, f7, f8, paramArrayOfFloat2[j]);
                        f7 = paramArrayOfFloat2[c2];
                        f9 = paramArrayOfFloat2[k];
                        f6 = paramArrayOfFloat2[i];
                        f8 = paramArrayOfFloat2[j];
                        break label1528;
                        f7 = paramArrayOfFloat2[(paramChar1 + '\000')];
                        f8 = paramArrayOfFloat2[(paramChar1 + '\001')];
                        if (paramChar1 > 0)
                        {
                          paramPath.lineTo(f7, f8);
                          break;
                        }
                        paramPath.moveTo(f7, f8);
                        f4 = f8;
                        f3 = f7;
                        break;
                        i = paramChar1 + '\000';
                        f7 = paramArrayOfFloat2[i];
                        c2 = paramChar1 + '\001';
                        paramPath.lineTo(f7, paramArrayOfFloat2[c2]);
                        f7 = paramArrayOfFloat2[i];
                        f8 = paramArrayOfFloat2[c2];
                        break;
                        i = paramChar1 + '\000';
                        paramPath.rLineTo(0.0F, paramArrayOfFloat2[i]);
                      }
                      i = paramChar1 + '\000';
                      f9 = paramArrayOfFloat2[i];
                      j = paramChar1 + '\001';
                      f6 = paramArrayOfFloat2[j];
                      k = paramChar1 + '\002';
                      f10 = paramArrayOfFloat2[k];
                      c2 = paramChar1 + '\003';
                      paramPath.rQuadTo(f9, f6, f10, paramArrayOfFloat2[c2]);
                      f5 = paramArrayOfFloat2[i] + f7;
                      f9 = paramArrayOfFloat2[j] + f8;
                      f10 = f7 + paramArrayOfFloat2[k];
                      f6 = paramArrayOfFloat2[c2];
                      f7 = f5;
                      break label1517;
                      i = paramChar1 + '\000';
                      paramPath.rLineTo(paramArrayOfFloat2[i], 0.0F);
                      f7 += paramArrayOfFloat2[i];
                      continue;
                      f6 = paramArrayOfFloat2[(paramChar1 + '\000')];
                      f5 = paramArrayOfFloat2[(paramChar1 + '\001')];
                      i = paramChar1 + '\002';
                      f1 = paramArrayOfFloat2[i];
                      c2 = paramChar1 + '\003';
                      f10 = paramArrayOfFloat2[c2];
                      j = paramChar1 + '\004';
                      f9 = paramArrayOfFloat2[j];
                      k = paramChar1 + '\005';
                      paramPath.rCubicTo(f6, f5, f1, f10, f9, paramArrayOfFloat2[k]);
                      f5 = paramArrayOfFloat2[i] + f7;
                      f9 = paramArrayOfFloat2[c2] + f8;
                      f10 = f7 + paramArrayOfFloat2[j];
                      f6 = paramArrayOfFloat2[k];
                      f7 = f5;
                      f8 += f6;
                      f6 = f10;
                      f10 = f9;
                      f9 = f7;
                      f7 = f6;
                    }
                  }
                }
                i = paramChar1 + '\005';
                f9 = paramArrayOfFloat2[i];
                c2 = paramChar1 + '\006';
                f1 = paramArrayOfFloat2[c2];
                f6 = paramArrayOfFloat2[(paramChar1 + '\000')];
                f5 = paramArrayOfFloat2[(paramChar1 + '\001')];
                f10 = paramArrayOfFloat2[(paramChar1 + '\002')];
                if (paramArrayOfFloat2[(paramChar1 + '\003')] != 0.0F) {
                  bool1 = true;
                } else {
                  bool1 = false;
                }
                if (paramArrayOfFloat2[(paramChar1 + '\004')] != 0.0F) {
                  bool2 = true;
                } else {
                  bool2 = false;
                }
                drawArc(paramPath, f7, f8, f9 + f7, f1 + f8, f6, f5, f10, bool1, bool2);
                f7 += paramArrayOfFloat2[i];
                f8 += paramArrayOfFloat2[c2];
              }
              else
              {
                i = paramChar1 + '\000';
                paramPath.lineTo(f7, paramArrayOfFloat2[i]);
                f8 = paramArrayOfFloat2[i];
                break label2082;
              }
            }
            else
            {
              i = paramChar1;
              c2 = i + 0;
              f8 = paramArrayOfFloat2[c2];
              k = i + 1;
              f7 = paramArrayOfFloat2[k];
              j = i + 2;
              f9 = paramArrayOfFloat2[j];
              i += 3;
              paramPath.quadTo(f8, f7, f9, paramArrayOfFloat2[i]);
              f9 = paramArrayOfFloat2[c2];
              f10 = paramArrayOfFloat2[k];
              f7 = paramArrayOfFloat2[j];
              f8 = paramArrayOfFloat2[i];
              break label2082;
            }
          }
          else
          {
            i = paramChar1 + '\000';
            paramPath.lineTo(paramArrayOfFloat2[i], f8);
            f7 = paramArrayOfFloat2[i];
            break label2082;
          }
        }
        else
        {
          i = paramChar1;
          f9 = paramArrayOfFloat2[(i + 0)];
          f7 = paramArrayOfFloat2[(i + 1)];
          c2 = i + 2;
          f8 = paramArrayOfFloat2[c2];
          j = i + 3;
          f6 = paramArrayOfFloat2[j];
          k = i + 4;
          f10 = paramArrayOfFloat2[k];
          i += 5;
          paramPath.cubicTo(f9, f7, f8, f6, f10, paramArrayOfFloat2[i]);
          f7 = paramArrayOfFloat2[k];
          f8 = paramArrayOfFloat2[i];
          f9 = paramArrayOfFloat2[c2];
          f10 = paramArrayOfFloat2[j];
          break label2082;
        }
      }
      else
      {
        i = paramChar1;
        c2 = i + 5;
        f6 = paramArrayOfFloat2[c2];
        j = i + 6;
        f10 = paramArrayOfFloat2[j];
        f5 = paramArrayOfFloat2[(i + 0)];
        f1 = paramArrayOfFloat2[(i + 1)];
        f9 = paramArrayOfFloat2[(i + 2)];
        if (paramArrayOfFloat2[(i + 3)] != 0.0F) {
          bool1 = true;
        } else {
          bool1 = false;
        }
        if (paramArrayOfFloat2[(i + 4)] != 0.0F) {
          bool2 = true;
        } else {
          bool2 = false;
        }
        drawArc(paramPath, f7, f8, f6, f10, f5, f1, f9, bool1, bool2);
        f7 = paramArrayOfFloat2[c2];
        f8 = paramArrayOfFloat2[j];
      }
      f10 = f8;
      f9 = f7;
      label2082:
      paramChar1 += c1;
      i = paramChar2;
    }
    paramArrayOfFloat1[0] = f7;
    paramArrayOfFloat1[1] = f8;
    paramArrayOfFloat1[2] = f9;
    paramArrayOfFloat1[3] = f10;
    paramArrayOfFloat1[4] = f3;
    paramArrayOfFloat1[5] = f4;
  }
  
  private static void arcToBezier(Path paramPath, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, double paramDouble9)
  {
    int i = (int)Math.ceil(Math.abs(paramDouble9 * 4.0D / 3.141592653589793D));
    double d1 = Math.cos(paramDouble7);
    double d2 = Math.sin(paramDouble7);
    paramDouble7 = Math.cos(paramDouble8);
    double d3 = Math.sin(paramDouble8);
    double d4 = -paramDouble3;
    double d5 = d4 * d1;
    double d6 = paramDouble4 * d2;
    d4 *= d2;
    double d7 = paramDouble4 * d1;
    paramDouble9 /= i;
    paramDouble4 = paramDouble7 * d7 + d3 * d4;
    d3 = d5 * d3 - d6 * paramDouble7;
    int j = 0;
    paramDouble7 = paramDouble5;
    paramDouble5 = paramDouble4;
    double d8 = paramDouble8;
    paramDouble4 = d4;
    d4 = paramDouble9;
    paramDouble8 = d2;
    paramDouble9 = d1;
    for (;;)
    {
      d1 = paramDouble3;
      if (j >= i) {
        break;
      }
      double d9 = d8 + d4;
      double d10 = Math.sin(d9);
      double d11 = Math.cos(d9);
      double d12 = d1 * paramDouble9 * d11 + paramDouble1 - d6 * d10;
      d1 = d7 * d10 + (d1 * paramDouble8 * d11 + paramDouble2);
      d2 = d5 * d10 - d6 * d11;
      d10 = d11 * d7 + d10 * paramDouble4;
      d11 = d9 - d8;
      d8 = Math.tan(d11 / 2.0D);
      d11 = Math.sin(d11);
      d8 = (Math.sqrt(d8 * 3.0D * d8 + 4.0D) - 1.0D) * d11 / 3.0D;
      paramPath.rLineTo(0.0F, 0.0F);
      paramPath.cubicTo((float)(d3 * d8 + paramDouble7), (float)(paramDouble5 * d8 + paramDouble6), (float)(d12 - d8 * d2), (float)(d1 - d8 * d10), (float)d12, (float)d1);
      j++;
      paramDouble7 = d12;
      d8 = d9;
      paramDouble5 = d10;
      d3 = d2;
      paramDouble6 = d1;
    }
  }
  
  private static void drawArc(Path paramPath, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, boolean paramBoolean1, boolean paramBoolean2)
  {
    double d1 = Math.toRadians(paramFloat7);
    double d2 = Math.cos(d1);
    double d3 = Math.sin(d1);
    double d4 = paramFloat1;
    double d5 = paramFloat2;
    double d6 = paramFloat5;
    double d7 = (d5 * d3 + d4 * d2) / d6;
    double d8 = -paramFloat1;
    double d9 = paramFloat6;
    double d10 = (d5 * d2 + d8 * d3) / d9;
    double d11 = paramFloat3;
    d8 = paramFloat4;
    double d12 = (d8 * d3 + d11 * d2) / d6;
    double d13 = (d8 * d2 + -paramFloat3 * d3) / d9;
    double d14 = d7 - d12;
    double d15 = d10 - d13;
    d11 = (d7 + d12) / 2.0D;
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
      drawArc(paramPath, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5 * f, paramFloat6 * f, paramFloat7, paramBoolean1, paramBoolean2);
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
    d14 = Math.atan2(d10 - d8, d7 - d11);
    d10 = Math.atan2(d13 - d8, d12 - d11) - d14;
    boolean bool = d10 < 0.0D;
    if (!bool) {
      paramBoolean1 = true;
    } else {
      paramBoolean1 = false;
    }
    d7 = d10;
    if (paramBoolean2 != paramBoolean1) {
      if (bool) {
        d7 = d10 - 6.283185307179586D;
      } else {
        d7 = d10 + 6.283185307179586D;
      }
    }
    d11 *= d6;
    d8 *= d9;
    arcToBezier(paramPath, d11 * d2 - d8 * d3, d8 * d2 + d11 * d3, d6, d9, d4, d5, d1, d14, d7);
  }
  
  public static void nodesToPath(PathDataNode[] paramArrayOfPathDataNode, Path paramPath)
  {
    float[] arrayOfFloat = new float[6];
    char c1 = 'm';
    int i = 0;
    for (char c2 = c1; i < paramArrayOfPathDataNode.length; c2 = c1)
    {
      PathDataNode localPathDataNode = paramArrayOfPathDataNode[i];
      addCommand(paramPath, arrayOfFloat, c2, mType, mParams);
      c1 = mType;
      i++;
    }
  }
  
  public void interpolatePathDataNode(PathDataNode paramPathDataNode1, PathDataNode paramPathDataNode2, float paramFloat)
  {
    mType = ((char)mType);
    for (int i = 0;; i++)
    {
      float[] arrayOfFloat1 = mParams;
      if (i >= arrayOfFloat1.length) {
        break;
      }
      float[] arrayOfFloat2 = mParams;
      float f = arrayOfFloat1[i];
      arrayOfFloat2[i] = (mParams[i] * paramFloat + (1.0F - paramFloat) * f);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.graphics.PathParser.PathDataNode
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */