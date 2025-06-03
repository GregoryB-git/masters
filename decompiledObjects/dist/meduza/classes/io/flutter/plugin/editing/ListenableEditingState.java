package io.flutter.plugin.editing;

import android.text.Editable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import f;
import io.flutter.Log;
import io.flutter.embedding.engine.systemchannels.TextInputChannel.TextEditState;
import java.util.ArrayList;
import java.util.Iterator;

class ListenableEditingState
  extends SpannableStringBuilder
{
  private static final String TAG = "ListenableEditingState";
  private int mBatchEditNestDepth = 0;
  private ArrayList<TextEditingDelta> mBatchTextEditingDeltas = new ArrayList();
  private int mChangeNotificationDepth = 0;
  private int mComposingEndWhenBeginBatchEdit;
  private int mComposingStartWhenBeginBatchEdit;
  private BaseInputConnection mDummyConnection = new BaseInputConnection(paramView, true)
  {
    public Editable getEditable()
    {
      return jdField_this;
    }
  };
  private ArrayList<EditingStateWatcher> mListeners = new ArrayList();
  private ArrayList<EditingStateWatcher> mPendingListeners = new ArrayList();
  private int mSelectionEndWhenBeginBatchEdit;
  private int mSelectionStartWhenBeginBatchEdit;
  private String mTextWhenBeginBatchEdit;
  private String mToStringCache;
  
  public ListenableEditingState(TextInputChannel.TextEditState paramTextEditState, View paramView)
  {
    if (paramTextEditState != null) {
      setEditingState(paramTextEditState);
    }
  }
  
  private void notifyListener(EditingStateWatcher paramEditingStateWatcher, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    mChangeNotificationDepth += 1;
    paramEditingStateWatcher.didChangeEditingState(paramBoolean1, paramBoolean2, paramBoolean3);
    mChangeNotificationDepth -= 1;
  }
  
  private void notifyListenersIfNeeded(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if ((paramBoolean1) || (paramBoolean2) || (paramBoolean3))
    {
      Iterator localIterator = mListeners.iterator();
      while (localIterator.hasNext()) {
        notifyListener((EditingStateWatcher)localIterator.next(), paramBoolean1, paramBoolean2, paramBoolean3);
      }
    }
  }
  
  public void addEditingStateListener(EditingStateWatcher paramEditingStateWatcher)
  {
    Object localObject;
    if (mChangeNotificationDepth > 0)
    {
      localObject = f.l("adding a listener ");
      ((StringBuilder)localObject).append(paramEditingStateWatcher.toString());
      ((StringBuilder)localObject).append(" in a listener callback");
      Log.e("ListenableEditingState", ((StringBuilder)localObject).toString());
    }
    if (mBatchEditNestDepth > 0)
    {
      Log.w("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
      localObject = mPendingListeners;
    }
    else
    {
      localObject = mListeners;
    }
    ((ArrayList)localObject).add(paramEditingStateWatcher);
  }
  
  public void beginBatchEdit()
  {
    mBatchEditNestDepth += 1;
    if (mChangeNotificationDepth > 0) {
      Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
    }
    if ((mBatchEditNestDepth == 1) && (!mListeners.isEmpty()))
    {
      mTextWhenBeginBatchEdit = toString();
      mSelectionStartWhenBeginBatchEdit = getSelectionStart();
      mSelectionEndWhenBeginBatchEdit = getSelectionEnd();
      mComposingStartWhenBeginBatchEdit = getComposingStart();
      mComposingEndWhenBeginBatchEdit = getComposingEnd();
    }
  }
  
  public void clearBatchDeltas()
  {
    mBatchTextEditingDeltas.clear();
  }
  
  public void endBatchEdit()
  {
    int i = mBatchEditNestDepth;
    if (i == 0)
    {
      Log.e("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
      return;
    }
    if (i == 1)
    {
      Object localObject = mPendingListeners.iterator();
      while (((Iterator)localObject).hasNext()) {
        notifyListener((EditingStateWatcher)((Iterator)localObject).next(), true, true, true);
      }
      if (!mListeners.isEmpty())
      {
        localObject = f.l("didFinishBatchEdit with ");
        ((StringBuilder)localObject).append(String.valueOf(mListeners.size()));
        ((StringBuilder)localObject).append(" listener(s)");
        Log.v("ListenableEditingState", ((StringBuilder)localObject).toString());
        boolean bool1 = toString().equals(mTextWhenBeginBatchEdit);
        int j = mSelectionStartWhenBeginBatchEdit;
        i = getSelectionStart();
        boolean bool2 = false;
        boolean bool3;
        if ((j == i) && (mSelectionEndWhenBeginBatchEdit == getSelectionEnd())) {
          bool3 = false;
        } else {
          bool3 = true;
        }
        if ((mComposingStartWhenBeginBatchEdit != getComposingStart()) || (mComposingEndWhenBeginBatchEdit != getComposingEnd())) {
          bool2 = true;
        }
        notifyListenersIfNeeded(bool1 ^ true, bool3, bool2);
      }
    }
    mListeners.addAll(mPendingListeners);
    mPendingListeners.clear();
    mBatchEditNestDepth -= 1;
  }
  
  public ArrayList<TextEditingDelta> extractBatchTextEditingDeltas()
  {
    ArrayList localArrayList = new ArrayList(mBatchTextEditingDeltas);
    mBatchTextEditingDeltas.clear();
    return localArrayList;
  }
  
  public final int getComposingEnd()
  {
    return BaseInputConnection.getComposingSpanEnd(this);
  }
  
  public final int getComposingStart()
  {
    return BaseInputConnection.getComposingSpanStart(this);
  }
  
  public final int getSelectionEnd()
  {
    return Selection.getSelectionEnd(this);
  }
  
  public final int getSelectionStart()
  {
    return Selection.getSelectionStart(this);
  }
  
  public void removeEditingStateListener(EditingStateWatcher paramEditingStateWatcher)
  {
    if (mChangeNotificationDepth > 0)
    {
      StringBuilder localStringBuilder = f.l("removing a listener ");
      localStringBuilder.append(paramEditingStateWatcher.toString());
      localStringBuilder.append(" in a listener callback");
      Log.e("ListenableEditingState", localStringBuilder.toString());
    }
    mListeners.remove(paramEditingStateWatcher);
    if (mBatchEditNestDepth > 0) {
      mPendingListeners.remove(paramEditingStateWatcher);
    }
  }
  
  public SpannableStringBuilder replace(int paramInt1, int paramInt2, CharSequence paramCharSequence, int paramInt3, int paramInt4)
  {
    if (mChangeNotificationDepth > 0) {
      Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
    }
    String str = toString();
    int i = paramInt2 - paramInt1;
    boolean bool1;
    if (i != paramInt4 - paramInt3) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    for (int j = 0; (j < i) && (!bool1); j++)
    {
      boolean bool2;
      if (charAt(paramInt1 + j) != paramCharSequence.charAt(paramInt3 + j)) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      bool1 |= bool2;
    }
    if (bool1) {
      mToStringCache = null;
    }
    j = getSelectionStart();
    int m = getSelectionEnd();
    int k = getComposingStart();
    i = getComposingEnd();
    SpannableStringBuilder localSpannableStringBuilder = super.replace(paramInt1, paramInt2, paramCharSequence, paramInt3, paramInt4);
    mBatchTextEditingDeltas.add(new TextEditingDelta(str, paramInt1, paramInt2, paramCharSequence, getSelectionStart(), getSelectionEnd(), getComposingStart(), getComposingEnd()));
    if (mBatchEditNestDepth > 0) {
      return localSpannableStringBuilder;
    }
    boolean bool3;
    if ((getSelectionStart() == j) && (getSelectionEnd() == m)) {
      bool3 = false;
    } else {
      bool3 = true;
    }
    boolean bool4;
    if ((getComposingStart() == k) && (getComposingEnd() == i)) {
      bool4 = false;
    } else {
      bool4 = true;
    }
    notifyListenersIfNeeded(bool1, bool3, bool4);
    return localSpannableStringBuilder;
  }
  
  public void setComposingRange(int paramInt1, int paramInt2)
  {
    if ((paramInt1 >= 0) && (paramInt1 < paramInt2)) {
      mDummyConnection.setComposingRegion(paramInt1, paramInt2);
    } else {
      BaseInputConnection.removeComposingSpans(this);
    }
  }
  
  public void setEditingState(TextInputChannel.TextEditState paramTextEditState)
  {
    beginBatchEdit();
    replace(0, length(), text);
    if (paramTextEditState.hasSelection()) {
      Selection.setSelection(this, selectionStart, selectionEnd);
    } else {
      Selection.removeSelection(this);
    }
    setComposingRange(composingStart, composingEnd);
    clearBatchDeltas();
    endBatchEdit();
  }
  
  public void setSpan(Object paramObject, int paramInt1, int paramInt2, int paramInt3)
  {
    super.setSpan(paramObject, paramInt1, paramInt2, paramInt3);
    mBatchTextEditingDeltas.add(new TextEditingDelta(toString(), getSelectionStart(), getSelectionEnd(), getComposingStart(), getComposingEnd()));
  }
  
  public String toString()
  {
    String str = mToStringCache;
    if (str == null)
    {
      str = super.toString();
      mToStringCache = str;
    }
    return str;
  }
  
  public static abstract interface EditingStateWatcher
  {
    public abstract void didChangeEditingState(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.editing.ListenableEditingState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */