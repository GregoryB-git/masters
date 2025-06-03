package l;

import a2.f;
import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;

public final class q0$g
  implements q0.e
{
  public final Drawable a(Context paramContext, XmlResourceParser paramXmlResourceParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    try
    {
      paramContext = paramContext.getResources();
      f localf = new a2/f;
      localf.<init>();
      localf.inflate(paramContext, paramXmlResourceParser, paramAttributeSet, paramTheme);
      return localf;
    }
    catch (Exception paramContext)
    {
      Log.e("VdcInflateDelegate", "Exception while inflating <vector>", paramContext);
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     l.q0.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */