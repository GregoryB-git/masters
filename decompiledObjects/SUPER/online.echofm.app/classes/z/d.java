package z;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class d
{
  public final Shader a;
  public final ColorStateList b;
  public int c;
  
  public d(Shader paramShader, ColorStateList paramColorStateList, int paramInt)
  {
    a = paramShader;
    b = paramColorStateList;
    c = paramInt;
  }
  
  public static d a(Resources paramResources, int paramInt, Resources.Theme paramTheme)
  {
    XmlResourceParser localXmlResourceParser = paramResources.getXml(paramInt);
    AttributeSet localAttributeSet = Xml.asAttributeSet(localXmlResourceParser);
    do
    {
      paramInt = localXmlResourceParser.next();
    } while ((paramInt != 2) && (paramInt != 1));
    if (paramInt == 2)
    {
      String str = localXmlResourceParser.getName();
      str.hashCode();
      if (!str.equals("gradient"))
      {
        if (str.equals("selector")) {
          return c(c.b(paramResources, localXmlResourceParser, localAttributeSet, paramTheme));
        }
        paramResources = new StringBuilder();
        paramResources.append(localXmlResourceParser.getPositionDescription());
        paramResources.append(": unsupported complex color tag ");
        paramResources.append(str);
        throw new XmlPullParserException(paramResources.toString());
      }
      return d(f.b(paramResources, localXmlResourceParser, localAttributeSet, paramTheme));
    }
    throw new XmlPullParserException("No start tag found");
  }
  
  public static d b(int paramInt)
  {
    return new d(null, null, paramInt);
  }
  
  public static d c(ColorStateList paramColorStateList)
  {
    return new d(null, paramColorStateList, paramColorStateList.getDefaultColor());
  }
  
  public static d d(Shader paramShader)
  {
    return new d(paramShader, null, 0);
  }
  
  public static d g(Resources paramResources, int paramInt, Resources.Theme paramTheme)
  {
    try
    {
      paramResources = a(paramResources, paramInt, paramTheme);
      return paramResources;
    }
    catch (Exception paramResources)
    {
      Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", paramResources);
    }
    return null;
  }
  
  public int e()
  {
    return c;
  }
  
  public Shader f()
  {
    return a;
  }
  
  public boolean h()
  {
    boolean bool;
    if (a != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean i()
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
  
  public boolean j(int[] paramArrayOfInt)
  {
    if (i())
    {
      ColorStateList localColorStateList = b;
      int i = localColorStateList.getColorForState(paramArrayOfInt, localColorStateList.getDefaultColor());
      if (i != c)
      {
        c = i;
        bool = true;
        break label44;
      }
    }
    boolean bool = false;
    label44:
    return bool;
  }
  
  public void k(int paramInt)
  {
    c = paramInt;
  }
  
  public boolean l()
  {
    boolean bool;
    if ((!h()) && (c == 0)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     z.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */