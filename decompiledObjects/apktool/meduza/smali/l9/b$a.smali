.class public final Ll9/b$a;
.super Lma/w$a;
.source "SourceFile"

# interfaces
.implements Lma/t0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll9/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lma/w$a<",
        "Ll9/b;",
        "Ll9/b$a;",
        ">;",
        "Lma/t0;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-static {}, Ll9/b;->F()Ll9/b;

    move-result-object v0

    invoke-direct {p0, v0}, Lma/w$a;-><init>(Lma/w;)V

    return-void
.end method
