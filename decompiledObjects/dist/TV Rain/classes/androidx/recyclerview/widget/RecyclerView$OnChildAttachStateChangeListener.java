package androidx.recyclerview.widget;

import android.view.View;
import androidx.annotation.NonNull;

public abstract interface RecyclerView$OnChildAttachStateChangeListener
{
  public abstract void onChildViewAttachedToWindow(@NonNull View paramView);
  
  public abstract void onChildViewDetachedFromWindow(@NonNull View paramView);
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */