.class public final Lx0/e$c$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx0/e$c;->e(Landroid/view/ViewGroup;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/view/ViewGroup;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Z

.field public final synthetic d:Lx0/r0$c;

.field public final synthetic e:Lx0/e$c;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;Landroid/view/View;ZLx0/r0$c;Lx0/e$c;)V
    .locals 0

    iput-object p1, p0, Lx0/e$c$a;->a:Landroid/view/ViewGroup;

    iput-object p2, p0, Lx0/e$c$a;->b:Landroid/view/View;

    iput-boolean p3, p0, Lx0/e$c$a;->c:Z

    iput-object p4, p0, Lx0/e$c$a;->d:Lx0/r0$c;

    iput-object p5, p0, Lx0/e$c$a;->e:Lx0/e$c;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .line 1
    const-string v0, "anim"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lx0/e$c$a;->a:Landroid/view/ViewGroup;

    .line 7
    .line 8
    iget-object v0, p0, Lx0/e$c$a;->b:Landroid/view/View;

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    .line 11
    .line 12
    .line 13
    iget-boolean p1, p0, Lx0/e$c$a;->c:Z

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    iget-object p1, p0, Lx0/e$c$a;->d:Lx0/r0$c;

    .line 18
    .line 19
    iget p1, p1, Lx0/r0$c;->a:I

    .line 20
    .line 21
    iget-object v0, p0, Lx0/e$c$a;->b:Landroid/view/View;

    .line 22
    .line 23
    const-string v1, "viewToAnimate"

    .line 24
    .line 25
    invoke-static {v0, v1}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lx0/e$c$a;->a:Landroid/view/ViewGroup;

    .line 29
    .line 30
    invoke-static {p1, v0, v1}, La0/j;->a(ILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    iget-object p1, p0, Lx0/e$c$a;->e:Lx0/e$c;

    .line 34
    .line 35
    iget-object v0, p1, Lx0/e$c;->c:Lx0/e$b;

    .line 36
    .line 37
    iget-object v0, v0, Lx0/e$f;->a:Lx0/r0$c;

    .line 38
    .line 39
    invoke-virtual {v0, p1}, Lx0/r0$c;->c(Lx0/r0$a;)V

    .line 40
    .line 41
    .line 42
    const/4 p1, 0x2

    .line 43
    invoke-static {p1}, Lx0/y;->L(I)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_1

    .line 48
    .line 49
    const-string p1, "Animator from operation "

    .line 50
    .line 51
    invoke-static {p1}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iget-object v0, p0, Lx0/e$c$a;->d:Lx0/r0$c;

    .line 56
    .line 57
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v0, " has ended."

    .line 61
    .line 62
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    const-string v0, "FragmentManager"

    .line 70
    .line 71
    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 72
    .line 73
    .line 74
    :cond_1
    return-void
    .line 75
    .line 76
    .line 77
.end method
