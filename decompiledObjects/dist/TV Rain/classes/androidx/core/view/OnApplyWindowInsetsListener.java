package androidx.core.view;

import android.view.View;
import androidx.annotation.NonNull;

public abstract interface OnApplyWindowInsetsListener
{
  @NonNull
  public abstract WindowInsetsCompat onApplyWindowInsets(@NonNull View paramView, @NonNull WindowInsetsCompat paramWindowInsetsCompat);
}

/* Location:
 * Qualified Name:     androidx.core.view.OnApplyWindowInsetsListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */