.class public final Lz0/b;
.super Lc1/j;
.source "SourceFile"


# instance fields
.field public final p:Lc1/t;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lc1/t;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lc1/j;-><init>(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lz0/b;->p:Lc1/t;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public B([BIZ)Lc1/k;
    .locals 1

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    iget-object p3, p0, Lz0/b;->p:Lc1/t;

    .line 4
    .line 5
    invoke-interface {p3}, Lc1/t;->b()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object p3, p0, Lz0/b;->p:Lc1/t;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-interface {p3, p1, v0, p2}, Lc1/t;->a([BII)Lc1/k;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method
