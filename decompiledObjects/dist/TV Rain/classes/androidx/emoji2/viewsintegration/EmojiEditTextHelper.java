package androidx.emoji2.viewsintegration;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;

public final class EmojiEditTextHelper
{
  private int mEmojiReplaceStrategy = 0;
  private final HelperInternal mHelper;
  private int mMaxEmojiCount = Integer.MAX_VALUE;
  
  public EmojiEditTextHelper(@NonNull EditText paramEditText)
  {
    this(paramEditText, true);
  }
  
  public EmojiEditTextHelper(@NonNull EditText paramEditText, boolean paramBoolean)
  {
    Preconditions.checkNotNull(paramEditText, "editText cannot be null");
    mHelper = new HelperInternal19(paramEditText, paramBoolean);
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public int getEmojiReplaceStrategy()
  {
    return mEmojiReplaceStrategy;
  }
  
  @Nullable
  public KeyListener getKeyListener(@Nullable KeyListener paramKeyListener)
  {
    return mHelper.getKeyListener(paramKeyListener);
  }
  
  public int getMaxEmojiCount()
  {
    return mMaxEmojiCount;
  }
  
  public boolean isEnabled()
  {
    return mHelper.isEnabled();
  }
  
  @Nullable
  public InputConnection onCreateInputConnection(@Nullable InputConnection paramInputConnection, @NonNull EditorInfo paramEditorInfo)
  {
    if (paramInputConnection == null) {
      return null;
    }
    return mHelper.onCreateInputConnection(paramInputConnection, paramEditorInfo);
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public void setEmojiReplaceStrategy(int paramInt)
  {
    mEmojiReplaceStrategy = paramInt;
    mHelper.setEmojiReplaceStrategy(paramInt);
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    mHelper.setEnabled(paramBoolean);
  }
  
  public void setMaxEmojiCount(@IntRange(from=0L) int paramInt)
  {
    Preconditions.checkArgumentNonnegative(paramInt, "maxEmojiCount should be greater than 0");
    mMaxEmojiCount = paramInt;
    mHelper.setMaxEmojiCount(paramInt);
  }
  
  public static class HelperInternal
  {
    @Nullable
    public KeyListener getKeyListener(@Nullable KeyListener paramKeyListener)
    {
      return paramKeyListener;
    }
    
    public boolean isEnabled()
    {
      return false;
    }
    
    public InputConnection onCreateInputConnection(@NonNull InputConnection paramInputConnection, @NonNull EditorInfo paramEditorInfo)
    {
      return paramInputConnection;
    }
    
    public void setEmojiReplaceStrategy(int paramInt) {}
    
    public void setEnabled(boolean paramBoolean) {}
    
    public void setMaxEmojiCount(int paramInt) {}
  }
  
  @RequiresApi(19)
  public static class HelperInternal19
    extends EmojiEditTextHelper.HelperInternal
  {
    private final EditText mEditText;
    private final EmojiTextWatcher mTextWatcher;
    
    public HelperInternal19(@NonNull EditText paramEditText, boolean paramBoolean)
    {
      mEditText = paramEditText;
      EmojiTextWatcher localEmojiTextWatcher = new EmojiTextWatcher(paramEditText, paramBoolean);
      mTextWatcher = localEmojiTextWatcher;
      paramEditText.addTextChangedListener(localEmojiTextWatcher);
      paramEditText.setEditableFactory(EmojiEditableFactory.getInstance());
    }
    
    public KeyListener getKeyListener(@Nullable KeyListener paramKeyListener)
    {
      if ((paramKeyListener instanceof EmojiKeyListener)) {
        return paramKeyListener;
      }
      if (paramKeyListener == null) {
        return null;
      }
      if ((paramKeyListener instanceof NumberKeyListener)) {
        return paramKeyListener;
      }
      return new EmojiKeyListener(paramKeyListener);
    }
    
    public boolean isEnabled()
    {
      return mTextWatcher.isEnabled();
    }
    
    public InputConnection onCreateInputConnection(@NonNull InputConnection paramInputConnection, @NonNull EditorInfo paramEditorInfo)
    {
      if ((paramInputConnection instanceof EmojiInputConnection)) {
        return paramInputConnection;
      }
      return new EmojiInputConnection(mEditText, paramInputConnection, paramEditorInfo);
    }
    
    public void setEmojiReplaceStrategy(int paramInt)
    {
      mTextWatcher.setEmojiReplaceStrategy(paramInt);
    }
    
    public void setEnabled(boolean paramBoolean)
    {
      mTextWatcher.setEnabled(paramBoolean);
    }
    
    public void setMaxEmojiCount(int paramInt)
    {
      mTextWatcher.setMaxEmojiCount(paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.viewsintegration.EmojiEditTextHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */