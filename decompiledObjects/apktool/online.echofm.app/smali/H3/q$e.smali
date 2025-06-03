.class public LH3/q$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH3/q;->e0(JLjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic o:J

.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:LH3/q;


# direct methods
.method public constructor <init>(LH3/q;JLjava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, LH3/q$e;->q:LH3/q;

    .line 2
    .line 3
    iput-wide p2, p0, LH3/q$e;->o:J

    .line 4
    .line 5
    iput-object p4, p0, LH3/q$e;->p:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Void;
    .locals 4

    .line 1
    iget-object v0, p0, LH3/q$e;->q:LH3/q;

    .line 2
    .line 3
    invoke-virtual {v0}, LH3/q;->L()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LH3/q$e;->q:LH3/q;

    .line 10
    .line 11
    invoke-static {v0}, LH3/q;->e(LH3/q;)LI3/c;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-wide v1, p0, LH3/q$e;->o:J

    .line 16
    .line 17
    iget-object v3, p0, LH3/q$e;->p:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v0, v1, v2, v3}, LI3/c;->g(JLjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LH3/q$e;->a()Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
