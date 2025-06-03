package androidx.work;

public enum BackoffPolicy
{
  static
  {
    BackoffPolicy localBackoffPolicy1 = new BackoffPolicy("EXPONENTIAL", 0);
    EXPONENTIAL = localBackoffPolicy1;
    BackoffPolicy localBackoffPolicy2 = new BackoffPolicy("LINEAR", 1);
    LINEAR = localBackoffPolicy2;
    $VALUES = new BackoffPolicy[] { localBackoffPolicy1, localBackoffPolicy2 };
  }
  
  private BackoffPolicy() {}
}

/* Location:
 * Qualified Name:     androidx.work.BackoffPolicy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */