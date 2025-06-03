package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;

@RequiresApi(19)
@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
final class EmojiKeyListener
  implements KeyListener
{
  private final EmojiCompatHandleKeyDownHelper mEmojiCompatHandleKeyDownHelper;
  private final KeyListener mKeyListener;
  
  public EmojiKeyListener(KeyListener paramKeyListener)
  {
    this(paramKeyListener, new EmojiCompatHandleKeyDownHelper());
  }
  
  public EmojiKeyListener(KeyListener paramKeyListener, EmojiCompatHandleKeyDownHelper paramEmojiCompatHandleKeyDownHelper)
  {
    mKeyListener = paramKeyListener;
    mEmojiCompatHandleKeyDownHelper = paramEmojiCompatHandleKeyDownHelper;
  }
  
  public void clearMetaKeyState(View paramView, Editable paramEditable, int paramInt)
  {
    mKeyListener.clearMetaKeyState(paramView, paramEditable, paramInt);
  }
  
  public int getInputType()
  {
    return mKeyListener.getInputType();
  }
  
  public boolean onKeyDown(View paramView, Editable paramEditable, int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool;
    if ((!mEmojiCompatHandleKeyDownHelper.handleKeyDown(paramEditable, paramInt, paramKeyEvent)) && (!mKeyListener.onKeyDown(paramView, paramEditable, paramInt, paramKeyEvent))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean onKeyOther(View paramView, Editable paramEditable, KeyEvent paramKeyEvent)
  {
    return mKeyListener.onKeyOther(paramView, paramEditable, paramKeyEvent);
  }
  
  public boolean onKeyUp(View paramView, Editable paramEditable, int paramInt, KeyEvent paramKeyEvent)
  {
    return mKeyListener.onKeyUp(paramView, paramEditable, paramInt, paramKeyEvent);
  }
  
  public static class EmojiCompatHandleKeyDownHelper
  {
    public boolean handleKeyDown(@NonNull Editable paramEditable, int paramInt, @NonNull KeyEvent paramKeyEvent)
    {
      return EmojiCompat.handleOnKeyDown(paramEditable, paramInt, paramKeyEvent);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.viewsintegration.EmojiKeyListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */