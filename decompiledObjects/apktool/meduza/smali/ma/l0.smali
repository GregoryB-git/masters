.class public final Lma/l0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lma/l0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Lma/l0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma/l0$a<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field public final b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TK;"
        }
    .end annotation
.end field

.field public final c:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TV;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lma/v1$a;Lma/v1;Ljava/lang/Object;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lma/l0$a;

    invoke-direct {v0, p1, p2, p3}, Lma/l0$a;-><init>(Lma/v1$a;Lma/v1;Ljava/lang/Object;)V

    iput-object v0, p0, Lma/l0;->a:Lma/l0$a;

    const-string p1, ""

    iput-object p1, p0, Lma/l0;->b:Ljava/lang/Object;

    iput-object p3, p0, Lma/l0;->c:Ljava/lang/Object;

    return-void
.end method

.method public static a(Lma/l0$a;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Lma/l0$a<",
            "TK;TV;>;TK;TV;)I"
        }
    .end annotation

    iget-object v0, p0, Lma/l0$a;->a:Lma/v1;

    const/4 v1, 0x1

    invoke-static {v0, v1, p1}, Lma/s;->c(Lma/v1;ILjava/lang/Object;)I

    move-result p1

    iget-object p0, p0, Lma/l0$a;->c:Lma/v1;

    const/4 v0, 0x2

    invoke-static {p0, v0, p2}, Lma/s;->c(Lma/v1;ILjava/lang/Object;)I

    move-result p0

    add-int/2addr p0, p1

    return p0
.end method

.method public static b(Lma/k;Lma/l0$a;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Lma/k;",
            "Lma/l0$a<",
            "TK;TV;>;TK;TV;)V"
        }
    .end annotation

    iget-object v0, p1, Lma/l0$a;->a:Lma/v1;

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, p2}, Lma/s;->q(Lma/k;Lma/v1;ILjava/lang/Object;)V

    iget-object p1, p1, Lma/l0$a;->c:Lma/v1;

    const/4 p2, 0x2

    invoke-static {p0, p1, p2, p3}, Lma/s;->q(Lma/k;Lma/v1;ILjava/lang/Object;)V

    return-void
.end method
