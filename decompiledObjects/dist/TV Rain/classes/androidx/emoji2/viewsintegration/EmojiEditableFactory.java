package androidx.emoji2.viewsintegration;

import android.annotation.SuppressLint;
import android.text.Editable;
import android.text.Editable.Factory;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.emoji2.text.SpannableBuilder;

final class EmojiEditableFactory
  extends Editable.Factory
{
  private static final Object INSTANCE_LOCK = new Object();
  @GuardedBy("INSTANCE_LOCK")
  private static volatile Editable.Factory sInstance;
  @Nullable
  private static Class<?> sWatcherClass;
  
  @SuppressLint({"PrivateApi"})
  private EmojiEditableFactory()
  {
    try
    {
      sWatcherClass = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, EmojiEditableFactory.class.getClassLoader());
      return;
    }
    finally
    {
      for (;;) {}
    }
  }
  
  public static Editable.Factory getInstance()
  {
    if (sInstance == null) {
      synchronized (INSTANCE_LOCK)
      {
        if (sInstance == null)
        {
          EmojiEditableFactory localEmojiEditableFactory = new androidx/emoji2/viewsintegration/EmojiEditableFactory;
          localEmojiEditableFactory.<init>();
          sInstance = localEmojiEditableFactory;
        }
      }
    }
    return sInstance;
  }
  
  public Editable newEditable(@NonNull CharSequence paramCharSequence)
  {
    Class localClass = sWatcherClass;
    if (localClass != null) {
      return SpannableBuilder.create(localClass, paramCharSequence);
    }
    return super.newEditable(paramCharSequence);
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.viewsintegration.EmojiEditableFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */