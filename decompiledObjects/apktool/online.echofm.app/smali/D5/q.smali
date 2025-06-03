.class public LD5/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LD5/q$g;,
        LD5/q$f;,
        LD5/q$b;,
        LD5/q$c;,
        LD5/q$e;,
        LD5/q$d;
    }
.end annotation


# instance fields
.field public final a:LE5/k;

.field public b:LD5/q$g;

.field public final c:LE5/k$c;


# direct methods
.method public constructor <init>(Lw5/a;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LD5/q$a;

    .line 5
    .line 6
    invoke-direct {v0, p0}, LD5/q$a;-><init>(LD5/q;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LD5/q;->c:LE5/k$c;

    .line 10
    .line 11
    new-instance v1, LE5/k;

    .line 12
    .line 13
    const-string v2, "flutter/platform_views"

    .line 14
    .line 15
    sget-object v3, LE5/q;->b:LE5/q;

    .line 16
    .line 17
    invoke-direct {v1, p1, v2, v3}, LE5/k;-><init>(LE5/c;Ljava/lang/String;LE5/l;)V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, LD5/q;->a:LE5/k;

    .line 21
    .line 22
    invoke-virtual {v1, v0}, LE5/k;->e(LE5/k$c;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public static synthetic a(LD5/q;)LD5/q$g;
    .locals 0

    .line 1
    iget-object p0, p0, LD5/q;->b:LD5/q$g;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Exception;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, LD5/q;->c(Ljava/lang/Exception;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static c(Ljava/lang/Exception;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lt5/b;->d(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public d(LD5/q$g;)V
    .locals 0

    .line 1
    iput-object p1, p0, LD5/q;->b:LD5/q$g;

    .line 2
    .line 3
    return-void
.end method
