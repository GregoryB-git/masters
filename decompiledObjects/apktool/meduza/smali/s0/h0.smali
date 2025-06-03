.class public final Ls0/h0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls0/h0$a;
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
.field public final a:Ls0/h0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls0/h0$a<",
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
.method public constructor <init>(Ls0/n1$a;Ls0/n1$c;Lq0/f;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ls0/h0$a;

    invoke-direct {v0, p1, p2, p3}, Ls0/h0$a;-><init>(Ls0/n1$a;Ls0/n1$c;Lq0/f;)V

    iput-object v0, p0, Ls0/h0;->a:Ls0/h0$a;

    const-string p1, ""

    iput-object p1, p0, Ls0/h0;->b:Ljava/lang/Object;

    iput-object p3, p0, Ls0/h0;->c:Ljava/lang/Object;

    return-void
.end method

.method public static a(Ls0/h0$a;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ls0/h0$a<",
            "TK;TV;>;TK;TV;)I"
        }
    .end annotation

    iget-object v0, p0, Ls0/h0$a;->a:Ls0/n1;

    const/4 v1, 0x1

    invoke-static {v0, v1, p1}, Ls0/r;->c(Ls0/n1;ILjava/lang/Object;)I

    move-result p1

    iget-object p0, p0, Ls0/h0$a;->c:Ls0/n1;

    const/4 v0, 0x2

    invoke-static {p0, v0, p2}, Ls0/r;->c(Ls0/n1;ILjava/lang/Object;)I

    move-result p0

    add-int/2addr p0, p1

    return p0
.end method

.method public static b(Ls0/j;Ls0/h0$a;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ls0/j;",
            "Ls0/h0$a<",
            "TK;TV;>;TK;TV;)V"
        }
    .end annotation

    iget-object v0, p1, Ls0/h0$a;->a:Ls0/n1;

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, p2}, Ls0/r;->p(Ls0/j;Ls0/n1;ILjava/lang/Object;)V

    iget-object p1, p1, Ls0/h0$a;->c:Ls0/n1;

    const/4 p2, 0x2

    invoke-static {p0, p1, p2, p3}, Ls0/r;->p(Ls0/j;Ls0/n1;ILjava/lang/Object;)V

    return-void
.end method
