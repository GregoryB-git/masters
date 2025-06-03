.class public Ly1/e;
.super Landroid/view/ViewGroup;
.source "SourceFile"

# interfaces
.implements Le0/r;
.implements Le0/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly1/e$i;,
        Ly1/e$j;,
        Ly1/e$k;
    }
.end annotation


# static fields
.field private static final ALPHA_ANIMATION_DURATION:I = 0x12c

.field private static final ANIMATE_TO_START_DURATION:I = 0xc8

.field private static final ANIMATE_TO_TRIGGER_DURATION:I = 0xc8

.field public static final CIRCLE_DIAMETER:I = 0x28

.field public static final CIRCLE_DIAMETER_LARGE:I = 0x38

.field private static final DECELERATE_INTERPOLATION_FACTOR:F = 2.0f

.field public static final DEFAULT:I = 0x1

.field private static final DEFAULT_CIRCLE_TARGET:I = 0x40

.field public static final DEFAULT_SLINGSHOT_DISTANCE:I = -0x1

.field private static final DRAG_RATE:F = 0.5f

.field private static final INVALID_POINTER:I = -0x1

.field public static final LARGE:I = 0x0

.field private static final LAYOUT_ATTRS:[I

.field private static final LOG_TAG:Ljava/lang/String;

.field private static final MAX_ALPHA:I = 0xff

.field private static final MAX_PROGRESS_ANGLE:F = 0.8f

.field private static final SCALE_DOWN_DURATION:I = 0x96

.field private static final STARTING_PROGRESS_ALPHA:I = 0x4c


# instance fields
.field private mActivePointerId:I

.field private mAlphaMaxAnimation:Landroid/view/animation/Animation;

.field private mAlphaStartAnimation:Landroid/view/animation/Animation;

.field private final mAnimateToCorrectPosition:Landroid/view/animation/Animation;

.field private final mAnimateToStartPosition:Landroid/view/animation/Animation;

.field private mChildScrollUpCallback:Ly1/e$i;

.field private mCircleDiameter:I

.field public mCircleView:Ly1/a;

.field private mCircleViewIndex:I

.field public mCurrentTargetOffsetTop:I

.field public mCustomSlingshotDistance:I

.field private final mDecelerateInterpolator:Landroid/view/animation/DecelerateInterpolator;

.field private mEnableLegacyRequestDisallowInterceptTouch:Z

.field public mFrom:I

.field private mInitialDownY:F

.field private mInitialMotionY:F

.field private mIsBeingDragged:Z

.field public mListener:Ly1/e$j;

.field private mMediumAnimationDuration:I

.field private mNestedScrollInProgress:Z

.field private final mNestedScrollingChildHelper:Le0/p;

.field private final mNestedScrollingParentHelper:Le0/s;

.field private final mNestedScrollingV2ConsumedCompat:[I

.field public mNotify:Z

.field public mOriginalOffsetTop:I

.field private final mParentOffsetInWindow:[I

.field private final mParentScrollConsumed:[I

.field public mProgress:Ly1/d;

.field private mRefreshListener:Landroid/view/animation/Animation$AnimationListener;

.field public mRefreshing:Z

.field private mReturningToStart:Z

.field public mScale:Z

.field private mScaleAnimation:Landroid/view/animation/Animation;

.field private mScaleDownAnimation:Landroid/view/animation/Animation;

.field private mScaleDownToStartAnimation:Landroid/view/animation/Animation;

.field public mSpinnerOffsetEnd:I

.field public mStartingScale:F

.field private mTarget:Landroid/view/View;

.field private mTotalDragDistance:F

.field private mTotalUnconsumed:F

.field private mTouchSlop:I

.field public mUsingCustomStart:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, Ly1/e;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ly1/e;->LOG_TAG:Ljava/lang/String;

    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    const v2, 0x101000e

    aput v2, v0, v1

    sput-object v0, Ly1/e;->LAYOUT_ATTRS:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Ly1/e;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Ly1/e;->mRefreshing:Z

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, p0, Ly1/e;->mTotalDragDistance:F

    const/4 v1, 0x2

    new-array v2, v1, [I

    iput-object v2, p0, Ly1/e;->mParentScrollConsumed:[I

    new-array v2, v1, [I

    iput-object v2, p0, Ly1/e;->mParentOffsetInWindow:[I

    new-array v1, v1, [I

    iput-object v1, p0, Ly1/e;->mNestedScrollingV2ConsumedCompat:[I

    const/4 v1, -0x1

    iput v1, p0, Ly1/e;->mActivePointerId:I

    iput v1, p0, Ly1/e;->mCircleViewIndex:I

    new-instance v1, Ly1/e$a;

    invoke-direct {v1, p0}, Ly1/e$a;-><init>(Ly1/e;)V

    iput-object v1, p0, Ly1/e;->mRefreshListener:Landroid/view/animation/Animation$AnimationListener;

    new-instance v1, Ly1/e$f;

    invoke-direct {v1, p0}, Ly1/e$f;-><init>(Ly1/e;)V

    iput-object v1, p0, Ly1/e;->mAnimateToCorrectPosition:Landroid/view/animation/Animation;

    new-instance v1, Ly1/e$g;

    invoke-direct {v1, p0}, Ly1/e$g;-><init>(Ly1/e;)V

    iput-object v1, p0, Ly1/e;->mAnimateToStartPosition:Landroid/view/animation/Animation;

    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v1

    iput v1, p0, Ly1/e;->mTouchSlop:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x10e0001

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v1

    iput v1, p0, Ly1/e;->mMediumAnimationDuration:I

    invoke-virtual {p0, v0}, Landroid/view/View;->setWillNotDraw(Z)V

    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    const/high16 v2, 0x40000000    # 2.0f

    invoke-direct {v1, v2}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    iput-object v1, p0, Ly1/e;->mDecelerateInterpolator:Landroid/view/animation/DecelerateInterpolator;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v2, v1, Landroid/util/DisplayMetrics;->density:F

    const/high16 v3, 0x42200000    # 40.0f

    mul-float/2addr v2, v3

    float-to-int v2, v2

    iput v2, p0, Ly1/e;->mCircleDiameter:I

    invoke-direct {p0}, Ly1/e;->createProgressView()V

    const/4 v2, 0x1

    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->setChildrenDrawingOrderEnabled(Z)V

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    const/high16 v3, 0x42800000    # 64.0f

    mul-float/2addr v1, v3

    float-to-int v1, v1

    iput v1, p0, Ly1/e;->mSpinnerOffsetEnd:I

    int-to-float v1, v1

    iput v1, p0, Ly1/e;->mTotalDragDistance:F

    new-instance v1, Le0/s;

    invoke-direct {v1}, Le0/s;-><init>()V

    iput-object v1, p0, Ly1/e;->mNestedScrollingParentHelper:Le0/s;

    new-instance v1, Le0/p;

    invoke-direct {v1, p0}, Le0/p;-><init>(Landroid/view/View;)V

    iput-object v1, p0, Ly1/e;->mNestedScrollingChildHelper:Le0/p;

    invoke-virtual {p0, v2}, Ly1/e;->setNestedScrollingEnabled(Z)V

    iget v1, p0, Ly1/e;->mCircleDiameter:I

    neg-int v1, v1

    iput v1, p0, Ly1/e;->mCurrentTargetOffsetTop:I

    iput v1, p0, Ly1/e;->mOriginalOffsetTop:I

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {p0, v1}, Ly1/e;->moveToStart(F)V

    sget-object v1, Ly1/e;->LAYOUT_ATTRS:[I

    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    invoke-virtual {p0, p2}, Ly1/e;->setEnabled(Z)V

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private animateOffsetToCorrectPosition(ILandroid/view/animation/Animation$AnimationListener;)V
    .locals 2

    .line 1
    iput p1, p0, Ly1/e;->mFrom:I

    .line 2
    .line 3
    iget-object p1, p0, Ly1/e;->mAnimateToCorrectPosition:Landroid/view/animation/Animation;

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/view/animation/Animation;->reset()V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Ly1/e;->mAnimateToCorrectPosition:Landroid/view/animation/Animation;

    .line 9
    .line 10
    const-wide/16 v0, 0xc8

    .line 11
    .line 12
    invoke-virtual {p1, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Ly1/e;->mAnimateToCorrectPosition:Landroid/view/animation/Animation;

    .line 16
    .line 17
    iget-object v0, p0, Ly1/e;->mDecelerateInterpolator:Landroid/view/animation/DecelerateInterpolator;

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 20
    .line 21
    .line 22
    if-eqz p2, :cond_0

    .line 23
    .line 24
    iget-object p1, p0, Ly1/e;->mCircleView:Ly1/a;

    .line 25
    .line 26
    iput-object p2, p1, Ly1/a;->a:Landroid/view/animation/Animation$AnimationListener;

    .line 27
    .line 28
    :cond_0
    iget-object p1, p0, Ly1/e;->mCircleView:Ly1/a;

    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/view/View;->clearAnimation()V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Ly1/e;->mCircleView:Ly1/a;

    .line 34
    .line 35
    iget-object p2, p0, Ly1/e;->mAnimateToCorrectPosition:Landroid/view/animation/Animation;

    .line 36
    .line 37
    invoke-virtual {p1, p2}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 38
    .line 39
    .line 40
    return-void
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method

.method private animateOffsetToStartPosition(ILandroid/view/animation/Animation$AnimationListener;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Ly1/e;->mScale:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0, p1, p2}, Ly1/e;->startScaleDownReturnToStartAnimation(ILandroid/view/animation/Animation$AnimationListener;)V

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    iput p1, p0, Ly1/e;->mFrom:I

    .line 10
    .line 11
    iget-object p1, p0, Ly1/e;->mAnimateToStartPosition:Landroid/view/animation/Animation;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/animation/Animation;->reset()V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Ly1/e;->mAnimateToStartPosition:Landroid/view/animation/Animation;

    .line 17
    .line 18
    const-wide/16 v0, 0xc8

    .line 19
    .line 20
    invoke-virtual {p1, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Ly1/e;->mAnimateToStartPosition:Landroid/view/animation/Animation;

    .line 24
    .line 25
    iget-object v0, p0, Ly1/e;->mDecelerateInterpolator:Landroid/view/animation/DecelerateInterpolator;

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 28
    .line 29
    .line 30
    if-eqz p2, :cond_1

    .line 31
    .line 32
    iget-object p1, p0, Ly1/e;->mCircleView:Ly1/a;

    .line 33
    .line 34
    iput-object p2, p1, Ly1/a;->a:Landroid/view/animation/Animation$AnimationListener;

    .line 35
    .line 36
    :cond_1
    iget-object p1, p0, Ly1/e;->mCircleView:Ly1/a;

    .line 37
    .line 38
    invoke-virtual {p1}, Landroid/view/View;->clearAnimation()V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Ly1/e;->mCircleView:Ly1/a;

    .line 42
    .line 43
    iget-object p2, p0, Ly1/e;->mAnimateToStartPosition:Landroid/view/animation/Animation;

    .line 44
    .line 45
    invoke-virtual {p1, p2}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 46
    .line 47
    .line 48
    :goto_0
    return-void
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method

.method private createProgressView()V
    .locals 5

    .line 1
    new-instance v0, Ly1/a;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Ly1/a;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Ly1/e;->mCircleView:Ly1/a;

    .line 11
    .line 12
    new-instance v0, Ly1/d;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-direct {v0, v1}, Ly1/d;-><init>(Landroid/content/Context;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Ly1/e;->mProgress:Ly1/d;

    .line 22
    .line 23
    const/high16 v1, 0x40a00000    # 5.0f

    .line 24
    .line 25
    const/high16 v2, 0x41200000    # 10.0f

    .line 26
    .line 27
    const/high16 v3, 0x40200000    # 2.5f

    .line 28
    .line 29
    const/high16 v4, 0x40f00000    # 7.5f

    .line 30
    .line 31
    invoke-virtual {v0, v4, v3, v2, v1}, Ly1/d;->b(FFFF)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Ly1/e;->mCircleView:Ly1/a;

    .line 38
    .line 39
    iget-object v1, p0, Ly1/e;->mProgress:Ly1/d;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Ly1/e;->mCircleView:Ly1/a;

    .line 45
    .line 46
    const/16 v1, 0x8

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, Ly1/e;->mCircleView:Ly1/a;

    .line 52
    .line 53
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 54
    .line 55
    .line 56
    return-void
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method private ensureTarget()V
    .locals 3

    iget-object v0, p0, Ly1/e;->mTarget:Landroid/view/View;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_1

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    iget-object v2, p0, Ly1/e;->mCircleView:Ly1/a;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    iput-object v1, p0, Ly1/e;->mTarget:Landroid/view/View;

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method private finishSpinner(F)V
    .locals 3

    .line 1
    iget v0, p0, Ly1/e;->mTotalDragDistance:F

    .line 2
    .line 3
    cmpl-float p1, p1, v0

    .line 4
    .line 5
    if-lez p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1, p1}, Ly1/e;->setRefreshing(ZZ)V

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    iput-boolean p1, p0, Ly1/e;->mRefreshing:Z

    .line 14
    .line 15
    iget-object v0, p0, Ly1/e;->mProgress:Ly1/d;

    .line 16
    .line 17
    iget-object v1, v0, Ly1/d;->a:Ly1/d$a;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    iput v2, v1, Ly1/d$a;->e:F

    .line 21
    .line 22
    iput v2, v1, Ly1/d$a;->f:F

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 25
    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    iget-boolean v1, p0, Ly1/e;->mScale:Z

    .line 29
    .line 30
    if-nez v1, :cond_1

    .line 31
    .line 32
    new-instance v0, Ly1/e$e;

    .line 33
    .line 34
    invoke-direct {v0, p0}, Ly1/e$e;-><init>(Ly1/e;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    iget v1, p0, Ly1/e;->mCurrentTargetOffsetTop:I

    .line 38
    .line 39
    invoke-direct {p0, v1, v0}, Ly1/e;->animateOffsetToStartPosition(ILandroid/view/animation/Animation$AnimationListener;)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Ly1/e;->mProgress:Ly1/d;

    .line 43
    .line 44
    iget-object v1, v0, Ly1/d;->a:Ly1/d$a;

    .line 45
    .line 46
    iget-boolean v2, v1, Ly1/d$a;->n:Z

    .line 47
    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    iput-boolean p1, v1, Ly1/d$a;->n:Z

    .line 51
    .line 52
    :cond_2
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 53
    .line 54
    .line 55
    :goto_0
    return-void
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method private isAnimationRunning(Landroid/view/animation/Animation;)Z
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/view/animation/Animation;->hasStarted()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/view/animation/Animation;->hasEnded()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private moveSpinner(F)V
    .locals 11

    .line 1
    iget-object v0, p0, Ly1/e;->mProgress:Ly1/d;

    .line 2
    .line 3
    iget-object v1, v0, Ly1/d;->a:Ly1/d$a;

    .line 4
    .line 5
    iget-boolean v2, v1, Ly1/d$a;->n:Z

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    if-eq v2, v3, :cond_0

    .line 9
    .line 10
    iput-boolean v3, v1, Ly1/d$a;->n:Z

    .line 11
    .line 12
    :cond_0
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 13
    .line 14
    .line 15
    iget v0, p0, Ly1/e;->mTotalDragDistance:F

    .line 16
    .line 17
    div-float v0, p1, v0

    .line 18
    .line 19
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/high16 v1, 0x3f800000    # 1.0f

    .line 24
    .line 25
    invoke-static {v1, v0}, Ljava/lang/Math;->min(FF)F

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    float-to-double v2, v0

    .line 30
    const-wide v4, 0x3fd999999999999aL    # 0.4

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    sub-double/2addr v2, v4

    .line 36
    const-wide/16 v4, 0x0

    .line 37
    .line 38
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(DD)D

    .line 39
    .line 40
    .line 41
    move-result-wide v2

    .line 42
    double-to-float v2, v2

    .line 43
    const/high16 v3, 0x40a00000    # 5.0f

    .line 44
    .line 45
    mul-float/2addr v2, v3

    .line 46
    const/high16 v3, 0x40400000    # 3.0f

    .line 47
    .line 48
    div-float/2addr v2, v3

    .line 49
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    iget v4, p0, Ly1/e;->mTotalDragDistance:F

    .line 54
    .line 55
    sub-float/2addr v3, v4

    .line 56
    iget v4, p0, Ly1/e;->mCustomSlingshotDistance:I

    .line 57
    .line 58
    if-lez v4, :cond_1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    iget-boolean v4, p0, Ly1/e;->mUsingCustomStart:Z

    .line 62
    .line 63
    if-eqz v4, :cond_2

    .line 64
    .line 65
    iget v4, p0, Ly1/e;->mSpinnerOffsetEnd:I

    .line 66
    .line 67
    iget v5, p0, Ly1/e;->mOriginalOffsetTop:I

    .line 68
    .line 69
    sub-int/2addr v4, v5

    .line 70
    goto :goto_0

    .line 71
    :cond_2
    iget v4, p0, Ly1/e;->mSpinnerOffsetEnd:I

    .line 72
    .line 73
    :goto_0
    int-to-float v4, v4

    .line 74
    const/high16 v5, 0x40000000    # 2.0f

    .line 75
    .line 76
    mul-float v6, v4, v5

    .line 77
    .line 78
    invoke-static {v3, v6}, Ljava/lang/Math;->min(FF)F

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    div-float/2addr v3, v4

    .line 83
    const/4 v6, 0x0

    .line 84
    invoke-static {v6, v3}, Ljava/lang/Math;->max(FF)F

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    const/high16 v7, 0x40800000    # 4.0f

    .line 89
    .line 90
    div-float/2addr v3, v7

    .line 91
    float-to-double v7, v3

    .line 92
    const-wide/high16 v9, 0x4000000000000000L    # 2.0

    .line 93
    .line 94
    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->pow(DD)D

    .line 95
    .line 96
    .line 97
    move-result-wide v9

    .line 98
    sub-double/2addr v7, v9

    .line 99
    double-to-float v3, v7

    .line 100
    mul-float/2addr v3, v5

    .line 101
    mul-float v7, v4, v3

    .line 102
    .line 103
    mul-float/2addr v7, v5

    .line 104
    iget v8, p0, Ly1/e;->mOriginalOffsetTop:I

    .line 105
    .line 106
    mul-float/2addr v4, v0

    .line 107
    add-float/2addr v4, v7

    .line 108
    float-to-int v0, v4

    .line 109
    add-int/2addr v8, v0

    .line 110
    iget-object v0, p0, Ly1/e;->mCircleView:Ly1/a;

    .line 111
    .line 112
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-eqz v0, :cond_3

    .line 117
    .line 118
    iget-object v0, p0, Ly1/e;->mCircleView:Ly1/a;

    .line 119
    .line 120
    const/4 v4, 0x0

    .line 121
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 122
    .line 123
    .line 124
    :cond_3
    iget-boolean v0, p0, Ly1/e;->mScale:Z

    .line 125
    .line 126
    if-nez v0, :cond_4

    .line 127
    .line 128
    iget-object v0, p0, Ly1/e;->mCircleView:Ly1/a;

    .line 129
    .line 130
    invoke-virtual {v0, v1}, Landroid/view/View;->setScaleX(F)V

    .line 131
    .line 132
    .line 133
    iget-object v0, p0, Ly1/e;->mCircleView:Ly1/a;

    .line 134
    .line 135
    invoke-virtual {v0, v1}, Landroid/view/View;->setScaleY(F)V

    .line 136
    .line 137
    .line 138
    :cond_4
    iget-boolean v0, p0, Ly1/e;->mScale:Z

    .line 139
    .line 140
    if-eqz v0, :cond_5

    .line 141
    .line 142
    iget v0, p0, Ly1/e;->mTotalDragDistance:F

    .line 143
    .line 144
    div-float v0, p1, v0

    .line 145
    .line 146
    invoke-static {v1, v0}, Ljava/lang/Math;->min(FF)F

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    invoke-virtual {p0, v0}, Ly1/e;->setAnimationProgress(F)V

    .line 151
    .line 152
    .line 153
    :cond_5
    iget v0, p0, Ly1/e;->mTotalDragDistance:F

    .line 154
    .line 155
    cmpg-float p1, p1, v0

    .line 156
    .line 157
    if-gez p1, :cond_6

    .line 158
    .line 159
    iget-object p1, p0, Ly1/e;->mProgress:Ly1/d;

    .line 160
    .line 161
    iget-object p1, p1, Ly1/d;->a:Ly1/d$a;

    .line 162
    .line 163
    iget p1, p1, Ly1/d$a;->t:I

    .line 164
    .line 165
    const/16 v0, 0x4c

    .line 166
    .line 167
    if-le p1, v0, :cond_7

    .line 168
    .line 169
    iget-object p1, p0, Ly1/e;->mAlphaStartAnimation:Landroid/view/animation/Animation;

    .line 170
    .line 171
    invoke-direct {p0, p1}, Ly1/e;->isAnimationRunning(Landroid/view/animation/Animation;)Z

    .line 172
    .line 173
    .line 174
    move-result p1

    .line 175
    if-nez p1, :cond_7

    .line 176
    .line 177
    invoke-direct {p0}, Ly1/e;->startProgressAlphaStartAnimation()V

    .line 178
    .line 179
    .line 180
    goto :goto_1

    .line 181
    :cond_6
    iget-object p1, p0, Ly1/e;->mProgress:Ly1/d;

    .line 182
    .line 183
    iget-object p1, p1, Ly1/d;->a:Ly1/d$a;

    .line 184
    .line 185
    iget p1, p1, Ly1/d$a;->t:I

    .line 186
    .line 187
    const/16 v0, 0xff

    .line 188
    .line 189
    if-ge p1, v0, :cond_7

    .line 190
    .line 191
    iget-object p1, p0, Ly1/e;->mAlphaMaxAnimation:Landroid/view/animation/Animation;

    .line 192
    .line 193
    invoke-direct {p0, p1}, Ly1/e;->isAnimationRunning(Landroid/view/animation/Animation;)Z

    .line 194
    .line 195
    .line 196
    move-result p1

    .line 197
    if-nez p1, :cond_7

    .line 198
    .line 199
    invoke-direct {p0}, Ly1/e;->startProgressAlphaMaxAnimation()V

    .line 200
    .line 201
    .line 202
    :cond_7
    :goto_1
    const p1, 0x3f4ccccd    # 0.8f

    .line 203
    .line 204
    .line 205
    mul-float v0, v2, p1

    .line 206
    .line 207
    iget-object v4, p0, Ly1/e;->mProgress:Ly1/d;

    .line 208
    .line 209
    invoke-static {p1, v0}, Ljava/lang/Math;->min(FF)F

    .line 210
    .line 211
    .line 212
    move-result p1

    .line 213
    iget-object v0, v4, Ly1/d;->a:Ly1/d$a;

    .line 214
    .line 215
    iput v6, v0, Ly1/d$a;->e:F

    .line 216
    .line 217
    iput p1, v0, Ly1/d$a;->f:F

    .line 218
    .line 219
    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 220
    .line 221
    .line 222
    iget-object p1, p0, Ly1/e;->mProgress:Ly1/d;

    .line 223
    .line 224
    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    iget-object v1, p1, Ly1/d;->a:Ly1/d$a;

    .line 229
    .line 230
    iget v4, v1, Ly1/d$a;->p:F

    .line 231
    .line 232
    cmpl-float v4, v0, v4

    .line 233
    .line 234
    if-eqz v4, :cond_8

    .line 235
    .line 236
    iput v0, v1, Ly1/d$a;->p:F

    .line 237
    .line 238
    :cond_8
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 239
    .line 240
    .line 241
    const/high16 p1, -0x41800000    # -0.25f

    .line 242
    .line 243
    const v0, 0x3ecccccd    # 0.4f

    .line 244
    .line 245
    .line 246
    mul-float/2addr v2, v0

    .line 247
    add-float/2addr v2, p1

    .line 248
    mul-float/2addr v3, v5

    .line 249
    add-float/2addr v3, v2

    .line 250
    const/high16 p1, 0x3f000000    # 0.5f

    .line 251
    .line 252
    mul-float/2addr v3, p1

    .line 253
    iget-object p1, p0, Ly1/e;->mProgress:Ly1/d;

    .line 254
    .line 255
    iget-object v0, p1, Ly1/d;->a:Ly1/d$a;

    .line 256
    .line 257
    iput v3, v0, Ly1/d$a;->g:F

    .line 258
    .line 259
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 260
    .line 261
    .line 262
    iget p1, p0, Ly1/e;->mCurrentTargetOffsetTop:I

    .line 263
    .line 264
    sub-int/2addr v8, p1

    .line 265
    invoke-virtual {p0, v8}, Ly1/e;->setTargetOffsetTopAndBottom(I)V

    .line 266
    .line 267
    .line 268
    return-void
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
.end method

.method private onSecondaryPointerUp(Landroid/view/MotionEvent;)V
    .locals 3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    iget v2, p0, Ly1/e;->mActivePointerId:I

    if-ne v1, v2, :cond_1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    iput p1, p0, Ly1/e;->mActivePointerId:I

    :cond_1
    return-void
.end method

.method private setColorViewAlpha(I)V
    .locals 1

    iget-object v0, p0, Ly1/e;->mCircleView:Ly1/a;

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    iget-object v0, p0, Ly1/e;->mProgress:Ly1/d;

    invoke-virtual {v0, p1}, Ly1/d;->setAlpha(I)V

    return-void
.end method

.method private setRefreshing(ZZ)V
    .locals 1

    iget-boolean v0, p0, Ly1/e;->mRefreshing:Z

    if-eq v0, p1, :cond_1

    iput-boolean p2, p0, Ly1/e;->mNotify:Z

    invoke-direct {p0}, Ly1/e;->ensureTarget()V

    iput-boolean p1, p0, Ly1/e;->mRefreshing:Z

    if-eqz p1, :cond_0

    iget p1, p0, Ly1/e;->mCurrentTargetOffsetTop:I

    iget-object p2, p0, Ly1/e;->mRefreshListener:Landroid/view/animation/Animation$AnimationListener;

    invoke-direct {p0, p1, p2}, Ly1/e;->animateOffsetToCorrectPosition(ILandroid/view/animation/Animation$AnimationListener;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Ly1/e;->mRefreshListener:Landroid/view/animation/Animation$AnimationListener;

    invoke-virtual {p0, p1}, Ly1/e;->startScaleDownAnimation(Landroid/view/animation/Animation$AnimationListener;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private startAlphaAnimation(II)Landroid/view/animation/Animation;
    .locals 1

    .line 1
    new-instance v0, Ly1/e$d;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Ly1/e$d;-><init>(Ly1/e;II)V

    .line 4
    .line 5
    .line 6
    const-wide/16 p1, 0x12c

    .line 7
    .line 8
    invoke-virtual {v0, p1, p2}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Ly1/e;->mCircleView:Ly1/a;

    .line 12
    .line 13
    const/4 p2, 0x0

    .line 14
    iput-object p2, p1, Ly1/a;->a:Landroid/view/animation/Animation$AnimationListener;

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/view/View;->clearAnimation()V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Ly1/e;->mCircleView:Ly1/a;

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 22
    .line 23
    .line 24
    return-object v0
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method

.method private startDragging(F)V
    .locals 3

    iget v0, p0, Ly1/e;->mInitialDownY:F

    sub-float/2addr p1, v0

    iget v1, p0, Ly1/e;->mTouchSlop:I

    int-to-float v2, v1

    cmpl-float p1, p1, v2

    if-lez p1, :cond_0

    iget-boolean p1, p0, Ly1/e;->mIsBeingDragged:Z

    if-nez p1, :cond_0

    int-to-float p1, v1

    add-float/2addr v0, p1

    iput v0, p0, Ly1/e;->mInitialMotionY:F

    const/4 p1, 0x1

    iput-boolean p1, p0, Ly1/e;->mIsBeingDragged:Z

    iget-object p1, p0, Ly1/e;->mProgress:Ly1/d;

    const/16 v0, 0x4c

    invoke-virtual {p1, v0}, Ly1/d;->setAlpha(I)V

    :cond_0
    return-void
.end method

.method private startProgressAlphaMaxAnimation()V
    .locals 2

    .line 1
    iget-object v0, p0, Ly1/e;->mProgress:Ly1/d;

    .line 2
    .line 3
    iget-object v0, v0, Ly1/d;->a:Ly1/d$a;

    .line 4
    .line 5
    iget v0, v0, Ly1/d$a;->t:I

    .line 6
    .line 7
    const/16 v1, 0xff

    .line 8
    .line 9
    invoke-direct {p0, v0, v1}, Ly1/e;->startAlphaAnimation(II)Landroid/view/animation/Animation;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Ly1/e;->mAlphaMaxAnimation:Landroid/view/animation/Animation;

    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method private startProgressAlphaStartAnimation()V
    .locals 2

    .line 1
    iget-object v0, p0, Ly1/e;->mProgress:Ly1/d;

    .line 2
    .line 3
    iget-object v0, v0, Ly1/d;->a:Ly1/d$a;

    .line 4
    .line 5
    iget v0, v0, Ly1/d$a;->t:I

    .line 6
    .line 7
    const/16 v1, 0x4c

    .line 8
    .line 9
    invoke-direct {p0, v0, v1}, Ly1/e;->startAlphaAnimation(II)Landroid/view/animation/Animation;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Ly1/e;->mAlphaStartAnimation:Landroid/view/animation/Animation;

    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method private startScaleDownReturnToStartAnimation(ILandroid/view/animation/Animation$AnimationListener;)V
    .locals 2

    .line 1
    iput p1, p0, Ly1/e;->mFrom:I

    .line 2
    .line 3
    iget-object p1, p0, Ly1/e;->mCircleView:Ly1/a;

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/view/View;->getScaleX()F

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iput p1, p0, Ly1/e;->mStartingScale:F

    .line 10
    .line 11
    new-instance p1, Ly1/e$h;

    .line 12
    .line 13
    invoke-direct {p1, p0}, Ly1/e$h;-><init>(Ly1/e;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Ly1/e;->mScaleDownToStartAnimation:Landroid/view/animation/Animation;

    .line 17
    .line 18
    const-wide/16 v0, 0x96

    .line 19
    .line 20
    invoke-virtual {p1, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 21
    .line 22
    .line 23
    if-eqz p2, :cond_0

    .line 24
    .line 25
    iget-object p1, p0, Ly1/e;->mCircleView:Ly1/a;

    .line 26
    .line 27
    iput-object p2, p1, Ly1/a;->a:Landroid/view/animation/Animation$AnimationListener;

    .line 28
    .line 29
    :cond_0
    iget-object p1, p0, Ly1/e;->mCircleView:Ly1/a;

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/view/View;->clearAnimation()V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Ly1/e;->mCircleView:Ly1/a;

    .line 35
    .line 36
    iget-object p2, p0, Ly1/e;->mScaleDownToStartAnimation:Landroid/view/animation/Animation;

    .line 37
    .line 38
    invoke-virtual {p1, p2}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 39
    .line 40
    .line 41
    return-void
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method

.method private startScaleUpAnimation(Landroid/view/animation/Animation$AnimationListener;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ly1/e;->mCircleView:Ly1/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Ly1/e;->mProgress:Ly1/d;

    .line 8
    .line 9
    const/16 v1, 0xff

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ly1/d;->setAlpha(I)V

    .line 12
    .line 13
    .line 14
    new-instance v0, Ly1/e$b;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Ly1/e$b;-><init>(Ly1/e;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Ly1/e;->mScaleAnimation:Landroid/view/animation/Animation;

    .line 20
    .line 21
    iget v1, p0, Ly1/e;->mMediumAnimationDuration:I

    .line 22
    .line 23
    int-to-long v1, v1

    .line 24
    invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 25
    .line 26
    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    iget-object v0, p0, Ly1/e;->mCircleView:Ly1/a;

    .line 30
    .line 31
    iput-object p1, v0, Ly1/a;->a:Landroid/view/animation/Animation$AnimationListener;

    .line 32
    .line 33
    :cond_0
    iget-object p1, p0, Ly1/e;->mCircleView:Ly1/a;

    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/view/View;->clearAnimation()V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Ly1/e;->mCircleView:Ly1/a;

    .line 39
    .line 40
    iget-object v0, p0, Ly1/e;->mScaleAnimation:Landroid/view/animation/Animation;

    .line 41
    .line 42
    invoke-virtual {p1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 43
    .line 44
    .line 45
    return-void
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method


# virtual methods
.method public canChildScrollUp()Z
    .locals 3

    .line 1
    iget-object v0, p0, Ly1/e;->mChildScrollUpCallback:Ly1/e$i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Ly1/e;->mTarget:Landroid/view/View;

    .line 6
    .line 7
    invoke-interface {v0, p0, v1}, Ly1/e$i;->canChildScrollUp(Ly1/e;Landroid/view/View;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0

    .line 12
    :cond_0
    iget-object v0, p0, Ly1/e;->mTarget:Landroid/view/View;

    .line 13
    .line 14
    instance-of v1, v0, Landroid/widget/ListView;

    .line 15
    .line 16
    const/4 v2, -0x1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    check-cast v0, Landroid/widget/ListView;

    .line 20
    .line 21
    invoke-virtual {v0, v2}, Landroid/widget/AbsListView;->canScrollList(I)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    return v0

    .line 26
    :cond_1
    invoke-virtual {v0, v2}, Landroid/view/View;->canScrollVertically(I)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    return v0
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public dispatchNestedFling(FFZ)Z
    .locals 1

    iget-object v0, p0, Ly1/e;->mNestedScrollingChildHelper:Le0/p;

    invoke-virtual {v0, p1, p2, p3}, Le0/p;->a(FFZ)Z

    move-result p1

    return p1
.end method

.method public dispatchNestedPreFling(FF)Z
    .locals 1

    iget-object v0, p0, Ly1/e;->mNestedScrollingChildHelper:Le0/p;

    invoke-virtual {v0, p1, p2}, Le0/p;->b(FF)Z

    move-result p1

    return p1
.end method

.method public dispatchNestedPreScroll(II[I[I)Z
    .locals 6

    iget-object v0, p0, Ly1/e;->mNestedScrollingChildHelper:Le0/p;

    const/4 v5, 0x0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 1
    invoke-virtual/range {v0 .. v5}, Le0/p;->c(II[I[II)Z

    move-result p1

    return p1
.end method

.method public dispatchNestedPreScroll(II[I[II)Z
    .locals 0

    if-nez p5, :cond_0

    invoke-virtual {p0, p1, p2, p3, p4}, Ly1/e;->dispatchNestedPreScroll(II[I[I)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public dispatchNestedScroll(IIII[II[I)V
    .locals 8

    if-nez p6, :cond_0

    iget-object v0, p0, Ly1/e;->mNestedScrollingChildHelper:Le0/p;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    move v6, p6

    move-object v7, p7

    .line 1
    invoke-virtual/range {v0 .. v7}, Le0/p;->e(IIII[II[I)Z

    :cond_0
    return-void
.end method

.method public dispatchNestedScroll(IIII[I)Z
    .locals 8

    iget-object v0, p0, Ly1/e;->mNestedScrollingChildHelper:Le0/p;

    const/4 v6, 0x0

    const/4 v7, 0x0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    .line 2
    invoke-virtual/range {v0 .. v7}, Le0/p;->e(IIII[II[I)Z

    move-result p1

    return p1
.end method

.method public dispatchNestedScroll(IIII[II)Z
    .locals 8

    if-nez p6, :cond_0

    iget-object v0, p0, Ly1/e;->mNestedScrollingChildHelper:Le0/p;

    const/4 v7, 0x0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    move v6, p6

    .line 3
    invoke-virtual/range {v0 .. v7}, Le0/p;->e(IIII[II[I)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public getChildDrawingOrder(II)I
    .locals 1

    iget v0, p0, Ly1/e;->mCircleViewIndex:I

    if-gez v0, :cond_0

    return p2

    :cond_0
    add-int/lit8 p1, p1, -0x1

    if-ne p2, p1, :cond_1

    return v0

    :cond_1
    if-lt p2, v0, :cond_2

    add-int/lit8 p2, p2, 0x1

    :cond_2
    return p2
.end method

.method public getNestedScrollAxes()I
    .locals 2

    .line 1
    iget-object v0, p0, Ly1/e;->mNestedScrollingParentHelper:Le0/s;

    .line 2
    .line 3
    iget v1, v0, Le0/s;->a:I

    .line 4
    .line 5
    iget v0, v0, Le0/s;->b:I

    .line 6
    .line 7
    or-int/2addr v0, v1

    .line 8
    return v0
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public getProgressCircleDiameter()I
    .locals 1

    iget v0, p0, Ly1/e;->mCircleDiameter:I

    return v0
.end method

.method public getProgressViewEndOffset()I
    .locals 1

    iget v0, p0, Ly1/e;->mSpinnerOffsetEnd:I

    return v0
.end method

.method public getProgressViewStartOffset()I
    .locals 1

    iget v0, p0, Ly1/e;->mOriginalOffsetTop:I

    return v0
.end method

.method public hasNestedScrollingParent()Z
    .locals 2

    iget-object v0, p0, Ly1/e;->mNestedScrollingChildHelper:Le0/p;

    const/4 v1, 0x0

    .line 1
    invoke-virtual {v0, v1}, Le0/p;->f(I)Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public hasNestedScrollingParent(I)Z
    .locals 0

    if-nez p1, :cond_0

    invoke-virtual {p0}, Ly1/e;->hasNestedScrollingParent()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public isNestedScrollingEnabled()Z
    .locals 1

    iget-object v0, p0, Ly1/e;->mNestedScrollingChildHelper:Le0/p;

    iget-boolean v0, v0, Le0/p;->d:Z

    return v0
.end method

.method public isRefreshing()Z
    .locals 1

    iget-boolean v0, p0, Ly1/e;->mRefreshing:Z

    return v0
.end method

.method public moveToStart(F)V
    .locals 2

    iget v0, p0, Ly1/e;->mFrom:I

    iget v1, p0, Ly1/e;->mOriginalOffsetTop:I

    sub-int/2addr v1, v0

    int-to-float v1, v1

    mul-float/2addr v1, p1

    float-to-int p1, v1

    add-int/2addr v0, p1

    iget-object p1, p0, Ly1/e;->mCircleView:Ly1/a;

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result p1

    sub-int/2addr v0, p1

    invoke-virtual {p0, v0}, Ly1/e;->setTargetOffsetTopAndBottom(I)V

    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 0

    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    invoke-virtual {p0}, Ly1/e;->reset()V

    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    invoke-direct {p0}, Ly1/e;->ensureTarget()V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    iget-boolean v1, p0, Ly1/e;->mReturningToStart:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    if-nez v0, :cond_0

    iput-boolean v2, p0, Ly1/e;->mReturningToStart:Z

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v1

    if-eqz v1, :cond_9

    iget-boolean v1, p0, Ly1/e;->mReturningToStart:Z

    if-nez v1, :cond_9

    invoke-virtual {p0}, Ly1/e;->canChildScrollUp()Z

    move-result v1

    if-nez v1, :cond_9

    iget-boolean v1, p0, Ly1/e;->mRefreshing:Z

    if-nez v1, :cond_9

    iget-boolean v1, p0, Ly1/e;->mNestedScrollInProgress:Z

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    if-eqz v0, :cond_7

    const/4 v1, 0x1

    const/4 v3, -0x1

    if-eq v0, v1, :cond_6

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_6

    const/4 v1, 0x6

    if-eq v0, v1, :cond_2

    goto :goto_0

    :cond_2
    invoke-direct {p0, p1}, Ly1/e;->onSecondaryPointerUp(Landroid/view/MotionEvent;)V

    goto :goto_0

    :cond_3
    iget v0, p0, Ly1/e;->mActivePointerId:I

    if-ne v0, v3, :cond_4

    sget-object p1, Ly1/e;->LOG_TAG:Ljava/lang/String;

    const-string v0, "Got ACTION_MOVE event but don\'t have an active pointer id."

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v2

    :cond_4
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    if-gez v0, :cond_5

    return v2

    :cond_5
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    invoke-direct {p0, p1}, Ly1/e;->startDragging(F)V

    goto :goto_0

    :cond_6
    iput-boolean v2, p0, Ly1/e;->mIsBeingDragged:Z

    iput v3, p0, Ly1/e;->mActivePointerId:I

    goto :goto_0

    :cond_7
    iget v0, p0, Ly1/e;->mOriginalOffsetTop:I

    iget-object v1, p0, Ly1/e;->mCircleView:Ly1/a;

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0, v0}, Ly1/e;->setTargetOffsetTopAndBottom(I)V

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    iput v0, p0, Ly1/e;->mActivePointerId:I

    iput-boolean v2, p0, Ly1/e;->mIsBeingDragged:Z

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    if-gez v0, :cond_8

    return v2

    :cond_8
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    iput p1, p0, Ly1/e;->mInitialDownY:F

    :goto_0
    iget-boolean p1, p0, Ly1/e;->mIsBeingDragged:Z

    return p1

    :cond_9
    :goto_1
    return v2
.end method

.method public onLayout(ZIIII)V
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p3

    if-nez p3, :cond_0

    return-void

    :cond_0
    iget-object p3, p0, Ly1/e;->mTarget:Landroid/view/View;

    if-nez p3, :cond_1

    invoke-direct {p0}, Ly1/e;->ensureTarget()V

    :cond_1
    iget-object p3, p0, Ly1/e;->mTarget:Landroid/view/View;

    if-nez p3, :cond_2

    return-void

    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result p4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p5

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    sub-int v0, p1, v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    sub-int/2addr p2, v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v1

    sub-int/2addr p2, v1

    add-int/2addr v0, p4

    add-int/2addr p2, p5

    invoke-virtual {p3, p4, p5, v0, p2}, Landroid/view/View;->layout(IIII)V

    iget-object p2, p0, Ly1/e;->mCircleView:Ly1/a;

    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    move-result p2

    iget-object p3, p0, Ly1/e;->mCircleView:Ly1/a;

    invoke-virtual {p3}, Landroid/view/View;->getMeasuredHeight()I

    move-result p3

    iget-object p4, p0, Ly1/e;->mCircleView:Ly1/a;

    div-int/lit8 p1, p1, 0x2

    div-int/lit8 p2, p2, 0x2

    sub-int p5, p1, p2

    iget v0, p0, Ly1/e;->mCurrentTargetOffsetTop:I

    add-int/2addr p1, p2

    add-int/2addr p3, v0

    invoke-virtual {p4, p5, v0, p1, p3}, Landroid/view/View;->layout(IIII)V

    return-void
.end method

.method public onMeasure(II)V
    .locals 3

    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onMeasure(II)V

    iget-object p1, p0, Ly1/e;->mTarget:Landroid/view/View;

    if-nez p1, :cond_0

    invoke-direct {p0}, Ly1/e;->ensureTarget()V

    :cond_0
    iget-object p1, p0, Ly1/e;->mTarget:Landroid/view/View;

    if-nez p1, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    sub-int/2addr p2, v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v0

    sub-int/2addr p2, v0

    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-static {v1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    invoke-virtual {p1, p2, v1}, Landroid/view/View;->measure(II)V

    iget-object p1, p0, Ly1/e;->mCircleView:Ly1/a;

    iget p2, p0, Ly1/e;->mCircleDiameter:I

    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    iget v1, p0, Ly1/e;->mCircleDiameter:I

    invoke-static {v1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-virtual {p1, p2, v0}, Landroid/view/View;->measure(II)V

    const/4 p1, -0x1

    iput p1, p0, Ly1/e;->mCircleViewIndex:I

    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p2

    if-ge p1, p2, :cond_3

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p2

    iget-object v0, p0, Ly1/e;->mCircleView:Ly1/a;

    if-ne p2, v0, :cond_2

    iput p1, p0, Ly1/e;->mCircleViewIndex:I

    goto :goto_1

    :cond_2
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method public onNestedFling(Landroid/view/View;FFZ)Z
    .locals 0

    invoke-virtual {p0, p2, p3, p4}, Ly1/e;->dispatchNestedFling(FFZ)Z

    move-result p1

    return p1
.end method

.method public onNestedPreFling(Landroid/view/View;FF)Z
    .locals 0

    invoke-virtual {p0, p2, p3}, Ly1/e;->dispatchNestedPreFling(FF)Z

    move-result p1

    return p1
.end method

.method public onNestedPreScroll(Landroid/view/View;II[I)V
    .locals 4

    const/4 p1, 0x0

    const/4 v0, 0x1

    if-lez p3, :cond_1

    iget v1, p0, Ly1/e;->mTotalUnconsumed:F

    cmpl-float v2, v1, p1

    if-lez v2, :cond_1

    int-to-float v2, p3

    cmpl-float v3, v2, v1

    if-lez v3, :cond_0

    float-to-int v1, v1

    aput v1, p4, v0

    iput p1, p0, Ly1/e;->mTotalUnconsumed:F

    goto :goto_0

    :cond_0
    sub-float/2addr v1, v2

    iput v1, p0, Ly1/e;->mTotalUnconsumed:F

    aput p3, p4, v0

    :goto_0
    iget v1, p0, Ly1/e;->mTotalUnconsumed:F

    invoke-direct {p0, v1}, Ly1/e;->moveSpinner(F)V

    :cond_1
    iget-boolean v1, p0, Ly1/e;->mUsingCustomStart:Z

    if-eqz v1, :cond_2

    if-lez p3, :cond_2

    iget v1, p0, Ly1/e;->mTotalUnconsumed:F

    cmpl-float p1, v1, p1

    if-nez p1, :cond_2

    aget p1, p4, v0

    sub-int p1, p3, p1

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    if-lez p1, :cond_2

    iget-object p1, p0, Ly1/e;->mCircleView:Ly1/a;

    const/16 v1, 0x8

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    iget-object p1, p0, Ly1/e;->mParentScrollConsumed:[I

    const/4 v1, 0x0

    aget v2, p4, v1

    sub-int/2addr p2, v2

    aget v2, p4, v0

    sub-int/2addr p3, v2

    const/4 v2, 0x0

    invoke-virtual {p0, p2, p3, p1, v2}, Ly1/e;->dispatchNestedPreScroll(II[I[I)Z

    move-result p2

    if-eqz p2, :cond_3

    aget p2, p4, v1

    aget p3, p1, v1

    add-int/2addr p2, p3

    aput p2, p4, v1

    aget p2, p4, v0

    aget p1, p1, v0

    add-int/2addr p2, p1

    aput p2, p4, v0

    :cond_3
    return-void
.end method

.method public onNestedPreScroll(Landroid/view/View;II[II)V
    .locals 0

    if-nez p5, :cond_0

    invoke-virtual {p0, p1, p2, p3, p4}, Ly1/e;->onNestedPreScroll(Landroid/view/View;II[I)V

    :cond_0
    return-void
.end method

.method public onNestedScroll(Landroid/view/View;IIII)V
    .locals 8

    iget-object v7, p0, Ly1/e;->mNestedScrollingV2ConsumedCompat:[I

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v7}, Ly1/e;->onNestedScroll(Landroid/view/View;IIIII[I)V

    return-void
.end method

.method public onNestedScroll(Landroid/view/View;IIIII)V
    .locals 8

    iget-object v7, p0, Ly1/e;->mNestedScrollingV2ConsumedCompat:[I

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    invoke-virtual/range {v0 .. v7}, Ly1/e;->onNestedScroll(Landroid/view/View;IIIII[I)V

    return-void
.end method

.method public onNestedScroll(Landroid/view/View;IIIII[I)V
    .locals 11

    move-object v8, p0

    if-eqz p6, :cond_0

    return-void

    :cond_0
    const/4 v9, 0x1

    aget v10, p7, v9

    iget-object v5, v8, Ly1/e;->mParentOffsetInWindow:[I

    move-object v0, p0

    move v1, p2

    move v2, p3

    move v3, p4

    move/from16 v4, p5

    move/from16 v6, p6

    move-object/from16 v7, p7

    invoke-virtual/range {v0 .. v7}, Ly1/e;->dispatchNestedScroll(IIII[II[I)V

    aget v0, p7, v9

    sub-int/2addr v0, v10

    sub-int v0, p5, v0

    if-nez v0, :cond_1

    iget-object v1, v8, Ly1/e;->mParentOffsetInWindow:[I

    aget v1, v1, v9

    add-int v1, p5, v1

    goto :goto_0

    :cond_1
    move v1, v0

    :goto_0
    if-gez v1, :cond_2

    invoke-virtual {p0}, Ly1/e;->canChildScrollUp()Z

    move-result v2

    if-nez v2, :cond_2

    iget v2, v8, Ly1/e;->mTotalUnconsumed:F

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    int-to-float v1, v1

    add-float/2addr v2, v1

    iput v2, v8, Ly1/e;->mTotalUnconsumed:F

    invoke-direct {p0, v2}, Ly1/e;->moveSpinner(F)V

    aget v1, p7, v9

    add-int/2addr v1, v0

    aput v1, p7, v9

    :cond_2
    return-void
.end method

.method public onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;I)V
    .locals 0

    iget-object p1, p0, Ly1/e;->mNestedScrollingParentHelper:Le0/s;

    .line 1
    iput p3, p1, Le0/s;->a:I

    and-int/lit8 p1, p3, 0x2

    .line 2
    invoke-virtual {p0, p1}, Ly1/e;->startNestedScroll(I)Z

    const/4 p1, 0x0

    iput p1, p0, Ly1/e;->mTotalUnconsumed:F

    const/4 p1, 0x1

    iput-boolean p1, p0, Ly1/e;->mNestedScrollInProgress:Z

    return-void
.end method

.method public onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;II)V
    .locals 0

    if-nez p4, :cond_0

    invoke-virtual {p0, p1, p2, p3}, Ly1/e;->onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;I)V

    :cond_0
    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    check-cast p1, Ly1/e$k;

    invoke-virtual {p1}, Landroid/view/AbsSavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    iget-boolean p1, p1, Ly1/e$k;->a:Z

    invoke-virtual {p0, p1}, Ly1/e;->setRefreshing(Z)V

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    invoke-super {p0}, Landroid/view/ViewGroup;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    new-instance v1, Ly1/e$k;

    iget-boolean v2, p0, Ly1/e;->mRefreshing:Z

    invoke-direct {v1, v0, v2}, Ly1/e$k;-><init>(Landroid/os/Parcelable;Z)V

    return-object v1
.end method

.method public onStartNestedScroll(Landroid/view/View;Landroid/view/View;I)Z
    .locals 0

    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-boolean p1, p0, Ly1/e;->mReturningToStart:Z

    if-nez p1, :cond_0

    iget-boolean p1, p0, Ly1/e;->mRefreshing:Z

    if-nez p1, :cond_0

    and-int/lit8 p1, p3, 0x2

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public onStartNestedScroll(Landroid/view/View;Landroid/view/View;II)Z
    .locals 0

    if-nez p4, :cond_0

    invoke-virtual {p0, p1, p2, p3}, Ly1/e;->onStartNestedScroll(Landroid/view/View;Landroid/view/View;I)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public onStopNestedScroll(Landroid/view/View;)V
    .locals 2

    iget-object p1, p0, Ly1/e;->mNestedScrollingParentHelper:Le0/s;

    const/4 v0, 0x0

    .line 1
    iput v0, p1, Le0/s;->a:I

    .line 2
    iput-boolean v0, p0, Ly1/e;->mNestedScrollInProgress:Z

    iget p1, p0, Ly1/e;->mTotalUnconsumed:F

    const/4 v0, 0x0

    cmpl-float v1, p1, v0

    if-lez v1, :cond_0

    invoke-direct {p0, p1}, Ly1/e;->finishSpinner(F)V

    iput v0, p0, Ly1/e;->mTotalUnconsumed:F

    :cond_0
    invoke-virtual {p0}, Ly1/e;->stopNestedScroll()V

    return-void
.end method

.method public onStopNestedScroll(Landroid/view/View;I)V
    .locals 0

    if-nez p2, :cond_0

    invoke-virtual {p0, p1}, Ly1/e;->onStopNestedScroll(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    iget-boolean v1, p0, Ly1/e;->mReturningToStart:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    if-nez v0, :cond_0

    iput-boolean v2, p0, Ly1/e;->mReturningToStart:Z

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v1

    if-eqz v1, :cond_e

    iget-boolean v1, p0, Ly1/e;->mReturningToStart:Z

    if-nez v1, :cond_e

    invoke-virtual {p0}, Ly1/e;->canChildScrollUp()Z

    move-result v1

    if-nez v1, :cond_e

    iget-boolean v1, p0, Ly1/e;->mRefreshing:Z

    if-nez v1, :cond_e

    iget-boolean v1, p0, Ly1/e;->mNestedScrollInProgress:Z

    if-eqz v1, :cond_1

    goto/16 :goto_1

    :cond_1
    const/4 v1, 0x1

    if-eqz v0, :cond_c

    const/high16 v3, 0x3f000000    # 0.5f

    if-eq v0, v1, :cond_9

    const/4 v4, 0x2

    if-eq v0, v4, :cond_6

    const/4 v3, 0x3

    if-eq v0, v3, :cond_5

    const/4 v3, 0x5

    if-eq v0, v3, :cond_3

    const/4 v2, 0x6

    if-eq v0, v2, :cond_2

    goto/16 :goto_0

    :cond_2
    invoke-direct {p0, p1}, Ly1/e;->onSecondaryPointerUp(Landroid/view/MotionEvent;)V

    goto/16 :goto_0

    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    if-gez v0, :cond_4

    sget-object p1, Ly1/e;->LOG_TAG:Ljava/lang/String;

    const-string v0, "Got ACTION_POINTER_DOWN event but have an invalid action index."

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v2

    :cond_4
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    iput p1, p0, Ly1/e;->mActivePointerId:I

    goto :goto_0

    :cond_5
    return v2

    :cond_6
    iget v0, p0, Ly1/e;->mActivePointerId:I

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    if-gez v0, :cond_7

    sget-object p1, Ly1/e;->LOG_TAG:Ljava/lang/String;

    const-string v0, "Got ACTION_MOVE event but have an invalid active pointer id."

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v2

    :cond_7
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    invoke-direct {p0, p1}, Ly1/e;->startDragging(F)V

    iget-boolean v0, p0, Ly1/e;->mIsBeingDragged:Z

    if-eqz v0, :cond_d

    iget v0, p0, Ly1/e;->mInitialMotionY:F

    sub-float/2addr p1, v0

    mul-float/2addr p1, v3

    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-lez v0, :cond_8

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    invoke-direct {p0, p1}, Ly1/e;->moveSpinner(F)V

    goto :goto_0

    :cond_8
    return v2

    :cond_9
    iget v0, p0, Ly1/e;->mActivePointerId:I

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    if-gez v0, :cond_a

    sget-object p1, Ly1/e;->LOG_TAG:Ljava/lang/String;

    const-string v0, "Got ACTION_UP event but don\'t have an active pointer id."

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v2

    :cond_a
    iget-boolean v1, p0, Ly1/e;->mIsBeingDragged:Z

    if-eqz v1, :cond_b

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    iget v0, p0, Ly1/e;->mInitialMotionY:F

    sub-float/2addr p1, v0

    mul-float/2addr p1, v3

    iput-boolean v2, p0, Ly1/e;->mIsBeingDragged:Z

    invoke-direct {p0, p1}, Ly1/e;->finishSpinner(F)V

    :cond_b
    const/4 p1, -0x1

    iput p1, p0, Ly1/e;->mActivePointerId:I

    return v2

    :cond_c
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    iput p1, p0, Ly1/e;->mActivePointerId:I

    iput-boolean v2, p0, Ly1/e;->mIsBeingDragged:Z

    :cond_d
    :goto_0
    return v1

    :cond_e
    :goto_1
    return v2
.end method

.method public requestDisallowInterceptTouchEvent(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Ly1/e;->mTarget:Landroid/view/View;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    sget-object v1, Le0/d0;->a:Ljava/util/WeakHashMap;

    .line 6
    .line 7
    invoke-static {v0}, Le0/d0$d;->p(Landroid/view/View;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    iget-boolean v0, p0, Ly1/e;->mEnableLegacyRequestDisallowInterceptTouch:Z

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    invoke-interface {v0, p1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    .line 29
    .line 30
    .line 31
    :cond_2
    :goto_0
    return-void
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public reset()V
    .locals 2

    iget-object v0, p0, Ly1/e;->mCircleView:Ly1/a;

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    iget-object v0, p0, Ly1/e;->mProgress:Ly1/d;

    invoke-virtual {v0}, Ly1/d;->stop()V

    iget-object v0, p0, Ly1/e;->mCircleView:Ly1/a;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    const/16 v0, 0xff

    invoke-direct {p0, v0}, Ly1/e;->setColorViewAlpha(I)V

    iget-boolean v0, p0, Ly1/e;->mScale:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ly1/e;->setAnimationProgress(F)V

    goto :goto_0

    :cond_0
    iget v0, p0, Ly1/e;->mOriginalOffsetTop:I

    iget v1, p0, Ly1/e;->mCurrentTargetOffsetTop:I

    sub-int/2addr v0, v1

    invoke-virtual {p0, v0}, Ly1/e;->setTargetOffsetTopAndBottom(I)V

    :goto_0
    iget-object v0, p0, Ly1/e;->mCircleView:Ly1/a;

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    iput v0, p0, Ly1/e;->mCurrentTargetOffsetTop:I

    return-void
.end method

.method public setAnimationProgress(F)V
    .locals 1

    iget-object v0, p0, Ly1/e;->mCircleView:Ly1/a;

    invoke-virtual {v0, p1}, Landroid/view/View;->setScaleX(F)V

    iget-object v0, p0, Ly1/e;->mCircleView:Ly1/a;

    invoke-virtual {v0, p1}, Landroid/view/View;->setScaleY(F)V

    return-void
.end method

.method public varargs setColorScheme([I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0, p1}, Ly1/e;->setColorSchemeResources([I)V

    return-void
.end method

.method public varargs setColorSchemeColors([I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ly1/e;->ensureTarget()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ly1/e;->mProgress:Ly1/d;

    .line 5
    .line 6
    iget-object v1, v0, Ly1/d;->a:Ly1/d$a;

    .line 7
    .line 8
    iput-object p1, v1, Ly1/d$a;->i:[I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-virtual {v1, p1}, Ly1/d$a;->a(I)V

    .line 12
    .line 13
    .line 14
    iget-object v1, v0, Ly1/d;->a:Ly1/d$a;

    .line 15
    .line 16
    invoke-virtual {v1, p1}, Ly1/d$a;->a(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 20
    .line 21
    .line 22
    return-void
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public varargs setColorSchemeResources([I)V
    .locals 4

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    array-length v1, p1

    new-array v1, v1, [I

    const/4 v2, 0x0

    :goto_0
    array-length v3, p1

    if-ge v2, v3, :cond_0

    aget v3, p1, v2

    invoke-static {v0, v3}, Lv/a;->getColor(Landroid/content/Context;I)I

    move-result v3

    aput v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v1}, Ly1/e;->setColorSchemeColors([I)V

    return-void
.end method

.method public setDistanceToTriggerSync(I)V
    .locals 0

    int-to-float p1, p1

    iput p1, p0, Ly1/e;->mTotalDragDistance:F

    return-void
.end method

.method public setEnabled(Z)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setEnabled(Z)V

    if-nez p1, :cond_0

    invoke-virtual {p0}, Ly1/e;->reset()V

    :cond_0
    return-void
.end method

.method public setLegacyRequestDisallowInterceptTouchEventEnabled(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iput-boolean p1, p0, Ly1/e;->mEnableLegacyRequestDisallowInterceptTouch:Z

    return-void
.end method

.method public setNestedScrollingEnabled(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Ly1/e;->mNestedScrollingChildHelper:Le0/p;

    .line 2
    .line 3
    iget-boolean v1, v0, Le0/p;->d:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v1, v0, Le0/p;->c:Landroid/view/View;

    .line 8
    .line 9
    sget-object v2, Le0/d0;->a:Ljava/util/WeakHashMap;

    .line 10
    .line 11
    invoke-static {v1}, Le0/d0$d;->z(Landroid/view/View;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iput-boolean p1, v0, Le0/p;->d:Z

    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public setOnChildScrollUpCallback(Ly1/e$i;)V
    .locals 0

    iput-object p1, p0, Ly1/e;->mChildScrollUpCallback:Ly1/e$i;

    return-void
.end method

.method public setOnRefreshListener(Ly1/e$j;)V
    .locals 0

    iput-object p1, p0, Ly1/e;->mListener:Ly1/e$j;

    return-void
.end method

.method public setProgressBackgroundColor(I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0, p1}, Ly1/e;->setProgressBackgroundColorSchemeResource(I)V

    return-void
.end method

.method public setProgressBackgroundColorSchemeColor(I)V
    .locals 1

    iget-object v0, p0, Ly1/e;->mCircleView:Ly1/a;

    invoke-virtual {v0, p1}, Ly1/a;->setBackgroundColor(I)V

    return-void
.end method

.method public setProgressBackgroundColorSchemeResource(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lv/a;->getColor(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {p0, p1}, Ly1/e;->setProgressBackgroundColorSchemeColor(I)V

    return-void
.end method

.method public setProgressViewEndTarget(ZI)V
    .locals 0

    iput p2, p0, Ly1/e;->mSpinnerOffsetEnd:I

    iput-boolean p1, p0, Ly1/e;->mScale:Z

    iget-object p1, p0, Ly1/e;->mCircleView:Ly1/a;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setProgressViewOffset(ZII)V
    .locals 0

    iput-boolean p1, p0, Ly1/e;->mScale:Z

    iput p2, p0, Ly1/e;->mOriginalOffsetTop:I

    iput p3, p0, Ly1/e;->mSpinnerOffsetEnd:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Ly1/e;->mUsingCustomStart:Z

    invoke-virtual {p0}, Ly1/e;->reset()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Ly1/e;->mRefreshing:Z

    return-void
.end method

.method public setRefreshing(Z)V
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    iget-boolean v1, p0, Ly1/e;->mRefreshing:Z

    if-eq v1, p1, :cond_1

    iput-boolean p1, p0, Ly1/e;->mRefreshing:Z

    iget-boolean p1, p0, Ly1/e;->mUsingCustomStart:Z

    if-nez p1, :cond_0

    iget p1, p0, Ly1/e;->mSpinnerOffsetEnd:I

    iget v1, p0, Ly1/e;->mOriginalOffsetTop:I

    add-int/2addr p1, v1

    goto :goto_0

    :cond_0
    iget p1, p0, Ly1/e;->mSpinnerOffsetEnd:I

    :goto_0
    iget v1, p0, Ly1/e;->mCurrentTargetOffsetTop:I

    sub-int/2addr p1, v1

    invoke-virtual {p0, p1}, Ly1/e;->setTargetOffsetTopAndBottom(I)V

    iput-boolean v0, p0, Ly1/e;->mNotify:Z

    iget-object p1, p0, Ly1/e;->mRefreshListener:Landroid/view/animation/Animation$AnimationListener;

    invoke-direct {p0, p1}, Ly1/e;->startScaleUpAnimation(Landroid/view/animation/Animation$AnimationListener;)V

    goto :goto_1

    :cond_1
    invoke-direct {p0, p1, v0}, Ly1/e;->setRefreshing(ZZ)V

    :goto_1
    return-void
.end method

.method public setSize(I)V
    .locals 4

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p1, v0, :cond_0

    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-nez p1, :cond_1

    .line 16
    .line 17
    const/high16 v1, 0x42600000    # 56.0f

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/high16 v1, 0x42200000    # 40.0f

    .line 21
    .line 22
    :goto_0
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 23
    .line 24
    mul-float/2addr v0, v1

    .line 25
    float-to-int v0, v0

    .line 26
    iput v0, p0, Ly1/e;->mCircleDiameter:I

    .line 27
    .line 28
    iget-object v0, p0, Ly1/e;->mCircleView:Ly1/a;

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Ly1/e;->mProgress:Ly1/d;

    .line 35
    .line 36
    if-nez p1, :cond_2

    .line 37
    .line 38
    const/high16 p1, 0x41300000    # 11.0f

    .line 39
    .line 40
    const/high16 v1, 0x40400000    # 3.0f

    .line 41
    .line 42
    const/high16 v2, 0x41400000    # 12.0f

    .line 43
    .line 44
    const/high16 v3, 0x40c00000    # 6.0f

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    const/high16 p1, 0x40f00000    # 7.5f

    .line 48
    .line 49
    const/high16 v1, 0x40200000    # 2.5f

    .line 50
    .line 51
    const/high16 v2, 0x41200000    # 10.0f

    .line 52
    .line 53
    const/high16 v3, 0x40a00000    # 5.0f

    .line 54
    .line 55
    :goto_1
    invoke-virtual {v0, p1, v1, v2, v3}, Ly1/d;->b(FFFF)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 59
    .line 60
    .line 61
    iget-object p1, p0, Ly1/e;->mCircleView:Ly1/a;

    .line 62
    .line 63
    iget-object v0, p0, Ly1/e;->mProgress:Ly1/d;

    .line 64
    .line 65
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 66
    .line 67
    .line 68
    return-void
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public setSlingshotDistance(I)V
    .locals 0

    iput p1, p0, Ly1/e;->mCustomSlingshotDistance:I

    return-void
.end method

.method public setTargetOffsetTopAndBottom(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Ly1/e;->mCircleView:Ly1/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->bringToFront()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ly1/e;->mCircleView:Ly1/a;

    .line 7
    .line 8
    sget-object v1, Le0/d0;->a:Ljava/util/WeakHashMap;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Landroid/view/View;->offsetTopAndBottom(I)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Ly1/e;->mCircleView:Ly1/a;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    iput p1, p0, Ly1/e;->mCurrentTargetOffsetTop:I

    .line 20
    .line 21
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public startNestedScroll(I)Z
    .locals 2

    iget-object v0, p0, Ly1/e;->mNestedScrollingChildHelper:Le0/p;

    const/4 v1, 0x0

    .line 1
    invoke-virtual {v0, p1, v1}, Le0/p;->g(II)Z

    move-result p1

    return p1
.end method

.method public startNestedScroll(II)Z
    .locals 0

    if-nez p2, :cond_0

    invoke-virtual {p0, p1}, Ly1/e;->startNestedScroll(I)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public startScaleDownAnimation(Landroid/view/animation/Animation$AnimationListener;)V
    .locals 3

    .line 1
    new-instance v0, Ly1/e$c;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ly1/e$c;-><init>(Ly1/e;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Ly1/e;->mScaleDownAnimation:Landroid/view/animation/Animation;

    .line 7
    .line 8
    const-wide/16 v1, 0x96

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Ly1/e;->mCircleView:Ly1/a;

    .line 14
    .line 15
    iput-object p1, v0, Ly1/a;->a:Landroid/view/animation/Animation$AnimationListener;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Ly1/e;->mCircleView:Ly1/a;

    .line 21
    .line 22
    iget-object v0, p0, Ly1/e;->mScaleDownAnimation:Landroid/view/animation/Animation;

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 25
    .line 26
    .line 27
    return-void
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public stopNestedScroll()V
    .locals 2

    iget-object v0, p0, Ly1/e;->mNestedScrollingChildHelper:Le0/p;

    const/4 v1, 0x0

    .line 1
    invoke-virtual {v0, v1}, Le0/p;->h(I)V

    return-void
.end method

.method public stopNestedScroll(I)V
    .locals 0

    if-nez p1, :cond_0

    invoke-virtual {p0}, Ly1/e;->stopNestedScroll()V

    :cond_0
    return-void
.end method
