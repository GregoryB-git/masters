package androidx.constraintlayout.core.state;

public enum State$Helper
{
  static
  {
    Helper localHelper1 = new Helper("HORIZONTAL_CHAIN", 0);
    HORIZONTAL_CHAIN = localHelper1;
    Helper localHelper2 = new Helper("VERTICAL_CHAIN", 1);
    VERTICAL_CHAIN = localHelper2;
    Helper localHelper3 = new Helper("ALIGN_HORIZONTALLY", 2);
    ALIGN_HORIZONTALLY = localHelper3;
    Helper localHelper4 = new Helper("ALIGN_VERTICALLY", 3);
    ALIGN_VERTICALLY = localHelper4;
    Helper localHelper5 = new Helper("BARRIER", 4);
    BARRIER = localHelper5;
    Helper localHelper6 = new Helper("LAYER", 5);
    LAYER = localHelper6;
    Helper localHelper7 = new Helper("FLOW", 6);
    FLOW = localHelper7;
    $VALUES = new Helper[] { localHelper1, localHelper2, localHelper3, localHelper4, localHelper5, localHelper6, localHelper7 };
  }
  
  private State$Helper() {}
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.state.State.Helper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */