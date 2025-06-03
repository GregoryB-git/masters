package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;
import androidx.emoji2.text.EmojiCompat.InitCallback;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

@RequiresApi(19)
@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
final class EmojiTextWatcher
  implements TextWatcher
{
  private final EditText mEditText;
  private int mEmojiReplaceStrategy = 0;
  private boolean mEnabled;
  private final boolean mExpectInitializedEmojiCompat;
  private EmojiCompat.InitCallback mInitCallback;
  private int mMaxEmojiCount = Integer.MAX_VALUE;
  
  public EmojiTextWatcher(EditText paramEditText, boolean paramBoolean)
  {
    mEditText = paramEditText;
    mExpectInitializedEmojiCompat = paramBoolean;
    mEnabled = true;
  }
  
  private EmojiCompat.InitCallback getInitCallback()
  {
    if (mInitCallback == null) {
      mInitCallback = new InitCallbackImpl(mEditText);
    }
    return mInitCallback;
  }
  
  public static void processTextOnEnablingEvent(@Nullable EditText paramEditText, int paramInt)
  {
    if ((paramInt == 1) && (paramEditText != null) && (paramEditText.isAttachedToWindow()))
    {
      paramEditText = paramEditText.getEditableText();
      paramInt = Selection.getSelectionStart(paramEditText);
      int i = Selection.getSelectionEnd(paramEditText);
      EmojiCompat.get().process(paramEditText);
      EmojiInputFilter.updateSelection(paramEditText, paramInt, i);
    }
  }
  
  private boolean shouldSkipForDisabledOrNotConfigured()
  {
    boolean bool;
    if ((mEnabled) && ((mExpectInitializedEmojiCompat) || (EmojiCompat.isConfigured()))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public int getEmojiReplaceStrategy()
  {
    return mEmojiReplaceStrategy;
  }
  
  public int getMaxEmojiCount()
  {
    return mMaxEmojiCount;
  }
  
  public boolean isEnabled()
  {
    return mEnabled;
  }
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((!mEditText.isInEditMode()) && (!shouldSkipForDisabledOrNotConfigured()) && (paramInt2 <= paramInt3) && ((paramCharSequence instanceof Spannable)))
    {
      paramInt2 = EmojiCompat.get().getLoadState();
      if (paramInt2 != 0) {
        if (paramInt2 != 1)
        {
          if (paramInt2 != 3) {
            return;
          }
        }
        else
        {
          paramCharSequence = (Spannable)paramCharSequence;
          EmojiCompat.get().process(paramCharSequence, paramInt1, paramInt1 + paramInt3, mMaxEmojiCount, mEmojiReplaceStrategy);
          return;
        }
      }
      EmojiCompat.get().registerInitCallback(getInitCallback());
    }
  }
  
  public void setEmojiReplaceStrategy(int paramInt)
  {
    mEmojiReplaceStrategy = paramInt;
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    if (mEnabled != paramBoolean)
    {
      if (mInitCallback != null) {
        EmojiCompat.get().unregisterInitCallback(mInitCallback);
      }
      mEnabled = paramBoolean;
      if (paramBoolean) {
        processTextOnEnablingEvent(mEditText, EmojiCompat.get().getLoadState());
      }
    }
  }
  
  public void setMaxEmojiCount(int paramInt)
  {
    mMaxEmojiCount = paramInt;
  }
  
  @RequiresApi(19)
  public static class InitCallbackImpl
    extends EmojiCompat.InitCallback
  {
    private final Reference<EditText> mViewRef;
    
    public InitCallbackImpl(EditText paramEditText)
    {
      mViewRef = new WeakReference(paramEditText);
    }
    
    public void onInitialized()
    {
      super.onInitialized();
      EmojiTextWatcher.processTextOnEnablingEvent((EditText)mViewRef.get(), 1);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.viewsintegration.EmojiTextWatcher
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */