.class public final LF0/e$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF0/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# static fields
.field public static final d:LF0/e$e;


# instance fields
.field public final a:I

.field public final b:J

.field public final c:J


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v6, LF0/e$e;

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    const-wide/16 v4, -0x1

    .line 9
    .line 10
    const/4 v1, -0x3

    .line 11
    move-object v0, v6

    .line 12
    invoke-direct/range {v0 .. v5}, LF0/e$e;-><init>(IJJ)V

    .line 13
    .line 14
    .line 15
    sput-object v6, LF0/e$e;->d:LF0/e$e;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(IJJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, LF0/e$e;->a:I

    .line 5
    .line 6
    iput-wide p2, p0, LF0/e$e;->b:J

    .line 7
    .line 8
    iput-wide p4, p0, LF0/e$e;->c:J

    .line 9
    .line 10
    return-void
.end method

.method public static synthetic a(LF0/e$e;)I
    .locals 0

    .line 1
    iget p0, p0, LF0/e$e;->a:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic b(LF0/e$e;)J
    .locals 2

    .line 1
    iget-wide v0, p0, LF0/e$e;->b:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static synthetic c(LF0/e$e;)J
    .locals 2

    .line 1
    iget-wide v0, p0, LF0/e$e;->c:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static d(JJ)LF0/e$e;
    .locals 7

    .line 1
    new-instance v6, LF0/e$e;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    move-object v0, v6

    .line 5
    move-wide v2, p0

    .line 6
    move-wide v4, p2

    .line 7
    invoke-direct/range {v0 .. v5}, LF0/e$e;-><init>(IJJ)V

    .line 8
    .line 9
    .line 10
    return-object v6
.end method

.method public static e(J)LF0/e$e;
    .locals 7

    .line 1
    new-instance v6, LF0/e$e;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    move-object v0, v6

    .line 10
    move-wide v4, p0

    .line 11
    invoke-direct/range {v0 .. v5}, LF0/e$e;-><init>(IJJ)V

    .line 12
    .line 13
    .line 14
    return-object v6
.end method

.method public static f(JJ)LF0/e$e;
    .locals 7

    .line 1
    new-instance v6, LF0/e$e;

    .line 2
    .line 3
    const/4 v1, -0x2

    .line 4
    move-object v0, v6

    .line 5
    move-wide v2, p0

    .line 6
    move-wide v4, p2

    .line 7
    invoke-direct/range {v0 .. v5}, LF0/e$e;-><init>(IJJ)V

    .line 8
    .line 9
    .line 10
    return-object v6
.end method
