.class public LF0/M$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF0/M;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF0/M;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:J

.field public final b:LF0/M$a;


# direct methods
.method public constructor <init>(J)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, LF0/M$b;-><init>(JJ)V

    return-void
.end method

.method public constructor <init>(JJ)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, LF0/M$b;->a:J

    new-instance p1, LF0/M$a;

    const-wide/16 v0, 0x0

    cmp-long p2, p3, v0

    if-nez p2, :cond_0

    sget-object p2, LF0/N;->c:LF0/N;

    goto :goto_0

    :cond_0
    new-instance p2, LF0/N;

    invoke-direct {p2, v0, v1, p3, p4}, LF0/N;-><init>(JJ)V

    :goto_0
    invoke-direct {p1, p2}, LF0/M$a;-><init>(LF0/N;)V

    iput-object p1, p0, LF0/M$b;->b:LF0/M$a;

    return-void
.end method


# virtual methods
.method public h()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public j(J)LF0/M$a;
    .locals 0

    .line 1
    iget-object p1, p0, LF0/M$b;->b:LF0/M$a;

    .line 2
    .line 3
    return-object p1
.end method

.method public l()J
    .locals 2

    .line 1
    iget-wide v0, p0, LF0/M$b;->a:J

    .line 2
    .line 3
    return-wide v0
.end method
