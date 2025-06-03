package androidx.fragment.app;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ListFragment
  extends Fragment
{
  public static final int INTERNAL_EMPTY_ID = 16711681;
  public static final int INTERNAL_LIST_CONTAINER_ID = 16711683;
  public static final int INTERNAL_PROGRESS_CONTAINER_ID = 16711682;
  public ListAdapter mAdapter;
  public CharSequence mEmptyText;
  public View mEmptyView;
  private final Handler mHandler = new Handler();
  public ListView mList;
  public View mListContainer;
  public boolean mListShown;
  private final AdapterView.OnItemClickListener mOnClickListener = new AdapterView.OnItemClickListener()
  {
    public void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
    {
      onListItemClick((ListView)paramAnonymousAdapterView, paramAnonymousView, paramAnonymousInt, paramAnonymousLong);
    }
  };
  public View mProgressContainer;
  private final Runnable mRequestFocus = new Runnable()
  {
    public void run()
    {
      ListView localListView = mList;
      localListView.focusableViewAvailable(localListView);
    }
  };
  public TextView mStandardEmptyView;
  
  private void ensureList()
  {
    if (mList != null) {
      return;
    }
    Object localObject1 = getView();
    if (localObject1 != null)
    {
      if ((localObject1 instanceof ListView))
      {
        mList = ((ListView)localObject1);
      }
      else
      {
        localObject2 = (TextView)((View)localObject1).findViewById(16711681);
        mStandardEmptyView = ((TextView)localObject2);
        if (localObject2 == null) {
          mEmptyView = ((View)localObject1).findViewById(16908292);
        } else {
          ((View)localObject2).setVisibility(8);
        }
        mProgressContainer = ((View)localObject1).findViewById(16711682);
        mListContainer = ((View)localObject1).findViewById(16711683);
        localObject2 = ((View)localObject1).findViewById(16908298);
        if (!(localObject2 instanceof ListView))
        {
          if (localObject2 == null) {
            throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
          }
          throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
        }
        localObject1 = (ListView)localObject2;
        mList = ((ListView)localObject1);
        localObject2 = mEmptyView;
        if (localObject2 != null)
        {
          ((AdapterView)localObject1).setEmptyView((View)localObject2);
        }
        else
        {
          localObject2 = mEmptyText;
          if (localObject2 != null)
          {
            mStandardEmptyView.setText((CharSequence)localObject2);
            mList.setEmptyView(mStandardEmptyView);
          }
        }
      }
      mListShown = true;
      mList.setOnItemClickListener(mOnClickListener);
      Object localObject2 = mAdapter;
      if (localObject2 != null)
      {
        mAdapter = null;
        setListAdapter((ListAdapter)localObject2);
      }
      else if (mProgressContainer != null)
      {
        setListShown(false, false);
      }
      mHandler.post(mRequestFocus);
      return;
    }
    throw new IllegalStateException("Content view not yet created");
  }
  
  private void setListShown(boolean paramBoolean1, boolean paramBoolean2)
  {
    ensureList();
    View localView = mProgressContainer;
    if (localView != null)
    {
      if (mListShown == paramBoolean1) {
        return;
      }
      mListShown = paramBoolean1;
      if (paramBoolean1)
      {
        if (paramBoolean2)
        {
          localView.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432577));
          mListContainer.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
        }
        else
        {
          localView.clearAnimation();
          mListContainer.clearAnimation();
        }
        mProgressContainer.setVisibility(8);
        mListContainer.setVisibility(0);
      }
      else
      {
        if (paramBoolean2)
        {
          localView.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
          mListContainer.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432577));
        }
        else
        {
          localView.clearAnimation();
          mListContainer.clearAnimation();
        }
        mProgressContainer.setVisibility(0);
        mListContainer.setVisibility(8);
      }
      return;
    }
    throw new IllegalStateException("Can't be used with a custom content view");
  }
  
  @Nullable
  public ListAdapter getListAdapter()
  {
    return mAdapter;
  }
  
  @NonNull
  public ListView getListView()
  {
    ensureList();
    return mList;
  }
  
  public long getSelectedItemId()
  {
    ensureList();
    return mList.getSelectedItemId();
  }
  
  public int getSelectedItemPosition()
  {
    ensureList();
    return mList.getSelectedItemPosition();
  }
  
  @Nullable
  public View onCreateView(@NonNull LayoutInflater paramLayoutInflater, @Nullable ViewGroup paramViewGroup, @Nullable Bundle paramBundle)
  {
    paramBundle = requireContext();
    paramLayoutInflater = new FrameLayout(paramBundle);
    paramViewGroup = new LinearLayout(paramBundle);
    paramViewGroup.setId(16711682);
    paramViewGroup.setOrientation(1);
    paramViewGroup.setVisibility(8);
    paramViewGroup.setGravity(17);
    paramViewGroup.addView(new ProgressBar(paramBundle, null, 16842874), new FrameLayout.LayoutParams(-2, -2));
    paramLayoutInflater.addView(paramViewGroup, new FrameLayout.LayoutParams(-1, -1));
    paramViewGroup = new FrameLayout(paramBundle);
    paramViewGroup.setId(16711683);
    TextView localTextView = new TextView(paramBundle);
    localTextView.setId(16711681);
    localTextView.setGravity(17);
    paramViewGroup.addView(localTextView, new FrameLayout.LayoutParams(-1, -1));
    paramBundle = new ListView(paramBundle);
    paramBundle.setId(16908298);
    paramBundle.setDrawSelectorOnTop(false);
    paramViewGroup.addView(paramBundle, new FrameLayout.LayoutParams(-1, -1));
    paramLayoutInflater.addView(paramViewGroup, new FrameLayout.LayoutParams(-1, -1));
    paramLayoutInflater.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    return paramLayoutInflater;
  }
  
  public void onDestroyView()
  {
    mHandler.removeCallbacks(mRequestFocus);
    mList = null;
    mListShown = false;
    mListContainer = null;
    mProgressContainer = null;
    mEmptyView = null;
    mStandardEmptyView = null;
    super.onDestroyView();
  }
  
  public void onListItemClick(@NonNull ListView paramListView, @NonNull View paramView, int paramInt, long paramLong) {}
  
  public void onViewCreated(@NonNull View paramView, @Nullable Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    ensureList();
  }
  
  @NonNull
  public final ListAdapter requireListAdapter()
  {
    Object localObject = getListAdapter();
    if (localObject != null) {
      return (ListAdapter)localObject;
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("ListFragment ");
    ((StringBuilder)localObject).append(this);
    ((StringBuilder)localObject).append(" does not have a ListAdapter.");
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  public void setEmptyText(@Nullable CharSequence paramCharSequence)
  {
    ensureList();
    TextView localTextView = mStandardEmptyView;
    if (localTextView != null)
    {
      localTextView.setText(paramCharSequence);
      if (mEmptyText == null) {
        mList.setEmptyView(mStandardEmptyView);
      }
      mEmptyText = paramCharSequence;
      return;
    }
    throw new IllegalStateException("Can't be used with a custom content view");
  }
  
  public void setListAdapter(@Nullable ListAdapter paramListAdapter)
  {
    Object localObject = mAdapter;
    boolean bool = false;
    int i;
    if (localObject != null) {
      i = 1;
    } else {
      i = 0;
    }
    mAdapter = paramListAdapter;
    localObject = mList;
    if (localObject != null)
    {
      ((ListView)localObject).setAdapter(paramListAdapter);
      if ((!mListShown) && (i == 0))
      {
        if (requireView().getWindowToken() != null) {
          bool = true;
        }
        setListShown(true, bool);
      }
    }
  }
  
  public void setListShown(boolean paramBoolean)
  {
    setListShown(paramBoolean, true);
  }
  
  public void setListShownNoAnimation(boolean paramBoolean)
  {
    setListShown(paramBoolean, false);
  }
  
  public void setSelection(int paramInt)
  {
    ensureList();
    mList.setSelection(paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.ListFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */