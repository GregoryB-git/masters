package androidx.fragment.app;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;

class FragmentManagerViewModel$1
  implements ViewModelProvider.Factory
{
  @NonNull
  public <T extends ViewModel> T create(@NonNull Class<T> paramClass)
  {
    return new FragmentManagerViewModel(true);
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentManagerViewModel.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */