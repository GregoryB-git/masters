.class public final Lb0/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld0/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ld0/a<",
        "Lb0/l$a;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lb0/c;


# direct methods
.method public constructor <init>(Lb0/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lb0/i;->a:Lb0/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Lb0/l$a;

    if-nez p1, :cond_0

    new-instance p1, Lb0/l$a;

    const/4 v0, -0x3

    invoke-direct {p1, v0}, Lb0/l$a;-><init>(I)V

    :cond_0
    iget-object v0, p0, Lb0/i;->a:Lb0/c;

    invoke-virtual {v0, p1}, Lb0/c;->a(Lb0/l$a;)V

    return-void
.end method
