package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

public class AlertController$AlertParams
{
  public ListAdapter mAdapter;
  public boolean mCancelable;
  public int mCheckedItem = -1;
  public boolean[] mCheckedItems;
  public final Context mContext;
  public Cursor mCursor;
  public View mCustomTitleView;
  public boolean mForceInverseBackground;
  public Drawable mIcon;
  public int mIconAttrId = 0;
  public int mIconId = 0;
  public final LayoutInflater mInflater;
  public String mIsCheckedColumn;
  public boolean mIsMultiChoice;
  public boolean mIsSingleChoice;
  public CharSequence[] mItems;
  public String mLabelColumn;
  public CharSequence mMessage;
  public Drawable mNegativeButtonIcon;
  public DialogInterface.OnClickListener mNegativeButtonListener;
  public CharSequence mNegativeButtonText;
  public Drawable mNeutralButtonIcon;
  public DialogInterface.OnClickListener mNeutralButtonListener;
  public CharSequence mNeutralButtonText;
  public DialogInterface.OnCancelListener mOnCancelListener;
  public DialogInterface.OnMultiChoiceClickListener mOnCheckboxClickListener;
  public DialogInterface.OnClickListener mOnClickListener;
  public DialogInterface.OnDismissListener mOnDismissListener;
  public AdapterView.OnItemSelectedListener mOnItemSelectedListener;
  public DialogInterface.OnKeyListener mOnKeyListener;
  public OnPrepareListViewListener mOnPrepareListViewListener;
  public Drawable mPositiveButtonIcon;
  public DialogInterface.OnClickListener mPositiveButtonListener;
  public CharSequence mPositiveButtonText;
  public boolean mRecycleOnMeasure = true;
  public CharSequence mTitle;
  public View mView;
  public int mViewLayoutResId;
  public int mViewSpacingBottom;
  public int mViewSpacingLeft;
  public int mViewSpacingRight;
  public boolean mViewSpacingSpecified = false;
  public int mViewSpacingTop;
  
  public AlertController$AlertParams(Context paramContext)
  {
    mContext = paramContext;
    mCancelable = true;
    mInflater = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
  }
  
  private void createListView(final AlertController paramAlertController)
  {
    final AlertController.RecycleListView localRecycleListView = (AlertController.RecycleListView)mInflater.inflate(mListLayout, null);
    if (mIsMultiChoice)
    {
      if (mCursor == null) {
        localObject = new ArrayAdapter(mContext, mMultiChoiceItemLayout, 16908308, mItems)
        {
          public View getView(int paramAnonymousInt, View paramAnonymousView, ViewGroup paramAnonymousViewGroup)
          {
            paramAnonymousViewGroup = super.getView(paramAnonymousInt, paramAnonymousView, paramAnonymousViewGroup);
            paramAnonymousView = mCheckedItems;
            if ((paramAnonymousView != null) && (paramAnonymousView[paramAnonymousInt] != 0)) {
              localRecycleListView.setItemChecked(paramAnonymousInt, true);
            }
            return paramAnonymousViewGroup;
          }
        };
      } else {
        localObject = new CursorAdapter(mContext, mCursor, false)
        {
          private final int mIsCheckedIndex;
          private final int mLabelIndex;
          
          public void bindView(View paramAnonymousView, Context paramAnonymousContext, Cursor paramAnonymousCursor)
          {
            ((CheckedTextView)paramAnonymousView.findViewById(16908308)).setText(paramAnonymousCursor.getString(mLabelIndex));
            paramAnonymousView = localRecycleListView;
            int i = paramAnonymousCursor.getPosition();
            int j = paramAnonymousCursor.getInt(mIsCheckedIndex);
            boolean bool = true;
            if (j != 1) {
              bool = false;
            }
            paramAnonymousView.setItemChecked(i, bool);
          }
          
          public View newView(Context paramAnonymousContext, Cursor paramAnonymousCursor, ViewGroup paramAnonymousViewGroup)
          {
            return mInflater.inflate(paramAlertControllermMultiChoiceItemLayout, paramAnonymousViewGroup, false);
          }
        };
      }
    }
    else
    {
      int i;
      if (mIsSingleChoice) {
        i = mSingleChoiceItemLayout;
      } else {
        i = mListItemLayout;
      }
      if (mCursor != null)
      {
        localObject = new SimpleCursorAdapter(mContext, i, mCursor, new String[] { mLabelColumn }, new int[] { 16908308 });
      }
      else
      {
        localObject = mAdapter;
        if (localObject == null) {
          localObject = new AlertController.CheckedItemAdapter(mContext, i, 16908308, mItems);
        }
      }
    }
    OnPrepareListViewListener localOnPrepareListViewListener = mOnPrepareListViewListener;
    if (localOnPrepareListViewListener != null) {
      localOnPrepareListViewListener.onPrepareListView(localRecycleListView);
    }
    mAdapter = ((ListAdapter)localObject);
    mCheckedItem = mCheckedItem;
    if (mOnClickListener != null) {
      localRecycleListView.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          mOnClickListener.onClick(paramAlertControllermDialog, paramAnonymousInt);
          if (!mIsSingleChoice) {
            paramAlertControllermDialog.dismiss();
          }
        }
      });
    } else if (mOnCheckboxClickListener != null) {
      localRecycleListView.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          paramAnonymousAdapterView = mCheckedItems;
          if (paramAnonymousAdapterView != null) {
            paramAnonymousAdapterView[paramAnonymousInt] = localRecycleListView.isItemChecked(paramAnonymousInt);
          }
          mOnCheckboxClickListener.onClick(paramAlertControllermDialog, paramAnonymousInt, localRecycleListView.isItemChecked(paramAnonymousInt));
        }
      });
    }
    Object localObject = mOnItemSelectedListener;
    if (localObject != null) {
      localRecycleListView.setOnItemSelectedListener((AdapterView.OnItemSelectedListener)localObject);
    }
    if (mIsSingleChoice) {
      localRecycleListView.setChoiceMode(1);
    } else if (mIsMultiChoice) {
      localRecycleListView.setChoiceMode(2);
    }
    mListView = localRecycleListView;
  }
  
  public void apply(AlertController paramAlertController)
  {
    Object localObject = mCustomTitleView;
    int i;
    if (localObject != null)
    {
      paramAlertController.setCustomTitle((View)localObject);
    }
    else
    {
      localObject = mTitle;
      if (localObject != null) {
        paramAlertController.setTitle((CharSequence)localObject);
      }
      localObject = mIcon;
      if (localObject != null) {
        paramAlertController.setIcon((Drawable)localObject);
      }
      i = mIconId;
      if (i != 0) {
        paramAlertController.setIcon(i);
      }
      i = mIconAttrId;
      if (i != 0) {
        paramAlertController.setIcon(paramAlertController.getIconAttributeResId(i));
      }
    }
    localObject = mMessage;
    if (localObject != null) {
      paramAlertController.setMessage((CharSequence)localObject);
    }
    localObject = mPositiveButtonText;
    if ((localObject != null) || (mPositiveButtonIcon != null)) {
      paramAlertController.setButton(-1, (CharSequence)localObject, mPositiveButtonListener, null, mPositiveButtonIcon);
    }
    localObject = mNegativeButtonText;
    if ((localObject != null) || (mNegativeButtonIcon != null)) {
      paramAlertController.setButton(-2, (CharSequence)localObject, mNegativeButtonListener, null, mNegativeButtonIcon);
    }
    localObject = mNeutralButtonText;
    if ((localObject != null) || (mNeutralButtonIcon != null)) {
      paramAlertController.setButton(-3, (CharSequence)localObject, mNeutralButtonListener, null, mNeutralButtonIcon);
    }
    if ((mItems != null) || (mCursor != null) || (mAdapter != null)) {
      createListView(paramAlertController);
    }
    localObject = mView;
    if (localObject != null)
    {
      if (mViewSpacingSpecified) {
        paramAlertController.setView((View)localObject, mViewSpacingLeft, mViewSpacingTop, mViewSpacingRight, mViewSpacingBottom);
      } else {
        paramAlertController.setView((View)localObject);
      }
    }
    else
    {
      i = mViewLayoutResId;
      if (i != 0) {
        paramAlertController.setView(i);
      }
    }
  }
  
  public static abstract interface OnPrepareListViewListener
  {
    public abstract void onPrepareListView(ListView paramListView);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.AlertController.AlertParams
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */