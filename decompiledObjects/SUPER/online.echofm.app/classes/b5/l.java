package b5;

public enum l
{
  static
  {
    l locall1 = new l("FORCE_NONE", 0);
    o = locall1;
    l locall2 = new l("FORCE_SQUARE", 1);
    p = locall2;
    l locall3 = new l("FORCE_RECTANGLE", 2);
    q = locall3;
    r = new l[] { locall1, locall2, locall3 };
  }
}

/* Location:
 * Qualified Name:     b5.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */