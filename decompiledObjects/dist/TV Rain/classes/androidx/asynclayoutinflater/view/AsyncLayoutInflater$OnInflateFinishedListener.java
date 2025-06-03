package androidx.asynclayoutinflater.view;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract interface AsyncLayoutInflater$OnInflateFinishedListener
{
  public abstract void onInflateFinished(@NonNull View paramView, @LayoutRes int paramInt, @Nullable ViewGroup paramViewGroup);
}

/* Location:
 * Qualified Name:     androidx.asynclayoutinflater.view.AsyncLayoutInflater.OnInflateFinishedListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */