package androidx.room;

public enum FtsOptions$Order
{
  static
  {
    Order localOrder1 = new Order("ASC", 0);
    ASC = localOrder1;
    Order localOrder2 = new Order("DESC", 1);
    DESC = localOrder2;
    $VALUES = new Order[] { localOrder1, localOrder2 };
  }
  
  private FtsOptions$Order() {}
}

/* Location:
 * Qualified Name:     androidx.room.FtsOptions.Order
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */