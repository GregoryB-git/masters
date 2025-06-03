package io.flutter.plugin.editing;

import android.text.Editable;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;

class ListenableEditingState$1
  extends BaseInputConnection
{
  public ListenableEditingState$1(ListenableEditingState paramListenableEditingState, View paramView, boolean paramBoolean, Editable paramEditable)
  {
    super(paramView, paramBoolean);
  }
  
  public Editable getEditable()
  {
    return val$self;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.editing.ListenableEditingState.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */