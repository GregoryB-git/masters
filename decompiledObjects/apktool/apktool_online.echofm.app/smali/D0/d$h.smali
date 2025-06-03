.class public final LD0/d$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD0/F;
.implements LD0/d$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LD0/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "h"
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:I

.field public final c:Ljava/util/ArrayList;

.field public d:Ld0/q;

.field public e:I

.field public f:J

.field public g:J

.field public h:Z

.field public i:J

.field public j:J

.field public k:Z

.field public l:J

.field public m:LD0/F$a;

.field public n:Ljava/util/concurrent/Executor;

.field public final synthetic o:LD0/d;


# direct methods
.method public constructor <init>(LD0/d;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, LD0/d$h;->o:LD0/d;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, LD0/d$h;->a:Landroid/content/Context;

    .line 7
    .line 8
    invoke-static {p2}, Lg0/M;->b0(Landroid/content/Context;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iput p1, p0, LD0/d$h;->b:I

    .line 13
    .line 14
    new-instance p1, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, LD0/d$h;->c:Ljava/util/ArrayList;

    .line 20
    .line 21
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    iput-wide p1, p0, LD0/d$h;->i:J

    .line 27
    .line 28
    iput-wide p1, p0, LD0/d$h;->j:J

    .line 29
    .line 30
    sget-object p1, LD0/F$a;->a:LD0/F$a;

    .line 31
    .line 32
    iput-object p1, p0, LD0/d$h;->m:LD0/F$a;

    .line 33
    .line 34
    invoke-static {}, LD0/d;->r()Ljava/util/concurrent/Executor;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, LD0/d$h;->n:Ljava/util/concurrent/Executor;

    .line 39
    .line 40
    return-void
.end method

.method public static synthetic g(LD0/d$h;LD0/F$a;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LD0/d$h;->l(LD0/F$a;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic h(LD0/d$h;LD0/F$a;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LD0/d$h;->k(LD0/F$a;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic i(LD0/d$h;LD0/F$a;Ld0/P;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LD0/d$h;->m(LD0/F$a;Ld0/P;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public A(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LD0/d$h;->J()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, LD0/d$h;->k:Z

    .line 9
    .line 10
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    iput-wide v0, p0, LD0/d$h;->i:J

    .line 16
    .line 17
    iput-wide v0, p0, LD0/d$h;->j:J

    .line 18
    .line 19
    iget-object v0, p0, LD0/d$h;->o:LD0/d;

    .line 20
    .line 21
    invoke-static {v0}, LD0/d;->e(LD0/d;)V

    .line 22
    .line 23
    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    iget-object p1, p0, LD0/d$h;->o:LD0/d;

    .line 27
    .line 28
    invoke-static {p1}, LD0/d;->s(LD0/d;)LD0/q;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1}, LD0/q;->m()V

    .line 33
    .line 34
    .line 35
    :cond_0
    return-void

    .line 36
    :cond_1
    const/4 p1, 0x0

    .line 37
    throw p1
.end method

.method public B()V
    .locals 1

    .line 1
    iget-object v0, p0, LD0/d$h;->o:LD0/d;

    .line 2
    .line 3
    invoke-static {v0}, LD0/d;->s(LD0/d;)LD0/q;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LD0/q;->l()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public C(Ljava/util/List;)V
    .locals 1

    .line 1
    iget-object v0, p0, LD0/d$h;->c:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-virtual {p0, p1}, LD0/d$h;->o(Ljava/util/List;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, LD0/d$h;->n()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public D(JJ)V
    .locals 3

    .line 1
    iget-boolean v0, p0, LD0/d$h;->h:Z

    .line 2
    .line 3
    iget-wide v1, p0, LD0/d$h;->f:J

    .line 4
    .line 5
    cmp-long v1, v1, p1

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    iget-wide v1, p0, LD0/d$h;->g:J

    .line 10
    .line 11
    cmp-long v1, v1, p3

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v1, 0x0

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    :goto_0
    const/4 v1, 0x1

    .line 19
    :goto_1
    or-int/2addr v0, v1

    .line 20
    iput-boolean v0, p0, LD0/d$h;->h:Z

    .line 21
    .line 22
    iput-wide p1, p0, LD0/d$h;->f:J

    .line 23
    .line 24
    iput-wide p3, p0, LD0/d$h;->g:J

    .line 25
    .line 26
    return-void
.end method

.method public E()Z
    .locals 1

    .line 1
    iget-object v0, p0, LD0/d$h;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Lg0/M;->B0(Landroid/content/Context;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public F(LD0/F$a;Ljava/util/concurrent/Executor;)V
    .locals 0

    .line 1
    iput-object p1, p0, LD0/d$h;->m:LD0/F$a;

    .line 2
    .line 3
    iput-object p2, p0, LD0/d$h;->n:Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    return-void
.end method

.method public G(ILd0/q;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, LD0/d$h;->J()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lg0/a;->f(Z)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    if-eq p1, v0, :cond_1

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    if-ne p1, v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    new-instance p2, Ljava/lang/UnsupportedOperationException;

    .line 16
    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v1, "Unsupported input type "

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-direct {p2, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p2

    .line 38
    :cond_1
    :goto_0
    iget-object v1, p0, LD0/d$h;->o:LD0/d;

    .line 39
    .line 40
    invoke-static {v1}, LD0/d;->s(LD0/d;)LD0/q;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    iget v2, p2, Ld0/q;->v:F

    .line 45
    .line 46
    invoke-virtual {v1, v2}, LD0/q;->p(F)V

    .line 47
    .line 48
    .line 49
    if-ne p1, v0, :cond_2

    .line 50
    .line 51
    sget v1, Lg0/M;->a:I

    .line 52
    .line 53
    const/16 v2, 0x15

    .line 54
    .line 55
    if-ge v1, v2, :cond_2

    .line 56
    .line 57
    iget v1, p2, Ld0/q;->w:I

    .line 58
    .line 59
    const/4 v2, -0x1

    .line 60
    if-eq v1, v2, :cond_2

    .line 61
    .line 62
    if-eqz v1, :cond_2

    .line 63
    .line 64
    int-to-float v1, v1

    .line 65
    invoke-static {v1}, LD0/d$g;->a(F)Ld0/n;

    .line 66
    .line 67
    .line 68
    :cond_2
    iput p1, p0, LD0/d$h;->e:I

    .line 69
    .line 70
    iput-object p2, p0, LD0/d$h;->d:Ld0/q;

    .line 71
    .line 72
    iget-boolean p1, p0, LD0/d$h;->k:Z

    .line 73
    .line 74
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    if-nez p1, :cond_3

    .line 80
    .line 81
    invoke-virtual {p0}, LD0/d$h;->n()V

    .line 82
    .line 83
    .line 84
    iput-boolean v0, p0, LD0/d$h;->k:Z

    .line 85
    .line 86
    iput-wide v1, p0, LD0/d$h;->l:J

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_3
    iget-wide p1, p0, LD0/d$h;->j:J

    .line 90
    .line 91
    cmp-long p1, p1, v1

    .line 92
    .line 93
    if-eqz p1, :cond_4

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_4
    const/4 v0, 0x0

    .line 97
    :goto_1
    invoke-static {v0}, Lg0/a;->f(Z)V

    .line 98
    .line 99
    .line 100
    iget-wide p1, p0, LD0/d$h;->j:J

    .line 101
    .line 102
    iput-wide p1, p0, LD0/d$h;->l:J

    .line 103
    .line 104
    :goto_2
    return-void
.end method

.method public H(Ld0/q;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LD0/d$h;->J()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    xor-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    invoke-static {v0}, Lg0/a;->f(Z)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, LD0/d$h;->o:LD0/d;

    .line 11
    .line 12
    invoke-static {v0, p1}, LD0/d;->t(LD0/d;Ld0/q;)Ld0/N;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public I(Landroid/view/Surface;Lg0/A;)V
    .locals 1

    .line 1
    iget-object v0, p0, LD0/d$h;->o:LD0/d;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LD0/d;->H(Landroid/view/Surface;Lg0/A;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public J()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public K(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, LD0/d$h;->o:LD0/d;

    .line 2
    .line 3
    invoke-static {v0}, LD0/d;->s(LD0/d;)LD0/q;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, LD0/q;->h(Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public L()V
    .locals 1

    .line 1
    iget-object v0, p0, LD0/d$h;->o:LD0/d;

    .line 2
    .line 3
    invoke-static {v0}, LD0/d;->s(LD0/d;)LD0/q;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LD0/q;->g()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public a(LD0/d;)V
    .locals 2

    .line 1
    iget-object p1, p0, LD0/d$h;->m:LD0/F$a;

    .line 2
    .line 3
    iget-object v0, p0, LD0/d$h;->n:Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    new-instance v1, LD0/g;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, LD0/g;-><init>(LD0/d$h;LD0/F$a;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public b(LD0/d;Ld0/P;)V
    .locals 2

    .line 1
    iget-object p1, p0, LD0/d$h;->m:LD0/F$a;

    .line 2
    .line 3
    iget-object v0, p0, LD0/d$h;->n:Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    new-instance v1, LD0/f;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1, p2}, LD0/f;-><init>(LD0/d$h;LD0/F$a;Ld0/P;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public c()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, LD0/d$h;->J()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-wide v0, p0, LD0/d$h;->i:J

    .line 8
    .line 9
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    cmp-long v2, v0, v2

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    iget-object v2, p0, LD0/d$h;->o:LD0/d;

    .line 19
    .line 20
    invoke-static {v2, v0, v1}, LD0/d;->g(LD0/d;J)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    :goto_0
    return v0
.end method

.method public d(LD0/d;)V
    .locals 2

    .line 1
    iget-object p1, p0, LD0/d$h;->m:LD0/F$a;

    .line 2
    .line 3
    iget-object v0, p0, LD0/d$h;->n:Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    new-instance v1, LD0/h;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, LD0/h;-><init>(LD0/d$h;LD0/F$a;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public e()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LD0/d$h;->J()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LD0/d$h;->o:LD0/d;

    .line 8
    .line 9
    invoke-static {v0}, LD0/d;->f(LD0/d;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    :goto_0
    return v0
.end method

.method public f(JJ)V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, LD0/d$h;->o:LD0/d;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, LD0/d;->G(JJ)V
    :try_end_0
    .catch Lk0/u; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :catch_0
    move-exception p1

    .line 8
    new-instance p2, LD0/F$b;

    .line 9
    .line 10
    iget-object p3, p0, LD0/d$h;->d:Ld0/q;

    .line 11
    .line 12
    if-eqz p3, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    new-instance p3, Ld0/q$b;

    .line 16
    .line 17
    invoke-direct {p3}, Ld0/q$b;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p3}, Ld0/q$b;->K()Ld0/q;

    .line 21
    .line 22
    .line 23
    move-result-object p3

    .line 24
    :goto_0
    invoke-direct {p2, p1, p3}, LD0/F$b;-><init>(Ljava/lang/Throwable;Ld0/q;)V

    .line 25
    .line 26
    .line 27
    throw p2
.end method

.method public j()V
    .locals 1

    .line 1
    iget-object v0, p0, LD0/d$h;->o:LD0/d;

    .line 2
    .line 3
    invoke-static {v0}, LD0/d;->s(LD0/d;)LD0/q;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LD0/q;->a()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final synthetic k(LD0/F$a;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, LD0/F$a;->a(LD0/F;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final synthetic l(LD0/F$a;)V
    .locals 1

    .line 1
    invoke-static {p0}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, LD0/F;

    .line 6
    .line 7
    invoke-interface {p1, v0}, LD0/F$a;->b(LD0/F;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final synthetic m(LD0/F$a;Ld0/P;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0, p2}, LD0/F$a;->c(LD0/F;Ld0/P;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final n()V
    .locals 6

    .line 1
    iget-object v0, p0, LD0/d$h;->d:Ld0/q;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, LD0/d$h;->c:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, LD0/d$h;->d:Ld0/q;

    .line 17
    .line 18
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Ld0/q;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-static {v1}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-static {v2}, Landroid/support/v4/media/a;->a(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    new-instance v2, Ld0/r$b;

    .line 33
    .line 34
    iget-object v3, v0, Ld0/q;->A:Ld0/h;

    .line 35
    .line 36
    invoke-static {v3}, LD0/d;->j(Ld0/h;)Ld0/h;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    iget v4, v0, Ld0/q;->t:I

    .line 41
    .line 42
    iget v5, v0, Ld0/q;->u:I

    .line 43
    .line 44
    invoke-direct {v2, v3, v4, v5}, Ld0/r$b;-><init>(Ld0/h;II)V

    .line 45
    .line 46
    .line 47
    iget v0, v0, Ld0/q;->x:F

    .line 48
    .line 49
    invoke-virtual {v2, v0}, Ld0/r$b;->b(F)Ld0/r$b;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Ld0/r$b;->a()Ld0/r;

    .line 54
    .line 55
    .line 56
    throw v1
.end method

.method public o(Ljava/util/List;)V
    .locals 1

    .line 1
    iget-object v0, p0, LD0/d$h;->c:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LD0/d$h;->c:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public release()V
    .locals 1

    .line 1
    iget-object v0, p0, LD0/d$h;->o:LD0/d;

    .line 2
    .line 3
    invoke-virtual {v0}, LD0/d;->F()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public u(F)V
    .locals 1

    .line 1
    iget-object v0, p0, LD0/d$h;->o:LD0/d;

    .line 2
    .line 3
    invoke-static {v0, p1}, LD0/d;->i(LD0/d;F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public v()V
    .locals 1

    .line 1
    iget-object v0, p0, LD0/d$h;->o:LD0/d;

    .line 2
    .line 3
    invoke-virtual {v0}, LD0/d;->v()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public w(JZ)J
    .locals 2

    .line 1
    invoke-virtual {p0}, LD0/d$h;->J()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p1}, Lg0/a;->f(Z)V

    .line 6
    .line 7
    .line 8
    iget p1, p0, LD0/d$h;->b:I

    .line 9
    .line 10
    const/4 p2, -0x1

    .line 11
    if-eq p1, p2, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    :goto_0
    invoke-static {p1}, Lg0/a;->f(Z)V

    .line 17
    .line 18
    .line 19
    iget-wide p1, p0, LD0/d$h;->l:J

    .line 20
    .line 21
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    cmp-long p3, p1, v0

    .line 27
    .line 28
    if-eqz p3, :cond_2

    .line 29
    .line 30
    iget-object p3, p0, LD0/d$h;->o:LD0/d;

    .line 31
    .line 32
    invoke-static {p3, p1, p2}, LD0/d;->g(LD0/d;J)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-nez p1, :cond_1

    .line 37
    .line 38
    return-wide v0

    .line 39
    :cond_1
    invoke-virtual {p0}, LD0/d$h;->n()V

    .line 40
    .line 41
    .line 42
    iput-wide v0, p0, LD0/d$h;->l:J

    .line 43
    .line 44
    :cond_2
    const/4 p1, 0x0

    .line 45
    invoke-static {p1}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    invoke-static {p2}, Landroid/support/v4/media/a;->a(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    throw p1
.end method

.method public x()Landroid/view/Surface;
    .locals 2

    .line 1
    invoke-virtual {p0}, LD0/d$h;->J()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lg0/a;->f(Z)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-static {v0}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {v1}, Landroid/support/v4/media/a;->a(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    throw v0
.end method

.method public y()V
    .locals 1

    .line 1
    iget-object v0, p0, LD0/d$h;->o:LD0/d;

    .line 2
    .line 3
    invoke-static {v0}, LD0/d;->s(LD0/d;)LD0/q;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LD0/q;->k()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public z(LD0/p;)V
    .locals 1

    .line 1
    iget-object v0, p0, LD0/d$h;->o:LD0/d;

    .line 2
    .line 3
    invoke-static {v0, p1}, LD0/d;->h(LD0/d;LD0/p;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
