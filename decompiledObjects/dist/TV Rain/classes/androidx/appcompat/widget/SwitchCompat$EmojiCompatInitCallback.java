package androidx.appcompat.widget;

import androidx.annotation.Nullable;
import androidx.emoji2.text.EmojiCompat.InitCallback;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

class SwitchCompat$EmojiCompatInitCallback
  extends EmojiCompat.InitCallback
{
  private final Reference<SwitchCompat> mOuterWeakRef;
  
  public SwitchCompat$EmojiCompatInitCallback(SwitchCompat paramSwitchCompat)
  {
    mOuterWeakRef = new WeakReference(paramSwitchCompat);
  }
  
  public void onFailed(@Nullable Throwable paramThrowable)
  {
    paramThrowable = (SwitchCompat)mOuterWeakRef.get();
    if (paramThrowable != null) {
      paramThrowable.onEmojiCompatInitializedForSwitchText();
    }
  }
  
  public void onInitialized()
  {
    SwitchCompat localSwitchCompat = (SwitchCompat)mOuterWeakRef.get();
    if (localSwitchCompat != null) {
      localSwitchCompat.onEmojiCompatInitializedForSwitchText();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.SwitchCompat.EmojiCompatInitCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */