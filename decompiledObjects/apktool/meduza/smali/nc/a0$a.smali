.class public final Lnc/a0$a;
.super Lub/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnc/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lub/b<",
        "Lub/f;",
        "Lnc/a0;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    sget-object v0, Lub/f$a;->a:Lub/f$a;

    sget-object v1, Lnc/a0$a$a;->a:Lnc/a0$a$a;

    invoke-direct {p0, v0, v1}, Lub/b;-><init>(Lub/h$c;Ldc/l;)V

    return-void
.end method
