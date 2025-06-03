package androidx.constraintlayout.core;

public enum SolverVariable$Type
{
  static
  {
    Type localType1 = new Type("UNRESTRICTED", 0);
    UNRESTRICTED = localType1;
    Type localType2 = new Type("CONSTANT", 1);
    CONSTANT = localType2;
    Type localType3 = new Type("SLACK", 2);
    SLACK = localType3;
    Type localType4 = new Type("ERROR", 3);
    ERROR = localType4;
    Type localType5 = new Type("UNKNOWN", 4);
    UNKNOWN = localType5;
    $VALUES = new Type[] { localType1, localType2, localType3, localType4, localType5 };
  }
  
  private SolverVariable$Type() {}
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.SolverVariable.Type
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */