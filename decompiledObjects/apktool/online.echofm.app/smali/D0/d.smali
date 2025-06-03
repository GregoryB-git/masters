.class public final LD0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD0/G;
.implements Ld0/O;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LD0/d$b;,
        LD0/d$h;,
        LD0/d$c;,
        LD0/d$d;,
        LD0/d$g;,
        LD0/d$e;,
        LD0/d$f;
    }
.end annotation


# static fields
.field public static final n:Ljava/util/concurrent/Executor;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:LD0/d$h;

.field public final c:LD0/q;

.field public final d:LD0/t;

.field public final e:Ld0/F$a;

.field public final f:Lg0/c;

.field public final g:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public h:Ld0/q;

.field public i:LD0/p;

.field public j:Lg0/k;

.field public k:Landroid/util/Pair;

.field public l:I

.field public m:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LD0/b;

    .line 2
    .line 3
    invoke-direct {v0}, LD0/b;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LD0/d;->n:Ljava/util/concurrent/Executor;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(LD0/d$b;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LD0/d$b;->a(LD0/d$b;)Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, LD0/d;->a:Landroid/content/Context;

    new-instance v1, LD0/d$h;

    invoke-direct {v1, p0, v0}, LD0/d$h;-><init>(LD0/d;Landroid/content/Context;)V

    iput-object v1, p0, LD0/d;->b:LD0/d$h;

    invoke-static {p1}, LD0/d$b;->b(LD0/d$b;)Lg0/c;

    move-result-object v0

    iput-object v0, p0, LD0/d;->f:Lg0/c;

    invoke-static {p1}, LD0/d$b;->c(LD0/d$b;)LD0/q;

    move-result-object v2

    iput-object v2, p0, LD0/d;->c:LD0/q;

    invoke-virtual {v2, v0}, LD0/q;->o(Lg0/c;)V

    new-instance v0, LD0/t;

    new-instance v3, LD0/d$c;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4}, LD0/d$c;-><init>(LD0/d;LD0/d$a;)V

    invoke-direct {v0, v3, v2}, LD0/t;-><init>(LD0/t$a;LD0/q;)V

    iput-object v0, p0, LD0/d;->d:LD0/t;

    invoke-static {p1}, LD0/d$b;->d(LD0/d$b;)Ld0/F$a;

    move-result-object p1

    invoke-static {p1}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld0/F$a;

    iput-object p1, p0, LD0/d;->e:Ld0/F$a;

    new-instance p1, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object p1, p0, LD0/d;->g:Ljava/util/concurrent/CopyOnWriteArraySet;

    const/4 p1, 0x0

    iput p1, p0, LD0/d;->m:I

    invoke-virtual {p0, v1}, LD0/d;->u(LD0/d$d;)V

    return-void
.end method

.method public synthetic constructor <init>(LD0/d$b;LD0/d$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LD0/d;-><init>(LD0/d$b;)V

    return-void
.end method

.method public static synthetic D(Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    return-void
.end method

.method public static synthetic c(LD0/d;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, LD0/d;->x()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic d(Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    invoke-static {p0}, LD0/d;->D(Ljava/lang/Runnable;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic e(LD0/d;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, LD0/d;->w()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic f(LD0/d;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, LD0/d;->C()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic g(LD0/d;J)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LD0/d;->z(J)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic h(LD0/d;LD0/p;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LD0/d;->J(LD0/p;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic i(LD0/d;F)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LD0/d;->I(F)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic j(Ld0/h;)Ld0/h;
    .locals 0

    .line 1
    invoke-static {p0}, LD0/d;->y(Ld0/h;)Ld0/h;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic k(LD0/d;)Ld0/q;
    .locals 0

    .line 1
    iget-object p0, p0, LD0/d;->h:Ld0/q;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic l(LD0/d;Ld0/q;)Ld0/q;
    .locals 0

    .line 1
    iput-object p1, p0, LD0/d;->h:Ld0/q;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic m(LD0/d;)Ljava/util/concurrent/CopyOnWriteArraySet;
    .locals 0

    .line 1
    iget-object p0, p0, LD0/d;->g:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic n(LD0/d;)Landroid/util/Pair;
    .locals 0

    .line 1
    iget-object p0, p0, LD0/d;->k:Landroid/util/Pair;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic o(LD0/d;)LD0/p;
    .locals 0

    .line 1
    iget-object p0, p0, LD0/d;->i:LD0/p;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic p(LD0/d;)Lg0/c;
    .locals 0

    .line 1
    iget-object p0, p0, LD0/d;->f:Lg0/c;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic q(LD0/d;)Ld0/F;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return-object p0
.end method

.method public static synthetic r()Ljava/util/concurrent/Executor;
    .locals 1

    .line 1
    sget-object v0, LD0/d;->n:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic s(LD0/d;)LD0/q;
    .locals 0

    .line 1
    iget-object p0, p0, LD0/d;->c:LD0/q;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic t(LD0/d;Ld0/q;)Ld0/N;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LD0/d;->A(Ld0/q;)Ld0/N;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return-object p0
.end method

.method public static y(Ld0/h;)Ld0/h;
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Ld0/h;->g()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    return-object p0

    .line 11
    :cond_1
    :goto_0
    sget-object p0, Ld0/h;->h:Ld0/h;

    .line 12
    .line 13
    return-object p0
.end method


# virtual methods
.method public final A(Ld0/q;)Ld0/N;
    .locals 11

    .line 1
    iget v0, p0, LD0/d;->m:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    invoke-static {v0}, Lg0/a;->f(Z)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p1, Ld0/q;->A:Ld0/h;

    .line 12
    .line 13
    invoke-static {v0}, LD0/d;->y(Ld0/h;)Ld0/h;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget v1, v0, Ld0/h;->c:I

    .line 18
    .line 19
    const/4 v2, 0x7

    .line 20
    if-ne v1, v2, :cond_1

    .line 21
    .line 22
    sget v1, Lg0/M;->a:I

    .line 23
    .line 24
    const/16 v2, 0x22

    .line 25
    .line 26
    if-ge v1, v2, :cond_1

    .line 27
    .line 28
    invoke-virtual {v0}, Ld0/h;->a()Ld0/h$b;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const/4 v1, 0x6

    .line 33
    invoke-virtual {v0, v1}, Ld0/h$b;->e(I)Ld0/h$b;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Ld0/h$b;->a()Ld0/h;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    :cond_1
    move-object v3, v0

    .line 42
    iget-object v0, p0, LD0/d;->f:Lg0/c;

    .line 43
    .line 44
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-static {v1}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    check-cast v1, Landroid/os/Looper;

    .line 53
    .line 54
    const/4 v10, 0x0

    .line 55
    invoke-interface {v0, v1, v10}, Lg0/c;->e(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lg0/k;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iput-object v0, p0, LD0/d;->j:Lg0/k;

    .line 60
    .line 61
    :try_start_0
    iget-object v1, p0, LD0/d;->e:Ld0/F$a;

    .line 62
    .line 63
    iget-object v2, p0, LD0/d;->a:Landroid/content/Context;

    .line 64
    .line 65
    sget-object v4, Ld0/k;->a:Ld0/k;

    .line 66
    .line 67
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    new-instance v6, LD0/a;

    .line 71
    .line 72
    invoke-direct {v6, v0}, LD0/a;-><init>(Lg0/k;)V

    .line 73
    .line 74
    .line 75
    invoke-static {}, LX2/v;->Y()LX2/v;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    const-wide/16 v8, 0x0

    .line 80
    .line 81
    move-object v5, p0

    .line 82
    invoke-interface/range {v1 .. v9}, Ld0/F$a;->a(Landroid/content/Context;Ld0/h;Ld0/k;Ld0/O;Ljava/util/concurrent/Executor;Ljava/util/List;J)Ld0/F;

    .line 83
    .line 84
    .line 85
    iget-object v0, p0, LD0/d;->k:Landroid/util/Pair;

    .line 86
    .line 87
    if-eqz v0, :cond_2

    .line 88
    .line 89
    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v1, Landroid/view/Surface;

    .line 92
    .line 93
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v0, Lg0/A;

    .line 96
    .line 97
    invoke-virtual {v0}, Lg0/A;->b()I

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    invoke-virtual {v0}, Lg0/A;->a()I

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    invoke-virtual {p0, v1, v2, v0}, LD0/d;->E(Landroid/view/Surface;II)V
    :try_end_0
    .catch Ld0/M; {:try_start_0 .. :try_end_0} :catch_0

    .line 106
    .line 107
    .line 108
    goto :goto_1

    .line 109
    :catch_0
    move-exception v0

    .line 110
    goto :goto_2

    .line 111
    :cond_2
    :goto_1
    throw v10

    .line 112
    :goto_2
    new-instance v1, LD0/F$b;

    .line 113
    .line 114
    invoke-direct {v1, v0, p1}, LD0/F$b;-><init>(Ljava/lang/Throwable;Ld0/q;)V

    .line 115
    .line 116
    .line 117
    throw v1
.end method

.method public final B()Z
    .locals 2

    .line 1
    iget v0, p0, LD0/d;->m:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v1, 0x0

    .line 8
    :goto_0
    return v1
.end method

.method public final C()Z
    .locals 1

    .line 1
    iget v0, p0, LD0/d;->l:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LD0/d;->d:LD0/t;

    .line 6
    .line 7
    invoke-virtual {v0}, LD0/t;->e()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :goto_0
    return v0
.end method

.method public final E(Landroid/view/Surface;II)V
    .locals 0

    .line 1
    return-void
.end method

.method public F()V
    .locals 3

    .line 1
    iget v0, p0, LD0/d;->m:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget-object v0, p0, LD0/d;->j:Lg0/k;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-interface {v0, v2}, Lg0/k;->h(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    :cond_1
    iput-object v2, p0, LD0/d;->k:Landroid/util/Pair;

    .line 16
    .line 17
    iput v1, p0, LD0/d;->m:I

    .line 18
    .line 19
    return-void
.end method

.method public G(JJ)V
    .locals 1

    .line 1
    iget v0, p0, LD0/d;->l:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LD0/d;->d:LD0/t;

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2, p3, p4}, LD0/t;->h(JJ)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public H(Landroid/view/Surface;Lg0/A;)V
    .locals 1

    .line 1
    iget-object v0, p0, LD0/d;->k:Landroid/util/Pair;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Landroid/view/Surface;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, LD0/d;->k:Landroid/util/Pair;

    .line 16
    .line 17
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Lg0/A;

    .line 20
    .line 21
    invoke-virtual {v0, p2}, Lg0/A;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    invoke-static {p1, p2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, LD0/d;->k:Landroid/util/Pair;

    .line 33
    .line 34
    invoke-virtual {p2}, Lg0/A;->b()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    invoke-virtual {p2}, Lg0/A;->a()I

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    invoke-virtual {p0, p1, v0, p2}, LD0/d;->E(Landroid/view/Surface;II)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final I(F)V
    .locals 1

    .line 1
    iget-object v0, p0, LD0/d;->d:LD0/t;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LD0/t;->j(F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final J(LD0/p;)V
    .locals 0

    .line 1
    iput-object p1, p0, LD0/d;->i:LD0/p;

    .line 2
    .line 3
    return-void
.end method

.method public a()LD0/q;
    .locals 1

    .line 1
    iget-object v0, p0, LD0/d;->c:LD0/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()LD0/F;
    .locals 1

    .line 1
    iget-object v0, p0, LD0/d;->b:LD0/d$h;

    .line 2
    .line 3
    return-object v0
.end method

.method public u(LD0/d$d;)V
    .locals 1

    .line 1
    iget-object v0, p0, LD0/d;->g:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public v()V
    .locals 3

    .line 1
    sget-object v0, Lg0/A;->c:Lg0/A;

    .line 2
    .line 3
    invoke-virtual {v0}, Lg0/A;->b()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {v0}, Lg0/A;->a()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-virtual {p0, v2, v1, v0}, LD0/d;->E(Landroid/view/Surface;II)V

    .line 13
    .line 14
    .line 15
    iput-object v2, p0, LD0/d;->k:Landroid/util/Pair;

    .line 16
    .line 17
    return-void
.end method

.method public final w()V
    .locals 2

    .line 1
    invoke-virtual {p0}, LD0/d;->B()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p0, LD0/d;->l:I

    .line 9
    .line 10
    add-int/lit8 v0, v0, 0x1

    .line 11
    .line 12
    iput v0, p0, LD0/d;->l:I

    .line 13
    .line 14
    iget-object v0, p0, LD0/d;->d:LD0/t;

    .line 15
    .line 16
    invoke-virtual {v0}, LD0/t;->b()V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, LD0/d;->j:Lg0/k;

    .line 20
    .line 21
    invoke-static {v0}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lg0/k;

    .line 26
    .line 27
    new-instance v1, LD0/c;

    .line 28
    .line 29
    invoke-direct {v1, p0}, LD0/c;-><init>(LD0/d;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {v0, v1}, Lg0/k;->j(Ljava/lang/Runnable;)Z

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final x()V
    .locals 2

    .line 1
    iget v0, p0, LD0/d;->l:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    iput v0, p0, LD0/d;->l:I

    .line 6
    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    if-ltz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, LD0/d;->d:LD0/t;

    .line 13
    .line 14
    invoke-virtual {v0}, LD0/t;->b()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    iget v1, p0, LD0/d;->l:I

    .line 21
    .line 22
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw v0
.end method

.method public final z(J)Z
    .locals 1

    .line 1
    iget v0, p0, LD0/d;->l:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LD0/d;->d:LD0/t;

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2}, LD0/t;->d(J)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

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
    return p1
.end method
