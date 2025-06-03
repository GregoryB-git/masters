package t0;

import android.os.Build.VERSION;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public final class h
  extends SpannableStringBuilder
{
  public final Class<?> a;
  public final ArrayList b = new ArrayList();
  
  public h(Class<?> paramClass, CharSequence paramCharSequence)
  {
    super(paramCharSequence);
    if (paramClass != null)
    {
      a = paramClass;
      return;
    }
    throw new NullPointerException("watcherClass cannot be null");
  }
  
  public h(Class<?> paramClass, CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    super(paramCharSequence, paramInt1, paramInt2);
    if (paramClass != null)
    {
      a = paramClass;
      return;
    }
    throw new NullPointerException("watcherClass cannot be null");
  }
  
  public final void a()
  {
    for (int i = 0; i < b.size(); i++) {
      b.get(i)).b.incrementAndGet();
    }
  }
  
  public final Editable append(char paramChar)
  {
    super.append(paramChar);
    return this;
  }
  
  public final Editable append(CharSequence paramCharSequence)
  {
    super.append(paramCharSequence);
    return this;
  }
  
  public final Editable append(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    super.append(paramCharSequence, paramInt1, paramInt2);
    return this;
  }
  
  public final SpannableStringBuilder append(char paramChar)
  {
    super.append(paramChar);
    return this;
  }
  
  public final SpannableStringBuilder append(CharSequence paramCharSequence)
  {
    super.append(paramCharSequence);
    return this;
  }
  
  public final SpannableStringBuilder append(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    super.append(paramCharSequence, paramInt1, paramInt2);
    return this;
  }
  
  public final SpannableStringBuilder append(CharSequence paramCharSequence, Object paramObject, int paramInt)
  {
    super.append(paramCharSequence, paramObject, paramInt);
    return this;
  }
  
  public final Appendable append(char paramChar)
  {
    super.append(paramChar);
    return this;
  }
  
  public final Appendable append(CharSequence paramCharSequence)
  {
    super.append(paramCharSequence);
    return this;
  }
  
  public final Appendable append(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    super.append(paramCharSequence, paramInt1, paramInt2);
    return this;
  }
  
  public final void b()
  {
    e();
    for (int i = 0; i < b.size(); i++) {
      ((a)b.get(i)).onTextChanged(this, 0, length(), length());
    }
  }
  
  public final a c(Object paramObject)
  {
    for (int i = 0; i < b.size(); i++)
    {
      a locala = (a)b.get(i);
      if (a == paramObject) {
        return locala;
      }
    }
    return null;
  }
  
  public final boolean d(Object paramObject)
  {
    boolean bool = true;
    if (paramObject != null)
    {
      paramObject = paramObject.getClass();
      int i;
      if (a == paramObject) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0) {}
    }
    else
    {
      bool = false;
    }
    return bool;
  }
  
  public final Editable delete(int paramInt1, int paramInt2)
  {
    super.delete(paramInt1, paramInt2);
    return this;
  }
  
  public final SpannableStringBuilder delete(int paramInt1, int paramInt2)
  {
    super.delete(paramInt1, paramInt2);
    return this;
  }
  
  public final void e()
  {
    for (int i = 0; i < b.size(); i++) {
      b.get(i)).b.decrementAndGet();
    }
  }
  
  public final int getSpanEnd(Object paramObject)
  {
    Object localObject = paramObject;
    if (d(paramObject))
    {
      a locala = c(paramObject);
      localObject = paramObject;
      if (locala != null) {
        localObject = locala;
      }
    }
    return super.getSpanEnd(localObject);
  }
  
  public final int getSpanFlags(Object paramObject)
  {
    Object localObject = paramObject;
    if (d(paramObject))
    {
      a locala = c(paramObject);
      localObject = paramObject;
      if (locala != null) {
        localObject = locala;
      }
    }
    return super.getSpanFlags(localObject);
  }
  
  public final int getSpanStart(Object paramObject)
  {
    Object localObject = paramObject;
    if (d(paramObject))
    {
      a locala = c(paramObject);
      localObject = paramObject;
      if (locala != null) {
        localObject = locala;
      }
    }
    return super.getSpanStart(localObject);
  }
  
  public final <T> T[] getSpans(int paramInt1, int paramInt2, Class<T> paramClass)
  {
    Object localObject = a;
    int i = 0;
    int j;
    if (localObject == paramClass) {
      j = 1;
    } else {
      j = 0;
    }
    if (j != 0)
    {
      localObject = (a[])super.getSpans(paramInt1, paramInt2, a.class);
      paramClass = (Object[])Array.newInstance(paramClass, localObject.length);
      for (paramInt1 = i; paramInt1 < localObject.length; paramInt1++) {
        paramClass[paramInt1] = a;
      }
      return paramClass;
    }
    return super.getSpans(paramInt1, paramInt2, paramClass);
  }
  
  public final Editable insert(int paramInt, CharSequence paramCharSequence)
  {
    super.insert(paramInt, paramCharSequence);
    return this;
  }
  
  public final Editable insert(int paramInt1, CharSequence paramCharSequence, int paramInt2, int paramInt3)
  {
    super.insert(paramInt1, paramCharSequence, paramInt2, paramInt3);
    return this;
  }
  
  public final SpannableStringBuilder insert(int paramInt, CharSequence paramCharSequence)
  {
    super.insert(paramInt, paramCharSequence);
    return this;
  }
  
  public final SpannableStringBuilder insert(int paramInt1, CharSequence paramCharSequence, int paramInt2, int paramInt3)
  {
    super.insert(paramInt1, paramCharSequence, paramInt2, paramInt3);
    return this;
  }
  
  public final int nextSpanTransition(int paramInt1, int paramInt2, Class paramClass)
  {
    if (paramClass != null)
    {
      int i;
      if (a == paramClass) {
        i = 1;
      } else {
        i = 0;
      }
      if (i == 0) {}
    }
    else
    {
      paramClass = a.class;
    }
    return super.nextSpanTransition(paramInt1, paramInt2, paramClass);
  }
  
  public final void removeSpan(Object paramObject)
  {
    a locala2;
    if (d(paramObject))
    {
      a locala1 = c(paramObject);
      locala2 = locala1;
      if (locala1 != null)
      {
        paramObject = locala1;
        locala2 = locala1;
      }
    }
    else
    {
      locala2 = null;
    }
    super.removeSpan(paramObject);
    if (locala2 != null) {
      b.remove(locala2);
    }
  }
  
  public final SpannableStringBuilder replace(int paramInt1, int paramInt2, CharSequence paramCharSequence)
  {
    a();
    super.replace(paramInt1, paramInt2, paramCharSequence);
    e();
    return this;
  }
  
  public final SpannableStringBuilder replace(int paramInt1, int paramInt2, CharSequence paramCharSequence, int paramInt3, int paramInt4)
  {
    a();
    super.replace(paramInt1, paramInt2, paramCharSequence, paramInt3, paramInt4);
    e();
    return this;
  }
  
  public final void setSpan(Object paramObject, int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject = paramObject;
    if (d(paramObject))
    {
      localObject = new a(paramObject);
      b.add(localObject);
    }
    super.setSpan(localObject, paramInt1, paramInt2, paramInt3);
  }
  
  public final CharSequence subSequence(int paramInt1, int paramInt2)
  {
    return new h(a, this, paramInt1, paramInt2);
  }
  
  public static final class a
    implements TextWatcher, SpanWatcher
  {
    public final Object a;
    public final AtomicInteger b = new AtomicInteger(0);
    
    public a(Object paramObject)
    {
      a = paramObject;
    }
    
    public final void afterTextChanged(Editable paramEditable)
    {
      ((TextWatcher)a).afterTextChanged(paramEditable);
    }
    
    public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
    {
      ((TextWatcher)a).beforeTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
    }
    
    public final void onSpanAdded(Spannable paramSpannable, Object paramObject, int paramInt1, int paramInt2)
    {
      if ((b.get() > 0) && ((paramObject instanceof f))) {
        return;
      }
      ((SpanWatcher)a).onSpanAdded(paramSpannable, paramObject, paramInt1, paramInt2);
    }
    
    public final void onSpanChanged(Spannable paramSpannable, Object paramObject, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      if ((b.get() > 0) && ((paramObject instanceof f))) {
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
      ((SpanWatcher)a).onSpanChanged(paramSpannable, paramObject, paramInt1, paramInt2, paramInt3, paramInt4);
    }
    
    public final void onSpanRemoved(Spannable paramSpannable, Object paramObject, int paramInt1, int paramInt2)
    {
      if ((b.get() > 0) && ((paramObject instanceof f))) {
        return;
      }
      ((SpanWatcher)a).onSpanRemoved(paramSpannable, paramObject, paramInt1, paramInt2);
    }
    
    public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
    {
      ((TextWatcher)a).onTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
    }
  }
}

/* Location:
 * Qualified Name:     t0.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */