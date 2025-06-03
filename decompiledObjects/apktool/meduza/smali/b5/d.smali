.class public final Lb5/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc4/j;
.implements Lb5/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb5/d$a;
    }
.end annotation


# static fields
.field public static final r:Lc4/s;


# instance fields
.field public final a:Lc4/h;

.field public final b:I

.field public final c:Lv3/i0;

.field public final d:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lb5/d$a;",
            ">;"
        }
    .end annotation
.end field

.field public e:Z

.field public f:Lb5/f$a;

.field public o:J

.field public p:Lc4/t;

.field public q:[Lv3/i0;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Le0/e;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, Le0/e;-><init>(I)V

    new-instance v0, Lc4/s;

    invoke-direct {v0}, Lc4/s;-><init>()V

    sput-object v0, Lb5/d;->r:Lc4/s;

    return-void
.end method

.method public constructor <init>(Lc4/h;ILv3/i0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb5/d;->a:Lc4/h;

    iput p2, p0, Lb5/d;->b:I

    iput-object p3, p0, Lb5/d;->c:Lv3/i0;

    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lb5/d;->d:Landroid/util/SparseArray;

    return-void
.end method


# virtual methods
.method public final a(Lb5/f$a;JJ)V
    .locals 5

    iput-object p1, p0, Lb5/d;->f:Lb5/f$a;

    iput-wide p4, p0, Lb5/d;->o:J

    iget-boolean v0, p0, Lb5/d;->e:Z

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    const-wide/16 v3, 0x0

    if-nez v0, :cond_1

    iget-object p1, p0, Lb5/d;->a:Lc4/h;

    invoke-interface {p1, p0}, Lc4/h;->b(Lc4/j;)V

    cmp-long p1, p2, v1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lb5/d;->a:Lc4/h;

    invoke-interface {p1, v3, v4, p2, p3}, Lc4/h;->f(JJ)V

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lb5/d;->e:Z

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lb5/d;->a:Lc4/h;

    cmp-long v1, p2, v1

    if-nez v1, :cond_2

    move-wide p2, v3

    :cond_2
    invoke-interface {v0, v3, v4, p2, p3}, Lc4/h;->f(JJ)V

    const/4 p2, 0x0

    :goto_0
    iget-object p3, p0, Lb5/d;->d:Landroid/util/SparseArray;

    invoke-virtual {p3}, Landroid/util/SparseArray;->size()I

    move-result p3

    if-ge p2, p3, :cond_3

    iget-object p3, p0, Lb5/d;->d:Landroid/util/SparseArray;

    invoke-virtual {p3, p2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lb5/d$a;

    invoke-virtual {p3, p1, p4, p5}, Lb5/d$a;->f(Lb5/f$a;J)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method public final m()V
    .locals 3

    iget-object v0, p0, Lb5/d;->d:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    new-array v0, v0, [Lv3/i0;

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lb5/d;->d:Landroid/util/SparseArray;

    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lb5/d;->d:Landroid/util/SparseArray;

    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb5/d$a;

    iget-object v2, v2, Lb5/d$a;->d:Lv3/i0;

    invoke-static {v2}, Lx6/b;->K(Ljava/lang/Object;)V

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iput-object v0, p0, Lb5/d;->q:[Lv3/i0;

    return-void
.end method

.method public final r(II)Lc4/v;
    .locals 3

    iget-object v0, p0, Lb5/d;->d:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb5/d$a;

    if-nez v0, :cond_2

    iget-object v0, p0, Lb5/d;->q:[Lv3/i0;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lx6/b;->H(Z)V

    new-instance v0, Lb5/d$a;

    iget v1, p0, Lb5/d;->b:I

    if-ne p2, v1, :cond_1

    iget-object v1, p0, Lb5/d;->c:Lv3/i0;

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    invoke-direct {v0, p1, p2, v1}, Lb5/d$a;-><init>(IILv3/i0;)V

    iget-object p2, p0, Lb5/d;->f:Lb5/f$a;

    iget-wide v1, p0, Lb5/d;->o:J

    invoke-virtual {v0, p2, v1, v2}, Lb5/d$a;->f(Lb5/f$a;J)V

    iget-object p2, p0, Lb5/d;->d:Landroid/util/SparseArray;

    invoke-virtual {p2, p1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_2
    return-object v0
.end method

.method public final t(Lc4/t;)V
    .locals 0

    iput-object p1, p0, Lb5/d;->p:Lc4/t;

    return-void
.end method
