package androidx.browser.browseractions;

import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
@VisibleForTesting
abstract interface BrowserActionsFallbackMenuUi$BrowserActionsFallMenuUiListener
{
  public abstract void onMenuShown(View paramView);
}

/* Location:
 * Qualified Name:     androidx.browser.browseractions.BrowserActionsFallbackMenuUi.BrowserActionsFallMenuUiListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */