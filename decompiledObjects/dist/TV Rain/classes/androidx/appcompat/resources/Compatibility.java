package androidx.appcompat.resources;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
public final class Compatibility
{
  @RequiresApi(15)
  public static class Api15Impl
  {
    @DoNotInline
    public static void getValueForDensity(@NonNull Resources paramResources, int paramInt1, int paramInt2, @NonNull TypedValue paramTypedValue, boolean paramBoolean)
    {
      paramResources.getValueForDensity(paramInt1, paramInt2, paramTypedValue, paramBoolean);
    }
  }
  
  @RequiresApi(18)
  public static class Api18Impl
  {
    @DoNotInline
    public static void setAutoCancel(@NonNull ObjectAnimator paramObjectAnimator, boolean paramBoolean)
    {
      paramObjectAnimator.setAutoCancel(paramBoolean);
    }
  }
  
  @RequiresApi(21)
  public static class Api21Impl
  {
    @DoNotInline
    @NonNull
    public static Drawable createFromXmlInner(@NonNull Resources paramResources, @NonNull XmlPullParser paramXmlPullParser, @NonNull AttributeSet paramAttributeSet, @Nullable Resources.Theme paramTheme)
      throws IOException, XmlPullParserException
    {
      return Drawable.createFromXmlInner(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    }
    
    @DoNotInline
    public static int getChangingConfigurations(@NonNull TypedArray paramTypedArray)
    {
      return paramTypedArray.getChangingConfigurations();
    }
    
    @DoNotInline
    public static void inflate(@NonNull Drawable paramDrawable, @NonNull Resources paramResources, @NonNull XmlPullParser paramXmlPullParser, @NonNull AttributeSet paramAttributeSet, @Nullable Resources.Theme paramTheme)
      throws IOException, XmlPullParserException
    {
      paramDrawable.inflate(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.resources.Compatibility
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */