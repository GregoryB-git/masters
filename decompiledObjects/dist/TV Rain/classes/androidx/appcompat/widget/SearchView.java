package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.dimen;
import androidx.appcompat.R.id;
import androidx.appcompat.R.layout;
import androidx.appcompat.R.string;
import androidx.appcompat.R.styleable;
import androidx.appcompat.view.CollapsibleActionView;
import androidx.core.view.ViewCompat;
import androidx.cursoradapter.widget.CursorAdapter;
import androidx.customview.view.AbsSavedState;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import o3;
import z2;

public class SearchView
  extends LinearLayoutCompat
  implements CollapsibleActionView
{
  public static final boolean DBG = false;
  private static final String IME_OPTION_NO_MICROPHONE = "nm";
  public static final String LOG_TAG = "SearchView";
  public static final PreQAutoCompleteTextViewReflector PRE_API_29_HIDDEN_METHOD_INVOKER;
  private Bundle mAppSearchData;
  private boolean mClearingFocus;
  public final ImageView mCloseButton;
  private final ImageView mCollapsedIcon;
  private int mCollapsedImeOptions;
  private final CharSequence mDefaultQueryHint;
  private final View mDropDownAnchor;
  private boolean mExpandedInActionView;
  public final ImageView mGoButton;
  private boolean mIconified;
  private boolean mIconifiedByDefault;
  private int mMaxWidth;
  private CharSequence mOldQueryText;
  private final View.OnClickListener mOnClickListener;
  private OnCloseListener mOnCloseListener;
  private final TextView.OnEditorActionListener mOnEditorActionListener;
  private final AdapterView.OnItemClickListener mOnItemClickListener;
  private final AdapterView.OnItemSelectedListener mOnItemSelectedListener;
  private OnQueryTextListener mOnQueryChangeListener;
  public View.OnFocusChangeListener mOnQueryTextFocusChangeListener;
  private View.OnClickListener mOnSearchClickListener;
  private OnSuggestionListener mOnSuggestionListener;
  private final WeakHashMap<String, Drawable.ConstantState> mOutsideDrawablesCache = new WeakHashMap();
  private CharSequence mQueryHint;
  private boolean mQueryRefinement;
  private Runnable mReleaseCursorRunnable = new Runnable()
  {
    public void run()
    {
      CursorAdapter localCursorAdapter = mSuggestionsAdapter;
      if ((localCursorAdapter instanceof SuggestionsAdapter)) {
        localCursorAdapter.changeCursor(null);
      }
    }
  };
  public final ImageView mSearchButton;
  private final View mSearchEditFrame;
  private final Drawable mSearchHintIcon;
  private final View mSearchPlate;
  public final SearchAutoComplete mSearchSrcTextView;
  private Rect mSearchSrcTextViewBounds = new Rect();
  private Rect mSearchSrtTextViewBoundsExpanded = new Rect();
  public SearchableInfo mSearchable;
  private final View mSubmitArea;
  private boolean mSubmitButtonEnabled;
  private final int mSuggestionCommitIconResId;
  private final int mSuggestionRowLayout;
  public CursorAdapter mSuggestionsAdapter;
  private int[] mTemp = new int[2];
  private int[] mTemp2 = new int[2];
  public View.OnKeyListener mTextKeyListener;
  private TextWatcher mTextWatcher;
  private UpdatableTouchDelegate mTouchDelegate;
  private final Runnable mUpdateDrawableStateRunnable = new Runnable()
  {
    public void run()
    {
      updateFocusedState();
    }
  };
  private CharSequence mUserQuery;
  private final Intent mVoiceAppSearchIntent;
  public final ImageView mVoiceButton;
  private boolean mVoiceButtonEnabled;
  private final Intent mVoiceWebSearchIntent;
  
  static
  {
    PreQAutoCompleteTextViewReflector localPreQAutoCompleteTextViewReflector;
    if (Build.VERSION.SDK_INT < 29) {
      localPreQAutoCompleteTextViewReflector = new PreQAutoCompleteTextViewReflector();
    } else {
      localPreQAutoCompleteTextViewReflector = null;
    }
    PRE_API_29_HIDDEN_METHOD_INVOKER = localPreQAutoCompleteTextViewReflector;
  }
  
  public SearchView(@NonNull Context paramContext)
  {
    this(paramContext, null);
  }
  
  public SearchView(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, R.attr.searchViewStyle);
  }
  
  public SearchView(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    View.OnClickListener local5 = new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        SearchView localSearchView = SearchView.this;
        if (paramAnonymousView == mSearchButton) {
          localSearchView.onSearchClicked();
        } else if (paramAnonymousView == mCloseButton) {
          localSearchView.onCloseClicked();
        } else if (paramAnonymousView == mGoButton) {
          localSearchView.onSubmitQuery();
        } else if (paramAnonymousView == mVoiceButton) {
          localSearchView.onVoiceClicked();
        } else if (paramAnonymousView == mSearchSrcTextView) {
          localSearchView.forceSuggestionQuery();
        }
      }
    };
    mOnClickListener = local5;
    mTextKeyListener = new View.OnKeyListener()
    {
      public boolean onKey(View paramAnonymousView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        SearchView localSearchView = SearchView.this;
        if (mSearchable == null) {
          return false;
        }
        if ((mSearchSrcTextView.isPopupShowing()) && (mSearchSrcTextView.getListSelection() != -1)) {
          return onSuggestionsKey(paramAnonymousView, paramAnonymousInt, paramAnonymousKeyEvent);
        }
        if ((!mSearchSrcTextView.isEmpty()) && (paramAnonymousKeyEvent.hasNoModifiers()) && (paramAnonymousKeyEvent.getAction() == 1) && (paramAnonymousInt == 66))
        {
          paramAnonymousView.cancelLongPress();
          paramAnonymousView = SearchView.this;
          paramAnonymousView.launchQuerySearch(0, null, mSearchSrcTextView.getText().toString());
          return true;
        }
        return false;
      }
    };
    TextView.OnEditorActionListener local7 = new TextView.OnEditorActionListener()
    {
      public boolean onEditorAction(TextView paramAnonymousTextView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        onSubmitQuery();
        return true;
      }
    };
    mOnEditorActionListener = local7;
    AdapterView.OnItemClickListener local8 = new AdapterView.OnItemClickListener()
    {
      public void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        onItemClicked(paramAnonymousInt, 0, null);
      }
    };
    mOnItemClickListener = local8;
    AdapterView.OnItemSelectedListener local9 = new AdapterView.OnItemSelectedListener()
    {
      public void onItemSelected(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        onItemSelected(paramAnonymousInt);
      }
      
      public void onNothingSelected(AdapterView<?> paramAnonymousAdapterView) {}
    };
    mOnItemSelectedListener = local9;
    mTextWatcher = new TextWatcher()
    {
      public void afterTextChanged(Editable paramAnonymousEditable) {}
      
      public void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3) {}
      
      public void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        onTextChanged(paramAnonymousCharSequence);
      }
    };
    Object localObject = R.styleable.SearchView;
    TintTypedArray localTintTypedArray = TintTypedArray.obtainStyledAttributes(paramContext, paramAttributeSet, (int[])localObject, paramInt, 0);
    ViewCompat.saveAttributeDataForStyleable(this, paramContext, (int[])localObject, paramAttributeSet, localTintTypedArray.getWrappedTypeArray(), paramInt, 0);
    LayoutInflater.from(paramContext).inflate(localTintTypedArray.getResourceId(R.styleable.SearchView_layout, R.layout.abc_search_view), this, true);
    paramContext = (SearchAutoComplete)findViewById(R.id.search_src_text);
    mSearchSrcTextView = paramContext;
    paramContext.setSearchView(this);
    mSearchEditFrame = findViewById(R.id.search_edit_frame);
    paramAttributeSet = findViewById(R.id.search_plate);
    mSearchPlate = paramAttributeSet;
    View localView = findViewById(R.id.submit_area);
    mSubmitArea = localView;
    ImageView localImageView1 = (ImageView)findViewById(R.id.search_button);
    mSearchButton = localImageView1;
    ImageView localImageView2 = (ImageView)findViewById(R.id.search_go_btn);
    mGoButton = localImageView2;
    ImageView localImageView3 = (ImageView)findViewById(R.id.search_close_btn);
    mCloseButton = localImageView3;
    localObject = (ImageView)findViewById(R.id.search_voice_btn);
    mVoiceButton = ((ImageView)localObject);
    ImageView localImageView4 = (ImageView)findViewById(R.id.search_mag_icon);
    mCollapsedIcon = localImageView4;
    ViewCompat.setBackground(paramAttributeSet, localTintTypedArray.getDrawable(R.styleable.SearchView_queryBackground));
    ViewCompat.setBackground(localView, localTintTypedArray.getDrawable(R.styleable.SearchView_submitBackground));
    paramInt = R.styleable.SearchView_searchIcon;
    localImageView1.setImageDrawable(localTintTypedArray.getDrawable(paramInt));
    localImageView2.setImageDrawable(localTintTypedArray.getDrawable(R.styleable.SearchView_goIcon));
    localImageView3.setImageDrawable(localTintTypedArray.getDrawable(R.styleable.SearchView_closeIcon));
    ((ImageView)localObject).setImageDrawable(localTintTypedArray.getDrawable(R.styleable.SearchView_voiceIcon));
    localImageView4.setImageDrawable(localTintTypedArray.getDrawable(paramInt));
    mSearchHintIcon = localTintTypedArray.getDrawable(R.styleable.SearchView_searchHintIcon);
    TooltipCompat.setTooltipText(localImageView1, getResources().getString(R.string.abc_searchview_description_search));
    mSuggestionRowLayout = localTintTypedArray.getResourceId(R.styleable.SearchView_suggestionRowLayout, R.layout.abc_search_dropdown_item_icons_2line);
    mSuggestionCommitIconResId = localTintTypedArray.getResourceId(R.styleable.SearchView_commitIcon, 0);
    localImageView1.setOnClickListener(local5);
    localImageView3.setOnClickListener(local5);
    localImageView2.setOnClickListener(local5);
    ((View)localObject).setOnClickListener(local5);
    paramContext.setOnClickListener(local5);
    paramContext.addTextChangedListener(mTextWatcher);
    paramContext.setOnEditorActionListener(local7);
    paramContext.setOnItemClickListener(local8);
    paramContext.setOnItemSelectedListener(local9);
    paramContext.setOnKeyListener(mTextKeyListener);
    paramContext.setOnFocusChangeListener(new View.OnFocusChangeListener()
    {
      public void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
      {
        paramAnonymousView = SearchView.this;
        View.OnFocusChangeListener localOnFocusChangeListener = mOnQueryTextFocusChangeListener;
        if (localOnFocusChangeListener != null) {
          localOnFocusChangeListener.onFocusChange(paramAnonymousView, paramAnonymousBoolean);
        }
      }
    });
    setIconifiedByDefault(localTintTypedArray.getBoolean(R.styleable.SearchView_iconifiedByDefault, true));
    paramInt = localTintTypedArray.getDimensionPixelSize(R.styleable.SearchView_android_maxWidth, -1);
    if (paramInt != -1) {
      setMaxWidth(paramInt);
    }
    mDefaultQueryHint = localTintTypedArray.getText(R.styleable.SearchView_defaultQueryHint);
    mQueryHint = localTintTypedArray.getText(R.styleable.SearchView_queryHint);
    paramInt = localTintTypedArray.getInt(R.styleable.SearchView_android_imeOptions, -1);
    if (paramInt != -1) {
      setImeOptions(paramInt);
    }
    paramInt = localTintTypedArray.getInt(R.styleable.SearchView_android_inputType, -1);
    if (paramInt != -1) {
      setInputType(paramInt);
    }
    setFocusable(localTintTypedArray.getBoolean(R.styleable.SearchView_android_focusable, true));
    localTintTypedArray.recycle();
    paramAttributeSet = new Intent("android.speech.action.WEB_SEARCH");
    mVoiceWebSearchIntent = paramAttributeSet;
    paramAttributeSet.addFlags(268435456);
    paramAttributeSet.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
    paramAttributeSet = new Intent("android.speech.action.RECOGNIZE_SPEECH");
    mVoiceAppSearchIntent = paramAttributeSet;
    paramAttributeSet.addFlags(268435456);
    paramContext = findViewById(paramContext.getDropDownAnchor());
    mDropDownAnchor = paramContext;
    if (paramContext != null) {
      paramContext.addOnLayoutChangeListener(new View.OnLayoutChangeListener()
      {
        public void onLayoutChange(View paramAnonymousView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4, int paramAnonymousInt5, int paramAnonymousInt6, int paramAnonymousInt7, int paramAnonymousInt8)
        {
          adjustDropDownSizeAndPosition();
        }
      });
    }
    updateViewsVisibility(mIconifiedByDefault);
    updateQueryHint();
  }
  
  private Intent createIntent(String paramString1, Uri paramUri, String paramString2, String paramString3, int paramInt, String paramString4)
  {
    paramString1 = new Intent(paramString1);
    paramString1.addFlags(268435456);
    if (paramUri != null) {
      paramString1.setData(paramUri);
    }
    paramString1.putExtra("user_query", mUserQuery);
    if (paramString3 != null) {
      paramString1.putExtra("query", paramString3);
    }
    if (paramString2 != null) {
      paramString1.putExtra("intent_extra_data_key", paramString2);
    }
    paramUri = mAppSearchData;
    if (paramUri != null) {
      paramString1.putExtra("app_data", paramUri);
    }
    if (paramInt != 0)
    {
      paramString1.putExtra("action_key", paramInt);
      paramString1.putExtra("action_msg", paramString4);
    }
    paramString1.setComponent(mSearchable.getSearchActivity());
    return paramString1;
  }
  
  private Intent createIntentFromSuggestion(Cursor paramCursor, int paramInt, String paramString)
  {
    try
    {
      Object localObject1 = SuggestionsAdapter.getColumnString(paramCursor, "suggest_intent_action");
      Object localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = mSearchable.getSuggestIntentAction();
      }
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = "android.intent.action.SEARCH";
      }
      Object localObject3 = SuggestionsAdapter.getColumnString(paramCursor, "suggest_intent_data");
      localObject2 = localObject3;
      if (localObject3 == null) {
        localObject2 = mSearchable.getSuggestIntentData();
      }
      localObject3 = localObject2;
      if (localObject2 != null)
      {
        String str = SuggestionsAdapter.getColumnString(paramCursor, "suggest_intent_data_id");
        localObject3 = localObject2;
        if (str != null)
        {
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          ((StringBuilder)localObject3).append((String)localObject2);
          ((StringBuilder)localObject3).append("/");
          ((StringBuilder)localObject3).append(Uri.encode(str));
          localObject3 = ((StringBuilder)localObject3).toString();
        }
      }
      if (localObject3 == null) {
        localObject2 = null;
      } else {
        localObject2 = Uri.parse((String)localObject3);
      }
      localObject3 = SuggestionsAdapter.getColumnString(paramCursor, "suggest_intent_query");
      paramString = createIntent((String)localObject1, (Uri)localObject2, SuggestionsAdapter.getColumnString(paramCursor, "suggest_intent_extra_data"), (String)localObject3, paramInt, paramString);
      return paramString;
    }
    catch (RuntimeException paramString)
    {
      try
      {
        paramInt = paramCursor.getPosition();
      }
      catch (RuntimeException paramCursor)
      {
        paramInt = -1;
      }
      paramCursor = new StringBuilder();
      paramCursor.append("Search suggestions cursor at row ");
      paramCursor.append(paramInt);
      paramCursor.append(" returned exception.");
      Log.w("SearchView", paramCursor.toString(), paramString);
    }
    return null;
  }
  
  private Intent createVoiceAppSearchIntent(Intent paramIntent, SearchableInfo paramSearchableInfo)
  {
    ComponentName localComponentName = paramSearchableInfo.getSearchActivity();
    Object localObject1 = new Intent("android.intent.action.SEARCH");
    ((Intent)localObject1).setComponent(localComponentName);
    PendingIntent localPendingIntent = PendingIntent.getActivity(getContext(), 0, (Intent)localObject1, 1107296256);
    Bundle localBundle = new Bundle();
    localObject1 = mAppSearchData;
    if (localObject1 != null) {
      localBundle.putParcelable("app_data", (Parcelable)localObject1);
    }
    Intent localIntent = new Intent(paramIntent);
    int i = 1;
    Object localObject2 = getResources();
    if (paramSearchableInfo.getVoiceLanguageModeId() != 0) {
      paramIntent = ((Resources)localObject2).getString(paramSearchableInfo.getVoiceLanguageModeId());
    } else {
      paramIntent = "free_form";
    }
    int j = paramSearchableInfo.getVoicePromptTextId();
    Object localObject3 = null;
    if (j != 0) {
      localObject1 = ((Resources)localObject2).getString(paramSearchableInfo.getVoicePromptTextId());
    } else {
      localObject1 = null;
    }
    if (paramSearchableInfo.getVoiceLanguageId() != 0) {
      localObject2 = ((Resources)localObject2).getString(paramSearchableInfo.getVoiceLanguageId());
    } else {
      localObject2 = null;
    }
    if (paramSearchableInfo.getVoiceMaxResults() != 0) {
      i = paramSearchableInfo.getVoiceMaxResults();
    }
    localIntent.putExtra("android.speech.extra.LANGUAGE_MODEL", paramIntent);
    localIntent.putExtra("android.speech.extra.PROMPT", (String)localObject1);
    localIntent.putExtra("android.speech.extra.LANGUAGE", (String)localObject2);
    localIntent.putExtra("android.speech.extra.MAX_RESULTS", i);
    if (localComponentName == null) {
      paramIntent = (Intent)localObject3;
    } else {
      paramIntent = localComponentName.flattenToShortString();
    }
    localIntent.putExtra("calling_package", paramIntent);
    localIntent.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", localPendingIntent);
    localIntent.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", localBundle);
    return localIntent;
  }
  
  private Intent createVoiceWebSearchIntent(Intent paramIntent, SearchableInfo paramSearchableInfo)
  {
    Intent localIntent = new Intent(paramIntent);
    paramIntent = paramSearchableInfo.getSearchActivity();
    if (paramIntent == null) {
      paramIntent = null;
    } else {
      paramIntent = paramIntent.flattenToShortString();
    }
    localIntent.putExtra("calling_package", paramIntent);
    return localIntent;
  }
  
  private void dismissSuggestions()
  {
    mSearchSrcTextView.dismissDropDown();
  }
  
  private void getChildBoundsWithinSearchView(View paramView, Rect paramRect)
  {
    paramView.getLocationInWindow(mTemp);
    getLocationInWindow(mTemp2);
    int[] arrayOfInt1 = mTemp;
    int i = arrayOfInt1[1];
    int[] arrayOfInt2 = mTemp2;
    i -= arrayOfInt2[1];
    int j = arrayOfInt1[0] - arrayOfInt2[0];
    paramRect.set(j, i, paramView.getWidth() + j, paramView.getHeight() + i);
  }
  
  private CharSequence getDecoratedHint(CharSequence paramCharSequence)
  {
    if ((mIconifiedByDefault) && (mSearchHintIcon != null))
    {
      int i = (int)(mSearchSrcTextView.getTextSize() * 1.25D);
      mSearchHintIcon.setBounds(0, 0, i, i);
      SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder("   ");
      localSpannableStringBuilder.setSpan(new ImageSpan(mSearchHintIcon), 1, 2, 33);
      localSpannableStringBuilder.append(paramCharSequence);
      return localSpannableStringBuilder;
    }
    return paramCharSequence;
  }
  
  private int getPreferredHeight()
  {
    return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
  }
  
  private int getPreferredWidth()
  {
    return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
  }
  
  private boolean hasVoiceSearch()
  {
    Object localObject = mSearchable;
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (localObject != null)
    {
      bool2 = bool1;
      if (((SearchableInfo)localObject).getVoiceSearchEnabled())
      {
        localObject = null;
        if (mSearchable.getVoiceSearchLaunchWebSearch()) {
          localObject = mVoiceWebSearchIntent;
        } else if (mSearchable.getVoiceSearchLaunchRecognizer()) {
          localObject = mVoiceAppSearchIntent;
        }
        bool2 = bool1;
        if (localObject != null)
        {
          bool2 = bool1;
          if (getContext().getPackageManager().resolveActivity((Intent)localObject, 65536) != null) {
            bool2 = true;
          }
        }
      }
    }
    return bool2;
  }
  
  public static boolean isLandscapeMode(Context paramContext)
  {
    boolean bool;
    if (getResourcesgetConfigurationorientation == 2) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private boolean isSubmitAreaEnabled()
  {
    boolean bool;
    if (((mSubmitButtonEnabled) || (mVoiceButtonEnabled)) && (!isIconified())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private void launchIntent(Intent paramIntent)
  {
    if (paramIntent == null) {
      return;
    }
    try
    {
      getContext().startActivity(paramIntent);
    }
    catch (RuntimeException localRuntimeException)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Failed launch activity: ");
      localStringBuilder.append(paramIntent);
      Log.e("SearchView", localStringBuilder.toString(), localRuntimeException);
    }
  }
  
  private boolean launchSuggestion(int paramInt1, int paramInt2, String paramString)
  {
    Cursor localCursor = mSuggestionsAdapter.getCursor();
    if ((localCursor != null) && (localCursor.moveToPosition(paramInt1)))
    {
      launchIntent(createIntentFromSuggestion(localCursor, paramInt2, paramString));
      return true;
    }
    return false;
  }
  
  private void postUpdateFocusedState()
  {
    post(mUpdateDrawableStateRunnable);
  }
  
  private void rewriteQueryFromSuggestion(int paramInt)
  {
    Editable localEditable = mSearchSrcTextView.getText();
    Object localObject = mSuggestionsAdapter.getCursor();
    if (localObject == null) {
      return;
    }
    if (((Cursor)localObject).moveToPosition(paramInt))
    {
      localObject = mSuggestionsAdapter.convertToString((Cursor)localObject);
      if (localObject != null) {
        setQuery((CharSequence)localObject);
      } else {
        setQuery(localEditable);
      }
    }
    else
    {
      setQuery(localEditable);
    }
  }
  
  private void setQuery(CharSequence paramCharSequence)
  {
    mSearchSrcTextView.setText(paramCharSequence);
    SearchAutoComplete localSearchAutoComplete = mSearchSrcTextView;
    int i;
    if (TextUtils.isEmpty(paramCharSequence)) {
      i = 0;
    } else {
      i = paramCharSequence.length();
    }
    localSearchAutoComplete.setSelection(i);
  }
  
  private void updateCloseButton()
  {
    boolean bool = TextUtils.isEmpty(mSearchSrcTextView.getText());
    int i = 1;
    int j = bool ^ true;
    int k = 0;
    int m = i;
    if (j == 0) {
      if ((mIconifiedByDefault) && (!mExpandedInActionView)) {
        m = i;
      } else {
        m = 0;
      }
    }
    Object localObject = mCloseButton;
    if (m != 0) {
      m = k;
    } else {
      m = 8;
    }
    ((ImageView)localObject).setVisibility(m);
    Drawable localDrawable = mCloseButton.getDrawable();
    if (localDrawable != null)
    {
      if (j != 0) {
        localObject = ViewGroup.ENABLED_STATE_SET;
      } else {
        localObject = ViewGroup.EMPTY_STATE_SET;
      }
      localDrawable.setState((int[])localObject);
    }
  }
  
  private void updateQueryHint()
  {
    CharSequence localCharSequence = getQueryHint();
    SearchAutoComplete localSearchAutoComplete = mSearchSrcTextView;
    Object localObject = localCharSequence;
    if (localCharSequence == null) {
      localObject = "";
    }
    localSearchAutoComplete.setHint(getDecoratedHint((CharSequence)localObject));
  }
  
  private void updateSearchAutoComplete()
  {
    mSearchSrcTextView.setThreshold(mSearchable.getSuggestThreshold());
    mSearchSrcTextView.setImeOptions(mSearchable.getImeOptions());
    int i = mSearchable.getInputType();
    int j = 1;
    int k = i;
    if ((i & 0xF) == 1)
    {
      i &= 0xFFFEFFFF;
      k = i;
      if (mSearchable.getSuggestAuthority() != null) {
        k = i | 0x10000 | 0x80000;
      }
    }
    mSearchSrcTextView.setInputType(k);
    Object localObject = mSuggestionsAdapter;
    if (localObject != null) {
      ((CursorAdapter)localObject).changeCursor(null);
    }
    if (mSearchable.getSuggestAuthority() != null)
    {
      localObject = new SuggestionsAdapter(getContext(), this, mSearchable, mOutsideDrawablesCache);
      mSuggestionsAdapter = ((CursorAdapter)localObject);
      mSearchSrcTextView.setAdapter((ListAdapter)localObject);
      localObject = (SuggestionsAdapter)mSuggestionsAdapter;
      k = j;
      if (mQueryRefinement) {
        k = 2;
      }
      ((SuggestionsAdapter)localObject).setQueryRefinement(k);
    }
  }
  
  private void updateSubmitArea()
  {
    int i;
    if ((isSubmitAreaEnabled()) && ((mGoButton.getVisibility() == 0) || (mVoiceButton.getVisibility() == 0))) {
      i = 0;
    } else {
      i = 8;
    }
    mSubmitArea.setVisibility(i);
  }
  
  private void updateSubmitButton(boolean paramBoolean)
  {
    int i;
    if ((mSubmitButtonEnabled) && (isSubmitAreaEnabled()) && (hasFocus()) && ((paramBoolean) || (!mVoiceButtonEnabled))) {
      i = 0;
    } else {
      i = 8;
    }
    mGoButton.setVisibility(i);
  }
  
  private void updateViewsVisibility(boolean paramBoolean)
  {
    mIconified = paramBoolean;
    int i = 0;
    int j;
    if (paramBoolean) {
      j = 0;
    } else {
      j = 8;
    }
    boolean bool = TextUtils.isEmpty(mSearchSrcTextView.getText()) ^ true;
    mSearchButton.setVisibility(j);
    updateSubmitButton(bool);
    View localView = mSearchEditFrame;
    if (paramBoolean) {
      j = 8;
    } else {
      j = 0;
    }
    localView.setVisibility(j);
    if (mCollapsedIcon.getDrawable() != null)
    {
      j = i;
      if (!mIconifiedByDefault) {}
    }
    else
    {
      j = 8;
    }
    mCollapsedIcon.setVisibility(j);
    updateCloseButton();
    updateVoiceButton(bool ^ true);
    updateSubmitArea();
  }
  
  private void updateVoiceButton(boolean paramBoolean)
  {
    boolean bool = mVoiceButtonEnabled;
    int i = 8;
    int j = i;
    if (bool)
    {
      j = i;
      if (!isIconified())
      {
        j = i;
        if (paramBoolean)
        {
          mGoButton.setVisibility(8);
          j = 0;
        }
      }
    }
    mVoiceButton.setVisibility(j);
  }
  
  public void adjustDropDownSizeAndPosition()
  {
    if (mDropDownAnchor.getWidth() > 1)
    {
      Resources localResources = getContext().getResources();
      int i = mSearchPlate.getPaddingLeft();
      Rect localRect = new Rect();
      boolean bool = ViewUtils.isLayoutRtl(this);
      int j;
      if (mIconifiedByDefault)
      {
        j = localResources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
        j = localResources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + j;
      }
      else
      {
        j = 0;
      }
      mSearchSrcTextView.getDropDownBackground().getPadding(localRect);
      if (bool) {
        k = -left;
      } else {
        k = i - (left + j);
      }
      mSearchSrcTextView.setDropDownHorizontalOffset(k);
      int k = mDropDownAnchor.getWidth();
      int m = left;
      int n = right;
      mSearchSrcTextView.setDropDownWidth(k + m + n + j - i);
    }
  }
  
  public void clearFocus()
  {
    mClearingFocus = true;
    super.clearFocus();
    mSearchSrcTextView.clearFocus();
    mSearchSrcTextView.setImeVisibility(false);
    mClearingFocus = false;
  }
  
  public void forceSuggestionQuery()
  {
    if (Build.VERSION.SDK_INT >= 29)
    {
      Api29Impl.refreshAutoCompleteResults(mSearchSrcTextView);
    }
    else
    {
      PreQAutoCompleteTextViewReflector localPreQAutoCompleteTextViewReflector = PRE_API_29_HIDDEN_METHOD_INVOKER;
      localPreQAutoCompleteTextViewReflector.doBeforeTextChanged(mSearchSrcTextView);
      localPreQAutoCompleteTextViewReflector.doAfterTextChanged(mSearchSrcTextView);
    }
  }
  
  public int getImeOptions()
  {
    return mSearchSrcTextView.getImeOptions();
  }
  
  public int getInputType()
  {
    return mSearchSrcTextView.getInputType();
  }
  
  public int getMaxWidth()
  {
    return mMaxWidth;
  }
  
  public CharSequence getQuery()
  {
    return mSearchSrcTextView.getText();
  }
  
  @Nullable
  public CharSequence getQueryHint()
  {
    Object localObject = mQueryHint;
    if (localObject == null)
    {
      localObject = mSearchable;
      if ((localObject != null) && (((SearchableInfo)localObject).getHintId() != 0)) {
        localObject = getContext().getText(mSearchable.getHintId());
      } else {
        localObject = mDefaultQueryHint;
      }
    }
    return (CharSequence)localObject;
  }
  
  public int getSuggestionCommitIconResId()
  {
    return mSuggestionCommitIconResId;
  }
  
  public int getSuggestionRowLayout()
  {
    return mSuggestionRowLayout;
  }
  
  public CursorAdapter getSuggestionsAdapter()
  {
    return mSuggestionsAdapter;
  }
  
  public boolean isIconfiedByDefault()
  {
    return mIconifiedByDefault;
  }
  
  public boolean isIconified()
  {
    return mIconified;
  }
  
  public boolean isQueryRefinementEnabled()
  {
    return mQueryRefinement;
  }
  
  public boolean isSubmitButtonEnabled()
  {
    return mSubmitButtonEnabled;
  }
  
  public void launchQuerySearch(int paramInt, String paramString1, String paramString2)
  {
    paramString1 = createIntent("android.intent.action.SEARCH", null, null, paramString2, paramInt, paramString1);
    getContext().startActivity(paramString1);
  }
  
  public void onActionViewCollapsed()
  {
    setQuery("", false);
    clearFocus();
    updateViewsVisibility(true);
    mSearchSrcTextView.setImeOptions(mCollapsedImeOptions);
    mExpandedInActionView = false;
  }
  
  public void onActionViewExpanded()
  {
    if (mExpandedInActionView) {
      return;
    }
    mExpandedInActionView = true;
    int i = mSearchSrcTextView.getImeOptions();
    mCollapsedImeOptions = i;
    mSearchSrcTextView.setImeOptions(i | 0x2000000);
    mSearchSrcTextView.setText("");
    setIconified(false);
  }
  
  public void onCloseClicked()
  {
    if (TextUtils.isEmpty(mSearchSrcTextView.getText()))
    {
      if (mIconifiedByDefault)
      {
        OnCloseListener localOnCloseListener = mOnCloseListener;
        if ((localOnCloseListener == null) || (!localOnCloseListener.onClose()))
        {
          clearFocus();
          updateViewsVisibility(true);
        }
      }
    }
    else
    {
      mSearchSrcTextView.setText("");
      mSearchSrcTextView.requestFocus();
      mSearchSrcTextView.setImeVisibility(true);
    }
  }
  
  public void onDetachedFromWindow()
  {
    removeCallbacks(mUpdateDrawableStateRunnable);
    post(mReleaseCursorRunnable);
    super.onDetachedFromWindow();
  }
  
  public boolean onItemClicked(int paramInt1, int paramInt2, String paramString)
  {
    paramString = mOnSuggestionListener;
    if ((paramString != null) && (paramString.onSuggestionClick(paramInt1))) {
      return false;
    }
    launchSuggestion(paramInt1, 0, null);
    mSearchSrcTextView.setImeVisibility(false);
    dismissSuggestions();
    return true;
  }
  
  public boolean onItemSelected(int paramInt)
  {
    OnSuggestionListener localOnSuggestionListener = mOnSuggestionListener;
    if ((localOnSuggestionListener != null) && (localOnSuggestionListener.onSuggestionSelect(paramInt))) {
      return false;
    }
    rewriteQueryFromSuggestion(paramInt);
    return true;
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramBoolean)
    {
      getChildBoundsWithinSearchView(mSearchSrcTextView, mSearchSrcTextViewBounds);
      Rect localRect = mSearchSrtTextViewBoundsExpanded;
      Object localObject = mSearchSrcTextViewBounds;
      localRect.set(left, 0, right, paramInt4 - paramInt2);
      localObject = mTouchDelegate;
      if (localObject == null)
      {
        localObject = new UpdatableTouchDelegate(mSearchSrtTextViewBoundsExpanded, mSearchSrcTextViewBounds, mSearchSrcTextView);
        mTouchDelegate = ((UpdatableTouchDelegate)localObject);
        setTouchDelegate((TouchDelegate)localObject);
      }
      else
      {
        ((UpdatableTouchDelegate)localObject).setBounds(mSearchSrtTextViewBoundsExpanded, mSearchSrcTextViewBounds);
      }
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    if (isIconified())
    {
      super.onMeasure(paramInt1, paramInt2);
      return;
    }
    int i = View.MeasureSpec.getMode(paramInt1);
    int j = View.MeasureSpec.getSize(paramInt1);
    if (i != Integer.MIN_VALUE)
    {
      if (i != 0)
      {
        if (i != 1073741824)
        {
          paramInt1 = j;
        }
        else
        {
          i = mMaxWidth;
          paramInt1 = j;
          if (i > 0) {
            paramInt1 = Math.min(i, j);
          }
        }
      }
      else
      {
        paramInt1 = mMaxWidth;
        if (paramInt1 <= 0) {
          paramInt1 = getPreferredWidth();
        }
      }
    }
    else
    {
      paramInt1 = mMaxWidth;
      if (paramInt1 > 0) {
        paramInt1 = Math.min(paramInt1, j);
      } else {
        paramInt1 = Math.min(getPreferredWidth(), j);
      }
    }
    j = View.MeasureSpec.getMode(paramInt2);
    paramInt2 = View.MeasureSpec.getSize(paramInt2);
    if (j != Integer.MIN_VALUE)
    {
      if (j == 0) {
        paramInt2 = getPreferredHeight();
      }
    }
    else {
      paramInt2 = Math.min(getPreferredHeight(), paramInt2);
    }
    super.onMeasure(View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824), View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824));
  }
  
  public void onQueryRefine(@Nullable CharSequence paramCharSequence)
  {
    setQuery(paramCharSequence);
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof SavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    paramParcelable = (SavedState)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getSuperState());
    updateViewsVisibility(isIconified);
    requestLayout();
  }
  
  public Parcelable onSaveInstanceState()
  {
    SavedState localSavedState = new SavedState(super.onSaveInstanceState());
    isIconified = isIconified();
    return localSavedState;
  }
  
  public void onSearchClicked()
  {
    updateViewsVisibility(false);
    mSearchSrcTextView.requestFocus();
    mSearchSrcTextView.setImeVisibility(true);
    View.OnClickListener localOnClickListener = mOnSearchClickListener;
    if (localOnClickListener != null) {
      localOnClickListener.onClick(this);
    }
  }
  
  public void onSubmitQuery()
  {
    Editable localEditable = mSearchSrcTextView.getText();
    if ((localEditable != null) && (TextUtils.getTrimmedLength(localEditable) > 0))
    {
      OnQueryTextListener localOnQueryTextListener = mOnQueryChangeListener;
      if ((localOnQueryTextListener == null) || (!localOnQueryTextListener.onQueryTextSubmit(localEditable.toString())))
      {
        if (mSearchable != null) {
          launchQuerySearch(0, null, localEditable.toString());
        }
        mSearchSrcTextView.setImeVisibility(false);
        dismissSuggestions();
      }
    }
  }
  
  public boolean onSuggestionsKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    if (mSearchable == null) {
      return false;
    }
    if (mSuggestionsAdapter == null) {
      return false;
    }
    if ((paramKeyEvent.getAction() == 0) && (paramKeyEvent.hasNoModifiers())) {
      if ((paramInt != 66) && (paramInt != 84) && (paramInt != 61))
      {
        if ((paramInt != 21) && (paramInt != 22))
        {
          if (paramInt == 19)
          {
            mSearchSrcTextView.getListSelection();
            return false;
          }
        }
        else
        {
          if (paramInt == 21) {
            paramInt = 0;
          } else {
            paramInt = mSearchSrcTextView.length();
          }
          mSearchSrcTextView.setSelection(paramInt);
          mSearchSrcTextView.setListSelection(0);
          mSearchSrcTextView.clearListSelection();
          mSearchSrcTextView.ensureImeVisible();
          return true;
        }
      }
      else {
        return onItemClicked(mSearchSrcTextView.getListSelection(), 0, null);
      }
    }
    return false;
  }
  
  public void onTextChanged(CharSequence paramCharSequence)
  {
    Editable localEditable = mSearchSrcTextView.getText();
    mUserQuery = localEditable;
    boolean bool = TextUtils.isEmpty(localEditable) ^ true;
    updateSubmitButton(bool);
    updateVoiceButton(bool ^ true);
    updateCloseButton();
    updateSubmitArea();
    if ((mOnQueryChangeListener != null) && (!TextUtils.equals(paramCharSequence, mOldQueryText))) {
      mOnQueryChangeListener.onQueryTextChange(paramCharSequence.toString());
    }
    mOldQueryText = paramCharSequence.toString();
  }
  
  public void onTextFocusChanged()
  {
    updateViewsVisibility(isIconified());
    postUpdateFocusedState();
    if (mSearchSrcTextView.hasFocus()) {
      forceSuggestionQuery();
    }
  }
  
  public void onVoiceClicked()
  {
    Object localObject = mSearchable;
    if (localObject == null) {
      return;
    }
    try
    {
      if (((SearchableInfo)localObject).getVoiceSearchLaunchWebSearch())
      {
        localObject = createVoiceWebSearchIntent(mVoiceWebSearchIntent, (SearchableInfo)localObject);
        getContext().startActivity((Intent)localObject);
      }
      else if (((SearchableInfo)localObject).getVoiceSearchLaunchRecognizer())
      {
        localObject = createVoiceAppSearchIntent(mVoiceAppSearchIntent, (SearchableInfo)localObject);
        getContext().startActivity((Intent)localObject);
      }
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      Log.w("SearchView", "Could not find voice search activity");
    }
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    postUpdateFocusedState();
  }
  
  public boolean requestFocus(int paramInt, Rect paramRect)
  {
    if (mClearingFocus) {
      return false;
    }
    if (!isFocusable()) {
      return false;
    }
    if (!isIconified())
    {
      boolean bool = mSearchSrcTextView.requestFocus(paramInt, paramRect);
      if (bool) {
        updateViewsVisibility(false);
      }
      return bool;
    }
    return super.requestFocus(paramInt, paramRect);
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void setAppSearchData(Bundle paramBundle)
  {
    mAppSearchData = paramBundle;
  }
  
  public void setIconified(boolean paramBoolean)
  {
    if (paramBoolean) {
      onCloseClicked();
    } else {
      onSearchClicked();
    }
  }
  
  public void setIconifiedByDefault(boolean paramBoolean)
  {
    if (mIconifiedByDefault == paramBoolean) {
      return;
    }
    mIconifiedByDefault = paramBoolean;
    updateViewsVisibility(paramBoolean);
    updateQueryHint();
  }
  
  public void setImeOptions(int paramInt)
  {
    mSearchSrcTextView.setImeOptions(paramInt);
  }
  
  public void setInputType(int paramInt)
  {
    mSearchSrcTextView.setInputType(paramInt);
  }
  
  public void setMaxWidth(int paramInt)
  {
    mMaxWidth = paramInt;
    requestLayout();
  }
  
  public void setOnCloseListener(OnCloseListener paramOnCloseListener)
  {
    mOnCloseListener = paramOnCloseListener;
  }
  
  public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    mOnQueryTextFocusChangeListener = paramOnFocusChangeListener;
  }
  
  public void setOnQueryTextListener(OnQueryTextListener paramOnQueryTextListener)
  {
    mOnQueryChangeListener = paramOnQueryTextListener;
  }
  
  public void setOnSearchClickListener(View.OnClickListener paramOnClickListener)
  {
    mOnSearchClickListener = paramOnClickListener;
  }
  
  public void setOnSuggestionListener(OnSuggestionListener paramOnSuggestionListener)
  {
    mOnSuggestionListener = paramOnSuggestionListener;
  }
  
  public void setQuery(CharSequence paramCharSequence, boolean paramBoolean)
  {
    mSearchSrcTextView.setText(paramCharSequence);
    if (paramCharSequence != null)
    {
      SearchAutoComplete localSearchAutoComplete = mSearchSrcTextView;
      localSearchAutoComplete.setSelection(localSearchAutoComplete.length());
      mUserQuery = paramCharSequence;
    }
    if ((paramBoolean) && (!TextUtils.isEmpty(paramCharSequence))) {
      onSubmitQuery();
    }
  }
  
  public void setQueryHint(@Nullable CharSequence paramCharSequence)
  {
    mQueryHint = paramCharSequence;
    updateQueryHint();
  }
  
  public void setQueryRefinementEnabled(boolean paramBoolean)
  {
    mQueryRefinement = paramBoolean;
    Object localObject = mSuggestionsAdapter;
    if ((localObject instanceof SuggestionsAdapter))
    {
      localObject = (SuggestionsAdapter)localObject;
      int i;
      if (paramBoolean) {
        i = 2;
      } else {
        i = 1;
      }
      ((SuggestionsAdapter)localObject).setQueryRefinement(i);
    }
  }
  
  public void setSearchableInfo(SearchableInfo paramSearchableInfo)
  {
    mSearchable = paramSearchableInfo;
    if (paramSearchableInfo != null)
    {
      updateSearchAutoComplete();
      updateQueryHint();
    }
    boolean bool = hasVoiceSearch();
    mVoiceButtonEnabled = bool;
    if (bool) {
      mSearchSrcTextView.setPrivateImeOptions("nm");
    }
    updateViewsVisibility(isIconified());
  }
  
  public void setSubmitButtonEnabled(boolean paramBoolean)
  {
    mSubmitButtonEnabled = paramBoolean;
    updateViewsVisibility(isIconified());
  }
  
  public void setSuggestionsAdapter(CursorAdapter paramCursorAdapter)
  {
    mSuggestionsAdapter = paramCursorAdapter;
    mSearchSrcTextView.setAdapter(paramCursorAdapter);
  }
  
  public void updateFocusedState()
  {
    int[] arrayOfInt;
    if (mSearchSrcTextView.hasFocus()) {
      arrayOfInt = ViewGroup.FOCUSED_STATE_SET;
    } else {
      arrayOfInt = ViewGroup.EMPTY_STATE_SET;
    }
    Drawable localDrawable = mSearchPlate.getBackground();
    if (localDrawable != null) {
      localDrawable.setState(arrayOfInt);
    }
    localDrawable = mSubmitArea.getBackground();
    if (localDrawable != null) {
      localDrawable.setState(arrayOfInt);
    }
    invalidate();
  }
  
  @RequiresApi(29)
  public static class Api29Impl
  {
    @DoNotInline
    public static void refreshAutoCompleteResults(AutoCompleteTextView paramAutoCompleteTextView)
    {
      o3.y(paramAutoCompleteTextView);
    }
    
    @DoNotInline
    public static void setInputMethodMode(SearchView.SearchAutoComplete paramSearchAutoComplete, int paramInt)
    {
      paramSearchAutoComplete.setInputMethodMode(paramInt);
    }
  }
  
  public static abstract interface OnCloseListener
  {
    public abstract boolean onClose();
  }
  
  public static abstract interface OnQueryTextListener
  {
    public abstract boolean onQueryTextChange(String paramString);
    
    public abstract boolean onQueryTextSubmit(String paramString);
  }
  
  public static abstract interface OnSuggestionListener
  {
    public abstract boolean onSuggestionClick(int paramInt);
    
    public abstract boolean onSuggestionSelect(int paramInt);
  }
  
  public static class PreQAutoCompleteTextViewReflector
  {
    private Method mDoAfterTextChanged = null;
    private Method mDoBeforeTextChanged = null;
    private Method mEnsureImeVisible = null;
    
    @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
    public PreQAutoCompleteTextViewReflector()
    {
      preApi29Check();
      try
      {
        localMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
        mDoBeforeTextChanged = localMethod;
        localMethod.setAccessible(true);
      }
      catch (NoSuchMethodException localNoSuchMethodException2)
      {
        try
        {
          localMethod = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
          mDoAfterTextChanged = localMethod;
          localMethod.setAccessible(true);
        }
        catch (NoSuchMethodException localNoSuchMethodException2)
        {
          try
          {
            for (;;)
            {
              Method localMethod = AutoCompleteTextView.class.getMethod("ensureImeVisible", new Class[] { Boolean.TYPE });
              mEnsureImeVisible = localMethod;
              localMethod.setAccessible(true);
              return;
              localNoSuchMethodException1 = localNoSuchMethodException1;
              continue;
              localNoSuchMethodException2 = localNoSuchMethodException2;
            }
          }
          catch (NoSuchMethodException localNoSuchMethodException3)
          {
            for (;;) {}
          }
        }
      }
    }
    
    private static void preApi29Check()
    {
      if (Build.VERSION.SDK_INT < 29) {
        return;
      }
      throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
    }
    
    public void doAfterTextChanged(AutoCompleteTextView paramAutoCompleteTextView)
    {
      preApi29Check();
      Method localMethod = mDoAfterTextChanged;
      if (localMethod != null) {}
      try
      {
        localMethod.invoke(paramAutoCompleteTextView, new Object[0]);
        return;
      }
      catch (Exception paramAutoCompleteTextView)
      {
        for (;;) {}
      }
    }
    
    public void doBeforeTextChanged(AutoCompleteTextView paramAutoCompleteTextView)
    {
      preApi29Check();
      Method localMethod = mDoBeforeTextChanged;
      if (localMethod != null) {}
      try
      {
        localMethod.invoke(paramAutoCompleteTextView, new Object[0]);
        return;
      }
      catch (Exception paramAutoCompleteTextView)
      {
        for (;;) {}
      }
    }
    
    public void ensureImeVisible(AutoCompleteTextView paramAutoCompleteTextView)
    {
      preApi29Check();
      Method localMethod = mEnsureImeVisible;
      if (localMethod != null) {}
      try
      {
        localMethod.invoke(paramAutoCompleteTextView, new Object[] { Boolean.TRUE });
        return;
      }
      catch (Exception paramAutoCompleteTextView)
      {
        for (;;) {}
      }
    }
  }
  
  public static class SavedState
    extends AbsSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator()
    {
      public SearchView.SavedState createFromParcel(Parcel paramAnonymousParcel)
      {
        return new SearchView.SavedState(paramAnonymousParcel, null);
      }
      
      public SearchView.SavedState createFromParcel(Parcel paramAnonymousParcel, ClassLoader paramAnonymousClassLoader)
      {
        return new SearchView.SavedState(paramAnonymousParcel, paramAnonymousClassLoader);
      }
      
      public SearchView.SavedState[] newArray(int paramAnonymousInt)
      {
        return new SearchView.SavedState[paramAnonymousInt];
      }
    };
    public boolean isIconified;
    
    public SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      super(paramClassLoader);
      isIconified = ((Boolean)paramParcel.readValue(null)).booleanValue();
    }
    
    public SavedState(Parcelable paramParcelable)
    {
      super();
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = z2.t("SearchView.SavedState{");
      localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      localStringBuilder.append(" isIconified=");
      localStringBuilder.append(isIconified);
      localStringBuilder.append("}");
      return localStringBuilder.toString();
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeValue(Boolean.valueOf(isIconified));
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static class SearchAutoComplete
    extends AppCompatAutoCompleteTextView
  {
    private boolean mHasPendingShowSoftInputRequest;
    public final Runnable mRunShowSoftInputIfNecessary = new Runnable()
    {
      public void run()
      {
        showSoftInputIfNecessary();
      }
    };
    private SearchView mSearchView;
    private int mThreshold = getThreshold();
    
    public SearchAutoComplete(Context paramContext)
    {
      this(paramContext, null);
    }
    
    public SearchAutoComplete(Context paramContext, AttributeSet paramAttributeSet)
    {
      this(paramContext, paramAttributeSet, R.attr.autoCompleteTextViewStyle);
    }
    
    public SearchAutoComplete(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
    {
      super(paramAttributeSet, paramInt);
    }
    
    private int getSearchViewTextMinWidthDp()
    {
      Configuration localConfiguration = getResources().getConfiguration();
      int i = screenWidthDp;
      int j = screenHeightDp;
      if ((i >= 960) && (j >= 720) && (orientation == 2)) {
        return 256;
      }
      if ((i < 600) && ((i < 640) || (j < 480))) {
        return 160;
      }
      return 192;
    }
    
    public boolean enoughToFilter()
    {
      boolean bool;
      if ((mThreshold > 0) && (!super.enoughToFilter())) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public void ensureImeVisible()
    {
      if (Build.VERSION.SDK_INT >= 29)
      {
        SearchView.Api29Impl.setInputMethodMode(this, 1);
        if (enoughToFilter()) {
          showDropDown();
        }
      }
      else
      {
        SearchView.PRE_API_29_HIDDEN_METHOD_INVOKER.ensureImeVisible(this);
      }
    }
    
    public boolean isEmpty()
    {
      boolean bool;
      if (TextUtils.getTrimmedLength(getText()) == 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
    {
      paramEditorInfo = super.onCreateInputConnection(paramEditorInfo);
      if (mHasPendingShowSoftInputRequest)
      {
        removeCallbacks(mRunShowSoftInputIfNecessary);
        post(mRunShowSoftInputIfNecessary);
      }
      return paramEditorInfo;
    }
    
    public void onFinishInflate()
    {
      super.onFinishInflate();
      DisplayMetrics localDisplayMetrics = getResources().getDisplayMetrics();
      setMinWidth((int)TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), localDisplayMetrics));
    }
    
    public void onFocusChanged(boolean paramBoolean, int paramInt, Rect paramRect)
    {
      super.onFocusChanged(paramBoolean, paramInt, paramRect);
      mSearchView.onTextFocusChanged();
    }
    
    public boolean onKeyPreIme(int paramInt, KeyEvent paramKeyEvent)
    {
      if (paramInt == 4)
      {
        KeyEvent.DispatcherState localDispatcherState;
        if ((paramKeyEvent.getAction() == 0) && (paramKeyEvent.getRepeatCount() == 0))
        {
          localDispatcherState = getKeyDispatcherState();
          if (localDispatcherState != null) {
            localDispatcherState.startTracking(paramKeyEvent, this);
          }
          return true;
        }
        if (paramKeyEvent.getAction() == 1)
        {
          localDispatcherState = getKeyDispatcherState();
          if (localDispatcherState != null) {
            localDispatcherState.handleUpEvent(paramKeyEvent);
          }
          if ((paramKeyEvent.isTracking()) && (!paramKeyEvent.isCanceled()))
          {
            mSearchView.clearFocus();
            setImeVisibility(false);
            return true;
          }
        }
      }
      return super.onKeyPreIme(paramInt, paramKeyEvent);
    }
    
    public void onWindowFocusChanged(boolean paramBoolean)
    {
      super.onWindowFocusChanged(paramBoolean);
      if ((paramBoolean) && (mSearchView.hasFocus()) && (getVisibility() == 0))
      {
        mHasPendingShowSoftInputRequest = true;
        if (SearchView.isLandscapeMode(getContext())) {
          ensureImeVisible();
        }
      }
    }
    
    public void performCompletion() {}
    
    public void replaceText(CharSequence paramCharSequence) {}
    
    public void setImeVisibility(boolean paramBoolean)
    {
      InputMethodManager localInputMethodManager = (InputMethodManager)getContext().getSystemService("input_method");
      if (!paramBoolean)
      {
        mHasPendingShowSoftInputRequest = false;
        removeCallbacks(mRunShowSoftInputIfNecessary);
        localInputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        return;
      }
      if (localInputMethodManager.isActive(this))
      {
        mHasPendingShowSoftInputRequest = false;
        removeCallbacks(mRunShowSoftInputIfNecessary);
        localInputMethodManager.showSoftInput(this, 0);
        return;
      }
      mHasPendingShowSoftInputRequest = true;
    }
    
    public void setSearchView(SearchView paramSearchView)
    {
      mSearchView = paramSearchView;
    }
    
    public void setThreshold(int paramInt)
    {
      super.setThreshold(paramInt);
      mThreshold = paramInt;
    }
    
    public void showSoftInputIfNecessary()
    {
      if (mHasPendingShowSoftInputRequest)
      {
        ((InputMethodManager)getContext().getSystemService("input_method")).showSoftInput(this, 0);
        mHasPendingShowSoftInputRequest = false;
      }
    }
  }
  
  public static class UpdatableTouchDelegate
    extends TouchDelegate
  {
    private final Rect mActualBounds;
    private boolean mDelegateTargeted;
    private final View mDelegateView;
    private final int mSlop;
    private final Rect mSlopBounds;
    private final Rect mTargetBounds;
    
    public UpdatableTouchDelegate(Rect paramRect1, Rect paramRect2, View paramView)
    {
      super(paramView);
      mSlop = ViewConfiguration.get(paramView.getContext()).getScaledTouchSlop();
      mTargetBounds = new Rect();
      mSlopBounds = new Rect();
      mActualBounds = new Rect();
      setBounds(paramRect1, paramRect2);
      mDelegateView = paramView;
    }
    
    public boolean onTouchEvent(MotionEvent paramMotionEvent)
    {
      int i = (int)paramMotionEvent.getX();
      int j = (int)paramMotionEvent.getY();
      int k = paramMotionEvent.getAction();
      boolean bool1 = true;
      boolean bool2 = false;
      if (k != 0)
      {
        if ((k != 1) && (k != 2))
        {
          if (k != 3) {
            break label134;
          }
          bool1 = mDelegateTargeted;
          mDelegateTargeted = false;
        }
        else
        {
          bool3 = mDelegateTargeted;
          bool1 = bool3;
          if (bool3)
          {
            bool1 = bool3;
            if (!mSlopBounds.contains(i, j))
            {
              bool1 = bool3;
              k = 0;
              break label140;
            }
          }
        }
        k = 1;
        break label140;
      }
      else if (mTargetBounds.contains(i, j))
      {
        mDelegateTargeted = true;
        k = 1;
        break label140;
      }
      label134:
      k = 1;
      bool1 = false;
      label140:
      boolean bool3 = bool2;
      if (bool1)
      {
        if ((k != 0) && (!mActualBounds.contains(i, j)))
        {
          paramMotionEvent.setLocation(mDelegateView.getWidth() / 2, mDelegateView.getHeight() / 2);
        }
        else
        {
          Rect localRect = mActualBounds;
          paramMotionEvent.setLocation(i - left, j - top);
        }
        bool3 = mDelegateView.dispatchTouchEvent(paramMotionEvent);
      }
      return bool3;
    }
    
    public void setBounds(Rect paramRect1, Rect paramRect2)
    {
      mTargetBounds.set(paramRect1);
      mSlopBounds.set(paramRect1);
      paramRect1 = mSlopBounds;
      int i = mSlop;
      paramRect1.inset(-i, -i);
      mActualBounds.set(paramRect2);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.SearchView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */