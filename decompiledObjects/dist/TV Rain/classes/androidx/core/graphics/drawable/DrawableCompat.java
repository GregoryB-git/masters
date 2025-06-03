package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class DrawableCompat
{
  private static final String TAG = "DrawableCompat";
  private static Method sGetLayoutDirectionMethod;
  private static boolean sGetLayoutDirectionMethodFetched;
  private static Method sSetLayoutDirectionMethod;
  private static boolean sSetLayoutDirectionMethodFetched;
  
  public static void applyTheme(@NonNull Drawable paramDrawable, @NonNull Resources.Theme paramTheme)
  {
    Api21Impl.applyTheme(paramDrawable, paramTheme);
  }
  
  public static boolean canApplyTheme(@NonNull Drawable paramDrawable)
  {
    return Api21Impl.canApplyTheme(paramDrawable);
  }
  
  public static void clearColorFilter(@NonNull Drawable paramDrawable)
  {
    paramDrawable.clearColorFilter();
  }
  
  public static int getAlpha(@NonNull Drawable paramDrawable)
  {
    return Api19Impl.getAlpha(paramDrawable);
  }
  
  @Nullable
  public static ColorFilter getColorFilter(@NonNull Drawable paramDrawable)
  {
    return Api21Impl.getColorFilter(paramDrawable);
  }
  
  public static int getLayoutDirection(@NonNull Drawable paramDrawable)
  {
    return Api23Impl.getLayoutDirection(paramDrawable);
  }
  
  public static void inflate(@NonNull Drawable paramDrawable, @NonNull Resources paramResources, @NonNull XmlPullParser paramXmlPullParser, @NonNull AttributeSet paramAttributeSet, @Nullable Resources.Theme paramTheme)
    throws XmlPullParserException, IOException
  {
    Api21Impl.inflate(paramDrawable, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
  }
  
  public static boolean isAutoMirrored(@NonNull Drawable paramDrawable)
  {
    return Api19Impl.isAutoMirrored(paramDrawable);
  }
  
  @Deprecated
  public static void jumpToCurrentState(@NonNull Drawable paramDrawable)
  {
    paramDrawable.jumpToCurrentState();
  }
  
  public static void setAutoMirrored(@NonNull Drawable paramDrawable, boolean paramBoolean)
  {
    Api19Impl.setAutoMirrored(paramDrawable, paramBoolean);
  }
  
  public static void setHotspot(@NonNull Drawable paramDrawable, float paramFloat1, float paramFloat2)
  {
    Api21Impl.setHotspot(paramDrawable, paramFloat1, paramFloat2);
  }
  
  public static void setHotspotBounds(@NonNull Drawable paramDrawable, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Api21Impl.setHotspotBounds(paramDrawable, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static boolean setLayoutDirection(@NonNull Drawable paramDrawable, int paramInt)
  {
    return Api23Impl.setLayoutDirection(paramDrawable, paramInt);
  }
  
  public static void setTint(@NonNull Drawable paramDrawable, @ColorInt int paramInt)
  {
    Api21Impl.setTint(paramDrawable, paramInt);
  }
  
  public static void setTintList(@NonNull Drawable paramDrawable, @Nullable ColorStateList paramColorStateList)
  {
    Api21Impl.setTintList(paramDrawable, paramColorStateList);
  }
  
  public static void setTintMode(@NonNull Drawable paramDrawable, @Nullable PorterDuff.Mode paramMode)
  {
    Api21Impl.setTintMode(paramDrawable, paramMode);
  }
  
  public static <T extends Drawable> T unwrap(@NonNull Drawable paramDrawable)
  {
    Drawable localDrawable = paramDrawable;
    if ((paramDrawable instanceof WrappedDrawable)) {
      localDrawable = ((WrappedDrawable)paramDrawable).getWrappedDrawable();
    }
    return localDrawable;
  }
  
  @NonNull
  public static Drawable wrap(@NonNull Drawable paramDrawable)
  {
    return paramDrawable;
  }
  
  @RequiresApi(19)
  public static class Api19Impl
  {
    @DoNotInline
    public static int getAlpha(Drawable paramDrawable)
    {
      return paramDrawable.getAlpha();
    }
    
    @DoNotInline
    public static Drawable getChild(DrawableContainer.DrawableContainerState paramDrawableContainerState, int paramInt)
    {
      return paramDrawableContainerState.getChild(paramInt);
    }
    
    @DoNotInline
    public static Drawable getDrawable(InsetDrawable paramInsetDrawable)
    {
      return paramInsetDrawable.getDrawable();
    }
    
    @DoNotInline
    public static boolean isAutoMirrored(Drawable paramDrawable)
    {
      return paramDrawable.isAutoMirrored();
    }
    
    @DoNotInline
    public static void setAutoMirrored(Drawable paramDrawable, boolean paramBoolean)
    {
      paramDrawable.setAutoMirrored(paramBoolean);
    }
  }
  
  @RequiresApi(21)
  public static class Api21Impl
  {
    @DoNotInline
    public static void applyTheme(Drawable paramDrawable, Resources.Theme paramTheme)
    {
      paramDrawable.applyTheme(paramTheme);
    }
    
    @DoNotInline
    public static boolean canApplyTheme(Drawable paramDrawable)
    {
      return paramDrawable.canApplyTheme();
    }
    
    @DoNotInline
    public static ColorFilter getColorFilter(Drawable paramDrawable)
    {
      return paramDrawable.getColorFilter();
    }
    
    @DoNotInline
    public static void inflate(Drawable paramDrawable, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
      throws XmlPullParserException, IOException
    {
      paramDrawable.inflate(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    }
    
    @DoNotInline
    public static void setHotspot(Drawable paramDrawable, float paramFloat1, float paramFloat2)
    {
      paramDrawable.setHotspot(paramFloat1, paramFloat2);
    }
    
    @DoNotInline
    public static void setHotspotBounds(Drawable paramDrawable, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      paramDrawable.setHotspotBounds(paramInt1, paramInt2, paramInt3, paramInt4);
    }
    
    @DoNotInline
    public static void setTint(Drawable paramDrawable, int paramInt)
    {
      paramDrawable.setTint(paramInt);
    }
    
    @DoNotInline
    public static void setTintList(Drawable paramDrawable, ColorStateList paramColorStateList)
    {
      paramDrawable.setTintList(paramColorStateList);
    }
    
    @DoNotInline
    public static void setTintMode(Drawable paramDrawable, PorterDuff.Mode paramMode)
    {
      paramDrawable.setTintMode(paramMode);
    }
  }
  
  @RequiresApi(23)
  public static class Api23Impl
  {
    @DoNotInline
    public static int getLayoutDirection(Drawable paramDrawable)
    {
      return paramDrawable.getLayoutDirection();
    }
    
    @DoNotInline
    public static boolean setLayoutDirection(Drawable paramDrawable, int paramInt)
    {
      return paramDrawable.setLayoutDirection(paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.graphics.drawable.DrawableCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */