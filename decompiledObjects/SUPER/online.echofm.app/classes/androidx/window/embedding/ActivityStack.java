package androidx.window.embedding;

import android.app.Activity;
import androidx.window.core.ExperimentalWindowApi;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
@ExperimentalWindowApi
public final class ActivityStack
{
  @NotNull
  private final List<Activity> activities;
  private final boolean isEmpty;
  
  public ActivityStack(@NotNull List<? extends Activity> paramList, boolean paramBoolean)
  {
    activities = paramList;
    isEmpty = paramBoolean;
  }
  
  public final boolean contains(@NotNull Activity paramActivity)
  {
    Intrinsics.checkNotNullParameter(paramActivity, "activity");
    return activities.contains(paramActivity);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof ActivityStack)) {
      return false;
    }
    List localList = activities;
    paramObject = (ActivityStack)paramObject;
    if ((Intrinsics.a(localList, activities)) || (isEmpty == isEmpty)) {
      bool = false;
    }
    return bool;
  }
  
  @NotNull
  public final List<Activity> getActivities$window_release()
  {
    return activities;
  }
  
  public int hashCode()
  {
    return isEmpty * true + activities.hashCode();
  }
  
  public final boolean isEmpty()
  {
    return isEmpty;
  }
  
  @NotNull
  public String toString()
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("ActivityStack{");
    ((StringBuilder)localObject).append(Intrinsics.i("activities=", getActivities$window_release()));
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("isEmpty=");
    localStringBuilder.append(isEmpty);
    localStringBuilder.append('}');
    ((StringBuilder)localObject).append(localStringBuilder.toString());
    localObject = ((StringBuilder)localObject).toString();
    Intrinsics.checkNotNullExpressionValue(localObject, "StringBuilder().apply(builderAction).toString()");
    return (String)localObject;
  }
}

/* Location:
 * Qualified Name:     androidx.window.embedding.ActivityStack
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */