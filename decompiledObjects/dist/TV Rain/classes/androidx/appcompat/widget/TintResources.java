package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

class TintResources
  extends ResourcesWrapper
{
  private final WeakReference<Context> mContextRef;
  
  public TintResources(@NonNull Context paramContext, @NonNull Resources paramResources)
  {
    super(paramResources);
    mContextRef = new WeakReference(paramContext);
  }
  
  public Drawable getDrawable(int paramInt)
    throws Resources.NotFoundException
  {
    Drawable localDrawable = getDrawableCanonical(paramInt);
    Context localContext = (Context)mContextRef.get();
    if ((localDrawable != null) && (localContext != null)) {
      ResourceManagerInternal.get().tintDrawableUsingColorFilter(localContext, paramInt, localDrawable);
    }
    return localDrawable;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.TintResources
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */