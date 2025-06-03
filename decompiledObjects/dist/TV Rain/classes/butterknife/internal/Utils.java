package butterknife.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.UiThread;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import java.util.Arrays;
import java.util.List;
import z2;

public final class Utils
{
  private static final TypedValue VALUE = new TypedValue();
  
  private Utils()
  {
    throw new AssertionError("No instances.");
  }
  
  @SafeVarargs
  public static <T> T[] arrayFilteringNull(T... paramVarArgs)
  {
    int i = paramVarArgs.length;
    int j = 0;
    int m;
    for (int k = 0; j < i; k = m)
    {
      T ? = paramVarArgs[j];
      m = k;
      if (? != null)
      {
        paramVarArgs[k] = ?;
        m = k + 1;
      }
      j++;
    }
    if (k != i) {
      paramVarArgs = Arrays.copyOf(paramVarArgs, k);
    }
    return paramVarArgs;
  }
  
  public static <T> T castParam(Object paramObject, String paramString1, int paramInt1, String paramString2, int paramInt2, Class<T> paramClass)
  {
    try
    {
      paramObject = paramClass.cast(paramObject);
      return (T)paramObject;
    }
    catch (ClassCastException paramClass)
    {
      paramObject = z2.t("Parameter #");
      ((StringBuilder)paramObject).append(paramInt1 + 1);
      ((StringBuilder)paramObject).append(" of method '");
      ((StringBuilder)paramObject).append(paramString1);
      ((StringBuilder)paramObject).append("' was of the wrong type for parameter #");
      ((StringBuilder)paramObject).append(paramInt2 + 1);
      ((StringBuilder)paramObject).append(" of method '");
      throw new IllegalStateException(z2.s((StringBuilder)paramObject, paramString2, "'. See cause for more info."), paramClass);
    }
  }
  
  public static <T> T castView(View paramView, @IdRes int paramInt, String paramString, Class<T> paramClass)
  {
    try
    {
      paramClass = paramClass.cast(paramView);
      return paramClass;
    }
    catch (ClassCastException paramClass)
    {
      String str = getResourceEntryName(paramView, paramInt);
      paramView = new StringBuilder();
      paramView.append("View '");
      paramView.append(str);
      paramView.append("' with ID ");
      paramView.append(paramInt);
      paramView.append(" for ");
      throw new IllegalStateException(z2.s(paramView, paramString, " was of the wrong type. See cause for more info."), paramClass);
    }
  }
  
  public static <T> T findOptionalViewAsType(View paramView, @IdRes int paramInt, String paramString, Class<T> paramClass)
  {
    return (T)castView(paramView.findViewById(paramInt), paramInt, paramString, paramClass);
  }
  
  public static View findRequiredView(View paramView, @IdRes int paramInt, String paramString)
  {
    Object localObject = paramView.findViewById(paramInt);
    if (localObject != null) {
      return (View)localObject;
    }
    localObject = getResourceEntryName(paramView, paramInt);
    paramView = new StringBuilder();
    paramView.append("Required view '");
    paramView.append((String)localObject);
    paramView.append("' with ID ");
    paramView.append(paramInt);
    paramView.append(" for ");
    throw new IllegalStateException(z2.s(paramView, paramString, " was not found. If this view is optional add '@Nullable' (fields) or '@Optional' (methods) annotation."));
  }
  
  public static <T> T findRequiredViewAsType(View paramView, @IdRes int paramInt, String paramString, Class<T> paramClass)
  {
    return (T)castView(findRequiredView(paramView, paramInt, paramString), paramInt, paramString, paramClass);
  }
  
  @UiThread
  public static float getFloat(Context paramContext, @DimenRes int paramInt)
  {
    TypedValue localTypedValue = VALUE;
    paramContext.getResources().getValue(paramInt, localTypedValue, true);
    if (type == 4) {
      return localTypedValue.getFloat();
    }
    paramContext = z2.t("Resource ID #0x");
    paramContext.append(Integer.toHexString(paramInt));
    paramContext.append(" type #0x");
    paramContext.append(Integer.toHexString(type));
    paramContext.append(" is not valid");
    throw new Resources.NotFoundException(paramContext.toString());
  }
  
  private static String getResourceEntryName(View paramView, @IdRes int paramInt)
  {
    if (paramView.isInEditMode()) {
      return "<unavailable while editing>";
    }
    return paramView.getContext().getResources().getResourceEntryName(paramInt);
  }
  
  @UiThread
  public static Drawable getTintedDrawable(Context paramContext, @DrawableRes int paramInt1, @AttrRes int paramInt2)
  {
    Object localObject1 = paramContext.getTheme();
    Object localObject2 = VALUE;
    if (((Resources.Theme)localObject1).resolveAttribute(paramInt2, (TypedValue)localObject2, true))
    {
      localObject1 = DrawableCompat.wrap(ContextCompat.getDrawable(paramContext, paramInt1).mutate());
      DrawableCompat.setTint((Drawable)localObject1, ContextCompat.getColor(paramContext, resourceId));
      return (Drawable)localObject1;
    }
    localObject2 = z2.t("Required tint color attribute with name ");
    ((StringBuilder)localObject2).append(paramContext.getResources().getResourceEntryName(paramInt2));
    ((StringBuilder)localObject2).append(" and attribute ID ");
    ((StringBuilder)localObject2).append(paramInt2);
    ((StringBuilder)localObject2).append(" was not found.");
    throw new Resources.NotFoundException(((StringBuilder)localObject2).toString());
  }
  
  @SafeVarargs
  public static <T> List<T> listFilteringNull(T... paramVarArgs)
  {
    return new ImmutableList(arrayFilteringNull(paramVarArgs));
  }
}

/* Location:
 * Qualified Name:     butterknife.internal.Utils
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */