package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.method.ReplacementTransformationMethod;
import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import java.util.Locale;

class PagerTitleStrip$SingleLineAllCapsTransform
  extends SingleLineTransformationMethod
{
  private Locale mLocale;
  
  public PagerTitleStrip$SingleLineAllCapsTransform(Context paramContext)
  {
    mLocale = getResourcesgetConfigurationlocale;
  }
  
  public CharSequence getTransformation(CharSequence paramCharSequence, View paramView)
  {
    paramCharSequence = super.getTransformation(paramCharSequence, paramView);
    if (paramCharSequence != null) {
      paramCharSequence = paramCharSequence.toString().toUpperCase(mLocale);
    } else {
      paramCharSequence = null;
    }
    return paramCharSequence;
  }
}

/* Location:
 * Qualified Name:     androidx.viewpager.widget.PagerTitleStrip.SingleLineAllCapsTransform
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */