package androidx.constraintlayout.core.widgets.analyzer;

 enum DependencyNode$Type
{
  static
  {
    Type localType1 = new Type("UNKNOWN", 0);
    UNKNOWN = localType1;
    Type localType2 = new Type("HORIZONTAL_DIMENSION", 1);
    HORIZONTAL_DIMENSION = localType2;
    Type localType3 = new Type("VERTICAL_DIMENSION", 2);
    VERTICAL_DIMENSION = localType3;
    Type localType4 = new Type("LEFT", 3);
    LEFT = localType4;
    Type localType5 = new Type("RIGHT", 4);
    RIGHT = localType5;
    Type localType6 = new Type("TOP", 5);
    TOP = localType6;
    Type localType7 = new Type("BOTTOM", 6);
    BOTTOM = localType7;
    Type localType8 = new Type("BASELINE", 7);
    BASELINE = localType8;
    $VALUES = new Type[] { localType1, localType2, localType3, localType4, localType5, localType6, localType7, localType8 };
  }
  
  private DependencyNode$Type() {}
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */