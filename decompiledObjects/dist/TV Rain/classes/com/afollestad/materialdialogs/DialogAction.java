package com.afollestad.materialdialogs;

public enum DialogAction
{
  static
  {
    DialogAction localDialogAction1 = new DialogAction("POSITIVE", 0);
    POSITIVE = localDialogAction1;
    DialogAction localDialogAction2 = new DialogAction("NEUTRAL", 1);
    NEUTRAL = localDialogAction2;
    DialogAction localDialogAction3 = new DialogAction("NEGATIVE", 2);
    NEGATIVE = localDialogAction3;
    $VALUES = new DialogAction[] { localDialogAction1, localDialogAction2, localDialogAction3 };
  }
  
  private DialogAction() {}
}

/* Location:
 * Qualified Name:     com.afollestad.materialdialogs.DialogAction
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */