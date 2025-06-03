.class public final LD6/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:[B

.field public b:I

.field public c:I

.field public d:Z

.field public e:Z

.field public f:LD6/d;

.field public g:LD6/d;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x2000

    new-array v0, v0, [B

    iput-object v0, p0, LD6/d;->a:[B

    const/4 v0, 0x1

    iput-boolean v0, p0, LD6/d;->e:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, LD6/d;->d:Z

    return-void
.end method

.method public constructor <init>([BIIZZ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD6/d;->a:[B

    iput p2, p0, LD6/d;->b:I

    iput p3, p0, LD6/d;->c:I

    iput-boolean p4, p0, LD6/d;->d:Z

    iput-boolean p5, p0, LD6/d;->e:Z

    return-void
.end method


# virtual methods
.method public final a()LD6/d;
    .locals 4

    .line 1
    iget-object v0, p0, LD6/d;->f:LD6/d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eq v0, p0, :cond_0

    .line 5
    .line 6
    move-object v2, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move-object v2, v1

    .line 9
    :goto_0
    iget-object v3, p0, LD6/d;->g:LD6/d;

    .line 10
    .line 11
    iput-object v0, v3, LD6/d;->f:LD6/d;

    .line 12
    .line 13
    iget-object v0, p0, LD6/d;->f:LD6/d;

    .line 14
    .line 15
    iput-object v3, v0, LD6/d;->g:LD6/d;

    .line 16
    .line 17
    iput-object v1, p0, LD6/d;->f:LD6/d;

    .line 18
    .line 19
    iput-object v1, p0, LD6/d;->g:LD6/d;

    .line 20
    .line 21
    return-object v2
.end method

.method public final b(LD6/d;)LD6/d;
    .locals 1

    .line 1
    iput-object p0, p1, LD6/d;->g:LD6/d;

    .line 2
    .line 3
    iget-object v0, p0, LD6/d;->f:LD6/d;

    .line 4
    .line 5
    iput-object v0, p1, LD6/d;->f:LD6/d;

    .line 6
    .line 7
    iget-object v0, p0, LD6/d;->f:LD6/d;

    .line 8
    .line 9
    iput-object p1, v0, LD6/d;->g:LD6/d;

    .line 10
    .line 11
    iput-object p1, p0, LD6/d;->f:LD6/d;

    .line 12
    .line 13
    return-object p1
.end method

.method public final c()LD6/d;
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LD6/d;->d:Z

    .line 3
    .line 4
    new-instance v0, LD6/d;

    .line 5
    .line 6
    iget-object v2, p0, LD6/d;->a:[B

    .line 7
    .line 8
    iget v3, p0, LD6/d;->b:I

    .line 9
    .line 10
    iget v4, p0, LD6/d;->c:I

    .line 11
    .line 12
    const/4 v5, 0x1

    .line 13
    const/4 v6, 0x0

    .line 14
    move-object v1, v0

    .line 15
    invoke-direct/range {v1 .. v6}, LD6/d;-><init>([BIIZZ)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method
