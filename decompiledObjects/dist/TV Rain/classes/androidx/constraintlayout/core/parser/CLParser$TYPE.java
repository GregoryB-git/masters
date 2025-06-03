package androidx.constraintlayout.core.parser;

 enum CLParser$TYPE
{
  static
  {
    TYPE localTYPE1 = new TYPE("UNKNOWN", 0);
    UNKNOWN = localTYPE1;
    TYPE localTYPE2 = new TYPE("OBJECT", 1);
    OBJECT = localTYPE2;
    TYPE localTYPE3 = new TYPE("ARRAY", 2);
    ARRAY = localTYPE3;
    TYPE localTYPE4 = new TYPE("NUMBER", 3);
    NUMBER = localTYPE4;
    TYPE localTYPE5 = new TYPE("STRING", 4);
    STRING = localTYPE5;
    TYPE localTYPE6 = new TYPE("KEY", 5);
    KEY = localTYPE6;
    TYPE localTYPE7 = new TYPE("TOKEN", 6);
    TOKEN = localTYPE7;
    $VALUES = new TYPE[] { localTYPE1, localTYPE2, localTYPE3, localTYPE4, localTYPE5, localTYPE6, localTYPE7 };
  }
  
  private CLParser$TYPE() {}
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.parser.CLParser.TYPE
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */