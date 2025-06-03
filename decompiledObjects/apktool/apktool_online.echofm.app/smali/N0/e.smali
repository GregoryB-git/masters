.class public final LN0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF0/t;


# instance fields
.field public final o:J

.field public final p:LF0/t;


# direct methods
.method public constructor <init>(JLF0/t;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, LN0/e;->o:J

    .line 5
    .line 6
    iput-object p3, p0, LN0/e;->p:LF0/t;

    .line 7
    .line 8
    return-void
.end method

.method public static synthetic b(LN0/e;)J
    .locals 2

    .line 1
    iget-wide v0, p0, LN0/e;->o:J

    .line 2
    .line 3
    return-wide v0
.end method


# virtual methods
.method public a(II)LF0/T;
    .locals 1

    .line 1
    iget-object v0, p0, LN0/e;->p:LF0/t;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, LF0/t;->a(II)LF0/T;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public e(LF0/M;)V
    .locals 2

    .line 1
    iget-object v0, p0, LN0/e;->p:LF0/t;

    .line 2
    .line 3
    new-instance v1, LN0/e$a;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1, p1}, LN0/e$a;-><init>(LN0/e;LF0/M;LF0/M;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, LF0/t;->e(LF0/M;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public j()V
    .locals 1

    .line 1
    iget-object v0, p0, LN0/e;->p:LF0/t;

    .line 2
    .line 3
    invoke-interface {v0}, LF0/t;->j()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
