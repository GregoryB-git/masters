.class public Ld0/K$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld0/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public A:Ljava/util/HashMap;

.field public B:Ljava/util/HashSet;

.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public j:I

.field public k:Z

.field public l:LX2/v;

.field public m:I

.field public n:LX2/v;

.field public o:I

.field public p:I

.field public q:I

.field public r:LX2/v;

.field public s:Ld0/K$b;

.field public t:LX2/v;

.field public u:I

.field public v:I

.field public w:Z

.field public x:Z

.field public y:Z

.field public z:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x7fffffff

    iput v0, p0, Ld0/K$c;->a:I

    iput v0, p0, Ld0/K$c;->b:I

    iput v0, p0, Ld0/K$c;->c:I

    iput v0, p0, Ld0/K$c;->d:I

    iput v0, p0, Ld0/K$c;->i:I

    iput v0, p0, Ld0/K$c;->j:I

    const/4 v1, 0x1

    iput-boolean v1, p0, Ld0/K$c;->k:Z

    invoke-static {}, LX2/v;->Y()LX2/v;

    move-result-object v1

    iput-object v1, p0, Ld0/K$c;->l:LX2/v;

    const/4 v1, 0x0

    iput v1, p0, Ld0/K$c;->m:I

    invoke-static {}, LX2/v;->Y()LX2/v;

    move-result-object v2

    iput-object v2, p0, Ld0/K$c;->n:LX2/v;

    iput v1, p0, Ld0/K$c;->o:I

    iput v0, p0, Ld0/K$c;->p:I

    iput v0, p0, Ld0/K$c;->q:I

    invoke-static {}, LX2/v;->Y()LX2/v;

    move-result-object v0

    iput-object v0, p0, Ld0/K$c;->r:LX2/v;

    sget-object v0, Ld0/K$b;->d:Ld0/K$b;

    iput-object v0, p0, Ld0/K$c;->s:Ld0/K$b;

    invoke-static {}, LX2/v;->Y()LX2/v;

    move-result-object v0

    iput-object v0, p0, Ld0/K$c;->t:LX2/v;

    iput v1, p0, Ld0/K$c;->u:I

    iput v1, p0, Ld0/K$c;->v:I

    iput-boolean v1, p0, Ld0/K$c;->w:Z

    iput-boolean v1, p0, Ld0/K$c;->x:Z

    iput-boolean v1, p0, Ld0/K$c;->y:Z

    iput-boolean v1, p0, Ld0/K$c;->z:Z

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ld0/K$c;->A:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ld0/K$c;->B:Ljava/util/HashSet;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ld0/K$c;-><init>()V

    invoke-virtual {p0, p1}, Ld0/K$c;->G(Landroid/content/Context;)Ld0/K$c;

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Ld0/K$c;->I(Landroid/content/Context;Z)Ld0/K$c;

    return-void
.end method

.method public constructor <init>(Ld0/K;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, p1}, Ld0/K$c;->D(Ld0/K;)V

    return-void
.end method

.method public static synthetic A(Ld0/K$c;)Ljava/util/HashMap;
    .locals 0

    .line 1
    iget-object p0, p0, Ld0/K$c;->A:Ljava/util/HashMap;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic B(Ld0/K$c;)Ljava/util/HashSet;
    .locals 0

    .line 1
    iget-object p0, p0, Ld0/K$c;->B:Ljava/util/HashSet;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic a(Ld0/K$c;)I
    .locals 0

    .line 1
    iget p0, p0, Ld0/K$c;->a:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic b(Ld0/K$c;)I
    .locals 0

    .line 1
    iget p0, p0, Ld0/K$c;->b:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic c(Ld0/K$c;)I
    .locals 0

    .line 1
    iget p0, p0, Ld0/K$c;->c:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic d(Ld0/K$c;)I
    .locals 0

    .line 1
    iget p0, p0, Ld0/K$c;->d:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic e(Ld0/K$c;)I
    .locals 0

    .line 1
    iget p0, p0, Ld0/K$c;->e:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic f(Ld0/K$c;)I
    .locals 0

    .line 1
    iget p0, p0, Ld0/K$c;->f:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic g(Ld0/K$c;)I
    .locals 0

    .line 1
    iget p0, p0, Ld0/K$c;->g:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic h(Ld0/K$c;)I
    .locals 0

    .line 1
    iget p0, p0, Ld0/K$c;->h:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic i(Ld0/K$c;)I
    .locals 0

    .line 1
    iget p0, p0, Ld0/K$c;->i:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic j(Ld0/K$c;)I
    .locals 0

    .line 1
    iget p0, p0, Ld0/K$c;->j:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic k(Ld0/K$c;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Ld0/K$c;->k:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic l(Ld0/K$c;)LX2/v;
    .locals 0

    .line 1
    iget-object p0, p0, Ld0/K$c;->l:LX2/v;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic m(Ld0/K$c;)I
    .locals 0

    .line 1
    iget p0, p0, Ld0/K$c;->m:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic n(Ld0/K$c;)LX2/v;
    .locals 0

    .line 1
    iget-object p0, p0, Ld0/K$c;->n:LX2/v;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic o(Ld0/K$c;)I
    .locals 0

    .line 1
    iget p0, p0, Ld0/K$c;->o:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic p(Ld0/K$c;)I
    .locals 0

    .line 1
    iget p0, p0, Ld0/K$c;->p:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic q(Ld0/K$c;)I
    .locals 0

    .line 1
    iget p0, p0, Ld0/K$c;->q:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic r(Ld0/K$c;)LX2/v;
    .locals 0

    .line 1
    iget-object p0, p0, Ld0/K$c;->r:LX2/v;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic s(Ld0/K$c;)Ld0/K$b;
    .locals 0

    .line 1
    iget-object p0, p0, Ld0/K$c;->s:Ld0/K$b;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic t(Ld0/K$c;)LX2/v;
    .locals 0

    .line 1
    iget-object p0, p0, Ld0/K$c;->t:LX2/v;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic u(Ld0/K$c;)I
    .locals 0

    .line 1
    iget p0, p0, Ld0/K$c;->u:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic v(Ld0/K$c;)I
    .locals 0

    .line 1
    iget p0, p0, Ld0/K$c;->v:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic w(Ld0/K$c;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Ld0/K$c;->w:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic x(Ld0/K$c;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Ld0/K$c;->x:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic y(Ld0/K$c;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Ld0/K$c;->y:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic z(Ld0/K$c;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Ld0/K$c;->z:Z

    .line 2
    .line 3
    return p0
.end method


# virtual methods
.method public C()Ld0/K;
    .locals 1

    .line 1
    new-instance v0, Ld0/K;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ld0/K;-><init>(Ld0/K$c;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final D(Ld0/K;)V
    .locals 2

    .line 1
    iget v0, p1, Ld0/K;->a:I

    .line 2
    .line 3
    iput v0, p0, Ld0/K$c;->a:I

    .line 4
    .line 5
    iget v0, p1, Ld0/K;->b:I

    .line 6
    .line 7
    iput v0, p0, Ld0/K$c;->b:I

    .line 8
    .line 9
    iget v0, p1, Ld0/K;->c:I

    .line 10
    .line 11
    iput v0, p0, Ld0/K$c;->c:I

    .line 12
    .line 13
    iget v0, p1, Ld0/K;->d:I

    .line 14
    .line 15
    iput v0, p0, Ld0/K$c;->d:I

    .line 16
    .line 17
    iget v0, p1, Ld0/K;->e:I

    .line 18
    .line 19
    iput v0, p0, Ld0/K$c;->e:I

    .line 20
    .line 21
    iget v0, p1, Ld0/K;->f:I

    .line 22
    .line 23
    iput v0, p0, Ld0/K$c;->f:I

    .line 24
    .line 25
    iget v0, p1, Ld0/K;->g:I

    .line 26
    .line 27
    iput v0, p0, Ld0/K$c;->g:I

    .line 28
    .line 29
    iget v0, p1, Ld0/K;->h:I

    .line 30
    .line 31
    iput v0, p0, Ld0/K$c;->h:I

    .line 32
    .line 33
    iget v0, p1, Ld0/K;->i:I

    .line 34
    .line 35
    iput v0, p0, Ld0/K$c;->i:I

    .line 36
    .line 37
    iget v0, p1, Ld0/K;->j:I

    .line 38
    .line 39
    iput v0, p0, Ld0/K$c;->j:I

    .line 40
    .line 41
    iget-boolean v0, p1, Ld0/K;->k:Z

    .line 42
    .line 43
    iput-boolean v0, p0, Ld0/K$c;->k:Z

    .line 44
    .line 45
    iget-object v0, p1, Ld0/K;->l:LX2/v;

    .line 46
    .line 47
    iput-object v0, p0, Ld0/K$c;->l:LX2/v;

    .line 48
    .line 49
    iget v0, p1, Ld0/K;->m:I

    .line 50
    .line 51
    iput v0, p0, Ld0/K$c;->m:I

    .line 52
    .line 53
    iget-object v0, p1, Ld0/K;->n:LX2/v;

    .line 54
    .line 55
    iput-object v0, p0, Ld0/K$c;->n:LX2/v;

    .line 56
    .line 57
    iget v0, p1, Ld0/K;->o:I

    .line 58
    .line 59
    iput v0, p0, Ld0/K$c;->o:I

    .line 60
    .line 61
    iget v0, p1, Ld0/K;->p:I

    .line 62
    .line 63
    iput v0, p0, Ld0/K$c;->p:I

    .line 64
    .line 65
    iget v0, p1, Ld0/K;->q:I

    .line 66
    .line 67
    iput v0, p0, Ld0/K$c;->q:I

    .line 68
    .line 69
    iget-object v0, p1, Ld0/K;->r:LX2/v;

    .line 70
    .line 71
    iput-object v0, p0, Ld0/K$c;->r:LX2/v;

    .line 72
    .line 73
    iget-object v0, p1, Ld0/K;->s:Ld0/K$b;

    .line 74
    .line 75
    iput-object v0, p0, Ld0/K$c;->s:Ld0/K$b;

    .line 76
    .line 77
    iget-object v0, p1, Ld0/K;->t:LX2/v;

    .line 78
    .line 79
    iput-object v0, p0, Ld0/K$c;->t:LX2/v;

    .line 80
    .line 81
    iget v0, p1, Ld0/K;->u:I

    .line 82
    .line 83
    iput v0, p0, Ld0/K$c;->u:I

    .line 84
    .line 85
    iget v0, p1, Ld0/K;->v:I

    .line 86
    .line 87
    iput v0, p0, Ld0/K$c;->v:I

    .line 88
    .line 89
    iget-boolean v0, p1, Ld0/K;->w:Z

    .line 90
    .line 91
    iput-boolean v0, p0, Ld0/K$c;->w:Z

    .line 92
    .line 93
    iget-boolean v0, p1, Ld0/K;->x:Z

    .line 94
    .line 95
    iput-boolean v0, p0, Ld0/K$c;->x:Z

    .line 96
    .line 97
    iget-boolean v0, p1, Ld0/K;->y:Z

    .line 98
    .line 99
    iput-boolean v0, p0, Ld0/K$c;->y:Z

    .line 100
    .line 101
    iget-boolean v0, p1, Ld0/K;->z:Z

    .line 102
    .line 103
    iput-boolean v0, p0, Ld0/K$c;->z:Z

    .line 104
    .line 105
    new-instance v0, Ljava/util/HashSet;

    .line 106
    .line 107
    iget-object v1, p1, Ld0/K;->B:LX2/y;

    .line 108
    .line 109
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 110
    .line 111
    .line 112
    iput-object v0, p0, Ld0/K$c;->B:Ljava/util/HashSet;

    .line 113
    .line 114
    new-instance v0, Ljava/util/HashMap;

    .line 115
    .line 116
    iget-object p1, p1, Ld0/K;->A:LX2/w;

    .line 117
    .line 118
    invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 119
    .line 120
    .line 121
    iput-object v0, p0, Ld0/K$c;->A:Ljava/util/HashMap;

    .line 122
    .line 123
    return-void
.end method

.method public E(Ld0/K;)Ld0/K$c;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ld0/K$c;->D(Ld0/K;)V

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public F(Ld0/K$b;)Ld0/K$c;
    .locals 0

    .line 1
    iput-object p1, p0, Ld0/K$c;->s:Ld0/K$b;

    .line 2
    .line 3
    return-object p0
.end method

.method public G(Landroid/content/Context;)Ld0/K$c;
    .locals 2

    .line 1
    sget v0, Lg0/M;->a:I

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const-string v0, "captioning"

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Landroid/view/accessibility/CaptioningManager;

    .line 21
    .line 22
    if-eqz p1, :cond_2

    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/view/accessibility/CaptioningManager;->isEnabled()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/16 v0, 0x440

    .line 32
    .line 33
    iput v0, p0, Ld0/K$c;->u:I

    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/view/accessibility/CaptioningManager;->getLocale()Ljava/util/Locale;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-eqz p1, :cond_2

    .line 40
    .line 41
    invoke-static {p1}, Lg0/M;->Z(Ljava/util/Locale;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-static {p1}, LX2/v;->Z(Ljava/lang/Object;)LX2/v;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iput-object p1, p0, Ld0/K$c;->t:LX2/v;

    .line 50
    .line 51
    :cond_2
    :goto_0
    return-object p0
.end method

.method public H(IIZ)Ld0/K$c;
    .locals 0

    .line 1
    iput p1, p0, Ld0/K$c;->i:I

    .line 2
    .line 3
    iput p2, p0, Ld0/K$c;->j:I

    .line 4
    .line 5
    iput-boolean p3, p0, Ld0/K$c;->k:Z

    .line 6
    .line 7
    return-object p0
.end method

.method public I(Landroid/content/Context;Z)Ld0/K$c;
    .locals 1

    .line 1
    invoke-static {p1}, Lg0/M;->S(Landroid/content/Context;)Landroid/graphics/Point;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget v0, p1, Landroid/graphics/Point;->x:I

    .line 6
    .line 7
    iget p1, p1, Landroid/graphics/Point;->y:I

    .line 8
    .line 9
    invoke-virtual {p0, v0, p1, p2}, Ld0/K$c;->H(IIZ)Ld0/K$c;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method
