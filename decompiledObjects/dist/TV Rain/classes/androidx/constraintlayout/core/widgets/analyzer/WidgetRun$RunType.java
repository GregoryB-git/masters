package androidx.constraintlayout.core.widgets.analyzer;

 enum WidgetRun$RunType
{
  static
  {
    RunType localRunType1 = new RunType("NONE", 0);
    NONE = localRunType1;
    RunType localRunType2 = new RunType("START", 1);
    START = localRunType2;
    RunType localRunType3 = new RunType("END", 2);
    END = localRunType3;
    RunType localRunType4 = new RunType("CENTER", 3);
    CENTER = localRunType4;
    $VALUES = new RunType[] { localRunType1, localRunType2, localRunType3, localRunType4 };
  }
  
  private WidgetRun$RunType() {}
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */