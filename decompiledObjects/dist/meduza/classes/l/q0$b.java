package l;

import a2.b;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;

public final class q0$b
  implements q0.e
{
  public final Drawable a(Context paramContext, XmlResourceParser paramXmlResourceParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    try
    {
      Resources localResources = paramContext.getResources();
      b localb = new a2/b;
      localb.<init>(paramContext);
      localb.inflate(localResources, paramXmlResourceParser, paramAttributeSet, paramTheme);
      return localb;
    }
    catch (Exception paramContext)
    {
      Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", paramContext);
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     l.q0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */