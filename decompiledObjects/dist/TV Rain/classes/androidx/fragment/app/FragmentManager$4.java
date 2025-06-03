package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.annotation.NonNull;

class FragmentManager$4
  implements SpecialEffectsControllerFactory
{
  public FragmentManager$4(FragmentManager paramFragmentManager) {}
  
  @NonNull
  public SpecialEffectsController createController(@NonNull ViewGroup paramViewGroup)
  {
    return new DefaultSpecialEffectsController(paramViewGroup);
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentManager.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */