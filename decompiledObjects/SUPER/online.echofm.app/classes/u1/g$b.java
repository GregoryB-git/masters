package u1;

import A.g;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import z.k;

public class g$b
  extends g.f
{
  public g$b() {}
  
  public g$b(b paramb)
  {
    super(paramb);
  }
  
  private void f(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser)
  {
    String str = paramTypedArray.getString(0);
    if (str != null) {
      b = str;
    }
    str = paramTypedArray.getString(1);
    if (str != null) {
      a = g.d(str);
    }
    c = k.g(paramTypedArray, paramXmlPullParser, "fillType", 2, 0);
  }
  
  public boolean c()
  {
    return true;
  }
  
  public void e(Resources paramResources, AttributeSet paramAttributeSet, Resources.Theme paramTheme, XmlPullParser paramXmlPullParser)
  {
    if (!k.j(paramXmlPullParser, "pathData")) {
      return;
    }
    paramResources = k.k(paramResources, paramTheme, paramAttributeSet, a.d);
    f(paramResources, paramXmlPullParser);
    paramResources.recycle();
  }
}

/* Location:
 * Qualified Name:     u1.g.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */