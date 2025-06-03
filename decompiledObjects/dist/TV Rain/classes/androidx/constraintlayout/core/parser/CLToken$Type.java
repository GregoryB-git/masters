package androidx.constraintlayout.core.parser;

 enum CLToken$Type
{
  static
  {
    Type localType1 = new Type("UNKNOWN", 0);
    UNKNOWN = localType1;
    Type localType2 = new Type("TRUE", 1);
    TRUE = localType2;
    Type localType3 = new Type("FALSE", 2);
    FALSE = localType3;
    Type localType4 = new Type("NULL", 3);
    NULL = localType4;
    $VALUES = new Type[] { localType1, localType2, localType3, localType4 };
  }
  
  private CLToken$Type() {}
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.parser.CLToken.Type
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */