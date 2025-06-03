package androidx.work;

public enum OutOfQuotaPolicy
{
  static
  {
    OutOfQuotaPolicy localOutOfQuotaPolicy1 = new OutOfQuotaPolicy("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
    RUN_AS_NON_EXPEDITED_WORK_REQUEST = localOutOfQuotaPolicy1;
    OutOfQuotaPolicy localOutOfQuotaPolicy2 = new OutOfQuotaPolicy("DROP_WORK_REQUEST", 1);
    DROP_WORK_REQUEST = localOutOfQuotaPolicy2;
    $VALUES = new OutOfQuotaPolicy[] { localOutOfQuotaPolicy1, localOutOfQuotaPolicy2 };
  }
  
  private OutOfQuotaPolicy() {}
}

/* Location:
 * Qualified Name:     androidx.work.OutOfQuotaPolicy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */