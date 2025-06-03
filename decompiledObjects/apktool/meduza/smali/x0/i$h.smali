.class public final Lx0/i$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx0/i;->registerForActivityResult(Le/a;Ld/b;)Ld/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lo/a<",
        "Ljava/lang/Void;",
        "Ld/g;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lx0/i;


# direct methods
.method public constructor <init>(Lx0/i;)V
    .locals 0

    iput-object p1, p0, Lx0/i$h;->a:Lx0/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/lang/Void;

    iget-object p1, p0, Lx0/i$h;->a:Lx0/i;

    iget-object v0, p1, Lx0/i;->mHost:Lx0/t;

    instance-of v1, v0, Ld/h;

    if-eqz v1, :cond_0

    check-cast v0, Ld/h;

    invoke-interface {v0}, Ld/h;->getActivityResultRegistry()Ld/g;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lx0/i;->requireActivity()Lx0/m;

    move-result-object p1

    invoke-virtual {p1}, Lb/j;->getActivityResultRegistry()Ld/g;

    move-result-object p1

    :goto_0
    return-object p1
.end method
