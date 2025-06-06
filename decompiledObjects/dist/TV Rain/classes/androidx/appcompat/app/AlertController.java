package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.id;
import androidx.appcompat.R.styleable;
import androidx.appcompat.widget.LinearLayoutCompat.LayoutParams;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;
import androidx.core.widget.NestedScrollView.OnScrollChangeListener;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

class AlertController
{
  public ListAdapter mAdapter;
  private int mAlertDialogLayout;
  private final View.OnClickListener mButtonHandler = new View.OnClickListener()
  {
    public void onClick(View paramAnonymousView)
    {
      AlertController localAlertController = AlertController.this;
      Message localMessage;
      if (paramAnonymousView == mButtonPositive)
      {
        localMessage = mButtonPositiveMessage;
        if (localMessage != null)
        {
          paramAnonymousView = Message.obtain(localMessage);
          break label82;
        }
      }
      if (paramAnonymousView == mButtonNegative)
      {
        localMessage = mButtonNegativeMessage;
        if (localMessage != null)
        {
          paramAnonymousView = Message.obtain(localMessage);
          break label82;
        }
      }
      if (paramAnonymousView == mButtonNeutral)
      {
        paramAnonymousView = mButtonNeutralMessage;
        if (paramAnonymousView != null)
        {
          paramAnonymousView = Message.obtain(paramAnonymousView);
          break label82;
        }
      }
      paramAnonymousView = null;
      label82:
      if (paramAnonymousView != null) {
        paramAnonymousView.sendToTarget();
      }
      paramAnonymousView = AlertController.this;
      mHandler.obtainMessage(1, mDialog).sendToTarget();
    }
  };
  private final int mButtonIconDimen;
  public Button mButtonNegative;
  private Drawable mButtonNegativeIcon;
  public Message mButtonNegativeMessage;
  private CharSequence mButtonNegativeText;
  public Button mButtonNeutral;
  private Drawable mButtonNeutralIcon;
  public Message mButtonNeutralMessage;
  private CharSequence mButtonNeutralText;
  private int mButtonPanelLayoutHint = 0;
  private int mButtonPanelSideLayout;
  public Button mButtonPositive;
  private Drawable mButtonPositiveIcon;
  public Message mButtonPositiveMessage;
  private CharSequence mButtonPositiveText;
  public int mCheckedItem = -1;
  private final Context mContext;
  private View mCustomTitleView;
  public final AppCompatDialog mDialog;
  public Handler mHandler;
  private Drawable mIcon;
  private int mIconId = 0;
  private ImageView mIconView;
  public int mListItemLayout;
  public int mListLayout;
  public ListView mListView;
  private CharSequence mMessage;
  private TextView mMessageView;
  public int mMultiChoiceItemLayout;
  public NestedScrollView mScrollView;
  private boolean mShowTitle;
  public int mSingleChoiceItemLayout;
  private CharSequence mTitle;
  private TextView mTitleView;
  private View mView;
  private int mViewLayoutResId;
  private int mViewSpacingBottom;
  private int mViewSpacingLeft;
  private int mViewSpacingRight;
  private boolean mViewSpacingSpecified = false;
  private int mViewSpacingTop;
  private final Window mWindow;
  
  public AlertController(Context paramContext, AppCompatDialog paramAppCompatDialog, Window paramWindow)
  {
    mContext = paramContext;
    mDialog = paramAppCompatDialog;
    mWindow = paramWindow;
    mHandler = new ButtonHandler(paramAppCompatDialog);
    paramContext = paramContext.obtainStyledAttributes(null, R.styleable.AlertDialog, R.attr.alertDialogStyle, 0);
    mAlertDialogLayout = paramContext.getResourceId(R.styleable.AlertDialog_android_layout, 0);
    mButtonPanelSideLayout = paramContext.getResourceId(R.styleable.AlertDialog_buttonPanelSideLayout, 0);
    mListLayout = paramContext.getResourceId(R.styleable.AlertDialog_listLayout, 0);
    mMultiChoiceItemLayout = paramContext.getResourceId(R.styleable.AlertDialog_multiChoiceItemLayout, 0);
    mSingleChoiceItemLayout = paramContext.getResourceId(R.styleable.AlertDialog_singleChoiceItemLayout, 0);
    mListItemLayout = paramContext.getResourceId(R.styleable.AlertDialog_listItemLayout, 0);
    mShowTitle = paramContext.getBoolean(R.styleable.AlertDialog_showTitle, true);
    mButtonIconDimen = paramContext.getDimensionPixelSize(R.styleable.AlertDialog_buttonIconDimen, 0);
    paramContext.recycle();
    paramAppCompatDialog.supportRequestWindowFeature(1);
  }
  
  public static boolean canTextInput(View paramView)
  {
    if (paramView.onCheckIsTextEditor()) {
      return true;
    }
    if (!(paramView instanceof ViewGroup)) {
      return false;
    }
    paramView = (ViewGroup)paramView;
    int i = paramView.getChildCount();
    while (i > 0)
    {
      int j = i - 1;
      i = j;
      if (canTextInput(paramView.getChildAt(j))) {
        return true;
      }
    }
    return false;
  }
  
  private void centerButton(Button paramButton)
  {
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)paramButton.getLayoutParams();
    gravity = 1;
    weight = 0.5F;
    paramButton.setLayoutParams(localLayoutParams);
  }
  
  public static void manageScrollIndicators(View paramView1, View paramView2, View paramView3)
  {
    int i = 0;
    int j;
    if (paramView2 != null)
    {
      if (paramView1.canScrollVertically(-1)) {
        j = 0;
      } else {
        j = 4;
      }
      paramView2.setVisibility(j);
    }
    if (paramView3 != null)
    {
      if (paramView1.canScrollVertically(1)) {
        j = i;
      } else {
        j = 4;
      }
      paramView3.setVisibility(j);
    }
  }
  
  @Nullable
  private ViewGroup resolvePanel(@Nullable View paramView1, @Nullable View paramView2)
  {
    if (paramView1 == null)
    {
      paramView1 = paramView2;
      if ((paramView2 instanceof ViewStub)) {
        paramView1 = ((ViewStub)paramView2).inflate();
      }
      return (ViewGroup)paramView1;
    }
    if (paramView2 != null)
    {
      ViewParent localViewParent = paramView2.getParent();
      if ((localViewParent instanceof ViewGroup)) {
        ((ViewGroup)localViewParent).removeView(paramView2);
      }
    }
    paramView2 = paramView1;
    if ((paramView1 instanceof ViewStub)) {
      paramView2 = ((ViewStub)paramView1).inflate();
    }
    return (ViewGroup)paramView2;
  }
  
  private int selectContentView()
  {
    int i = mButtonPanelSideLayout;
    if (i == 0) {
      return mAlertDialogLayout;
    }
    if (mButtonPanelLayoutHint == 1) {
      return i;
    }
    return mAlertDialogLayout;
  }
  
  private void setScrollIndicators(ViewGroup paramViewGroup, View paramView, int paramInt1, int paramInt2)
  {
    View localView1 = mWindow.findViewById(R.id.scrollIndicatorUp);
    View localView2 = mWindow.findViewById(R.id.scrollIndicatorDown);
    ViewCompat.setScrollIndicators(paramView, paramInt1, paramInt2);
    if (localView1 != null) {
      paramViewGroup.removeView(localView1);
    }
    if (localView2 != null) {
      paramViewGroup.removeView(localView2);
    }
  }
  
  private void setupButtons(ViewGroup paramViewGroup)
  {
    Object localObject = (Button)paramViewGroup.findViewById(16908313);
    mButtonPositive = ((Button)localObject);
    ((View)localObject).setOnClickListener(mButtonHandler);
    boolean bool = TextUtils.isEmpty(mButtonPositiveText);
    int i = 1;
    int j;
    if ((bool) && (mButtonPositiveIcon == null))
    {
      mButtonPositive.setVisibility(8);
      j = 0;
    }
    else
    {
      mButtonPositive.setText(mButtonPositiveText);
      localObject = mButtonPositiveIcon;
      if (localObject != null)
      {
        j = mButtonIconDimen;
        ((Drawable)localObject).setBounds(0, 0, j, j);
        mButtonPositive.setCompoundDrawables(mButtonPositiveIcon, null, null, null);
      }
      mButtonPositive.setVisibility(0);
      j = 1;
    }
    localObject = (Button)paramViewGroup.findViewById(16908314);
    mButtonNegative = ((Button)localObject);
    ((View)localObject).setOnClickListener(mButtonHandler);
    int k;
    if ((TextUtils.isEmpty(mButtonNegativeText)) && (mButtonNegativeIcon == null))
    {
      mButtonNegative.setVisibility(8);
    }
    else
    {
      mButtonNegative.setText(mButtonNegativeText);
      localObject = mButtonNegativeIcon;
      if (localObject != null)
      {
        k = mButtonIconDimen;
        ((Drawable)localObject).setBounds(0, 0, k, k);
        mButtonNegative.setCompoundDrawables(mButtonNegativeIcon, null, null, null);
      }
      mButtonNegative.setVisibility(0);
      j |= 0x2;
    }
    localObject = (Button)paramViewGroup.findViewById(16908315);
    mButtonNeutral = ((Button)localObject);
    ((View)localObject).setOnClickListener(mButtonHandler);
    if ((TextUtils.isEmpty(mButtonNeutralText)) && (mButtonNeutralIcon == null))
    {
      mButtonNeutral.setVisibility(8);
    }
    else
    {
      mButtonNeutral.setText(mButtonNeutralText);
      localObject = mButtonNeutralIcon;
      if (localObject != null)
      {
        k = mButtonIconDimen;
        ((Drawable)localObject).setBounds(0, 0, k, k);
        mButtonNeutral.setCompoundDrawables(mButtonNeutralIcon, null, null, null);
      }
      mButtonNeutral.setVisibility(0);
      j |= 0x4;
    }
    if (shouldCenterSingleButton(mContext)) {
      if (j == 1) {
        centerButton(mButtonPositive);
      } else if (j == 2) {
        centerButton(mButtonNegative);
      } else if (j == 4) {
        centerButton(mButtonNeutral);
      }
    }
    if (j != 0) {
      j = i;
    } else {
      j = 0;
    }
    if (j == 0) {
      paramViewGroup.setVisibility(8);
    }
  }
  
  private void setupContent(ViewGroup paramViewGroup)
  {
    Object localObject = (NestedScrollView)mWindow.findViewById(R.id.scrollView);
    mScrollView = ((NestedScrollView)localObject);
    ((View)localObject).setFocusable(false);
    mScrollView.setNestedScrollingEnabled(false);
    TextView localTextView = (TextView)paramViewGroup.findViewById(16908299);
    mMessageView = localTextView;
    if (localTextView == null) {
      return;
    }
    localObject = mMessage;
    if (localObject != null)
    {
      localTextView.setText((CharSequence)localObject);
    }
    else
    {
      localTextView.setVisibility(8);
      mScrollView.removeView(mMessageView);
      if (mListView != null)
      {
        paramViewGroup = (ViewGroup)mScrollView.getParent();
        int i = paramViewGroup.indexOfChild(mScrollView);
        paramViewGroup.removeViewAt(i);
        paramViewGroup.addView(mListView, i, new ViewGroup.LayoutParams(-1, -1));
      }
      else
      {
        paramViewGroup.setVisibility(8);
      }
    }
  }
  
  private void setupCustomContent(ViewGroup paramViewGroup)
  {
    View localView = mView;
    int i = 0;
    if (localView == null) {
      if (mViewLayoutResId != 0) {
        localView = LayoutInflater.from(mContext).inflate(mViewLayoutResId, paramViewGroup, false);
      } else {
        localView = null;
      }
    }
    if (localView != null) {
      i = 1;
    }
    if ((i == 0) || (!canTextInput(localView))) {
      mWindow.setFlags(131072, 131072);
    }
    if (i != 0)
    {
      FrameLayout localFrameLayout = (FrameLayout)mWindow.findViewById(R.id.custom);
      localFrameLayout.addView(localView, new ViewGroup.LayoutParams(-1, -1));
      if (mViewSpacingSpecified) {
        localFrameLayout.setPadding(mViewSpacingLeft, mViewSpacingTop, mViewSpacingRight, mViewSpacingBottom);
      }
      if (mListView != null) {
        getLayoutParamsweight = 0.0F;
      }
    }
    else
    {
      paramViewGroup.setVisibility(8);
    }
  }
  
  private void setupTitle(ViewGroup paramViewGroup)
  {
    if (mCustomTitleView != null)
    {
      ViewGroup.LayoutParams localLayoutParams = new ViewGroup.LayoutParams(-1, -2);
      paramViewGroup.addView(mCustomTitleView, 0, localLayoutParams);
      mWindow.findViewById(R.id.title_template).setVisibility(8);
    }
    else
    {
      mIconView = ((ImageView)mWindow.findViewById(16908294));
      if (((TextUtils.isEmpty(mTitle) ^ true)) && (mShowTitle))
      {
        paramViewGroup = (TextView)mWindow.findViewById(R.id.alertTitle);
        mTitleView = paramViewGroup;
        paramViewGroup.setText(mTitle);
        int i = mIconId;
        if (i != 0)
        {
          mIconView.setImageResource(i);
        }
        else
        {
          paramViewGroup = mIcon;
          if (paramViewGroup != null)
          {
            mIconView.setImageDrawable(paramViewGroup);
          }
          else
          {
            mTitleView.setPadding(mIconView.getPaddingLeft(), mIconView.getPaddingTop(), mIconView.getPaddingRight(), mIconView.getPaddingBottom());
            mIconView.setVisibility(8);
          }
        }
      }
      else
      {
        mWindow.findViewById(R.id.title_template).setVisibility(8);
        mIconView.setVisibility(8);
        paramViewGroup.setVisibility(8);
      }
    }
  }
  
  private void setupView()
  {
    Object localObject1 = mWindow.findViewById(R.id.parentPanel);
    int i = R.id.topPanel;
    Object localObject2 = ((View)localObject1).findViewById(i);
    int j = R.id.contentPanel;
    Object localObject3 = ((View)localObject1).findViewById(j);
    int k = R.id.buttonPanel;
    Object localObject4 = ((View)localObject1).findViewById(k);
    localObject1 = (ViewGroup)((View)localObject1).findViewById(R.id.customPanel);
    setupCustomContent((ViewGroup)localObject1);
    View localView1 = ((View)localObject1).findViewById(i);
    View localView2 = ((View)localObject1).findViewById(j);
    View localView3 = ((View)localObject1).findViewById(k);
    localObject2 = resolvePanel(localView1, (View)localObject2);
    localObject3 = resolvePanel(localView2, (View)localObject3);
    localObject4 = resolvePanel(localView3, (View)localObject4);
    setupContent((ViewGroup)localObject3);
    setupButtons((ViewGroup)localObject4);
    setupTitle((ViewGroup)localObject2);
    j = ((View)localObject1).getVisibility();
    k = 0;
    if (j != 8) {
      j = 1;
    } else {
      j = 0;
    }
    int m;
    if ((localObject2 != null) && (((View)localObject2).getVisibility() != 8)) {
      m = 1;
    } else {
      m = 0;
    }
    boolean bool;
    if ((localObject4 != null) && (((View)localObject4).getVisibility() != 8)) {
      bool = true;
    } else {
      bool = false;
    }
    if ((!bool) && (localObject3 != null))
    {
      localObject1 = ((View)localObject3).findViewById(R.id.textSpacerNoButtons);
      if (localObject1 != null) {
        ((View)localObject1).setVisibility(0);
      }
    }
    if (m != 0)
    {
      localObject1 = mScrollView;
      if (localObject1 != null) {
        ((ViewGroup)localObject1).setClipToPadding(true);
      }
      localObject1 = null;
      if ((mMessage != null) || (mListView != null)) {
        localObject1 = ((View)localObject2).findViewById(R.id.titleDividerNoCustom);
      }
      if (localObject1 != null) {
        ((View)localObject1).setVisibility(0);
      }
    }
    else if (localObject3 != null)
    {
      localObject1 = ((View)localObject3).findViewById(R.id.textSpacerNoTitle);
      if (localObject1 != null) {
        ((View)localObject1).setVisibility(0);
      }
    }
    localObject1 = mListView;
    if ((localObject1 instanceof RecycleListView)) {
      ((RecycleListView)localObject1).setHasDecor(m, bool);
    }
    if (j == 0)
    {
      localObject1 = mListView;
      if (localObject1 == null) {
        localObject1 = mScrollView;
      }
      if (localObject1 != null)
      {
        j = k;
        if (bool) {
          j = 2;
        }
        setScrollIndicators((ViewGroup)localObject3, (View)localObject1, m | j, 3);
      }
    }
    localObject1 = mListView;
    if (localObject1 != null)
    {
      localObject3 = mAdapter;
      if (localObject3 != null)
      {
        ((ListView)localObject1).setAdapter((ListAdapter)localObject3);
        j = mCheckedItem;
        if (j > -1)
        {
          ((AbsListView)localObject1).setItemChecked(j, true);
          ((ListView)localObject1).setSelection(j);
        }
      }
    }
  }
  
  private static boolean shouldCenterSingleButton(Context paramContext)
  {
    TypedValue localTypedValue = new TypedValue();
    paramContext = paramContext.getTheme();
    int i = R.attr.alertDialogCenterButtons;
    boolean bool = true;
    paramContext.resolveAttribute(i, localTypedValue, true);
    if (data == 0) {
      bool = false;
    }
    return bool;
  }
  
  public Button getButton(int paramInt)
  {
    if (paramInt != -3)
    {
      if (paramInt != -2)
      {
        if (paramInt != -1) {
          return null;
        }
        return mButtonPositive;
      }
      return mButtonNegative;
    }
    return mButtonNeutral;
  }
  
  public int getIconAttributeResId(int paramInt)
  {
    TypedValue localTypedValue = new TypedValue();
    mContext.getTheme().resolveAttribute(paramInt, localTypedValue, true);
    return resourceId;
  }
  
  public ListView getListView()
  {
    return mListView;
  }
  
  public void installContent()
  {
    int i = selectContentView();
    mDialog.setContentView(i);
    setupView();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    NestedScrollView localNestedScrollView = mScrollView;
    boolean bool;
    if ((localNestedScrollView != null) && (localNestedScrollView.executeKeyEvent(paramKeyEvent))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    NestedScrollView localNestedScrollView = mScrollView;
    boolean bool;
    if ((localNestedScrollView != null) && (localNestedScrollView.executeKeyEvent(paramKeyEvent))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void setButton(int paramInt, CharSequence paramCharSequence, DialogInterface.OnClickListener paramOnClickListener, Message paramMessage, Drawable paramDrawable)
  {
    Message localMessage = paramMessage;
    if (paramMessage == null)
    {
      localMessage = paramMessage;
      if (paramOnClickListener != null) {
        localMessage = mHandler.obtainMessage(paramInt, paramOnClickListener);
      }
    }
    if (paramInt != -3)
    {
      if (paramInt != -2)
      {
        if (paramInt == -1)
        {
          mButtonPositiveText = paramCharSequence;
          mButtonPositiveMessage = localMessage;
          mButtonPositiveIcon = paramDrawable;
        }
        else
        {
          throw new IllegalArgumentException("Button does not exist");
        }
      }
      else
      {
        mButtonNegativeText = paramCharSequence;
        mButtonNegativeMessage = localMessage;
        mButtonNegativeIcon = paramDrawable;
      }
    }
    else
    {
      mButtonNeutralText = paramCharSequence;
      mButtonNeutralMessage = localMessage;
      mButtonNeutralIcon = paramDrawable;
    }
  }
  
  public void setButtonPanelLayoutHint(int paramInt)
  {
    mButtonPanelLayoutHint = paramInt;
  }
  
  public void setCustomTitle(View paramView)
  {
    mCustomTitleView = paramView;
  }
  
  public void setIcon(int paramInt)
  {
    mIcon = null;
    mIconId = paramInt;
    ImageView localImageView = mIconView;
    if (localImageView != null) {
      if (paramInt != 0)
      {
        localImageView.setVisibility(0);
        mIconView.setImageResource(mIconId);
      }
      else
      {
        localImageView.setVisibility(8);
      }
    }
  }
  
  public void setIcon(Drawable paramDrawable)
  {
    mIcon = paramDrawable;
    mIconId = 0;
    ImageView localImageView = mIconView;
    if (localImageView != null) {
      if (paramDrawable != null)
      {
        localImageView.setVisibility(0);
        mIconView.setImageDrawable(paramDrawable);
      }
      else
      {
        localImageView.setVisibility(8);
      }
    }
  }
  
  public void setMessage(CharSequence paramCharSequence)
  {
    mMessage = paramCharSequence;
    TextView localTextView = mMessageView;
    if (localTextView != null) {
      localTextView.setText(paramCharSequence);
    }
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    mTitle = paramCharSequence;
    TextView localTextView = mTitleView;
    if (localTextView != null) {
      localTextView.setText(paramCharSequence);
    }
  }
  
  public void setView(int paramInt)
  {
    mView = null;
    mViewLayoutResId = paramInt;
    mViewSpacingSpecified = false;
  }
  
  public void setView(View paramView)
  {
    mView = paramView;
    mViewLayoutResId = 0;
    mViewSpacingSpecified = false;
  }
  
  public void setView(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    mView = paramView;
    mViewLayoutResId = 0;
    mViewSpacingSpecified = true;
    mViewSpacingLeft = paramInt1;
    mViewSpacingTop = paramInt2;
    mViewSpacingRight = paramInt3;
    mViewSpacingBottom = paramInt4;
  }
  
  public static class AlertParams
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
    
    public AlertParams(Context paramContext)
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
  
  public static final class ButtonHandler
    extends Handler
  {
    private static final int MSG_DISMISS_DIALOG = 1;
    private WeakReference<DialogInterface> mDialog;
    
    public ButtonHandler(DialogInterface paramDialogInterface)
    {
      mDialog = new WeakReference(paramDialogInterface);
    }
    
    public void handleMessage(Message paramMessage)
    {
      int i = what;
      if ((i != -3) && (i != -2) && (i != -1))
      {
        if (i == 1) {
          ((DialogInterface)obj).dismiss();
        }
      }
      else {
        ((DialogInterface.OnClickListener)obj).onClick((DialogInterface)mDialog.get(), what);
      }
    }
  }
  
  public static class CheckedItemAdapter
    extends ArrayAdapter<CharSequence>
  {
    public CheckedItemAdapter(Context paramContext, int paramInt1, int paramInt2, CharSequence[] paramArrayOfCharSequence)
    {
      super(paramInt1, paramInt2, paramArrayOfCharSequence);
    }
    
    public long getItemId(int paramInt)
    {
      return paramInt;
    }
    
    public boolean hasStableIds()
    {
      return true;
    }
  }
  
  public static class RecycleListView
    extends ListView
  {
    private final int mPaddingBottomNoButtons;
    private final int mPaddingTopNoTitle;
    
    public RecycleListView(Context paramContext)
    {
      this(paramContext, null);
    }
    
    public RecycleListView(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.RecycleListView);
      mPaddingBottomNoButtons = paramContext.getDimensionPixelOffset(R.styleable.RecycleListView_paddingBottomNoButtons, -1);
      mPaddingTopNoTitle = paramContext.getDimensionPixelOffset(R.styleable.RecycleListView_paddingTopNoTitle, -1);
    }
    
    public void setHasDecor(boolean paramBoolean1, boolean paramBoolean2)
    {
      if ((!paramBoolean2) || (!paramBoolean1))
      {
        int i = getPaddingLeft();
        int j;
        if (paramBoolean1) {
          j = getPaddingTop();
        } else {
          j = mPaddingTopNoTitle;
        }
        int k = getPaddingRight();
        int m;
        if (paramBoolean2) {
          m = getPaddingBottom();
        } else {
          m = mPaddingBottomNoButtons;
        }
        setPadding(i, j, k, m);
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.AlertController
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */