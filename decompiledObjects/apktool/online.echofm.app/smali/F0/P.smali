.class public final LF0/P;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF0/M;


# instance fields
.field public final a:J

.field public final b:J


# direct methods
.method public constructor <init>(J)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, LF0/P;-><init>(JJ)V

    return-void
.end method

.method public constructor <init>(JJ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, LF0/P;->a:J

    iput-wide p3, p0, LF0/P;->b:J

    return-void
.end method


# virtual methods
.method public h()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public j(J)LF0/M$a;
    .locals 4

    .line 1
    new-instance v0, LF0/M$a;

    .line 2
    .line 3
    new-instance v1, LF0/N;

    .line 4
    .line 5
    iget-wide v2, p0, LF0/P;->b:J

    .line 6
    .line 7
    invoke-direct {v1, p1, p2, v2, v3}, LF0/N;-><init>(JJ)V

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, LF0/M$a;-><init>(LF0/N;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public l()J
    .locals 2

    .line 1
    iget-wide v0, p0, LF0/P;->a:J

    .line 2
    .line 3
    return-wide v0
.end method
