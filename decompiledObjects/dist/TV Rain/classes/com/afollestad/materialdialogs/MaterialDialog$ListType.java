package com.afollestad.materialdialogs;

 enum MaterialDialog$ListType
{
  static
  {
    ListType localListType1 = new ListType("REGULAR", 0);
    REGULAR = localListType1;
    ListType localListType2 = new ListType("SINGLE", 1);
    SINGLE = localListType2;
    ListType localListType3 = new ListType("MULTI", 2);
    MULTI = localListType3;
    $VALUES = new ListType[] { localListType1, localListType2, localListType3 };
  }
  
  private MaterialDialog$ListType() {}
  
  public static int getLayoutForType(ListType paramListType)
  {
    int i = MaterialDialog.4.$SwitchMap$com$afollestad$materialdialogs$MaterialDialog$ListType[paramListType.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i == 3) {
          return R.layout.md_listitem_multichoice;
        }
        throw new IllegalArgumentException("Not a valid list type");
      }
      return R.layout.md_listitem_singlechoice;
    }
    return R.layout.md_listitem;
  }
}

/* Location:
 * Qualified Name:     com.afollestad.materialdialogs.MaterialDialog.ListType
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */