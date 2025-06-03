.class public final LA0/n$e$a;
.super Ld0/K$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LA0/n$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public C:Z

.field public D:Z

.field public E:Z

.field public F:Z

.field public G:Z

.field public H:Z

.field public I:Z

.field public J:Z

.field public K:Z

.field public L:Z

.field public M:Z

.field public N:Z

.field public O:Z

.field public P:Z

.field public Q:Z

.field public final R:Landroid/util/SparseArray;

.field public final S:Landroid/util/SparseBooleanArray;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ld0/K$c;-><init>()V

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, LA0/n$e$a;->R:Landroid/util/SparseArray;

    new-instance v0, Landroid/util/SparseBooleanArray;

    invoke-direct {v0}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object v0, p0, LA0/n$e$a;->S:Landroid/util/SparseBooleanArray;

    invoke-virtual {p0}, LA0/n$e$a;->c0()V

    return-void
.end method

.method public constructor <init>(LA0/n$e;)V
    .locals 1

    .line 2
    invoke-direct {p0, p1}, Ld0/K$c;-><init>(Ld0/K;)V

    iget-boolean v0, p1, LA0/n$e;->j0:Z

    iput-boolean v0, p0, LA0/n$e$a;->C:Z

    iget-boolean v0, p1, LA0/n$e;->k0:Z

    iput-boolean v0, p0, LA0/n$e$a;->D:Z

    iget-boolean v0, p1, LA0/n$e;->l0:Z

    iput-boolean v0, p0, LA0/n$e$a;->E:Z

    iget-boolean v0, p1, LA0/n$e;->m0:Z

    iput-boolean v0, p0, LA0/n$e$a;->F:Z

    iget-boolean v0, p1, LA0/n$e;->n0:Z

    iput-boolean v0, p0, LA0/n$e$a;->G:Z

    iget-boolean v0, p1, LA0/n$e;->o0:Z

    iput-boolean v0, p0, LA0/n$e$a;->H:Z

    iget-boolean v0, p1, LA0/n$e;->p0:Z

    iput-boolean v0, p0, LA0/n$e$a;->I:Z

    iget-boolean v0, p1, LA0/n$e;->q0:Z

    iput-boolean v0, p0, LA0/n$e$a;->J:Z

    iget-boolean v0, p1, LA0/n$e;->r0:Z

    iput-boolean v0, p0, LA0/n$e$a;->K:Z

    iget-boolean v0, p1, LA0/n$e;->s0:Z

    iput-boolean v0, p0, LA0/n$e$a;->L:Z

    iget-boolean v0, p1, LA0/n$e;->t0:Z

    iput-boolean v0, p0, LA0/n$e$a;->M:Z

    iget-boolean v0, p1, LA0/n$e;->u0:Z

    iput-boolean v0, p0, LA0/n$e$a;->N:Z

    iget-boolean v0, p1, LA0/n$e;->v0:Z

    iput-boolean v0, p0, LA0/n$e$a;->O:Z

    iget-boolean v0, p1, LA0/n$e;->w0:Z

    iput-boolean v0, p0, LA0/n$e$a;->P:Z

    iget-boolean v0, p1, LA0/n$e;->x0:Z

    iput-boolean v0, p0, LA0/n$e$a;->Q:Z

    invoke-static {p1}, LA0/n$e;->b(LA0/n$e;)Landroid/util/SparseArray;

    move-result-object v0

    invoke-static {v0}, LA0/n$e$a;->b0(Landroid/util/SparseArray;)Landroid/util/SparseArray;

    move-result-object v0

    iput-object v0, p0, LA0/n$e$a;->R:Landroid/util/SparseArray;

    invoke-static {p1}, LA0/n$e;->c(LA0/n$e;)Landroid/util/SparseBooleanArray;

    move-result-object p1

    invoke-virtual {p1}, Landroid/util/SparseBooleanArray;->clone()Landroid/util/SparseBooleanArray;

    move-result-object p1

    iput-object p1, p0, LA0/n$e$a;->S:Landroid/util/SparseBooleanArray;

    return-void
.end method

.method public synthetic constructor <init>(LA0/n$e;LA0/n$a;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, LA0/n$e$a;-><init>(LA0/n$e;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1}, Ld0/K$c;-><init>(Landroid/content/Context;)V

    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, LA0/n$e$a;->R:Landroid/util/SparseArray;

    new-instance p1, Landroid/util/SparseBooleanArray;

    invoke-direct {p1}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object p1, p0, LA0/n$e$a;->S:Landroid/util/SparseBooleanArray;

    invoke-virtual {p0}, LA0/n$e$a;->c0()V

    return-void
.end method

.method public static synthetic J(LA0/n$e$a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, LA0/n$e$a;->C:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic K(LA0/n$e$a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, LA0/n$e$a;->D:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic L(LA0/n$e$a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, LA0/n$e$a;->E:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic M(LA0/n$e$a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, LA0/n$e$a;->F:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic N(LA0/n$e$a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, LA0/n$e$a;->G:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic O(LA0/n$e$a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, LA0/n$e$a;->H:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic P(LA0/n$e$a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, LA0/n$e$a;->I:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic Q(LA0/n$e$a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, LA0/n$e$a;->J:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic R(LA0/n$e$a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, LA0/n$e$a;->K:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic S(LA0/n$e$a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, LA0/n$e$a;->L:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic T(LA0/n$e$a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, LA0/n$e$a;->M:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic U(LA0/n$e$a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, LA0/n$e$a;->N:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic V(LA0/n$e$a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, LA0/n$e$a;->O:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic W(LA0/n$e$a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, LA0/n$e$a;->P:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic X(LA0/n$e$a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, LA0/n$e$a;->Q:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic Y(LA0/n$e$a;)Landroid/util/SparseArray;
    .locals 0

    .line 1
    iget-object p0, p0, LA0/n$e$a;->R:Landroid/util/SparseArray;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic Z(LA0/n$e$a;)Landroid/util/SparseBooleanArray;
    .locals 0

    .line 1
    iget-object p0, p0, LA0/n$e$a;->S:Landroid/util/SparseBooleanArray;

    .line 2
    .line 3
    return-object p0
.end method

.method public static b0(Landroid/util/SparseArray;)Landroid/util/SparseArray;
    .locals 5

    .line 1
    new-instance v0, Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    invoke-virtual {p0}, Landroid/util/SparseArray;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-ge v1, v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, v1}, Landroid/util/SparseArray;->keyAt(I)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    new-instance v3, Ljava/util/HashMap;

    .line 18
    .line 19
    invoke-virtual {p0, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    check-cast v4, Ljava/util/Map;

    .line 24
    .line 25
    invoke-direct {v3, v4}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v2, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    add-int/lit8 v1, v1, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    return-object v0
.end method


# virtual methods
.method public bridge synthetic C()Ld0/K;
    .locals 1

    .line 1
    invoke-virtual {p0}, LA0/n$e$a;->a0()LA0/n$e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic G(Landroid/content/Context;)Ld0/K$c;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LA0/n$e$a;->e0(Landroid/content/Context;)LA0/n$e$a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic H(IIZ)Ld0/K$c;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, LA0/n$e$a;->f0(IIZ)LA0/n$e$a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic I(Landroid/content/Context;Z)Ld0/K$c;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LA0/n$e$a;->g0(Landroid/content/Context;Z)LA0/n$e$a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public a0()LA0/n$e;
    .locals 2

    .line 1
    new-instance v0, LA0/n$e;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, LA0/n$e;-><init>(LA0/n$e$a;LA0/n$a;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public final c0()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LA0/n$e$a;->C:Z

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    iput-boolean v1, p0, LA0/n$e$a;->D:Z

    .line 6
    .line 7
    iput-boolean v0, p0, LA0/n$e$a;->E:Z

    .line 8
    .line 9
    iput-boolean v1, p0, LA0/n$e$a;->F:Z

    .line 10
    .line 11
    iput-boolean v0, p0, LA0/n$e$a;->G:Z

    .line 12
    .line 13
    iput-boolean v1, p0, LA0/n$e$a;->H:Z

    .line 14
    .line 15
    iput-boolean v1, p0, LA0/n$e$a;->I:Z

    .line 16
    .line 17
    iput-boolean v1, p0, LA0/n$e$a;->J:Z

    .line 18
    .line 19
    iput-boolean v1, p0, LA0/n$e$a;->K:Z

    .line 20
    .line 21
    iput-boolean v0, p0, LA0/n$e$a;->L:Z

    .line 22
    .line 23
    iput-boolean v0, p0, LA0/n$e$a;->M:Z

    .line 24
    .line 25
    iput-boolean v0, p0, LA0/n$e$a;->N:Z

    .line 26
    .line 27
    iput-boolean v1, p0, LA0/n$e$a;->O:Z

    .line 28
    .line 29
    iput-boolean v0, p0, LA0/n$e$a;->P:Z

    .line 30
    .line 31
    iput-boolean v1, p0, LA0/n$e$a;->Q:Z

    .line 32
    .line 33
    return-void
.end method

.method public d0(Ld0/K;)LA0/n$e$a;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Ld0/K$c;->E(Ld0/K;)Ld0/K$c;

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public e0(Landroid/content/Context;)LA0/n$e$a;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Ld0/K$c;->G(Landroid/content/Context;)Ld0/K$c;

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public f0(IIZ)LA0/n$e$a;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Ld0/K$c;->H(IIZ)Ld0/K$c;

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public g0(Landroid/content/Context;Z)LA0/n$e$a;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Ld0/K$c;->I(Landroid/content/Context;Z)Ld0/K$c;

    .line 2
    .line 3
    .line 4
    return-object p0
.end method
