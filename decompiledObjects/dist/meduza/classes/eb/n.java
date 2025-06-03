package eb;

public enum n
{
  static
  {
    n localn1 = new n("CONNECTING", 0);
    a = localn1;
    n localn2 = new n("READY", 1);
    b = localn2;
    n localn3 = new n("TRANSIENT_FAILURE", 2);
    c = localn3;
    n localn4 = new n("IDLE", 3);
    d = localn4;
    n localn5 = new n("SHUTDOWN", 4);
    e = localn5;
    f = new n[] { localn1, localn2, localn3, localn4, localn5 };
  }
  
  public n() {}
}

/* Location:
 * Qualified Name:     eb.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */