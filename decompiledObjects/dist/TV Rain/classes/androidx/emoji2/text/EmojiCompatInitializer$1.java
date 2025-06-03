package androidx.emoji2.text;

import androidx.annotation.NonNull;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

class EmojiCompatInitializer$1
  implements DefaultLifecycleObserver
{
  public EmojiCompatInitializer$1(EmojiCompatInitializer paramEmojiCompatInitializer, Lifecycle paramLifecycle) {}
  
  public void onResume(@NonNull LifecycleOwner paramLifecycleOwner)
  {
    this$0.loadEmojiCompatAfterDelay();
    val$lifecycle.removeObserver(this);
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.EmojiCompatInitializer.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */