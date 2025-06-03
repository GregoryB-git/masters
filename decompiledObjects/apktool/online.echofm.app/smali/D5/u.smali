.class public LD5/u;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LD5/u$b;
    }
.end annotation


# instance fields
.field public final a:LE5/k;

.field public b:LD5/u$b;

.field public final c:LE5/k$c;


# direct methods
.method public constructor <init>(Lw5/a;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LD5/u$a;

    .line 5
    .line 6
    invoke-direct {v0, p0}, LD5/u$a;-><init>(LD5/u;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LD5/u;->c:LE5/k$c;

    .line 10
    .line 11
    new-instance v1, LE5/k;

    .line 12
    .line 13
    const-string v2, "flutter/spellcheck"

    .line 14
    .line 15
    sget-object v3, LE5/q;->b:LE5/q;

    .line 16
    .line 17
    invoke-direct {v1, p1, v2, v3}, LE5/k;-><init>(LE5/c;Ljava/lang/String;LE5/l;)V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, LD5/u;->a:LE5/k;

    .line 21
    .line 22
    invoke-virtual {v1, v0}, LE5/k;->e(LE5/k$c;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public static synthetic a(LD5/u;)LD5/u$b;
    .locals 0

    .line 1
    iget-object p0, p0, LD5/u;->b:LD5/u$b;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public b(LD5/u$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, LD5/u;->b:LD5/u$b;

    .line 2
    .line 3
    return-void
.end method
