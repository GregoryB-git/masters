package androidx.recyclerview.widget;

import android.view.View;
import android.widget.EdgeEffect;
import androidx.annotation.NonNull;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class RecyclerView$EdgeEffectFactory
{
  public static final int DIRECTION_BOTTOM = 3;
  public static final int DIRECTION_LEFT = 0;
  public static final int DIRECTION_RIGHT = 2;
  public static final int DIRECTION_TOP = 1;
  
  @NonNull
  public EdgeEffect createEdgeEffect(@NonNull RecyclerView paramRecyclerView, int paramInt)
  {
    return new EdgeEffect(paramRecyclerView.getContext());
  }
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface EdgeDirection {}
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.EdgeEffectFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */