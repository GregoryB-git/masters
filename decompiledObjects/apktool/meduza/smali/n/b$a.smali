.class public final Ln/b$a;
.super Ln/b$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ln/b$e<",
        "TK;TV;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ln/b$c;Ln/b$c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln/b$c<",
            "TK;TV;>;",
            "Ln/b$c<",
            "TK;TV;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ln/b$e;-><init>(Ln/b$c;Ln/b$c;)V

    return-void
.end method


# virtual methods
.method public final b(Ln/b$c;)Ln/b$c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln/b$c<",
            "TK;TV;>;)",
            "Ln/b$c<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object p1, p1, Ln/b$c;->d:Ln/b$c;

    return-object p1
.end method

.method public final c(Ln/b$c;)Ln/b$c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln/b$c<",
            "TK;TV;>;)",
            "Ln/b$c<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object p1, p1, Ln/b$c;->c:Ln/b$c;

    return-object p1
.end method
