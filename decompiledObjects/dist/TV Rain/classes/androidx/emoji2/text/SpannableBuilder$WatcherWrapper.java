package androidx.emoji2.text;

import android.os.Build.VERSION;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

class SpannableBuilder$WatcherWrapper
  implements TextWatcher, SpanWatcher
{
  private final AtomicInteger mBlockCalls = new AtomicInteger(0);
  public final Object mObject;
  
  public SpannableBuilder$WatcherWrapper(Object paramObject)
  {
    mObject = paramObject;
  }
  
  private boolean isEmojiSpan(Object paramObject)
  {
    return paramObject instanceof EmojiSpan;
  }
  
  public void afterTextChanged(Editable paramEditable)
  {
    ((TextWatcher)mObject).afterTextChanged(paramEditable);
  }
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    ((TextWatcher)mObject).beforeTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
  }
  
  public final void blockCalls()
  {
    mBlockCalls.incrementAndGet();
  }
  
  public void onSpanAdded(Spannable paramSpannable, Object paramObject, int paramInt1, int paramInt2)
  {
    if ((mBlockCalls.get() > 0) && (isEmojiSpan(paramObject))) {
      return;
    }
    ((SpanWatcher)mObject).onSpanAdded(paramSpannable, paramObject, paramInt1, paramInt2);
  }
  
  public void onSpanChanged(Spannable paramSpannable, Object paramObject, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((mBlockCalls.get() > 0) && (isEmojiSpan(paramObject))) {
      return;
    }
    if (Build.VERSION.SDK_INT < 28)
    {
      if (paramInt1 > paramInt2) {
        paramInt1 = 0;
      }
      if (paramInt3 > paramInt4) {
        paramInt3 = 0;
      } else {}
    }
    ((SpanWatcher)mObject).onSpanChanged(paramSpannable, paramObject, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void onSpanRemoved(Spannable paramSpannable, Object paramObject, int paramInt1, int paramInt2)
  {
    if ((mBlockCalls.get() > 0) && (isEmojiSpan(paramObject))) {
      return;
    }
    ((SpanWatcher)mObject).onSpanRemoved(paramSpannable, paramObject, paramInt1, paramInt2);
  }
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    ((TextWatcher)mObject).onTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
  }
  
  public final void unblockCalls()
  {
    mBlockCalls.decrementAndGet();
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.SpannableBuilder.WatcherWrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */