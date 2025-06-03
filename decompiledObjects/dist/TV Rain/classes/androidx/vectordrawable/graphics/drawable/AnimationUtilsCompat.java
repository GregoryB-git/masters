package androidx.vectordrawable.graphics.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.util.Xml;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import z2;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class AnimationUtilsCompat
{
  private static Interpolator createInterpolatorFromXml(Context paramContext, Resources paramResources, Resources.Theme paramTheme, XmlPullParser paramXmlPullParser)
    throws XmlPullParserException, IOException
  {
    int i = paramXmlPullParser.getDepth();
    paramResources = null;
    for (;;)
    {
      int j = paramXmlPullParser.next();
      if (((j == 3) && (paramXmlPullParser.getDepth() <= i)) || (j == 1)) {
        return paramResources;
      }
      if (j == 2)
      {
        paramTheme = Xml.asAttributeSet(paramXmlPullParser);
        paramResources = paramXmlPullParser.getName();
        if (!paramResources.equals("linearInterpolator")) {
          break;
        }
        paramResources = new LinearInterpolator();
      }
    }
    if (paramResources.equals("accelerateInterpolator")) {
      paramResources = new AccelerateInterpolator(paramContext, paramTheme);
    }
    for (;;)
    {
      break;
      if (paramResources.equals("decelerateInterpolator"))
      {
        paramResources = new DecelerateInterpolator(paramContext, paramTheme);
      }
      else
      {
        if (paramResources.equals("accelerateDecelerateInterpolator"))
        {
          paramResources = new AccelerateDecelerateInterpolator();
          break;
        }
        if (paramResources.equals("cycleInterpolator"))
        {
          paramResources = new CycleInterpolator(paramContext, paramTheme);
        }
        else if (paramResources.equals("anticipateInterpolator"))
        {
          paramResources = new AnticipateInterpolator(paramContext, paramTheme);
        }
        else if (paramResources.equals("overshootInterpolator"))
        {
          paramResources = new OvershootInterpolator(paramContext, paramTheme);
        }
        else if (paramResources.equals("anticipateOvershootInterpolator"))
        {
          paramResources = new AnticipateOvershootInterpolator(paramContext, paramTheme);
        }
        else
        {
          if (paramResources.equals("bounceInterpolator"))
          {
            paramResources = new BounceInterpolator();
            break;
          }
          if (!paramResources.equals("pathInterpolator")) {
            break label277;
          }
          paramResources = new PathInterpolatorCompat(paramContext, paramTheme, paramXmlPullParser);
        }
      }
    }
    label277:
    paramContext = z2.t("Unknown interpolator name: ");
    paramContext.append(paramXmlPullParser.getName());
    throw new RuntimeException(paramContext.toString());
    return paramResources;
  }
  
  public static Interpolator loadInterpolator(Context paramContext, int paramInt)
    throws Resources.NotFoundException
  {
    return AnimationUtils.loadInterpolator(paramContext, paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.vectordrawable.graphics.drawable.AnimationUtilsCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */