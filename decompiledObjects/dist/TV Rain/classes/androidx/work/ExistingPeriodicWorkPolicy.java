package androidx.work;

public enum ExistingPeriodicWorkPolicy
{
  static
  {
    ExistingPeriodicWorkPolicy localExistingPeriodicWorkPolicy1 = new ExistingPeriodicWorkPolicy("REPLACE", 0);
    REPLACE = localExistingPeriodicWorkPolicy1;
    ExistingPeriodicWorkPolicy localExistingPeriodicWorkPolicy2 = new ExistingPeriodicWorkPolicy("KEEP", 1);
    KEEP = localExistingPeriodicWorkPolicy2;
    $VALUES = new ExistingPeriodicWorkPolicy[] { localExistingPeriodicWorkPolicy1, localExistingPeriodicWorkPolicy2 };
  }
  
  private ExistingPeriodicWorkPolicy() {}
}

/* Location:
 * Qualified Name:     androidx.work.ExistingPeriodicWorkPolicy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */