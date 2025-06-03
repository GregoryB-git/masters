.class public final Ld0/q$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld0/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public A:I

.field public B:I

.field public C:I

.field public D:I

.field public E:I

.field public F:I

.field public G:I

.field public H:I

.field public I:I

.field public J:I

.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/util/List;

.field public d:Ljava/lang/String;

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:Ljava/lang/String;

.field public j:Ld0/x;

.field public k:Ljava/lang/Object;

.field public l:Ljava/lang/String;

.field public m:Ljava/lang/String;

.field public n:I

.field public o:I

.field public p:Ljava/util/List;

.field public q:Ld0/m;

.field public r:J

.field public s:I

.field public t:I

.field public u:F

.field public v:I

.field public w:F

.field public x:[B

.field public y:I

.field public z:Ld0/h;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LX2/v;->Y()LX2/v;

    move-result-object v0

    iput-object v0, p0, Ld0/q$b;->c:Ljava/util/List;

    const/4 v0, -0x1

    iput v0, p0, Ld0/q$b;->g:I

    iput v0, p0, Ld0/q$b;->h:I

    iput v0, p0, Ld0/q$b;->n:I

    iput v0, p0, Ld0/q$b;->o:I

    const-wide v1, 0x7fffffffffffffffL

    iput-wide v1, p0, Ld0/q$b;->r:J

    iput v0, p0, Ld0/q$b;->s:I

    iput v0, p0, Ld0/q$b;->t:I

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, p0, Ld0/q$b;->u:F

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, p0, Ld0/q$b;->w:F

    iput v0, p0, Ld0/q$b;->y:I

    iput v0, p0, Ld0/q$b;->A:I

    iput v0, p0, Ld0/q$b;->B:I

    iput v0, p0, Ld0/q$b;->C:I

    iput v0, p0, Ld0/q$b;->F:I

    const/4 v1, 0x1

    iput v1, p0, Ld0/q$b;->G:I

    iput v0, p0, Ld0/q$b;->H:I

    iput v0, p0, Ld0/q$b;->I:I

    const/4 v0, 0x0

    iput v0, p0, Ld0/q$b;->J:I

    return-void
.end method

.method public constructor <init>(Ld0/q;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Ld0/q;->a:Ljava/lang/String;

    iput-object v0, p0, Ld0/q$b;->a:Ljava/lang/String;

    iget-object v0, p1, Ld0/q;->b:Ljava/lang/String;

    iput-object v0, p0, Ld0/q$b;->b:Ljava/lang/String;

    iget-object v0, p1, Ld0/q;->c:Ljava/util/List;

    iput-object v0, p0, Ld0/q$b;->c:Ljava/util/List;

    iget-object v0, p1, Ld0/q;->d:Ljava/lang/String;

    iput-object v0, p0, Ld0/q$b;->d:Ljava/lang/String;

    iget v0, p1, Ld0/q;->e:I

    iput v0, p0, Ld0/q$b;->e:I

    iget v0, p1, Ld0/q;->f:I

    iput v0, p0, Ld0/q$b;->f:I

    iget v0, p1, Ld0/q;->g:I

    iput v0, p0, Ld0/q$b;->g:I

    iget v0, p1, Ld0/q;->h:I

    iput v0, p0, Ld0/q$b;->h:I

    iget-object v0, p1, Ld0/q;->j:Ljava/lang/String;

    iput-object v0, p0, Ld0/q$b;->i:Ljava/lang/String;

    iget-object v0, p1, Ld0/q;->k:Ld0/x;

    iput-object v0, p0, Ld0/q$b;->j:Ld0/x;

    iget-object v0, p1, Ld0/q;->l:Ljava/lang/Object;

    iput-object v0, p0, Ld0/q$b;->k:Ljava/lang/Object;

    iget-object v0, p1, Ld0/q;->m:Ljava/lang/String;

    iput-object v0, p0, Ld0/q$b;->l:Ljava/lang/String;

    iget-object v0, p1, Ld0/q;->n:Ljava/lang/String;

    iput-object v0, p0, Ld0/q$b;->m:Ljava/lang/String;

    iget v0, p1, Ld0/q;->o:I

    iput v0, p0, Ld0/q$b;->n:I

    iget v0, p1, Ld0/q;->p:I

    iput v0, p0, Ld0/q$b;->o:I

    iget-object v0, p1, Ld0/q;->q:Ljava/util/List;

    iput-object v0, p0, Ld0/q$b;->p:Ljava/util/List;

    iget-object v0, p1, Ld0/q;->r:Ld0/m;

    iput-object v0, p0, Ld0/q$b;->q:Ld0/m;

    iget-wide v0, p1, Ld0/q;->s:J

    iput-wide v0, p0, Ld0/q$b;->r:J

    iget v0, p1, Ld0/q;->t:I

    iput v0, p0, Ld0/q$b;->s:I

    iget v0, p1, Ld0/q;->u:I

    iput v0, p0, Ld0/q$b;->t:I

    iget v0, p1, Ld0/q;->v:F

    iput v0, p0, Ld0/q$b;->u:F

    iget v0, p1, Ld0/q;->w:I

    iput v0, p0, Ld0/q$b;->v:I

    iget v0, p1, Ld0/q;->x:F

    iput v0, p0, Ld0/q$b;->w:F

    iget-object v0, p1, Ld0/q;->y:[B

    iput-object v0, p0, Ld0/q$b;->x:[B

    iget v0, p1, Ld0/q;->z:I

    iput v0, p0, Ld0/q$b;->y:I

    iget-object v0, p1, Ld0/q;->A:Ld0/h;

    iput-object v0, p0, Ld0/q$b;->z:Ld0/h;

    iget v0, p1, Ld0/q;->B:I

    iput v0, p0, Ld0/q$b;->A:I

    iget v0, p1, Ld0/q;->C:I

    iput v0, p0, Ld0/q$b;->B:I

    iget v0, p1, Ld0/q;->D:I

    iput v0, p0, Ld0/q$b;->C:I

    iget v0, p1, Ld0/q;->E:I

    iput v0, p0, Ld0/q$b;->D:I

    iget v0, p1, Ld0/q;->F:I

    iput v0, p0, Ld0/q$b;->E:I

    iget v0, p1, Ld0/q;->G:I

    iput v0, p0, Ld0/q$b;->F:I

    iget v0, p1, Ld0/q;->H:I

    iput v0, p0, Ld0/q$b;->G:I

    iget v0, p1, Ld0/q;->I:I

    iput v0, p0, Ld0/q$b;->H:I

    iget v0, p1, Ld0/q;->J:I

    iput v0, p0, Ld0/q$b;->I:I

    iget p1, p1, Ld0/q;->K:I

    iput p1, p0, Ld0/q$b;->J:I

    return-void
.end method

.method public synthetic constructor <init>(Ld0/q;Ld0/q$a;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Ld0/q$b;-><init>(Ld0/q;)V

    return-void
.end method

.method public static synthetic A(Ld0/q$b;)I
    .locals 0

    .line 1
    iget p0, p0, Ld0/q$b;->G:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic B(Ld0/q$b;)I
    .locals 0

    .line 1
    iget p0, p0, Ld0/q$b;->H:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic C(Ld0/q$b;)I
    .locals 0

    .line 1
    iget p0, p0, Ld0/q$b;->I:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic D(Ld0/q$b;)I
    .locals 0

    .line 1
    iget p0, p0, Ld0/q$b;->J:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic E(Ld0/q$b;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Ld0/q$b;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic F(Ld0/q$b;)I
    .locals 0

    .line 1
    iget p0, p0, Ld0/q$b;->e:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic G(Ld0/q$b;)I
    .locals 0

    .line 1
    iget p0, p0, Ld0/q$b;->f:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic H(Ld0/q$b;)I
    .locals 0

    .line 1
    iget p0, p0, Ld0/q$b;->g:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic I(Ld0/q$b;)I
    .locals 0

    .line 1
    iget p0, p0, Ld0/q$b;->h:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic J(Ld0/q$b;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Ld0/q$b;->i:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic a(Ld0/q$b;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Ld0/q$b;->c:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic b(Ld0/q$b;)Ld0/x;
    .locals 0

    .line 1
    iget-object p0, p0, Ld0/q$b;->j:Ld0/x;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic c(Ld0/q$b;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Ld0/q$b;->k:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic d(Ld0/q$b;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Ld0/q$b;->l:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic e(Ld0/q$b;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Ld0/q$b;->m:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic f(Ld0/q$b;)I
    .locals 0

    .line 1
    iget p0, p0, Ld0/q$b;->n:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic g(Ld0/q$b;)I
    .locals 0

    .line 1
    iget p0, p0, Ld0/q$b;->o:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic h(Ld0/q$b;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Ld0/q$b;->p:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic i(Ld0/q$b;)Ld0/m;
    .locals 0

    .line 1
    iget-object p0, p0, Ld0/q$b;->q:Ld0/m;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic j(Ld0/q$b;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Ld0/q$b;->r:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static synthetic k(Ld0/q$b;)I
    .locals 0

    .line 1
    iget p0, p0, Ld0/q$b;->s:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic l(Ld0/q$b;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Ld0/q$b;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic m(Ld0/q$b;)I
    .locals 0

    .line 1
    iget p0, p0, Ld0/q$b;->t:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic n(Ld0/q$b;)F
    .locals 0

    .line 1
    iget p0, p0, Ld0/q$b;->u:F

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic o(Ld0/q$b;)I
    .locals 0

    .line 1
    iget p0, p0, Ld0/q$b;->v:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic p(Ld0/q$b;)F
    .locals 0

    .line 1
    iget p0, p0, Ld0/q$b;->w:F

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic q(Ld0/q$b;)[B
    .locals 0

    .line 1
    iget-object p0, p0, Ld0/q$b;->x:[B

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic r(Ld0/q$b;)I
    .locals 0

    .line 1
    iget p0, p0, Ld0/q$b;->y:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic s(Ld0/q$b;)Ld0/h;
    .locals 0

    .line 1
    iget-object p0, p0, Ld0/q$b;->z:Ld0/h;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic t(Ld0/q$b;)I
    .locals 0

    .line 1
    iget p0, p0, Ld0/q$b;->A:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic u(Ld0/q$b;)I
    .locals 0

    .line 1
    iget p0, p0, Ld0/q$b;->B:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic v(Ld0/q$b;)I
    .locals 0

    .line 1
    iget p0, p0, Ld0/q$b;->C:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic w(Ld0/q$b;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Ld0/q$b;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic x(Ld0/q$b;)I
    .locals 0

    .line 1
    iget p0, p0, Ld0/q$b;->D:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic y(Ld0/q$b;)I
    .locals 0

    .line 1
    iget p0, p0, Ld0/q$b;->E:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic z(Ld0/q$b;)I
    .locals 0

    .line 1
    iget p0, p0, Ld0/q$b;->F:I

    .line 2
    .line 3
    return p0
.end method


# virtual methods
.method public K()Ld0/q;
    .locals 2

    .line 1
    new-instance v0, Ld0/q;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Ld0/q;-><init>(Ld0/q$b;Ld0/q$a;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public L(I)Ld0/q$b;
    .locals 0

    .line 1
    iput p1, p0, Ld0/q$b;->F:I

    .line 2
    .line 3
    return-object p0
.end method

.method public M(I)Ld0/q$b;
    .locals 0

    .line 1
    iput p1, p0, Ld0/q$b;->g:I

    .line 2
    .line 3
    return-object p0
.end method

.method public N(I)Ld0/q$b;
    .locals 0

    .line 1
    iput p1, p0, Ld0/q$b;->A:I

    .line 2
    .line 3
    return-object p0
.end method

.method public O(Ljava/lang/String;)Ld0/q$b;
    .locals 0

    .line 1
    iput-object p1, p0, Ld0/q$b;->i:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public P(Ld0/h;)Ld0/q$b;
    .locals 0

    .line 1
    iput-object p1, p0, Ld0/q$b;->z:Ld0/h;

    .line 2
    .line 3
    return-object p0
.end method

.method public Q(Ljava/lang/String;)Ld0/q$b;
    .locals 0

    .line 1
    invoke-static {p1}, Ld0/z;->t(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Ld0/q$b;->l:Ljava/lang/String;

    .line 6
    .line 7
    return-object p0
.end method

.method public R(I)Ld0/q$b;
    .locals 0

    .line 1
    iput p1, p0, Ld0/q$b;->J:I

    .line 2
    .line 3
    return-object p0
.end method

.method public S(I)Ld0/q$b;
    .locals 0

    .line 1
    iput p1, p0, Ld0/q$b;->G:I

    .line 2
    .line 3
    return-object p0
.end method

.method public T(Ljava/lang/Object;)Ld0/q$b;
    .locals 0

    .line 1
    iput-object p1, p0, Ld0/q$b;->k:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public U(Ld0/m;)Ld0/q$b;
    .locals 0

    .line 1
    iput-object p1, p0, Ld0/q$b;->q:Ld0/m;

    .line 2
    .line 3
    return-object p0
.end method

.method public V(I)Ld0/q$b;
    .locals 0

    .line 1
    iput p1, p0, Ld0/q$b;->D:I

    .line 2
    .line 3
    return-object p0
.end method

.method public W(I)Ld0/q$b;
    .locals 0

    .line 1
    iput p1, p0, Ld0/q$b;->E:I

    .line 2
    .line 3
    return-object p0
.end method

.method public X(F)Ld0/q$b;
    .locals 0

    .line 1
    iput p1, p0, Ld0/q$b;->u:F

    .line 2
    .line 3
    return-object p0
.end method

.method public Y(I)Ld0/q$b;
    .locals 0

    .line 1
    iput p1, p0, Ld0/q$b;->t:I

    .line 2
    .line 3
    return-object p0
.end method

.method public Z(I)Ld0/q$b;
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Ld0/q$b;->a:Ljava/lang/String;

    .line 6
    .line 7
    return-object p0
.end method

.method public a0(Ljava/lang/String;)Ld0/q$b;
    .locals 0

    .line 1
    iput-object p1, p0, Ld0/q$b;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public b0(Ljava/util/List;)Ld0/q$b;
    .locals 0

    .line 1
    iput-object p1, p0, Ld0/q$b;->p:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public c0(Ljava/lang/String;)Ld0/q$b;
    .locals 0

    .line 1
    iput-object p1, p0, Ld0/q$b;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public d0(Ljava/util/List;)Ld0/q$b;
    .locals 0

    .line 1
    invoke-static {p1}, LX2/v;->U(Ljava/util/Collection;)LX2/v;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Ld0/q$b;->c:Ljava/util/List;

    .line 6
    .line 7
    return-object p0
.end method

.method public e0(Ljava/lang/String;)Ld0/q$b;
    .locals 0

    .line 1
    iput-object p1, p0, Ld0/q$b;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public f0(I)Ld0/q$b;
    .locals 0

    .line 1
    iput p1, p0, Ld0/q$b;->n:I

    .line 2
    .line 3
    return-object p0
.end method

.method public g0(I)Ld0/q$b;
    .locals 0

    .line 1
    iput p1, p0, Ld0/q$b;->o:I

    .line 2
    .line 3
    return-object p0
.end method

.method public h0(Ld0/x;)Ld0/q$b;
    .locals 0

    .line 1
    iput-object p1, p0, Ld0/q$b;->j:Ld0/x;

    .line 2
    .line 3
    return-object p0
.end method

.method public i0(I)Ld0/q$b;
    .locals 0

    .line 1
    iput p1, p0, Ld0/q$b;->C:I

    .line 2
    .line 3
    return-object p0
.end method

.method public j0(I)Ld0/q$b;
    .locals 0

    .line 1
    iput p1, p0, Ld0/q$b;->h:I

    .line 2
    .line 3
    return-object p0
.end method

.method public k0(F)Ld0/q$b;
    .locals 0

    .line 1
    iput p1, p0, Ld0/q$b;->w:F

    .line 2
    .line 3
    return-object p0
.end method

.method public l0([B)Ld0/q$b;
    .locals 0

    .line 1
    iput-object p1, p0, Ld0/q$b;->x:[B

    .line 2
    .line 3
    return-object p0
.end method

.method public m0(I)Ld0/q$b;
    .locals 0

    .line 1
    iput p1, p0, Ld0/q$b;->f:I

    .line 2
    .line 3
    return-object p0
.end method

.method public n0(I)Ld0/q$b;
    .locals 0

    .line 1
    iput p1, p0, Ld0/q$b;->v:I

    .line 2
    .line 3
    return-object p0
.end method

.method public o0(Ljava/lang/String;)Ld0/q$b;
    .locals 0

    .line 1
    invoke-static {p1}, Ld0/z;->t(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Ld0/q$b;->m:Ljava/lang/String;

    .line 6
    .line 7
    return-object p0
.end method

.method public p0(I)Ld0/q$b;
    .locals 0

    .line 1
    iput p1, p0, Ld0/q$b;->B:I

    .line 2
    .line 3
    return-object p0
.end method

.method public q0(I)Ld0/q$b;
    .locals 0

    .line 1
    iput p1, p0, Ld0/q$b;->e:I

    .line 2
    .line 3
    return-object p0
.end method

.method public r0(I)Ld0/q$b;
    .locals 0

    .line 1
    iput p1, p0, Ld0/q$b;->y:I

    .line 2
    .line 3
    return-object p0
.end method

.method public s0(J)Ld0/q$b;
    .locals 0

    .line 1
    iput-wide p1, p0, Ld0/q$b;->r:J

    .line 2
    .line 3
    return-object p0
.end method

.method public t0(I)Ld0/q$b;
    .locals 0

    .line 1
    iput p1, p0, Ld0/q$b;->H:I

    .line 2
    .line 3
    return-object p0
.end method

.method public u0(I)Ld0/q$b;
    .locals 0

    .line 1
    iput p1, p0, Ld0/q$b;->I:I

    .line 2
    .line 3
    return-object p0
.end method

.method public v0(I)Ld0/q$b;
    .locals 0

    .line 1
    iput p1, p0, Ld0/q$b;->s:I

    .line 2
    .line 3
    return-object p0
.end method
