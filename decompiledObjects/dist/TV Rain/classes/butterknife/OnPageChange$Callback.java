package butterknife;

import butterknife.internal.ListenerMethod;

public enum OnPageChange$Callback
{
  static
  {
    Callback localCallback1 = new Callback("PAGE_SELECTED", 0);
    PAGE_SELECTED = localCallback1;
    Callback localCallback2 = new Callback("PAGE_SCROLLED", 1);
    PAGE_SCROLLED = localCallback2;
    Callback localCallback3 = new Callback("PAGE_SCROLL_STATE_CHANGED", 2);
    PAGE_SCROLL_STATE_CHANGED = localCallback3;
    $VALUES = new Callback[] { localCallback1, localCallback2, localCallback3 };
  }
  
  private OnPageChange$Callback() {}
}

/* Location:
 * Qualified Name:     butterknife.OnPageChange.Callback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */