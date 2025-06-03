package androidx.transition;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Scene
{
  private Context mContext;
  private Runnable mEnterAction;
  private Runnable mExitAction;
  private View mLayout;
  private int mLayoutId;
  private ViewGroup mSceneRoot;
  
  public Scene(@NonNull ViewGroup paramViewGroup)
  {
    mLayoutId = -1;
    mSceneRoot = paramViewGroup;
  }
  
  private Scene(ViewGroup paramViewGroup, int paramInt, Context paramContext)
  {
    mContext = paramContext;
    mSceneRoot = paramViewGroup;
    mLayoutId = paramInt;
  }
  
  public Scene(@NonNull ViewGroup paramViewGroup, @NonNull View paramView)
  {
    mLayoutId = -1;
    mSceneRoot = paramViewGroup;
    mLayout = paramView;
  }
  
  @Nullable
  public static Scene getCurrentScene(@NonNull ViewGroup paramViewGroup)
  {
    return (Scene)paramViewGroup.getTag(R.id.transition_current_scene);
  }
  
  @NonNull
  public static Scene getSceneForLayout(@NonNull ViewGroup paramViewGroup, @LayoutRes int paramInt, @NonNull Context paramContext)
  {
    int i = R.id.transition_scene_layoutid_cache;
    Object localObject1 = (SparseArray)paramViewGroup.getTag(i);
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject2 = new SparseArray();
      paramViewGroup.setTag(i, localObject2);
    }
    localObject1 = (Scene)((SparseArray)localObject2).get(paramInt);
    if (localObject1 != null) {
      return (Scene)localObject1;
    }
    paramViewGroup = new Scene(paramViewGroup, paramInt, paramContext);
    ((SparseArray)localObject2).put(paramInt, paramViewGroup);
    return paramViewGroup;
  }
  
  public static void setCurrentScene(@NonNull ViewGroup paramViewGroup, @Nullable Scene paramScene)
  {
    paramViewGroup.setTag(R.id.transition_current_scene, paramScene);
  }
  
  public void enter()
  {
    if ((mLayoutId > 0) || (mLayout != null))
    {
      getSceneRoot().removeAllViews();
      if (mLayoutId > 0) {
        LayoutInflater.from(mContext).inflate(mLayoutId, mSceneRoot);
      } else {
        mSceneRoot.addView(mLayout);
      }
    }
    Runnable localRunnable = mEnterAction;
    if (localRunnable != null) {
      localRunnable.run();
    }
    setCurrentScene(mSceneRoot, this);
  }
  
  public void exit()
  {
    if (getCurrentScene(mSceneRoot) == this)
    {
      Runnable localRunnable = mExitAction;
      if (localRunnable != null) {
        localRunnable.run();
      }
    }
  }
  
  @NonNull
  public ViewGroup getSceneRoot()
  {
    return mSceneRoot;
  }
  
  public boolean isCreatedFromLayoutResource()
  {
    boolean bool;
    if (mLayoutId > 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void setEnterAction(@Nullable Runnable paramRunnable)
  {
    mEnterAction = paramRunnable;
  }
  
  public void setExitAction(@Nullable Runnable paramRunnable)
  {
    mExitAction = paramRunnable;
  }
}

/* Location:
 * Qualified Name:     androidx.transition.Scene
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */