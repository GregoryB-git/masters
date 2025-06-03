package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.annotation.NonNull;

abstract interface SpecialEffectsControllerFactory
{
  @NonNull
  public abstract SpecialEffectsController createController(@NonNull ViewGroup paramViewGroup);
}

/* Location:
 * Qualified Name:     androidx.fragment.app.SpecialEffectsControllerFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */