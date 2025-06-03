package w;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Xml;
import b.a0;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class c
{
  public final Shader a;
  public final ColorStateList b;
  public int c;
  
  public c(Shader paramShader, ColorStateList paramColorStateList, int paramInt)
  {
    a = paramShader;
    b = paramColorStateList;
    c = paramInt;
  }
  
  public static c a(Resources paramResources, int paramInt, Resources.Theme paramTheme)
  {
    Object localObject1 = paramResources.getXml(paramInt);
    AttributeSet localAttributeSet = Xml.asAttributeSet((XmlPullParser)localObject1);
    do
    {
      paramInt = ((XmlPullParser)localObject1).next();
    } while ((paramInt != 2) && (paramInt != 1));
    if (paramInt == 2)
    {
      Object localObject2 = ((XmlPullParser)localObject1).getName();
      localObject2.getClass();
      if (!((String)localObject2).equals("gradient"))
      {
        if (((String)localObject2).equals("selector"))
        {
          paramResources = b.b(paramResources, (XmlResourceParser)localObject1, localAttributeSet, paramTheme);
          return new c(null, paramResources, paramResources.getDefaultColor());
        }
        paramResources = new StringBuilder();
        paramResources.append(((XmlPullParser)localObject1).getPositionDescription());
        paramResources.append(": unsupported complex color tag ");
        paramResources.append((String)localObject2);
        throw new XmlPullParserException(paramResources.toString());
      }
      localObject2 = ((XmlPullParser)localObject1).getName();
      if (((String)localObject2).equals("gradient"))
      {
        localObject2 = k.f(paramResources, paramTheme, localAttributeSet, a0.d0);
        float f1 = k.b((TypedArray)localObject2, (XmlPullParser)localObject1, "startX", 8, 0.0F);
        float f2 = k.b((TypedArray)localObject2, (XmlPullParser)localObject1, "startY", 9, 0.0F);
        float f3 = k.b((TypedArray)localObject2, (XmlPullParser)localObject1, "endX", 10, 0.0F);
        float f4 = k.b((TypedArray)localObject2, (XmlPullParser)localObject1, "endY", 11, 0.0F);
        float f5 = k.b((TypedArray)localObject2, (XmlPullParser)localObject1, "centerX", 3, 0.0F);
        float f6 = k.b((TypedArray)localObject2, (XmlPullParser)localObject1, "centerY", 4, 0.0F);
        int i = k.c((TypedArray)localObject2, (XmlPullParser)localObject1, "type", 2, 0);
        if (!k.e((XmlPullParser)localObject1, "startColor")) {
          paramInt = 0;
        } else {
          paramInt = ((TypedArray)localObject2).getColor(0, 0);
        }
        boolean bool1 = k.e((XmlPullParser)localObject1, "centerColor");
        int j;
        if (!k.e((XmlPullParser)localObject1, "centerColor")) {
          j = 0;
        } else {
          j = ((TypedArray)localObject2).getColor(7, 0);
        }
        int k;
        if (!k.e((XmlPullParser)localObject1, "endColor")) {
          k = 0;
        } else {
          k = ((TypedArray)localObject2).getColor(1, 0);
        }
        int m = k.c((TypedArray)localObject2, (XmlPullParser)localObject1, "tileMode", 6, 0);
        float f7 = k.b((TypedArray)localObject2, (XmlPullParser)localObject1, "gradientRadius", 5, 0.0F);
        ((TypedArray)localObject2).recycle();
        int n = ((XmlPullParser)localObject1).getDepth() + 1;
        ArrayList localArrayList = new ArrayList(20);
        localObject2 = new ArrayList(20);
        for (;;)
        {
          int i1 = ((XmlPullParser)localObject1).next();
          if (i1 == 1) {
            break;
          }
          int i2 = ((XmlPullParser)localObject1).getDepth();
          if ((i2 < n) && (i1 == 3)) {
            break;
          }
          if ((i1 == 2) && (i2 <= n) && (((XmlPullParser)localObject1).getName().equals("item")))
          {
            TypedArray localTypedArray = k.f(paramResources, paramTheme, localAttributeSet, a0.e0);
            boolean bool2 = localTypedArray.hasValue(0);
            boolean bool3 = localTypedArray.hasValue(1);
            if ((bool2) && (bool3))
            {
              i2 = localTypedArray.getColor(0, 0);
              float f8 = localTypedArray.getFloat(1, 0.0F);
              localTypedArray.recycle();
              ((ArrayList)localObject2).add(Integer.valueOf(i2));
              localArrayList.add(Float.valueOf(f8));
            }
            else
            {
              paramResources = new StringBuilder();
              paramResources.append(((XmlPullParser)localObject1).getPositionDescription());
              paramResources.append(": <item> tag requires a 'color' attribute and a 'offset' attribute!");
              throw new XmlPullParserException(paramResources.toString());
            }
          }
        }
        if (((ArrayList)localObject2).size() > 0) {
          paramResources = new e((ArrayList)localObject2, localArrayList);
        } else {
          paramResources = null;
        }
        if (paramResources == null)
        {
          paramResources = new w/e;
          if (bool1) {
            paramResources.<init>(paramInt, j, k);
          } else {
            paramResources.<init>(paramInt, k);
          }
        }
        if (i != 1)
        {
          if (i != 2)
          {
            paramTheme = a;
            localObject1 = b;
            if (m != 1)
            {
              if (m != 2) {
                paramResources = Shader.TileMode.CLAMP;
              } else {
                paramResources = Shader.TileMode.MIRROR;
              }
            }
            else {
              paramResources = Shader.TileMode.REPEAT;
            }
            paramResources = new LinearGradient(f1, f2, f3, f4, paramTheme, (float[])localObject1, paramResources);
          }
          else
          {
            paramResources = new SweepGradient(f5, f6, a, b);
          }
        }
        else
        {
          if (f7 <= 0.0F) {
            break label825;
          }
          paramTheme = a;
          localObject1 = b;
          if (m != 1)
          {
            if (m != 2) {
              paramResources = Shader.TileMode.CLAMP;
            } else {
              paramResources = Shader.TileMode.MIRROR;
            }
          }
          else {
            paramResources = Shader.TileMode.REPEAT;
          }
          paramResources = new RadialGradient(f5, f6, f7, paramTheme, (float[])localObject1, paramResources);
        }
        return new c(paramResources, null, 0);
        label825:
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
      }
      paramResources = new StringBuilder();
      paramResources.append(((XmlPullParser)localObject1).getPositionDescription());
      paramResources.append(": invalid gradient color tag ");
      paramResources.append((String)localObject2);
      throw new XmlPullParserException(paramResources.toString());
    }
    throw new XmlPullParserException("No start tag found");
  }
  
  public final boolean b()
  {
    if (a == null)
    {
      ColorStateList localColorStateList = b;
      if ((localColorStateList != null) && (localColorStateList.isStateful())) {
        return true;
      }
    }
    boolean bool = false;
    return bool;
  }
}

/* Location:
 * Qualified Name:     w.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */