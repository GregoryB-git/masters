package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public final class SpannableBuilder
  extends SpannableStringBuilder
{
  @NonNull
  private final Class<?> mWatcherClass;
  @NonNull
  private final List<WatcherWrapper> mWatchers = new ArrayList();
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public SpannableBuilder(@NonNull Class<?> paramClass)
  {
    Preconditions.checkNotNull(paramClass, "watcherClass cannot be null");
    mWatcherClass = paramClass;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public SpannableBuilder(@NonNull Class<?> paramClass, @NonNull CharSequence paramCharSequence)
  {
    super(paramCharSequence);
    Preconditions.checkNotNull(paramClass, "watcherClass cannot be null");
    mWatcherClass = paramClass;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public SpannableBuilder(@NonNull Class<?> paramClass, @NonNull CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    super(paramCharSequence, paramInt1, paramInt2);
    Preconditions.checkNotNull(paramClass, "watcherClass cannot be null");
    mWatcherClass = paramClass;
  }
  
  private void blockWatchers()
  {
    for (int i = 0; i < mWatchers.size(); i++) {
      ((WatcherWrapper)mWatchers.get(i)).blockCalls();
    }
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public static SpannableBuilder create(@NonNull Class<?> paramClass, @NonNull CharSequence paramCharSequence)
  {
    return new SpannableBuilder(paramClass, paramCharSequence);
  }
  
  private void fireWatchers()
  {
    for (int i = 0; i < mWatchers.size(); i++) {
      ((WatcherWrapper)mWatchers.get(i)).onTextChanged(this, 0, length(), length());
    }
  }
  
  private WatcherWrapper getWatcherFor(Object paramObject)
  {
    for (int i = 0; i < mWatchers.size(); i++)
    {
      WatcherWrapper localWatcherWrapper = (WatcherWrapper)mWatchers.get(i);
      if (mObject == paramObject) {
        return localWatcherWrapper;
      }
    }
    return null;
  }
  
  private boolean isWatcher(@NonNull Class<?> paramClass)
  {
    boolean bool;
    if (mWatcherClass == paramClass) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private boolean isWatcher(@Nullable Object paramObject)
  {
    boolean bool;
    if ((paramObject != null) && (isWatcher(paramObject.getClass()))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private void unblockwatchers()
  {
    for (int i = 0; i < mWatchers.size(); i++) {
      ((WatcherWrapper)mWatchers.get(i)).unblockCalls();
    }
  }
  
  @NonNull
  public SpannableStringBuilder append(char paramChar)
  {
    super.append(paramChar);
    return this;
  }
  
  @NonNull
  public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence paramCharSequence)
  {
    super.append(paramCharSequence);
    return this;
  }
  
  @NonNull
  public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    super.append(paramCharSequence, paramInt1, paramInt2);
    return this;
  }
  
  @SuppressLint({"UnknownNullness"})
  public SpannableStringBuilder append(CharSequence paramCharSequence, Object paramObject, int paramInt)
  {
    super.append(paramCharSequence, paramObject, paramInt);
    return this;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public void beginBatchEdit()
  {
    blockWatchers();
  }
  
  @SuppressLint({"UnknownNullness"})
  public SpannableStringBuilder delete(int paramInt1, int paramInt2)
  {
    super.delete(paramInt1, paramInt2);
    return this;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public void endBatchEdit()
  {
    unblockwatchers();
    fireWatchers();
  }
  
  public int getSpanEnd(@Nullable Object paramObject)
  {
    Object localObject = paramObject;
    if (isWatcher(paramObject))
    {
      WatcherWrapper localWatcherWrapper = getWatcherFor(paramObject);
      localObject = paramObject;
      if (localWatcherWrapper != null) {
        localObject = localWatcherWrapper;
      }
    }
    return super.getSpanEnd(localObject);
  }
  
  public int getSpanFlags(@Nullable Object paramObject)
  {
    Object localObject = paramObject;
    if (isWatcher(paramObject))
    {
      WatcherWrapper localWatcherWrapper = getWatcherFor(paramObject);
      localObject = paramObject;
      if (localWatcherWrapper != null) {
        localObject = localWatcherWrapper;
      }
    }
    return super.getSpanFlags(localObject);
  }
  
  public int getSpanStart(@Nullable Object paramObject)
  {
    Object localObject = paramObject;
    if (isWatcher(paramObject))
    {
      WatcherWrapper localWatcherWrapper = getWatcherFor(paramObject);
      localObject = paramObject;
      if (localWatcherWrapper != null) {
        localObject = localWatcherWrapper;
      }
    }
    return super.getSpanStart(localObject);
  }
  
  @SuppressLint({"UnknownNullness"})
  public <T> T[] getSpans(int paramInt1, int paramInt2, @NonNull Class<T> paramClass)
  {
    if (isWatcher(paramClass))
    {
      WatcherWrapper[] arrayOfWatcherWrapper = (WatcherWrapper[])super.getSpans(paramInt1, paramInt2, WatcherWrapper.class);
      paramClass = (Object[])Array.newInstance(paramClass, arrayOfWatcherWrapper.length);
      for (paramInt1 = 0; paramInt1 < arrayOfWatcherWrapper.length; paramInt1++) {
        paramClass[paramInt1] = mObject;
      }
      return paramClass;
    }
    return super.getSpans(paramInt1, paramInt2, paramClass);
  }
  
  @SuppressLint({"UnknownNullness"})
  public SpannableStringBuilder insert(int paramInt, CharSequence paramCharSequence)
  {
    super.insert(paramInt, paramCharSequence);
    return this;
  }
  
  @SuppressLint({"UnknownNullness"})
  public SpannableStringBuilder insert(int paramInt1, CharSequence paramCharSequence, int paramInt2, int paramInt3)
  {
    super.insert(paramInt1, paramCharSequence, paramInt2, paramInt3);
    return this;
  }
  
  public int nextSpanTransition(int paramInt1, int paramInt2, @Nullable Class paramClass)
  {
    Class localClass;
    if (paramClass != null)
    {
      localClass = paramClass;
      if (!isWatcher(paramClass)) {}
    }
    else
    {
      localClass = WatcherWrapper.class;
    }
    return super.nextSpanTransition(paramInt1, paramInt2, localClass);
  }
  
  public void removeSpan(@Nullable Object paramObject)
  {
    WatcherWrapper localWatcherWrapper2;
    if (isWatcher(paramObject))
    {
      WatcherWrapper localWatcherWrapper1 = getWatcherFor(paramObject);
      localWatcherWrapper2 = localWatcherWrapper1;
      if (localWatcherWrapper1 != null)
      {
        paramObject = localWatcherWrapper1;
        localWatcherWrapper2 = localWatcherWrapper1;
      }
    }
    else
    {
      localWatcherWrapper2 = null;
    }
    super.removeSpan(paramObject);
    if (localWatcherWrapper2 != null) {
      mWatchers.remove(localWatcherWrapper2);
    }
  }
  
  @SuppressLint({"UnknownNullness"})
  public SpannableStringBuilder replace(int paramInt1, int paramInt2, CharSequence paramCharSequence)
  {
    blockWatchers();
    super.replace(paramInt1, paramInt2, paramCharSequence);
    unblockwatchers();
    return this;
  }
  
  @SuppressLint({"UnknownNullness"})
  public SpannableStringBuilder replace(int paramInt1, int paramInt2, CharSequence paramCharSequence, int paramInt3, int paramInt4)
  {
    blockWatchers();
    super.replace(paramInt1, paramInt2, paramCharSequence, paramInt3, paramInt4);
    unblockwatchers();
    return this;
  }
  
  public void setSpan(@Nullable Object paramObject, int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject = paramObject;
    if (isWatcher(paramObject))
    {
      localObject = new WatcherWrapper(paramObject);
      mWatchers.add(localObject);
    }
    super.setSpan(localObject, paramInt1, paramInt2, paramInt3);
  }
  
  @SuppressLint({"UnknownNullness"})
  public CharSequence subSequence(int paramInt1, int paramInt2)
  {
    return new SpannableBuilder(mWatcherClass, this, paramInt1, paramInt2);
  }
  
  public static class WatcherWrapper
    implements TextWatcher, SpanWatcher
  {
    private final AtomicInteger mBlockCalls = new AtomicInteger(0);
    public final Object mObject;
    
    public WatcherWrapper(Object paramObject)
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
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.SpannableBuilder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */