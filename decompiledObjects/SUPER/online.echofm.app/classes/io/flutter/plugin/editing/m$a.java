package io.flutter.plugin.editing;

import android.text.Editable;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;

public class m$a
  extends BaseInputConnection
{
  public m$a(m paramm, View paramView, boolean paramBoolean, Editable paramEditable)
  {
    super(paramView, paramBoolean);
  }
  
  public Editable getEditable()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.editing.m.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */