package androidx.core.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater.Factory2;
import android.view.View;
import androidx.annotation.NonNull;

class LayoutInflaterCompat$Factory2Wrapper
  implements LayoutInflater.Factory2
{
  public final LayoutInflaterFactory mDelegateFactory;
  
  public LayoutInflaterCompat$Factory2Wrapper(LayoutInflaterFactory paramLayoutInflaterFactory)
  {
    mDelegateFactory = paramLayoutInflaterFactory;
  }
  
  public View onCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    return mDelegateFactory.onCreateView(paramView, paramString, paramContext, paramAttributeSet);
  }
  
  public View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    return mDelegateFactory.onCreateView(null, paramString, paramContext, paramAttributeSet);
  }
  
  @NonNull
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(getClass().getName());
    localStringBuilder.append("{");
    localStringBuilder.append(mDelegateFactory);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.LayoutInflaterCompat.Factory2Wrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */