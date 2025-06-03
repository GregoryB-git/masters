.class public final Lv3/i0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv3/i0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public A:I

.field public B:I

.field public C:I

.field public D:I

.field public E:I

.field public F:I

.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:Ljava/lang/String;

.field public i:Lp4/a;

.field public j:Ljava/lang/String;

.field public k:Ljava/lang/String;

.field public l:I

.field public m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "[B>;"
        }
    .end annotation
.end field

.field public n:La4/d;

.field public o:J

.field public p:I

.field public q:I

.field public r:F

.field public s:I

.field public t:F

.field public u:[B

.field public v:I

.field public w:Lw5/b;

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lv3/i0$a;->f:I

    iput v0, p0, Lv3/i0$a;->g:I

    iput v0, p0, Lv3/i0$a;->l:I

    const-wide v1, 0x7fffffffffffffffL

    iput-wide v1, p0, Lv3/i0$a;->o:J

    iput v0, p0, Lv3/i0$a;->p:I

    iput v0, p0, Lv3/i0$a;->q:I

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, p0, Lv3/i0$a;->r:F

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, p0, Lv3/i0$a;->t:F

    iput v0, p0, Lv3/i0$a;->v:I

    iput v0, p0, Lv3/i0$a;->x:I

    iput v0, p0, Lv3/i0$a;->y:I

    iput v0, p0, Lv3/i0$a;->z:I

    iput v0, p0, Lv3/i0$a;->C:I

    iput v0, p0, Lv3/i0$a;->D:I

    iput v0, p0, Lv3/i0$a;->E:I

    const/4 v0, 0x0

    iput v0, p0, Lv3/i0$a;->F:I

    return-void
.end method

.method public constructor <init>(Lv3/i0;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lv3/i0;->a:Ljava/lang/String;

    iput-object v0, p0, Lv3/i0$a;->a:Ljava/lang/String;

    iget-object v0, p1, Lv3/i0;->b:Ljava/lang/String;

    iput-object v0, p0, Lv3/i0$a;->b:Ljava/lang/String;

    iget-object v0, p1, Lv3/i0;->c:Ljava/lang/String;

    iput-object v0, p0, Lv3/i0$a;->c:Ljava/lang/String;

    iget v0, p1, Lv3/i0;->d:I

    iput v0, p0, Lv3/i0$a;->d:I

    iget v0, p1, Lv3/i0;->e:I

    iput v0, p0, Lv3/i0$a;->e:I

    iget v0, p1, Lv3/i0;->f:I

    iput v0, p0, Lv3/i0$a;->f:I

    iget v0, p1, Lv3/i0;->o:I

    iput v0, p0, Lv3/i0$a;->g:I

    iget-object v0, p1, Lv3/i0;->q:Ljava/lang/String;

    iput-object v0, p0, Lv3/i0$a;->h:Ljava/lang/String;

    iget-object v0, p1, Lv3/i0;->r:Lp4/a;

    iput-object v0, p0, Lv3/i0$a;->i:Lp4/a;

    iget-object v0, p1, Lv3/i0;->s:Ljava/lang/String;

    iput-object v0, p0, Lv3/i0$a;->j:Ljava/lang/String;

    iget-object v0, p1, Lv3/i0;->t:Ljava/lang/String;

    iput-object v0, p0, Lv3/i0$a;->k:Ljava/lang/String;

    iget v0, p1, Lv3/i0;->u:I

    iput v0, p0, Lv3/i0$a;->l:I

    iget-object v0, p1, Lv3/i0;->v:Ljava/util/List;

    iput-object v0, p0, Lv3/i0$a;->m:Ljava/util/List;

    iget-object v0, p1, Lv3/i0;->w:La4/d;

    iput-object v0, p0, Lv3/i0$a;->n:La4/d;

    iget-wide v0, p1, Lv3/i0;->x:J

    iput-wide v0, p0, Lv3/i0$a;->o:J

    iget v0, p1, Lv3/i0;->y:I

    iput v0, p0, Lv3/i0$a;->p:I

    iget v0, p1, Lv3/i0;->z:I

    iput v0, p0, Lv3/i0$a;->q:I

    iget v0, p1, Lv3/i0;->A:F

    iput v0, p0, Lv3/i0$a;->r:F

    iget v0, p1, Lv3/i0;->B:I

    iput v0, p0, Lv3/i0$a;->s:I

    iget v0, p1, Lv3/i0;->C:F

    iput v0, p0, Lv3/i0$a;->t:F

    iget-object v0, p1, Lv3/i0;->D:[B

    iput-object v0, p0, Lv3/i0$a;->u:[B

    iget v0, p1, Lv3/i0;->E:I

    iput v0, p0, Lv3/i0$a;->v:I

    iget-object v0, p1, Lv3/i0;->F:Lw5/b;

    iput-object v0, p0, Lv3/i0$a;->w:Lw5/b;

    iget v0, p1, Lv3/i0;->G:I

    iput v0, p0, Lv3/i0$a;->x:I

    iget v0, p1, Lv3/i0;->H:I

    iput v0, p0, Lv3/i0$a;->y:I

    iget v0, p1, Lv3/i0;->I:I

    iput v0, p0, Lv3/i0$a;->z:I

    iget v0, p1, Lv3/i0;->J:I

    iput v0, p0, Lv3/i0$a;->A:I

    iget v0, p1, Lv3/i0;->K:I

    iput v0, p0, Lv3/i0$a;->B:I

    iget v0, p1, Lv3/i0;->L:I

    iput v0, p0, Lv3/i0$a;->C:I

    iget v0, p1, Lv3/i0;->M:I

    iput v0, p0, Lv3/i0$a;->D:I

    iget v0, p1, Lv3/i0;->N:I

    iput v0, p0, Lv3/i0$a;->E:I

    iget p1, p1, Lv3/i0;->O:I

    iput p1, p0, Lv3/i0$a;->F:I

    return-void
.end method


# virtual methods
.method public final a()Lv3/i0;
    .locals 1

    new-instance v0, Lv3/i0;

    invoke-direct {v0, p0}, Lv3/i0;-><init>(Lv3/i0$a;)V

    return-object v0
.end method

.method public final b(I)V
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lv3/i0$a;->a:Ljava/lang/String;

    return-void
.end method
