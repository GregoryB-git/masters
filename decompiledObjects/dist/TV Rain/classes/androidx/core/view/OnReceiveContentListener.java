package androidx.core.view;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract interface OnReceiveContentListener
{
  @Nullable
  public abstract ContentInfoCompat onReceiveContent(@NonNull View paramView, @NonNull ContentInfoCompat paramContentInfoCompat);
}

/* Location:
 * Qualified Name:     androidx.core.view.OnReceiveContentListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */