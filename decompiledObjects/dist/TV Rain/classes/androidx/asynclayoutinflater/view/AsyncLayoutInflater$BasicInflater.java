package androidx.asynclayoutinflater.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

class AsyncLayoutInflater$BasicInflater
  extends LayoutInflater
{
  private static final String[] sClassPrefixList = { "android.widget.", "android.webkit.", "android.app." };
  
  public AsyncLayoutInflater$BasicInflater(Context paramContext)
  {
    super(paramContext);
  }
  
  public LayoutInflater cloneInContext(Context paramContext)
  {
    return new BasicInflater(paramContext);
  }
  
  public View onCreateView(String paramString, AttributeSet paramAttributeSet)
    throws ClassNotFoundException
  {
    for (Object localObject : sClassPrefixList) {
      try
      {
        localObject = createView(paramString, (String)localObject, paramAttributeSet);
        if (localObject != null) {
          return (View)localObject;
        }
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        for (;;) {}
      }
    }
    return super.onCreateView(paramString, paramAttributeSet);
  }
}

/* Location:
 * Qualified Name:     androidx.asynclayoutinflater.view.AsyncLayoutInflater.BasicInflater
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */