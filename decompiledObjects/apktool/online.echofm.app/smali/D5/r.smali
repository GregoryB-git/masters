.class public LD5/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LD5/r$b;
    }
.end annotation


# instance fields
.field public final a:LE5/k;

.field public final b:Landroid/content/pm/PackageManager;

.field public c:LD5/r$b;

.field public final d:LE5/k$c;


# direct methods
.method public constructor <init>(Lw5/a;Landroid/content/pm/PackageManager;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LD5/r$a;

    .line 5
    .line 6
    invoke-direct {v0, p0}, LD5/r$a;-><init>(LD5/r;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LD5/r;->d:LE5/k$c;

    .line 10
    .line 11
    iput-object p2, p0, LD5/r;->b:Landroid/content/pm/PackageManager;

    .line 12
    .line 13
    new-instance p2, LE5/k;

    .line 14
    .line 15
    const-string v1, "flutter/processtext"

    .line 16
    .line 17
    sget-object v2, LE5/q;->b:LE5/q;

    .line 18
    .line 19
    invoke-direct {p2, p1, v1, v2}, LE5/k;-><init>(LE5/c;Ljava/lang/String;LE5/l;)V

    .line 20
    .line 21
    .line 22
    iput-object p2, p0, LD5/r;->a:LE5/k;

    .line 23
    .line 24
    invoke-virtual {p2, v0}, LE5/k;->e(LE5/k$c;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public static synthetic a(LD5/r;)LD5/r$b;
    .locals 0

    .line 1
    iget-object p0, p0, LD5/r;->c:LD5/r$b;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public b(LD5/r$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, LD5/r;->c:LD5/r$b;

    .line 2
    .line 3
    return-void
.end method
