package androidx.recyclerview.widget;

public enum RecyclerView$Adapter$StateRestorationPolicy
{
  static
  {
    StateRestorationPolicy localStateRestorationPolicy1 = new StateRestorationPolicy("ALLOW", 0);
    ALLOW = localStateRestorationPolicy1;
    StateRestorationPolicy localStateRestorationPolicy2 = new StateRestorationPolicy("PREVENT_WHEN_EMPTY", 1);
    PREVENT_WHEN_EMPTY = localStateRestorationPolicy2;
    StateRestorationPolicy localStateRestorationPolicy3 = new StateRestorationPolicy("PREVENT", 2);
    PREVENT = localStateRestorationPolicy3;
    $VALUES = new StateRestorationPolicy[] { localStateRestorationPolicy1, localStateRestorationPolicy2, localStateRestorationPolicy3 };
  }
  
  private RecyclerView$Adapter$StateRestorationPolicy() {}
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */