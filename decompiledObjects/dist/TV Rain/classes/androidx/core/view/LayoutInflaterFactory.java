package androidx.core.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

@Deprecated
public abstract interface LayoutInflaterFactory
{
  public abstract View onCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet);
}

/* Location:
 * Qualified Name:     androidx.core.view.LayoutInflaterFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */