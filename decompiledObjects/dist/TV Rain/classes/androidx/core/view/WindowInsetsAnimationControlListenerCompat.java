package androidx.core.view;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract interface WindowInsetsAnimationControlListenerCompat
{
  public abstract void onCancelled(@Nullable WindowInsetsAnimationControllerCompat paramWindowInsetsAnimationControllerCompat);
  
  public abstract void onFinished(@NonNull WindowInsetsAnimationControllerCompat paramWindowInsetsAnimationControllerCompat);
  
  public abstract void onReady(@NonNull WindowInsetsAnimationControllerCompat paramWindowInsetsAnimationControllerCompat, int paramInt);
}

/* Location:
 * Qualified Name:     androidx.core.view.WindowInsetsAnimationControlListenerCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */