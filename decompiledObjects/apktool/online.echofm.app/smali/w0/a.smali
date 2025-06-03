.class public final Lw0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw0/b;


# instance fields
.field public final a:Li0/g$a;

.field public b:Lc1/t$a;

.field public c:Z


# direct methods
.method public constructor <init>(Li0/g$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw0/a;->a:Li0/g$a;

    .line 5
    .line 6
    new-instance p1, Lc1/h;

    .line 7
    .line 8
    invoke-direct {p1}, Lc1/h;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lw0/a;->b:Lc1/t$a;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Z)Lw0/b;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lw0/a;->b(Z)Lw0/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public b(Z)Lw0/a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lw0/a;->c:Z

    .line 2
    .line 3
    return-object p0
.end method
