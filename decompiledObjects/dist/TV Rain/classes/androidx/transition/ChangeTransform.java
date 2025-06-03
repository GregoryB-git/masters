package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.view.ViewCompat;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;

public class ChangeTransform
  extends Transition
{
  private static final Property<PathAnimatorMatrix, float[]> NON_TRANSLATIONS_PROPERTY;
  private static final String PROPNAME_INTERMEDIATE_MATRIX = "android:changeTransform:intermediateMatrix";
  private static final String PROPNAME_INTERMEDIATE_PARENT_MATRIX = "android:changeTransform:intermediateParentMatrix";
  private static final String PROPNAME_MATRIX = "android:changeTransform:matrix";
  private static final String PROPNAME_PARENT = "android:changeTransform:parent";
  private static final String PROPNAME_PARENT_MATRIX = "android:changeTransform:parentMatrix";
  private static final String PROPNAME_TRANSFORMS = "android:changeTransform:transforms";
  private static final boolean SUPPORTS_VIEW_REMOVAL_SUPPRESSION = true;
  private static final Property<PathAnimatorMatrix, PointF> TRANSLATIONS_PROPERTY;
  private static final String[] sTransitionProperties = { "android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix" };
  private boolean mReparent = true;
  private Matrix mTempMatrix = new Matrix();
  public boolean mUseOverlay = true;
  
  static
  {
    NON_TRANSLATIONS_PROPERTY = new Property(float[].class, "nonTranslations")
    {
      public float[] get(ChangeTransform.PathAnimatorMatrix paramAnonymousPathAnimatorMatrix)
      {
        return null;
      }
      
      public void set(ChangeTransform.PathAnimatorMatrix paramAnonymousPathAnimatorMatrix, float[] paramAnonymousArrayOfFloat)
      {
        paramAnonymousPathAnimatorMatrix.setValues(paramAnonymousArrayOfFloat);
      }
    };
    TRANSLATIONS_PROPERTY = new Property(PointF.class, "translations")
    {
      public PointF get(ChangeTransform.PathAnimatorMatrix paramAnonymousPathAnimatorMatrix)
      {
        return null;
      }
      
      public void set(ChangeTransform.PathAnimatorMatrix paramAnonymousPathAnimatorMatrix, PointF paramAnonymousPointF)
      {
        paramAnonymousPathAnimatorMatrix.setTranslation(paramAnonymousPointF);
      }
    };
  }
  
  public ChangeTransform() {}
  
  @SuppressLint({"RestrictedApi"})
  public ChangeTransform(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, Styleable.CHANGE_TRANSFORM);
    paramAttributeSet = (XmlPullParser)paramAttributeSet;
    mUseOverlay = TypedArrayUtils.getNamedBoolean(paramContext, paramAttributeSet, "reparentWithOverlay", 1, true);
    mReparent = TypedArrayUtils.getNamedBoolean(paramContext, paramAttributeSet, "reparent", 0, true);
    paramContext.recycle();
  }
  
  private void captureValues(TransitionValues paramTransitionValues)
  {
    View localView = view;
    if (localView.getVisibility() == 8) {
      return;
    }
    values.put("android:changeTransform:parent", localView.getParent());
    Object localObject = new Transforms(localView);
    values.put("android:changeTransform:transforms", localObject);
    localObject = localView.getMatrix();
    if ((localObject != null) && (!((Matrix)localObject).isIdentity())) {
      localObject = new Matrix((Matrix)localObject);
    } else {
      localObject = null;
    }
    values.put("android:changeTransform:matrix", localObject);
    if (mReparent)
    {
      localObject = new Matrix();
      ViewGroup localViewGroup = (ViewGroup)localView.getParent();
      ViewUtils.transformMatrixToGlobal(localViewGroup, (Matrix)localObject);
      ((Matrix)localObject).preTranslate(-localViewGroup.getScrollX(), -localViewGroup.getScrollY());
      values.put("android:changeTransform:parentMatrix", localObject);
      values.put("android:changeTransform:intermediateMatrix", localView.getTag(R.id.transition_transform));
      values.put("android:changeTransform:intermediateParentMatrix", localView.getTag(R.id.parent_matrix));
    }
  }
  
  private void createGhostView(ViewGroup paramViewGroup, TransitionValues paramTransitionValues1, TransitionValues paramTransitionValues2)
  {
    View localView = view;
    Object localObject = new Matrix((Matrix)values.get("android:changeTransform:parentMatrix"));
    ViewUtils.transformMatrixToLocal(paramViewGroup, (Matrix)localObject);
    GhostView localGhostView = GhostViewUtils.addGhost(localView, paramViewGroup, (Matrix)localObject);
    if (localGhostView == null) {
      return;
    }
    localGhostView.reserveEndViewTransition((ViewGroup)values.get("android:changeTransform:parent"), view);
    for (paramViewGroup = this;; paramViewGroup = (ViewGroup)localObject)
    {
      localObject = mParent;
      if (localObject == null) {
        break;
      }
    }
    paramViewGroup.addListener(new GhostListener(localView, localGhostView));
    if (SUPPORTS_VIEW_REMOVAL_SUPPRESSION)
    {
      paramViewGroup = view;
      if (paramViewGroup != view) {
        ViewUtils.setTransitionAlpha(paramViewGroup, 0.0F);
      }
      ViewUtils.setTransitionAlpha(localView, 1.0F);
    }
  }
  
  private ObjectAnimator createTransformAnimator(final TransitionValues paramTransitionValues1, final TransitionValues paramTransitionValues2, final boolean paramBoolean)
  {
    paramTransitionValues1 = (Matrix)values.get("android:changeTransform:matrix");
    final Object localObject1 = (Matrix)values.get("android:changeTransform:matrix");
    final Object localObject2 = paramTransitionValues1;
    if (paramTransitionValues1 == null) {
      localObject2 = MatrixUtils.IDENTITY_MATRIX;
    }
    paramTransitionValues1 = (TransitionValues)localObject1;
    if (localObject1 == null) {
      paramTransitionValues1 = MatrixUtils.IDENTITY_MATRIX;
    }
    if (((Matrix)localObject2).equals(paramTransitionValues1)) {
      return null;
    }
    localObject1 = (Transforms)values.get("android:changeTransform:transforms");
    paramTransitionValues2 = view;
    setIdentityTransforms(paramTransitionValues2);
    Object localObject3 = new float[9];
    ((Matrix)localObject2).getValues((float[])localObject3);
    float[] arrayOfFloat = new float[9];
    paramTransitionValues1.getValues(arrayOfFloat);
    localObject2 = new PathAnimatorMatrix(paramTransitionValues2, (float[])localObject3);
    PropertyValuesHolder localPropertyValuesHolder = PropertyValuesHolder.ofObject(NON_TRANSLATIONS_PROPERTY, new FloatArrayEvaluator(new float[9]), new float[][] { localObject3, arrayOfFloat });
    localObject3 = getPathMotion().getPath(localObject3[2], localObject3[5], arrayOfFloat[2], arrayOfFloat[5]);
    localObject3 = ObjectAnimator.ofPropertyValuesHolder(localObject2, new PropertyValuesHolder[] { localPropertyValuesHolder, PropertyValuesHolderUtils.ofPointF(TRANSLATIONS_PROPERTY, (Path)localObject3) });
    paramTransitionValues1 = new AnimatorListenerAdapter()
    {
      private boolean mIsCanceled;
      private Matrix mTempMatrix = new Matrix();
      
      private void setCurrentMatrix(Matrix paramAnonymousMatrix)
      {
        mTempMatrix.set(paramAnonymousMatrix);
        paramTransitionValues2.setTag(R.id.transition_transform, mTempMatrix);
        localObject1.restore(paramTransitionValues2);
      }
      
      public void onAnimationCancel(Animator paramAnonymousAnimator)
      {
        mIsCanceled = true;
      }
      
      public void onAnimationEnd(Animator paramAnonymousAnimator)
      {
        if (!mIsCanceled) {
          if ((paramBoolean) && (mUseOverlay))
          {
            setCurrentMatrix(paramTransitionValues1);
          }
          else
          {
            paramTransitionValues2.setTag(R.id.transition_transform, null);
            paramTransitionValues2.setTag(R.id.parent_matrix, null);
          }
        }
        ViewUtils.setAnimationMatrix(paramTransitionValues2, null);
        localObject1.restore(paramTransitionValues2);
      }
      
      public void onAnimationPause(Animator paramAnonymousAnimator)
      {
        setCurrentMatrix(localObject2.getMatrix());
      }
      
      public void onAnimationResume(Animator paramAnonymousAnimator)
      {
        ChangeTransform.setIdentityTransforms(paramTransitionValues2);
      }
    };
    ((Animator)localObject3).addListener(paramTransitionValues1);
    AnimatorUtils.addPauseListener((Animator)localObject3, paramTransitionValues1);
    return (ObjectAnimator)localObject3;
  }
  
  private boolean parentsMatch(ViewGroup paramViewGroup1, ViewGroup paramViewGroup2)
  {
    boolean bool1 = isValidTarget(paramViewGroup1);
    boolean bool2 = true;
    boolean bool3 = false;
    if ((bool1) && (isValidTarget(paramViewGroup2)))
    {
      paramViewGroup1 = getMatchedTransitionValues(paramViewGroup1, true);
      if (paramViewGroup1 == null) {
        break label68;
      }
      if (paramViewGroup2 == view)
      {
        bool3 = bool2;
        break label68;
      }
    }
    else if (paramViewGroup1 == paramViewGroup2)
    {
      bool3 = bool2;
      break label68;
    }
    bool3 = false;
    label68:
    return bool3;
  }
  
  public static void setIdentityTransforms(View paramView)
  {
    setTransforms(paramView, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
  }
  
  private void setMatricesForParent(TransitionValues paramTransitionValues1, TransitionValues paramTransitionValues2)
  {
    Matrix localMatrix1 = (Matrix)values.get("android:changeTransform:parentMatrix");
    view.setTag(R.id.parent_matrix, localMatrix1);
    Matrix localMatrix2 = mTempMatrix;
    localMatrix2.reset();
    localMatrix1.invert(localMatrix2);
    localMatrix1 = (Matrix)values.get("android:changeTransform:matrix");
    paramTransitionValues2 = localMatrix1;
    if (localMatrix1 == null)
    {
      paramTransitionValues2 = new Matrix();
      values.put("android:changeTransform:matrix", paramTransitionValues2);
    }
    paramTransitionValues2.postConcat((Matrix)values.get("android:changeTransform:parentMatrix"));
    paramTransitionValues2.postConcat(localMatrix2);
  }
  
  public static void setTransforms(View paramView, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8)
  {
    paramView.setTranslationX(paramFloat1);
    paramView.setTranslationY(paramFloat2);
    ViewCompat.setTranslationZ(paramView, paramFloat3);
    paramView.setScaleX(paramFloat4);
    paramView.setScaleY(paramFloat5);
    paramView.setRotationX(paramFloat6);
    paramView.setRotationY(paramFloat7);
    paramView.setRotation(paramFloat8);
  }
  
  public void captureEndValues(@NonNull TransitionValues paramTransitionValues)
  {
    captureValues(paramTransitionValues);
  }
  
  public void captureStartValues(@NonNull TransitionValues paramTransitionValues)
  {
    captureValues(paramTransitionValues);
    if (!SUPPORTS_VIEW_REMOVAL_SUPPRESSION) {
      ((ViewGroup)view.getParent()).startViewTransition(view);
    }
  }
  
  public Animator createAnimator(@NonNull ViewGroup paramViewGroup, TransitionValues paramTransitionValues1, TransitionValues paramTransitionValues2)
  {
    if ((paramTransitionValues1 != null) && (paramTransitionValues2 != null) && (values.containsKey("android:changeTransform:parent")) && (values.containsKey("android:changeTransform:parent")))
    {
      ViewGroup localViewGroup = (ViewGroup)values.get("android:changeTransform:parent");
      Object localObject = (ViewGroup)values.get("android:changeTransform:parent");
      boolean bool;
      if ((mReparent) && (!parentsMatch(localViewGroup, (ViewGroup)localObject))) {
        bool = true;
      } else {
        bool = false;
      }
      localObject = (Matrix)values.get("android:changeTransform:intermediateMatrix");
      if (localObject != null) {
        values.put("android:changeTransform:matrix", localObject);
      }
      localObject = (Matrix)values.get("android:changeTransform:intermediateParentMatrix");
      if (localObject != null) {
        values.put("android:changeTransform:parentMatrix", localObject);
      }
      if (bool) {
        setMatricesForParent(paramTransitionValues1, paramTransitionValues2);
      }
      localObject = createTransformAnimator(paramTransitionValues1, paramTransitionValues2, bool);
      if ((bool) && (localObject != null) && (mUseOverlay)) {
        createGhostView(paramViewGroup, paramTransitionValues1, paramTransitionValues2);
      } else if (!SUPPORTS_VIEW_REMOVAL_SUPPRESSION) {
        localViewGroup.endViewTransition(view);
      }
      return (Animator)localObject;
    }
    return null;
  }
  
  public boolean getReparent()
  {
    return mReparent;
  }
  
  public boolean getReparentWithOverlay()
  {
    return mUseOverlay;
  }
  
  public String[] getTransitionProperties()
  {
    return sTransitionProperties;
  }
  
  public void setReparent(boolean paramBoolean)
  {
    mReparent = paramBoolean;
  }
  
  public void setReparentWithOverlay(boolean paramBoolean)
  {
    mUseOverlay = paramBoolean;
  }
  
  public static class GhostListener
    extends TransitionListenerAdapter
  {
    private GhostView mGhostView;
    private View mView;
    
    public GhostListener(View paramView, GhostView paramGhostView)
    {
      mView = paramView;
      mGhostView = paramGhostView;
    }
    
    public void onTransitionEnd(@NonNull Transition paramTransition)
    {
      paramTransition.removeListener(this);
      GhostViewUtils.removeGhost(mView);
      mView.setTag(R.id.transition_transform, null);
      mView.setTag(R.id.parent_matrix, null);
    }
    
    public void onTransitionPause(@NonNull Transition paramTransition)
    {
      mGhostView.setVisibility(4);
    }
    
    public void onTransitionResume(@NonNull Transition paramTransition)
    {
      mGhostView.setVisibility(0);
    }
  }
  
  public static class PathAnimatorMatrix
  {
    private final Matrix mMatrix = new Matrix();
    private float mTranslationX;
    private float mTranslationY;
    private final float[] mValues;
    private final View mView;
    
    public PathAnimatorMatrix(View paramView, float[] paramArrayOfFloat)
    {
      mView = paramView;
      paramView = (float[])paramArrayOfFloat.clone();
      mValues = paramView;
      mTranslationX = paramView[2];
      mTranslationY = paramView[5];
      setAnimationMatrix();
    }
    
    private void setAnimationMatrix()
    {
      float[] arrayOfFloat = mValues;
      arrayOfFloat[2] = mTranslationX;
      arrayOfFloat[5] = mTranslationY;
      mMatrix.setValues(arrayOfFloat);
      ViewUtils.setAnimationMatrix(mView, mMatrix);
    }
    
    public Matrix getMatrix()
    {
      return mMatrix;
    }
    
    public void setTranslation(PointF paramPointF)
    {
      mTranslationX = x;
      mTranslationY = y;
      setAnimationMatrix();
    }
    
    public void setValues(float[] paramArrayOfFloat)
    {
      System.arraycopy(paramArrayOfFloat, 0, mValues, 0, paramArrayOfFloat.length);
      setAnimationMatrix();
    }
  }
  
  public static class Transforms
  {
    public final float mRotationX;
    public final float mRotationY;
    public final float mRotationZ;
    public final float mScaleX;
    public final float mScaleY;
    public final float mTranslationX;
    public final float mTranslationY;
    public final float mTranslationZ;
    
    public Transforms(View paramView)
    {
      mTranslationX = paramView.getTranslationX();
      mTranslationY = paramView.getTranslationY();
      mTranslationZ = ViewCompat.getTranslationZ(paramView);
      mScaleX = paramView.getScaleX();
      mScaleY = paramView.getScaleY();
      mRotationX = paramView.getRotationX();
      mRotationY = paramView.getRotationY();
      mRotationZ = paramView.getRotation();
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool1 = paramObject instanceof Transforms;
      boolean bool2 = false;
      if (!bool1) {
        return false;
      }
      paramObject = (Transforms)paramObject;
      bool1 = bool2;
      if (mTranslationX == mTranslationX)
      {
        bool1 = bool2;
        if (mTranslationY == mTranslationY)
        {
          bool1 = bool2;
          if (mTranslationZ == mTranslationZ)
          {
            bool1 = bool2;
            if (mScaleX == mScaleX)
            {
              bool1 = bool2;
              if (mScaleY == mScaleY)
              {
                bool1 = bool2;
                if (mRotationX == mRotationX)
                {
                  bool1 = bool2;
                  if (mRotationY == mRotationY)
                  {
                    bool1 = bool2;
                    if (mRotationZ == mRotationZ) {
                      bool1 = true;
                    }
                  }
                }
              }
            }
          }
        }
      }
      return bool1;
    }
    
    public int hashCode()
    {
      float f = mTranslationX;
      int i = 0;
      int j;
      if (f != 0.0F) {
        j = Float.floatToIntBits(f);
      } else {
        j = 0;
      }
      f = mTranslationY;
      int k;
      if (f != 0.0F) {
        k = Float.floatToIntBits(f);
      } else {
        k = 0;
      }
      f = mTranslationZ;
      int m;
      if (f != 0.0F) {
        m = Float.floatToIntBits(f);
      } else {
        m = 0;
      }
      f = mScaleX;
      int n;
      if (f != 0.0F) {
        n = Float.floatToIntBits(f);
      } else {
        n = 0;
      }
      f = mScaleY;
      int i1;
      if (f != 0.0F) {
        i1 = Float.floatToIntBits(f);
      } else {
        i1 = 0;
      }
      f = mRotationX;
      int i2;
      if (f != 0.0F) {
        i2 = Float.floatToIntBits(f);
      } else {
        i2 = 0;
      }
      f = mRotationY;
      int i3;
      if (f != 0.0F) {
        i3 = Float.floatToIntBits(f);
      } else {
        i3 = 0;
      }
      f = mRotationZ;
      if (f != 0.0F) {
        i = Float.floatToIntBits(f);
      }
      return ((((((j * 31 + k) * 31 + m) * 31 + n) * 31 + i1) * 31 + i2) * 31 + i3) * 31 + i;
    }
    
    public void restore(View paramView)
    {
      ChangeTransform.setTransforms(paramView, mTranslationX, mTranslationY, mTranslationZ, mScaleX, mScaleY, mRotationX, mRotationY, mRotationZ);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.transition.ChangeTransform
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */