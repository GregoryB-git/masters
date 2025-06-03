package androidx.recyclerview.widget;

import android.view.MotionEvent;
import androidx.annotation.NonNull;

public abstract interface RecyclerView$OnItemTouchListener
{
  public abstract boolean onInterceptTouchEvent(@NonNull RecyclerView paramRecyclerView, @NonNull MotionEvent paramMotionEvent);
  
  public abstract void onRequestDisallowInterceptTouchEvent(boolean paramBoolean);
  
  public abstract void onTouchEvent(@NonNull RecyclerView paramRecyclerView, @NonNull MotionEvent paramMotionEvent);
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */