.class public final Ly1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# instance fields
.field public final synthetic a:Ly1/d$a;

.field public final synthetic b:Ly1/d;


# direct methods
.method public constructor <init>(Ly1/d;Ly1/d$a;)V
    .locals 0

    iput-object p1, p0, Ly1/c;->b:Ly1/d;

    iput-object p2, p0, Ly1/c;->a:Ly1/d$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public final onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 4

    .line 1
    iget-object v0, p0, Ly1/c;->b:Ly1/d;

    .line 2
    .line 3
    iget-object v1, p0, Ly1/c;->a:Ly1/d$a;

    .line 4
    .line 5
    const/high16 v2, 0x3f800000    # 1.0f

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    invoke-virtual {v0, v2, v1, v3}, Ly1/d;->a(FLy1/d$a;Z)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Ly1/c;->a:Ly1/d$a;

    .line 12
    .line 13
    iget v1, v0, Ly1/d$a;->e:F

    .line 14
    .line 15
    iput v1, v0, Ly1/d$a;->k:F

    .line 16
    .line 17
    iget v1, v0, Ly1/d$a;->f:F

    .line 18
    .line 19
    iput v1, v0, Ly1/d$a;->l:F

    .line 20
    .line 21
    iget v1, v0, Ly1/d$a;->g:F

    .line 22
    .line 23
    iput v1, v0, Ly1/d$a;->m:F

    .line 24
    .line 25
    iget v1, v0, Ly1/d$a;->j:I

    .line 26
    .line 27
    add-int/2addr v1, v3

    .line 28
    iget-object v3, v0, Ly1/d$a;->i:[I

    .line 29
    .line 30
    array-length v3, v3

    .line 31
    rem-int/2addr v1, v3

    .line 32
    invoke-virtual {v0, v1}, Ly1/d$a;->a(I)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Ly1/c;->b:Ly1/d;

    .line 36
    .line 37
    iget-boolean v1, v0, Ly1/d;->f:Z

    .line 38
    .line 39
    if-eqz v1, :cond_0

    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    iput-boolean v1, v0, Ly1/d;->f:Z

    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/animation/Animator;->cancel()V

    .line 45
    .line 46
    .line 47
    const-wide/16 v2, 0x534

    .line 48
    .line 49
    invoke-virtual {p1, v2, v3}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, Landroid/animation/Animator;->start()V

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, Ly1/c;->a:Ly1/d$a;

    .line 56
    .line 57
    iget-boolean v0, p1, Ly1/d$a;->n:Z

    .line 58
    .line 59
    if-eqz v0, :cond_1

    .line 60
    .line 61
    iput-boolean v1, p1, Ly1/d$a;->n:Z

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    iget p1, v0, Ly1/d;->e:F

    .line 65
    .line 66
    add-float/2addr p1, v2

    .line 67
    iput p1, v0, Ly1/d;->e:F

    .line 68
    .line 69
    :cond_1
    :goto_0
    return-void
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Ly1/c;->b:Ly1/d;

    const/4 v0, 0x0

    iput v0, p1, Ly1/d;->e:F

    return-void
.end method
