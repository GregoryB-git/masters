package w;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import b.a0;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class b
{
  public static final ThreadLocal<TypedValue> a = new ThreadLocal();
  
  public static ColorStateList a(Resources paramResources, XmlResourceParser paramXmlResourceParser, Resources.Theme paramTheme)
  {
    AttributeSet localAttributeSet = Xml.asAttributeSet(paramXmlResourceParser);
    int i;
    do
    {
      i = paramXmlResourceParser.next();
    } while ((i != 2) && (i != 1));
    if (i == 2) {
      return b(paramResources, paramXmlResourceParser, localAttributeSet, paramTheme);
    }
    throw new XmlPullParserException("No start tag found");
  }
  
  public static ColorStateList b(Resources paramResources, XmlResourceParser paramXmlResourceParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    Object localObject1 = paramXmlResourceParser.getName();
    if (((String)localObject1).equals("selector"))
    {
      int i = paramXmlResourceParser.getDepth();
      int j = 1;
      i++;
      localObject1 = new int[20][];
      Object localObject2 = new int[20];
      int m = 0;
      for (;;)
      {
        Object localObject3 = paramTheme;
        Object localObject4 = paramAttributeSet;
        Object localObject5 = paramResources;
        int n = paramXmlResourceParser.next();
        if (n == j) {
          break;
        }
        int i2 = paramXmlResourceParser.getDepth();
        if ((i2 < i) && (n == 3)) {
          break;
        }
        Object localObject7;
        Object localObject8;
        if ((n == 2) && (i2 <= i) && (paramXmlResourceParser.getName().equals("item")))
        {
          localObject6 = a0.a0;
          if (localObject3 == null) {
            localObject6 = ((Resources)localObject5).obtainAttributes((AttributeSet)localObject4, (int[])localObject6);
          } else {
            localObject6 = ((Resources.Theme)localObject3).obtainStyledAttributes((AttributeSet)localObject4, (int[])localObject6, 0, 0);
          }
          i2 = ((TypedArray)localObject6).getResourceId(0, -1);
          if (i2 != -1)
          {
            localObject7 = a;
            localObject8 = (TypedValue)((ThreadLocal)localObject7).get();
            if (localObject8 == null)
            {
              localObject8 = new TypedValue();
              ((ThreadLocal)localObject7).set(localObject8);
            }
            ((Resources)localObject5).getValue(i2, (TypedValue)localObject8, j);
            i1 = type;
            if ((i1 >= 28) && (i1 <= 31)) {
              i1 = j;
            } else {
              i1 = 0;
            }
            if (i1 != 0) {}
          }
        }
        try
        {
          i1 = a((Resources)localObject5, ((Resources)localObject5).getXml(i2), (Resources.Theme)localObject3).getDefaultColor();
        }
        catch (Exception localException)
        {
          float f1;
          int k;
          float f2;
          int i3;
          int i4;
          int i5;
          float f3;
          float f4;
          float f5;
          for (;;) {}
        }
        int i1 = ((TypedArray)localObject6).getColor(0, -65281);
        if (((TypedArray)localObject6).hasValue(j)) {
          f1 = ((TypedArray)localObject6).getFloat(j, 1.0F);
        } else if (((TypedArray)localObject6).hasValue(3)) {
          f1 = ((TypedArray)localObject6).getFloat(3, 1.0F);
        } else {
          f1 = 1.0F;
        }
        if ((Build.VERSION.SDK_INT >= 31) && (((TypedArray)localObject6).hasValue(2))) {
          k = 2;
        } else {
          k = 4;
        }
        f2 = ((TypedArray)localObject6).getFloat(k, -1.0F);
        ((TypedArray)localObject6).recycle();
        i3 = paramAttributeSet.getAttributeCount();
        Object localObject6 = new int[i3];
        i2 = 0;
        k = i2;
        while (k < i3)
        {
          i4 = ((AttributeSet)localObject4).getAttributeNameResource(k);
          i5 = i2;
          if (i4 != 16843173)
          {
            i5 = i2;
            if (i4 != 16843551)
            {
              i5 = i2;
              if (i4 != 2130968621)
              {
                i5 = i2;
                if (i4 != 2130968762)
                {
                  if (((AttributeSet)localObject4).getAttributeBooleanValue(k, false)) {
                    i5 = i4;
                  } else {
                    i5 = -i4;
                  }
                  localObject6[i2] = i5;
                  i5 = i2 + 1;
                }
              }
            }
          }
          k++;
          i2 = i5;
        }
        localObject3 = StateSet.trimStateSet((int[])localObject6, i2);
        if ((f2 >= 0.0F) && (f2 <= 100.0F)) {
          i2 = 1;
        } else {
          i2 = 0;
        }
        if ((f1 != 1.0F) || (i2 != 0))
        {
          k = (int)(Color.alpha(i1) * f1 + 0.5F);
          i5 = 255;
          if (k < 0) {
            k = 0;
          } else if (k > 255) {
            k = i5;
          }
          if (i2 != 0)
          {
            localObject6 = a.a(i1);
            f1 = a;
            f3 = b;
            localObject5 = l.k;
            if (f3 >= 1.0D) {
              if ((Math.round(f2) > 0.0D) && (Math.round(f2) < 100.0D))
              {
                if (f1 < 0.0F) {
                  f4 = 0.0F;
                } else {
                  f4 = Math.min(360.0F, f1);
                }
                f5 = f3;
                localObject6 = null;
                f1 = 0.0F;
                i1 = 1;
                while (Math.abs(f1 - f3) >= 0.4F)
                {
                  float f6 = 100.0F;
                  float f7 = 1000.0F;
                  float f8 = f7;
                  float f9 = 0.0F;
                  localObject8 = null;
                  while (Math.abs(f9 - f6) > 0.01F)
                  {
                    float f10 = (f6 - f9) / 2.0F + f9;
                    i2 = a.b(f10, f5, f4).c(l.k);
                    float f11 = yc.b.b(Color.red(i2));
                    float f12 = yc.b.b(Color.green(i2));
                    float f13 = yc.b.b(Color.blue(i2));
                    localObject4 = yc.b.e[1];
                    float f14 = localObject4[0];
                    float f15 = localObject4[1];
                    f15 = (f13 * localObject4[2] + (f12 * f15 + f11 * f14)) / 100.0F;
                    if (f15 <= 0.008856452F) {
                      f12 = f15 * 903.2963F;
                    } else {
                      f12 = (float)Math.cbrt(f15) * 116.0F - 16.0F;
                    }
                    f14 = Math.abs(f2 - f12);
                    if (f14 < 0.2F)
                    {
                      localObject4 = a.a(i2);
                      localObject7 = a.b(c, b, f4);
                      f15 = d - d;
                      f13 = e - e;
                      f11 = f - f;
                      f13 = (float)(Math.pow(Math.sqrt(f11 * f11 + (f13 * f13 + f15 * f15)), 0.63D) * 1.41D);
                      f15 = f8;
                      if (f13 <= 1.0F)
                      {
                        localObject8 = localObject4;
                        f15 = f13;
                        f7 = f14;
                      }
                    }
                    else
                    {
                      f15 = f8;
                    }
                    f8 = f10;
                    if ((f7 == 0.0F) && (f15 == 0.0F)) {
                      break;
                    }
                    if (f12 < f2) {
                      f9 = f8;
                    } else {
                      f6 = f8;
                    }
                    f8 = f15;
                  }
                  if (i1 != 0)
                  {
                    if (localObject8 != null)
                    {
                      i1 = ((a)localObject8).c((l)localObject5);
                      break label1372;
                    }
                    f5 = (f3 - f1) / 2.0F + f1;
                    i1 = 0;
                  }
                  else
                  {
                    if (localObject8 == null)
                    {
                      f3 = f5;
                    }
                    else
                    {
                      localObject6 = localObject8;
                      f1 = f5;
                    }
                    f5 = (f3 - f1) / 2.0F + f1;
                  }
                }
                if (localObject6 != null)
                {
                  i1 = ((a)localObject6).c((l)localObject5);
                  break label1372;
                }
              }
              else {}
            }
            if (f2 < 1.0F)
            {
              i1 = -16777216;
            }
            else if (f2 > 99.0F)
            {
              i1 = -1;
            }
            else
            {
              f3 = (f2 + 16.0F) / 116.0F;
              if (f2 > 8.0F) {
                i1 = 1;
              } else {
                i1 = 0;
              }
              if (i1 != 0) {
                f1 = f3 * f3 * f3;
              } else {
                f1 = f2 / 903.2963F;
              }
              f5 = f3 * f3 * f3;
              if (f5 > 0.008856452F) {
                i1 = 1;
              } else {
                i1 = 0;
              }
              if (i1 != 0) {
                f4 = f5;
              } else {
                f4 = (f3 * 116.0F - 16.0F) / 903.2963F;
              }
              if (i1 == 0) {
                f5 = (f3 * 116.0F - 16.0F) / 903.2963F;
              }
              localObject6 = yc.b.d;
              i1 = x.a.a(f4 * localObject6[0], f1 * localObject6[1], f5 * localObject6[2]);
            }
          }
          label1372:
          i1 = 0xFFFFFF & i1 | k << 24;
        }
        i2 = 1;
        i5 = m + 1;
        localObject6 = localObject2;
        k = localObject6.length;
        i4 = 8;
        localObject2 = localObject6;
        if (i5 > k)
        {
          if (m <= 4) {
            k = 8;
          } else {
            k = m * 2;
          }
          localObject2 = new int[k];
          System.arraycopy(localObject6, 0, localObject2, 0, m);
        }
        localObject2[m] = i1;
        localObject6 = localObject1;
        if (i5 > localObject1.length)
        {
          localObject6 = localObject1.getClass().getComponentType();
          if (m <= 4) {
            i1 = i4;
          } else {
            i1 = m * 2;
          }
          localObject6 = (Object[])Array.newInstance((Class)localObject6, i1);
          System.arraycopy(localObject1, 0, localObject6, 0, m);
        }
        localObject6[m] = localObject3;
        localObject1 = (int[][])localObject6;
        m = i5;
        i1 = i2;
        break label1555;
        i1 = k;
        label1555:
        k = i1;
      }
      paramXmlResourceParser = new int[m];
      paramResources = new int[m][];
      System.arraycopy(localObject2, 0, paramXmlResourceParser, 0, m);
      System.arraycopy(localObject1, 0, paramResources, 0, m);
      return new ColorStateList(paramResources, paramXmlResourceParser);
    }
    paramResources = new StringBuilder();
    paramResources.append(paramXmlResourceParser.getPositionDescription());
    paramResources.append(": invalid color state list tag ");
    paramResources.append((String)localObject1);
    throw new XmlPullParserException(paramResources.toString());
  }
}

/* Location:
 * Qualified Name:     w.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */