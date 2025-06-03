package Q3;

public enum l
{
  static
  {
    l locall1 = new l("DEBUG", 0);
    o = locall1;
    l locall2 = new l("INFO", 1);
    p = locall2;
    l locall3 = new l("WARN", 2);
    q = locall3;
    l locall4 = new l("ERROR", 3);
    r = locall4;
    l locall5 = new l("NONE", 4);
    s = locall5;
    t = new l[] { locall1, locall2, locall3, locall4, locall5 };
  }
}

/* Location:
 * Qualified Name:     Q3.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */