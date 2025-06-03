.class public final Lx0/i$k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx0/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "k"
.end annotation


# instance fields
.field public a:Z

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public h:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;

.field public k:Ljava/lang/Object;

.field public l:Ljava/lang/Object;

.field public m:Ljava/lang/Object;

.field public n:Ljava/lang/Object;

.field public o:Ljava/lang/Boolean;

.field public p:Ljava/lang/Boolean;

.field public q:Lu/a0;

.field public r:Lu/a0;

.field public s:F

.field public t:Landroid/view/View;

.field public u:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lx0/i$k;->i:Ljava/lang/Object;

    sget-object v1, Lx0/i;->USE_DEFAULT_TRANSITION:Ljava/lang/Object;

    iput-object v1, p0, Lx0/i$k;->j:Ljava/lang/Object;

    iput-object v0, p0, Lx0/i$k;->k:Ljava/lang/Object;

    iput-object v1, p0, Lx0/i$k;->l:Ljava/lang/Object;

    iput-object v0, p0, Lx0/i$k;->m:Ljava/lang/Object;

    iput-object v1, p0, Lx0/i$k;->n:Ljava/lang/Object;

    iput-object v0, p0, Lx0/i$k;->q:Lu/a0;

    iput-object v0, p0, Lx0/i$k;->r:Lu/a0;

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, p0, Lx0/i$k;->s:F

    iput-object v0, p0, Lx0/i$k;->t:Landroid/view/View;

    return-void
.end method
