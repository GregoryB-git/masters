.class public final Lka/z$b$a;
.super Lma/w$a;
.source "SourceFile"

# interfaces
.implements Lma/t0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lka/z$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lma/w$a<",
        "Lka/z$b;",
        "Lka/z$b$a;",
        ">;",
        "Lma/t0;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-static {}, Lka/z$b;->F()Lka/z$b;

    move-result-object v0

    invoke-direct {p0, v0}, Lma/w$a;-><init>(Lma/w;)V

    return-void
.end method
