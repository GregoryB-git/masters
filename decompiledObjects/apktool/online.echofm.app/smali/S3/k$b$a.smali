.class public LS3/k$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LS3/k$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public o:J

.field public final p:I


# direct methods
.method public constructor <init>(I)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    add-int/lit8 p1, p1, 0x1

    .line 5
    .line 6
    int-to-double v0, p1

    .line 7
    invoke-static {v0, v1}, Ljava/lang/Math;->log(D)D

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    .line 12
    .line 13
    invoke-static {v2, v3}, Ljava/lang/Math;->log(D)D

    .line 14
    .line 15
    .line 16
    move-result-wide v4

    .line 17
    div-double/2addr v0, v4

    .line 18
    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    double-to-int v0, v0

    .line 23
    iput v0, p0, LS3/k$b$a;->p:I

    .line 24
    .line 25
    int-to-double v0, v0

    .line 26
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->pow(DD)D

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    double-to-long v0, v0

    .line 31
    const-wide/16 v2, 0x1

    .line 32
    .line 33
    sub-long/2addr v0, v2

    .line 34
    int-to-long v2, p1

    .line 35
    and-long/2addr v0, v2

    .line 36
    iput-wide v0, p0, LS3/k$b$a;->o:J

    .line 37
    .line 38
    return-void
.end method

.method public static synthetic a(LS3/k$b$a;)I
    .locals 0

    .line 1
    iget p0, p0, LS3/k$b$a;->p:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic d(LS3/k$b$a;)J
    .locals 2

    .line 1
    iget-wide v0, p0, LS3/k$b$a;->o:J

    .line 2
    .line 3
    return-wide v0
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, LS3/k$b$a$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LS3/k$b$a$a;-><init>(LS3/k$b$a;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
