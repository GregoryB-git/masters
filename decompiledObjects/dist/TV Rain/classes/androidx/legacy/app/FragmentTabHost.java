package androidx.legacy.app;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TabHost.TabContentFactory;
import android.widget.TabHost.TabSpec;
import android.widget.TabWidget;
import java.util.ArrayList;
import z2;

@Deprecated
public class FragmentTabHost
  extends TabHost
  implements TabHost.OnTabChangeListener
{
  private boolean mAttached;
  private int mContainerId;
  private Context mContext;
  private FragmentManager mFragmentManager;
  private TabInfo mLastTab;
  private TabHost.OnTabChangeListener mOnTabChangeListener;
  private FrameLayout mRealTabContent;
  private final ArrayList<TabInfo> mTabs = new ArrayList();
  
  @Deprecated
  public FragmentTabHost(Context paramContext)
  {
    super(paramContext, null);
    initFragmentTabHost(paramContext, null);
  }
  
  @Deprecated
  public FragmentTabHost(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    initFragmentTabHost(paramContext, paramAttributeSet);
  }
  
  private FragmentTransaction doTabChanged(String paramString, FragmentTransaction paramFragmentTransaction)
  {
    Object localObject = null;
    for (int i = 0; i < mTabs.size(); i++)
    {
      TabInfo localTabInfo = (TabInfo)mTabs.get(i);
      if (tag.equals(paramString)) {
        localObject = localTabInfo;
      }
    }
    if (localObject != null)
    {
      paramString = paramFragmentTransaction;
      if (mLastTab != localObject)
      {
        paramString = paramFragmentTransaction;
        if (paramFragmentTransaction == null) {
          paramString = mFragmentManager.beginTransaction();
        }
        paramFragmentTransaction = mLastTab;
        if (paramFragmentTransaction != null)
        {
          paramFragmentTransaction = fragment;
          if (paramFragmentTransaction != null) {
            paramString.detach(paramFragmentTransaction);
          }
        }
        paramFragmentTransaction = fragment;
        if (paramFragmentTransaction == null)
        {
          paramFragmentTransaction = Fragment.instantiate(mContext, clss.getName(), args);
          fragment = paramFragmentTransaction;
          paramString.add(mContainerId, paramFragmentTransaction, tag);
        }
        else
        {
          paramString.attach(paramFragmentTransaction);
        }
        mLastTab = ((TabInfo)localObject);
      }
      return paramString;
    }
    throw new IllegalStateException(z2.o("No tab known for tag ", paramString));
  }
  
  private void ensureContent()
  {
    if (mRealTabContent == null)
    {
      Object localObject = (FrameLayout)findViewById(mContainerId);
      mRealTabContent = ((FrameLayout)localObject);
      if (localObject == null)
      {
        localObject = z2.t("No tab content FrameLayout found for id ");
        ((StringBuilder)localObject).append(mContainerId);
        throw new IllegalStateException(((StringBuilder)localObject).toString());
      }
    }
  }
  
  private void ensureHierarchy(Context paramContext)
  {
    if (findViewById(16908307) == null)
    {
      LinearLayout localLinearLayout = new LinearLayout(paramContext);
      localLinearLayout.setOrientation(1);
      addView(localLinearLayout, new FrameLayout.LayoutParams(-1, -1));
      Object localObject = new TabWidget(paramContext);
      ((View)localObject).setId(16908307);
      ((LinearLayout)localObject).setOrientation(0);
      localLinearLayout.addView((View)localObject, new LinearLayout.LayoutParams(-1, -2, 0.0F));
      localObject = new FrameLayout(paramContext);
      ((View)localObject).setId(16908305);
      localLinearLayout.addView((View)localObject, new LinearLayout.LayoutParams(0, 0, 0.0F));
      paramContext = new FrameLayout(paramContext);
      mRealTabContent = paramContext;
      paramContext.setId(mContainerId);
      localLinearLayout.addView(paramContext, new LinearLayout.LayoutParams(-1, 0, 1.0F));
    }
  }
  
  private void initFragmentTabHost(Context paramContext, AttributeSet paramAttributeSet)
  {
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, new int[] { 16842995 }, 0, 0);
    mContainerId = paramContext.getResourceId(0, 0);
    paramContext.recycle();
    super.setOnTabChangedListener(this);
  }
  
  @Deprecated
  public void addTab(TabHost.TabSpec paramTabSpec, Class<?> paramClass, Bundle paramBundle)
  {
    paramTabSpec.setContent(new DummyTabFactory(mContext));
    String str = paramTabSpec.getTag();
    paramClass = new TabInfo(str, paramClass, paramBundle);
    if (mAttached)
    {
      paramBundle = mFragmentManager.findFragmentByTag(str);
      fragment = paramBundle;
      if ((paramBundle != null) && (!paramBundle.isDetached()))
      {
        paramBundle = mFragmentManager.beginTransaction();
        paramBundle.detach(fragment);
        paramBundle.commit();
      }
    }
    mTabs.add(paramClass);
    addTab(paramTabSpec);
  }
  
  @Deprecated
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    String str = getCurrentTabTag();
    Object localObject1 = null;
    int i = 0;
    while (i < mTabs.size())
    {
      TabInfo localTabInfo = (TabInfo)mTabs.get(i);
      Fragment localFragment = mFragmentManager.findFragmentByTag(tag);
      fragment = localFragment;
      Object localObject2 = localObject1;
      if (localFragment != null)
      {
        localObject2 = localObject1;
        if (!localFragment.isDetached()) {
          if (tag.equals(str))
          {
            mLastTab = localTabInfo;
            localObject2 = localObject1;
          }
          else
          {
            localObject2 = localObject1;
            if (localObject1 == null) {
              localObject2 = mFragmentManager.beginTransaction();
            }
            ((FragmentTransaction)localObject2).detach(fragment);
          }
        }
      }
      i++;
      localObject1 = localObject2;
    }
    mAttached = true;
    localObject1 = doTabChanged(str, (FragmentTransaction)localObject1);
    if (localObject1 != null)
    {
      ((FragmentTransaction)localObject1).commit();
      mFragmentManager.executePendingTransactions();
    }
  }
  
  @Deprecated
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    mAttached = false;
  }
  
  @Deprecated
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof SavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    paramParcelable = (SavedState)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getSuperState());
    setCurrentTabByTag(curTab);
  }
  
  @Deprecated
  public Parcelable onSaveInstanceState()
  {
    SavedState localSavedState = new SavedState(super.onSaveInstanceState());
    curTab = getCurrentTabTag();
    return localSavedState;
  }
  
  @Deprecated
  public void onTabChanged(String paramString)
  {
    if (mAttached)
    {
      localObject = doTabChanged(paramString, null);
      if (localObject != null) {
        ((FragmentTransaction)localObject).commit();
      }
    }
    Object localObject = mOnTabChangeListener;
    if (localObject != null) {
      ((TabHost.OnTabChangeListener)localObject).onTabChanged(paramString);
    }
  }
  
  @Deprecated
  public void setOnTabChangedListener(TabHost.OnTabChangeListener paramOnTabChangeListener)
  {
    mOnTabChangeListener = paramOnTabChangeListener;
  }
  
  @Deprecated
  public void setup()
  {
    throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
  }
  
  @Deprecated
  public void setup(Context paramContext, FragmentManager paramFragmentManager)
  {
    ensureHierarchy(paramContext);
    super.setup();
    mContext = paramContext;
    mFragmentManager = paramFragmentManager;
    ensureContent();
  }
  
  @Deprecated
  public void setup(Context paramContext, FragmentManager paramFragmentManager, int paramInt)
  {
    ensureHierarchy(paramContext);
    super.setup();
    mContext = paramContext;
    mFragmentManager = paramFragmentManager;
    mContainerId = paramInt;
    ensureContent();
    mRealTabContent.setId(paramInt);
    if (getId() == -1) {
      setId(16908306);
    }
  }
  
  public static class DummyTabFactory
    implements TabHost.TabContentFactory
  {
    private final Context mContext;
    
    public DummyTabFactory(Context paramContext)
    {
      mContext = paramContext;
    }
    
    public View createTabContent(String paramString)
    {
      paramString = new View(mContext);
      paramString.setMinimumWidth(0);
      paramString.setMinimumHeight(0);
      return paramString;
    }
  }
  
  public static class SavedState
    extends View.BaseSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator()
    {
      public FragmentTabHost.SavedState createFromParcel(Parcel paramAnonymousParcel)
      {
        return new FragmentTabHost.SavedState(paramAnonymousParcel);
      }
      
      public FragmentTabHost.SavedState[] newArray(int paramAnonymousInt)
      {
        return new FragmentTabHost.SavedState[paramAnonymousInt];
      }
    };
    public String curTab;
    
    public SavedState(Parcel paramParcel)
    {
      super();
      curTab = paramParcel.readString();
    }
    
    public SavedState(Parcelable paramParcelable)
    {
      super();
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = z2.t("FragmentTabHost.SavedState{");
      localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      localStringBuilder.append(" curTab=");
      return z2.s(localStringBuilder, curTab, "}");
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeString(curTab);
    }
  }
  
  public static final class TabInfo
  {
    public final Bundle args;
    public final Class<?> clss;
    public Fragment fragment;
    public final String tag;
    
    public TabInfo(String paramString, Class<?> paramClass, Bundle paramBundle)
    {
      tag = paramString;
      clss = paramClass;
      args = paramBundle;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.legacy.app.FragmentTabHost
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */