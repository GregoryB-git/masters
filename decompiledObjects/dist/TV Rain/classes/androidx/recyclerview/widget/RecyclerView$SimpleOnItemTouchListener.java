package androidx.recyclerview.widget;

import android.view.MotionEvent;
import androidx.annotation.NonNull;

public class RecyclerView$SimpleOnItemTouchListener
  implements RecyclerView.OnItemTouchListener
{
  public boolean onInterceptTouchEvent(@NonNull RecyclerView paramRecyclerView, @NonNull MotionEvent paramMotionEvent)
  {
    return false;
  }
  
  public void onRequestDisallowInterceptTouchEvent(boolean paramBoolean) {}
  
  public void onTouchEvent(@NonNull RecyclerView paramRecyclerView, @NonNull MotionEvent paramMotionEvent) {}
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.SimpleOnItemTouchListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */