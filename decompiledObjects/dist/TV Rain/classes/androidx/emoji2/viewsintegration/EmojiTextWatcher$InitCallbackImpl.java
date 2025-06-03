package androidx.emoji2.viewsintegration;

import android.widget.EditText;
import androidx.annotation.RequiresApi;
import androidx.emoji2.text.EmojiCompat.InitCallback;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

@RequiresApi(19)
class EmojiTextWatcher$InitCallbackImpl
  extends EmojiCompat.InitCallback
{
  private final Reference<EditText> mViewRef;
  
  public EmojiTextWatcher$InitCallbackImpl(EditText paramEditText)
  {
    mViewRef = new WeakReference(paramEditText);
  }
  
  public void onInitialized()
  {
    super.onInitialized();
    EmojiTextWatcher.processTextOnEnablingEvent((EditText)mViewRef.get(), 1);
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.viewsintegration.EmojiTextWatcher.InitCallbackImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */