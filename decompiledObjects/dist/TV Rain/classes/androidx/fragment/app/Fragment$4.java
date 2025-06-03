package androidx.fragment.app;

import android.view.View;
import androidx.annotation.Nullable;
import z2;

class Fragment$4
  extends FragmentContainer
{
  public Fragment$4(Fragment paramFragment) {}
  
  @Nullable
  public View onFindViewById(int paramInt)
  {
    Object localObject = this$0.mView;
    if (localObject != null) {
      return ((View)localObject).findViewById(paramInt);
    }
    localObject = z2.t("Fragment ");
    ((StringBuilder)localObject).append(this$0);
    ((StringBuilder)localObject).append(" does not have a view");
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  public boolean onHasView()
  {
    boolean bool;
    if (this$0.mView != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.Fragment.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */