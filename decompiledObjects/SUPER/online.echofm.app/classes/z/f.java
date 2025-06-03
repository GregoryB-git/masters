package z;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import v.d;

public abstract class f
{
  public static a a(a parama, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3)
  {
    if (parama != null) {
      return parama;
    }
    parama = new z/f$a;
    if (paramBoolean)
    {
      parama.<init>(paramInt1, paramInt3, paramInt2);
      return parama;
    }
    parama.<init>(paramInt1, paramInt2);
    return parama;
  }
  
  public static Shader b(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    Object localObject = paramXmlPullParser.getName();
    if (((String)localObject).equals("gradient"))
    {
      localObject = k.k(paramResources, paramTheme, paramAttributeSet, d.A);
      float f1 = k.f((TypedArray)localObject, paramXmlPullParser, "startX", d.J, 0.0F);
      float f2 = k.f((TypedArray)localObject, paramXmlPullParser, "startY", d.K, 0.0F);
      float f3 = k.f((TypedArray)localObject, paramXmlPullParser, "endX", d.L, 0.0F);
      float f4 = k.f((TypedArray)localObject, paramXmlPullParser, "endY", d.M, 0.0F);
      float f5 = k.f((TypedArray)localObject, paramXmlPullParser, "centerX", d.E, 0.0F);
      float f6 = k.f((TypedArray)localObject, paramXmlPullParser, "centerY", d.F, 0.0F);
      int i = k.g((TypedArray)localObject, paramXmlPullParser, "type", d.D, 0);
      int j = k.b((TypedArray)localObject, paramXmlPullParser, "startColor", d.B, 0);
      boolean bool = k.j(paramXmlPullParser, "centerColor");
      int k = k.b((TypedArray)localObject, paramXmlPullParser, "centerColor", d.I, 0);
      int m = k.b((TypedArray)localObject, paramXmlPullParser, "endColor", d.C, 0);
      int n = k.g((TypedArray)localObject, paramXmlPullParser, "tileMode", d.H, 0);
      float f7 = k.f((TypedArray)localObject, paramXmlPullParser, "gradientRadius", d.G, 0.0F);
      ((TypedArray)localObject).recycle();
      paramResources = a(c(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme), j, m, bool, k);
      if (i != 1)
      {
        if (i != 2) {
          return new LinearGradient(f1, f2, f3, f4, a, b, d(n));
        }
        return new SweepGradient(f5, f6, a, b);
      }
      if (f7 > 0.0F) {
        return new RadialGradient(f5, f6, f7, a, b, d(n));
      }
      throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }
    paramResources = new StringBuilder();
    paramResources.append(paramXmlPullParser.getPositionDescription());
    paramResources.append(": invalid gradient color tag ");
    paramResources.append((String)localObject);
    throw new XmlPullParserException(paramResources.toString());
  }
  
  public static a c(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    int i = paramXmlPullParser.getDepth() + 1;
    ArrayList localArrayList1 = new ArrayList(20);
    ArrayList localArrayList2 = new ArrayList(20);
    for (;;)
    {
      int j = paramXmlPullParser.next();
      if (j == 1) {
        break label235;
      }
      int k = paramXmlPullParser.getDepth();
      if ((k < i) && (j == 3)) {
        break label235;
      }
      if ((j == 2) && (k <= i) && (paramXmlPullParser.getName().equals("item")))
      {
        TypedArray localTypedArray = k.k(paramResources, paramTheme, paramAttributeSet, d.N);
        boolean bool1 = localTypedArray.hasValue(d.O);
        boolean bool2 = localTypedArray.hasValue(d.P);
        if ((!bool1) || (!bool2)) {
          break;
        }
        j = localTypedArray.getColor(d.O, 0);
        float f = localTypedArray.getFloat(d.P, 0.0F);
        localTypedArray.recycle();
        localArrayList2.add(Integer.valueOf(j));
        localArrayList1.add(Float.valueOf(f));
      }
    }
    paramResources = new StringBuilder();
    paramResources.append(paramXmlPullParser.getPositionDescription());
    paramResources.append(": <item> tag requires a 'color' attribute and a 'offset' attribute!");
    throw new XmlPullParserException(paramResources.toString());
    label235:
    if (localArrayList2.size() > 0) {
      return new a(localArrayList2, localArrayList1);
    }
    return null;
  }
  
  public static Shader.TileMode d(int paramInt)
  {
    if (paramInt != 1)
    {
      if (paramInt != 2) {
        return Shader.TileMode.CLAMP;
      }
      return Shader.TileMode.MIRROR;
    }
    return Shader.TileMode.REPEAT;
  }
  
  public static final class a
  {
    public final int[] a;
    public final float[] b;
    
    public a(int paramInt1, int paramInt2)
    {
      a = new int[] { paramInt1, paramInt2 };
      b = new float[] { 0.0F, 1.0F };
    }
    
    public a(int paramInt1, int paramInt2, int paramInt3)
    {
      a = new int[] { paramInt1, paramInt2, paramInt3 };
      b = new float[] { 0.0F, 0.5F, 1.0F };
    }
    
    public a(List paramList1, List paramList2)
    {
      int i = paramList1.size();
      a = new int[i];
      b = new float[i];
      for (int j = 0; j < i; j++)
      {
        a[j] = ((Integer)paramList1.get(j)).intValue();
        b[j] = ((Float)paramList2.get(j)).floatValue();
      }
    }
  }
}

/* Location:
 * Qualified Name:     z.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */