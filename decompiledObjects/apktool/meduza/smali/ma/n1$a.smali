.class public final Lma/n1$a;
.super Lma/w$a;
.source "SourceFile"

# interfaces
.implements Lma/t0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lma/n1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lma/w$a<",
        "Lma/n1;",
        "Lma/n1$a;",
        ">;",
        "Lma/t0;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-static {}, Lma/n1;->F()Lma/n1;

    move-result-object v0

    invoke-direct {p0, v0}, Lma/w$a;-><init>(Lma/w;)V

    return-void
.end method


# virtual methods
.method public final p(J)V
    .locals 1

    invoke-virtual {p0}, Lma/w$a;->m()V

    iget-object v0, p0, Lma/w$a;->b:Lma/w;

    check-cast v0, Lma/n1;

    invoke-static {v0, p1, p2}, Lma/n1;->G(Lma/n1;J)V

    return-void
.end method
