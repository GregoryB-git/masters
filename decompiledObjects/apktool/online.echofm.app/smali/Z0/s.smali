.class public final LZ0/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:J

.field public final d:J

.field public final e:J

.field public final f:Ld0/q;

.field public final g:I

.field public final h:[J

.field public final i:[J

.field public final j:I

.field public final k:[LZ0/t;


# direct methods
.method public constructor <init>(IIJJJLd0/q;I[LZ0/t;I[J[J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, LZ0/s;->a:I

    .line 5
    .line 6
    iput p2, p0, LZ0/s;->b:I

    .line 7
    .line 8
    iput-wide p3, p0, LZ0/s;->c:J

    .line 9
    .line 10
    iput-wide p5, p0, LZ0/s;->d:J

    .line 11
    .line 12
    iput-wide p7, p0, LZ0/s;->e:J

    .line 13
    .line 14
    iput-object p9, p0, LZ0/s;->f:Ld0/q;

    .line 15
    .line 16
    iput p10, p0, LZ0/s;->g:I

    .line 17
    .line 18
    iput-object p11, p0, LZ0/s;->k:[LZ0/t;

    .line 19
    .line 20
    iput p12, p0, LZ0/s;->j:I

    .line 21
    .line 22
    iput-object p13, p0, LZ0/s;->h:[J

    .line 23
    .line 24
    iput-object p14, p0, LZ0/s;->i:[J

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public a(I)LZ0/t;
    .locals 1

    .line 1
    iget-object v0, p0, LZ0/s;->k:[LZ0/t;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    aget-object p1, v0, p1

    .line 8
    .line 9
    :goto_0
    return-object p1
.end method
