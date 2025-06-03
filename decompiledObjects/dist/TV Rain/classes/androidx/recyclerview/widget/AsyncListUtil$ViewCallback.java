package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.UiThread;

public abstract class AsyncListUtil$ViewCallback
{
  public static final int HINT_SCROLL_ASC = 2;
  public static final int HINT_SCROLL_DESC = 1;
  public static final int HINT_SCROLL_NONE = 0;
  
  @UiThread
  public void extendRangeInto(@NonNull int[] paramArrayOfInt1, @NonNull int[] paramArrayOfInt2, int paramInt)
  {
    int i = paramArrayOfInt1[1];
    int j = paramArrayOfInt1[0];
    int k = i - j + 1;
    int m = k / 2;
    int n;
    if (paramInt == 1) {
      n = k;
    } else {
      n = m;
    }
    paramArrayOfInt2[0] = (j - n);
    if (paramInt != 2) {
      k = m;
    }
    paramArrayOfInt2[1] = (i + k);
  }
  
  @UiThread
  public abstract void getItemRangeInto(@NonNull int[] paramArrayOfInt);
  
  @UiThread
  public abstract void onDataRefresh();
  
  @UiThread
  public abstract void onItemLoaded(int paramInt);
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.AsyncListUtil.ViewCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */