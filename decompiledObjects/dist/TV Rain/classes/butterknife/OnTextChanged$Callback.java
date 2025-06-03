package butterknife;

import butterknife.internal.ListenerMethod;

public enum OnTextChanged$Callback
{
  static
  {
    Callback localCallback1 = new Callback("TEXT_CHANGED", 0);
    TEXT_CHANGED = localCallback1;
    Callback localCallback2 = new Callback("BEFORE_TEXT_CHANGED", 1);
    BEFORE_TEXT_CHANGED = localCallback2;
    Callback localCallback3 = new Callback("AFTER_TEXT_CHANGED", 2);
    AFTER_TEXT_CHANGED = localCallback3;
    $VALUES = new Callback[] { localCallback1, localCallback2, localCallback3 };
  }
  
  private OnTextChanged$Callback() {}
}

/* Location:
 * Qualified Name:     butterknife.OnTextChanged.Callback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */