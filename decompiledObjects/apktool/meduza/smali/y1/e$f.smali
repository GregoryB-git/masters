.class public final Ly1/e$f;
.super Landroid/view/animation/Animation;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly1/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ly1/e;


# direct methods
.method public constructor <init>(Ly1/e;)V
    .locals 0

    iput-object p1, p0, Ly1/e$f;->a:Ly1/e;

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    return-void
.end method


# virtual methods
.method public final applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 2

    .line 1
    iget-object p2, p0, Ly1/e$f;->a:Ly1/e;

    .line 2
    .line 3
    iget-boolean v0, p2, Ly1/e;->mUsingCustomStart:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget v0, p2, Ly1/e;->mSpinnerOffsetEnd:I

    .line 8
    .line 9
    iget p2, p2, Ly1/e;->mOriginalOffsetTop:I

    .line 10
    .line 11
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    sub-int/2addr v0, p2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget v0, p2, Ly1/e;->mSpinnerOffsetEnd:I

    .line 18
    .line 19
    :goto_0
    iget-object p2, p0, Ly1/e$f;->a:Ly1/e;

    .line 20
    .line 21
    iget v1, p2, Ly1/e;->mFrom:I

    .line 22
    .line 23
    sub-int/2addr v0, v1

    .line 24
    int-to-float v0, v0

    .line 25
    mul-float/2addr v0, p1

    .line 26
    float-to-int v0, v0

    .line 27
    add-int/2addr v1, v0

    .line 28
    iget-object p2, p2, Ly1/e;->mCircleView:Ly1/a;

    .line 29
    .line 30
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    sub-int/2addr v1, p2

    .line 35
    iget-object p2, p0, Ly1/e$f;->a:Ly1/e;

    .line 36
    .line 37
    invoke-virtual {p2, v1}, Ly1/e;->setTargetOffsetTopAndBottom(I)V

    .line 38
    .line 39
    .line 40
    iget-object p2, p0, Ly1/e$f;->a:Ly1/e;

    .line 41
    .line 42
    iget-object p2, p2, Ly1/e;->mProgress:Ly1/d;

    .line 43
    .line 44
    const/high16 v0, 0x3f800000    # 1.0f

    .line 45
    .line 46
    sub-float/2addr v0, p1

    .line 47
    iget-object p1, p2, Ly1/d;->a:Ly1/d$a;

    .line 48
    .line 49
    iget v1, p1, Ly1/d$a;->p:F

    .line 50
    .line 51
    cmpl-float v1, v0, v1

    .line 52
    .line 53
    if-eqz v1, :cond_1

    .line 54
    .line 55
    iput v0, p1, Ly1/d$a;->p:F

    .line 56
    .line 57
    :cond_1
    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 58
    .line 59
    .line 60
    return-void
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
