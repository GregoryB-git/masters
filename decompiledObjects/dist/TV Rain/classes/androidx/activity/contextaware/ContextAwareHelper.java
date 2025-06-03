package androidx.activity.contextaware;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public final class ContextAwareHelper
{
  private volatile Context mContext;
  private final Set<OnContextAvailableListener> mListeners = new CopyOnWriteArraySet();
  
  public void addOnContextAvailableListener(@NonNull OnContextAvailableListener paramOnContextAvailableListener)
  {
    if (mContext != null) {
      paramOnContextAvailableListener.onContextAvailable(mContext);
    }
    mListeners.add(paramOnContextAvailableListener);
  }
  
  public void clearAvailableContext()
  {
    mContext = null;
  }
  
  public void dispatchOnContextAvailable(@NonNull Context paramContext)
  {
    mContext = paramContext;
    Iterator localIterator = mListeners.iterator();
    while (localIterator.hasNext()) {
      ((OnContextAvailableListener)localIterator.next()).onContextAvailable(paramContext);
    }
  }
  
  @Nullable
  public Context peekAvailableContext()
  {
    return mContext;
  }
  
  public void removeOnContextAvailableListener(@NonNull OnContextAvailableListener paramOnContextAvailableListener)
  {
    mListeners.remove(paramOnContextAvailableListener);
  }
}

/* Location:
 * Qualified Name:     androidx.activity.contextaware.ContextAwareHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */