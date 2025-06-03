package androidx.core.content.pm;

import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.List;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class ShortcutInfoChangeListener
{
  @AnyThread
  public void onAllShortcutsRemoved() {}
  
  @AnyThread
  public void onShortcutAdded(@NonNull List<ShortcutInfoCompat> paramList) {}
  
  @AnyThread
  public void onShortcutRemoved(@NonNull List<String> paramList) {}
  
  @AnyThread
  public void onShortcutUpdated(@NonNull List<ShortcutInfoCompat> paramList) {}
  
  @AnyThread
  public void onShortcutUsageReported(@NonNull List<String> paramList) {}
}

/* Location:
 * Qualified Name:     androidx.core.content.pm.ShortcutInfoChangeListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */