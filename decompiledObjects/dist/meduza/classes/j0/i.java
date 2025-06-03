package j0;

import android.content.ClipData;
import android.content.ClipData.Item;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import e0.c;
import e0.c.e;
import e0.u;

public final class i
  implements u
{
  public final c a(View paramView, c paramc)
  {
    if (Log.isLoggable("ReceiveContent", 3))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("onReceive: ");
      ((StringBuilder)localObject).append(paramc);
      Log.d("ReceiveContent", ((StringBuilder)localObject).toString());
    }
    if (a.c() == 2) {
      return paramc;
    }
    Object localObject = a.a();
    int i = a.w();
    paramView = (TextView)paramView;
    Editable localEditable = (Editable)paramView.getText();
    Context localContext = paramView.getContext();
    int j = 0;
    int m;
    for (int k = j; j < ((ClipData)localObject).getItemCount(); k = m)
    {
      paramView = ((ClipData)localObject).getItemAt(j);
      if ((i & 0x1) != 0)
      {
        paramc = paramView.coerceToText(localContext);
        paramView = paramc;
        if ((paramc instanceof Spanned)) {
          paramView = paramc.toString();
        }
      }
      else
      {
        paramView = paramView.coerceToStyledText(localContext);
      }
      m = k;
      if (paramView != null) {
        if (k == 0)
        {
          int n = Selection.getSelectionStart(localEditable);
          k = Selection.getSelectionEnd(localEditable);
          m = Math.max(0, Math.min(n, k));
          k = Math.max(0, Math.max(n, k));
          Selection.setSelection(localEditable, k);
          localEditable.replace(m, k, paramView);
          m = 1;
        }
        else
        {
          localEditable.insert(Selection.getSelectionEnd(localEditable), "\n");
          localEditable.insert(Selection.getSelectionEnd(localEditable), paramView);
          m = k;
        }
      }
      j++;
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     j0.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */