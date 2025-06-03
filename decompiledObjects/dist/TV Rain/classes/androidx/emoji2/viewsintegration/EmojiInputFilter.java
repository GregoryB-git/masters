package androidx.emoji2.viewsintegration;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;
import androidx.emoji2.text.EmojiCompat.InitCallback;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

@RequiresApi(19)
@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
final class EmojiInputFilter
  implements InputFilter
{
  private EmojiCompat.InitCallback mInitCallback;
  private final TextView mTextView;
  
  public EmojiInputFilter(@NonNull TextView paramTextView)
  {
    mTextView = paramTextView;
  }
  
  private EmojiCompat.InitCallback getInitCallback()
  {
    if (mInitCallback == null) {
      mInitCallback = new InitCallbackImpl(mTextView, this);
    }
    return mInitCallback;
  }
  
  public static void updateSelection(Spannable paramSpannable, int paramInt1, int paramInt2)
  {
    if ((paramInt1 >= 0) && (paramInt2 >= 0)) {
      Selection.setSelection(paramSpannable, paramInt1, paramInt2);
    } else if (paramInt1 >= 0) {
      Selection.setSelection(paramSpannable, paramInt1);
    } else if (paramInt2 >= 0) {
      Selection.setSelection(paramSpannable, paramInt2);
    }
  }
  
  public CharSequence filter(CharSequence paramCharSequence, int paramInt1, int paramInt2, Spanned paramSpanned, int paramInt3, int paramInt4)
  {
    if (mTextView.isInEditMode()) {
      return paramCharSequence;
    }
    int i = EmojiCompat.get().getLoadState();
    if (i != 0)
    {
      int j = 1;
      if (i != 1)
      {
        if (i != 3) {
          return paramCharSequence;
        }
      }
      else
      {
        i = j;
        if (paramInt4 == 0)
        {
          i = j;
          if (paramInt3 == 0)
          {
            i = j;
            if (paramSpanned.length() == 0)
            {
              i = j;
              if (paramCharSequence == mTextView.getText()) {
                i = 0;
              }
            }
          }
        }
        paramSpanned = paramCharSequence;
        if (i != 0)
        {
          paramSpanned = paramCharSequence;
          if (paramCharSequence != null)
          {
            if ((paramInt1 != 0) || (paramInt2 != paramCharSequence.length())) {
              paramCharSequence = paramCharSequence.subSequence(paramInt1, paramInt2);
            }
            paramSpanned = EmojiCompat.get().process(paramCharSequence, 0, paramCharSequence.length());
          }
        }
        return paramSpanned;
      }
    }
    EmojiCompat.get().registerInitCallback(getInitCallback());
    return paramCharSequence;
  }
  
  @RequiresApi(19)
  public static class InitCallbackImpl
    extends EmojiCompat.InitCallback
  {
    private final Reference<EmojiInputFilter> mEmojiInputFilterReference;
    private final Reference<TextView> mViewRef;
    
    public InitCallbackImpl(TextView paramTextView, EmojiInputFilter paramEmojiInputFilter)
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
}

/* Location:
 * Qualified Name:     androidx.emoji2.viewsintegration.EmojiInputFilter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */