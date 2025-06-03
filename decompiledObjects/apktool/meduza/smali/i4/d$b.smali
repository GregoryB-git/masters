.class public final Li4/d$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li4/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public A:I

.field public B:I

.field public C:I

.field public D:F

.field public E:F

.field public F:F

.field public G:F

.field public H:F

.field public I:F

.field public J:F

.field public K:F

.field public L:F

.field public M:F

.field public N:[B

.field public O:I

.field public P:I

.field public Q:I

.field public R:J

.field public S:J

.field public T:Lc4/w;

.field public U:Z

.field public V:Z

.field public W:Ljava/lang/String;

.field public X:Lc4/v;

.field public Y:I

.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:Z

.field public i:[B

.field public j:Lc4/v$a;

.field public k:[B

.field public l:La4/d;

.field public m:I

.field public n:I

.field public o:I

.field public p:I

.field public q:I

.field public r:I

.field public s:F

.field public t:F

.field public u:F

.field public v:[B

.field public w:I

.field public x:Z

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Li4/d$b;->m:I

    iput v0, p0, Li4/d$b;->n:I

    iput v0, p0, Li4/d$b;->o:I

    iput v0, p0, Li4/d$b;->p:I

    const/4 v1, 0x0

    iput v1, p0, Li4/d$b;->q:I

    iput v0, p0, Li4/d$b;->r:I

    const/4 v2, 0x0

    iput v2, p0, Li4/d$b;->s:F

    iput v2, p0, Li4/d$b;->t:F

    iput v2, p0, Li4/d$b;->u:F

    const/4 v2, 0x0

    iput-object v2, p0, Li4/d$b;->v:[B

    iput v0, p0, Li4/d$b;->w:I

    iput-boolean v1, p0, Li4/d$b;->x:Z

    iput v0, p0, Li4/d$b;->y:I

    iput v0, p0, Li4/d$b;->z:I

    iput v0, p0, Li4/d$b;->A:I

    const/16 v1, 0x3e8

    iput v1, p0, Li4/d$b;->B:I

    const/16 v1, 0xc8

    iput v1, p0, Li4/d$b;->C:I

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, p0, Li4/d$b;->D:F

    iput v1, p0, Li4/d$b;->E:F

    iput v1, p0, Li4/d$b;->F:F

    iput v1, p0, Li4/d$b;->G:F

    iput v1, p0, Li4/d$b;->H:F

    iput v1, p0, Li4/d$b;->I:F

    iput v1, p0, Li4/d$b;->J:F

    iput v1, p0, Li4/d$b;->K:F

    iput v1, p0, Li4/d$b;->L:F

    iput v1, p0, Li4/d$b;->M:F

    const/4 v1, 0x1

    iput v1, p0, Li4/d$b;->O:I

    iput v0, p0, Li4/d$b;->P:I

    const/16 v0, 0x1f40

    iput v0, p0, Li4/d$b;->Q:I

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Li4/d$b;->R:J

    iput-wide v2, p0, Li4/d$b;->S:J

    iput-boolean v1, p0, Li4/d$b;->V:Z

    const-string v0, "eng"

    iput-object v0, p0, Li4/d$b;->W:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)[B
    .locals 2

    iget-object v0, p0, Li4/d$b;->k:[B

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Missing CodecPrivate for codec "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lv3/a1;->a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;

    move-result-object p1

    throw p1
.end method
