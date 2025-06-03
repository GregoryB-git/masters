package androidx.emoji2.viewsintegration;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.emoji2.text.EmojiCompat;
import androidx.emoji2.text.EmojiCompat.InitCallback;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

@RequiresApi(19)
class EmojiInputFilter$InitCallbackImpl
  extends EmojiCompat.InitCallback
{
  private final Reference<EmojiInputFilter> mEmojiInputFilterReference;
  private final Reference<TextView> mViewRef;
  
  public EmojiInputFilter$InitCallbackImpl(TextView paramTextView, EmojiInputFilter paramEmojiInputFilter)
  {
    mViewRef = new WeakReference(paramTextView);
    mEmojiInputFilterReference = new WeakReference(paramEmojiInputFilter);
  }
  
  private boolean isInputFilterCurrentlyRegisteredOnTextView(@Nullable TextView paramTextView, @Nullable InputFilter paramInputFilter)
  {
    if ((paramInputFilter != null) && (paramTextView != null))
    {
      paramTextView = paramTextView.getFilters();
      if (paramTextView == null) {
        return false;
      }
      for (int i = 0; i < paramTextView.length; i++) {
        if (paramTextView[i] == paramInputFilter) {
          return true;
        }
      }
    }
    return false;
  }
  
  public void onInitialized()
  {
    super.onInitialized();
    TextView localTextView = (TextView)mViewRef.get();
    if (!isInputFilterCurrentlyRegisteredOnTextView(localTextView, (InputFilter)mEmojiInputFilterReference.get())) {
      return;
    }
    if (localTextView.isAttachedToWindow())
    {
      CharSequence localCharSequence1 = localTextView.getText();
      CharSequence localCharSequence2 = EmojiCompat.get().process(localCharSequence1);
      if (localCharSequence1 == localCharSequence2) {
        return;
      }
      int i = Selection.getSelectionStart(localCharSequence2);
      int j = Selection.getSelectionEnd(localCharSequence2);
      localTextView.setText(localCharSequence2);
      if ((localCharSequence2 instanceof Spannable)) {
        EmojiInputFilter.updateSelection((Spannable)localCharSequence2, i, j);
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.viewsintegration.EmojiInputFilter.InitCallbackImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */