package z;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import v.d;

public abstract class c
{
  public static final ThreadLocal a = new ThreadLocal();
  
  public static ColorStateList a(Resources paramResources, XmlPullParser paramXmlPullParser, Resources.Theme paramTheme)
  {
    AttributeSet localAttributeSet = Xml.asAttributeSet(paramXmlPullParser);
    int i;
    do
    {
      i = paramXmlPullParser.next();
    } while ((i != 2) && (i != 1));
    if (i == 2) {
      return b(paramResources, paramXmlPullParser, localAttributeSet, paramTheme);
    }
    throw new XmlPullParserException("No start tag found");
  }
  
  public static ColorStateList b(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    String str = paramXmlPullParser.getName();
    if (str.equals("selector")) {
      return e(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    }
    paramResources = new StringBuilder();
    paramResources.append(paramXmlPullParser.getPositionDescription());
    paramResources.append(": invalid color state list tag ");
    paramResources.append(str);
    throw new XmlPullParserException(paramResources.toString());
  }
  
  public static TypedValue c()
  {
    ThreadLocal localThreadLocal = a;
    TypedValue localTypedValue1 = (TypedValue)localThreadLocal.get();
    TypedValue localTypedValue2 = localTypedValue1;
    if (localTypedValue1 == null)
    {
      localTypedValue2 = new TypedValue();
      localThreadLocal.set(localTypedValue2);
    }
    return localTypedValue2;
  }
  
  public static ColorStateList d(Resources paramResources, int paramInt, Resources.Theme paramTheme)
  {
    try
    {
      paramResources = a(paramResources, paramResources.getXml(paramInt), paramTheme);
      return paramResources;
    }
    catch (Exception paramResources)
    {
      Log.e("CSLCompat", "Failed to inflate ColorStateList.", paramResources);
    }
    return null;
  }
  
  public static ColorStateList e(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    int i = paramXmlPullParser.getDepth() + 1;
    Object localObject1 = new int[20][];
    Object localObject2 = new int[20];
    int n;
    for (int j = 0;; j = n)
    {
      Resources localResources = paramResources;
      int k = paramXmlPullParser.next();
      if (k == 1) {
        break;
      }
      int m = paramXmlPullParser.getDepth();
      if ((m < i) && (k == 3)) {
        break;
      }
      Object localObject3 = localObject2;
      Object localObject4 = localObject1;
      n = j;
      if (k == 2)
      {
        localObject3 = localObject2;
        localObject4 = localObject1;
        n = j;
        if (m <= i) {
          if (!paramXmlPullParser.getName().equals("item"))
          {
            localObject3 = localObject2;
            localObject4 = localObject1;
            n = j;
          }
          else
          {
            localObject4 = h(localResources, paramTheme, paramAttributeSet, d.b);
            n = ((TypedArray)localObject4).getResourceId(d.c, -1);
            if ((n == -1) || (f(localResources, n))) {}
          }
        }
      }
      try
      {
        n = a(localResources, localResources.getXml(n), paramTheme).getDefaultColor();
      }
      catch (Exception localException)
      {
        boolean bool;
        float f1;
        float f2;
        int i1;
        int i3;
        for (;;) {}
      }
      n = ((TypedArray)localObject4).getColor(d.c, -65281);
      bool = ((TypedArray)localObject4).hasValue(d.d);
      f1 = 1.0F;
      if (bool) {}
      for (k = d.d;; k = d.f)
      {
        f1 = ((TypedArray)localObject4).getFloat(k, 1.0F);
        break;
        if (!((TypedArray)localObject4).hasValue(d.f)) {
          break;
        }
      }
      if ((Build.VERSION.SDK_INT >= 31) && (((TypedArray)localObject4).hasValue(d.e))) {}
      for (k = d.e;; k = d.g)
      {
        f2 = ((TypedArray)localObject4).getFloat(k, -1.0F);
        break;
      }
      ((TypedArray)localObject4).recycle();
      i1 = paramAttributeSet.getAttributeCount();
      localObject4 = new int[i1];
      k = 0;
      for (m = 0; k < i1; m = i3)
      {
        int i2 = paramAttributeSet.getAttributeNameResource(k);
        i3 = m;
        if (i2 != 16843173)
        {
          i3 = m;
          if (i2 != 16843551)
          {
            i3 = m;
            if (i2 != v.a.a)
            {
              i3 = m;
              if (i2 != v.a.b)
              {
                if (paramAttributeSet.getAttributeBooleanValue(k, false)) {
                  i3 = i2;
                } else {
                  i3 = -i2;
                }
                localObject4[m] = i3;
                i3 = m + 1;
              }
            }
          }
        }
        k++;
      }
      localObject4 = StateSet.trimStateSet((int[])localObject4, m);
      localObject3 = g.a((int[])localObject2, j, g(n, f1, f2));
      localObject4 = (int[][])g.b((Object[])localObject1, j, localObject4);
      n = j + 1;
      localObject2 = localObject3;
      localObject1 = localObject4;
    }
    paramResources = new int[j];
    paramXmlPullParser = new int[j][];
    System.arraycopy(localObject2, 0, paramResources, 0, j);
    System.arraycopy(localObject1, 0, paramXmlPullParser, 0, j);
    return new ColorStateList(paramXmlPullParser, paramResources);
  }
  
  public static boolean f(Resources paramResources, int paramInt)
  {
    TypedValue localTypedValue = c();
    boolean bool = true;
    paramResources.getValue(paramInt, localTypedValue, true);
    paramInt = type;
    if ((paramInt < 28) || (paramInt > 31)) {
      bool = false;
    }
    return bool;
  }
  
  public static int g(int paramInt, float paramFloat1, float paramFloat2)
  {
    int i;
    if ((paramFloat2 >= 0.0F) && (paramFloat2 <= 100.0F)) {
      i = 1;
    } else {
      i = 0;
    }
    if ((paramFloat1 == 1.0F) && (i == 0)) {
      return paramInt;
    }
    int j = D.a.a((int)(Color.alpha(paramInt) * paramFloat1 + 0.5F), 0, 255);
    int k = paramInt;
    if (i != 0)
    {
      a locala = a.c(paramInt);
      k = a.m(locala.j(), locala.i(), paramFloat2);
    }
    return k & 0xFFFFFF | j << 24;
  }
  
  public static TypedArray h(Resources paramResources, Resources.Theme paramTheme, AttributeSet paramAttributeSet, int[] paramArrayOfInt)
  {
    if (paramTheme == null) {
      paramResources = paramResources.obtainAttributes(paramAttributeSet, paramArrayOfInt);
    } else {
      paramResources = paramTheme.obtainStyledAttributes(paramAttributeSet, paramArrayOfInt, 0, 0);
    }
    return paramResources;
  }
}

/* Location:
 * Qualified Name:     z.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */