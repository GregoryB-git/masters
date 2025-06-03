.class public LD5/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LE5/k;

.field public b:Ljava/util/Map;

.field public final c:LE5/k$c;


# direct methods
.method public constructor <init>(Lw5/a;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LD5/g$a;

    .line 5
    .line 6
    invoke-direct {v0, p0}, LD5/g$a;-><init>(LD5/g;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LD5/g;->c:LE5/k$c;

    .line 10
    .line 11
    new-instance v1, LE5/k;

    .line 12
    .line 13
    const-string v2, "flutter/deferredcomponent"

    .line 14
    .line 15
    sget-object v3, LE5/q;->b:LE5/q;

    .line 16
    .line 17
    invoke-direct {v1, p1, v2, v3}, LE5/k;-><init>(LE5/c;Ljava/lang/String;LE5/l;)V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, LD5/g;->a:LE5/k;

    .line 21
    .line 22
    invoke-virtual {v1, v0}, LE5/k;->e(LE5/k$c;)V

    .line 23
    .line 24
    .line 25
    invoke-static {}, Lt5/a;->e()Lt5/a;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1}, Lt5/a;->a()Lx5/a;

    .line 30
    .line 31
    .line 32
    new-instance p1, Ljava/util/HashMap;

    .line 33
    .line 34
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, LD5/g;->b:Ljava/util/Map;

    .line 38
    .line 39
    return-void
.end method

.method public static synthetic a(LD5/g;)Lx5/a;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return-object p0
.end method
