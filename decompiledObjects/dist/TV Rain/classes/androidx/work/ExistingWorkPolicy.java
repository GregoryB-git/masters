package androidx.work;

public enum ExistingWorkPolicy
{
  static
  {
    ExistingWorkPolicy localExistingWorkPolicy1 = new ExistingWorkPolicy("REPLACE", 0);
    REPLACE = localExistingWorkPolicy1;
    ExistingWorkPolicy localExistingWorkPolicy2 = new ExistingWorkPolicy("KEEP", 1);
    KEEP = localExistingWorkPolicy2;
    ExistingWorkPolicy localExistingWorkPolicy3 = new ExistingWorkPolicy("APPEND", 2);
    APPEND = localExistingWorkPolicy3;
    ExistingWorkPolicy localExistingWorkPolicy4 = new ExistingWorkPolicy("APPEND_OR_REPLACE", 3);
    APPEND_OR_REPLACE = localExistingWorkPolicy4;
    $VALUES = new ExistingWorkPolicy[] { localExistingWorkPolicy1, localExistingWorkPolicy2, localExistingWorkPolicy3, localExistingWorkPolicy4 };
  }
  
  private ExistingWorkPolicy() {}
}

/* Location:
 * Qualified Name:     androidx.work.ExistingWorkPolicy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */