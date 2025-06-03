package androidx.fragment.app;

import a;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AnimRes;
import androidx.annotation.AnimatorRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.Lifecycle.State;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import z2;

public abstract class FragmentTransaction
{
  public static final int OP_ADD = 1;
  public static final int OP_ATTACH = 7;
  public static final int OP_DETACH = 6;
  public static final int OP_HIDE = 4;
  public static final int OP_NULL = 0;
  public static final int OP_REMOVE = 3;
  public static final int OP_REPLACE = 2;
  public static final int OP_SET_MAX_LIFECYCLE = 10;
  public static final int OP_SET_PRIMARY_NAV = 8;
  public static final int OP_SHOW = 5;
  public static final int OP_UNSET_PRIMARY_NAV = 9;
  public static final int TRANSIT_ENTER_MASK = 4096;
  public static final int TRANSIT_EXIT_MASK = 8192;
  public static final int TRANSIT_FRAGMENT_CLOSE = 8194;
  public static final int TRANSIT_FRAGMENT_FADE = 4099;
  public static final int TRANSIT_FRAGMENT_OPEN = 4097;
  public static final int TRANSIT_NONE = 0;
  public static final int TRANSIT_UNSET = -1;
  public boolean mAddToBackStack;
  public boolean mAllowAddToBackStack = true;
  public int mBreadCrumbShortTitleRes;
  public CharSequence mBreadCrumbShortTitleText;
  public int mBreadCrumbTitleRes;
  public CharSequence mBreadCrumbTitleText;
  private final ClassLoader mClassLoader;
  public ArrayList<Runnable> mCommitRunnables;
  public int mEnterAnim;
  public int mExitAnim;
  private final FragmentFactory mFragmentFactory;
  @Nullable
  public String mName;
  public ArrayList<Op> mOps = new ArrayList();
  public int mPopEnterAnim;
  public int mPopExitAnim;
  public boolean mReorderingAllowed = false;
  public ArrayList<String> mSharedElementSourceNames;
  public ArrayList<String> mSharedElementTargetNames;
  public int mTransition;
  
  @Deprecated
  public FragmentTransaction()
  {
    mFragmentFactory = null;
    mClassLoader = null;
  }
  
  public FragmentTransaction(@NonNull FragmentFactory paramFragmentFactory, @Nullable ClassLoader paramClassLoader)
  {
    mFragmentFactory = paramFragmentFactory;
    mClassLoader = paramClassLoader;
  }
  
  @NonNull
  private Fragment createFragment(@NonNull Class<? extends Fragment> paramClass, @Nullable Bundle paramBundle)
  {
    FragmentFactory localFragmentFactory = mFragmentFactory;
    if (localFragmentFactory != null)
    {
      ClassLoader localClassLoader = mClassLoader;
      if (localClassLoader != null)
      {
        paramClass = localFragmentFactory.instantiate(localClassLoader, paramClass.getName());
        if (paramBundle != null) {
          paramClass.setArguments(paramBundle);
        }
        return paramClass;
      }
      throw new IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
    }
    throw new IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
  }
  
  @NonNull
  public FragmentTransaction add(@IdRes int paramInt, @NonNull Fragment paramFragment)
  {
    doAddOp(paramInt, paramFragment, null, 1);
    return this;
  }
  
  @NonNull
  public FragmentTransaction add(@IdRes int paramInt, @NonNull Fragment paramFragment, @Nullable String paramString)
  {
    doAddOp(paramInt, paramFragment, paramString, 1);
    return this;
  }
  
  @NonNull
  public final FragmentTransaction add(@IdRes int paramInt, @NonNull Class<? extends Fragment> paramClass, @Nullable Bundle paramBundle)
  {
    return add(paramInt, createFragment(paramClass, paramBundle));
  }
  
  @NonNull
  public final FragmentTransaction add(@IdRes int paramInt, @NonNull Class<? extends Fragment> paramClass, @Nullable Bundle paramBundle, @Nullable String paramString)
  {
    return add(paramInt, createFragment(paramClass, paramBundle), paramString);
  }
  
  public FragmentTransaction add(@NonNull ViewGroup paramViewGroup, @NonNull Fragment paramFragment, @Nullable String paramString)
  {
    mContainer = paramViewGroup;
    return add(paramViewGroup.getId(), paramFragment, paramString);
  }
  
  @NonNull
  public FragmentTransaction add(@NonNull Fragment paramFragment, @Nullable String paramString)
  {
    doAddOp(0, paramFragment, paramString, 1);
    return this;
  }
  
  @NonNull
  public final FragmentTransaction add(@NonNull Class<? extends Fragment> paramClass, @Nullable Bundle paramBundle, @Nullable String paramString)
  {
    return add(createFragment(paramClass, paramBundle), paramString);
  }
  
  public void addOp(Op paramOp)
  {
    mOps.add(paramOp);
    mEnterAnim = mEnterAnim;
    mExitAnim = mExitAnim;
    mPopEnterAnim = mPopEnterAnim;
    mPopExitAnim = mPopExitAnim;
  }
  
  @NonNull
  public FragmentTransaction addSharedElement(@NonNull View paramView, @NonNull String paramString)
  {
    if (FragmentTransition.supportsTransition())
    {
      paramView = ViewCompat.getTransitionName(paramView);
      if (paramView != null)
      {
        if (mSharedElementSourceNames == null)
        {
          mSharedElementSourceNames = new ArrayList();
          mSharedElementTargetNames = new ArrayList();
        }
        else
        {
          if (mSharedElementTargetNames.contains(paramString)) {
            break label106;
          }
          if (mSharedElementSourceNames.contains(paramView)) {
            break label90;
          }
        }
        mSharedElementSourceNames.add(paramView);
        mSharedElementTargetNames.add(paramString);
        return this;
        label90:
        throw new IllegalArgumentException(z2.p("A shared element with the source name '", paramView, "' has already been added to the transaction."));
        label106:
        throw new IllegalArgumentException(z2.p("A shared element with the target name '", paramString, "' has already been added to the transaction."));
      }
      else
      {
        throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
      }
    }
    return this;
  }
  
  @NonNull
  public FragmentTransaction addToBackStack(@Nullable String paramString)
  {
    if (mAllowAddToBackStack)
    {
      mAddToBackStack = true;
      mName = paramString;
      return this;
    }
    throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
  }
  
  @NonNull
  public FragmentTransaction attach(@NonNull Fragment paramFragment)
  {
    addOp(new Op(7, paramFragment));
    return this;
  }
  
  public abstract int commit();
  
  public abstract int commitAllowingStateLoss();
  
  public abstract void commitNow();
  
  public abstract void commitNowAllowingStateLoss();
  
  @NonNull
  public FragmentTransaction detach(@NonNull Fragment paramFragment)
  {
    addOp(new Op(6, paramFragment));
    return this;
  }
  
  @NonNull
  public FragmentTransaction disallowAddToBackStack()
  {
    if (!mAddToBackStack)
    {
      mAllowAddToBackStack = false;
      return this;
    }
    throw new IllegalStateException("This transaction is already being added to the back stack");
  }
  
  public void doAddOp(int paramInt1, Fragment paramFragment, @Nullable String paramString, int paramInt2)
  {
    Object localObject = paramFragment.getClass();
    int i = ((Class)localObject).getModifiers();
    if ((!((Class)localObject).isAnonymousClass()) && (Modifier.isPublic(i)) && ((!((Class)localObject).isMemberClass()) || (Modifier.isStatic(i))))
    {
      if (paramString != null)
      {
        localObject = mTag;
        if ((localObject != null) && (!paramString.equals(localObject)))
        {
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("Can't change tag of fragment ");
          ((StringBuilder)localObject).append(paramFragment);
          ((StringBuilder)localObject).append(": was ");
          throw new IllegalStateException(a.p((StringBuilder)localObject, mTag, " now ", paramString));
        }
        mTag = paramString;
      }
      if (paramInt1 != 0) {
        if (paramInt1 != -1)
        {
          i = mFragmentId;
          if ((i != 0) && (i != paramInt1))
          {
            paramString = new StringBuilder();
            paramString.append("Can't change container ID of fragment ");
            paramString.append(paramFragment);
            paramString.append(": was ");
            paramString.append(mFragmentId);
            paramString.append(" now ");
            paramString.append(paramInt1);
            throw new IllegalStateException(paramString.toString());
          }
          mFragmentId = paramInt1;
          mContainerId = paramInt1;
        }
        else
        {
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("Can't add fragment ");
          ((StringBuilder)localObject).append(paramFragment);
          ((StringBuilder)localObject).append(" with tag ");
          ((StringBuilder)localObject).append(paramString);
          ((StringBuilder)localObject).append(" to container view with no id");
          throw new IllegalArgumentException(((StringBuilder)localObject).toString());
        }
      }
      addOp(new Op(paramInt2, paramFragment));
      return;
    }
    paramFragment = z2.t("Fragment ");
    paramFragment.append(((Class)localObject).getCanonicalName());
    paramFragment.append(" must be a public static class to be  properly recreated from instance state.");
    throw new IllegalStateException(paramFragment.toString());
  }
  
  @NonNull
  public FragmentTransaction hide(@NonNull Fragment paramFragment)
  {
    addOp(new Op(4, paramFragment));
    return this;
  }
  
  public boolean isAddToBackStackAllowed()
  {
    return mAllowAddToBackStack;
  }
  
  public boolean isEmpty()
  {
    return mOps.isEmpty();
  }
  
  @NonNull
  public FragmentTransaction remove(@NonNull Fragment paramFragment)
  {
    addOp(new Op(3, paramFragment));
    return this;
  }
  
  @NonNull
  public FragmentTransaction replace(@IdRes int paramInt, @NonNull Fragment paramFragment)
  {
    return replace(paramInt, paramFragment, null);
  }
  
  @NonNull
  public FragmentTransaction replace(@IdRes int paramInt, @NonNull Fragment paramFragment, @Nullable String paramString)
  {
    if (paramInt != 0)
    {
      doAddOp(paramInt, paramFragment, paramString, 2);
      return this;
    }
    throw new IllegalArgumentException("Must use non-zero containerViewId");
  }
  
  @NonNull
  public final FragmentTransaction replace(@IdRes int paramInt, @NonNull Class<? extends Fragment> paramClass, @Nullable Bundle paramBundle)
  {
    return replace(paramInt, paramClass, paramBundle, null);
  }
  
  @NonNull
  public final FragmentTransaction replace(@IdRes int paramInt, @NonNull Class<? extends Fragment> paramClass, @Nullable Bundle paramBundle, @Nullable String paramString)
  {
    return replace(paramInt, createFragment(paramClass, paramBundle), paramString);
  }
  
  @NonNull
  public FragmentTransaction runOnCommit(@NonNull Runnable paramRunnable)
  {
    disallowAddToBackStack();
    if (mCommitRunnables == null) {
      mCommitRunnables = new ArrayList();
    }
    mCommitRunnables.add(paramRunnable);
    return this;
  }
  
  @Deprecated
  @NonNull
  public FragmentTransaction setAllowOptimization(boolean paramBoolean)
  {
    return setReorderingAllowed(paramBoolean);
  }
  
  @Deprecated
  @NonNull
  public FragmentTransaction setBreadCrumbShortTitle(@StringRes int paramInt)
  {
    mBreadCrumbShortTitleRes = paramInt;
    mBreadCrumbShortTitleText = null;
    return this;
  }
  
  @Deprecated
  @NonNull
  public FragmentTransaction setBreadCrumbShortTitle(@Nullable CharSequence paramCharSequence)
  {
    mBreadCrumbShortTitleRes = 0;
    mBreadCrumbShortTitleText = paramCharSequence;
    return this;
  }
  
  @Deprecated
  @NonNull
  public FragmentTransaction setBreadCrumbTitle(@StringRes int paramInt)
  {
    mBreadCrumbTitleRes = paramInt;
    mBreadCrumbTitleText = null;
    return this;
  }
  
  @Deprecated
  @NonNull
  public FragmentTransaction setBreadCrumbTitle(@Nullable CharSequence paramCharSequence)
  {
    mBreadCrumbTitleRes = 0;
    mBreadCrumbTitleText = paramCharSequence;
    return this;
  }
  
  @NonNull
  public FragmentTransaction setCustomAnimations(@AnimRes @AnimatorRes int paramInt1, @AnimRes @AnimatorRes int paramInt2)
  {
    return setCustomAnimations(paramInt1, paramInt2, 0, 0);
  }
  
  @NonNull
  public FragmentTransaction setCustomAnimations(@AnimRes @AnimatorRes int paramInt1, @AnimRes @AnimatorRes int paramInt2, @AnimRes @AnimatorRes int paramInt3, @AnimRes @AnimatorRes int paramInt4)
  {
    mEnterAnim = paramInt1;
    mExitAnim = paramInt2;
    mPopEnterAnim = paramInt3;
    mPopExitAnim = paramInt4;
    return this;
  }
  
  @NonNull
  public FragmentTransaction setMaxLifecycle(@NonNull Fragment paramFragment, @NonNull Lifecycle.State paramState)
  {
    addOp(new Op(10, paramFragment, paramState));
    return this;
  }
  
  @NonNull
  public FragmentTransaction setPrimaryNavigationFragment(@Nullable Fragment paramFragment)
  {
    addOp(new Op(8, paramFragment));
    return this;
  }
  
  @NonNull
  public FragmentTransaction setReorderingAllowed(boolean paramBoolean)
  {
    mReorderingAllowed = paramBoolean;
    return this;
  }
  
  @NonNull
  public FragmentTransaction setTransition(int paramInt)
  {
    mTransition = paramInt;
    return this;
  }
  
  @Deprecated
  @NonNull
  public FragmentTransaction setTransitionStyle(@StyleRes int paramInt)
  {
    return this;
  }
  
  @NonNull
  public FragmentTransaction show(@NonNull Fragment paramFragment)
  {
    addOp(new Op(5, paramFragment));
    return this;
  }
  
  public static final class Op
  {
    public int mCmd;
    public Lifecycle.State mCurrentMaxState;
    public int mEnterAnim;
    public int mExitAnim;
    public Fragment mFragment;
    public Lifecycle.State mOldMaxState;
    public int mPopEnterAnim;
    public int mPopExitAnim;
    
    public Op() {}
    
    public Op(int paramInt, Fragment paramFragment)
    {
      mCmd = paramInt;
      mFragment = paramFragment;
      paramFragment = Lifecycle.State.RESUMED;
      mOldMaxState = paramFragment;
      mCurrentMaxState = paramFragment;
    }
    
    public Op(int paramInt, @NonNull Fragment paramFragment, Lifecycle.State paramState)
    {
      mCmd = paramInt;
      mFragment = paramFragment;
      mOldMaxState = mMaxState;
      mCurrentMaxState = paramState;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentTransaction
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */