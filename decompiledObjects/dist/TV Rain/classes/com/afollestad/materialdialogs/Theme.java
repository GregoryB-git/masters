package com.afollestad.materialdialogs;

public enum Theme
{
  static
  {
    Theme localTheme1 = new Theme("LIGHT", 0);
    LIGHT = localTheme1;
    Theme localTheme2 = new Theme("DARK", 1);
    DARK = localTheme2;
    $VALUES = new Theme[] { localTheme1, localTheme2 };
  }
  
  private Theme() {}
}

/* Location:
 * Qualified Name:     com.afollestad.materialdialogs.Theme
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */