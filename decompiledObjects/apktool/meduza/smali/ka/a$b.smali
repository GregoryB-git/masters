.class public final Lka/a$b;
.super Lma/w$a;
.source "SourceFile"

# interfaces
.implements Lma/t0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lka/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lma/w$a<",
        "Lka/a;",
        "Lka/a$b;",
        ">;",
        "Lma/t0;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-static {}, Lka/a;->F()Lka/a;

    move-result-object v0

    invoke-direct {p0, v0}, Lma/w$a;-><init>(Lma/w;)V

    return-void
.end method
