.class public final LY0/a;
.super LF0/i;
.source "SourceFile"

# interfaces
.implements LY0/g;


# instance fields
.field public final h:I

.field public final i:J


# direct methods
.method public constructor <init>(JJIIZ)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p7}, LF0/i;-><init>(JJIIZ)V

    iput p5, p0, LY0/a;->h:I

    const-wide/16 p3, -0x1

    cmp-long p5, p1, p3

    if-eqz p5, :cond_0

    goto :goto_0

    :cond_0
    move-wide p1, p3

    :goto_0
    iput-wide p1, p0, LY0/a;->i:J

    return-void
.end method

.method public constructor <init>(JJLF0/I$a;Z)V
    .locals 8

    .line 2
    iget v5, p5, LF0/I$a;->f:I

    iget v6, p5, LF0/I$a;->c:I

    move-object v0, p0

    move-wide v1, p1

    move-wide v3, p3

    move v7, p6

    invoke-direct/range {v0 .. v7}, LY0/a;-><init>(JJIIZ)V

    return-void
.end method


# virtual methods
.method public c(J)J
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LF0/i;->b(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    return-wide p1
.end method

.method public f()J
    .locals 2

    .line 1
    iget-wide v0, p0, LY0/a;->i:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public k()I
    .locals 1

    .line 1
    iget v0, p0, LY0/a;->h:I

    .line 2
    .line 3
    return v0
.end method
