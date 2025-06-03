package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class VectorEnabledTintResources
  extends ResourcesWrapper
{
  public static final int MAX_SDK_WHERE_REQUIRED = 20;
  private static boolean sCompatVectorFromResourcesEnabled = false;
  private final WeakReference<Context> mContextRef;
  
  public VectorEnabledTintResources(@NonNull Context paramContext, @NonNull Resources paramResources)
  {
    super(paramResources);
    mContextRef = new WeakReference(paramContext);
  }
  
  public static boolean isCompatVectorFromResourcesEnabled()
  {
    return sCompatVectorFromResourcesEnabled;
  }
  
  public static void setCompatVectorFromResourcesEnabled(boolean paramBoolean)
  {
    sCompatVectorFromResourcesEnabled = paramBoolean;
  }
  
  public static boolean shouldBeUsed()
  {
    isCompatVectorFromResourcesEnabled();
    return false;
  }
  
  public Drawable getDrawable(int paramInt)
    throws Resources.NotFoundException
  {
    Context localContext = (Context)mContextRef.get();
    if (localContext != null) {
      return ResourceManagerInternal.get().onDrawableLoadedFromResources(localContext, this, paramInt);
    }
    return getDrawableCanonical(paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.VectorEnabledTintResources
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */