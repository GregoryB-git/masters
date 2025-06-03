.class public Lio/flutter/plugin/editing/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/editing/m$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugin/editing/C$c;,
        Lio/flutter/plugin/editing/C$d;
    }
.end annotation


# instance fields
.field public final a:Landroid/view/View;

.field public final b:Landroid/view/inputmethod/InputMethodManager;

.field public final c:Landroid/view/autofill/AutofillManager;

.field public final d:LD5/w;

.field public e:Lio/flutter/plugin/editing/C$c;

.field public f:LD5/w$b;

.field public g:Landroid/util/SparseArray;

.field public h:Lio/flutter/plugin/editing/m;

.field public i:Z

.field public j:Landroid/view/inputmethod/InputConnection;

.field public k:Lio/flutter/plugin/platform/r;

.field public l:Landroid/graphics/Rect;

.field public m:Lio/flutter/plugin/editing/ImeSyncDeferringInsetsCallback;

.field public n:LD5/w$e;

.field public o:Z


# direct methods
.method public constructor <init>(Landroid/view/View;LD5/w;Lio/flutter/plugin/platform/r;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lio/flutter/plugin/editing/C$c;

    .line 5
    .line 6
    sget-object v1, Lio/flutter/plugin/editing/C$c$a;->o:Lio/flutter/plugin/editing/C$c$a;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-direct {v0, v1, v2}, Lio/flutter/plugin/editing/C$c;-><init>(Lio/flutter/plugin/editing/C$c$a;I)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lio/flutter/plugin/editing/C;->e:Lio/flutter/plugin/editing/C$c;

    .line 13
    .line 14
    iput-object p1, p0, Lio/flutter/plugin/editing/C;->a:Landroid/view/View;

    .line 15
    .line 16
    new-instance v0, Lio/flutter/plugin/editing/m;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-direct {v0, v1, p1}, Lio/flutter/plugin/editing/m;-><init>(LD5/w$e;Landroid/view/View;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lio/flutter/plugin/editing/C;->h:Lio/flutter/plugin/editing/m;

    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const-string v2, "input_method"

    .line 29
    .line 30
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 35
    .line 36
    iput-object v0, p0, Lio/flutter/plugin/editing/C;->b:Landroid/view/inputmethod/InputMethodManager;

    .line 37
    .line 38
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 39
    .line 40
    const/16 v2, 0x1a

    .line 41
    .line 42
    if-lt v0, v2, :cond_0

    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-static {}, LO1/J;->a()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-static {v1}, LO1/K;->a(Ljava/lang/Object;)Landroid/view/autofill/AutofillManager;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    :cond_0
    iput-object v1, p0, Lio/flutter/plugin/editing/C;->c:Landroid/view/autofill/AutofillManager;

    .line 61
    .line 62
    const/16 v1, 0x1e

    .line 63
    .line 64
    if-lt v0, v1, :cond_1

    .line 65
    .line 66
    new-instance v0, Lio/flutter/plugin/editing/ImeSyncDeferringInsetsCallback;

    .line 67
    .line 68
    invoke-direct {v0, p1}, Lio/flutter/plugin/editing/ImeSyncDeferringInsetsCallback;-><init>(Landroid/view/View;)V

    .line 69
    .line 70
    .line 71
    iput-object v0, p0, Lio/flutter/plugin/editing/C;->m:Lio/flutter/plugin/editing/ImeSyncDeferringInsetsCallback;

    .line 72
    .line 73
    invoke-virtual {v0}, Lio/flutter/plugin/editing/ImeSyncDeferringInsetsCallback;->install()V

    .line 74
    .line 75
    .line 76
    :cond_1
    iput-object p2, p0, Lio/flutter/plugin/editing/C;->d:LD5/w;

    .line 77
    .line 78
    new-instance p1, Lio/flutter/plugin/editing/C$a;

    .line 79
    .line 80
    invoke-direct {p1, p0}, Lio/flutter/plugin/editing/C$a;-><init>(Lio/flutter/plugin/editing/C;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p2, p1}, LD5/w;->n(LD5/w$f;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p2}, LD5/w;->k()V

    .line 87
    .line 88
    .line 89
    iput-object p3, p0, Lio/flutter/plugin/editing/C;->k:Lio/flutter/plugin/platform/r;

    .line 90
    .line 91
    invoke-virtual {p3, p0}, Lio/flutter/plugin/platform/r;->v(Lio/flutter/plugin/editing/C;)V

    .line 92
    .line 93
    .line 94
    return-void
.end method

.method public static synthetic b(Lio/flutter/plugin/editing/C;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/flutter/plugin/editing/C;->a:Landroid/view/View;

    return-object p0
.end method

.method public static synthetic c(Lio/flutter/plugin/editing/C;)Lio/flutter/plugin/editing/C$c;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/flutter/plugin/editing/C;->e:Lio/flutter/plugin/editing/C$c;

    return-object p0
.end method

.method public static synthetic d(Lio/flutter/plugin/editing/C;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lio/flutter/plugin/editing/C;->w()V

    return-void
.end method

.method public static synthetic e(Lio/flutter/plugin/editing/C;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lio/flutter/plugin/editing/C;->q(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic f(Lio/flutter/plugin/editing/C;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lio/flutter/plugin/editing/C;->v()V

    return-void
.end method

.method public static synthetic g(Lio/flutter/plugin/editing/C;)Landroid/view/autofill/AutofillManager;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/flutter/plugin/editing/C;->c:Landroid/view/autofill/AutofillManager;

    return-object p0
.end method

.method public static synthetic h(Lio/flutter/plugin/editing/C;IZ)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/flutter/plugin/editing/C;->A(IZ)V

    return-void
.end method

.method public static synthetic i(Lio/flutter/plugin/editing/C;DD[D)V
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p5}, Lio/flutter/plugin/editing/C;->y(DD[D)V

    return-void
.end method

.method public static l(LD5/w$e;LD5/w$e;)Z
    .locals 7

    .line 1
    iget v0, p0, LD5/w$e;->e:I

    .line 2
    .line 3
    iget v1, p0, LD5/w$e;->d:I

    .line 4
    .line 5
    sub-int/2addr v0, v1

    .line 6
    iget v1, p1, LD5/w$e;->e:I

    .line 7
    .line 8
    iget v2, p1, LD5/w$e;->d:I

    .line 9
    .line 10
    sub-int/2addr v1, v2

    .line 11
    const/4 v2, 0x1

    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    return v2

    .line 15
    :cond_0
    const/4 v1, 0x0

    .line 16
    move v3, v1

    .line 17
    :goto_0
    if-ge v3, v0, :cond_2

    .line 18
    .line 19
    iget-object v4, p0, LD5/w$e;->a:Ljava/lang/String;

    .line 20
    .line 21
    iget v5, p0, LD5/w$e;->d:I

    .line 22
    .line 23
    add-int/2addr v5, v3

    .line 24
    invoke-virtual {v4, v5}, Ljava/lang/String;->charAt(I)C

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    iget-object v5, p1, LD5/w$e;->a:Ljava/lang/String;

    .line 29
    .line 30
    iget v6, p1, LD5/w$e;->d:I

    .line 31
    .line 32
    add-int/2addr v6, v3

    .line 33
    invoke-virtual {v5, v6}, Ljava/lang/String;->charAt(I)C

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-eq v4, v5, :cond_1

    .line 38
    .line 39
    return v2

    .line 40
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    return v1
.end method

.method public static r(LD5/w$c;ZZZZLD5/w$d;)I
    .locals 1

    .line 1
    iget-object p4, p0, LD5/w$c;->a:LD5/w$g;

    .line 2
    .line 3
    sget-object v0, LD5/w$g;->q:LD5/w$g;

    .line 4
    .line 5
    if-ne p4, v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x4

    .line 8
    return p0

    .line 9
    :cond_0
    sget-object v0, LD5/w$g;->t:LD5/w$g;

    .line 10
    .line 11
    if-ne p4, v0, :cond_3

    .line 12
    .line 13
    iget-boolean p1, p0, LD5/w$c;->b:Z

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    const/16 p1, 0x1002

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 p1, 0x2

    .line 21
    :goto_0
    iget-boolean p0, p0, LD5/w$c;->c:Z

    .line 22
    .line 23
    if-eqz p0, :cond_2

    .line 24
    .line 25
    or-int/lit16 p1, p1, 0x2000

    .line 26
    .line 27
    :cond_2
    return p1

    .line 28
    :cond_3
    sget-object p0, LD5/w$g;->u:LD5/w$g;

    .line 29
    .line 30
    if-ne p4, p0, :cond_4

    .line 31
    .line 32
    const/4 p0, 0x3

    .line 33
    return p0

    .line 34
    :cond_4
    sget-object p0, LD5/w$g;->z:LD5/w$g;

    .line 35
    .line 36
    if-ne p4, p0, :cond_5

    .line 37
    .line 38
    const/4 p0, 0x0

    .line 39
    return p0

    .line 40
    :cond_5
    sget-object p0, LD5/w$g;->v:LD5/w$g;

    .line 41
    .line 42
    if-ne p4, p0, :cond_6

    .line 43
    .line 44
    const p0, 0x20001

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_6
    sget-object p0, LD5/w$g;->w:LD5/w$g;

    .line 49
    .line 50
    if-ne p4, p0, :cond_7

    .line 51
    .line 52
    const/16 p0, 0x21

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_7
    sget-object p0, LD5/w$g;->x:LD5/w$g;

    .line 56
    .line 57
    if-ne p4, p0, :cond_8

    .line 58
    .line 59
    const/16 p0, 0x11

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_8
    sget-object p0, LD5/w$g;->y:LD5/w$g;

    .line 63
    .line 64
    if-ne p4, p0, :cond_9

    .line 65
    .line 66
    const/16 p0, 0x91

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_9
    sget-object p0, LD5/w$g;->r:LD5/w$g;

    .line 70
    .line 71
    if-ne p4, p0, :cond_a

    .line 72
    .line 73
    const/16 p0, 0x61

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_a
    sget-object p0, LD5/w$g;->s:LD5/w$g;

    .line 77
    .line 78
    if-ne p4, p0, :cond_b

    .line 79
    .line 80
    const/16 p0, 0x71

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_b
    const/4 p0, 0x1

    .line 84
    :goto_1
    if-eqz p1, :cond_c

    .line 85
    .line 86
    const p1, 0x80080

    .line 87
    .line 88
    .line 89
    :goto_2
    or-int/2addr p0, p1

    .line 90
    goto :goto_3

    .line 91
    :cond_c
    if-eqz p2, :cond_d

    .line 92
    .line 93
    const p1, 0x8000

    .line 94
    .line 95
    .line 96
    or-int/2addr p0, p1

    .line 97
    :cond_d
    if-nez p3, :cond_e

    .line 98
    .line 99
    const p1, 0x80090

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_e
    :goto_3
    sget-object p1, LD5/w$d;->p:LD5/w$d;

    .line 104
    .line 105
    if-ne p5, p1, :cond_f

    .line 106
    .line 107
    or-int/lit16 p0, p0, 0x1000

    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_f
    sget-object p1, LD5/w$d;->q:LD5/w$d;

    .line 111
    .line 112
    if-ne p5, p1, :cond_10

    .line 113
    .line 114
    or-int/lit16 p0, p0, 0x2000

    .line 115
    .line 116
    goto :goto_4

    .line 117
    :cond_10
    sget-object p1, LD5/w$d;->r:LD5/w$d;

    .line 118
    .line 119
    if-ne p5, p1, :cond_11

    .line 120
    .line 121
    or-int/lit16 p0, p0, 0x4000

    .line 122
    .line 123
    :cond_11
    :goto_4
    return p0
.end method


# virtual methods
.method public final A(IZ)V
    .locals 1

    .line 1
    if-eqz p2, :cond_0

    iget-object p2, p0, Lio/flutter/plugin/editing/C;->a:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->requestFocus()Z

    new-instance p2, Lio/flutter/plugin/editing/C$c;

    sget-object v0, Lio/flutter/plugin/editing/C$c$a;->q:Lio/flutter/plugin/editing/C$c$a;

    invoke-direct {p2, v0, p1}, Lio/flutter/plugin/editing/C$c;-><init>(Lio/flutter/plugin/editing/C$c$a;I)V

    iput-object p2, p0, Lio/flutter/plugin/editing/C;->e:Lio/flutter/plugin/editing/C$c;

    iget-object p1, p0, Lio/flutter/plugin/editing/C;->b:Landroid/view/inputmethod/InputMethodManager;

    iget-object p2, p0, Lio/flutter/plugin/editing/C;->a:Landroid/view/View;

    invoke-virtual {p1, p2}, Landroid/view/inputmethod/InputMethodManager;->restartInput(Landroid/view/View;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lio/flutter/plugin/editing/C;->i:Z

    goto :goto_0

    :cond_0
    new-instance p2, Lio/flutter/plugin/editing/C$c;

    sget-object v0, Lio/flutter/plugin/editing/C$c$a;->r:Lio/flutter/plugin/editing/C$c$a;

    invoke-direct {p2, v0, p1}, Lio/flutter/plugin/editing/C$c;-><init>(Lio/flutter/plugin/editing/C$c$a;I)V

    iput-object p2, p0, Lio/flutter/plugin/editing/C;->e:Lio/flutter/plugin/editing/C$c;

    const/4 p1, 0x0

    iput-object p1, p0, Lio/flutter/plugin/editing/C;->j:Landroid/view/inputmethod/InputConnection;

    :goto_0
    return-void
.end method

.method public B(ILD5/w$b;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lio/flutter/plugin/editing/C;->w()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lio/flutter/plugin/editing/C;->f:LD5/w$b;

    .line 5
    .line 6
    new-instance v0, Lio/flutter/plugin/editing/C$c;

    .line 7
    .line 8
    sget-object v1, Lio/flutter/plugin/editing/C$c$a;->p:Lio/flutter/plugin/editing/C$c$a;

    .line 9
    .line 10
    invoke-direct {v0, v1, p1}, Lio/flutter/plugin/editing/C$c;-><init>(Lio/flutter/plugin/editing/C$c$a;I)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lio/flutter/plugin/editing/C;->e:Lio/flutter/plugin/editing/C$c;

    .line 14
    .line 15
    iget-object p1, p0, Lio/flutter/plugin/editing/C;->h:Lio/flutter/plugin/editing/m;

    .line 16
    .line 17
    invoke-virtual {p1, p0}, Lio/flutter/plugin/editing/m;->l(Lio/flutter/plugin/editing/m$b;)V

    .line 18
    .line 19
    .line 20
    new-instance p1, Lio/flutter/plugin/editing/m;

    .line 21
    .line 22
    iget-object v0, p2, LD5/w$b;->j:LD5/w$b$a;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget-object v0, v0, LD5/w$b$a;->c:LD5/w$e;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move-object v0, v1

    .line 31
    :goto_0
    iget-object v2, p0, Lio/flutter/plugin/editing/C;->a:Landroid/view/View;

    .line 32
    .line 33
    invoke-direct {p1, v0, v2}, Lio/flutter/plugin/editing/m;-><init>(LD5/w$e;Landroid/view/View;)V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Lio/flutter/plugin/editing/C;->h:Lio/flutter/plugin/editing/m;

    .line 37
    .line 38
    invoke-virtual {p0, p2}, Lio/flutter/plugin/editing/C;->F(LD5/w$b;)V

    .line 39
    .line 40
    .line 41
    const/4 p1, 0x1

    .line 42
    iput-boolean p1, p0, Lio/flutter/plugin/editing/C;->i:Z

    .line 43
    .line 44
    invoke-virtual {p0}, Lio/flutter/plugin/editing/C;->E()V

    .line 45
    .line 46
    .line 47
    iput-object v1, p0, Lio/flutter/plugin/editing/C;->l:Landroid/graphics/Rect;

    .line 48
    .line 49
    iget-object p1, p0, Lio/flutter/plugin/editing/C;->h:Lio/flutter/plugin/editing/m;

    .line 50
    .line 51
    invoke-virtual {p1, p0}, Lio/flutter/plugin/editing/m;->a(Lio/flutter/plugin/editing/m$b;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public C(Landroid/view/View;LD5/w$e;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lio/flutter/plugin/editing/C;->i:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lio/flutter/plugin/editing/C;->n:LD5/w$e;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, LD5/w$e;->b()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lio/flutter/plugin/editing/C;->n:LD5/w$e;

    .line 16
    .line 17
    invoke-static {v0, p2}, Lio/flutter/plugin/editing/C;->l(LD5/w$e;LD5/w$e;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iput-boolean v0, p0, Lio/flutter/plugin/editing/C;->i:Z

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    const-string v0, "TextInputPlugin"

    .line 26
    .line 27
    const-string v1, "Composing region changed by the framework. Restarting the input method."

    .line 28
    .line 29
    invoke-static {v0, v1}, Lt5/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    iput-object p2, p0, Lio/flutter/plugin/editing/C;->n:LD5/w$e;

    .line 33
    .line 34
    iget-object v0, p0, Lio/flutter/plugin/editing/C;->h:Lio/flutter/plugin/editing/m;

    .line 35
    .line 36
    invoke-virtual {v0, p2}, Lio/flutter/plugin/editing/m;->n(LD5/w$e;)V

    .line 37
    .line 38
    .line 39
    iget-boolean p2, p0, Lio/flutter/plugin/editing/C;->i:Z

    .line 40
    .line 41
    if-eqz p2, :cond_1

    .line 42
    .line 43
    iget-object p2, p0, Lio/flutter/plugin/editing/C;->b:Landroid/view/inputmethod/InputMethodManager;

    .line 44
    .line 45
    invoke-virtual {p2, p1}, Landroid/view/inputmethod/InputMethodManager;->restartInput(Landroid/view/View;)V

    .line 46
    .line 47
    .line 48
    const/4 p1, 0x0

    .line 49
    iput-boolean p1, p0, Lio/flutter/plugin/editing/C;->i:Z

    .line 50
    .line 51
    :cond_1
    return-void
.end method

.method public D(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/editing/C;->f:LD5/w$b;

    if-eqz v0, :cond_1

    iget-object v0, v0, LD5/w$b;->g:LD5/w$c;

    if-eqz v0, :cond_1

    iget-object v0, v0, LD5/w$c;->a:LD5/w$g;

    sget-object v1, LD5/w$g;->z:LD5/w$g;

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lio/flutter/plugin/editing/C;->q(Landroid/view/View;)V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    iget-object v0, p0, Lio/flutter/plugin/editing/C;->b:Landroid/view/inputmethod/InputMethodManager;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    :goto_1
    return-void
.end method

.method public E()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/editing/C;->e:Lio/flutter/plugin/editing/C$c;

    iget-object v0, v0, Lio/flutter/plugin/editing/C$c;->a:Lio/flutter/plugin/editing/C$c$a;

    sget-object v1, Lio/flutter/plugin/editing/C$c$a;->q:Lio/flutter/plugin/editing/C$c$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/flutter/plugin/editing/C;->o:Z

    :cond_0
    return-void
.end method

.method public final F(LD5/w$b;)V
    .locals 6

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    if-eqz p1, :cond_5

    .line 9
    .line 10
    iget-object v0, p1, LD5/w$b;->j:LD5/w$b$a;

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    goto :goto_2

    .line 15
    :cond_1
    iget-object v0, p1, LD5/w$b;->l:[LD5/w$b;

    .line 16
    .line 17
    new-instance v1, Landroid/util/SparseArray;

    .line 18
    .line 19
    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v1, p0, Lio/flutter/plugin/editing/C;->g:Landroid/util/SparseArray;

    .line 23
    .line 24
    if-nez v0, :cond_2

    .line 25
    .line 26
    iget-object v0, p1, LD5/w$b;->j:LD5/w$b$a;

    .line 27
    .line 28
    iget-object v0, v0, LD5/w$b$a;->a:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-virtual {v1, v0, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    array-length p1, v0

    .line 39
    const/4 v1, 0x0

    .line 40
    :goto_0
    if-ge v1, p1, :cond_4

    .line 41
    .line 42
    aget-object v2, v0, v1

    .line 43
    .line 44
    iget-object v3, v2, LD5/w$b;->j:LD5/w$b$a;

    .line 45
    .line 46
    if-eqz v3, :cond_3

    .line 47
    .line 48
    iget-object v4, p0, Lio/flutter/plugin/editing/C;->g:Landroid/util/SparseArray;

    .line 49
    .line 50
    iget-object v5, v3, LD5/w$b$a;->a:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    invoke-virtual {v4, v5, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iget-object v2, p0, Lio/flutter/plugin/editing/C;->c:Landroid/view/autofill/AutofillManager;

    .line 60
    .line 61
    iget-object v4, p0, Lio/flutter/plugin/editing/C;->a:Landroid/view/View;

    .line 62
    .line 63
    iget-object v5, v3, LD5/w$b$a;->a:Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    iget-object v3, v3, LD5/w$b$a;->c:LD5/w$e;

    .line 70
    .line 71
    iget-object v3, v3, LD5/w$e;->a:Ljava/lang/String;

    .line 72
    .line 73
    invoke-static {v3}, Lio/flutter/plugin/editing/v;->a(Ljava/lang/CharSequence;)Landroid/view/autofill/AutofillValue;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-static {v2, v4, v5, v3}, Lio/flutter/plugin/editing/q;->a(Landroid/view/autofill/AutofillManager;Landroid/view/View;ILandroid/view/autofill/AutofillValue;)V

    .line 78
    .line 79
    .line 80
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_4
    :goto_1
    return-void

    .line 84
    :cond_5
    :goto_2
    const/4 p1, 0x0

    .line 85
    iput-object p1, p0, Lio/flutter/plugin/editing/C;->g:Landroid/util/SparseArray;

    .line 86
    .line 87
    return-void
.end method

.method public a(ZZZ)V
    .locals 8

    .line 1
    if-eqz p1, :cond_0

    iget-object p1, p0, Lio/flutter/plugin/editing/C;->h:Lio/flutter/plugin/editing/m;

    invoke-virtual {p1}, Lio/flutter/plugin/editing/m;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/flutter/plugin/editing/C;->u(Ljava/lang/String;)V

    :cond_0
    iget-object p1, p0, Lio/flutter/plugin/editing/C;->h:Lio/flutter/plugin/editing/m;

    invoke-virtual {p1}, Lio/flutter/plugin/editing/m;->i()I

    move-result p1

    iget-object p2, p0, Lio/flutter/plugin/editing/C;->h:Lio/flutter/plugin/editing/m;

    invoke-virtual {p2}, Lio/flutter/plugin/editing/m;->h()I

    move-result p2

    iget-object p3, p0, Lio/flutter/plugin/editing/C;->h:Lio/flutter/plugin/editing/m;

    invoke-virtual {p3}, Lio/flutter/plugin/editing/m;->g()I

    move-result p3

    iget-object v0, p0, Lio/flutter/plugin/editing/C;->h:Lio/flutter/plugin/editing/m;

    invoke-virtual {v0}, Lio/flutter/plugin/editing/m;->f()I

    move-result v7

    iget-object v0, p0, Lio/flutter/plugin/editing/C;->h:Lio/flutter/plugin/editing/m;

    invoke-virtual {v0}, Lio/flutter/plugin/editing/m;->e()Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lio/flutter/plugin/editing/C;->n:LD5/w$e;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lio/flutter/plugin/editing/C;->h:Lio/flutter/plugin/editing/m;

    invoke-virtual {v1}, Lio/flutter/plugin/editing/m;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/flutter/plugin/editing/C;->n:LD5/w$e;

    iget-object v2, v2, LD5/w$e;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lio/flutter/plugin/editing/C;->n:LD5/w$e;

    iget v2, v1, LD5/w$e;->b:I

    if-ne p1, v2, :cond_1

    iget v2, v1, LD5/w$e;->c:I

    if-ne p2, v2, :cond_1

    iget v2, v1, LD5/w$e;->d:I

    if-ne p3, v2, :cond_1

    iget v1, v1, LD5/w$e;->e:I

    if-ne v7, v1, :cond_1

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "send EditingState to flutter: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lio/flutter/plugin/editing/C;->h:Lio/flutter/plugin/editing/m;

    invoke-virtual {v2}, Lio/flutter/plugin/editing/m;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "TextInputPlugin"

    invoke-static {v2, v1}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lio/flutter/plugin/editing/C;->f:LD5/w$b;

    iget-boolean v1, v1, LD5/w$b;->e:Z

    if-eqz v1, :cond_2

    iget-object v1, p0, Lio/flutter/plugin/editing/C;->d:LD5/w;

    iget-object v2, p0, Lio/flutter/plugin/editing/C;->e:Lio/flutter/plugin/editing/C$c;

    iget v2, v2, Lio/flutter/plugin/editing/C$c;->b:I

    invoke-virtual {v1, v2, v0}, LD5/w;->q(ILjava/util/ArrayList;)V

    iget-object v0, p0, Lio/flutter/plugin/editing/C;->h:Lio/flutter/plugin/editing/m;

    invoke-virtual {v0}, Lio/flutter/plugin/editing/m;->c()V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lio/flutter/plugin/editing/C;->d:LD5/w;

    iget-object v1, p0, Lio/flutter/plugin/editing/C;->e:Lio/flutter/plugin/editing/C$c;

    iget v1, v1, Lio/flutter/plugin/editing/C$c;->b:I

    iget-object v2, p0, Lio/flutter/plugin/editing/C;->h:Lio/flutter/plugin/editing/m;

    invoke-virtual {v2}, Lio/flutter/plugin/editing/m;->toString()Ljava/lang/String;

    move-result-object v2

    move v3, p1

    move v4, p2

    move v5, p3

    move v6, v7

    invoke-virtual/range {v0 .. v6}, LD5/w;->p(ILjava/lang/String;IIII)V

    :goto_0
    new-instance v6, LD5/w$e;

    iget-object v0, p0, Lio/flutter/plugin/editing/C;->h:Lio/flutter/plugin/editing/m;

    invoke-virtual {v0}, Lio/flutter/plugin/editing/m;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v0, v6

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, v7

    invoke-direct/range {v0 .. v5}, LD5/w$e;-><init>(Ljava/lang/String;IIII)V

    iput-object v6, p0, Lio/flutter/plugin/editing/C;->n:LD5/w$e;

    goto :goto_2

    :cond_3
    :goto_1
    iget-object p1, p0, Lio/flutter/plugin/editing/C;->h:Lio/flutter/plugin/editing/m;

    invoke-virtual {p1}, Lio/flutter/plugin/editing/m;->c()V

    :goto_2
    return-void
.end method

.method public j(Landroid/util/SparseArray;)V
    .locals 11

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-ge v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/flutter/plugin/editing/C;->f:LD5/w$b;

    if-eqz v0, :cond_6

    iget-object v1, p0, Lio/flutter/plugin/editing/C;->g:Landroid/util/SparseArray;

    if-eqz v1, :cond_6

    iget-object v0, v0, LD5/w$b;->j:LD5/w$b$a;

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const/4 v2, 0x0

    :goto_0
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result v3

    if-ge v2, v3, :cond_5

    invoke-virtual {p1, v2}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v3

    iget-object v4, p0, Lio/flutter/plugin/editing/C;->g:Landroid/util/SparseArray;

    invoke-virtual {v4, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LD5/w$b;

    if-eqz v3, :cond_4

    iget-object v3, v3, LD5/w$b;->j:LD5/w$b$a;

    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p1, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lio/flutter/plugin/editing/x;->a(Ljava/lang/Object;)Landroid/view/autofill/AutofillValue;

    move-result-object v4

    invoke-static {v4}, Lio/flutter/plugin/editing/y;->a(Landroid/view/autofill/AutofillValue;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v6

    new-instance v4, LD5/w$e;

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v7

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v8

    const/4 v9, -0x1

    const/4 v10, -0x1

    move-object v5, v4

    invoke-direct/range {v5 .. v10}, LD5/w$e;-><init>(Ljava/lang/String;IIII)V

    iget-object v5, v3, LD5/w$b$a;->a:Ljava/lang/String;

    iget-object v6, v0, LD5/w$b$a;->a:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    iget-object v3, p0, Lio/flutter/plugin/editing/C;->h:Lio/flutter/plugin/editing/m;

    invoke-virtual {v3, v4}, Lio/flutter/plugin/editing/m;->n(LD5/w$e;)V

    goto :goto_1

    :cond_3
    iget-object v3, v3, LD5/w$b$a;->a:Ljava/lang/String;

    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_5
    iget-object p1, p0, Lio/flutter/plugin/editing/C;->d:LD5/w;

    iget-object v0, p0, Lio/flutter/plugin/editing/C;->e:Lio/flutter/plugin/editing/C$c;

    iget v0, v0, Lio/flutter/plugin/editing/C$c;->b:I

    invoke-virtual {p1, v0, v1}, LD5/w;->r(ILjava/util/HashMap;)V

    :cond_6
    :goto_2
    return-void
.end method

.method public k()V
    .locals 4

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/editing/C;->e:Lio/flutter/plugin/editing/C$c;

    iget-object v0, v0, Lio/flutter/plugin/editing/C$c;->a:Lio/flutter/plugin/editing/C$c$a;

    sget-object v1, Lio/flutter/plugin/editing/C$c$a;->q:Lio/flutter/plugin/editing/C$c$a;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/flutter/plugin/editing/C;->h:Lio/flutter/plugin/editing/m;

    invoke-virtual {v0, p0}, Lio/flutter/plugin/editing/m;->l(Lio/flutter/plugin/editing/m$b;)V

    invoke-virtual {p0}, Lio/flutter/plugin/editing/C;->w()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/flutter/plugin/editing/C;->f:LD5/w$b;

    invoke-virtual {p0, v0}, Lio/flutter/plugin/editing/C;->F(LD5/w$b;)V

    new-instance v1, Lio/flutter/plugin/editing/C$c;

    sget-object v2, Lio/flutter/plugin/editing/C$c$a;->o:Lio/flutter/plugin/editing/C$c$a;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lio/flutter/plugin/editing/C$c;-><init>(Lio/flutter/plugin/editing/C$c$a;I)V

    iput-object v1, p0, Lio/flutter/plugin/editing/C;->e:Lio/flutter/plugin/editing/C$c;

    invoke-virtual {p0}, Lio/flutter/plugin/editing/C;->E()V

    iput-object v0, p0, Lio/flutter/plugin/editing/C;->l:Landroid/graphics/Rect;

    iget-object v0, p0, Lio/flutter/plugin/editing/C;->b:Landroid/view/inputmethod/InputMethodManager;

    iget-object v1, p0, Lio/flutter/plugin/editing/C;->a:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/inputmethod/InputMethodManager;->restartInput(Landroid/view/View;)V

    return-void
.end method

.method public m(Landroid/view/View;Lu5/L;Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 8

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/editing/C;->e:Lio/flutter/plugin/editing/C$c;

    .line 2
    .line 3
    iget-object v1, v0, Lio/flutter/plugin/editing/C$c;->a:Lio/flutter/plugin/editing/C$c$a;

    .line 4
    .line 5
    sget-object v2, Lio/flutter/plugin/editing/C$c$a;->o:Lio/flutter/plugin/editing/C$c$a;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    iput-object v3, p0, Lio/flutter/plugin/editing/C;->j:Landroid/view/inputmethod/InputConnection;

    .line 11
    .line 12
    return-object v3

    .line 13
    :cond_0
    sget-object v2, Lio/flutter/plugin/editing/C$c$a;->r:Lio/flutter/plugin/editing/C$c$a;

    .line 14
    .line 15
    if-ne v1, v2, :cond_1

    .line 16
    .line 17
    return-object v3

    .line 18
    :cond_1
    sget-object v2, Lio/flutter/plugin/editing/C$c$a;->q:Lio/flutter/plugin/editing/C$c$a;

    .line 19
    .line 20
    if-ne v1, v2, :cond_3

    .line 21
    .line 22
    iget-boolean p1, p0, Lio/flutter/plugin/editing/C;->o:Z

    .line 23
    .line 24
    if-eqz p1, :cond_2

    .line 25
    .line 26
    iget-object p1, p0, Lio/flutter/plugin/editing/C;->j:Landroid/view/inputmethod/InputConnection;

    .line 27
    .line 28
    return-object p1

    .line 29
    :cond_2
    iget-object p1, p0, Lio/flutter/plugin/editing/C;->k:Lio/flutter/plugin/platform/r;

    .line 30
    .line 31
    iget p2, v0, Lio/flutter/plugin/editing/C$c;->b:I

    .line 32
    .line 33
    invoke-virtual {p1, p2}, Lio/flutter/plugin/platform/r;->c(I)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1, p3}, Landroid/view/View;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iput-object p1, p0, Lio/flutter/plugin/editing/C;->j:Landroid/view/inputmethod/InputConnection;

    .line 42
    .line 43
    return-object p1

    .line 44
    :cond_3
    iget-object v0, p0, Lio/flutter/plugin/editing/C;->f:LD5/w$b;

    .line 45
    .line 46
    iget-object v1, v0, LD5/w$b;->g:LD5/w$c;

    .line 47
    .line 48
    iget-boolean v2, v0, LD5/w$b;->a:Z

    .line 49
    .line 50
    iget-boolean v3, v0, LD5/w$b;->b:Z

    .line 51
    .line 52
    iget-boolean v4, v0, LD5/w$b;->c:Z

    .line 53
    .line 54
    iget-boolean v5, v0, LD5/w$b;->d:Z

    .line 55
    .line 56
    iget-object v6, v0, LD5/w$b;->f:LD5/w$d;

    .line 57
    .line 58
    invoke-static/range {v1 .. v6}, Lio/flutter/plugin/editing/C;->r(LD5/w$c;ZZZZLD5/w$d;)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iput v0, p3, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 63
    .line 64
    const/high16 v1, 0x2000000

    .line 65
    .line 66
    iput v1, p3, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 67
    .line 68
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 69
    .line 70
    const/16 v3, 0x1a

    .line 71
    .line 72
    if-lt v2, v3, :cond_4

    .line 73
    .line 74
    iget-object v2, p0, Lio/flutter/plugin/editing/C;->f:LD5/w$b;

    .line 75
    .line 76
    iget-boolean v2, v2, LD5/w$b;->d:Z

    .line 77
    .line 78
    if-nez v2, :cond_4

    .line 79
    .line 80
    const/high16 v2, 0x1000000

    .line 81
    .line 82
    or-int/2addr v1, v2

    .line 83
    iput v1, p3, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 84
    .line 85
    :cond_4
    iget-object v1, p0, Lio/flutter/plugin/editing/C;->f:LD5/w$b;

    .line 86
    .line 87
    iget-object v1, v1, LD5/w$b;->h:Ljava/lang/Integer;

    .line 88
    .line 89
    if-nez v1, :cond_6

    .line 90
    .line 91
    const/high16 v1, 0x20000

    .line 92
    .line 93
    and-int/2addr v0, v1

    .line 94
    if-eqz v0, :cond_5

    .line 95
    .line 96
    const/4 v0, 0x1

    .line 97
    goto :goto_0

    .line 98
    :cond_5
    const/4 v0, 0x6

    .line 99
    goto :goto_0

    .line 100
    :cond_6
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    :goto_0
    iget-object v1, p0, Lio/flutter/plugin/editing/C;->f:LD5/w$b;

    .line 105
    .line 106
    iget-object v2, v1, LD5/w$b;->i:Ljava/lang/String;

    .line 107
    .line 108
    if-eqz v2, :cond_7

    .line 109
    .line 110
    iput-object v2, p3, Landroid/view/inputmethod/EditorInfo;->actionLabel:Ljava/lang/CharSequence;

    .line 111
    .line 112
    iput v0, p3, Landroid/view/inputmethod/EditorInfo;->actionId:I

    .line 113
    .line 114
    :cond_7
    iget v2, p3, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 115
    .line 116
    or-int/2addr v0, v2

    .line 117
    iput v0, p3, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 118
    .line 119
    iget-object v0, v1, LD5/w$b;->k:[Ljava/lang/String;

    .line 120
    .line 121
    if-eqz v0, :cond_8

    .line 122
    .line 123
    invoke-static {p3, v0}, LK/b;->a(Landroid/view/inputmethod/EditorInfo;[Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    :cond_8
    new-instance v0, Lio/flutter/plugin/editing/l;

    .line 127
    .line 128
    iget-object v1, p0, Lio/flutter/plugin/editing/C;->e:Lio/flutter/plugin/editing/C$c;

    .line 129
    .line 130
    iget v3, v1, Lio/flutter/plugin/editing/C$c;->b:I

    .line 131
    .line 132
    iget-object v4, p0, Lio/flutter/plugin/editing/C;->d:LD5/w;

    .line 133
    .line 134
    iget-object v6, p0, Lio/flutter/plugin/editing/C;->h:Lio/flutter/plugin/editing/m;

    .line 135
    .line 136
    move-object v1, v0

    .line 137
    move-object v2, p1

    .line 138
    move-object v5, p2

    .line 139
    move-object v7, p3

    .line 140
    invoke-direct/range {v1 .. v7}, Lio/flutter/plugin/editing/l;-><init>(Landroid/view/View;ILD5/w;Lio/flutter/plugin/editing/l$a;Lio/flutter/plugin/editing/m;Landroid/view/inputmethod/EditorInfo;)V

    .line 141
    .line 142
    .line 143
    iget-object p1, p0, Lio/flutter/plugin/editing/C;->h:Lio/flutter/plugin/editing/m;

    .line 144
    .line 145
    invoke-virtual {p1}, Lio/flutter/plugin/editing/m;->i()I

    .line 146
    .line 147
    .line 148
    move-result p1

    .line 149
    iput p1, p3, Landroid/view/inputmethod/EditorInfo;->initialSelStart:I

    .line 150
    .line 151
    iget-object p1, p0, Lio/flutter/plugin/editing/C;->h:Lio/flutter/plugin/editing/m;

    .line 152
    .line 153
    invoke-virtual {p1}, Lio/flutter/plugin/editing/m;->h()I

    .line 154
    .line 155
    .line 156
    move-result p1

    .line 157
    iput p1, p3, Landroid/view/inputmethod/EditorInfo;->initialSelEnd:I

    .line 158
    .line 159
    iput-object v0, p0, Lio/flutter/plugin/editing/C;->j:Landroid/view/inputmethod/InputConnection;

    .line 160
    .line 161
    return-object v0
.end method

.method public n()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/editing/C;->k:Lio/flutter/plugin/platform/r;

    invoke-virtual {v0}, Lio/flutter/plugin/platform/r;->G()V

    iget-object v0, p0, Lio/flutter/plugin/editing/C;->d:LD5/w;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LD5/w;->n(LD5/w$f;)V

    invoke-virtual {p0}, Lio/flutter/plugin/editing/C;->w()V

    iget-object v0, p0, Lio/flutter/plugin/editing/C;->h:Lio/flutter/plugin/editing/m;

    invoke-virtual {v0, p0}, Lio/flutter/plugin/editing/m;->l(Lio/flutter/plugin/editing/m$b;)V

    iget-object v0, p0, Lio/flutter/plugin/editing/C;->m:Lio/flutter/plugin/editing/ImeSyncDeferringInsetsCallback;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/flutter/plugin/editing/ImeSyncDeferringInsetsCallback;->remove()V

    :cond_0
    return-void
.end method

.method public o()Landroid/view/inputmethod/InputMethodManager;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/editing/C;->b:Landroid/view/inputmethod/InputMethodManager;

    return-object v0
.end method

.method public p(Landroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lio/flutter/plugin/editing/C;->o()Landroid/view/inputmethod/InputMethodManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/inputmethod/InputMethodManager;->isAcceptingText()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/flutter/plugin/editing/C;->j:Landroid/view/inputmethod/InputConnection;

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    instance-of v1, v0, Lio/flutter/plugin/editing/l;

    if-eqz v1, :cond_1

    check-cast v0, Lio/flutter/plugin/editing/l;

    invoke-virtual {v0, p1}, Lio/flutter/plugin/editing/l;->f(Landroid/view/KeyEvent;)Z

    move-result p1

    goto :goto_0

    :cond_1
    invoke-interface {v0, p1}, Landroid/view/inputmethod/InputConnection;->sendKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    :goto_0
    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final q(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lio/flutter/plugin/editing/C;->w()V

    iget-object v0, p0, Lio/flutter/plugin/editing/C;->b:Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {p1}, Landroid/view/View;->getApplicationWindowToken()Landroid/os/IBinder;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    return-void
.end method

.method public s()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/editing/C;->e:Lio/flutter/plugin/editing/C$c;

    iget-object v0, v0, Lio/flutter/plugin/editing/C$c;->a:Lio/flutter/plugin/editing/C$c$a;

    sget-object v1, Lio/flutter/plugin/editing/C$c$a;->q:Lio/flutter/plugin/editing/C$c$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/flutter/plugin/editing/C;->o:Z

    :cond_0
    return-void
.end method

.method public final t()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/editing/C;->g:Landroid/util/SparseArray;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final u(Ljava/lang/String;)V
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lio/flutter/plugin/editing/C;->c:Landroid/view/autofill/AutofillManager;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lio/flutter/plugin/editing/C;->t()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/flutter/plugin/editing/C;->f:LD5/w$b;

    iget-object v0, v0, LD5/w$b;->j:LD5/w$b$a;

    iget-object v0, v0, LD5/w$b$a;->a:Ljava/lang/String;

    iget-object v1, p0, Lio/flutter/plugin/editing/C;->c:Landroid/view/autofill/AutofillManager;

    iget-object v2, p0, Lio/flutter/plugin/editing/C;->a:Landroid/view/View;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    invoke-static {p1}, Lio/flutter/plugin/editing/v;->a(Ljava/lang/CharSequence;)Landroid/view/autofill/AutofillValue;

    move-result-object p1

    invoke-static {v1, v2, v0, p1}, Lio/flutter/plugin/editing/q;->a(Landroid/view/autofill/AutofillManager;Landroid/view/View;ILandroid/view/autofill/AutofillValue;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final v()V
    .locals 5

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lio/flutter/plugin/editing/C;->c:Landroid/view/autofill/AutofillManager;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lio/flutter/plugin/editing/C;->t()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/flutter/plugin/editing/C;->f:LD5/w$b;

    iget-object v0, v0, LD5/w$b;->j:LD5/w$b$a;

    iget-object v0, v0, LD5/w$b$a;->a:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [I

    iget-object v2, p0, Lio/flutter/plugin/editing/C;->a:Landroid/view/View;

    invoke-virtual {v2, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    new-instance v2, Landroid/graphics/Rect;

    iget-object v3, p0, Lio/flutter/plugin/editing/C;->l:Landroid/graphics/Rect;

    invoke-direct {v2, v3}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    const/4 v3, 0x0

    aget v3, v1, v3

    const/4 v4, 0x1

    aget v1, v1, v4

    invoke-virtual {v2, v3, v1}, Landroid/graphics/Rect;->offset(II)V

    iget-object v1, p0, Lio/flutter/plugin/editing/C;->c:Landroid/view/autofill/AutofillManager;

    iget-object v3, p0, Lio/flutter/plugin/editing/C;->a:Landroid/view/View;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    invoke-static {v1, v3, v0, v2}, Lio/flutter/plugin/editing/z;->a(Landroid/view/autofill/AutofillManager;Landroid/view/View;ILandroid/graphics/Rect;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final w()V
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lio/flutter/plugin/editing/C;->c:Landroid/view/autofill/AutofillManager;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/flutter/plugin/editing/C;->f:LD5/w$b;

    if-eqz v0, :cond_1

    iget-object v0, v0, LD5/w$b;->j:LD5/w$b$a;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lio/flutter/plugin/editing/C;->t()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/flutter/plugin/editing/C;->f:LD5/w$b;

    iget-object v0, v0, LD5/w$b;->j:LD5/w$b$a;

    iget-object v0, v0, LD5/w$b$a;->a:Ljava/lang/String;

    iget-object v1, p0, Lio/flutter/plugin/editing/C;->c:Landroid/view/autofill/AutofillManager;

    iget-object v2, p0, Lio/flutter/plugin/editing/C;->a:Landroid/view/View;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    invoke-static {v1, v2, v0}, Lio/flutter/plugin/editing/p;->a(Landroid/view/autofill/AutofillManager;Landroid/view/View;I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public x(Landroid/view/ViewStructure;I)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1a

    if-lt v2, v3, :cond_5

    invoke-virtual/range {p0 .. p0}, Lio/flutter/plugin/editing/C;->t()Z

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_3

    :cond_0
    iget-object v2, v0, Lio/flutter/plugin/editing/C;->f:LD5/w$b;

    iget-object v2, v2, LD5/w$b;->j:LD5/w$b$a;

    iget-object v2, v2, LD5/w$b$a;->a:Ljava/lang/String;

    invoke-static/range {p1 .. p1}, Lio/flutter/plugin/editing/r;->a(Landroid/view/ViewStructure;)Landroid/view/autofill/AutofillId;

    move-result-object v3

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    iget-object v6, v0, Lio/flutter/plugin/editing/C;->g:Landroid/util/SparseArray;

    invoke-virtual {v6}, Landroid/util/SparseArray;->size()I

    move-result v6

    if-ge v5, v6, :cond_5

    iget-object v6, v0, Lio/flutter/plugin/editing/C;->g:Landroid/util/SparseArray;

    invoke-virtual {v6, v5}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v6

    iget-object v7, v0, Lio/flutter/plugin/editing/C;->g:Landroid/util/SparseArray;

    invoke-virtual {v7, v5}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LD5/w$b;

    iget-object v7, v7, LD5/w$b;->j:LD5/w$b$a;

    if-nez v7, :cond_1

    goto :goto_2

    :cond_1
    const/4 v8, 0x1

    invoke-virtual {v1, v8}, Landroid/view/ViewStructure;->addChildCount(I)I

    invoke-virtual {v1, v5}, Landroid/view/ViewStructure;->newChild(I)Landroid/view/ViewStructure;

    move-result-object v15

    invoke-static {v15, v3, v6}, Lio/flutter/plugin/editing/s;->a(Landroid/view/ViewStructure;Landroid/view/autofill/AutofillId;I)V

    iget-object v9, v7, LD5/w$b$a;->b:[Ljava/lang/String;

    array-length v10, v9

    if-lez v10, :cond_2

    invoke-static {v15, v9}, Lio/flutter/plugin/editing/t;->a(Landroid/view/ViewStructure;[Ljava/lang/String;)V

    :cond_2
    invoke-static {v15, v8}, Lio/flutter/plugin/editing/u;->a(Landroid/view/ViewStructure;I)V

    invoke-virtual {v15, v4}, Landroid/view/ViewStructure;->setVisibility(I)V

    iget-object v8, v7, LD5/w$b$a;->d:Ljava/lang/String;

    if-eqz v8, :cond_3

    invoke-virtual {v15, v8}, Landroid/view/ViewStructure;->setHint(Ljava/lang/CharSequence;)V

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v8

    if-ne v8, v6, :cond_4

    iget-object v6, v0, Lio/flutter/plugin/editing/C;->l:Landroid/graphics/Rect;

    if-eqz v6, :cond_4

    iget v10, v6, Landroid/graphics/Rect;->left:I

    iget v11, v6, Landroid/graphics/Rect;->top:I

    invoke-virtual {v6}, Landroid/graphics/Rect;->width()I

    move-result v14

    iget-object v6, v0, Lio/flutter/plugin/editing/C;->l:Landroid/graphics/Rect;

    invoke-virtual {v6}, Landroid/graphics/Rect;->height()I

    move-result v6

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v9, v15

    move-object v8, v15

    move v15, v6

    invoke-virtual/range {v9 .. v15}, Landroid/view/ViewStructure;->setDimens(IIIIII)V

    iget-object v6, v0, Lio/flutter/plugin/editing/C;->h:Lio/flutter/plugin/editing/m;

    :goto_1
    invoke-static {v6}, Lio/flutter/plugin/editing/v;->a(Ljava/lang/CharSequence;)Landroid/view/autofill/AutofillValue;

    move-result-object v6

    invoke-static {v8, v6}, Lio/flutter/plugin/editing/w;->a(Landroid/view/ViewStructure;Landroid/view/autofill/AutofillValue;)V

    goto :goto_2

    :cond_4
    move-object v8, v15

    const/4 v14, 0x1

    const/4 v15, 0x1

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v9, v8

    invoke-virtual/range {v9 .. v15}, Landroid/view/ViewStructure;->setDimens(IIIIII)V

    iget-object v6, v7, LD5/w$b$a;->c:LD5/w$e;

    iget-object v6, v6, LD5/w$e;->a:Ljava/lang/String;

    goto :goto_1

    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_5
    :goto_3
    return-void
.end method

.method public final y(DD[D)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-wide/from16 v3, p3

    move-object/from16 v5, p5

    const/4 v6, 0x4

    new-array v6, v6, [D

    const/4 v7, 0x3

    aget-wide v8, v5, v7

    const-wide/16 v10, 0x0

    cmpl-double v8, v8, v10

    const/16 v9, 0xf

    const/4 v12, 0x0

    const/4 v13, 0x1

    if-nez v8, :cond_0

    const/4 v8, 0x7

    aget-wide v14, v5, v8

    cmpl-double v8, v14, v10

    if-nez v8, :cond_0

    aget-wide v14, v5, v9

    const-wide/high16 v16, 0x3ff0000000000000L    # 1.0

    cmpl-double v8, v14, v16

    if-nez v8, :cond_0

    move v8, v13

    goto :goto_0

    :cond_0
    move v8, v12

    :goto_0
    const/16 v14, 0xc

    aget-wide v14, v5, v14

    aget-wide v16, v5, v9

    div-double v14, v14, v16

    aput-wide v14, v6, v13

    aput-wide v14, v6, v12

    const/16 v9, 0xd

    aget-wide v14, v5, v9

    div-double v14, v14, v16

    aput-wide v14, v6, v7

    const/4 v9, 0x2

    aput-wide v14, v6, v9

    new-instance v14, Lio/flutter/plugin/editing/C$b;

    invoke-direct {v14, v0, v8, v5, v6}, Lio/flutter/plugin/editing/C$b;-><init>(Lio/flutter/plugin/editing/C;Z[D[D)V

    invoke-interface {v14, v1, v2, v10, v11}, Lio/flutter/plugin/editing/C$d;->a(DD)V

    invoke-interface {v14, v1, v2, v3, v4}, Lio/flutter/plugin/editing/C$d;->a(DD)V

    invoke-interface {v14, v10, v11, v3, v4}, Lio/flutter/plugin/editing/C$d;->a(DD)V

    iget-object v1, v0, Lio/flutter/plugin/editing/C;->a:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    new-instance v2, Landroid/graphics/Rect;

    aget-wide v3, v6, v12

    float-to-double v10, v1

    mul-double/2addr v3, v10

    double-to-int v1, v3

    aget-wide v3, v6, v9

    mul-double/2addr v3, v10

    double-to-int v3, v3

    aget-wide v4, v6, v13

    mul-double/2addr v4, v10

    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    double-to-int v4, v4

    aget-wide v5, v6, v7

    mul-double/2addr v5, v10

    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v5

    double-to-int v5, v5

    invoke-direct {v2, v1, v3, v4, v5}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v2, v0, Lio/flutter/plugin/editing/C;->l:Landroid/graphics/Rect;

    return-void
.end method

.method public z(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/editing/C;->b:Landroid/view/inputmethod/InputMethodManager;

    iget-object v1, p0, Lio/flutter/plugin/editing/C;->a:Landroid/view/View;

    invoke-virtual {v0, v1, p1, p2}, Landroid/view/inputmethod/InputMethodManager;->sendAppPrivateCommand(Landroid/view/View;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method
