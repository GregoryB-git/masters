package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater.Factory2;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.R.styleable;
import z2;

class FragmentLayoutInflaterFactory
  implements LayoutInflater.Factory2
{
  private static final String TAG = "FragmentManager";
  public final FragmentManager mFragmentManager;
  
  public FragmentLayoutInflaterFactory(FragmentManager paramFragmentManager)
  {
    mFragmentManager = paramFragmentManager;
  }
  
  @Nullable
  public View onCreateView(@Nullable View paramView, @NonNull String paramString, @NonNull Context paramContext, @NonNull final AttributeSet paramAttributeSet)
  {
    if (FragmentContainerView.class.getName().equals(paramString)) {
      return new FragmentContainerView(paramContext, paramAttributeSet, mFragmentManager);
    }
    boolean bool = "fragment".equals(paramString);
    paramString = null;
    if (!bool) {
      return null;
    }
    Object localObject1 = paramAttributeSet.getAttributeValue(null, "class");
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.Fragment);
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = localTypedArray.getString(R.styleable.Fragment_android_name);
    }
    int i = localTypedArray.getResourceId(R.styleable.Fragment_android_id, -1);
    String str = localTypedArray.getString(R.styleable.Fragment_android_tag);
    localTypedArray.recycle();
    if ((localObject2 != null) && (FragmentFactory.isFragmentClass(paramContext.getClassLoader(), (String)localObject2)))
    {
      int j;
      if (paramView != null) {
        j = paramView.getId();
      } else {
        j = 0;
      }
      if ((j == -1) && (i == -1) && (str == null))
      {
        paramView = new StringBuilder();
        paramView.append(paramAttributeSet.getPositionDescription());
        paramView.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
        paramView.append((String)localObject2);
        throw new IllegalArgumentException(paramView.toString());
      }
      if (i != -1) {
        paramString = mFragmentManager.findFragmentById(i);
      }
      localObject1 = paramString;
      if (paramString == null)
      {
        localObject1 = paramString;
        if (str != null) {
          localObject1 = mFragmentManager.findFragmentByTag(str);
        }
      }
      paramString = (String)localObject1;
      if (localObject1 == null)
      {
        paramString = (String)localObject1;
        if (j != -1) {
          paramString = mFragmentManager.findFragmentById(j);
        }
      }
      if (paramString == null)
      {
        paramString = mFragmentManager.getFragmentFactory().instantiate(paramContext.getClassLoader(), (String)localObject2);
        mFromLayout = true;
        int k;
        if (i != 0) {
          k = i;
        } else {
          k = j;
        }
        mFragmentId = k;
        mContainerId = j;
        mTag = str;
        mInLayout = true;
        paramContext = mFragmentManager;
        mFragmentManager = paramContext;
        mHost = paramContext.getHost();
        paramString.onInflate(mFragmentManager.getHost().getContext(), paramAttributeSet, mSavedFragmentState);
        localObject1 = mFragmentManager.addFragment(paramString);
        paramContext = paramString;
        paramAttributeSet = (AttributeSet)localObject1;
        if (FragmentManager.isLoggingEnabled(2))
        {
          paramContext = new StringBuilder();
          paramContext.append("Fragment ");
          paramContext.append(paramString);
          paramContext.append(" has been inflated via the <fragment> tag: id=0x");
          paramContext.append(Integer.toHexString(i));
          Log.v("FragmentManager", paramContext.toString());
          paramContext = paramString;
          paramAttributeSet = (AttributeSet)localObject1;
        }
      }
      else
      {
        if (mInLayout) {
          break label690;
        }
        mInLayout = true;
        paramContext = mFragmentManager;
        mFragmentManager = paramContext;
        mHost = paramContext.getHost();
        paramString.onInflate(mFragmentManager.getHost().getContext(), paramAttributeSet, mSavedFragmentState);
        localObject1 = mFragmentManager.createOrGetFragmentStateManager(paramString);
        paramContext = paramString;
        paramAttributeSet = (AttributeSet)localObject1;
        if (FragmentManager.isLoggingEnabled(2))
        {
          paramContext = new StringBuilder();
          paramContext.append("Retained Fragment ");
          paramContext.append(paramString);
          paramContext.append(" has been re-attached via the <fragment> tag: id=0x");
          paramContext.append(Integer.toHexString(i));
          Log.v("FragmentManager", paramContext.toString());
          paramAttributeSet = (AttributeSet)localObject1;
          paramContext = paramString;
        }
      }
      mContainer = ((ViewGroup)paramView);
      paramAttributeSet.moveToExpectedState();
      paramAttributeSet.ensureInflatedView();
      paramView = mView;
      if (paramView != null)
      {
        if (i != 0) {
          paramView.setId(i);
        }
        if (mView.getTag() == null) {
          mView.setTag(str);
        }
        mView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener()
        {
          public void onViewAttachedToWindow(View paramAnonymousView)
          {
            paramAnonymousView = paramAttributeSet.getFragment();
            paramAttributeSet.moveToExpectedState();
            SpecialEffectsController.getOrCreateController((ViewGroup)mView.getParent(), mFragmentManager).forceCompleteAllOperations();
          }
          
          public void onViewDetachedFromWindow(View paramAnonymousView) {}
        });
        return mView;
      }
      throw new IllegalStateException(z2.p("Fragment ", (String)localObject2, " did not create a view."));
      label690:
      paramView = new StringBuilder();
      paramView.append(paramAttributeSet.getPositionDescription());
      paramView.append(": Duplicate id 0x");
      paramView.append(Integer.toHexString(i));
      paramView.append(", tag ");
      paramView.append(str);
      paramView.append(", or parent id 0x");
      paramView.append(Integer.toHexString(j));
      paramView.append(" with another fragment for ");
      paramView.append((String)localObject2);
      throw new IllegalArgumentException(paramView.toString());
    }
    return null;
  }
  
  @Nullable
  public View onCreateView(@NonNull String paramString, @NonNull Context paramContext, @NonNull AttributeSet paramAttributeSet)
  {
    return onCreateView(null, paramString, paramContext, paramAttributeSet);
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentLayoutInflaterFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */