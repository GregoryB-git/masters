.class public LN0/e$a;
.super LF0/D;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN0/e;->e(LF0/M;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:LF0/M;

.field public final synthetic c:LN0/e;


# direct methods
.method public constructor <init>(LN0/e;LF0/M;LF0/M;)V
    .locals 0

    .line 1
    iput-object p1, p0, LN0/e$a;->c:LN0/e;

    .line 2
    .line 3
    iput-object p3, p0, LN0/e$a;->b:LF0/M;

    .line 4
    .line 5
    invoke-direct {p0, p2}, LF0/D;-><init>(LF0/M;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public j(J)LF0/M$a;
    .locals 8

    .line 1
    iget-object v0, p0, LN0/e$a;->b:LF0/M;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, LF0/M;->j(J)LF0/M$a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    new-instance p2, LF0/M$a;

    .line 8
    .line 9
    new-instance v0, LF0/N;

    .line 10
    .line 11
    iget-object v1, p1, LF0/M$a;->a:LF0/N;

    .line 12
    .line 13
    iget-wide v2, v1, LF0/N;->a:J

    .line 14
    .line 15
    iget-wide v4, v1, LF0/N;->b:J

    .line 16
    .line 17
    iget-object v1, p0, LN0/e$a;->c:LN0/e;

    .line 18
    .line 19
    invoke-static {v1}, LN0/e;->b(LN0/e;)J

    .line 20
    .line 21
    .line 22
    move-result-wide v6

    .line 23
    add-long/2addr v4, v6

    .line 24
    invoke-direct {v0, v2, v3, v4, v5}, LF0/N;-><init>(JJ)V

    .line 25
    .line 26
    .line 27
    new-instance v1, LF0/N;

    .line 28
    .line 29
    iget-object p1, p1, LF0/M$a;->b:LF0/N;

    .line 30
    .line 31
    iget-wide v2, p1, LF0/N;->a:J

    .line 32
    .line 33
    iget-wide v4, p1, LF0/N;->b:J

    .line 34
    .line 35
    iget-object p1, p0, LN0/e$a;->c:LN0/e;

    .line 36
    .line 37
    invoke-static {p1}, LN0/e;->b(LN0/e;)J

    .line 38
    .line 39
    .line 40
    move-result-wide v6

    .line 41
    add-long/2addr v4, v6

    .line 42
    invoke-direct {v1, v2, v3, v4, v5}, LF0/N;-><init>(JJ)V

    .line 43
    .line 44
    .line 45
    invoke-direct {p2, v0, v1}, LF0/M$a;-><init>(LF0/N;LF0/N;)V

    .line 46
    .line 47
    .line 48
    return-object p2
.end method
